
public class DisplayHoraYFecha
{
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos ano;
	private boolean hora;
	private boolean fecha;

    public DisplayHoraYFecha(boolean hour, boolean date)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        ano = new DisplayDosDigitos(100);
		hora = hour;
		fecha = date;
    }

    public void avanzarMomento()
    {
       minutos.increment();
       if (minutos.getValue() == 0)
       {
           horas.increment();
           if (horas.getValue() == 0)
           {
               dia.incrementaValor();
               if (dia.getValor() == 1)
               {
                   mes.incrementaValor();
                   if (mes.getValor() == 1)
                   {
                       ano.incrementaValor();
                   }
               }
           }
       }
    }
    
    public void setMomento(int nuevoMinuto, int nuevaHora, int nuevoDia, int nuevoMes, int nuevoAno)
    {
        if (nuevaHora >= 0 && nuevaHora < 24 && nuevoMinuto >= 0 && nuevoMinuto < 60 && 
        nuevoDia > 0 && nuevoDia < 31 && nuevoMes > 0 && nuevoMes < 13 && nuevoAno > 0 && nuevoAno < 100)
        {
            minutos.setValue(nuevoMinuto);
            horas.setValue(nuevaHora);
            dia.setValor(nuevoDia);
            mes.setValor(nuevoMes);
            ano.setValor(nuevoAno);
        }
    }
    
    public void setMomento2 (int nuevoMinuto, int nuevaHora, int nuevoDia, int nuevoMes, int nuevoAno)
    {
        boolean seDebeCambiarElMomentoTemporal = true;
        
        if (nuevaHora < 0 || nuevaHora > 23)
        {
            seDebeCambiarElMomentoTemporal = false;
        }
        if(nuevoMinuto < 0 || nuevoMinuto > 59)
        {
            seDebeCambiarElMomentoTemporal = false;
        }
        if (nuevoDia < 1 || nuevoDia > 30)
        {
            seDebeCambiarElMomentoTemporal = false;
        }
        if (nuevoMes < 1 || nuevoMes > 12)
        {
            seDebeCambiarElMomentoTemporal = false;
        }
        if (nuevoAno < 1 || nuevoAno > 99)
        {
            seDebeCambiarElMomentoTemporal = false;
        }
        
        if (seDebeCambiarElMomentoTemporal == true)
        {
            minutos.setValue(nuevoMinuto);
            horas.setValue(nuevaHora);
            dia.setValor(nuevoDia);
            mes.setValor(nuevoMes);
            ano.setValor(nuevoAno);
        }
    }
    
    public String getMomento()
    {
        String momento;
        
		if (hora == true && fecha == true)
		{
        	momento = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() +
        	"/" + mes.getValorDelDisplay() + "/" + ano.getValorDelDisplay();
    	}
		else if (hora == true)
		{
			momento = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
		}
		else if (fecha == true)
		{
			momento = dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + ano.getValorDelDisplay();
		}
		else {
			momento = " ";
		}
		
		return momento;
	}
}

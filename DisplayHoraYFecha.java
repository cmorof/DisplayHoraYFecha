
public class DisplayHoraYFecha
{
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos ano;
    
    public DisplayHoraYFecha()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        ano = new DisplayDosDigitos(100);
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
        int contador = 0;
        
        if (nuevaHora >= 0 && nuevaHora < 24)
        {
            contador = contador + 1;
        }
        if(nuevoMinuto >= 0 && nuevoMinuto < 60)
        {
            contador = contador + 1;
        }
        if (nuevoDia > 0 && nuevoDia < 31)
        {
            contador = contador + 1;
        }
        if (nuevoMes > 0 && nuevoMes < 13)
        {
            contador = contador + 1;
        }
        if (nuevoAno > 0 && nuevoAno < 100)
        {
            contador = contador + 1;
        }
        
        if (contador == 5)
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
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() +
        "/" + mes.getValorDelDisplay() + "/" + ano.getValorDelDisplay();
    }
}


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
        minutos.setValue(nuevoMinuto);
        horas.setValue(nuevaHora);
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        ano.setValor(nuevoAno);
    }
    
    public String getMomento()
    {
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() +
        "/" + mes.getValorDelDisplay() + "/" + ano.getValorDelDisplay();
    }
}

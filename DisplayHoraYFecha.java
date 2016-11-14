
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;
    private int horas;
    private int minutos;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
        // initialise instance variables
        horas = 00;
        minutos = 00;
        dia = 1;
        mes = 1;
        ano = 2001;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void avanzarMomento()
    {
        // put your code here
       minutos = minutos + 1;
       if (minutos > 59)
       {
           minutos = 0;
           horas = horas + 1;
       }
       if (horas > 23)
       {
           horas = 0;
           dia = dia + 1;
       }
       if (dia > 30)
       {
           dia = 1;
           mes = mes + 1;
       }
       if (mes > 12)
       {
           mes = 1;
           ano = ano + 1;
       }
    }
    
    public void setMomento(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoAno)
    {
        horas = nuevaHora;
        minutos = nuevoMinuto;
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
    
    public String getMomento()
    {
        String hours = " ";
        String minutes = " ";
        String day = " ";
        String month = " ";
        String year = " ";
        hours = Integer.toString(horas);
        minutes = Integer.toString(minutos);
        day = Integer.toString(dia);
        month = Integer.toString(mes);
        year = Integer.toString(ano);
        if (horas < 10 && minutos < 10 && dia < 10 && mes < 10){
            return "0" + hours + ":0" + minutes + " 0" + day + "/" + "0" + month + "/" + year;
        }
        else if (horas < 10 && minutos < 10 && dia < 10){
            return "0" + hours + ":0" + minutes + " 0" + day + "/" + month + "/" + year;
        }
        else if (horas < 10 && minutos < 10 && mes < 10){
            return "0" + hours + ":0" + minutes + " " + day + "/" + "0" + month + "/" + year;
        }
        else if (horas < 10 && dia < 10 && mes < 10){
            return "0" + hours + ":" + minutes + " 0" + day + "/" + "0" + month + "/" + year;
        }
        else if (minutos < 10 && dia < 10 && mes < 10){
            return hours + ":0" + minutes + " 0" + day + "/" + "0" + month + "/" + year;
        }
        else if (horas < 10 && minutos < 10){
            return "0" + hours + ":0" + minutes + " " + day + "/" + month + "/" + year;
        }
        else if (horas < 10 && dia < 10){
            return "0" + hours + ":" + minutes + " 0" + day + "/" + month + "/" + year;
        }
        else if (horas < 10 && mes < 10){
            return "0" + hours + ":" + minutes + " " + day + "/" + "0" + month + "/" + year;
        }
        else if (minutos < 10 && dia < 10){
            return hours + ":0" + minutes + " 0" + day + "/" + month + "/" + year;
        }
        else if (minutos < 10 && mes < 10){
            return hours + ":0" + minutes + day + "/" + "0" + month + "/" + year;
        }
        else if (minutos < 10 && dia < 10)
            return hours + ":0" + minutes + " 0" + day + "/" + month + "/" + year;
        else{
            return hours + ":" + minutes + " " + day + "/" + "0" + month + "/" + year;
        }
    }
}

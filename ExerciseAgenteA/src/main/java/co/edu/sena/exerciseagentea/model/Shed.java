package co.edu.sena.exerciseagentea.model;

/**
 * Fecha: 28/10/2026
 * @author Gabriela isaziga
 * Objetivo: Modelo galpon
 */
public class Shed 
{
    private int number;
    private String status;

    public Shed() 
    {
            
    }

    public Shed(int number, String status) 
    {
        this.number = number;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() 
    {
        return number + " - " + status;
    }
    
    
}

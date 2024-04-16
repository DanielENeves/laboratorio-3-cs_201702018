
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
//Nível 2
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    private static final double FEES = 3.0;

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = (licensePlate == null)? "" : licensePlate;
        setFees(FEES);
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        if(licensePlate != null)
            this.licensePlate = licensePlate;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        
        return sb.toString();
    }
    
    //Nível 3
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    @Override
    public double getPriceWithFees(){
        return super.getPrice() * (1.0 + (this.FEES * 0.01));
    }
}

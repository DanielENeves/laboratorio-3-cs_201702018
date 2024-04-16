
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
//Nível 2
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.0;

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(FEES);
    }

    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers (int numberOfContainers){
        if(numberOfContainers >= 0){
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", name));
        sb.append(String.format("%15s: %s\n", "Contentores", numberOfContainers));
        
        return sb.toString();
    }
    
    //Nivel 3
    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }
}


/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart
{
    public static void main(String[] args){

        Size size1 = Size.MEDIUM;
        System.out.println("Name \t\t: " + size1.getDescription());
        System.out.println("toString() \t: " + size1.toString());
        System.out.println("Ordem \t\t: " + size1.ordinal());        
        System.out.println("Valor Minimo \t: " + size1.getMinValue());
        System.out.println("Valor Maximo \t: " + size1.getMaxValue());
        System.out.println("Código \t\t: " + size1.getCode());
        

    }
}

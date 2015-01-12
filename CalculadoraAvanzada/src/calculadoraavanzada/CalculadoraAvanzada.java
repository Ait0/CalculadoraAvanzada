
package calculadoraavanzada;


public class CalculadoraAvanzada {

    public static void main(String[] args) {
        
        switch (a){
            case 2:
                System.out.print ("Introducir el segundo numero");
                num2=introducir.nextInt();
                res=num1-num2;
                System.out.println (num1+ "-" +num2+" ="+res);
                break;
            
            case 4:
                System.out.print ("Introducir el segundo numero");
                num2=introducir.nextInt();
                res=num1/num2;
                System.out.println (num1+ "/" +num2+" ="+res);
                break;
                
            case 6:
                System.out.print ("Introducir el exponente");
                exp=introducir.nextInt();
                res=num1;
                for (i=0;i<=exp;i++) {
                    res=res*num1;
                }
                System.out.println (num1+ "^"+num2+" ="+res);
                break;
                        
        }
    }
    
}

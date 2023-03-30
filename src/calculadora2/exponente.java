
package calculadora2;


public class exponente {
   float valor1,valor2,total;

    public exponente(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
   public float elevar(){
       
       total=(float) Math.pow(valor1, valor2);
       return total;
       
   }
}

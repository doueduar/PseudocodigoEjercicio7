/**
 * Ejercicio7
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int pares, impares, ceros;
        double total = 15; pares = 0; impares = 0; ceros = 0;

        for (int i = 0; i < total; i++) {
            int ale = (int)(Math.random()*37);
            int forma = ale % 2;
            System.out.println(forma+" "+ale);
            if (ale ==0) {
                ceros++;
            } else {
                if (forma ==0) {
                    pares++;
                } else {
                    impares++;
                }
            }    
        }
        System.out.println(ceros+" "+impares+" "+pares);
        double c =(ceros/total)*100;
        double i =(impares/total)*100;
        double p =(pares/total)*100;
        System.out.println("porcentaje de pares= "+p+"% impares= "+i+"% ceros= "+c+"%");    
    }
}
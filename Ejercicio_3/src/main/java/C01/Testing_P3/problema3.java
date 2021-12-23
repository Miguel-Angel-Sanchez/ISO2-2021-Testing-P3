package C01.Testing_P3;

public class problema3{
    public static void main(String[] args) {
       
    	certificado(71,74,79,14, 72, 73, 74, 75);
    	certificado(5,5,5,5,5,5,5,5);
        
    }
    public static void certificado(int completitud, int correccion, int pertinencia, int modularidad,
    int reusabilidad,int analizabilidad,int modificado,int probado){
        
    	certificacion c=new certificacion();
        
    	
    	int[] datos_adecuacion = { completitud, correccion, pertinencia };
        int[] datos_mantenibilidad = {modularidad,reusabilidad,analizabilidad,modificado,probado};
        int[][] tabla_adecuacion = { { 0, 0, 0 }, { 1, 1, 2 }, { 2, 1, 2 }, { 2, 2, 3 }, { 3, 3, 4 }, { 4, 5, 5 } };
        int[][] tabla_mantenibilidad = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 2, 2, 1, 2, 1 }, { 2, 2, 2, 3, 2 },
                { 3, 3, 3, 4, 4 }, { 4, 5, 5, 5, 4 } };
        int[][] tabla_global = { { 1, 1, 1, 1, 1 }, { 1, 2, 2, 2, 2 }, { 2, 2, 3, 3, 3 }, { 3, 3, 3, 3, 4 },{ 3, 3, 4, 4, 5 } };

        int adecuacion = c.calculo_minimo(c.calculo_certificacion(datos_adecuacion, tabla_adecuacion));
        int mantenibilidad = c.calculo_minimo(c.calculo_certificacion(datos_mantenibilidad, tabla_mantenibilidad));
        if (adecuacion != 0 && mantenibilidad != 0) {
            int certificacion = tabla_global[(adecuacion - 1)][(mantenibilidad - 1)];
            if (certificacion >= 3)
                System.out.println("La certificacion es " + certificacion + ", se concede");
            else
                System.out.println("La certificacion es " + certificacion + ", no se concede");
        }
    } 
    


}
package org.javahispano.tutorial_maven;

import org.junit.Test;

public class problema3Test {
		@Test
	   public void main() {
			
	       //Cada uno es un caso de prueba
	    	certificado(71,74,79,14, 72, 73, 74, 75);
	    	certificado(5,5,5,5,5,5,5,5);
	    	certificado(-10,-10,-10,-10,-10,-10,-10,-10);
	    	certificado(11,11,11,11,11,11,11,11);
	    	certificado(9,9,9,9,9,9,9,9);
	    	certificado(45,45,45,45,45,45,45,45);
	    	certificado(53,53,53,53,53,53,53,53);
	    	certificado(69,69,69,69,69,69,69,69);
	    	certificado(51,51,51,51,51,51,51,51);
	    	certificado(78,78,78,78,78,78,78,78);
	    	certificado(95,95,95,95,95,95,95,95);
	    	certificado(36,36,36,36,36,36,36,36);
	    	certificado(120,120,120,120,120,120,120,120);
	        
	    }

	    public void certificado(int completitud, int correccion, int pertinencia, int modularidad,
	    int reusabilidad,int analizabilidad,int modificado,int probado){
	    	
	    	certificacionTest ct = new certificacionTest();
	    	
	    	int adecuacion = 0, mantenibilidad = 0;
	    	
	        int[] datos_adecuacion = { completitud, correccion, pertinencia };
	        int[] datos_mantenibilidad = {modularidad,reusabilidad,analizabilidad,modificado,probado};
	        int[][] tabla_adecuacion = { { 0, 0, 0 }, { 1, 1, 2 }, { 2, 1, 2 }, { 2, 2, 3 }, { 3, 3, 4 }, { 4, 5, 5 } };
	        int[][] tabla_mantenibilidad = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 2, 2, 1, 2, 1 }, { 2, 2, 2, 3, 2 },
	                { 3, 3, 3, 4, 4 }, { 4, 5, 5, 5, 4 } };
	        int[][] tabla_global = { { 1, 1, 1, 1, 1 }, { 1, 2, 2, 2, 2 }, { 2, 2, 3, 3, 3 }, { 3, 3, 3, 3, 4 },{ 3, 3, 4, 4, 5 } };

	        adecuacion = ct.calculo_minimo(ct.calculo_certificacion(datos_adecuacion, tabla_adecuacion));
	        mantenibilidad = ct.calculo_minimo(ct.calculo_certificacion(datos_mantenibilidad, tabla_mantenibilidad));
	       
	        if (adecuacion != 0 && mantenibilidad != 0) {
	            int certificacion = tabla_global[(adecuacion - 1)][(mantenibilidad - 1)];
	            if (certificacion >= 3)
	                System.out.println("La certificacion es " + certificacion + ", se concede");
	            else
	                System.out.println("La certificacion es " + certificacion + ", no se concede");
	        }else {
	        	System.out.println("Los valores introducidos no corresponden a ningun valor en la tabla global");
	        }
	    } 
	    

}

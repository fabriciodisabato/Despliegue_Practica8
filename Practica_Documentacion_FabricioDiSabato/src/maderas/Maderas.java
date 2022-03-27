package maderas;

import java.text.DecimalFormat;

public class Maderas {
	
	String[] maderas = {"Caoba","Cedro","Roble","Nogal","Teca"};
	String[] medidas = {"3 mm","5 mm","7 mm","10 mm"};
	
	double valores[][] = {
			{2.5,3.5,4.5,5.5,6.5},
			{1.5,2.3,3.4,5.4,7.2},
			{1.5,2.3,4.3,4.5,6.2},
			{3.5,2.5,3.5,6.5,4.2}
			};
	

	public Maderas() {
		
	}



	public  void imprimir() {
	System.out.print("\t");	
	 
	for (int i = 0; i < maderas.length; i++) {
		System.out.print(maderas[i]+"\t");
		}
     
	 
	System.out.println();
	for (int i = 0; i < valores.length; i++) {
		System.out.print(medidas[i]+": \t");
		for (int j = 0; j < valores[i].length; j++) {
				System.out.print(" "+valores[i][j]+"\t");
				}
		System.out.println();		
		}
	}
	
	
	
	public  double[] calcMedia_Espesor() {
		double tmp;
		double[] tmpEs = new double[4];
		
			for (int i = 0; i < valores.length; i++) {
				tmp=0;
				for (int j = 0; j < valores[i].length; j++) {
					tmp+=valores[i][j];
				}
				tmpEs[i]=(tmp/valores[i].length);
			}
		
		return tmpEs;
	}
	
	public void impMedia_Espesor(double[] tmp) {
		DecimalFormat df = new DecimalFormat("####0.00");
		for (int i = 0; i < medidas.length; i++) {
			System.out.println(medidas[i] + " : "+df.format(tmp[i]));
		}		
	}
	
	public  double[] calcMedia_Maderas() {
		double tmp;
		double[] tmpMa = new double[5];
	
			for (int j = 0; j < 5; j++) {
				tmp=0;
				for (int i = 0; i < 4; i++) {
					tmp+=valores[i][j];
				}
				tmpMa[j]=(tmp/valores.length);
			}
		
		return tmpMa;
	}
	
	public void impMedia_Maderas(double[] tmp) {
		DecimalFormat df = new DecimalFormat("####0.00");
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(maderas[i] + " : "+df.format(tmp[i]));
		}
	}
	
	
}
		
		
	

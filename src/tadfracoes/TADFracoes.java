/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadfracoes;

import java.util.Scanner;

/**
 *
 * @author wesleyferreti
 */
public class TADFracoes {


	private int Numerador;
	private int Denominador;
        
        
        private TADFracoes simplificar(TADFracoes s){// Sobreescrevendo a fração passada!
            
               
                int resto; 
                int simplin = s.Numerador;
                int simplid = s.Denominador;
            
                if(simplin==0){
                    s.Numerador = 0;
                    s.Denominador = 1;
                   
                }
            
                else if(simplin==simplid){
                    s.Numerador = 1;
                    s.Denominador = 1;
                    
                }
                else if(simplin>simplid){ //caso o numerador seja maior
                    do{
                        resto = simplin%simplid; //campo resto recebe o resto da divisão;
                        
                        simplin=simplid; //numerador se torna o denominador da conta anterior;
                        
                        if(resto!=0){
                        simplid=resto;//denominador se torna o resto
                        }
                        
                        
                    }while(resto!=0);

                    s.Numerador = s.Numerador/Math.abs(simplid);
                    s.Denominador = s.Denominador/Math.abs(simplid);
                    
                }
                else{
                     int aux = simplin;
                     simplin = simplid;
                     simplid = aux;
                     do{
                        resto = simplin%simplid; //campo resto recebe o resto da divisão;
                        
                        simplin=simplid; //numerador se torna o denominador da conta anterior;
                        
                        if(resto!=0){
                        simplid=resto;//denominador se torna o resto
                        }
                        
                        
                    }while(resto!=0);
                    
                    
                    s.Numerador = s.Numerador/Math.abs(simplid);
                    s.Denominador = s.Denominador/Math.abs(simplid);
                   
                }
            
            return s;
            
        }
        
       
        
        
        

	public TADFracoes(int n, int d) {
            
           setNumerador(n);
           setDenominador(d);
            
		
	}
       public TADFracoes(){
           
       }
       

	public int getNumerador() {
            return Numerador;
	}

	public void setNumerador(int numerador) {
            this.Numerador = numerador;
	}

	public int getDenominador() {
            return Denominador;
	}

	public void setDenominador(int denominador) {
            
            if (denominador < 1) {
                
            	throw new ArithmeticException("denominador<1");
            }
            
            this.Denominador = denominador;
	}

        @Override
	public String toString() {
            
            return Numerador + "/" + Denominador;
        }

	
        
        public TADFracoes addTo(TADFracoes f2) {
            
            this.Numerador = this.Numerador * f2.Denominador + f2.Numerador * this.Denominador;
            this.Denominador = this.Denominador * f2.Denominador;
            return simplificar(this);
            
	}
        
        public TADFracoes subTo(TADFracoes f2) {
            
            this.Numerador = this.Numerador * f2.Denominador - f2.Numerador * this.Denominador;
            this.Denominador = this.Denominador * f2.Denominador;
            return simplificar(this);
	}
        
        public TADFracoes multTo(TADFracoes f2) {
            
            this.Numerador = this.Numerador * f2.Numerador;
            this.Denominador = this.Denominador * f2.Denominador;
            return simplificar(this);
	}
        
        public TADFracoes divTo(TADFracoes f2) {
            
            this.Numerador = this.Numerador * f2.Denominador;
            this.Denominador = this.Denominador * f2.Numerador;
            return simplificar(this);
	}
        
        public TADFracoes simplify(TADFracoes f2){
            return simplificar(f2);
        }
        
        
        
        /* Métodos que nao sobrescrevem os objetos passados;
        
        
        
        public TADFracoes add(TADFracoes f2) {

            int n = this.Numerador * f2.Denominador + f2.Numerador * this.Denominador;
            int d = this.Denominador * f2.Denominador;      
            TADFracoes f3 = new TADFracoes(n, d);
            return simplificar(f3);//vai retornar o valor simplificado e manter f3, caso for passado mais um parametro inteiro sobreescrera f3 com o novo valor simplificado!   
            
	}
               
        
        public TADFracoes sub(TADFracoes f2) {
                    
            int n = this.Numerador * f2.Denominador - f2.Numerador * this.Denominador;
            int d = this.Denominador * f2.Denominador;
            TADFracoes f3 = new TADFracoes(n, d);        
            return simplificar(f3);
            
	}
        
        public TADFracoes mult(TADFracoes f2){
            
            int n = this.Numerador *  f2.Numerador;
            int d = this.Denominador * f2.Denominador;
            TADFracoes s = new TADFracoes(n, d);
            return simplificar(s);
            
	}
	
	public TADFracoes div(TADFracoes f2){
            
            int n = this.Numerador *  f2.Denominador;
            int d = this.Denominador * f2.Numerador;
            TADFracoes s = new TADFracoes (n, d);
            return simplificar(s);
            
	}
        */
        
        


        
        

}

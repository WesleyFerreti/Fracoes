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
public class FracoesTest {
    

	public static void main(String[] args) {
            Scanner Tec = new Scanner(System.in);
            TADFracoes s;
            String Resp;
            int Quant,Op;
            try{
                
            
            do{
            System.out.println("Escolha: \n\t1 - adição;\n\t2 - subitração;\n\t3 - multiplicação;\n\t4 - divisão;\n\t5 - simplificação;\n\t6 - SAIR;");
            Op = Tec.nextInt();
            
            if(Op<5&&Op>0){
            do{
            System.out.print("Quantas Fracões:");
            Quant = Tec.nextInt();
            if(Quant<2)
                    System.out.println("Precisamos de no minimo 2 frações para fazer qualquer operação ;/");
            }while(Quant<2);
      
            TADFracoes[] vet = new TADFracoes[Quant];
           
            for(int i = 0; i< vet.length;i++){
                System.out.print("\nDigite o numerador para a "+(i+1)+"° Fracão:");
                int n = Tec.nextInt();
                System.out.print("Digite o denominador para a "+(i+1)+"° Fração:");
                int d = Tec.nextInt();
                if(d<0)
                    System.out.print("\nEm Frações os denominadores são sempre positivos.\nCaso queira passar uma fração "
                            + "negativa basta colocar o numerador negativo.(o denominador informado foi convertido para o inverso do mesmo)");
                vet[i] = new TADFracoes(n,Math.abs(d));
            }
            s = vet[0];
            
            
            
            switch(Op){
                case 1:
                     for(int i =1;i<vet.length;i++){
                        s.addTo(vet[i]);
                        
                    }
                    break;
                case 2:
                    for(int i =1;i<vet.length;i++){
                        s.subTo(vet[i]);
                        
                    }
                    break;
                case 3:
                    for(int i =1;i<vet.length;i++){
                        s.multTo(vet[i]);
                        
                    }
                    break;
                case 4:
                    for(int i =1;i<vet.length;i++){
                        s.divTo(vet[i]);
                        
                    }
                    break;
            }
            System.out.println("RESULTADO = "+ s);
            }
            else if(Op==5){
                System.out.println("Digite a Fração que deseja simplificar:");
                System.out.print("Numerador:"); int n = Tec.nextInt();
                System.out.print("Denominador:"); int d = Tec.nextInt();
                TADFracoes simp = new TADFracoes(n,d);
                System.out.println("RESULTADO = "+simp.simplify(simp));   
                
            }
            else if(Op==6){
                System.out.println("Byebye!");
                System.exit(0);
            }
            else{
                System.out.println("OPÇÃO INVALIDA!");
            }
            
            Tec.nextLine();
            System.out.print("Fazer outra operação?(s/n):");
            Resp = Tec.nextLine();
               
                
            }while(Resp.equalsIgnoreCase("s"));
            
            System.out.println("Byebye!");
            
            }catch(ArithmeticException w){
                System.out.println("Denominador não pode ser Zero!");
                
            }
            catch(Exception ww){
                System.out.println("Um erro ocorreu. Use apenas numeros inteiros.");
            }

            
        }
            
   
}

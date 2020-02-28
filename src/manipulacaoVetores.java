import java.util.Scanner;


public class manipulacaoVetores {
	
	 public static int Maior(int v[], int elementos) {

	        int max = 0;
	        for (int i = 0; i < elementos; i++) {
	            if (v[i] > max) {
	                max = v[i];
	            }
	        }
	        return max;
	    }
	 
	 public static void Inserir(int vetor[], int elementos, int posicao) {
		 if (posicao >= 0 && posicao <= elementos) {
             for (int i = elementos-1; i >= posicao; i--) {
                 vetor[i + 1] = vetor[i];
             } 
		   } else {
             System.out.println("Posicao invalida");
         }
	 }
	 public static void Remove(int v[], int elementos, int posicao) {

	        for (int i = posicao; i < elementos - 1; i++) {
	            v[i] = v[i + 1];
	        }
	    }
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	      int opcao, elemento = 0, i, posicao, count = 0;
	      int[] vetor = new int[100];
	      
		 while (count == 0) {

	            System.out.println("1. para adicionar um elemento no vetor");

	            System.out.println("2. Buscar o maior elemento do vetor");

	            System.out.println("3. Adicionar um elemento em  uma dada posicao do vetor");

	            System.out.println("4. Remover um elemento de uma dada posicao caso ele exista");
                
	            System.out.println("0. Encerra programa");
	            
	            opcao = ler.nextInt();
	            
		  
	      switch(opcao) {
	       
	      case 1:
	    	  if (elemento <= 99) {
                  System.out.println("Digite o valor do elemento");
                  vetor[elemento] = ler.nextInt();
                  elemento++;
              } else {
                  System.out.println("Nao foi possivel adicionar");
              }
              for (i = 0; i < elemento; i++) {
                  System.out.println("vetor[" + i + "] = " + vetor[i]);
              }
              break;
              
	      case 2:
              for (i = 0; i < elemento; i++) {
                  System.out.println("vetor[" + i + "] = " + vetor[i]);
              }
              System.out.println("Maior elemento = " + Maior(vetor, elemento));
              break;
              
	      case 3:
	    	  System.out.println("Digite a posiçao que deseja adicionar o valor");
              posicao = ler.nextInt();
              if(posicao < elemento) {
              System.out.println("Digite o valor do elemento");
                  Inserir(vetor, elemento, posicao);
                  vetor[posicao] = ler.nextInt();
                  elemento++;
              }else {
            	  System.out.println("opção Invalida!!!");
              }
                  for (i = 0; i < elemento; i++) {
                      System.out.println("vetor[" + i + "] = " + vetor[i]);
                  }
              break;   
	      case 4:
	    	  System.out.println("Digite a posicao em que deseja remover");
              posicao = ler.nextInt();
              if (posicao >= 0 && posicao < elemento) {
                  Remove(vetor, elemento, posicao);
                  elemento--;
              } else {
                  System.out.println("Posicao invalida");
              }
              for (i = 0; i < elemento; i++) {
                  System.out.println("vetor[" + i + "] = " + vetor[i]);
              }
              break;
	      case 0 :
	    	  count++;
	    	  break;
	    
	    	  default:
	    		  System.out.println("Opção invalida!!");
	         }
		
		 }
		 ler.close();
	}
}

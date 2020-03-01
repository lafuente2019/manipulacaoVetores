import java.util.Scanner;


public class manipulacaoVetores {
	
	public static int tamanhoVetor() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do seu vetor: ");
		int tm = ler.nextInt();
		if (tm > 0 && tm <= 100) {
			return tm;
		}else {
			return -1;	
		}
		
	}
	public static void populaVetor(int []vetor) {
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor [" + i +"]:");
			vetor[i] = ler.nextInt();
			System.out.println("-------------------");
		}
	}
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
	  public static void intercalaVetor(int v[],int[]v1,int v2[]) {
		  int aux = 0;
	        for (int i = 0; i < v.length; i++) {
	            v2[aux] = v[i];
	            aux += 2;

	        }
	        aux = 1;
	        for (int i = 0; i < v1.length; i++) {
	            v2[aux] = v1[i];
	            aux += 2;
	        }
	       System.out.println("----Criando o vetor C com a soma "
	               + "do tamanhos de A e B -----");
	       for (int i = 0; i < v2.length; i++) {
	        System.out.println("vetor[" + i + "]" + v2[i]);
	      }
	        System.out.println("----Ordem crescente-----");
	       int p;
	       for (int i = 0; i < v2.length ; i++) {
	            for (int j = 0 ; j < v2.length-1 ; j++) {
	                if(v2[i] < v2[j]){
	                 p = v2[i];
	                 v2[i] = v2[j];
	                 v2[j] = p; 
	                }  
	            }    
	        }
	        for (int i = 0; i < v2.length; i++) {
	        System.out.println("vetor[" + i + "]" + v2[i]);
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

package ProvaAV1EddQuestao2;

public class ListaCandidatos {
	 No inicio = null;
	    int tamanho = 0;

	    public void inserirInicio(String info) {
	        Node no = new No();
	        no.info = info;
	        no.proximo = inicio;
	        inicio = no;
	        tamanho++;
	        
	        public String retirarInicio() {
	            if (inicio == null) {
	                return null;
	            }
	            String info = inicio.info;
	            inicio = inicio.proximo;
	            tamanho--;
	            return info;
	        }

	        public void inserirFinal(String info) {
	            No no = new No();
	            no.info = info;
	            if (inicio == null) {
	                no.proximo = null;
	                inicio = no;
	            } else {
	                No local = inicio;
	                while (local.proximo != null) {
	                    local = local.proximo;
	                }
	                local.proximo = no;
	                no.proximo = null;
	            }
	            tamanho++;
	        }

	    }
	

	}

}

public class LinekdList {

    private int nElementos;
    private Nodo primeiroElemento;
    private Nodo ultimoElemento;

    
    public LinekdList() {
        this.nElementos = 0;
        this.primeiroElemento = null;
        this.ultimoElemento = null;
    }

    public void adicionar(char caractere) {
        
        if(nElementos == 0) {
            this.primeiroElemento = new Nodo(caractere, null);
            this.ultimoElemento = primeiroElemento;
            this.nElementos++;
        } else{
            Nodo aux = this.ultimoElemento;
            this.ultimoElemento = new Nodo(caractere, null);
            aux.proximoNodo = ultimoElemento;
            this.nElementos++;
        }
    }

    public void remover(boolean igual) {

        if(igual == true) {
            this.primeiroElemento = primeiroElemento.proximoNodo;
            this.nElementos--;
        } else {
            Nodo aux = this.primeiroElemento.proximoNodo;
            this.primeiroElemento = aux.proximoNodo;
            this.nElementos = this.nElementos - 2;
        }
        
    }

    public void buscador() {
        
        if(primeiroElemento.caractere == primeiroElemento.proximoNodo.caractere) {
            remover(true);
        } else{
            adicionar(fusao(this.primeiroElemento.caractere, this.primeiroElemento.proximoNodo.caractere));
            remover(false);
        }
    }

    public char fusao(char a, char b) {

        if((a == 'D' || a == 'N') && (b == 'D' || b == 'N')) {
            return 'A';
        } else if((a == 'A' || a == 'D') && (b == 'A' || b == 'D')) {
            return 'N';
        } else {
            return 'D';
        }
    }

    public int nElementos() {
        return this.nElementos;
    }

    public StringBuffer escritor() {
        StringBuffer sb = new StringBuffer();
        Nodo aux = this.primeiroElemento;

        for(int i =0; i< this.nElementos; i++) {
            sb.append(aux.caractere + " -> ");
            aux = aux.proximoNodo;
        }
        
        return sb;
    }


    private class Nodo {

        private char caractere;
        private Nodo proximoNodo;

        public Nodo(char caractere, LinekdList.Nodo proximoNodo) {
            this.caractere = caractere;
            this.proximoNodo = proximoNodo;
        }

       
    }
    
}

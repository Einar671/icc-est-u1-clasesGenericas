public class Par<K,V> {
    private K clave;
    private V valor;
    public Par() {
    }

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
    public K getClave() {
        return clave;
    }
    public void setClave(K clave) {
        this.clave = clave;
    }
    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }
    
    public void setValues(K clave,V valor){
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  clave + " " + valor ;
    }

    
}

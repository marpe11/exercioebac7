public class Carro {

    /**
     * @link https://lms.ebaconline.com.br/lesson/e7f36927-a985-4bfc-a949-474745da12f5
     */
    private String modelo;
    private String cor;
    private int qntPortas;
    private boolean temDesconto;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    public boolean isTemDesconto() {
        return temDesconto;
    }

    public void setTemDesconto(boolean temDesconto) {
        this.temDesconto = temDesconto;
    }

    public void cadastrarCor(String cor) {
        setCor(cor);
    }
    public void imprimirCarro(){
        /**
         * @author Marcus Pereira
         */
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.qntPortas);
        System.out.println(this.temDesconto);
    }
}

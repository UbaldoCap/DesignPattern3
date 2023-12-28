public class User {
    private String nome;
    private int eta;

    public User() {
        this.nome = "inserire nome";
        this.eta = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampaDettagli () {
        System.out.println("User:");
        System.out.println("Nome = " + nome);
        System.out.println("Età = " + eta);
    }
}

public class Contato {

    //nome, telefone, email, e um id
    private String nome;
    private String telefone;
    private String email;
    private int id;
    private static int contador = 0;

    public Contato(){
        contador++;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return STR."Contato{nome='\{nome}\{'\''}, telefone='\{telefone}\{'\''}, email='\{email}\{'\''}\{'}'}";
    }
}

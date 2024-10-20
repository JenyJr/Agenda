public class ContatoNaoExisteExceptions extends Exception{

    private String nome;

    public ContatoNaoExisteExceptions(String nome){
        this.nome = nome;
}

    @Override
    public String getMessage() {
        return STR."\{nome} não existe na agenda!!";
    }
}

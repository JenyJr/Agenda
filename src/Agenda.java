public class Agenda {

    //metodo adicionar
    //consultar contatos

    Contato[] contatos = new Contato[3];

    //corrigir erro de lógica
    public void adicionarContato(Contato c){

        boolean cheia = true;
        if (!cheia) {
            for (int i = 0; i < contatos.length; i++) {
                contatos[i] = c;
                cheia = false;
            }
        }
        if (cheia){
            try {
                throw new AgendaCheiaExceptions();
            } catch (AgendaCheiaExceptions e) {
                e.getMessage();
            }
        }
    }

    public int consultarContato(String nome) {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }else {
                    try {
                        throw new ContatoNaoExisteExceptions(nome);
                    } catch (ContatoNaoExisteExceptions e) {
                        e.getMessage();
                    }
                }
            }
        }
        return -1;
    }


}

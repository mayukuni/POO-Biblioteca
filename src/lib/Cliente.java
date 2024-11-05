package lib;

import java.util.List;

public class Cliente extends Usuario {
    private boolean status;
    private List<Livro> livrosFisicosEmprestados;
    private List<LivroDigital> livrosDigitaisEmprestados;

    public Cliente(String nome, String email, String senha, String cpf, String cargo, boolean status) {
        super(nome, email, senha, cpf, cargo);
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Livro> getLivrosFisicosEmprestados() {
        return livrosFisicosEmprestados;
    }

    public void setLivrosFisicosEmprestados(List<Livro> livrosFisicosEmprestados) {
        this.livrosFisicosEmprestados = livrosFisicosEmprestados;
    }

    public List<LivroDigital> getLivrosDigitaisEmprestados() {
        return livrosDigitaisEmprestados;
    }

    public void setLivrosDigitaisEmprestados(List<LivroDigital> livrosDigitaisEmprestados) {
        this.livrosDigitaisEmprestados = livrosDigitaisEmprestados;
    }

    public void solicitarDevolucao(Funcionario funcionario, Livro livro) {
        System.out.println("Solicitando devolução do livro: " + livro.getTitulo());
    }

    public void solicitarEmprestimo(Funcionario funcionario, Livro livro) {
        System.out.println("Solicitando empréstimo do livro: " + livro.getTitulo());
    }
}


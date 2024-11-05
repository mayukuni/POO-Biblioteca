package lib;

public class Funcionario extends Usuario {
    public Funcionario(String nome, String email, String senha, String cpf, String cargo) {
        super(nome, email, senha, cpf, cargo);
    }

    // Métodos específicos
    public void registrarEmprestimo(Cliente cliente, Livro livro) {
        // Lógica para registrar um empréstimo de livro
        System.out.println("Registrando empréstimo do livro: " + livro.getTitulo() + " para o cliente: " + cliente.getNome());
    }

    public void registrarDevolucao(Cliente cliente, Livro livro) {
        // Lógica para registrar a devolução de um livro
        System.out.println("Registrando devolução do livro: " + livro.getTitulo() + " do cliente: " + cliente.getNome());
    }
}


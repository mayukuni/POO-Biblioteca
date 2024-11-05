package lib;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String cargo;

    // Construtor
    public Usuario(String nome, String email, String senha, String cpf, String cargo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Métodos
    public void consultarLivrosEmprestados() {
        // Lógica para consultar os livros emprestados
        System.out.println("Consultando livros emprestados...");
    }

    public void consultarLivrosDisponiveis() {
        // Lógica para consultar os livros disponíveis
        System.out.println("Consultando livros disponíveis...");
    }
}


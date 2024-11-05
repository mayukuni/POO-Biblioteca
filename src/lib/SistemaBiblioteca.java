package lib;
import java.util.List;

public class SistemaBiblioteca {
    private List<LivroFisico> livrosFisicosCadastrados;
    private List<LivroDigital> livrosDigitaisCadastrados;
    private List<Administrador> administradoresCadastrados;
    private List<Funcionario> funcionariosCadastrados;
    private List<Cliente> clientesCadastrados;

    // Construtor
    public SistemaBiblioteca(List<LivroFisico> livrosFisicosCadastrados, List<LivroDigital> livrosDigitaisCadastrados,
                             List<Administrador> administradoresCadastrados, List<Funcionario> funcionariosCadastrados,
                             List<Cliente> clientesCadastrados) {
        this.livrosFisicosCadastrados = livrosFisicosCadastrados;
        this.livrosDigitaisCadastrados = livrosDigitaisCadastrados;
        this.administradoresCadastrados = administradoresCadastrados;
        this.funcionariosCadastrados = funcionariosCadastrados;
        this.clientesCadastrados = clientesCadastrados;
    }

    // Getters e Setters
    public List<LivroFisico> getLivrosFisicosCadastrados() {
        return livrosFisicosCadastrados;
    }

    public void setLivrosFisicosCadastrados(List<LivroFisico> livrosFisicosCadastrados) {
        this.livrosFisicosCadastrados = livrosFisicosCadastrados;
    }

    public List<LivroDigital> getLivrosDigitaisCadastrados() {
        return livrosDigitaisCadastrados;
    }

    public void setLivrosDigitaisCadastrados(List<LivroDigital> livrosDigitaisCadastrados) {
        this.livrosDigitaisCadastrados = livrosDigitaisCadastrados;
    }

    public List<Administrador> getAdministradoresCadastrados() {
        return administradoresCadastrados;
    }

    public void setAdministradoresCadastrados(List<Administrador> administradoresCadastrados) {
        this.administradoresCadastrados = administradoresCadastrados;
    }

    public List<Funcionario> getFuncionariosCadastrados() {
        return funcionariosCadastrados;
    }

    public void setFuncionariosCadastrados(List<Funcionario> funcionariosCadastrados) {
        this.funcionariosCadastrados = funcionariosCadastrados;
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

    public void setClientesCadastrados(List<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }

    // Métodos específicos podem ser adicionados conforme necessário para a lógica do sistema.
}


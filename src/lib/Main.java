package lib;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientesCadastrados = new ArrayList<>();
    private static List<Administrador> administradoresCadastrados = new ArrayList<>();
    private static List<Funcionario> funcionariosCadastrados = new ArrayList<>();
    private static SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca(
            new ArrayList<>(), new ArrayList<>(), administradoresCadastrados, funcionariosCadastrados, clientesCadastrados);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Fazer Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    fazerLogin(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("\n=== Cadastro de Cliente ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, email, senha, cpf, "Cliente", true);
        clientesCadastrados.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void fazerLogin(Scanner scanner) {
        System.out.println("\n=== Login ===");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = verificarCredenciais(email, senha);

        if (usuarioLogado != null) {
            System.out.println("Login bem-sucedido. Bem-vindo(a), " + usuarioLogado.getNome() + "!");
            interagirComSistema(usuarioLogado, scanner);
        } else {
            System.out.println("Credenciais inválidas. Tente novamente.");
        }
    }

    private static Usuario verificarCredenciais(String email, String senha) {
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        for (Administrador admin : administradoresCadastrados) {
            if (admin.getEmail().equals(email) && admin.getSenha().equals(senha)) {
                return admin;
            }
        }
        for (Funcionario funcionario : funcionariosCadastrados) {
            if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                return funcionario;
            }
        }
        return null; // Retorna null se nenhum usuário for encontrado
    }

    private static void interagirComSistema(Usuario usuario, Scanner scanner) {
        if (usuario instanceof Cliente) {
            menuCliente((Cliente) usuario, scanner);
        } else if (usuario instanceof Administrador) {
            menuAdministrador((Administrador) usuario, scanner);
        } else if (usuario instanceof Funcionario) {
            menuFuncionario((Funcionario) usuario, scanner);
        }
    }

    private static void menuCliente(Cliente cliente, Scanner scanner) {
        System.out.println("\n=== Menu Cliente ===");
        // Adicione opções específicas para o cliente aqui
        System.out.println("Opções de interação com o sistema virão em breve...");
    }

    private static void menuAdministrador(Administrador admin, Scanner scanner) {
        System.out.println("\n=== Menu Administrador ===");
        // Adicione opções específicas para o administrador aqui
        System.out.println("Opções de interação com o sistema virão em breve...");
    }

    private static void menuFuncionario(Funcionario funcionario, Scanner scanner) {
        System.out.println("\n=== Menu Funcionário ===");
        // Adicione opções específicas para o funcionário aqui
        System.out.println("Opções de interação com o sistema virão em breve...");
    }
}

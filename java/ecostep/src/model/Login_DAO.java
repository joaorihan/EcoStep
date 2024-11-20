package model;

import javax.swing.*;

public class Login_DAO {

    public static Usuario_DAO user;

    public static void cadastrarUsuario(String nome, String rm, String email, String senha){
        user = new Usuario_DAO(nome, rm, email, senha);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }


    public static boolean checarLogin(String email, String senha){
        if (user == null){
            JOptionPane.showMessageDialog(null, "Não há nenhum usuário cadastrado no banco de dados!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return email.equals(user.email) && senha.equals(user.senha);
    }

}

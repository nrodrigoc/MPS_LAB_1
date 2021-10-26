package br.com.mps.exemplo.business.control;

import br.com.mps.exemplo.business.model.Usuario;

import java.util.List;

public interface UsuarioControl {

    Usuario deletaUsuarioPorUsername(String username) throws Exception;

    Usuario cadastraUsuario(String username, String password);

    List<Usuario> listaUsuarios();
}

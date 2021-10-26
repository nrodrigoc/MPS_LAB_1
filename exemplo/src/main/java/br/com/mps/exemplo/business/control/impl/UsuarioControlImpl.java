package br.com.mps.exemplo.business.control.impl;

import br.com.mps.exemplo.Infra.UsuarioRepository;
import br.com.mps.exemplo.business.control.UsuarioControl;
import br.com.mps.exemplo.business.control.Validacao;
import br.com.mps.exemplo.business.exception.ValidacaoException;
import br.com.mps.exemplo.business.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioControlImpl implements UsuarioControl {

    private final UsuarioRepository usuarioRepository;

    public UsuarioControlImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario deletaUsuarioPorUsername(String username) throws Exception {
        return usuarioRepository.deleteByUsername(username)
                .orElseThrow(() -> new Exception("Username não encontrado."));
    }

    @Override
    public Usuario cadastraUsuario(String username, String password) {
        try{
            Validacao.validar(username, new ValidacaoUsername());
            Validacao.validar(password, new ValidacaoPassword());

            Usuario usuario = new Usuario(username, password);
            return usuarioRepository.save(usuario);
        }catch (ValidacaoException e){
            System.out.println("Error -> " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }
}

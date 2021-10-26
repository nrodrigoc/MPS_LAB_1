package br.com.mps.exemplo.view;

import br.com.mps.exemplo.business.control.UsuarioControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credenciais")
public class CredenciaisView {

    private final UsuarioControl usuarioControl;

    public CredenciaisView(UsuarioControl usuarioControl) {
        this.usuarioControl = usuarioControl;
    }

    @PostMapping // Cadastra um usuário
    public ResponseEntity<?> cadastraUsuario(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok(null);
    }

    @GetMapping // Lista todos os usuários cadastrados
    public ResponseEntity<?> listaUsuarios() {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping // Deleta um usuário
    public ResponseEntity<?> deletaUsuario(@RequestParam String username) throws Exception {
        return ResponseEntity.ok(usuarioControl.deletaUsuarioPorUsername(username));
    }


}

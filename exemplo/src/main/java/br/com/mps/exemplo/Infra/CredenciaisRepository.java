package br.com.mps.exemplo.Infra;

import br.com.mps.exemplo.business.model.Credenciais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredenciaisRepository extends JpaRepository<Credenciais, Long> {
}

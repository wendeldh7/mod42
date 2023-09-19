/**
 * 
 */
package br.com.gomes.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.gomes.vendas.online.domain.Cliente;

/**
 * @author wendel.gomes
 *
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}

package application.repository;
import org.springframework.data.repository.CrudRepository;
import application.model.Pessoa;
public interface PessoasRepository extends CrudRepository<Pessoa, Long>{
   
}
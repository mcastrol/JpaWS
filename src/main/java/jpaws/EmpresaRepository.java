package jpaws;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "empresa", path = "empresa")

public interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Long> {

     List<Empresa> findByNombre(@Param("nombre") String nombre);

}

package ma.sir.oubala.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.sir.oubala.zynerator.repository.AbstractRepository;
import ma.sir.oubala.bean.core.commun.Client;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClientDao extends AbstractRepository<Client,Long>  {

    List<Client> findByClientCategoryId(Long id);
    int deleteByClientCategoryId(Long id);
    Client findByUsername(String username);

    @Query("SELECT NEW Client(item.id,item.fullName) FROM Client item")
    List<Client> findAllOptimized();

}

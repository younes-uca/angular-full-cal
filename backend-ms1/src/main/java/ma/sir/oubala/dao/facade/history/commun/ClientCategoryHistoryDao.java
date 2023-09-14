package ma.sir.oubala.dao.facade.history.commun;

import ma.sir.oubala.zynerator.repository.AbstractHistoryRepository;
import ma.sir.oubala.bean.history.commun.ClientCategoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCategoryHistoryDao extends AbstractHistoryRepository<ClientCategoryHistory,Long> {

}

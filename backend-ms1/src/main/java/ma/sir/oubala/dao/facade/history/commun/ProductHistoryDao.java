package ma.sir.oubala.dao.facade.history.commun;

import ma.sir.oubala.zynerator.repository.AbstractHistoryRepository;
import ma.sir.oubala.bean.history.commun.ProductHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductHistoryDao extends AbstractHistoryRepository<ProductHistory,Long> {

}

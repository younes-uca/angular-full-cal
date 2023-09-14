package ma.sir.oubala.dao.facade.history.flos;

import ma.sir.oubala.zynerator.repository.AbstractHistoryRepository;
import ma.sir.oubala.bean.history.flos.PurchaseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseHistoryDao extends AbstractHistoryRepository<PurchaseHistory,Long> {

}

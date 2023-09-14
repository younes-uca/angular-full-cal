package ma.sir.oubala.dao.facade.core.flos;

import ma.sir.oubala.zynerator.repository.AbstractRepository;
import ma.sir.oubala.bean.core.flos.PurchaseItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseItemDao extends AbstractRepository<PurchaseItem,Long>  {

    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);


}

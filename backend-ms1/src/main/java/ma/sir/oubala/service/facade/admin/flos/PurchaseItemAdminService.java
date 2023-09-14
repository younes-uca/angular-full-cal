package ma.sir.oubala.service.facade.admin.flos;

import java.util.List;
import ma.sir.oubala.bean.core.flos.PurchaseItem;
import ma.sir.oubala.dao.criteria.core.flos.PurchaseItemCriteria;
import ma.sir.oubala.dao.criteria.history.flos.PurchaseItemHistoryCriteria;
import ma.sir.oubala.zynerator.service.IService;


public interface PurchaseItemAdminService extends  IService<PurchaseItem,PurchaseItemCriteria, PurchaseItemHistoryCriteria>  {

    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);



}

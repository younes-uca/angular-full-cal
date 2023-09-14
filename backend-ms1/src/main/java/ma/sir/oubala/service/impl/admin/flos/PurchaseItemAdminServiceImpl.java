package ma.sir.oubala.service.impl.admin.flos;


import ma.sir.oubala.bean.core.flos.PurchaseItem;
import ma.sir.oubala.bean.history.flos.PurchaseItemHistory;
import ma.sir.oubala.dao.criteria.core.flos.PurchaseItemCriteria;
import ma.sir.oubala.dao.criteria.history.flos.PurchaseItemHistoryCriteria;
import ma.sir.oubala.dao.facade.core.flos.PurchaseItemDao;
import ma.sir.oubala.dao.facade.history.flos.PurchaseItemHistoryDao;
import ma.sir.oubala.dao.specification.core.flos.PurchaseItemSpecification;
import ma.sir.oubala.service.facade.admin.flos.PurchaseItemAdminService;
import ma.sir.oubala.zynerator.service.AbstractServiceImpl;
import ma.sir.oubala.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;

import ma.sir.oubala.service.facade.admin.commun.ProductAdminService ;
import ma.sir.oubala.bean.core.commun.Product ;
import ma.sir.oubala.service.facade.admin.flos.PurchaseAdminService ;
import ma.sir.oubala.bean.core.flos.Purchase ;


import java.util.List;
@Service
public class PurchaseItemAdminServiceImpl extends AbstractServiceImpl<PurchaseItem,PurchaseItemHistory, PurchaseItemCriteria, PurchaseItemHistoryCriteria, PurchaseItemDao,
PurchaseItemHistoryDao> implements PurchaseItemAdminService {






    public List<PurchaseItem> findByProductId(Long id){
        return dao.findByProductId(id);
    }
    public int deleteByProductId(Long id){
        return dao.deleteByProductId(id);
    }
    public List<PurchaseItem> findByPurchaseId(Long id){
        return dao.findByPurchaseId(id);
    }
    public int deleteByPurchaseId(Long id){
        return dao.deleteByPurchaseId(id);
    }






    public void configure() {
        super.configure(PurchaseItem.class,PurchaseItemHistory.class, PurchaseItemHistoryCriteria.class, PurchaseItemSpecification.class);
    }


    @Autowired
    private ProductAdminService productService ;
    @Autowired
    private PurchaseAdminService purchaseService ;

    public PurchaseItemAdminServiceImpl(PurchaseItemDao dao, PurchaseItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
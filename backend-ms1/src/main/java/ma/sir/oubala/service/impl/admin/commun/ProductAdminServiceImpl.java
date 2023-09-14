package ma.sir.oubala.service.impl.admin.commun;


import ma.sir.oubala.bean.core.commun.Product;
import ma.sir.oubala.bean.history.commun.ProductHistory;
import ma.sir.oubala.dao.criteria.core.commun.ProductCriteria;
import ma.sir.oubala.dao.criteria.history.commun.ProductHistoryCriteria;
import ma.sir.oubala.dao.facade.core.commun.ProductDao;
import ma.sir.oubala.dao.facade.history.commun.ProductHistoryDao;
import ma.sir.oubala.dao.specification.core.commun.ProductSpecification;
import ma.sir.oubala.service.facade.admin.commun.ProductAdminService;
import ma.sir.oubala.zynerator.service.AbstractServiceImpl;
import ma.sir.oubala.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
@Service
public class ProductAdminServiceImpl extends AbstractServiceImpl<Product,ProductHistory, ProductCriteria, ProductHistoryCriteria, ProductDao,
ProductHistoryDao> implements ProductAdminService {





    public Product findByReferenceEntity(Product t){
        return  dao.findByCode(t.getCode());
    }







    public void configure() {
        super.configure(Product.class,ProductHistory.class, ProductHistoryCriteria.class, ProductSpecification.class);
    }



    public ProductAdminServiceImpl(ProductDao dao, ProductHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.sir.oubala.service.facade.admin.commun;

import java.util.List;
import ma.sir.oubala.bean.core.commun.Product;
import ma.sir.oubala.dao.criteria.core.commun.ProductCriteria;
import ma.sir.oubala.dao.criteria.history.commun.ProductHistoryCriteria;
import ma.sir.oubala.zynerator.service.IService;


public interface ProductAdminService extends  IService<Product,ProductCriteria, ProductHistoryCriteria>  {




}

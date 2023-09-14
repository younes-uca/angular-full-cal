package  ma.sir.oubala.dao.specification.history.commun;

import ma.sir.oubala.zynerator.specification.AbstractHistorySpecification;
import ma.sir.oubala.dao.criteria.history.commun.ClientCategoryHistoryCriteria;
import ma.sir.oubala.bean.history.commun.ClientCategoryHistory;


public class ClientCategoryHistorySpecification extends AbstractHistorySpecification<ClientCategoryHistoryCriteria, ClientCategoryHistory> {

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public ClientCategoryHistorySpecification(ClientCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

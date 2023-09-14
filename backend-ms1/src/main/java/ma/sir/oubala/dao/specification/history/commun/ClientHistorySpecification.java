package  ma.sir.oubala.dao.specification.history.commun;

import ma.sir.oubala.zynerator.specification.AbstractHistorySpecification;
import ma.sir.oubala.dao.criteria.history.commun.ClientHistoryCriteria;
import ma.sir.oubala.bean.history.commun.ClientHistory;


public class ClientHistorySpecification extends AbstractHistorySpecification<ClientHistoryCriteria, ClientHistory> {

    public ClientHistorySpecification(ClientHistoryCriteria criteria) {
        super(criteria);
    }

    public ClientHistorySpecification(ClientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

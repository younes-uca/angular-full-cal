package  ma.sir.oubala.dao.specification.core.commun;

import ma.sir.oubala.zynerator.specification.AbstractSpecification;
import ma.sir.oubala.dao.criteria.core.commun.ClientCategoryCriteria;
import ma.sir.oubala.bean.core.commun.ClientCategory;


public class ClientCategorySpecification extends  AbstractSpecification<ClientCategoryCriteria, ClientCategory>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ClientCategorySpecification(ClientCategoryCriteria criteria) {
        super(criteria);
    }

    public ClientCategorySpecification(ClientCategoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

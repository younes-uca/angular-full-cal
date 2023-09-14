package ma.sir.oubala.zynerator.service;

import ma.sir.oubala.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.oubala.zynerator.criteria.BaseCriteria;
import ma.sir.oubala.zynerator.history.HistBusinessObject;
import ma.sir.oubala.zynerator.history.HistCriteria;
import ma.sir.oubala.zynerator.repository.AbstractHistoryRepository;
import ma.sir.oubala.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}
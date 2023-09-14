package ma.sir.oubala.service.facade.admin.commun;

import java.util.List;
import ma.sir.oubala.bean.core.commun.ClientCategory;
import ma.sir.oubala.dao.criteria.core.commun.ClientCategoryCriteria;
import ma.sir.oubala.dao.criteria.history.commun.ClientCategoryHistoryCriteria;
import ma.sir.oubala.zynerator.service.IService;

import ma.sir.oubala.ws.dto.commun.ClientCategoryDto;
import org.springframework.http.HttpEntity;

public interface ClientCategoryAdminService extends  IService<ClientCategory,ClientCategoryCriteria, ClientCategoryHistoryCriteria>  {



    HttpEntity<byte[]> createPdf(ClientCategoryDto dto) throws Exception;

}

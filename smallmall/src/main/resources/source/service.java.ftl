package ${package.Service};

import ${package.Entity}.${entity};

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.smallrain.smallmall.exception.SmallrMallException;
import com.smallrain.smallmall.model.QueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 * @author ${author}
 * @since ${date}
 */
public interface ${table.serviceName} extends IService<${entity}> {
  
  public IPage<${entity}> getList(QueryParam<${entity}> param) throws SmallrMallException;
  
  public ${entity} add(${entity} entity) throws SmallrMallException;
  
  public ${entity} update(${entity} entity) throws SmallrMallException;
  
  public boolean delete(String... ids) throws SmallrMallException;
}

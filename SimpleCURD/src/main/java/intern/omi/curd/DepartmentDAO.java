package intern.omi.curd;

import java.util.List;
 
public interface DepartmentDAO {
 
  public List<Department> listDepartment() ;
  
  public Integer getMaxDeptId();
  
  public void createDepartment(String name,String location);  
}
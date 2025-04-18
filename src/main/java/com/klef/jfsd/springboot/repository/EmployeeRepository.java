package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.springboot.model.Employee;
import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query("select e from Employee e where e.email=?1 and e.password=?2")
	public Employee checkemployeelogin(String eemail,String epwd);
	
	@Query("update Employee e set e.status=?1 where e.id=?2")
	@Modifying // for Data manipulation language 
	@Transactional
	public int updateempstatus(String status,int eid);
	
	@Query("delete from Employee e where e.id=?1")
	@Modifying // for Data manipulation language 
	@Transactional
	public int deletempbyid(int eid);
	
   public List<Employee> findByDepartment(String department);

	

}

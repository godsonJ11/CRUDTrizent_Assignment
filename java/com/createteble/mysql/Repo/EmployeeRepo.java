package com.createteble.mysql.Repo;


import org.springframework.data.repository.CrudRepository;

import com.createteble.mysql.Entity.TableCreating;

public interface EmployeeRepo extends CrudRepository<TableCreating,String> {

}

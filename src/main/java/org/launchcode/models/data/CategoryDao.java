package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository          //tells Spring that this interface that this is a repository
@Transactional         //all methods in this interface should be wrapped by a database transaction = interaction with db
public interface CategoryDao extends CrudRepository<Category, Integer> {
}

package com.snort.intelli.app.Repository;

import com.snort.intelli.app.Entities.Todos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodosRepository extends CrudRepository<Todos,Long> {
    List<Todos> findByTitle(String title); //find at task for task title for given title=?;
    List<Todos> findByAssignedBy(String assignedBy); //find a task where task assigned by =?;
    List<Todos> findByDifficultyLevelAndCompleted(String difficultyLevel,String completed); //find a task where difficultyLevel=? and completed=? given.
}

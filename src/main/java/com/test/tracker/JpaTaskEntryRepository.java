package com.test.tracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskEntryRepository extends JpaRepository<TaskEntry, Long> {

    // Add custom query methods here if needed
}

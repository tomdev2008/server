package org.bytedesk.jpa.repository;

import org.bytedesk.jpa.model.Category;
import org.bytedesk.jpa.model.Cuw;
import org.bytedesk.jpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * 常用语
 *
 * @author bytedesk.com
 */
@Repository
public interface CuwRepository extends JpaRepository<Cuw, Long>, JpaSpecificationExecutor {

    Set<Cuw> findByUser(User user);

    Page<Cuw> findByUser(User user, Pageable pageable);

    Set<Cuw> findByCategory(Category category);
}
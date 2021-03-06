package com.zzlhr.dao;

import com.zzlhr.entity.AdminGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 刘浩然 on 2017/9/1.
 */

@Repository
public interface AdminGroupDao extends JpaRepository<AdminGroup, Integer> {

    Page<AdminGroup> findAdminGroupByGroupNameLike(Pageable pageable);

    Page<AdminGroup> findAdminGroupByGroupNameLikeAndGroupStatus(String groupName, Integer status, Pageable pageable);



}

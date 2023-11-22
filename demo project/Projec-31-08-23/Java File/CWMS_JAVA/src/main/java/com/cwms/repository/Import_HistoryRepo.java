package com.cwms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwms.entities.Import_History;

public interface Import_HistoryRepo extends JpaRepository<Import_History, String>
{

	
	
    List<Import_History> findByCompanyIdAndBranchIdAndSirNo(String companyId, String branchId, String sirNo);
}
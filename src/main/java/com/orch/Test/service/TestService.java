package com.orch.Test.service;

import com.orch.Test.repository.TestTable;
import com.orch.Test.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

  @Autowired
  TestTableRepository repository;

  @Override
  public void method1(TestTable testTable) {
    repository.saveAndFlush(testTable);
  }



}

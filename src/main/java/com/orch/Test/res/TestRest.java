package com.orch.Test.res;

import com.orch.Test.CustomClass;
import com.orch.Test.repository.TestTable;
import com.orch.Test.repository.TestTableRepository;
import com.orch.Test.service.ITestService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRest {

  @Qualifier("customClass2")
  @Autowired
  CustomClass customClass;

  @Autowired
  ITestService service;

  @Autowired
  TestTableRepository repository;

  @PostMapping
  public void test(@RequestBody TestTable testTable) {
    service.method1(testTable);
  }

  @GetMapping("/{id}")
  public Optional<TestTable> get(@PathVariable("id") String id) {
    Optional<TestTable> opt =  repository.findById(Integer.valueOf(id));
    return opt;
  }
}

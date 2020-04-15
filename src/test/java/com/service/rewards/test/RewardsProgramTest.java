package com.service.rewards.test;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.service.rewards.impl.CustomerRepository;
import com.service.rewards.impl.RewardsDataService;
import com.service.rewards.model.Customer;
import com.service.rewards.model.MyTransaction;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
public class RewardsProgramTest {

  private static long index;

  @Autowired
  private RewardsDataService rewardsDataService;
  @Autowired
  private CustomerRepository customerRepository;

  @Before
  public void saveCustomer() {
    List<MyTransaction> transactions = new ArrayList<MyTransaction>();
    Customer cust = new Customer(4, "veeren");
    transactions.add(new MyTransaction(index++, cust, 100.0, "Purchase A", new Date()));
    transactions.add(new MyTransaction(index++, cust, 100.0, "Purchase B", new Date()));
    transactions.add(new MyTransaction(index++, cust, 100.0, "Purchase C", new Date()));
    customerRepository.save(cust);
  }

  @Test
  public void findById_ThenReturnCustomer() {
    List<Customer> custsFound = rewardsDataService.getCustomerAll();
    Optional<Customer> custFound =
        custsFound.stream().filter(a -> a.getName().equals("veeren")).findAny();
    System.out.println("customer name found :: " + custFound.get().getName());
    assertThat(custFound.isPresent()).isEqualTo(true);
    assertThat(custFound.get().getName()).isEqualTo("veeren");

  }

}

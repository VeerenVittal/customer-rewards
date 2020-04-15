package com.service.rewards.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.rewards.model.Customer;

@RestController
@RequestMapping("customers")
public class RewardsController {

  @Autowired
  private RewardsDataService rewardsService;

  @GetMapping("/rewards")
  public List<Customer> findCustomerAll() {
    return rewardsService.getCustomerAll();
  }

  @GetMapping("/rewards/{id}")
  public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
    Customer customer = rewardsService.getCustomerById(id).get();
    if (customer == null)
      return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
    return new ResponseEntity<Customer>(customer, HttpStatus.OK);
  }

}

/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: BusinessCustomerEmailStrategy.java
 * Description: This class is responsible for generating an email message tailored to 
 * business customers.
 */

package edu.bu.met.cs665.implementations;

import edu.bu.met.cs665.interfaces.EmailStrategy;

/**
 * This is the BusinessCustomerEmailStrategy class.
 * It implements the EmailStrategy interface to generate a custom email message
 * specifically designed for business customers.
 */
public class BusinessCustomerEmailStrategy implements EmailStrategy {

  /**
   * Generates a custom email message tailored for business customers.
   *
   * @return A string representing the custom email message for business customers.
   */
  @Override
  public String generateEmailMessage() {
    // Implementation of the method to generate an email message for business customers.
    return "Dear Business Customer, we have special offers for you...";
  }

}

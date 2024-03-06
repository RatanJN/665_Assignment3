/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: NewCustomerEmailStrategy.java
 * Description: This class implements the EmailStrategy interface for generating personalized email
 * messages for new customers, aiming to welcome them and introduce them to the benefits and
 * services available.
 */

package edu.bu.met.cs665.implementations;

import edu.bu.met.cs665.interfaces.EmailStrategy;

/**
 * This is the NewCustomerEmailStrategy class. It focuses on generating welcoming email messages
 * tailored for new customers, helping to initiate a positive relationship and encourage their
 * engagement with the brand or service from the outset.
 */
public class NewCustomerEmailStrategy implements EmailStrategy {

  /**
   * Generates a personalized welcome email message for new customers.
   *
   * @return A string representing the custom email message designed to onboard new customers and
   *         introduce them to key services and offers.
   */
  @Override
  public String generateEmailMessage() {
    // Implementation placeholder for generating an email message tailored for new customers.
    // This should include a welcoming message and any initial offers or information beneficial
    // for new customers.
    return "Welcome aboard! As a new customer, here are some perks...";
  }

}

/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: FrequentCustomerEmailStrategy.java
 * Description: This class implements the EmailStrategy interface to generate personalized email
 * messages for frequent customers.
 */

package edu.bu.met.cs665.implementations;

import edu.bu.met.cs665.interfaces.EmailStrategy;

/**
 * This is the FrequentCustomerEmailStrategy class. It provides a specific implementation of the
 * EmailStrategy interface, aiming to create custom email messages that acknowledge and reward the
 * loyalty of frequent customers, enhancing their engagement and encouraging continued patronage.
 */
public class FrequentCustomerEmailStrategy implements EmailStrategy {

  /**
   * Generates a personalized email message for frequent customers.
   *
   * @return A string representing the custom email message designed to appreciate and incentivize
   *         the frequent customers.
   */
  @Override
  public String generateEmailMessage() {
    // Implementation of the method to generate an email message for frequent customers.
    return "Thank you for your continued trust in our services! Here's a special "
            + "offer just for you...";
  }

}

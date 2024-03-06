/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: ReturningCustomerEmailStrategy.java
 * Description: This class implements the EmailStrategy interface to
 * generate personalized email messages for returning customers.
 */

package edu.bu.met.cs665.implementations;

import edu.bu.met.cs665.interfaces.EmailStrategy;

/**
 * This is the ReturningCustomerEmailStrategy class.
 * It provides an implementation of the EmailStrategy interface, 
 * focusing on generating custom email messages that cater specifically 
 * to the needs and interests of returning customers, aiming to encourage
 * loyalty and repeat business.
 */
public class ReturningCustomerEmailStrategy implements EmailStrategy {

  /**
   * Generates a personalized email message for returning customers.
   *
   * @return A string representing the custom email message tailored to engage and retain
   *         returning customers.
   */
  @Override
  public String generateEmailMessage() {
    // Implementation of method to generate an email message for returning customers.
    return "Welcome back! We've missed you and here's what's new...";
  }

}

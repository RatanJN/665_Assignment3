/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: EmailStrategy.java
 * Description: This interface defines the strategy for generating email messages.
 */

package edu.bu.met.cs665.interfaces;

/**
 * The EmailStrategy interface.
 * This interface is responsible for defining the method that all email generation strategies 
 * must implement,ensuring a consistent approach to generating email messages for different
 * types of customers.
 */
public interface EmailStrategy {

  /**
   * Generates an email message.
   *
   * @return A string representing the generated email message.
   */
  String generateEmailMessage();
}

/**
 * Name: Ratan J Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: Main.java
 * Description: Demonstrates the Strategy pattern by generating personalized email messages
 * for different customer types. This class showcases the dynamic change of strategy at runtime.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.implementations.BusinessCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.FrequentCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.NewCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.ReturningCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.VipCustomerEmailStrategy;

/**
 * The Main class serves as the entry point of the application. It demonstrates the use of the
 * Strategy pattern through the ContextEmail class, by applying different strategies for
 * generating email messages tailored to various types of customers.
 */
public class Main {

  /**
     * The main method is the entry point of the program. It demonstrates switching between
     * different email generation strategies for different customer types and printing the
     * generated emails to the console.
     *
     * @param args Command line arguments (not used).
     */
  public static void main(String[] args) {
    // Initialize context with a strategy for Business customers.
    ContextEmail context = new ContextEmail(new BusinessCustomerEmailStrategy());
    System.out.println(context.generateEmail()); // Print Business customer email.

    // Change to Returning Customer strategy and print email.
    context.setStrategy(new ReturningCustomerEmailStrategy());
    System.out.println(context.generateEmail());

    // Switch to Frequent Customer strategy and print email.
    context.setStrategy(new FrequentCustomerEmailStrategy());
    System.out.println(context.generateEmail());

    // Change to New Customer strategy and print email.
    context.setStrategy(new NewCustomerEmailStrategy());
    System.out.println(context.generateEmail());

    // Finally, switch to VIP Customer strategy and print email.
    context.setStrategy(new VipCustomerEmailStrategy());
    System.out.println(context.generateEmail());
  }
}

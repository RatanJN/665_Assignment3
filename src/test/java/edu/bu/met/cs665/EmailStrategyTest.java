package edu.bu.met.cs665;


import edu.bu.met.cs665.implementations.BusinessCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.FrequentCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.NewCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.ReturningCustomerEmailStrategy;
import edu.bu.met.cs665.implementations.VipCustomerEmailStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Provides unit tests for the email generation strategies to verify correct behavior for
 * each type of customer.
 */
public class EmailStrategyTest {

  public EmailStrategyTest() {
  }

  /**
     * Test the email message generation for a business customer.
     */
  @Test
  public void testBusinessCustomerEmail() {
    ContextEmail context = new ContextEmail(new BusinessCustomerEmailStrategy());
    String emailMessage = context.generateEmail();
    Assert.assertEquals("Dear Business Customer, we have special offers for you...", emailMessage);
  }

  /**
     * Test the email message generation for a returning customer.
     */
  @Test
  public void testReturningCustomerEmail() {
    ContextEmail context = new ContextEmail(new ReturningCustomerEmailStrategy());
    String emailMessage = context.generateEmail();
    Assert.assertEquals("Welcome back! We've missed you and here's what's new...", emailMessage);
  }

  /**
     * Test the email message generation for a frequent customer.
     */
  @Test
  public void testFrequentCustomerEmail() {
    ContextEmail context = new ContextEmail(new FrequentCustomerEmailStrategy());
    String emailMessage = context.generateEmail();
    Assert.assertEquals("Thank you for your continued trust in our services! Here's a"
        + " special offer just for you...", emailMessage);
  }

  /**
     * Test the email message generation for a new customer.
     */
  @Test
  public void testNewCustomerEmail() {
    ContextEmail context = new ContextEmail(new NewCustomerEmailStrategy());
    String emailMessage = context.generateEmail();
    Assert.assertEquals("Welcome aboard! As a new customer, here are some perks...", emailMessage);
  }

  /**
     * Test the email message generation for a VIP customer.
     */
  @Test
  public void testVipCustomerEmail() {
    ContextEmail context = new ContextEmail(new VipCustomerEmailStrategy());
    String emailMessage = context.generateEmail();
    Assert.assertEquals("Howdy VIP Customer, enjoy your exclusive benefits...", emailMessage);
  }
}

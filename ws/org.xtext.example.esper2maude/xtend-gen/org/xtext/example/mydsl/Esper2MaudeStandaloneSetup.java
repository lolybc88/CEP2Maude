/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.Esper2MaudeStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class Esper2MaudeStandaloneSetup extends Esper2MaudeStandaloneSetupGenerated {
  public static void doSetup() {
    Esper2MaudeStandaloneSetup _esper2MaudeStandaloneSetup = new Esper2MaudeStandaloneSetup();
    _esper2MaudeStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
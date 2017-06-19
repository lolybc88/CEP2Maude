/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.esper2maude.ui.internal.Esper2maudeActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Esper2MaudeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Esper2maudeActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Esper2maudeActivator.getInstance().getInjector(Esper2maudeActivator.ORG_XTEXT_EXAMPLE_MYDSL_ESPER2MAUDE);
	}
	
}
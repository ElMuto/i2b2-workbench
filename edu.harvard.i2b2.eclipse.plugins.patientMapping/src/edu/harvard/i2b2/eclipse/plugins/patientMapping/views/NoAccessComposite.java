/*
 * Copyright (c) 2006-2012 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v2.1 
 * which accompanies this distribution. 
 * 
 * Contributors: 
 *   
 *     Wensong Pan
 *     
 */

package edu.harvard.i2b2.eclipse.plugins.patientMapping.views;

//import com.cloudgarden.resource.SWTResourceManager;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JRootPane;
import javax.swing.UIManager;

import edu.harvard.i2b2.patientMapping.ui.MainComposite;
import edu.harvard.i2b2.patientMapping.ui.PatientMappingJPanel;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.PlatformUI;

public class NoAccessComposite extends org.eclipse.swt.widgets.Composite {

	{
		// Register as a resource user - SWTResourceManager will
		// handle the obtaining and disposing of resources
		// SWTResourceManager.registerResourceUser(this);
	}

	private Label messageLabel;
	private Button displayButton;
	private java.awt.Container oAwtContainer;
	private PatientMappingJPanel runTreePanel;

	/**
	 * Auto-generated main method to display this
	 * org.eclipse.swt.widgets.Composite inside a new Shell.
	 */
	public static void main(String[] args) {
		showGUI();
	}

	/**
	 * Auto-generated method to display this org.eclipse.swt.widgets.Composite
	 * inside a new Shell.
	 */
	public static void showGUI() {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		NoAccessComposite inst = new NoAccessComposite(shell, SWT.NULL);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.layout();
		if (size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

	public NoAccessComposite(org.eclipse.swt.widgets.Composite parent, int style) {
		super(parent, style);
		initGUI();
	}

	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout();
			thisLayout.makeColumnsEqualWidth = true;
			this.setLayout(thisLayout);
			this.setSize(484, 237);
			// this.setBackground(SWTResourceManager.getColor(255, 255, 255));
			{
				messageLabel = new Label(this, SWT.NONE);
				GridData messageLabelLData = new GridData();
				messageLabelLData.grabExcessHorizontalSpace = true;
				messageLabelLData.widthHint = 435;
				messageLabelLData.heightHint = 40;
				messageLabelLData.horizontalAlignment = GridData.CENTER;
				messageLabelLData.verticalIndent = 10;
				messageLabelLData.grabExcessVerticalSpace = true;
				messageLabel.setLayoutData(messageLabelLData);
				messageLabel
						.setText("You don't have all the required privileges to display this view.");
				messageLabel.setAlignment(SWT.CENTER);
				// messageLabel.setBackground(SWTResourceManager.getColor(255,
				// 255, 255));
			}
			{
				displayButton = new Button(this, SWT.PUSH | SWT.CENTER);
				GridData displayButtonLData = new GridData();
				displayButtonLData.horizontalAlignment = GridData.END;
				displayButtonLData.verticalIndent = 10;
				displayButtonLData.grabExcessHorizontalSpace = true;
				displayButtonLData.grabExcessVerticalSpace = true;
				displayButton.setLayoutData(displayButtonLData);
				displayButton.setText("Display Anyway");
				displayButton.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent evt) {
						displayButtonWidgetSelected(evt);
					}
				});
			}
			this.layout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void displayButtonWidgetSelected(SelectionEvent evt) {
		final Composite me = this;
		getParent().getDisplay().syncExec(new Runnable() {
			public void run() {
				Control[] controls = getChildren();
				for (int i = 0; i < controls.length; i++) {
					controls[i].setVisible(false);
					controls[i].dispose();
				}

				me.setLayout(new FillLayout());
				//MainComposite explorer = new MainComposite(me, false);
				// explorer.setVisible(true);
				// me.setVisible(true);
				Composite composite = new Composite(me, SWT.EMBEDDED);

				/* Create and setting up frame */
				////for mac fix
				//if ( System.getProperty("os.name").toLowerCase().startsWith("mac"))
					//SWT_AWT.embeddedFrameClass = "sun.lwawt.macosx.CViewEmbeddedFrame";
				Frame runFrame = SWT_AWT.new_Frame(composite);
				Panel runPanel = new Panel(new BorderLayout());
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					System.out.println("Error setting native LAF: " + e);
				}

				runFrame.add(runPanel);
				JRootPane runRoot = new JRootPane();
				runPanel.add(runRoot);
				oAwtContainer = runRoot.getContentPane();

				runTreePanel = new PatientMappingJPanel(oAwtContainer);//PreviousQueryPanel(this);
				//runTreePanel.setBackground(Color.BLUE);

				oAwtContainer.add(runTreePanel);
				
				me.layout();
				// getParent().redraw();

				// Setup help context
				// PlatformUI.getWorkbench().getHelpSystem().setHelp(getParent(),
				// TIMELINE_VIEW_CONTEXT_ID);
				// getParent().addHelpButtonToToolBar();
			}
		});

	}

}

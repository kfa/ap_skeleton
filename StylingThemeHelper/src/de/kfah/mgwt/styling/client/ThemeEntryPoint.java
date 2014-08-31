/*
 * Copyright 2014 Katharina Fahnenbruck
 */
package de.kfah.mgwt.styling.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.widget.input.slider.Slider;

public class ThemeEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    MGWT.applySettings(MGWTSettings.getAppSetting());
    FlowPanel flowPanel = new FlowPanel();
    flowPanel.getElement().getStyle().setMargin(10, Unit.PX);
    flowPanel.add(new Slider());
    RootPanel.get().add(flowPanel);
  }
}

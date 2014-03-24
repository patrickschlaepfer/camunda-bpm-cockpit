package com.schlaepfer.bpm.cockpit.plugin.deleteprocess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.camunda.bpm.cockpit.plugin.spi.impl.AbstractCockpitPlugin;

import com.schlaepfer.bpm.cockpit.plugin.deleteprocess.resources.DeleteProcessPluginRootResource;

public class DeleteProcessPlugin extends AbstractCockpitPlugin {

    public static final String ID = "delete-process-plugin";

    public String getId() {
      return ID;
    }

    @Override
    public Set<Class<?>> getResourceClasses() {
      Set<Class<?>> classes = new HashSet<Class<?>>();

      classes.add(DeleteProcessPluginRootResource.class);

      return classes;
    }

    @Override
    public List<String> getMappingFiles() {
      return Arrays.asList("com/schlaepfer/bpm/cockpit/plugin/queries/deleteprocess.xml");
    }
  }
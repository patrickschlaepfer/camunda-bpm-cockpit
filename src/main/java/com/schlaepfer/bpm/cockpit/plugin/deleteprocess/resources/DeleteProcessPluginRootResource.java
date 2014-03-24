package com.schlaepfer.bpm.cockpit.plugin.deleteprocess.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.camunda.bpm.cockpit.plugin.resource.AbstractPluginRootResource;

import com.schlaepfer.bpm.cockpit.plugin.deleteprocess.DeleteProcessPlugin;

@Path("plugin/" + DeleteProcessPlugin.ID)
public class DeleteProcessPluginRootResource extends AbstractPluginRootResource {

    public DeleteProcessPluginRootResource() {
      super(DeleteProcessPlugin.ID);
    }

    @Path("{engineName}/process-instance")
    public ProcessInstanceResource getProcessInstanceResource(@PathParam("engineName") String engineName) {
      return subResource(new ProcessInstanceResource(engineName), engineName);
    }
  }
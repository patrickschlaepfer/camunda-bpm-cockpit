package com.schlaepfer.bpm.cockpit.plugin.deleteprocess.resources;

import java.util.List;

import javax.ws.rs.GET;

import org.camunda.bpm.cockpit.db.QueryParameters;
import org.camunda.bpm.cockpit.plugin.resource.AbstractPluginResource;

import com.schlaepfer.bpm.cockpit.plugin.deleteprocess.db.ProcessInstanceCountDto;

public class ProcessInstanceResource  extends AbstractPluginResource {

    public ProcessInstanceResource(String engineName) {
      super(engineName);
    }

    @GET
    public List<ProcessInstanceCountDto> getProcessInstanceCounts() {

      return getQueryService()
          .executeQuery(
            "cockpit.sample.selectProcessInstanceCountsByProcessDefinition",
            new QueryParameters<ProcessInstanceCountDto>());
    }
  }

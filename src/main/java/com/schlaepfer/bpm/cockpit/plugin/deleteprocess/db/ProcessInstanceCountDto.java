package com.schlaepfer.bpm.cockpit.plugin.deleteprocess.db;

public class ProcessInstanceCountDto {
    
    private String key;

    private int instanceCount;

    public String getKey() {
      return key;
    }

    public void setKey(String key) {
      this.key = key;
    }

    public int getInstanceCount() {
      return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
      this.instanceCount = instanceCount;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Instance} extends {@link TeaModel}
 *
 * <p>Instance</p>
 */
public class Instance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentAmount")
    private Float currentAmount;

    @com.aliyun.core.annotation.NameInMap("ExternalIP")
    private String externalIP;

    @com.aliyun.core.annotation.NameInMap("ExternalInstancePort")
    private Integer externalInstancePort;

    @com.aliyun.core.annotation.NameInMap("HostIP")
    private String hostIP;

    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.NameInMap("InnerIP")
    private String innerIP;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstancePort")
    private Integer instancePort;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("IsSpot")
    private Boolean isSpot;

    @com.aliyun.core.annotation.NameInMap("Isolated")
    private Boolean isolated;

    @com.aliyun.core.annotation.NameInMap("LastState")
    private java.util.List<java.util.Map<String, ?>> lastState;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("OriginalAmount")
    private Float originalAmount;

    @com.aliyun.core.annotation.NameInMap("ReadyProcesses")
    private Integer readyProcesses;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("RestartCount")
    private Integer restartCount;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("StartAt")
    @Deprecated
    private String startAt;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TenantHostIP")
    private String tenantHostIP;

    @com.aliyun.core.annotation.NameInMap("TenantInstanceIP")
    private String tenantInstanceIP;

    @com.aliyun.core.annotation.NameInMap("TotalProcesses")
    private Integer totalProcesses;

    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private Instance(Builder builder) {
        this.currentAmount = builder.currentAmount;
        this.externalIP = builder.externalIP;
        this.externalInstancePort = builder.externalInstancePort;
        this.hostIP = builder.hostIP;
        this.hostName = builder.hostName;
        this.innerIP = builder.innerIP;
        this.instanceName = builder.instanceName;
        this.instancePort = builder.instancePort;
        this.instanceType = builder.instanceType;
        this.isSpot = builder.isSpot;
        this.isolated = builder.isolated;
        this.lastState = builder.lastState;
        this.namespace = builder.namespace;
        this.originalAmount = builder.originalAmount;
        this.readyProcesses = builder.readyProcesses;
        this.reason = builder.reason;
        this.resourceType = builder.resourceType;
        this.restartCount = builder.restartCount;
        this.role = builder.role;
        this.startAt = builder.startAt;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tenantHostIP = builder.tenantHostIP;
        this.tenantInstanceIP = builder.tenantInstanceIP;
        this.totalProcesses = builder.totalProcesses;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Instance create() {
        return builder().build();
    }

    /**
     * @return currentAmount
     */
    public Float getCurrentAmount() {
        return this.currentAmount;
    }

    /**
     * @return externalIP
     */
    public String getExternalIP() {
        return this.externalIP;
    }

    /**
     * @return externalInstancePort
     */
    public Integer getExternalInstancePort() {
        return this.externalInstancePort;
    }

    /**
     * @return hostIP
     */
    public String getHostIP() {
        return this.hostIP;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return innerIP
     */
    public String getInnerIP() {
        return this.innerIP;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instancePort
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isSpot
     */
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    /**
     * @return isolated
     */
    public Boolean getIsolated() {
        return this.isolated;
    }

    /**
     * @return lastState
     */
    public java.util.List<java.util.Map<String, ?>> getLastState() {
        return this.lastState;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return originalAmount
     */
    public Float getOriginalAmount() {
        return this.originalAmount;
    }

    /**
     * @return readyProcesses
     */
    public Integer getReadyProcesses() {
        return this.readyProcesses;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return restartCount
     */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return startAt
     */
    public String getStartAt() {
        return this.startAt;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantHostIP
     */
    public String getTenantHostIP() {
        return this.tenantHostIP;
    }

    /**
     * @return tenantInstanceIP
     */
    public String getTenantInstanceIP() {
        return this.tenantInstanceIP;
    }

    /**
     * @return totalProcesses
     */
    public Integer getTotalProcesses() {
        return this.totalProcesses;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder {
        private Float currentAmount; 
        private String externalIP; 
        private Integer externalInstancePort; 
        private String hostIP; 
        private String hostName; 
        private String innerIP; 
        private String instanceName; 
        private Integer instancePort; 
        private String instanceType; 
        private Boolean isSpot; 
        private Boolean isolated; 
        private java.util.List<java.util.Map<String, ?>> lastState; 
        private String namespace; 
        private Float originalAmount; 
        private Integer readyProcesses; 
        private String reason; 
        private String resourceType; 
        private Integer restartCount; 
        private String role; 
        private String startAt; 
        private String startTime; 
        private String status; 
        private String tenantHostIP; 
        private String tenantInstanceIP; 
        private Integer totalProcesses; 
        private String zone; 

        /**
         * CurrentAmount.
         */
        public Builder currentAmount(Float currentAmount) {
            this.currentAmount = currentAmount;
            return this;
        }

        /**
         * ExternalIP.
         */
        public Builder externalIP(String externalIP) {
            this.externalIP = externalIP;
            return this;
        }

        /**
         * ExternalInstancePort.
         */
        public Builder externalInstancePort(Integer externalInstancePort) {
            this.externalInstancePort = externalInstancePort;
            return this;
        }

        /**
         * HostIP.
         */
        public Builder hostIP(String hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * InnerIP.
         */
        public Builder innerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstancePort.
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsSpot.
         */
        public Builder isSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }

        /**
         * Isolated.
         */
        public Builder isolated(Boolean isolated) {
            this.isolated = isolated;
            return this;
        }

        /**
         * LastState.
         */
        public Builder lastState(java.util.List<java.util.Map<String, ?>> lastState) {
            this.lastState = lastState;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * OriginalAmount.
         */
        public Builder originalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * ReadyProcesses.
         */
        public Builder readyProcesses(Integer readyProcesses) {
            this.readyProcesses = readyProcesses;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RestartCount.
         */
        public Builder restartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * StartAt.
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TenantHostIP.
         */
        public Builder tenantHostIP(String tenantHostIP) {
            this.tenantHostIP = tenantHostIP;
            return this;
        }

        /**
         * TenantInstanceIP.
         */
        public Builder tenantInstanceIP(String tenantInstanceIP) {
            this.tenantInstanceIP = tenantInstanceIP;
            return this;
        }

        /**
         * TotalProcesses.
         */
        public Builder totalProcesses(Integer totalProcesses) {
            this.totalProcesses = totalProcesses;
            return this;
        }

        /**
         * Zone.
         */
        public Builder zone(String zone) {
            this.zone = zone;
            return this;
        }

        public Instance build() {
            return new Instance(this);
        } 

    } 

}

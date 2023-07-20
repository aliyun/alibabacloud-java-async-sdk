// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Instance} extends {@link TeaModel}
 *
 * <p>Instance</p>
 */
public class Instance extends TeaModel {
    @NameInMap("CurrentAmount")
    private Float currentAmount;

    @NameInMap("HostIP")
    private String hostIP;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("InnerIP")
    private String innerIP;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstancePort")
    private Integer instancePort;

    @NameInMap("IsSpot")
    private Boolean isSpot;

    @NameInMap("LastState")
    private java.util.List < java.util.Map<String, ?>> lastState;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("OriginalAmount")
    private Float originalAmount;

    @NameInMap("ReadyProcesses")
    private Integer readyProcesses;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("RestartCount")
    private Integer restartCount;

    @NameInMap("Role")
    private String role;

    @NameInMap("StartAt")
    private String startAt;

    @NameInMap("Status")
    private String status;

    @NameInMap("TenantHostIP")
    private String tenantHostIP;

    @NameInMap("TenantInstanceIP")
    private String tenantInstanceIP;

    @NameInMap("TotalProcesses")
    private Integer totalProcesses;

    private Instance(Builder builder) {
        this.currentAmount = builder.currentAmount;
        this.hostIP = builder.hostIP;
        this.hostName = builder.hostName;
        this.innerIP = builder.innerIP;
        this.instanceName = builder.instanceName;
        this.instancePort = builder.instancePort;
        this.isSpot = builder.isSpot;
        this.lastState = builder.lastState;
        this.namespace = builder.namespace;
        this.originalAmount = builder.originalAmount;
        this.readyProcesses = builder.readyProcesses;
        this.reason = builder.reason;
        this.resourceType = builder.resourceType;
        this.restartCount = builder.restartCount;
        this.role = builder.role;
        this.startAt = builder.startAt;
        this.status = builder.status;
        this.tenantHostIP = builder.tenantHostIP;
        this.tenantInstanceIP = builder.tenantInstanceIP;
        this.totalProcesses = builder.totalProcesses;
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
     * @return isSpot
     */
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    /**
     * @return lastState
     */
    public java.util.List < java.util.Map<String, ?>> getLastState() {
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

    public static final class Builder {
        private Float currentAmount; 
        private String hostIP; 
        private String hostName; 
        private String innerIP; 
        private String instanceName; 
        private Integer instancePort; 
        private Boolean isSpot; 
        private java.util.List < java.util.Map<String, ?>> lastState; 
        private String namespace; 
        private Float originalAmount; 
        private Integer readyProcesses; 
        private String reason; 
        private String resourceType; 
        private Integer restartCount; 
        private String role; 
        private String startAt; 
        private String status; 
        private String tenantHostIP; 
        private String tenantInstanceIP; 
        private Integer totalProcesses; 

        /**
         * CurrentAmount.
         */
        public Builder currentAmount(Float currentAmount) {
            this.currentAmount = currentAmount;
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
         * IsSpot.
         */
        public Builder isSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }

        /**
         * LastState.
         */
        public Builder lastState(java.util.List < java.util.Map<String, ?>> lastState) {
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

        public Instance build() {
            return new Instance(this);
        } 

    } 

}

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
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CurrentAmount")
    private Float currentAmount;

    @com.aliyun.core.annotation.NameInMap("Detached")
    private Boolean detached;

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

    @com.aliyun.core.annotation.NameInMap("IsLatest")
    private Boolean isLatest;

    @com.aliyun.core.annotation.NameInMap("IsReplica")
    private Boolean isReplica;

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

    @com.aliyun.core.annotation.NameInMap("ReplicaName")
    private String replicaName;

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
        this.createTime = builder.createTime;
        this.currentAmount = builder.currentAmount;
        this.detached = builder.detached;
        this.externalIP = builder.externalIP;
        this.externalInstancePort = builder.externalInstancePort;
        this.hostIP = builder.hostIP;
        this.hostName = builder.hostName;
        this.innerIP = builder.innerIP;
        this.instanceName = builder.instanceName;
        this.instancePort = builder.instancePort;
        this.instanceType = builder.instanceType;
        this.isLatest = builder.isLatest;
        this.isReplica = builder.isReplica;
        this.isSpot = builder.isSpot;
        this.isolated = builder.isolated;
        this.lastState = builder.lastState;
        this.namespace = builder.namespace;
        this.originalAmount = builder.originalAmount;
        this.readyProcesses = builder.readyProcesses;
        this.reason = builder.reason;
        this.replicaName = builder.replicaName;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return currentAmount
     */
    public Float getCurrentAmount() {
        return this.currentAmount;
    }

    /**
     * @return detached
     */
    public Boolean getDetached() {
        return this.detached;
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
     * @return isLatest
     */
    public Boolean getIsLatest() {
        return this.isLatest;
    }

    /**
     * @return isReplica
     */
    public Boolean getIsReplica() {
        return this.isReplica;
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
     * @return replicaName
     */
    public String getReplicaName() {
        return this.replicaName;
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
        private String createTime; 
        private Float currentAmount; 
        private Boolean detached; 
        private String externalIP; 
        private Integer externalInstancePort; 
        private String hostIP; 
        private String hostName; 
        private String innerIP; 
        private String instanceName; 
        private Integer instancePort; 
        private String instanceType; 
        private Boolean isLatest; 
        private Boolean isReplica; 
        private Boolean isSpot; 
        private Boolean isolated; 
        private java.util.List<java.util.Map<String, ?>> lastState; 
        private String namespace; 
        private Float originalAmount; 
        private Integer readyProcesses; 
        private String reason; 
        private String replicaName; 
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

        private Builder() {
        } 

        private Builder(Instance model) {
            this.createTime = model.createTime;
            this.currentAmount = model.currentAmount;
            this.detached = model.detached;
            this.externalIP = model.externalIP;
            this.externalInstancePort = model.externalInstancePort;
            this.hostIP = model.hostIP;
            this.hostName = model.hostName;
            this.innerIP = model.innerIP;
            this.instanceName = model.instanceName;
            this.instancePort = model.instancePort;
            this.instanceType = model.instanceType;
            this.isLatest = model.isLatest;
            this.isReplica = model.isReplica;
            this.isSpot = model.isSpot;
            this.isolated = model.isolated;
            this.lastState = model.lastState;
            this.namespace = model.namespace;
            this.originalAmount = model.originalAmount;
            this.readyProcesses = model.readyProcesses;
            this.reason = model.reason;
            this.replicaName = model.replicaName;
            this.resourceType = model.resourceType;
            this.restartCount = model.restartCount;
            this.role = model.role;
            this.startAt = model.startAt;
            this.startTime = model.startTime;
            this.status = model.status;
            this.tenantHostIP = model.tenantHostIP;
            this.tenantInstanceIP = model.tenantInstanceIP;
            this.totalProcesses = model.totalProcesses;
            this.zone = model.zone;
        } 

        /**
         * <p>The creation time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T09:46:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The current hourly price of the spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.444</p>
         */
        public Builder currentAmount(Float currentAmount) {
            this.currentAmount = currentAmount;
            return this;
        }

        /**
         * <p>Indicates whether the instance is removed from active service rotation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder detached(Boolean detached) {
            this.detached = detached;
            return this;
        }

        /**
         * <p>The IP address of the instance in your VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.100</p>
         */
        public Builder externalIP(String externalIP) {
            this.externalIP = externalIP;
            return this;
        }

        /**
         * <p>The port number of the instance in your VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder externalInstancePort(Integer externalInstancePort) {
            this.externalInstancePort = externalInstancePort;
            return this;
        }

        /**
         * <p>The IP address of the instance\&quot;s host.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0.XX.XX</p>
         */
        public Builder hostIP(String hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        /**
         * <p>The name of the instance\&quot;s host.</p>
         * 
         * <strong>example:</strong>
         * <p>smart-scene-cls-854dbdc99d-****</p>
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The internal IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.17.0.17</p>
         */
        public Builder innerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>foo-5fc8946767-v****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The network port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Indicates whether the instance is running the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * <p>Indicates whether the instance is a replica.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isReplica(Boolean isReplica) {
            this.isReplica = isReplica;
            return this;
        }

        /**
         * <p>Indicates whether the instance is a spot instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }

        /**
         * <p>Indicates whether the instance accepts traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isolated(Boolean isolated) {
            this.isolated = isolated;
            return this;
        }

        /**
         * <p>The status of the instance when it last exited.</p>
         */
        public Builder lastState(java.util.List<java.util.Map<String, ?>> lastState) {
            this.lastState = lastState;
            return this;
        }

        /**
         * <p>The namespace of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The original price of the spot instance before discounts.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2</p>
         */
        public Builder originalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * <p>The number of processes that have started in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readyProcesses(Integer readyProcesses) {
            this.readyProcesses = readyProcesses;
            return this;
        }

        /**
         * <p>The identifier for the current status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The name of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>xwq-sglang-dist-7dff0</p>
         */
        public Builder replicaName(String replicaName) {
            this.replicaName = replicaName;
            return this;
        }

        /**
         * <p>The type of the resource group to which the instance belongs. Valid values include PublicResource and PrivateResource.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicResource</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The number of times the instance has been restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder restartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        /**
         * <p>The server role of the instance. Valid values include Queue, DataLoader, and Standard.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The start time of the instance. (Deprecated. Use StartTime instead.)</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T09:46:05Z</p>
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * <p>The start time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T09:46:05Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The IP address of the host in the dedicated network.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        public Builder tenantHostIP(String tenantHostIP) {
            this.tenantHostIP = tenantHostIP;
            return this;
        }

        /**
         * <p>The IP address of the instance in the dedicated network.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        public Builder tenantInstanceIP(String tenantInstanceIP) {
            this.tenantInstanceIP = tenantInstanceIP;
            return this;
        }

        /**
         * <p>The total number of processes for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalProcesses(Integer totalProcesses) {
            this.totalProcesses = totalProcesses;
            return this;
        }

        /**
         * <p>The zone where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-a</p>
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

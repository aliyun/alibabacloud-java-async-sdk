// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAttributeResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instances instances; 
        private String requestId; 

        /**
         * Details of the instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DBInstanceAttribute extends TeaModel {
        @NameInMap("ArchitectureType")
        private String architectureType;

        @NameInMap("AuditLogRetention")
        private String auditLogRetention;

        @NameInMap("AvailabilityValue")
        private String availabilityValue;

        @NameInMap("BackupLogStartTime")
        private String backupLogStartTime;

        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CloudType")
        private String cloudType;

        @NameInMap("Config")
        private String config;

        @NameInMap("ConnectionDomain")
        private String connectionDomain;

        @NameInMap("Connections")
        private Long connections;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @NameInMap("HasRenewChangeOrder")
        private String hasRenewChangeOrder;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceReleaseProtection")
        private Boolean instanceReleaseProtection;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IsOrderCompleted")
        private Boolean isOrderCompleted;

        @NameInMap("IsRds")
        private Boolean isRds;

        @NameInMap("IsSupportTDE")
        private Boolean isSupportTDE;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("Port")
        private Long port;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("QPS")
        private Long QPS;

        @NameInMap("ReadOnlyCount")
        private Integer readOnlyCount;

        @NameInMap("RealInstanceClass")
        private String realInstanceClass;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReplicaId")
        private String replicaId;

        @NameInMap("ReplicationMode")
        private String replicationMode;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("ShardCount")
        private Integer shardCount;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcAuthMode")
        private String vpcAuthMode;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneType")
        private String zoneType;

        private DBInstanceAttribute(Builder builder) {
            this.architectureType = builder.architectureType;
            this.auditLogRetention = builder.auditLogRetention;
            this.availabilityValue = builder.availabilityValue;
            this.backupLogStartTime = builder.backupLogStartTime;
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.cloudType = builder.cloudType;
            this.config = builder.config;
            this.connectionDomain = builder.connectionDomain;
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.globalInstanceId = builder.globalInstanceId;
            this.hasRenewChangeOrder = builder.hasRenewChangeOrder;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceReleaseProtection = builder.instanceReleaseProtection;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.isOrderCompleted = builder.isOrderCompleted;
            this.isRds = builder.isRds;
            this.isSupportTDE = builder.isSupportTDE;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.networkType = builder.networkType;
            this.nodeType = builder.nodeType;
            this.packageType = builder.packageType;
            this.port = builder.port;
            this.privateIp = builder.privateIp;
            this.QPS = builder.QPS;
            this.readOnlyCount = builder.readOnlyCount;
            this.realInstanceClass = builder.realInstanceClass;
            this.regionId = builder.regionId;
            this.replicaId = builder.replicaId;
            this.replicationMode = builder.replicationMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.securityIPList = builder.securityIPList;
            this.shardCount = builder.shardCount;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcAuthMode = builder.vpcAuthMode;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
        }

        /**
         * @return auditLogRetention
         */
        public String getAuditLogRetention() {
            return this.auditLogRetention;
        }

        /**
         * @return availabilityValue
         */
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        /**
         * @return backupLogStartTime
         */
        public String getBackupLogStartTime() {
            return this.backupLogStartTime;
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cloudType
         */
        public String getCloudType() {
            return this.cloudType;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return connectionDomain
         */
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return hasRenewChangeOrder
         */
        public String getHasRenewChangeOrder() {
            return this.hasRenewChangeOrder;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceReleaseProtection
         */
        public Boolean getInstanceReleaseProtection() {
            return this.instanceReleaseProtection;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isOrderCompleted
         */
        public Boolean getIsOrderCompleted() {
            return this.isOrderCompleted;
        }

        /**
         * @return isRds
         */
        public Boolean getIsRds() {
            return this.isRds;
        }

        /**
         * @return isSupportTDE
         */
        public Boolean getIsSupportTDE() {
            return this.isSupportTDE;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return QPS
         */
        public Long getQPS() {
            return this.QPS;
        }

        /**
         * @return readOnlyCount
         */
        public Integer getReadOnlyCount() {
            return this.readOnlyCount;
        }

        /**
         * @return realInstanceClass
         */
        public String getRealInstanceClass() {
            return this.realInstanceClass;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicaId
         */
        public String getReplicaId() {
            return this.replicaId;
        }

        /**
         * @return replicationMode
         */
        public String getReplicationMode() {
            return this.replicationMode;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondaryZoneId
         */
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return shardCount
         */
        public Integer getShardCount() {
            return this.shardCount;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcAuthMode
         */
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private String architectureType; 
            private String auditLogRetention; 
            private String availabilityValue; 
            private String backupLogStartTime; 
            private Long bandwidth; 
            private Long capacity; 
            private String chargeType; 
            private String cloudType; 
            private String config; 
            private String connectionDomain; 
            private Long connections; 
            private String createTime; 
            private String endTime; 
            private String engine; 
            private String engineVersion; 
            private String globalInstanceId; 
            private String hasRenewChangeOrder; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private Boolean instanceReleaseProtection; 
            private String instanceStatus; 
            private String instanceType; 
            private Boolean isOrderCompleted; 
            private Boolean isRds; 
            private Boolean isSupportTDE; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String networkType; 
            private String nodeType; 
            private String packageType; 
            private Long port; 
            private String privateIp; 
            private Long QPS; 
            private Integer readOnlyCount; 
            private String realInstanceClass; 
            private String regionId; 
            private String replicaId; 
            private String replicationMode; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private String securityIPList; 
            private Integer shardCount; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcAuthMode; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 
            private String zoneType; 

            /**
             * The architecture of the instance. Valid values:
             * <p>
             * 
             * *   **cluster**: cluster architecture
             * *   **standard**: standard architecture
             * *   **rwsplit**: read/write splitting architecture
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * The retention period of audit logs. Unit: days. A value of 0 indicates that the audit log feature is disabled. For more information about how to enable the audit log feature, see [Enable the new audit log feature](~~102015~~).
             */
            public Builder auditLogRetention(String auditLogRetention) {
                this.auditLogRetention = auditLogRetention;
                return this;
            }

            /**
             * The availability metric of the current month.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * The earliest point in time to which you can restore data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * > 
             * 
             * *   This parameter is returned only when the data flashback feature is enabled for the instance. For more information, see [Use data flashback to restore data by point in time](~~148479~~).
             * 
             * *   When you call the [RestoreInstance](~~61083~~) operation to implement data flashback, you can obtain the earliest point in time for data flashback from the return value of this parameter and set the **RestoreTime** parameter to this point in time.
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * The bandwidth of the instance. Unit: Mbit/s.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The storage capacity of the instance. Unit: MB.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * This parameter is returned only when the instance is in a cloud box.
             */
            public Builder cloudType(String cloudType) {
                this.cloudType = cloudType;
                return this;
            }

            /**
             * The parameter settings of the instance in the JSON format. For more information, see [Modify the parameters of an ApsaraDB for Redis instance](~~43885~~).
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The internal endpoint of the instance.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * The maximum number of connections supported by the instance.
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the subscription instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The database engine of the instance. The return value is **Redis**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance. Valid values: **2.8**, **4.0**, **5.0**, and **6.0**.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The ID of the distributed instance to which the instance belongs.
             * <p>
             * 
             * > This parameter is returned only when the instance is a child instance of a distributed instance.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:
             * <p>
             * 
             * *   **true**: Your Alibaba Cloud account has pending orders.
             * *   **false**: Your Alibaba Cloud account does not have pending orders.
             */
            public Builder hasRenewChangeOrder(String hasRenewChangeOrder) {
                this.hasRenewChangeOrder = hasRenewChangeOrder;
                return this;
            }

            /**
             * The instance type of the instance. For more information, see [Instance types](~~107984~~).
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the release protection feature is enabled for the instance. Valid values:
             * <p>
             * 
             * *   **true**: Release protection is enabled.
             * *   **false**: Release protection is disabled.
             */
            public Builder instanceReleaseProtection(Boolean instanceReleaseProtection) {
                this.instanceReleaseProtection = instanceReleaseProtection;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * *   **Normal**: The instance is normal.
             * *   **Creating**: The instance is being created.
             * *   **Changing**: The configurations of the instance are being changed.
             * *   **Inactive**: The instance is disabled.
             * *   **Flushing**: The instance is being released.
             * *   **Released**: The instance is released.
             * *   **Transforming**: The billing method of the instance is being changed.
             * *   **Unavailable**: The instance is suspended.
             * *   **Error**: The instance failed to be created.
             * *   **Migrating**: The instance is being migrated.
             * *   **BackupRecovering**: The instance is being restored from a backup.
             * *   **MinorVersionUpgrading**: The minor version of the instance is being updated.
             * *   **NetworkModifying**: The network type of the instance is being changed.
             * *   **SSLModifying**: The SSL certificate of the instance is being changed.
             * *   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.
             * 
             * > For more information about instance states, see [Instance states and impacts](~~200740~~).
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The database engine of the instance. Valid values:
             * <p>
             * 
             * *   **Tair**
             * *   **Redis**
             * *   **Memcache**
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Whether the instance order has been completed is used to determine whether the modify instance specifications order has reached its final state. The return value is:
             * <p>
             * 
             * * **true**: The modify instance specifications operation has been completed or has not been made.
             * 
             * * **false**: Changing specifications, the order is not yet completed.
             */
            public Builder isOrderCompleted(Boolean isOrderCompleted) {
                this.isOrderCompleted = isOrderCompleted;
                return this;
            }

            /**
             * Indicates whether the instance is managed by ApsaraDB RDS. Valid values:
             * <p>
             * 
             * *   **true**: The instance is managed by ApsaraDB RDS.
             * *   **false**: The instance is not managed by ApsaraDB RDS.
             */
            public Builder isRds(Boolean isRds) {
                this.isRds = isRds;
                return this;
            }

            /**
             * Does the instance support enabling transparent data encryption (TDE) function? Return value:
             * <p>
             * 
             * * **true**: Supported, only supported for local disk, memory type Tair instance version. 
             * * **false**: Not Supported.
             */
            public Builder isSupportTDE(Boolean isSupportTDE) {
                this.isSupportTDE = isSupportTDE;
                return this;
            }

            /**
             * The end time of the maintenance window. The time is in the *HH:mmZ* format. The time is displayed in UTC.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * The start time of the maintenance window. The time is in the *HH:mmZ* format. The time is displayed in UTC.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **CLASSIC**: classic network
             * *   **VPC**: VPC
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **double**: The instance contains a master node and a replica node.
             * *   **single**: The instance contains only a master node. This node type is phrased out.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The plan type of the instance. Valid values:
             * <p>
             * 
             * *   **standard**: standard plan.
             * *   **customized**: custom plan. This plan type is phased out.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The port number of the instance.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The private IP address of the instance.
             * <p>
             * 
             * > This parameter is not returned when the instance is deployed in the classic network.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * The expected maximum queries per second (QPS).
             */
            public Builder QPS(Long QPS) {
                this.QPS = QPS;
                return this;
            }

            /**
             * The number of read-only nodes. This parameter is available only for read/write splitting instances that use cloud disks.
             */
            public Builder readOnlyCount(Integer readOnlyCount) {
                this.readOnlyCount = readOnlyCount;
                return this;
            }

            /**
             * If the instance is a cluster instance that uses cloud disks, this parameter indicates the instance type of each shard. In this case, the InstanceClass parameter indicates a virtual instance type.
             * <p>
             * 
             * > To query the costs of this instance type, specify the returned instance type for this parameter for the [DescribePrice](~~95612~~) operation and call the operation.
             */
            public Builder realInstanceClass(String realInstanceClass) {
                this.realInstanceClass = realInstanceClass;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder replicaId(String replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * The architecture of the instance. Valid values:
             * <p>
             * 
             * *   **master-slave**: standard master-replica architecture.
             * *   **cluster**: cluster architecture, which includes read/write splitting instances and cluster instances.
             */
            public Builder replicationMode(String replicationMode) {
                this.replicationMode = replicationMode;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the secondary zone.
             * <p>
             * 
             * > This parameter is returned only when the instance has a secondary zone ID.
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * The IP addresses contained in a whitelist of the instance.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * The number of shards. This parameter is available only for instances that are purchased on the China site (aliyun.com).
             * <p>
             * 
             * This parameter is returned only when the instance is a [cluster instance](~~52228~~) that uses cloud disks.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * Details of the tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The VPC authentication mode. Valid values:
             * <p>
             * 
             * *   **Open**: enables password authentication.
             * *   **Close**: disables password authentication and enables password-free access. For more information, see [Enable password-free access](~~85168~~).
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The deployment type of the instance. Valid values:
             * <p>
             * 
             * *   **singlezone**: The instance is deployed in a single zone.
             * *   **doublezone**: The instance is deployed in two zones of the same region.
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public DBInstanceAttribute build() {
                return new DBInstanceAttribute(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        private java.util.List < DBInstanceAttribute> DBInstanceAttribute;

        private Instances(Builder builder) {
            this.DBInstanceAttribute = builder.DBInstanceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceAttribute
         */
        public java.util.List < DBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

        public static final class Builder {
            private java.util.List < DBInstanceAttribute> DBInstanceAttribute; 

            /**
             * DBInstanceAttribute.
             */
            public Builder DBInstanceAttribute(java.util.List < DBInstanceAttribute> DBInstanceAttribute) {
                this.DBInstanceAttribute = DBInstanceAttribute;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceAttributeResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA40C261-EB72-4EDA-AC57-958722162595</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class DBInstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

        @com.aliyun.core.annotation.NameInMap("AuditLogRetention")
        private String auditLogRetention;

        @com.aliyun.core.annotation.NameInMap("AutoSecondaryZone")
        private Boolean autoSecondaryZone;

        @com.aliyun.core.annotation.NameInMap("AvailabilityValue")
        private String availabilityValue;

        @com.aliyun.core.annotation.NameInMap("BackupLogStartTime")
        private String backupLogStartTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CloudType")
        private String cloudType;

        @com.aliyun.core.annotation.NameInMap("ComputingType")
        private String computingType;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @com.aliyun.core.annotation.NameInMap("HasRenewChangeOrder")
        private String hasRenewChangeOrder;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceReleaseProtection")
        private Boolean instanceReleaseProtection;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsOrderCompleted")
        private Boolean isOrderCompleted;

        @com.aliyun.core.annotation.NameInMap("IsRds")
        private Boolean isRds;

        @com.aliyun.core.annotation.NameInMap("IsSupportTDE")
        private Boolean isSupportTDE;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("QPS")
        private Long QPS;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyCount")
        private Integer readOnlyCount;

        @com.aliyun.core.annotation.NameInMap("RealInstanceClass")
        private String realInstanceClass;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("ReplicaId")
        private String replicaId;

        @com.aliyun.core.annotation.NameInMap("ReplicationMode")
        private String replicationMode;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("SlaveReadOnlyCount")
        private Long slaveReadOnlyCount;

        @com.aliyun.core.annotation.NameInMap("SlaveReplicaCount")
        private Integer slaveReplicaCount;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private String storage;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcAuthMode")
        private String vpcAuthMode;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
        private String zoneType;

        private DBInstanceAttribute(Builder builder) {
            this.architectureType = builder.architectureType;
            this.auditLogRetention = builder.auditLogRetention;
            this.autoSecondaryZone = builder.autoSecondaryZone;
            this.availabilityValue = builder.availabilityValue;
            this.backupLogStartTime = builder.backupLogStartTime;
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.cloudType = builder.cloudType;
            this.computingType = builder.computingType;
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
            this.replicaCount = builder.replicaCount;
            this.replicaId = builder.replicaId;
            this.replicationMode = builder.replicationMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.securityIPList = builder.securityIPList;
            this.shardCount = builder.shardCount;
            this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
            this.slaveReplicaCount = builder.slaveReplicaCount;
            this.storage = builder.storage;
            this.storageType = builder.storageType;
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
         * @return autoSecondaryZone
         */
        public Boolean getAutoSecondaryZone() {
            return this.autoSecondaryZone;
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
         * @return computingType
         */
        public String getComputingType() {
            return this.computingType;
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
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
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
         * @return slaveReadOnlyCount
         */
        public Long getSlaveReadOnlyCount() {
            return this.slaveReadOnlyCount;
        }

        /**
         * @return slaveReplicaCount
         */
        public Integer getSlaveReplicaCount() {
            return this.slaveReplicaCount;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
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
            private Boolean autoSecondaryZone; 
            private String availabilityValue; 
            private String backupLogStartTime; 
            private Long bandwidth; 
            private Long capacity; 
            private String chargeType; 
            private String cloudType; 
            private String computingType; 
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
            private Integer replicaCount; 
            private String replicaId; 
            private String replicationMode; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private String securityIPList; 
            private Integer shardCount; 
            private Long slaveReadOnlyCount; 
            private Integer slaveReplicaCount; 
            private String storage; 
            private String storageType; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcAuthMode; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 
            private String zoneType; 

            private Builder() {
            } 

            private Builder(DBInstanceAttribute model) {
                this.architectureType = model.architectureType;
                this.auditLogRetention = model.auditLogRetention;
                this.autoSecondaryZone = model.autoSecondaryZone;
                this.availabilityValue = model.availabilityValue;
                this.backupLogStartTime = model.backupLogStartTime;
                this.bandwidth = model.bandwidth;
                this.capacity = model.capacity;
                this.chargeType = model.chargeType;
                this.cloudType = model.cloudType;
                this.computingType = model.computingType;
                this.config = model.config;
                this.connectionDomain = model.connectionDomain;
                this.connections = model.connections;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.globalInstanceId = model.globalInstanceId;
                this.hasRenewChangeOrder = model.hasRenewChangeOrder;
                this.instanceClass = model.instanceClass;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceReleaseProtection = model.instanceReleaseProtection;
                this.instanceStatus = model.instanceStatus;
                this.instanceType = model.instanceType;
                this.isOrderCompleted = model.isOrderCompleted;
                this.isRds = model.isRds;
                this.isSupportTDE = model.isSupportTDE;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.networkType = model.networkType;
                this.nodeType = model.nodeType;
                this.packageType = model.packageType;
                this.port = model.port;
                this.privateIp = model.privateIp;
                this.QPS = model.QPS;
                this.readOnlyCount = model.readOnlyCount;
                this.realInstanceClass = model.realInstanceClass;
                this.regionId = model.regionId;
                this.replicaCount = model.replicaCount;
                this.replicaId = model.replicaId;
                this.replicationMode = model.replicationMode;
                this.resourceGroupId = model.resourceGroupId;
                this.secondaryZoneId = model.secondaryZoneId;
                this.securityIPList = model.securityIPList;
                this.shardCount = model.shardCount;
                this.slaveReadOnlyCount = model.slaveReadOnlyCount;
                this.slaveReplicaCount = model.slaveReplicaCount;
                this.storage = model.storage;
                this.storageType = model.storageType;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vpcAuthMode = model.vpcAuthMode;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
                this.zoneType = model.zoneType;
            } 

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * AuditLogRetention.
             */
            public Builder auditLogRetention(String auditLogRetention) {
                this.auditLogRetention = auditLogRetention;
                return this;
            }

            /**
             * AutoSecondaryZone.
             */
            public Builder autoSecondaryZone(Boolean autoSecondaryZone) {
                this.autoSecondaryZone = autoSecondaryZone;
                return this;
            }

            /**
             * AvailabilityValue.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * BackupLogStartTime.
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CloudType.
             */
            public Builder cloudType(String cloudType) {
                this.cloudType = cloudType;
                return this;
            }

            /**
             * ComputingType.
             */
            public Builder computingType(String computingType) {
                this.computingType = computingType;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ConnectionDomain.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * Connections.
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * GlobalInstanceId.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * HasRenewChangeOrder.
             */
            public Builder hasRenewChangeOrder(String hasRenewChangeOrder) {
                this.hasRenewChangeOrder = hasRenewChangeOrder;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * InstanceReleaseProtection.
             */
            public Builder instanceReleaseProtection(Boolean instanceReleaseProtection) {
                this.instanceReleaseProtection = instanceReleaseProtection;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
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
             * IsOrderCompleted.
             */
            public Builder isOrderCompleted(Boolean isOrderCompleted) {
                this.isOrderCompleted = isOrderCompleted;
                return this;
            }

            /**
             * IsRds.
             */
            public Builder isRds(Boolean isRds) {
                this.isRds = isRds;
                return this;
            }

            /**
             * IsSupportTDE.
             */
            public Builder isSupportTDE(Boolean isSupportTDE) {
                this.isSupportTDE = isSupportTDE;
                return this;
            }

            /**
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * QPS.
             */
            public Builder QPS(Long QPS) {
                this.QPS = QPS;
                return this;
            }

            /**
             * ReadOnlyCount.
             */
            public Builder readOnlyCount(Integer readOnlyCount) {
                this.readOnlyCount = readOnlyCount;
                return this;
            }

            /**
             * RealInstanceClass.
             */
            public Builder realInstanceClass(String realInstanceClass) {
                this.realInstanceClass = realInstanceClass;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReplicaCount.
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * ReplicaId.
             */
            public Builder replicaId(String replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * ReplicationMode.
             */
            public Builder replicationMode(String replicationMode) {
                this.replicationMode = replicationMode;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecondaryZoneId.
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * ShardCount.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * SlaveReadOnlyCount.
             */
            public Builder slaveReadOnlyCount(Long slaveReadOnlyCount) {
                this.slaveReadOnlyCount = slaveReadOnlyCount;
                return this;
            }

            /**
             * SlaveReplicaCount.
             */
            public Builder slaveReplicaCount(Integer slaveReplicaCount) {
                this.slaveReplicaCount = slaveReplicaCount;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcAuthMode.
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneType.
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
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceAttribute")
        private java.util.List<DBInstanceAttribute> DBInstanceAttribute;

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
        public java.util.List<DBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

        public static final class Builder {
            private java.util.List<DBInstanceAttribute> DBInstanceAttribute; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.DBInstanceAttribute = model.DBInstanceAttribute;
            } 

            /**
             * DBInstanceAttribute.
             */
            public Builder DBInstanceAttribute(java.util.List<DBInstanceAttribute> DBInstanceAttribute) {
                this.DBInstanceAttribute = DBInstanceAttribute;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * <p>Details about the instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagkey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagvalue</p>
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

            /**
             * <p>The architecture of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cluster</strong>: cluster architecture</li>
             * <li><strong>standard</strong>: standard architecture</li>
             * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * <p>The retention period of audit logs. Unit: day. A value of 0 indicates that the audit log feature is disabled. For information about how to enable the feature, see <a href="https://help.aliyun.com/document_detail/102015.html">Enable the audit log feature</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder auditLogRetention(String auditLogRetention) {
                this.auditLogRetention = auditLogRetention;
                return this;
            }

            /**
             * <p>The availability metric of the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * <p>The earliest point in time to which data can be restored. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is returned only when the data flashback feature is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/148479.html">Restore data to a point in time by using the data flashback feature</a>.</p>
             * </li>
             * <li><p>When you call the <a href="https://help.aliyun.com/document_detail/61083.html">RestoreInstance</a> operation to implement data flashback, you can obtain the earliest point in time for data flashback from the return value of this parameter and set the <strong>RestoreTime</strong> parameter to this point in time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2021-07-06T05:49:55Z</p>
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * <p>The bandwidth of the instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>This parameter is returned only when the instance is in a cloud box.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudbox</p>
             */
            public Builder cloudType(String cloudType) {
                this.cloudType = cloudType;
                return this;
            }

            /**
             * <p>The parameter configurations of the instance in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Parameter descriptions</a>. You can use the <a href="https://help.aliyun.com/document_detail/473830.html">DescribeAuditLogConfig</a> operation to query audit log configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EvictionPolicy&quot;:&quot;volatile-lru&quot;,&quot;hash-max-ziplist-entries&quot;:512,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;set-max-intset-entries&quot;:512,&quot;hash-max-ziplist-value&quot;:64}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The internal endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1d72gwl41z7f****.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * <p>The maximum number of connections supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-06T10:42:03Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the subscription expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-06T10:42:03Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The database engine of the instance. The return value is <strong>Redis</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the distributed instance to which the instance belongs.</p>
             * <blockquote>
             * <p> This parameter is returned only when the ApsaraDB for Redis instance is a child instance of a distributed instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasRenewChangeOrder(String hasRenewChangeOrder) {
                this.hasRenewChangeOrder = hasRenewChangeOrder;
                return this;
            }

            /**
             * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/107984.html">Instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>redis.master.small.default</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1d72gwl41z7f****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>apitest</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the release protection feature is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder instanceReleaseProtection(Boolean instanceReleaseProtection) {
                this.instanceReleaseProtection = instanceReleaseProtection;
                return this;
            }

            /**
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is normal.</li>
             * <li><strong>Creating</strong>: The instance is being created.</li>
             * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
             * <li><strong>Inactive</strong>: The instance is disabled.</li>
             * <li><strong>Flushing</strong>: The instance is being released.</li>
             * <li><strong>Released</strong>: The instance is released.</li>
             * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
             * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
             * <li><strong>Error</strong>: The instance failed to be created.</li>
             * <li><strong>Migrating</strong>: The instance is being migrated.</li>
             * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
             * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
             * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
             * <li><strong>SSLModifying</strong>: The SSL configurations of the instance are being changed.</li>
             * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about instance states, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The database engine of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Tair</strong></li>
             * <li><strong>Redis</strong></li>
             * <li><strong>Memcache</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Redis</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Indicates whether the order for instance configuration change has reached the final state. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The configuration change has been completed or has not been performed.</li>
             * <li><strong>false</strong>: The configurations of the instance are being changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOrderCompleted(Boolean isOrderCompleted) {
                this.isOrderCompleted = isOrderCompleted;
                return this;
            }

            /**
             * <p>Indicates whether the instance is managed by ApsaraDB RDS. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRds(Boolean isRds) {
                this.isRds = isRds;
                return this;
            }

            /**
             * <p>Indicates whether the transparent data encryption (TDE) feature is supported for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: This feature is supported. This feature is available only for <a href="https://help.aliyun.com/document_detail/443827.html">DRAM-based</a> instances that use local disks.</li>
             * <li><strong>false</strong>: This feature is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSupportTDE(Boolean isSupportTDE) {
                this.isSupportTDE = isSupportTDE;
                return this;
            }

            /**
             * <p>The end time of the maintenance window. The time is in the <em>HH:mmZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>22:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window. The time is in the <em>HH:mmZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLASSIC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>double</strong>: The instance contains a master node and a replica node.</li>
             * <li><strong>single</strong>: The instance is a standalone instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>double</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The plan type. Valid values:</p>
             * <ul>
             * <li><strong>standard</strong>: standard plan.</li>
             * <li><strong>customized</strong>: custom plan. This plan type is phased out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The service port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             * <blockquote>
             * <p> This parameter is not returned when the instance is deployed in the classic network.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.49.***</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The expected maximum queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder QPS(Long QPS) {
                this.QPS = QPS;
                return this;
            }

            /**
             * <p>The number of read replicas. This parameter is available only for read/write splitting instances that use cloud disks.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readOnlyCount(Integer readOnlyCount) {
                this.readOnlyCount = readOnlyCount;
                return this;
            }

            /**
             * <p>If the instance is a cluster instance that uses cloud disks, this parameter indicates the actual instance type of individual shards in the instance. The InstanceClass parameter indicates the virtual instance type.</p>
             * <blockquote>
             * <p> To query fees for instances of the instance type, you can specify the instance type that is returned by this parameter in the <a href="https://help.aliyun.com/document_detail/95612.html">DescribePrice</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tair.rdb.with.proxy.1g</p>
             */
            public Builder realInstanceClass(String realInstanceClass) {
                this.realInstanceClass = realInstanceClass;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
             * <p>The ID of the replica node.</p>
             * 
             * <strong>example:</strong>
             * <p>bls-awxxxxxxxxxxxxx</p>
             */
            public Builder replicaId(String replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * <p>The architecture of the replica node. Valid values:</p>
             * <ul>
             * <li><strong>master-slave</strong>: the standard master-replica architecture.</li>
             * <li><strong>cluster</strong>: the cluster architecture, which includes the read/write splitting instances and cluster instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master-slave</p>
             */
            public Builder replicationMode(String replicationMode) {
                this.replicationMode = replicationMode;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyiu4ekp****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the secondary zone.</p>
             * <blockquote>
             * <p> This parameter is returned only if the instance has a secondary zone ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong-h</p>
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The number of shards. This parameter is available only for ApsaraDB for Redis instances that are purchased on the China site (aliyun.com).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * <p>The number of read replicas in the secondary zone. This parameter is returned only after read/write splitting is enabled for the instance across multiple zones.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The storage capacity of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>essd_pl1</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>Details about the tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e7clcw529l773d****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>Indicates whether password authentication is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Open</strong>: Password authentication is enabled.</li>
             * <li><strong>Close</strong>: Password authentication is disabled and <a href="https://help.aliyun.com/document_detail/85168.html">password-free access</a> is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * <p>The ID of the instance in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1d72gwl41z7f****</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1nme44gek34slfc****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The deployment type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>singlezone</strong>: The instance is deployed in a single zone.</li>
             * <li><strong>doublezone</strong>: The instance is deployed in two zones of the same region.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>singlezone</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
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
    public static class KVStoreInstance extends TeaModel {
        @NameInMap("ArchitectureType")
        private String architectureType;

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

        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("Connections")
        private Long connections;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DestroyTime")
        private String destroyTime;

        @NameInMap("EditionType")
        private String editionType;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @NameInMap("HasRenewChangeOrder")
        private Boolean hasRenewChangeOrder;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IsRds")
        private Boolean isRds;

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

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReplacateId")
        private String replacateId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @NameInMap("ShardClass")
        private String shardClass;

        @NameInMap("ShardCount")
        private Integer shardCount;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private KVStoreInstance(Builder builder) {
            this.architectureType = builder.architectureType;
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.cloudType = builder.cloudType;
            this.config = builder.config;
            this.connectionDomain = builder.connectionDomain;
            this.connectionMode = builder.connectionMode;
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.destroyTime = builder.destroyTime;
            this.editionType = builder.editionType;
            this.endTime = builder.endTime;
            this.engineVersion = builder.engineVersion;
            this.globalInstanceId = builder.globalInstanceId;
            this.hasRenewChangeOrder = builder.hasRenewChangeOrder;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.isRds = builder.isRds;
            this.networkType = builder.networkType;
            this.nodeType = builder.nodeType;
            this.packageType = builder.packageType;
            this.port = builder.port;
            this.privateIp = builder.privateIp;
            this.QPS = builder.QPS;
            this.regionId = builder.regionId;
            this.replacateId = builder.replacateId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.shardClass = builder.shardClass;
            this.shardCount = builder.shardCount;
            this.tags = builder.tags;
            this.userName = builder.userName;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVStoreInstance create() {
            return builder().build();
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
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
         * @return connectionMode
         */
        public String getConnectionMode() {
            return this.connectionMode;
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
         * @return destroyTime
         */
        public String getDestroyTime() {
            return this.destroyTime;
        }

        /**
         * @return editionType
         */
        public String getEditionType() {
            return this.editionType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
        public Boolean getHasRenewChangeOrder() {
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
         * @return isRds
         */
        public Boolean getIsRds() {
            return this.isRds;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replacateId
         */
        public String getReplacateId() {
            return this.replacateId;
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
         * @return shardClass
         */
        public String getShardClass() {
            return this.shardClass;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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

        public static final class Builder {
            private String architectureType; 
            private Long bandwidth; 
            private Long capacity; 
            private String chargeType; 
            private String cloudType; 
            private String config; 
            private String connectionDomain; 
            private String connectionMode; 
            private Long connections; 
            private String createTime; 
            private String destroyTime; 
            private String editionType; 
            private String endTime; 
            private String engineVersion; 
            private String globalInstanceId; 
            private Boolean hasRenewChangeOrder; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private Boolean isRds; 
            private String networkType; 
            private String nodeType; 
            private String packageType; 
            private Long port; 
            private String privateIp; 
            private Long QPS; 
            private String regionId; 
            private String replacateId; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private String shardClass; 
            private Integer shardCount; 
            private Tags tags; 
            private String userName; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The architecture of the instance. Default value: NULL. Valid values:
             * <p>
             * 
             * *   **cluster**: cluster architecture
             * *   **standard**: standard architecture
             * *   **rwsplit**: read/write splitting architecture
             * *   **NULL**: all of the preceding architectures
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
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
             * The parameter configurations of the instance. For more information, see [Modify parameters of an instance](~~43885~~).
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
             * The connection mode of the instance. Valid values:
             * <p>
             * 
             * *   **Standard**: standard mode
             * *   **Safe**: database proxy mode
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
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
             * The time when the instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the instance was deleted.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * The edition of the instance. Valid values:
             * <p>
             * 
             * *   **Community**: ApsaraDB for Redis Community Edition
             * *   **Enterprise**: ApsaraDB for Redis Enhanced Edition (Tair)
             */
            public Builder editionType(String editionType) {
                this.editionType = editionType;
                return this;
            }

            /**
             * The time when the subscription instance expires.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The ID of the distributed instance.
             * <p>
             * 
             * >  This parameter is returned only if the instance is a child instance of a distributed instance.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasRenewChangeOrder(Boolean hasRenewChangeOrder) {
                this.hasRenewChangeOrder = hasRenewChangeOrder;
                return this;
            }

            /**
             * The instance class.
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
             * *   **Unavailable**: The instance is unavailable.
             * *   **Error**: The instance failed to be created.
             * *   **Migrating**: The instance is being migrated.
             * *   **BackupRecovering**: The instance is being restored from a backup.
             * *   **MinorVersionUpgrading**: The minor version of the instance is being updated.
             * *   **NetworkModifying**: The network type of the instance is being changed.
             * *   **SSLModifying**: The SSL configurations of the instance are being changed.
             * *   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.
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
             * Indicates whether the instance is managed by ApsaraDB RDS. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isRds(Boolean isRds) {
                this.isRds = isRds;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **CLASSIC**
             * *   **VPC**
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
             * *   **single**: The instance contains only a master node. This node type is phased out.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The plan type. Valid values:
             * <p>
             * 
             * *   **standard**: standard plan
             * *   **customized**: custom plan
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The service port of the instance.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The private IP address.
             * <p>
             * 
             * >  This parameter is not returned when the instance is deployed in the classic network.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * The number of queries per second (QPS).
             */
            public Builder QPS(Long QPS) {
                this.QPS = QPS;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The logical ID of the distributed instance.
             */
            public Builder replacateId(String replacateId) {
                this.replacateId = replacateId;
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
             * >  If multiple zones are returned for **ZoneId**, such as cn-hangzhou-MAZ10(h,i), this parameter is ignored.
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * The shard class. For more information about shard classes, see [Overview](~~26350~~).
             * <p>
             * 
             * >  The overall performance of a cluster instance is calculated by multiplying the class of a single shard (ShardClass) by the number of shards (ShardCount).
             */
            public Builder shardClass(String shardClass) {
                this.shardClass = shardClass;
                return this;
            }

            /**
             * The number of data shards in the cluster instance.
             * <p>
             * 
             * >  This parameter is returned only for cloud-native cluster instances or read/write splitting instances.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * Details about the tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The username used to connect to the instance. By default, a username named after the instance ID is included.
             */
            public Builder userName(String userName) {
                this.userName = userName;
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
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public KVStoreInstance build() {
                return new KVStoreInstance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("KVStoreInstance")
        private java.util.List < KVStoreInstance> KVStoreInstance;

        private Instances(Builder builder) {
            this.KVStoreInstance = builder.KVStoreInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return KVStoreInstance
         */
        public java.util.List < KVStoreInstance> getKVStoreInstance() {
            return this.KVStoreInstance;
        }

        public static final class Builder {
            private java.util.List < KVStoreInstance> KVStoreInstance; 

            /**
             * KVStoreInstance.
             */
            public Builder KVStoreInstance(java.util.List < KVStoreInstance> KVStoreInstance) {
                this.KVStoreInstance = KVStoreInstance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

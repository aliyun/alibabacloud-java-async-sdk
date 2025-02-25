// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details about the instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E83311F-0EE4-4922-A3BF-730B312B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
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
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class KVStoreInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchitectureType")
        private String architectureType;

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

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DestroyTime")
        private String destroyTime;

        @com.aliyun.core.annotation.NameInMap("EditionType")
        private String editionType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @com.aliyun.core.annotation.NameInMap("HasRenewChangeOrder")
        private Boolean hasRenewChangeOrder;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsRds")
        private Boolean isRds;

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
        private String readOnlyCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplacateId")
        private String replacateId;

        @com.aliyun.core.annotation.NameInMap("ReplicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("ShardClass")
        private String shardClass;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("SlaveReadOnlyCount")
        private Integer slaveReadOnlyCount;

        @com.aliyun.core.annotation.NameInMap("SlaveReplicaCount")
        private Integer slaveReplicaCount;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private KVStoreInstance(Builder builder) {
            this.architectureType = builder.architectureType;
            this.bandwidth = builder.bandwidth;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.cloudType = builder.cloudType;
            this.computingType = builder.computingType;
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
            this.readOnlyCount = builder.readOnlyCount;
            this.regionId = builder.regionId;
            this.replacateId = builder.replacateId;
            this.replicaCount = builder.replicaCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.shardClass = builder.shardClass;
            this.shardCount = builder.shardCount;
            this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
            this.slaveReplicaCount = builder.slaveReplicaCount;
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
         * @return readOnlyCount
         */
        public String getReadOnlyCount() {
            return this.readOnlyCount;
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
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
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
         * @return slaveReadOnlyCount
         */
        public Integer getSlaveReadOnlyCount() {
            return this.slaveReadOnlyCount;
        }

        /**
         * @return slaveReplicaCount
         */
        public Integer getSlaveReplicaCount() {
            return this.slaveReplicaCount;
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
            private String computingType; 
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
            private String readOnlyCount; 
            private String regionId; 
            private String replacateId; 
            private Integer replicaCount; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private String shardClass; 
            private Integer shardCount; 
            private Integer slaveReadOnlyCount; 
            private Integer slaveReplicaCount; 
            private Tags tags; 
            private String userName; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * <p>The architecture of the instance. Default value: NULL. Valid values:</p>
             * <ul>
             * <li><strong>cluster</strong>: cluster architecture</li>
             * <li><strong>standard</strong>: standard architecture</li>
             * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
             * <li><strong>NULL</strong>: all of the preceding architectures</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * <p>The bandwidth of the instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
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
             * ComputingType.
             */
            public Builder computingType(String computingType) {
                this.computingType = computingType;
                return this;
            }

            /**
             * <p>The parameter configurations of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Modify parameters of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;maxmemory-policy&quot;:&quot;volatile-lfu&quot;,&quot;EvictionPolicy&quot;:&quot;volatile-lru&quot;,&quot;hash-max-ziplist-entries&quot;:512,&quot;zset-max-ziplist-entries&quot;:128,&quot;zset-max-ziplist-value&quot;:64,&quot;set-max-intset-entries&quot;:512,&quot;hash-max-ziplist-value&quot;:64,&quot;#no_loose_disabled-commands&quot;:&quot;flushall,flushdb&quot;,&quot;lazyfree-lazy-eviction&quot;:&quot;yes&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The internal endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * <p>The connection mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: standard mode</li>
             * <li><strong>Safe</strong>: database proxy mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * <p>The maximum number of connections supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-07T08:49:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the instance was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-28T10:03:01Z</p>
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * <p>The edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Community</strong>: ApsaraDB for Redis Community Edition</li>
             * <li><strong>Enterprise</strong>: ApsaraDB for Redis Enhanced Edition (Tair)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enterprise</p>
             */
            public Builder editionType(String editionType) {
                this.editionType = editionType;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-13T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The ID of the distributed instance.</p>
             * <blockquote>
             * <p> This parameter is returned only if the instance is a child instance of a distributed instance.</p>
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
            public Builder hasRenewChangeOrder(Boolean hasRenewChangeOrder) {
                this.hasRenewChangeOrder = hasRenewChangeOrder;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * 
             * <strong>example:</strong>
             * <p>redis.logic.sharding.2g.2db.0rodb.4proxy.default</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****</p>
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
             * <li><strong>single</strong>: The instance contains only a master node. This node type is phased out.</li>
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
             * <li><strong>standard</strong>: standard plan</li>
             * <li><strong>customized</strong>: custom plan</li>
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
             * <p>The private IP address.</p>
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
             * <p>The number of queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder QPS(Long QPS) {
                this.QPS = QPS;
                return this;
            }

            /**
             * ReadOnlyCount.
             */
            public Builder readOnlyCount(String readOnlyCount) {
                this.readOnlyCount = readOnlyCount;
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
             * <p>The logical ID of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>grr-bp11381ebc16****</p>
             */
            public Builder replacateId(String replacateId) {
                this.replacateId = replacateId;
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
             * <p> If multiple zones are returned for <strong>ZoneId</strong>, such as cn-hangzhou-MAZ10(h,i), this parameter is ignored.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * <p>The shard class. For more information about shard classes, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
             * <blockquote>
             * <p> The overall performance of a cluster instance is calculated by multiplying the class of a single shard (ShardClass) by the number of shards (ShardCount).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>redis.shard.small.ce</p>
             */
            public Builder shardClass(String shardClass) {
                this.shardClass = shardClass;
                return this;
            }

            /**
             * <p>The number of data shards in the cluster instance.</p>
             * <blockquote>
             * <p> This parameter is returned only for cloud-native cluster instances or read/write splitting instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * SlaveReadOnlyCount.
             */
            public Builder slaveReadOnlyCount(Integer slaveReadOnlyCount) {
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
             * <p>Details about the tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The username used to connect to the instance. By default, a username named after the instance ID is included.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
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
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KVStoreInstance")
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

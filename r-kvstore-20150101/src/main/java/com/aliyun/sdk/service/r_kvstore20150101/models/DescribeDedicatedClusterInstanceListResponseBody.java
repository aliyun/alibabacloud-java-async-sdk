// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDedicatedClusterInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedClusterInstanceListResponseBody</p>
 */
public class DescribeDedicatedClusterInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDedicatedClusterInstanceListResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedClusterInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
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
        private java.util.List < Instances> instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details of the instances.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
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
         * <p>The number of entries per page.</p>
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
         * <p>712CCF2A-16BD-411B-93F7-E978BEF2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedClusterInstanceListResponseBody build() {
            return new DescribeDedicatedClusterInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedClusterInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedClusterInstanceListResponseBody</p>
     */
    public static class InstanceNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Integer nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceNodeList(Builder builder) {
            this.dedicatedHostName = builder.dedicatedHostName;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeIp = builder.nodeIp;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.role = builder.role;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNodeList create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeId
         */
        public Integer getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String dedicatedHostName; 
            private String instanceId; 
            private Integer nodeId; 
            private String nodeIp; 
            private String nodeType; 
            private Integer port; 
            private String role; 
            private String zoneId; 

            /**
             * <p>The ID of the host in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ch-bp13vf0y9gx3c****</p>
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1e7vl6ygf1yq****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17921111</p>
             */
            public Builder nodeId(Integer nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.33.***</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: data node.</li>
             * <li><strong>proxy</strong>: proxy node.</li>
             * <li><strong>normal</strong>: regular node. This value is returned when the instance runs in the standard architecture.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the node.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: master node</li>
             * <li><strong>slave</strong>: replica node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceNodeList build() {
                return new InstanceNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedClusterInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedClusterInstanceListResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Long bandWidth;

        @com.aliyun.core.annotation.NameInMap("CharacterType")
        private String characterType;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @com.aliyun.core.annotation.NameInMap("CustomId")
        private String customId;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceNodeList")
        private java.util.List < InstanceNodeList> instanceNodeList;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("ProxyCount")
        private Integer proxyCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instances(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.characterType = builder.characterType;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.connectionDomain = builder.connectionDomain;
            this.createTime = builder.createTime;
            this.currentBandWidth = builder.currentBandWidth;
            this.customId = builder.customId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceNodeList = builder.instanceNodeList;
            this.instanceStatus = builder.instanceStatus;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.proxyCount = builder.proxyCount;
            this.regionId = builder.regionId;
            this.shardCount = builder.shardCount;
            this.storageType = builder.storageType;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Long getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return characterType
         */
        public String getCharacterType() {
            return this.characterType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return connectionDomain
         */
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentBandWidth
         */
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        /**
         * @return customId
         */
        public String getCustomId() {
            return this.customId;
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
         * @return instanceNodeList
         */
        public java.util.List < InstanceNodeList> getInstanceNodeList() {
            return this.instanceNodeList;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
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
         * @return proxyCount
         */
        public Integer getProxyCount() {
            return this.proxyCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return shardCount
         */
        public Integer getShardCount() {
            return this.shardCount;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long bandWidth; 
            private String characterType; 
            private String clusterId; 
            private String clusterName; 
            private String connectionDomain; 
            private String createTime; 
            private Long currentBandWidth; 
            private String customId; 
            private String engine; 
            private String engineVersion; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private java.util.List < InstanceNodeList> instanceNodeList; 
            private String instanceStatus; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer proxyCount; 
            private String regionId; 
            private Integer shardCount; 
            private String storageType; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * <p>The default bandwidth of the instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The architecture of the instance. Valid values:</p>
             * <ul>
             * <li><strong>logic</strong>: cluster</li>
             * <li><strong>normal</strong>: standard</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logic</p>
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * <p>The ID of the dedicated cluster to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dhg-rx71fc5ndh9o****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the dedicated cluster to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The private endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-t4ncdi1dgi0ja8****.redis.hangzhou.rds.aliyuncs.com</p>
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-06T07:09:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current bandwidth of the instance, which is the sum of the default bandwidth and any extra bandwidth that is purchased. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * <p>An internal parameter used for the maintenance and management of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>4652****</p>
             */
            public Builder customId(String customId) {
                this.customId = customId;
                return this;
            }

            /**
             * <p>The database engine. The return value is <strong>redis</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>redis</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance. The return value is <strong>5.0</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>redis.cluster.sharding.common.ce</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1e7vl6ygf1yq****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The nodes.</p>
             */
            public Builder instanceNodeList(java.util.List < InstanceNodeList> instanceNodeList) {
                this.instanceNodeList = instanceNodeList;
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
             * <p>The end time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>17:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>16:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The number of proxy nodes.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the return value is <strong>0</strong>, the proxy mode is disabled for the instance. If the return value is an integer greater than <strong>0</strong>, such as <strong>1</strong>, the proxy mode is enabled for the instance.</p>
             * </li>
             * <li><p>This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see <a href="https://help.aliyun.com/document_detail/52228.html">Cluster master-replica instances</a>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder proxyCount(Integer proxyCount) {
                this.proxyCount = proxyCount;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * <blockquote>
             * <p> This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see <a href="https://help.aliyun.com/document_detail/52228.html">Cluster master-replica instances</a>.</p>
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
             * <p>The storage type of the instance. The return value is LOCAL_SSD, which indicates <a href="https://help.aliyun.com/document_detail/122389.html">enhanced SSDs (ESSDs)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>LOCAL_SSD</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-t4n2clc70t3hqwsrr****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-t4nvrca24dczppq44****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

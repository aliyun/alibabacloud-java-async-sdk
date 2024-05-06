// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Details of the instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
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
         * The number of entries per page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedClusterInstanceListResponseBody build() {
            return new DescribeDedicatedClusterInstanceListResponseBody(this);
        } 

    } 

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
             * The ID of the host in the dedicated cluster.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
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
             * The node ID.
             */
            public Builder nodeId(Integer nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The IP address of the node.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **db**: data node.
             * *   **proxy**: proxy node.
             * *   **normal**: regular node. This value is returned when the instance runs in the standard architecture.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The port number that is used to connect to the node.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **master**: master node
             * *   **slave**: replica node
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The zone ID of the node.
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
             * The default bandwidth of the instance. Unit: Mbit/s.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * The architecture of the instance. Valid values:
             * <p>
             * 
             * *   **logic**: cluster
             * *   **normal**: standard
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * The ID of the dedicated cluster to which the instance belongs.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the dedicated cluster to which the instance belongs.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The private endpoint of the instance.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
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
             * The current bandwidth of the instance, which is the sum of the default bandwidth and any extra bandwidth that is purchased. Unit: Mbit/s.
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * An internal parameter used for the maintenance and management of instances.
             */
            public Builder customId(String customId) {
                this.customId = customId;
                return this;
            }

            /**
             * The database engine. The return value is **redis**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance. The return value is **5.0**.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The instance type.
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
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The nodes.
             */
            public Builder instanceNodeList(java.util.List < InstanceNodeList> instanceNodeList) {
                this.instanceNodeList = instanceNodeList;
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
             * The end time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * The start time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * The number of proxy nodes.
             * <p>
             * 
             * > 
             * 
             * *   If the return value is **0**, the proxy mode is disabled for the instance. If the return value is an integer greater than **0**, such as **1**, the proxy mode is enabled for the instance.
             * 
             * *   This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see [Cluster master-replica instances](~~52228~~).
             */
            public Builder proxyCount(Integer proxyCount) {
                this.proxyCount = proxyCount;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of shards.
             * <p>
             * 
             * >  This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see [Cluster master-replica instances](~~52228~~).
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * The storage type of the instance. The return value is LOCAL_SSD, which indicates [enhanced SSDs (ESSDs)](~~122389~~).
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The zone ID.
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

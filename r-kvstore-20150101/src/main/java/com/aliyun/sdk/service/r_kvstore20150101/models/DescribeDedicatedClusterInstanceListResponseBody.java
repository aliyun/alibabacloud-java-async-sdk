// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedClusterInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedClusterInstanceListResponseBody</p>
 */
public class DescribeDedicatedClusterInstanceListResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NodeId")
        private Integer nodeId;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Role")
        private String role;

        @NameInMap("ZoneId")
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
             * DedicatedHostName.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
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
             * NodeId.
             */
            public Builder nodeId(Integer nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * ZoneId.
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
        @NameInMap("BandWidth")
        private Long bandWidth;

        @NameInMap("CharacterType")
        private String characterType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ConnectionDomain")
        private String connectionDomain;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @NameInMap("CustomId")
        private String customId;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceNodeList")
        private java.util.List < InstanceNodeList> instanceNodeList;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("ProxyCount")
        private Integer proxyCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ShardCount")
        private Integer shardCount;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
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
             * BandWidth.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * CharacterType.
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentBandWidth.
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * CustomId.
             */
            public Builder customId(String customId) {
                this.customId = customId;
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
             * InstanceNodeList.
             */
            public Builder instanceNodeList(java.util.List < InstanceNodeList> instanceNodeList) {
                this.instanceNodeList = instanceNodeList;
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
             * ProxyCount.
             */
            public Builder proxyCount(Integer proxyCount) {
                this.proxyCount = proxyCount;
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
             * ShardCount.
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneId.
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

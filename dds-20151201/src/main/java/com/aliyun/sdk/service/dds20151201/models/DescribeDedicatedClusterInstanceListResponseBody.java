// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    private Instances instances;

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
         * The number of the page to return.
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
         * The number of instances in the response.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedClusterInstanceListResponseBody build() {
            return new DescribeDedicatedClusterInstanceListResponseBody(this);
        } 

    } 

    public static class InstanceNodes extends TeaModel {
        @NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @NameInMap("InsName")
        private String insName;

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

        private InstanceNodes(Builder builder) {
            this.dedicatedHostName = builder.dedicatedHostName;
            this.insName = builder.insName;
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

        public static InstanceNodes create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
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
            private String insName; 
            private Integer nodeId; 
            private String nodeIp; 
            private String nodeType; 
            private Integer port; 
            private String role; 
            private String zoneId; 

            /**
             * The ID of the host to which the instances in a dedicated cluster belong.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            /**
             * The name of the shard.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * The ID of the node.
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
             * The type of the node.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The port number corresponding to the node.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **master**: a primary node.
             * *   **slave**: a secondary node.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceNodes build() {
                return new InstanceNodes(this);
            } 

        } 

    }
    public static class InstanceNodeList extends TeaModel {
        @NameInMap("InstanceNodes")
        private java.util.List < InstanceNodes> instanceNodes;

        private InstanceNodeList(Builder builder) {
            this.instanceNodes = builder.instanceNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNodeList create() {
            return builder().build();
        }

        /**
         * @return instanceNodes
         */
        public java.util.List < InstanceNodes> getInstanceNodes() {
            return this.instanceNodes;
        }

        public static final class Builder {
            private java.util.List < InstanceNodes> instanceNodes; 

            /**
             * InstanceNodes.
             */
            public Builder instanceNodes(java.util.List < InstanceNodes> instanceNodes) {
                this.instanceNodes = instanceNodes;
                return this;
            }

            public InstanceNodeList build() {
                return new InstanceNodeList(this);
            } 

        } 

    }
    public static class DbInstance extends TeaModel {
        @NameInMap("CharacterType")
        private String characterType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CreateTime")
        private String createTime;

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
        private InstanceNodeList instanceNodeList;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DbInstance(Builder builder) {
            this.characterType = builder.characterType;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
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
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.storageType = builder.storageType;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstance create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public InstanceNodeList getInstanceNodeList() {
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String characterType; 
            private String clusterId; 
            private String clusterName; 
            private String createTime; 
            private String customId; 
            private String engine; 
            private String engineVersion; 
            private String instanceClass; 
            private String instanceId; 
            private String instanceName; 
            private InstanceNodeList instanceNodeList; 
            private String instanceStatus; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String region; 
            private String regionId; 
            private String storageType; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * The type of the ApsaraDB for MongoDB instance. Valid value: **normal**.
             * <p>
             * 
             * **normal**: a replica set instance.
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
             * The time when the instance was created. The time is displayed in the *yyyy*-*MM*-*dd*T*HH*:*mm*:*ss*Z format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The instance ID of the backend O\&M platform.
             */
            public Builder customId(String customId) {
                this.customId = customId;
                return this;
            }

            /**
             * The database engine. Valid value: **MongoDB**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version number of the database engine. Valid value: **4.2**.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The instance type. For more information, see **Table 1. Standalone or replica set instance types** in [Instance types](~~57141~~).
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The ID of the ApsaraDB for MongoDB instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the ApsaraDB for MongoDB instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Details about the instance nodes.
             */
            public Builder instanceNodeList(InstanceNodeList instanceNodeList) {
                this.instanceNodeList = instanceNodeList;
                return this;
            }

            /**
             * The status of the instance. More details of status, please see [instance status list](~~190071~~).
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
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
             * The start time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * The region where the instance is deployed.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the region where the instance is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the storage.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID of the VPC.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DbInstance build() {
                return new DbInstance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("dbInstance")
        private java.util.List < DbInstance> dbInstance;

        private Instances(Builder builder) {
            this.dbInstance = builder.dbInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return dbInstance
         */
        public java.util.List < DbInstance> getDbInstance() {
            return this.dbInstance;
        }

        public static final class Builder {
            private java.util.List < DbInstance> dbInstance; 

            /**
             * dbInstance.
             */
            public Builder dbInstance(java.util.List < DbInstance> dbInstance) {
                this.dbInstance = dbInstance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}

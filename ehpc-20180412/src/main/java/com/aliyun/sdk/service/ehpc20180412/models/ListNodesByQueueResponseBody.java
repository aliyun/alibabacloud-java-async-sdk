// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesByQueueResponseBody</p>
 */
public class ListNodesByQueueResponseBody extends TeaModel {
    @NameInMap("Nodes")
    private Nodes nodes;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListNodesByQueueResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesByQueueResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodes
     */
    public Nodes getNodes() {
        return this.nodes;
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
        private Nodes nodes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of nodes.
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * The number of the returned page.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodesByQueueResponseBody build() {
            return new ListNodesByQueueResponseBody(this);
        } 

    } 

    public static class TotalResources extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Memory")
        private Integer memory;

        private TotalResources(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalResources create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer gpu; 
            private Integer memory; 

            /**
             * The number of CPU cores. Unit: cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The total number of GPU cards. Unit: cards.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The memory capacity. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public TotalResources build() {
                return new TotalResources(this);
            } 

        } 

    }
    public static class UsedResources extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Memory")
        private Integer memory;

        private UsedResources(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsedResources create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer gpu; 
            private Integer memory; 

            /**
             * The number of CPU cores. Unit: cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The total number of GPU cards. Unit: cards.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The memory capacity. Unit: GB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public UsedResources build() {
                return new UsedResources(this);
            } 

        } 

    }
    public static class NodeInfo extends TeaModel {
        @NameInMap("AddTime")
        private String addTime;

        @NameInMap("CreateMode")
        private String createMode;

        @NameInMap("CreatedByEhpc")
        private Boolean createdByEhpc;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HtEnabled")
        private Boolean htEnabled;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Location")
        private String location;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("StateInSched")
        private String stateInSched;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalResources")
        private TotalResources totalResources;

        @NameInMap("UsedResources")
        private UsedResources usedResources;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("Version")
        private String version;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private NodeInfo(Builder builder) {
            this.addTime = builder.addTime;
            this.createMode = builder.createMode;
            this.createdByEhpc = builder.createdByEhpc;
            this.expired = builder.expired;
            this.expiredTime = builder.expiredTime;
            this.hostName = builder.hostName;
            this.htEnabled = builder.htEnabled;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.ipAddress = builder.ipAddress;
            this.location = builder.location;
            this.lockReason = builder.lockReason;
            this.publicIpAddress = builder.publicIpAddress;
            this.regionId = builder.regionId;
            this.spotStrategy = builder.spotStrategy;
            this.stateInSched = builder.stateInSched;
            this.status = builder.status;
            this.totalResources = builder.totalResources;
            this.usedResources = builder.usedResources;
            this.vSwitchId = builder.vSwitchId;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public String getAddTime() {
            return this.addTime;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createdByEhpc
         */
        public Boolean getCreatedByEhpc() {
            return this.createdByEhpc;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return htEnabled
         */
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return stateInSched
         */
        public String getStateInSched() {
            return this.stateInSched;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalResources
         */
        public TotalResources getTotalResources() {
            return this.totalResources;
        }

        /**
         * @return usedResources
         */
        public UsedResources getUsedResources() {
            return this.usedResources;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
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
            private String addTime; 
            private String createMode; 
            private Boolean createdByEhpc; 
            private Boolean expired; 
            private String expiredTime; 
            private String hostName; 
            private Boolean htEnabled; 
            private String id; 
            private String imageId; 
            private String imageOwnerAlias; 
            private String ipAddress; 
            private String location; 
            private String lockReason; 
            private String publicIpAddress; 
            private String regionId; 
            private String spotStrategy; 
            private String stateInSched; 
            private String status; 
            private TotalResources totalResources; 
            private UsedResources usedResources; 
            private String vSwitchId; 
            private String version; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The time when the node was added to the cluster.
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * The mode in which the node is created. Valid values:
             * <p>
             * 
             * *   manual: The node is manually added.
             * *   autoscale: The node is automatically added.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * Indicates whether the node was created by using E-HPC.
             */
            public Builder createdByEhpc(Boolean createdByEhpc) {
                this.createdByEhpc = createdByEhpc;
                return this;
            }

            /**
             * Indicates whether the subscription node has expired. If the node is a pay-as-you-go node, false is returned.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The time when the subscription instance expires. If the node is a pay-as-you-go node, a null value is returned.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The node name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Indicates whether Hyper-Threading (HT) is enabled.
             */
            public Builder htEnabled(Boolean htEnabled) {
                this.htEnabled = htEnabled;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   system: public image
             * *   self: custom image
             * *   others: shared image
             * *   marketplace: Alibaba Cloud Marketplace image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * The private IP address of the node.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The location where the node is deployed. Valid values:
             * <p>
             * 
             * *   OnPremise: The cluster is deployed on a hybrid cloud.
             * *   PublicCloud: The cluster is deployed on a public cloud.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The reason why the node is locked. Valid values:
             * <p>
             * 
             * *   financial: The instance is locked due to overdue payments.
             * *   security: The node is locked for security reasons.
             * *   recycling: The preemptible instance is locked and pending release.
             * *   dedicatedhostfinancial: The ECS instance is locked due to overdue payments of the dedicated host.
             * 
             * By default, an empty string is returned.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The public IP address of the node.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
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
             * The preemption policy of the instance. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is created as a pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The status of the node displayed on the scheduler. The status varies with the scheduler.
             */
            public Builder stateInSched(String stateInSched) {
                this.stateInSched = stateInSched;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   uninit: The node is not initialized.
             * *   init: The node is being initialized.
             * *   ready: The node is ready.
             * *   running: The cluster is running.
             * *   exception: An exception occurred on the node.
             * *   untracking: The node is not added to the cluster.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The number of all resources in the cluster.
             */
            public Builder totalResources(TotalResources totalResources) {
                this.totalResources = totalResources;
                return this;
            }

            /**
             * The usage of the compute nodes in the cluster. For other types of nodes, an empty value is returned.
             */
            public Builder usedResources(UsedResources usedResources) {
                this.usedResources = usedResources;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The version of the E-HPC client.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The VPC ID of the node.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID of the node.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < NodeInfo> nodeInfo;

        private Nodes(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List < NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < NodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}

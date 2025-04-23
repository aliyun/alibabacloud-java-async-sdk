// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesByQueueResponseBody</p>
 */
public class ListNodesByQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private Nodes nodes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListNodesByQueueResponseBody model) {
            this.nodes = model.nodes;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
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
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B405FF19-2D5F-4489-A84C-BC15CC1B24BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodesByQueueResponseBody build() {
            return new ListNodesByQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesByQueueResponseBody</p>
     */
    public static class TotalResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
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

            private Builder() {
            } 

            private Builder(TotalResources model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of CPU cores. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The total number of GPU cards. Unit: cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The memory capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
    /**
     * 
     * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesByQueueResponseBody</p>
     */
    public static class UsedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
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

            private Builder() {
            } 

            private Builder(UsedResources model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of CPU cores. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The total number of GPU cards. Unit: cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The memory capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesByQueueResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private String addTime;

        @com.aliyun.core.annotation.NameInMap("CreateMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("CreatedByEhpc")
        private Boolean createdByEhpc;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HtEnabled")
        private Boolean htEnabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("StateInSched")
        private String stateInSched;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalResources")
        private TotalResources totalResources;

        @com.aliyun.core.annotation.NameInMap("UsedResources")
        private UsedResources usedResources;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.addTime = model.addTime;
                this.createMode = model.createMode;
                this.createdByEhpc = model.createdByEhpc;
                this.expired = model.expired;
                this.expiredTime = model.expiredTime;
                this.hostName = model.hostName;
                this.htEnabled = model.htEnabled;
                this.id = model.id;
                this.imageId = model.imageId;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.ipAddress = model.ipAddress;
                this.location = model.location;
                this.lockReason = model.lockReason;
                this.publicIpAddress = model.publicIpAddress;
                this.regionId = model.regionId;
                this.spotStrategy = model.spotStrategy;
                this.stateInSched = model.stateInSched;
                this.status = model.status;
                this.totalResources = model.totalResources;
                this.usedResources = model.usedResources;
                this.vSwitchId = model.vSwitchId;
                this.version = model.version;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the node was added to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-18T13:24:29.000Z</p>
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The mode in which the node is created. Valid values:</p>
             * <ul>
             * <li>manual: The node is manually added.</li>
             * <li>autoscale: The node is automatically added.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>Indicates whether the node was created by using E-HPC.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder createdByEhpc(Boolean createdByEhpc) {
                this.createdByEhpc = createdByEhpc;
                return this;
            }

            /**
             * <p>Indicates whether the subscription node has expired. If the node is a pay-as-you-go node, false is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires. If the node is a pay-as-you-go node, a null value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-18T13:24:29.000Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>compute0</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>Indicates whether Hyper-Threading (HT) is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder htEnabled(Boolean htEnabled) {
                this.htEnabled = htEnabled;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp13p7vlcb1uihfv****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_02_64_20G_alibase_20170818****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the image. Valid values:</p>
             * <ul>
             * <li>system: public image</li>
             * <li>self: custom image</li>
             * <li>others: shared image</li>
             * <li>marketplace: Alibaba Cloud Marketplace image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>The private IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.168.**.**</code></p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The location where the node is deployed. Valid values:</p>
             * <ul>
             * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
             * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PublicCloud</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The reason why the node is locked. Valid values:</p>
             * <ul>
             * <li>financial: The instance is locked due to overdue payments.</li>
             * <li>security: The node is locked for security reasons.</li>
             * <li>recycling: The preemptible instance is locked and pending release.</li>
             * <li>dedicatedhostfinancial: The ECS instance is locked due to overdue payments of the dedicated host.</li>
             * </ul>
             * <p>By default, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The public IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p><code>10.34.**.**</code></p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
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
             * <p>The preemption policy of the instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The status of the node displayed on the scheduler. The status varies with the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder stateInSched(String stateInSched) {
                this.stateInSched = stateInSched;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li>uninit: The node is not initialized.</li>
             * <li>init: The node is being initialized.</li>
             * <li>ready: The node is ready.</li>
             * <li>running: The cluster is running.</li>
             * <li>exception: An exception occurred on the node.</li>
             * <li>untracking: The node is not added to the cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>untracking</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of all resources in the cluster.</p>
             */
            public Builder totalResources(TotalResources totalResources) {
                this.totalResources = totalResources;
                return this;
            }

            /**
             * <p>The usage of the compute nodes in the cluster. For other types of nodes, an empty value is returned.</p>
             */
            public Builder usedResources(UsedResources usedResources) {
                this.usedResources = usedResources;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e47optm9g58zcu****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The version of the E-HPC client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.64</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1gnu8br4ay7beb2w****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link ListNodesByQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesByQueueResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<NodeInfo> nodeInfo;

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
        public java.util.List<NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List<NodeInfo> nodeInfo; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.nodeInfo = model.nodeInfo;
            } 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}

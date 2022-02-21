// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private Clusters clusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public Clusters getClusters() {
        return this.clusters;
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
        private Clusters clusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Clusters.
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
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

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    public static class Computes extends TeaModel {
        @NameInMap("ExceptionCount")
        private Integer exceptionCount;

        @NameInMap("NormalCount")
        private Integer normalCount;

        @NameInMap("OperatingCount")
        private Integer operatingCount;

        @NameInMap("StoppedCount")
        private Integer stoppedCount;

        @NameInMap("Total")
        private Integer total;

        private Computes(Builder builder) {
            this.exceptionCount = builder.exceptionCount;
            this.normalCount = builder.normalCount;
            this.operatingCount = builder.operatingCount;
            this.stoppedCount = builder.stoppedCount;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Computes create() {
            return builder().build();
        }

        /**
         * @return exceptionCount
         */
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        /**
         * @return normalCount
         */
        public Integer getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return operatingCount
         */
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        /**
         * @return stoppedCount
         */
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer exceptionCount; 
            private Integer normalCount; 
            private Integer operatingCount; 
            private Integer stoppedCount; 
            private Integer total; 

            /**
             * ExceptionCount.
             */
            public Builder exceptionCount(Integer exceptionCount) {
                this.exceptionCount = exceptionCount;
                return this;
            }

            /**
             * NormalCount.
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * OperatingCount.
             */
            public Builder operatingCount(Integer operatingCount) {
                this.operatingCount = operatingCount;
                return this;
            }

            /**
             * StoppedCount.
             */
            public Builder stoppedCount(Integer stoppedCount) {
                this.stoppedCount = stoppedCount;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Computes build() {
                return new Computes(this);
            } 

        } 

    }
    public static class Managers extends TeaModel {
        @NameInMap("ExceptionCount")
        private Integer exceptionCount;

        @NameInMap("NormalCount")
        private Integer normalCount;

        @NameInMap("OperatingCount")
        private Integer operatingCount;

        @NameInMap("StoppedCount")
        private Integer stoppedCount;

        @NameInMap("Total")
        private Integer total;

        private Managers(Builder builder) {
            this.exceptionCount = builder.exceptionCount;
            this.normalCount = builder.normalCount;
            this.operatingCount = builder.operatingCount;
            this.stoppedCount = builder.stoppedCount;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Managers create() {
            return builder().build();
        }

        /**
         * @return exceptionCount
         */
        public Integer getExceptionCount() {
            return this.exceptionCount;
        }

        /**
         * @return normalCount
         */
        public Integer getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return operatingCount
         */
        public Integer getOperatingCount() {
            return this.operatingCount;
        }

        /**
         * @return stoppedCount
         */
        public Integer getStoppedCount() {
            return this.stoppedCount;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer exceptionCount; 
            private Integer normalCount; 
            private Integer operatingCount; 
            private Integer stoppedCount; 
            private Integer total; 

            /**
             * ExceptionCount.
             */
            public Builder exceptionCount(Integer exceptionCount) {
                this.exceptionCount = exceptionCount;
                return this;
            }

            /**
             * NormalCount.
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * OperatingCount.
             */
            public Builder operatingCount(Integer operatingCount) {
                this.operatingCount = operatingCount;
                return this;
            }

            /**
             * StoppedCount.
             */
            public Builder stoppedCount(Integer stoppedCount) {
                this.stoppedCount = stoppedCount;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Managers build() {
                return new Managers(this);
            } 

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
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Memory.
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
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Memory.
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
    public static class ClusterInfoSimple extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("BaseOsTag")
        private String baseOsTag;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("ComputeSpotPriceLimit")
        private Float computeSpotPriceLimit;

        @NameInMap("ComputeSpotStrategy")
        private String computeSpotStrategy;

        @NameInMap("Computes")
        private Computes computes;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Description")
        private String description;

        @NameInMap("EhpcVersion")
        private String ehpcVersion;

        @NameInMap("HasPlugin")
        private Boolean hasPlugin;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IsComputeEss")
        private Boolean isComputeEss;

        @NameInMap("Location")
        private String location;

        @NameInMap("LoginNodes")
        private String loginNodes;

        @NameInMap("Managers")
        private Managers managers;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodePrefix")
        private String nodePrefix;

        @NameInMap("NodeSuffix")
        private String nodeSuffix;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SchedulerType")
        private String schedulerType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalResources")
        private TotalResources totalResources;

        @NameInMap("UsedResources")
        private UsedResources usedResources;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ClusterInfoSimple(Builder builder) {
            this.accountType = builder.accountType;
            this.baseOsTag = builder.baseOsTag;
            this.clientVersion = builder.clientVersion;
            this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
            this.computeSpotStrategy = builder.computeSpotStrategy;
            this.computes = builder.computes;
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
            this.ehpcVersion = builder.ehpcVersion;
            this.hasPlugin = builder.hasPlugin;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.isComputeEss = builder.isComputeEss;
            this.location = builder.location;
            this.loginNodes = builder.loginNodes;
            this.managers = builder.managers;
            this.name = builder.name;
            this.nodePrefix = builder.nodePrefix;
            this.nodeSuffix = builder.nodeSuffix;
            this.osTag = builder.osTag;
            this.regionId = builder.regionId;
            this.schedulerType = builder.schedulerType;
            this.status = builder.status;
            this.totalResources = builder.totalResources;
            this.usedResources = builder.usedResources;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfoSimple create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return baseOsTag
         */
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return computeSpotPriceLimit
         */
        public Float getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        /**
         * @return computeSpotStrategy
         */
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
        }

        /**
         * @return computes
         */
        public Computes getComputes() {
            return this.computes;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ehpcVersion
         */
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        /**
         * @return hasPlugin
         */
        public Boolean getHasPlugin() {
            return this.hasPlugin;
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
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isComputeEss
         */
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return loginNodes
         */
        public String getLoginNodes() {
            return this.loginNodes;
        }

        /**
         * @return managers
         */
        public Managers getManagers() {
            return this.managers;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodePrefix
         */
        public String getNodePrefix() {
            return this.nodePrefix;
        }

        /**
         * @return nodeSuffix
         */
        public String getNodeSuffix() {
            return this.nodeSuffix;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
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
            private String accountType; 
            private String baseOsTag; 
            private String clientVersion; 
            private Float computeSpotPriceLimit; 
            private String computeSpotStrategy; 
            private Computes computes; 
            private Integer count; 
            private String createTime; 
            private String deployMode; 
            private String description; 
            private String ehpcVersion; 
            private Boolean hasPlugin; 
            private String id; 
            private String imageId; 
            private String imageOwnerAlias; 
            private String instanceChargeType; 
            private String instanceType; 
            private Boolean isComputeEss; 
            private String location; 
            private String loginNodes; 
            private Managers managers; 
            private String name; 
            private String nodePrefix; 
            private String nodeSuffix; 
            private String osTag; 
            private String regionId; 
            private String schedulerType; 
            private String status; 
            private TotalResources totalResources; 
            private UsedResources usedResources; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * BaseOsTag.
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * ComputeSpotPriceLimit.
             */
            public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
                this.computeSpotPriceLimit = computeSpotPriceLimit;
                return this;
            }

            /**
             * ComputeSpotStrategy.
             */
            public Builder computeSpotStrategy(String computeSpotStrategy) {
                this.computeSpotStrategy = computeSpotStrategy;
                return this;
            }

            /**
             * Computes.
             */
            public Builder computes(Computes computes) {
                this.computes = computes;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EhpcVersion.
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * HasPlugin.
             */
            public Builder hasPlugin(Boolean hasPlugin) {
                this.hasPlugin = hasPlugin;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageOwnerAlias.
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * IsComputeEss.
             */
            public Builder isComputeEss(Boolean isComputeEss) {
                this.isComputeEss = isComputeEss;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * LoginNodes.
             */
            public Builder loginNodes(String loginNodes) {
                this.loginNodes = loginNodes;
                return this;
            }

            /**
             * Managers.
             */
            public Builder managers(Managers managers) {
                this.managers = managers;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodePrefix.
             */
            public Builder nodePrefix(String nodePrefix) {
                this.nodePrefix = nodePrefix;
                return this;
            }

            /**
             * NodeSuffix.
             */
            public Builder nodeSuffix(String nodeSuffix) {
                this.nodeSuffix = nodeSuffix;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
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
             * SchedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalResources.
             */
            public Builder totalResources(TotalResources totalResources) {
                this.totalResources = totalResources;
                return this;
            }

            /**
             * UsedResources.
             */
            public Builder usedResources(UsedResources usedResources) {
                this.usedResources = usedResources;
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

            public ClusterInfoSimple build() {
                return new ClusterInfoSimple(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @NameInMap("ClusterInfoSimple")
        private java.util.List < ClusterInfoSimple> clusterInfoSimple;

        private Clusters(Builder builder) {
            this.clusterInfoSimple = builder.clusterInfoSimple;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterInfoSimple
         */
        public java.util.List < ClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

        public static final class Builder {
            private java.util.List < ClusterInfoSimple> clusterInfoSimple; 

            /**
             * ClusterInfoSimple.
             */
            public Builder clusterInfoSimple(java.util.List < ClusterInfoSimple> clusterInfoSimple) {
                this.clusterInfoSimple = clusterInfoSimple;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}

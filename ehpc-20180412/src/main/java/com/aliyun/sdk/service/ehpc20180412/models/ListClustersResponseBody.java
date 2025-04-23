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
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private Clusters clusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListClustersResponseBody model) {
            this.clusters = model.clusters;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of clusters.</p>
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Computes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionCount")
        private Integer exceptionCount;

        @com.aliyun.core.annotation.NameInMap("NormalCount")
        private Integer normalCount;

        @com.aliyun.core.annotation.NameInMap("OperatingCount")
        private Integer operatingCount;

        @com.aliyun.core.annotation.NameInMap("StoppedCount")
        private Integer stoppedCount;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Computes model) {
                this.exceptionCount = model.exceptionCount;
                this.normalCount = model.normalCount;
                this.operatingCount = model.operatingCount;
                this.stoppedCount = model.stoppedCount;
                this.total = model.total;
            } 

            /**
             * <p>The number of abnormal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceptionCount(Integer exceptionCount) {
                this.exceptionCount = exceptionCount;
                return this;
            }

            /**
             * <p>The number of normal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder operatingCount(Integer operatingCount) {
                this.operatingCount = operatingCount;
                return this;
            }

            /**
             * <p>The number of stopped nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder stoppedCount(Integer stoppedCount) {
                this.stoppedCount = stoppedCount;
                return this;
            }

            /**
             * <p>The total number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Managers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionCount")
        private Integer exceptionCount;

        @com.aliyun.core.annotation.NameInMap("NormalCount")
        private Integer normalCount;

        @com.aliyun.core.annotation.NameInMap("OperatingCount")
        private Integer operatingCount;

        @com.aliyun.core.annotation.NameInMap("StoppedCount")
        private Integer stoppedCount;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Managers model) {
                this.exceptionCount = model.exceptionCount;
                this.normalCount = model.normalCount;
                this.operatingCount = model.operatingCount;
                this.stoppedCount = model.stoppedCount;
                this.total = model.total;
            } 

            /**
             * <p>The number of abnormal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceptionCount(Integer exceptionCount) {
                this.exceptionCount = exceptionCount;
                return this;
            }

            /**
             * <p>The number of normal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * <p>The number of nodes that are being used in the queue. This includes those that are being initialized, installed, or released.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder operatingCount(Integer operatingCount) {
                this.operatingCount = operatingCount;
                return this;
            }

            /**
             * <p>The number of stopped nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder stoppedCount(Integer stoppedCount) {
                this.stoppedCount = stoppedCount;
                return this;
            }

            /**
             * <p>The total number of management nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The number of GPU cards. Unit: cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The number of GPU cards. Unit: cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class ClusterInfoSimple extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("BaseOsTag")
        private String baseOsTag;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("ComputeSpotPriceLimit")
        private Float computeSpotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("ComputeSpotStrategy")
        private String computeSpotStrategy;

        @com.aliyun.core.annotation.NameInMap("Computes")
        private Computes computes;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EhpcVersion")
        private String ehpcVersion;

        @com.aliyun.core.annotation.NameInMap("HasPlugin")
        private Boolean hasPlugin;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsComputeEss")
        private Boolean isComputeEss;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("LoginNodes")
        private String loginNodes;

        @com.aliyun.core.annotation.NameInMap("Managers")
        private Managers managers;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodePrefix")
        private String nodePrefix;

        @com.aliyun.core.annotation.NameInMap("NodeSuffix")
        private String nodeSuffix;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalResources")
        private TotalResources totalResources;

        @com.aliyun.core.annotation.NameInMap("UsedResources")
        private UsedResources usedResources;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private String resourceGroupId; 
            private String schedulerType; 
            private String status; 
            private TotalResources totalResources; 
            private UsedResources usedResources; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ClusterInfoSimple model) {
                this.accountType = model.accountType;
                this.baseOsTag = model.baseOsTag;
                this.clientVersion = model.clientVersion;
                this.computeSpotPriceLimit = model.computeSpotPriceLimit;
                this.computeSpotStrategy = model.computeSpotStrategy;
                this.computes = model.computes;
                this.count = model.count;
                this.createTime = model.createTime;
                this.deployMode = model.deployMode;
                this.description = model.description;
                this.ehpcVersion = model.ehpcVersion;
                this.hasPlugin = model.hasPlugin;
                this.id = model.id;
                this.imageId = model.imageId;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceType = model.instanceType;
                this.isComputeEss = model.isComputeEss;
                this.location = model.location;
                this.loginNodes = model.loginNodes;
                this.managers = model.managers;
                this.name = model.name;
                this.nodePrefix = model.nodePrefix;
                this.nodeSuffix = model.nodeSuffix;
                this.osTag = model.osTag;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.schedulerType = model.schedulerType;
                this.status = model.status;
                this.totalResources = model.totalResources;
                this.usedResources = model.usedResources;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The server type of the account. Valid values:</p>
             * <ul>
             * <li>nis</li>
             * <li>ldap</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The operating system tag of the base image. The tag was used only by the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * <p>The version of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.64</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The maximum hourly price for the ECS instance under the compute node. The return value can be accurate to three decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>0.034</p>
             */
            public Builder computeSpotPriceLimit(Float computeSpotPriceLimit) {
                this.computeSpotPriceLimit = computeSpotPriceLimit;
                return this;
            }

            /**
             * <p>The bidding method of the compute nodes. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: The instances of the compute node are preemptible instances. These types of instances have a specified maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instances of the compute node are preemptible instances. The price of these instances is based on the current market price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder computeSpotStrategy(String computeSpotStrategy) {
                this.computeSpotStrategy = computeSpotStrategy;
                return this;
            }

            /**
             * <p>The information about compute nodes.</p>
             */
            public Builder computes(Computes computes) {
                this.computes = computes;
                return this;
            }

            /**
             * <p>The number of compute nodes in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-30T07:39:20.000Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The mode in which the cluster was deployed. Valid values:</p>
             * <ul>
             * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
             * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>clusterdescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The version of E-HPC.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * <p>Indicates whether plug-ins were used in the cluster. Valid values:</p>
             * <ul>
             * <li>true: Plug-ins are used.</li>
             * <li>false: Plug-ins are not used.</li>
             * </ul>
             * <p>Default value: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasPlugin(Boolean hasPlugin) {
                this.hasPlugin = hasPlugin;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-jeJki6****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>wi_1607_x64_dtc_zh_40G_alibase****</p>
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
             * <p>The billing method of the nodes in the cluster. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance type of the compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Indicates whether a scaling group was enabled. Valid values:</p>
             * <ul>
             * <li>true: A scaling group is enabled.</li>
             * <li>false: No scaling group is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isComputeEss(Boolean isComputeEss) {
                this.isComputeEss = isComputeEss;
                return this;
            }

            /**
             * <p>The location where the cluster was deployed. Valid values:</p>
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
             * <p>The list of logon nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Id&quot;: &quot;i-bp13x4is8pvdhws7e****&quot;}</p>
             */
            public Builder loginNodes(String loginNodes) {
                this.loginNodes = loginNodes;
                return this;
            }

            /**
             * <p>The list of management nodes.</p>
             */
            public Builder managers(Managers managers) {
                this.managers = managers;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The prefix of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodePrefix(String nodePrefix) {
                this.nodePrefix = nodePrefix;
                return this;
            }

            /**
             * <p>The suffix of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder nodeSuffix(String nodeSuffix) {
                this.nodeSuffix = nodeSuffix;
                return this;
            }

            /**
             * <p>The operating system tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
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
             * <p>The resource group ID.You can call the ListResourceGroups operation to query the IDs of resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the scheduler. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>slurm</li>
             * <li>opengridscheduler</li>
             * <li>deadline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>uninit: The cluster is not initialized.</li>
             * <li>creating: The cluster is being created.</li>
             * <li>init: The cluster is being initialized.</li>
             * <li>running: The cluster is running.</li>
             * <li>exception: The cluster encounters an exception.</li>
             * <li>releasing: The cluster is being released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The statistics of all resources in the cluster.</p>
             */
            public Builder totalResources(TotalResources totalResources) {
                this.totalResources = totalResources;
                return this;
            }

            /**
             * <p>The number of consumed resources in the cluster.</p>
             */
            public Builder usedResources(UsedResources usedResources) {
                this.usedResources = usedResources;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1lfcjbfb099rrjn****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-b3f3edefefeep0760yju****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterInfoSimple")
        private java.util.List<ClusterInfoSimple> clusterInfoSimple;

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
        public java.util.List<ClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

        public static final class Builder {
            private java.util.List<ClusterInfoSimple> clusterInfoSimple; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterInfoSimple = model.clusterInfoSimple;
            } 

            /**
             * ClusterInfoSimple.
             */
            public Builder clusterInfoSimple(java.util.List<ClusterInfoSimple> clusterInfoSimple) {
                this.clusterInfoSimple = clusterInfoSimple;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}

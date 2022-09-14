// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
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

    private ListNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
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
         * Nodes.
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
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

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
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
    public static class NodeInfo extends TeaModel {
        @NameInMap("AddTime")
        private String addTime;

        @NameInMap("CreatedByEhpc")
        private Boolean createdByEhpc;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Role")
        private String role;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalResources")
        private TotalResources totalResources;

        @NameInMap("UsedResources")
        private UsedResources usedResources;

        private NodeInfo(Builder builder) {
            this.addTime = builder.addTime;
            this.createdByEhpc = builder.createdByEhpc;
            this.expired = builder.expired;
            this.expiredTime = builder.expiredTime;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.lockReason = builder.lockReason;
            this.regionId = builder.regionId;
            this.role = builder.role;
            this.spotStrategy = builder.spotStrategy;
            this.status = builder.status;
            this.totalResources = builder.totalResources;
            this.usedResources = builder.usedResources;
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
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
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

        public static final class Builder {
            private String addTime; 
            private Boolean createdByEhpc; 
            private Boolean expired; 
            private String expiredTime; 
            private String id; 
            private String imageId; 
            private String imageOwnerAlias; 
            private String lockReason; 
            private String regionId; 
            private String role; 
            private String spotStrategy; 
            private String status; 
            private TotalResources totalResources; 
            private UsedResources usedResources; 

            /**
             * AddTime.
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * CreatedByEhpc.
             */
            public Builder createdByEhpc(Boolean createdByEhpc) {
                this.createdByEhpc = createdByEhpc;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
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
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
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

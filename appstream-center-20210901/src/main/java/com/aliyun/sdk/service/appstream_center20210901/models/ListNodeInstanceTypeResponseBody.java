// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeInstanceTypeResponseBody</p>
 */
public class ListNodeInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeInstanceTypeModels")
    private java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNodeInstanceTypeResponseBody(Builder builder) {
        this.nodeInstanceTypeModels = builder.nodeInstanceTypeModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInstanceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeInstanceTypeModels
     */
    public java.util.List<NodeInstanceTypeModels> getNodeInstanceTypeModels() {
        return this.nodeInstanceTypeModels;
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
        private java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNodeInstanceTypeResponseBody model) {
            this.nodeInstanceTypeModels = model.nodeInstanceTypeModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The resource types.</p>
         */
        public Builder nodeInstanceTypeModels(java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels) {
            this.nodeInstanceTypeModels = nodeInstanceTypeModels;
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
         * <p>The number of entries on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodeInstanceTypeResponseBody build() {
            return new ListNodeInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeInstanceTypeResponseBody</p>
     */
    public static class NodeInstanceTypeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private String gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Long gpuMemory;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceTypeFamily")
        private String nodeInstanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("NodeTypeName")
        private String nodeTypeName;

        private NodeInstanceTypeModels(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.maxCapacity = builder.maxCapacity;
            this.memory = builder.memory;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.nodeInstanceTypeFamily = builder.nodeInstanceTypeFamily;
            this.nodeTypeName = builder.nodeTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstanceTypeModels create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public String getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return nodeInstanceTypeFamily
         */
        public String getNodeInstanceTypeFamily() {
            return this.nodeInstanceTypeFamily;
        }

        /**
         * @return nodeTypeName
         */
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public static final class Builder {
            private String cpu; 
            private String gpu; 
            private Long gpuMemory; 
            private Integer maxCapacity; 
            private Long memory; 
            private String nodeInstanceType; 
            private String nodeInstanceTypeFamily; 
            private String nodeTypeName; 

            private Builder() {
            } 

            private Builder(NodeInstanceTypeModels model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.maxCapacity = model.maxCapacity;
                this.memory = model.memory;
                this.nodeInstanceType = model.nodeInstanceType;
                this.nodeInstanceTypeFamily = model.nodeInstanceTypeFamily;
                this.nodeTypeName = model.nodeTypeName;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The GPU size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
             * <ul>
             * <li>appstreaming.general.4c8g: 1 to 2</li>
             * <li>appstreaming.general.8c16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The ID of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu.4c8g.2g</p>
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The resource type family.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>appstreaming.general: WUYING - General</li>
             * <li>appstreaming.vgpu: WUYING - Graphics</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu</p>
             */
            public Builder nodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
                this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
                return this;
            }

            /**
             * <p>The name of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>WUYING - General - 4 vCPUs 8 GB Memory</p>
             */
            public Builder nodeTypeName(String nodeTypeName) {
                this.nodeTypeName = nodeTypeName;
                return this;
            }

            public NodeInstanceTypeModels build() {
                return new NodeInstanceTypeModels(this);
            } 

        } 

    }
}

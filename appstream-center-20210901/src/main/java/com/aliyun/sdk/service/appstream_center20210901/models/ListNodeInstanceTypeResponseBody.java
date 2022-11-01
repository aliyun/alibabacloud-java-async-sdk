// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeInstanceTypeResponseBody</p>
 */
public class ListNodeInstanceTypeResponseBody extends TeaModel {
    @NameInMap("NodeInstanceTypeModels")
    private java.util.List < NodeInstanceTypeModels> nodeInstanceTypeModels;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return nodeInstanceTypeModels
     */
    public java.util.List < NodeInstanceTypeModels> getNodeInstanceTypeModels() {
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
        private java.util.List < NodeInstanceTypeModels> nodeInstanceTypeModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * NodeInstanceTypeModels.
         */
        public Builder nodeInstanceTypeModels(java.util.List < NodeInstanceTypeModels> nodeInstanceTypeModels) {
            this.nodeInstanceTypeModels = nodeInstanceTypeModels;
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
         * Id of the request
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

        public ListNodeInstanceTypeResponseBody build() {
            return new ListNodeInstanceTypeResponseBody(this);
        } 

    } 

    public static class NodeInstanceTypeModels extends TeaModel {
        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("Gpu")
        private String gpu;

        @NameInMap("GpuMemory")
        private Long gpuMemory;

        @NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @NameInMap("NodeInstanceTypeFamily")
        private String nodeInstanceTypeFamily;

        @NameInMap("NodeTypeName")
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

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * GpuMemory.
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * MaxCapacity.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NodeInstanceType.
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * NodeInstanceTypeFamily.
             */
            public Builder nodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
                this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
                return this;
            }

            /**
             * NodeTypeName.
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

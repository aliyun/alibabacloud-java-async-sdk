// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListServerIdeEcsSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerIdeEcsSpecsResponseBody</p>
 */
public class ListServerIdeEcsSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpecs> ecsSpecs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListServerIdeEcsSpecsResponseBody(Builder builder) {
        this.ecsSpecs = builder.ecsSpecs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerIdeEcsSpecsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List<EcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EcsSpecs> ecsSpecs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListServerIdeEcsSpecsResponseBody model) {
            this.ecsSpecs = model.ecsSpecs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>可选的 ECS 规格列表。</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>本次请求返回的最大结果数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>翻页标记，当还有更多数据时返回此值，下次请求传入即可获取后续数据。</p>
         * 
         * <strong>example:</strong>
         * <p>CAESG****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求 ID，用于问题定位与链路追踪。</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListServerIdeEcsSpecsResponseBody build() {
            return new ListServerIdeEcsSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServerIdeEcsSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerIdeEcsSpecsResponseBody</p>
     */
    public static class EcsSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorType")
        private String acceleratorType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Long gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemorySize")
        private Float gpuMemorySize;

        @com.aliyun.core.annotation.NameInMap("GpuType")
        private String gpuType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private EcsSpecs(Builder builder) {
            this.acceleratorType = builder.acceleratorType;
            this.cpu = builder.cpu;
            this.cu = builder.cu;
            this.gpu = builder.gpu;
            this.gpuMemorySize = builder.gpuMemorySize;
            this.gpuType = builder.gpuType;
            this.instanceType = builder.instanceType;
            this.isAvailable = builder.isAvailable;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSpecs create() {
            return builder().build();
        }

        /**
         * @return acceleratorType
         */
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return gpu
         */
        public Long getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemorySize
         */
        public Float getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        /**
         * @return gpuType
         */
        public String getGpuType() {
            return this.gpuType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String acceleratorType; 
            private Long cpu; 
            private Float cu; 
            private Long gpu; 
            private Float gpuMemorySize; 
            private String gpuType; 
            private String instanceType; 
            private Boolean isAvailable; 
            private Float memory; 

            private Builder() {
            } 

            private Builder(EcsSpecs model) {
                this.acceleratorType = model.acceleratorType;
                this.cpu = model.cpu;
                this.cu = model.cu;
                this.gpu = model.gpu;
                this.gpuMemorySize = model.gpuMemorySize;
                this.gpuType = model.gpuType;
                this.instanceType = model.instanceType;
                this.isAvailable = model.isAvailable;
                this.memory = model.memory;
            } 

            /**
             * <p>机器类型（CPU / GPU）。</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder acceleratorType(String acceleratorType) {
                this.acceleratorType = acceleratorType;
                return this;
            }

            /**
             * <p>CPU 核数。</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>该规格对应的 CU（计算单元）数。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>GPU 卡数。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Long gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>单卡 GPU 显存大小（GiB）。</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder gpuMemorySize(Float gpuMemorySize) {
                this.gpuMemorySize = gpuMemorySize;
                return this;
            }

            /**
             * <p>GPU 类型。</p>
             * 
             * <strong>example:</strong>
             * <p>V100</p>
             */
            public Builder gpuType(String gpuType) {
                this.gpuType = gpuType;
                return this;
            }

            /**
             * <p>ECS 实例规格类型。</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>该规格当前是否可用（有库存可售卖）。</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>内存大小（GiB）。</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public EcsSpecs build() {
                return new EcsSpecs(this);
            } 

        } 

    }
}

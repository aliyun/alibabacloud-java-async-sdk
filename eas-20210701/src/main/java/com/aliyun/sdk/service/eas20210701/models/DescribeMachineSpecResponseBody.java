// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeMachineSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMachineSpecResponseBody</p>
 */
public class DescribeMachineSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceMetas")
    private java.util.List<InstanceMetas> instanceMetas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<Types> types;

    private DescribeMachineSpecResponseBody(Builder builder) {
        this.instanceMetas = builder.instanceMetas;
        this.requestId = builder.requestId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMachineSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceMetas
     */
    public java.util.List<InstanceMetas> getInstanceMetas() {
        return this.instanceMetas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return types
     */
    public java.util.List<Types> getTypes() {
        return this.types;
    }

    public static final class Builder {
        private java.util.List<InstanceMetas> instanceMetas; 
        private String requestId; 
        private java.util.List<Types> types; 

        private Builder() {
        } 

        private Builder(DescribeMachineSpecResponseBody model) {
            this.instanceMetas = model.instanceMetas;
            this.requestId = model.requestId;
            this.types = model.types;
        } 

        /**
         * <p>The instance types when the resources are specified.</p>
         */
        public Builder instanceMetas(java.util.List<InstanceMetas> instanceMetas) {
            this.instanceMetas = instanceMetas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The values that can be supported when the number of CPUs and memory size are specified for deployment.</p>
         */
        public Builder types(java.util.List<Types> types) {
            this.types = types;
            return this;
        }

        public DescribeMachineSpecResponseBody build() {
            return new DescribeMachineSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMachineSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMachineSpecResponseBody</p>
     */
    public static class InstanceMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUAmount")
        private Integer GPUAmount;

        @com.aliyun.core.annotation.NameInMap("GPUMemory")
        private Float GPUMemory;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("NonProtectSpotDiscount")
        private Float nonProtectSpotDiscount;

        @com.aliyun.core.annotation.NameInMap("SpotDiscount")
        private Float spotDiscount;

        @com.aliyun.core.annotation.NameInMap("StockStatus")
        private String stockStatus;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private InstanceMetas(Builder builder) {
            this.CPU = builder.CPU;
            this.GPU = builder.GPU;
            this.GPUAmount = builder.GPUAmount;
            this.GPUMemory = builder.GPUMemory;
            this.instanceType = builder.instanceType;
            this.isAvailable = builder.isAvailable;
            this.memory = builder.memory;
            this.nonProtectSpotDiscount = builder.nonProtectSpotDiscount;
            this.spotDiscount = builder.spotDiscount;
            this.stockStatus = builder.stockStatus;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceMetas create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return GPUMemory
         */
        public Float getGPUMemory() {
            return this.GPUMemory;
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

        /**
         * @return nonProtectSpotDiscount
         */
        public Float getNonProtectSpotDiscount() {
            return this.nonProtectSpotDiscount;
        }

        /**
         * @return spotDiscount
         */
        public Float getSpotDiscount() {
            return this.spotDiscount;
        }

        /**
         * @return stockStatus
         */
        public String getStockStatus() {
            return this.stockStatus;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer CPU; 
            private String GPU; 
            private Integer GPUAmount; 
            private Float GPUMemory; 
            private String instanceType; 
            private Boolean isAvailable; 
            private Float memory; 
            private Float nonProtectSpotDiscount; 
            private Float spotDiscount; 
            private String stockStatus; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(InstanceMetas model) {
                this.CPU = model.CPU;
                this.GPU = model.GPU;
                this.GPUAmount = model.GPUAmount;
                this.GPUMemory = model.GPUMemory;
                this.instanceType = model.instanceType;
                this.isAvailable = model.isAvailable;
                this.memory = model.memory;
                this.nonProtectSpotDiscount = model.nonProtectSpotDiscount;
                this.spotDiscount = model.spotDiscount;
                this.stockStatus = model.stockStatus;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The number of CPU cores in the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The GPU type in the instance type. If the instance type is not a GPU-based instance type, this parameter does not exist.</p>
             * 
             * <strong>example:</strong>
             * <p>GU30</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The number of GPUs in the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * <p>The GPU memory in the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder GPUMemory(Float GPUMemory) {
                this.GPUMemory = GPUMemory;
                return this;
            }

            /**
             * <p>The name of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ml.gu7i.c32m188.1-gu30</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Indicates whether the instance type is available.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The memory size in the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>188</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum discount that can be accepted when the preemptible instance type does not include a usage duration. 0.1 indicates one fold. If this parameter is not returned, the bidding feature is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder nonProtectSpotDiscount(Float nonProtectSpotDiscount) {
                this.nonProtectSpotDiscount = nonProtectSpotDiscount;
                return this;
            }

            /**
             * <p>The minimum discount that can be accepted when the preemptible instance type has the 1-hour protection duration. 0.1 indicates one fold. If this parameter is not returned, the bidding feature is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
             */
            public Builder spotDiscount(Float spotDiscount) {
                this.spotDiscount = spotDiscount;
                return this;
            }

            /**
             * <p>The inventory status of the instance type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>WithStock</li>
             * <li>ClosedWithStock</li>
             * <li>NoStock</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WithStock</p>
             */
            public Builder stockStatus(String stockStatus) {
                this.stockStatus = stockStatus;
                return this;
            }

            /**
             * <p>The source of the instance type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ECS</li>
             * <li>BareMetal</li>
             * <li>Lingjun</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public InstanceMetas build() {
                return new InstanceMetas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMachineSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMachineSpecResponseBody</p>
     */
    public static class Types extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private java.util.List<Integer> memory;

        private Types(Builder builder) {
            this.CPU = builder.CPU;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Types create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return memory
         */
        public java.util.List<Integer> getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer CPU; 
            private java.util.List<Integer> memory; 

            private Builder() {
            } 

            private Builder(Types model) {
                this.CPU = model.CPU;
                this.memory = model.memory;
            } 

            /**
             * <p>Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The optional values for memory when CPU is set to a specific value as above.</p>
             */
            public Builder memory(java.util.List<Integer> memory) {
                this.memory = memory;
                return this;
            }

            public Types build() {
                return new Types(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsSpecsResponseBody</p>
 */
public class ListEcsSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpecs> ecsSpecs;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListEcsSpecsResponseBody(Builder builder) {
        this.code = builder.code;
        this.ecsSpecs = builder.ecsSpecs;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsSpecsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List<EcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<EcsSpecs> ecsSpecs; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEcsSpecsResponseBody model) {
            this.code = model.code;
            this.ecsSpecs = model.ecsSpecs;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>InternalError: an internal error. All errors, except for parameter validation errors, are classified as internal errors.</li>
         * <li>ValidationError: a parameter validation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The specifications of the ECS instances returned on this page.</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li>400</li>
         * <li>404</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEcsSpecsResponseBody build() {
            return new ListEcsSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsSpecsResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The label key added to the ECS specification.</p>
             * 
             * <strong>example:</strong>
             * <p>SupportResourcePackDeduction</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value added to the ECS specification.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEcsSpecsResponseBody</p>
     */
    public static class EcsSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorType")
        private String acceleratorType;

        @com.aliyun.core.annotation.NameInMap("CPU")
        private Long CPU;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private Long GPU;

        @com.aliyun.core.annotation.NameInMap("GPUMemorySize")
        private Float GPUMemorySize;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthRx")
        private Long instanceBandwidthRx;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("SpotStockStatus")
        private String spotStockStatus;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCapacity")
        private Long systemDiskCapacity;

        private EcsSpecs(Builder builder) {
            this.acceleratorType = builder.acceleratorType;
            this.CPU = builder.CPU;
            this.currency = builder.currency;
            this.GPU = builder.GPU;
            this.GPUMemorySize = builder.GPUMemorySize;
            this.GPUType = builder.GPUType;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceType = builder.instanceType;
            this.isAvailable = builder.isAvailable;
            this.labels = builder.labels;
            this.memory = builder.memory;
            this.price = builder.price;
            this.spotStockStatus = builder.spotStockStatus;
            this.systemDiskCapacity = builder.systemDiskCapacity;
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
         * @return CPU
         */
        public Long getCPU() {
            return this.CPU;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return GPU
         */
        public Long getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUMemorySize
         */
        public Float getGPUMemorySize() {
            return this.GPUMemorySize;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return instanceBandwidthRx
         */
        public Long getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
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
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return spotStockStatus
         */
        public String getSpotStockStatus() {
            return this.spotStockStatus;
        }

        /**
         * @return systemDiskCapacity
         */
        public Long getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public static final class Builder {
            private String acceleratorType; 
            private Long CPU; 
            private String currency; 
            private Long GPU; 
            private Float GPUMemorySize; 
            private String GPUType; 
            private Long instanceBandwidthRx; 
            private String instanceType; 
            private Boolean isAvailable; 
            private java.util.List<Labels> labels; 
            private Float memory; 
            private Double price; 
            private String spotStockStatus; 
            private Long systemDiskCapacity; 

            private Builder() {
            } 

            private Builder(EcsSpecs model) {
                this.acceleratorType = model.acceleratorType;
                this.CPU = model.CPU;
                this.currency = model.currency;
                this.GPU = model.GPU;
                this.GPUMemorySize = model.GPUMemorySize;
                this.GPUType = model.GPUType;
                this.instanceBandwidthRx = model.instanceBandwidthRx;
                this.instanceType = model.instanceType;
                this.isAvailable = model.isAvailable;
                this.labels = model.labels;
                this.memory = model.memory;
                this.price = model.price;
                this.spotStockStatus = model.spotStockStatus;
                this.systemDiskCapacity = model.systemDiskCapacity;
            } 

            /**
             * <p>The accelerator type.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder acceleratorType(String acceleratorType) {
                this.acceleratorType = acceleratorType;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder CPU(Long CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The currency unit.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder GPU(Long GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * GPUMemorySize.
             */
            public Builder GPUMemorySize(Float GPUMemorySize) {
                this.GPUMemorySize = GPUMemorySize;
                return this;
            }

            /**
             * <p>The GPU type. Valid values:</p>
             * <ul>
             * <li>V100</li>
             * <li>A100</li>
             * <li>A10</li>
             * <li>T4</li>
             * <li>P100</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>v100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>The inbound bandwidth of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5120000</p>
             */
            public Builder instanceBandwidthRx(Long instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn5-c28g1.7xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Indicates whether the resource was available.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The labels of the ECS specification.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;foo&quot;: &quot;bar&quot;}</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The price.</p>
             * 
             * <strong>example:</strong>
             * <p>22.8</p>
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * SpotStockStatus.
             */
            public Builder spotStockStatus(String spotStockStatus) {
                this.spotStockStatus = spotStockStatus;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder systemDiskCapacity(Long systemDiskCapacity) {
                this.systemDiskCapacity = systemDiskCapacity;
                return this;
            }

            public EcsSpecs build() {
                return new EcsSpecs(this);
            } 

        } 

    }
}

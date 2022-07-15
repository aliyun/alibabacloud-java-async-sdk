// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEcsSpecsResponseBody</p>
 */
public class ListEcsSpecsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EcsSpecs")
    private java.util.List < EcsSpecs> ecsSpecs;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List < EcsSpecs> getEcsSpecs() {
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
        private java.util.List < EcsSpecs> ecsSpecs; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * 状态码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 本分页中请求的实例列表
         */
        public Builder ecsSpecs(java.util.List < EcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * http状态码
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 成功标志
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 实例总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEcsSpecsResponseBody build() {
            return new ListEcsSpecsResponseBody(this);
        } 

    } 

    public static class EcsSpecs extends TeaModel {
        @NameInMap("AcceleratorType")
        private String acceleratorType;

        @NameInMap("CPU")
        private Long CPU;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("GPU")
        private Long GPU;

        @NameInMap("GPUType")
        private String GPUType;

        @NameInMap("InstanceBandwidthRx")
        private Long instanceBandwidthRx;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Price")
        private Double price;

        @NameInMap("SystemDiskCapacity")
        private Long systemDiskCapacity;

        private EcsSpecs(Builder builder) {
            this.acceleratorType = builder.acceleratorType;
            this.CPU = builder.CPU;
            this.currency = builder.currency;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.price = builder.price;
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
            private String GPUType; 
            private Long instanceBandwidthRx; 
            private String instanceType; 
            private Float memory; 
            private Double price; 
            private Long systemDiskCapacity; 

            /**
             * 资源类型
             */
            public Builder acceleratorType(String acceleratorType) {
                this.acceleratorType = acceleratorType;
                return this;
            }

            /**
             * CPU核数
             */
            public Builder CPU(Long CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * 货币单位
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * GPU卡数
             */
            public Builder GPU(Long GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * 显卡类型
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * 实例接收带宽
             */
            public Builder instanceBandwidthRx(Long instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * 实例规格
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 内存大小(GB)
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * 价格
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * 系统盘大小(GB)
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

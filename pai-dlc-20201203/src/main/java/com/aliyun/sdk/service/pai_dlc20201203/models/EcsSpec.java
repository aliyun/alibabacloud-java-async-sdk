// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link EcsSpec} extends {@link TeaModel}
 *
 * <p>EcsSpec</p>
 */
public class EcsSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("DefaultGPUDriver")
    private String defaultGPUDriver;

    @com.aliyun.core.annotation.NameInMap("Gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.NameInMap("GpuMemory")
    private Integer gpuMemory;

    @com.aliyun.core.annotation.NameInMap("GpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("IsAvailable")
    private Boolean isAvailable;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("NonProtectSpotDiscount")
    private Float nonProtectSpotDiscount;

    @com.aliyun.core.annotation.NameInMap("PaymentTypes")
    private java.util.List<String> paymentTypes;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("SpotStockStatus")
    private String spotStockStatus;

    @com.aliyun.core.annotation.NameInMap("SupportedGPUDrivers")
    private java.util.List<String> supportedGPUDrivers;

    private EcsSpec(Builder builder) {
        this.acceleratorType = builder.acceleratorType;
        this.cpu = builder.cpu;
        this.defaultGPUDriver = builder.defaultGPUDriver;
        this.gpu = builder.gpu;
        this.gpuMemory = builder.gpuMemory;
        this.gpuType = builder.gpuType;
        this.instanceType = builder.instanceType;
        this.isAvailable = builder.isAvailable;
        this.memory = builder.memory;
        this.nonProtectSpotDiscount = builder.nonProtectSpotDiscount;
        this.paymentTypes = builder.paymentTypes;
        this.resourceType = builder.resourceType;
        this.spotStockStatus = builder.spotStockStatus;
        this.supportedGPUDrivers = builder.supportedGPUDrivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcsSpec create() {
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
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return defaultGPUDriver
     */
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuMemory
     */
    public Integer getGpuMemory() {
        return this.gpuMemory;
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
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return nonProtectSpotDiscount
     */
    public Float getNonProtectSpotDiscount() {
        return this.nonProtectSpotDiscount;
    }

    /**
     * @return paymentTypes
     */
    public java.util.List<String> getPaymentTypes() {
        return this.paymentTypes;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return spotStockStatus
     */
    public String getSpotStockStatus() {
        return this.spotStockStatus;
    }

    /**
     * @return supportedGPUDrivers
     */
    public java.util.List<String> getSupportedGPUDrivers() {
        return this.supportedGPUDrivers;
    }

    public static final class Builder {
        private String acceleratorType; 
        private Integer cpu; 
        private String defaultGPUDriver; 
        private Integer gpu; 
        private Integer gpuMemory; 
        private String gpuType; 
        private String instanceType; 
        private Boolean isAvailable; 
        private Integer memory; 
        private Float nonProtectSpotDiscount; 
        private java.util.List<String> paymentTypes; 
        private String resourceType; 
        private String spotStockStatus; 
        private java.util.List<String> supportedGPUDrivers; 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * DefaultGPUDriver.
         */
        public Builder defaultGPUDriver(String defaultGPUDriver) {
            this.defaultGPUDriver = defaultGPUDriver;
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
         * GpuMemory.
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * GpuType.
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
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
         * IsAvailable.
         */
        public Builder isAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * NonProtectSpotDiscount.
         */
        public Builder nonProtectSpotDiscount(Float nonProtectSpotDiscount) {
            this.nonProtectSpotDiscount = nonProtectSpotDiscount;
            return this;
        }

        /**
         * PaymentTypes.
         */
        public Builder paymentTypes(java.util.List<String> paymentTypes) {
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
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
         * SupportedGPUDrivers.
         */
        public Builder supportedGPUDrivers(java.util.List<String> supportedGPUDrivers) {
            this.supportedGPUDrivers = supportedGPUDrivers;
            return this;
        }

        public EcsSpec build() {
            return new EcsSpec(this);
        } 

    } 

}

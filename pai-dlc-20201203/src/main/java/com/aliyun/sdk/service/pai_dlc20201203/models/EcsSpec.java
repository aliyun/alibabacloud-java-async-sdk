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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(EcsSpec model) {
            this.acceleratorType = model.acceleratorType;
            this.cpu = model.cpu;
            this.defaultGPUDriver = model.defaultGPUDriver;
            this.gpu = model.gpu;
            this.gpuMemory = model.gpuMemory;
            this.gpuType = model.gpuType;
            this.instanceType = model.instanceType;
            this.isAvailable = model.isAvailable;
            this.memory = model.memory;
            this.nonProtectSpotDiscount = model.nonProtectSpotDiscount;
            this.paymentTypes = model.paymentTypes;
            this.resourceType = model.resourceType;
            this.spotStockStatus = model.spotStockStatus;
            this.supportedGPUDrivers = model.supportedGPUDrivers;
        } 

        /**
         * <p>The accelerator type. Valid values:</p>
         * <ul>
         * <li>CPU</li>
         * <li>GPU</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GPU</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The default GPU driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>470.199.02</p>
         */
        public Builder defaultGPUDriver(String defaultGPUDriver) {
            this.defaultGPUDriver = defaultGPUDriver;
            return this;
        }

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA v100</p>
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6e-c12g1.3xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Indicates whether the instance type is available. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        /**
         * <p>The memory size. Unit: MiB or GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The discount on the current price of the preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder nonProtectSpotDiscount(Float nonProtectSpotDiscount) {
            this.nonProtectSpotDiscount = nonProtectSpotDiscount;
            return this;
        }

        /**
         * <p>The billing methods.</p>
         */
        public Builder paymentTypes(java.util.List<String> paymentTypes) {
            this.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>ECS</li>
         * <li>Lingjun</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The inventory status of preemptible instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WithStock</p>
         */
        public Builder spotStockStatus(String spotStockStatus) {
            this.spotStockStatus = spotStockStatus;
            return this;
        }

        /**
         * <p>The GPU driver versions.</p>
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

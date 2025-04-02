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
 * {@link QuotaDetail} extends {@link TeaModel}
 *
 * <p>QuotaDetail</p>
 */
public class QuotaDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUDetails")
    private java.util.List<GPUDetail> GPUDetails;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("GPUTypeFullName")
    private String GPUTypeFullName;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    private QuotaDetail(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.GPUDetails = builder.GPUDetails;
        this.GPUType = builder.GPUType;
        this.GPUTypeFullName = builder.GPUTypeFullName;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CPU
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * @return GPU
     */
    public String getGPU() {
        return this.GPU;
    }

    /**
     * @return GPUDetails
     */
    public java.util.List<GPUDetail> getGPUDetails() {
        return this.GPUDetails;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return GPUTypeFullName
     */
    public String getGPUTypeFullName() {
        return this.GPUTypeFullName;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private java.util.List<GPUDetail> GPUDetails; 
        private String GPUType; 
        private String GPUTypeFullName; 
        private String memory; 

        private Builder() {
        } 

        private Builder(QuotaDetail model) {
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.GPUDetails = model.GPUDetails;
            this.GPUType = model.GPUType;
            this.GPUTypeFullName = model.GPUTypeFullName;
            this.memory = model.memory;
        } 

        /**
         * CPU.
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * GPU.
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * GPUDetails.
         */
        public Builder GPUDetails(java.util.List<GPUDetail> GPUDetails) {
            this.GPUDetails = GPUDetails;
            return this;
        }

        /**
         * GPUType.
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * GPUTypeFullName.
         */
        public Builder GPUTypeFullName(String GPUTypeFullName) {
            this.GPUTypeFullName = GPUTypeFullName;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public QuotaDetail build() {
            return new QuotaDetail(this);
        } 

    } 

}

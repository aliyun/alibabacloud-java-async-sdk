// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaDetail} extends {@link TeaModel}
 *
 * <p>QuotaDetail</p>
 */
public class QuotaDetail extends TeaModel {
    @NameInMap("CPU")
    private String CPU;

    @NameInMap("GPU")
    private String GPU;

    @NameInMap("GPUDetails")
    private java.util.List < GPUDetail > GPUDetails;

    @NameInMap("GPUType")
    private String GPUType;

    @NameInMap("GPUTypeFullName")
    private String GPUTypeFullName;

    @NameInMap("Memory")
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
    public java.util.List < GPUDetail > getGPUDetails() {
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
        private java.util.List < GPUDetail > GPUDetails; 
        private String GPUType; 
        private String GPUTypeFullName; 
        private String memory; 

        /**
         * CPU核数
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * GPU卡数
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * GPU详情
         */
        public Builder GPUDetails(java.util.List < GPUDetail > GPUDetails) {
            this.GPUDetails = GPUDetails;
            return this;
        }

        /**
         * GPU卡型
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * GPU卡型全名
         */
        public Builder GPUTypeFullName(String GPUTypeFullName) {
            this.GPUTypeFullName = GPUTypeFullName;
            return this;
        }

        /**
         * 内存容量
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private Long CPU;

    @com.aliyun.core.annotation.NameInMap("ECSInstance")
    private String ECSInstance;

    @com.aliyun.core.annotation.NameInMap("GPUModel")
    private String GPUModel;

    @com.aliyun.core.annotation.NameInMap("GPUNum")
    private Long GPUNum;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RAM")
    private Long RAM;

    private Resource(Builder builder) {
        this.CPU = builder.CPU;
        this.ECSInstance = builder.ECSInstance;
        this.GPUModel = builder.GPUModel;
        this.GPUNum = builder.GPUNum;
        this.name = builder.name;
        this.RAM = builder.RAM;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    /**
     * @return CPU
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * @return ECSInstance
     */
    public String getECSInstance() {
        return this.ECSInstance;
    }

    /**
     * @return GPUModel
     */
    public String getGPUModel() {
        return this.GPUModel;
    }

    /**
     * @return GPUNum
     */
    public Long getGPUNum() {
        return this.GPUNum;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return RAM
     */
    public Long getRAM() {
        return this.RAM;
    }

    public static final class Builder {
        private Long CPU; 
        private String ECSInstance; 
        private String GPUModel; 
        private Long GPUNum; 
        private String name; 
        private Long RAM; 

        /**
         * CPU.
         */
        public Builder CPU(Long CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * ECSInstance.
         */
        public Builder ECSInstance(String ECSInstance) {
            this.ECSInstance = ECSInstance;
            return this;
        }

        /**
         * GPUModel.
         */
        public Builder GPUModel(String GPUModel) {
            this.GPUModel = GPUModel;
            return this;
        }

        /**
         * GPUNum.
         */
        public Builder GPUNum(Long GPUNum) {
            this.GPUNum = GPUNum;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RAM.
         */
        public Builder RAM(Long RAM) {
            this.RAM = RAM;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}

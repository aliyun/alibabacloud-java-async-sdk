// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Resource model) {
            this.CPU = model.CPU;
            this.ECSInstance = model.ECSInstance;
            this.GPUModel = model.GPUModel;
            this.GPUNum = model.GPUNum;
            this.name = model.name;
            this.RAM = model.RAM;
        } 

        /**
         * <p>The number of CPU cores. Valid values: 4 to 96.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder CPU(Long CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * <p>The Elastic Compute Service (ECS) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn5i-c2g1.large</p>
         */
        public Builder ECSInstance(String ECSInstance) {
            this.ECSInstance = ECSInstance;
            return this;
        }

        /**
         * <p>The GPU.</p>
         * 
         * <strong>example:</strong>
         * <p>string	NVIDIA_P4</p>
         */
        public Builder GPUModel(String GPUModel) {
            this.GPUModel = GPUModel;
            return this;
        }

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder GPUNum(Long GPUNum) {
            this.GPUNum = GPUNum;
            return this;
        }

        /**
         * <p>The displayed name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>string	ecs.gn5i-c2g1.large-2vCPU-8GB-1*NVIDIA_P4</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The RAM size. Unit: GB. Valid values: 30 to 736.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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

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
 * {@link ResourceLimit} extends {@link TeaModel}
 *
 * <p>ResourceLimit</p>
 */
public class ResourceLimit extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    private ResourceLimit(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceLimit create() {
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
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private String memory; 

        private Builder() {
        } 

        private Builder(ResourceLimit model) {
            this.CPU = model.CPU;
            this.GPU = model.GPU;
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
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public ResourceLimit build() {
            return new ResourceLimit(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link CapacityResource} extends {@link TeaModel}
 *
 * <p>CapacityResource</p>
 */
public class CapacityResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    private CapacityResource(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CapacityResource create() {
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

        private Builder(CapacityResource model) {
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

        public CapacityResource build() {
            return new CapacityResource(this);
        } 

    } 

}

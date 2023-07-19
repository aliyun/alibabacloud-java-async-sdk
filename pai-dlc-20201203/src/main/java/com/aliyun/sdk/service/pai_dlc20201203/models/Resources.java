// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Resources} extends {@link TeaModel}
 *
 * <p>Resources</p>
 */
public class Resources extends TeaModel {
    @NameInMap("CPU")
    private String CPU;

    @NameInMap("GPU")
    private String GPU;

    @NameInMap("Memory")
    private String memory;

    private Resources(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.memory = builder.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resources create() {
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
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private String memory; 

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

        public Resources build() {
            return new Resources(this);
        } 

    } 

}

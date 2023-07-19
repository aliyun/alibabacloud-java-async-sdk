// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GPUDetail} extends {@link TeaModel}
 *
 * <p>GPUDetail</p>
 */
public class GPUDetail extends TeaModel {
    @NameInMap("GPU")
    private String GPU;

    @NameInMap("GPUType")
    private String GPUType;

    @NameInMap("GPUTypeFullName")
    private String GPUTypeFullName;

    private GPUDetail(Builder builder) {
        this.GPU = builder.GPU;
        this.GPUType = builder.GPUType;
        this.GPUTypeFullName = builder.GPUTypeFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GPUDetail create() {
        return builder().build();
    }

    /**
     * @return GPU
     */
    public String getGPU() {
        return this.GPU;
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

    public static final class Builder {
        private String GPU; 
        private String GPUType; 
        private String GPUTypeFullName; 

        /**
         * GPU.
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
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

        public GPUDetail build() {
            return new GPUDetail(this);
        } 

    } 

}

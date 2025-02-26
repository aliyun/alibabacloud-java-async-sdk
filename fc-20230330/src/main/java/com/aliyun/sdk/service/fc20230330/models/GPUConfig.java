// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link GPUConfig} extends {@link TeaModel}
 *
 * <p>GPUConfig</p>
 */
public class GPUConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gpuMemorySize")
    private Integer gpuMemorySize;

    @com.aliyun.core.annotation.NameInMap("gpuType")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String gpuType;

    private GPUConfig(Builder builder) {
        this.gpuMemorySize = builder.gpuMemorySize;
        this.gpuType = builder.gpuType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GPUConfig create() {
        return builder().build();
    }

    /**
     * @return gpuMemorySize
     */
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    public static final class Builder {
        private Integer gpuMemorySize; 
        private String gpuType; 

        /**
         * gpuMemorySize.
         */
        public Builder gpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }

        /**
         * gpuType.
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        public GPUConfig build() {
            return new GPUConfig(this);
        } 

    } 

}

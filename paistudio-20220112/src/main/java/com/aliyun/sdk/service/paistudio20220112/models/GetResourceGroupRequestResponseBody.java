// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetResourceGroupRequestResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupRequestResponseBody</p>
 */
public class GetResourceGroupRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestCPU")
    private Integer requestCPU;

    @com.aliyun.core.annotation.NameInMap("requestGPU")
    private Integer requestGPU;

    @com.aliyun.core.annotation.NameInMap("requestGPUInfos")
    private java.util.List<GPUInfo> requestGPUInfos;

    @com.aliyun.core.annotation.NameInMap("requestMemory")
    private Integer requestMemory;

    private GetResourceGroupRequestResponseBody(Builder builder) {
        this.requestCPU = builder.requestCPU;
        this.requestGPU = builder.requestGPU;
        this.requestGPUInfos = builder.requestGPUInfos;
        this.requestMemory = builder.requestMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupRequestResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestCPU
     */
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    /**
     * @return requestGPU
     */
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    /**
     * @return requestGPUInfos
     */
    public java.util.List<GPUInfo> getRequestGPUInfos() {
        return this.requestGPUInfos;
    }

    /**
     * @return requestMemory
     */
    public Integer getRequestMemory() {
        return this.requestMemory;
    }

    public static final class Builder {
        private Integer requestCPU; 
        private Integer requestGPU; 
        private java.util.List<GPUInfo> requestGPUInfos; 
        private Integer requestMemory; 

        private Builder() {
        } 

        private Builder(GetResourceGroupRequestResponseBody model) {
            this.requestCPU = model.requestCPU;
            this.requestGPU = model.requestGPU;
            this.requestGPUInfos = model.requestGPUInfos;
            this.requestMemory = model.requestMemory;
        } 

        /**
         * requestCPU.
         */
        public Builder requestCPU(Integer requestCPU) {
            this.requestCPU = requestCPU;
            return this;
        }

        /**
         * requestGPU.
         */
        public Builder requestGPU(Integer requestGPU) {
            this.requestGPU = requestGPU;
            return this;
        }

        /**
         * requestGPUInfos.
         */
        public Builder requestGPUInfos(java.util.List<GPUInfo> requestGPUInfos) {
            this.requestGPUInfos = requestGPUInfos;
            return this;
        }

        /**
         * requestMemory.
         */
        public Builder requestMemory(Integer requestMemory) {
            this.requestMemory = requestMemory;
            return this;
        }

        public GetResourceGroupRequestResponseBody build() {
            return new GetResourceGroupRequestResponseBody(this);
        } 

    } 

}

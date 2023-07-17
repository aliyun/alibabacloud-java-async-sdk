// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupRequestResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupRequestResponseBody</p>
 */
public class GetResourceGroupRequestResponseBody extends TeaModel {
    @NameInMap("requestCPU")
    private Integer requestCPU;

    @NameInMap("requestGPU")
    private Integer requestGPU;

    @NameInMap("requestGPUInfos")
    private java.util.List < GPUInfo > requestGPUInfos;

    @NameInMap("requestMemory")
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
    public java.util.List < GPUInfo > getRequestGPUInfos() {
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
        private java.util.List < GPUInfo > requestGPUInfos; 
        private Integer requestMemory; 

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
        public Builder requestGPUInfos(java.util.List < GPUInfo > requestGPUInfos) {
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupTotalResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupTotalResponseBody</p>
 */
public class GetResourceGroupTotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("totalCPU")
    private Integer totalCPU;

    @com.aliyun.core.annotation.NameInMap("totalGPU")
    private Integer totalGPU;

    @com.aliyun.core.annotation.NameInMap("totalGPUInfos")
    private java.util.List < GPUInfo > totalGPUInfos;

    @com.aliyun.core.annotation.NameInMap("totalMemory")
    private Integer totalMemory;

    private GetResourceGroupTotalResponseBody(Builder builder) {
        this.totalCPU = builder.totalCPU;
        this.totalGPU = builder.totalGPU;
        this.totalGPUInfos = builder.totalGPUInfos;
        this.totalMemory = builder.totalMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return totalCPU
     */
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    /**
     * @return totalGPU
     */
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    /**
     * @return totalGPUInfos
     */
    public java.util.List < GPUInfo > getTotalGPUInfos() {
        return this.totalGPUInfos;
    }

    /**
     * @return totalMemory
     */
    public Integer getTotalMemory() {
        return this.totalMemory;
    }

    public static final class Builder {
        private Integer totalCPU; 
        private Integer totalGPU; 
        private java.util.List < GPUInfo > totalGPUInfos; 
        private Integer totalMemory; 

        /**
         * totalCPU.
         */
        public Builder totalCPU(Integer totalCPU) {
            this.totalCPU = totalCPU;
            return this;
        }

        /**
         * totalGPU.
         */
        public Builder totalGPU(Integer totalGPU) {
            this.totalGPU = totalGPU;
            return this;
        }

        /**
         * totalGPUInfos.
         */
        public Builder totalGPUInfos(java.util.List < GPUInfo > totalGPUInfos) {
            this.totalGPUInfos = totalGPUInfos;
            return this;
        }

        /**
         * totalMemory.
         */
        public Builder totalMemory(Integer totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }

        public GetResourceGroupTotalResponseBody build() {
            return new GetResourceGroupTotalResponseBody(this);
        } 

    } 

}

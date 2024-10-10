// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleConfig} extends {@link TeaModel}
 *
 * <p>ScaleConfig</p>
 */
public class ScaleConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @com.aliyun.core.annotation.NameInMap("maximumInstanceCount")
    private Long maximumInstanceCount;

    @com.aliyun.core.annotation.NameInMap("minimumInstanceCount")
    private Long minimumInstanceCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ScaleConfig(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.minimumInstanceCount = builder.minimumInstanceCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleConfig create() {
        return builder().build();
    }

    /**
     * @return alwaysAllocateCPU
     */
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    /**
     * @return maximumInstanceCount
     */
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    /**
     * @return minimumInstanceCount
     */
    public Long getMinimumInstanceCount() {
        return this.minimumInstanceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean alwaysAllocateCPU; 
        private Long maximumInstanceCount; 
        private Long minimumInstanceCount; 
        private String requestId; 

        /**
         * alwaysAllocateCPU.
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * maximumInstanceCount.
         */
        public Builder maximumInstanceCount(Long maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }

        /**
         * minimumInstanceCount.
         */
        public Builder minimumInstanceCount(Long minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ScaleConfig build() {
            return new ScaleConfig(this);
        } 

    } 

}

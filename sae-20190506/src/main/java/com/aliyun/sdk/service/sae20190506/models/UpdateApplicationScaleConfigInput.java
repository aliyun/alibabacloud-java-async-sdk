// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateApplicationScaleConfigInput} extends {@link TeaModel}
 *
 * <p>UpdateApplicationScaleConfigInput</p>
 */
public class UpdateApplicationScaleConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @com.aliyun.core.annotation.NameInMap("maximumInstanceCount")
    @com.aliyun.core.annotation.Validation(maximum = 5000)
    private Long maximumInstanceCount;

    @com.aliyun.core.annotation.NameInMap("minimumInstanceCount")
    @com.aliyun.core.annotation.Validation(maximum = 5000)
    private Long minimumInstanceCount;

    private UpdateApplicationScaleConfigInput(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.minimumInstanceCount = builder.minimumInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationScaleConfigInput create() {
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

    public static final class Builder {
        private Boolean alwaysAllocateCPU; 
        private Long maximumInstanceCount; 
        private Long minimumInstanceCount; 

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

        public UpdateApplicationScaleConfigInput build() {
            return new UpdateApplicationScaleConfigInput(this);
        } 

    } 

}

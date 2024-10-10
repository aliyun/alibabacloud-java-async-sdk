// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWebApplicationScalingConfigInput} extends {@link TeaModel}
 *
 * <p>UpdateWebApplicationScalingConfigInput</p>
 */
public class UpdateWebApplicationScalingConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaximumInstanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maximumInstanceCount;

    @com.aliyun.core.annotation.NameInMap("MinimumInstanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long minimumInstanceCount;

    private UpdateWebApplicationScalingConfigInput(Builder builder) {
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.minimumInstanceCount = builder.minimumInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebApplicationScalingConfigInput create() {
        return builder().build();
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
        private Long maximumInstanceCount; 
        private Long minimumInstanceCount; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maximumInstanceCount(Long maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder minimumInstanceCount(Long minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            return this;
        }

        public UpdateWebApplicationScalingConfigInput build() {
            return new UpdateWebApplicationScalingConfigInput(this);
        } 

    } 

}

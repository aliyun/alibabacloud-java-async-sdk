// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebScalingConfig} extends {@link TeaModel}
 *
 * <p>WebScalingConfig</p>
 */
public class WebScalingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaximumInstanceCount")
    private Long maximumInstanceCount;

    @com.aliyun.core.annotation.NameInMap("MinimumInstanceCount")
    private Long minimumInstanceCount;

    private WebScalingConfig(Builder builder) {
        this.maximumInstanceCount = builder.maximumInstanceCount;
        this.minimumInstanceCount = builder.minimumInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebScalingConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(WebScalingConfig model) {
            this.maximumInstanceCount = model.maximumInstanceCount;
            this.minimumInstanceCount = model.minimumInstanceCount;
        } 

        /**
         * MaximumInstanceCount.
         */
        public Builder maximumInstanceCount(Long maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }

        /**
         * MinimumInstanceCount.
         */
        public Builder minimumInstanceCount(Long minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            return this;
        }

        public WebScalingConfig build() {
            return new WebScalingConfig(this);
        } 

    } 

}

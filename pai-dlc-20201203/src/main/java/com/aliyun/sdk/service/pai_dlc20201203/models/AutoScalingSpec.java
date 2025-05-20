// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AutoScalingSpec} extends {@link TeaModel}
 *
 * <p>AutoScalingSpec</p>
 */
public class AutoScalingSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ScalingStrategy")
    private String scalingStrategy;

    private AutoScalingSpec(Builder builder) {
        this.scalingStrategy = builder.scalingStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoScalingSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scalingStrategy
     */
    public String getScalingStrategy() {
        return this.scalingStrategy;
    }

    public static final class Builder {
        private String scalingStrategy; 

        private Builder() {
        } 

        private Builder(AutoScalingSpec model) {
            this.scalingStrategy = model.scalingStrategy;
        } 

        /**
         * ScalingStrategy.
         */
        public Builder scalingStrategy(String scalingStrategy) {
            this.scalingStrategy = scalingStrategy;
            return this;
        }

        public AutoScalingSpec build() {
            return new AutoScalingSpec(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ScalingConstraints} extends {@link TeaModel}
 *
 * <p>ScalingConstraints</p>
 */
public class ScalingConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxCapacity")
    private Integer maxCapacity;

    @com.aliyun.core.annotation.NameInMap("MinCapacity")
    private Integer minCapacity;

    private ScalingConstraints(Builder builder) {
        this.maxCapacity = builder.maxCapacity;
        this.minCapacity = builder.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingConstraints create() {
        return builder().build();
    }

    /**
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    public static final class Builder {
        private Integer maxCapacity; 
        private Integer minCapacity; 

        /**
         * <p>最大值。</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder maxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * <p>最小值。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public ScalingConstraints build() {
            return new ScalingConstraints(this);
        } 

    } 

}

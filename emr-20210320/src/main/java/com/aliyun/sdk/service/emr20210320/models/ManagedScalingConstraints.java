// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ManagedScalingConstraints} extends {@link TeaModel}
 *
 * <p>ManagedScalingConstraints</p>
 */
public class ManagedScalingConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxCapacity")
    private Integer maxCapacity;

    @com.aliyun.core.annotation.NameInMap("MaxOnDemandCapacity")
    private Integer maxOnDemandCapacity;

    @com.aliyun.core.annotation.NameInMap("MinCapacity")
    private Integer minCapacity;

    private ManagedScalingConstraints(Builder builder) {
        this.maxCapacity = builder.maxCapacity;
        this.maxOnDemandCapacity = builder.maxOnDemandCapacity;
        this.minCapacity = builder.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManagedScalingConstraints create() {
        return builder().build();
    }

    /**
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * @return maxOnDemandCapacity
     */
    public Integer getMaxOnDemandCapacity() {
        return this.maxOnDemandCapacity;
    }

    /**
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    public static final class Builder {
        private Integer maxCapacity; 
        private Integer maxOnDemandCapacity; 
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
         * <p>最大按量节点数量</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxOnDemandCapacity(Integer maxOnDemandCapacity) {
            this.maxOnDemandCapacity = maxOnDemandCapacity;
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

        public ManagedScalingConstraints build() {
            return new ManagedScalingConstraints(this);
        } 

    } 

}

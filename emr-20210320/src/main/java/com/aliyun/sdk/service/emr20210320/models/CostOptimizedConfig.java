// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostOptimizedConfig} extends {@link TeaModel}
 *
 * <p>CostOptimizedConfig</p>
 */
public class CostOptimizedConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer onDemandBaseCapacity;

    @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer onDemandPercentageAboveBaseCapacity;

    @com.aliyun.core.annotation.NameInMap("SpotInstancePools")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer spotInstancePools;

    private CostOptimizedConfig(Builder builder) {
        this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
        this.spotInstancePools = builder.spotInstancePools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostOptimizedConfig create() {
        return builder().build();
    }

    /**
     * @return onDemandBaseCapacity
     */
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * @return onDemandPercentageAboveBaseCapacity
     */
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * @return spotInstancePools
     */
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public static final class Builder {
        private Integer onDemandBaseCapacity; 
        private Integer onDemandPercentageAboveBaseCapacity; 
        private Integer spotInstancePools; 

        /**
         * 按量实例个数的最小值。节点组所需要按量实例个数的最小值，取值范围：0~1000。当按量实例个数少于该值时，将优先创建按量实例。
         */
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * 节点组满足最小按量实例OnDemandBaseCapacity要求后，超出的实例中按量实例应占的比例，取值范围：0～100。
         */
        public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }

        /**
         * 指定可用实例规格的个数，伸缩组将按成本最低的多个规格均衡创建抢占式实例。取值范围：0~10。
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }

        public CostOptimizedConfig build() {
            return new CostOptimizedConfig(this);
        } 

    } 

}

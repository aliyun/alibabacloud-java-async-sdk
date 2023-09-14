// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpotPriceLimit} extends {@link TeaModel}
 *
 * <p>SpotPriceLimit</p>
 */
public class SpotPriceLimit extends TeaModel {
    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("PriceLimit")
    private Double priceLimit;

    private SpotPriceLimit(Builder builder) {
        this.instanceType = builder.instanceType;
        this.priceLimit = builder.priceLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotPriceLimit create() {
        return builder().build();
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return priceLimit
     */
    public Double getPriceLimit() {
        return this.priceLimit;
    }

    public static final class Builder {
        private String instanceType; 
        private Double priceLimit; 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * PriceLimit.
         */
        public Builder priceLimit(Double priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }

        public SpotPriceLimit build() {
            return new SpotPriceLimit(this);
        } 

    } 

}

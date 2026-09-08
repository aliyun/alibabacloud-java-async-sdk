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
 * {@link SpotSpec} extends {@link TeaModel}
 *
 * <p>SpotSpec</p>
 */
public class SpotSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SpotDiscountLimit")
    private Float spotDiscountLimit;

    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    private SpotSpec(Builder builder) {
        this.spotDiscountLimit = builder.spotDiscountLimit;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spotDiscountLimit
     */
    public Float getSpotDiscountLimit() {
        return this.spotDiscountLimit;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public static final class Builder {
        private Float spotDiscountLimit; 
        private Float spotPriceLimit; 
        private String spotStrategy; 

        private Builder() {
        } 

        private Builder(SpotSpec model) {
            this.spotDiscountLimit = model.spotDiscountLimit;
            this.spotPriceLimit = model.spotPriceLimit;
            this.spotStrategy = model.spotStrategy;
        } 

        /**
         * <p>The maximum discount. Specify only one of SpotDiscountLimit and SpotPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        public Builder spotDiscountLimit(Float spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }

        /**
         * <p>The maximum price. Unit: CNY/minute. Specify only one of SpotDiscountLimit and SpotPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4744</p>
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The spot policy. Valid values:</p>
         * <ul>
         * <li>SpotWithPriceLimit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        public SpotSpec build() {
            return new SpotSpec(this);
        } 

    } 

}

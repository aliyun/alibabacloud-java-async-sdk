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
 * {@link ElasticSpotSpec} extends {@link TeaModel}
 *
 * <p>ElasticSpotSpec</p>
 */
public class ElasticSpotSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("SpotDiscountLimit")
    private Double spotDiscountLimit;

    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Double spotPriceLimit;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    private ElasticSpotSpec(Builder builder) {
        this.instanceType = builder.instanceType;
        this.spotDiscountLimit = builder.spotDiscountLimit;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElasticSpotSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return spotDiscountLimit
     */
    public Double getSpotDiscountLimit() {
        return this.spotDiscountLimit;
    }

    /**
     * @return spotPriceLimit
     */
    public Double getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public static final class Builder {
        private String instanceType; 
        private Double spotDiscountLimit; 
        private Double spotPriceLimit; 
        private String spotStrategy; 

        private Builder() {
        } 

        private Builder(ElasticSpotSpec model) {
            this.instanceType = model.instanceType;
            this.spotDiscountLimit = model.spotDiscountLimit;
            this.spotPriceLimit = model.spotPriceLimit;
            this.spotStrategy = model.spotStrategy;
        } 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * SpotDiscountLimit.
         */
        public Builder spotDiscountLimit(Double spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        public ElasticSpotSpec build() {
            return new ElasticSpotSpec(this);
        } 

    } 

}

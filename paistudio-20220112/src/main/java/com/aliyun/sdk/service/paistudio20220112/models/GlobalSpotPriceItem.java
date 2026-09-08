// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GlobalSpotPriceItem} extends {@link TeaModel}
 *
 * <p>GlobalSpotPriceItem</p>
 */
public class GlobalSpotPriceItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effectiveAt")
    private String effectiveAt;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("spotDiscount")
    private String spotDiscount;

    private GlobalSpotPriceItem(Builder builder) {
        this.effectiveAt = builder.effectiveAt;
        this.instanceType = builder.instanceType;
        this.spotDiscount = builder.spotDiscount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalSpotPriceItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveAt
     */
    public String getEffectiveAt() {
        return this.effectiveAt;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return spotDiscount
     */
    public String getSpotDiscount() {
        return this.spotDiscount;
    }

    public static final class Builder {
        private String effectiveAt; 
        private String instanceType; 
        private String spotDiscount; 

        private Builder() {
        } 

        private Builder(GlobalSpotPriceItem model) {
            this.effectiveAt = model.effectiveAt;
            this.instanceType = model.instanceType;
            this.spotDiscount = model.spotDiscount;
        } 

        /**
         * <p>The effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T06:45:00Z</p>
         */
        public Builder effectiveAt(String effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ml.gp7vf.16.40xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The current market price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder spotDiscount(String spotDiscount) {
            this.spotDiscount = spotDiscount;
            return this;
        }

        public GlobalSpotPriceItem build() {
            return new GlobalSpotPriceItem(this);
        } 

    } 

}

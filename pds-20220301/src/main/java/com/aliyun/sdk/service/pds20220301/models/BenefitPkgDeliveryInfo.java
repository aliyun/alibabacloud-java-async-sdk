// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link BenefitPkgDeliveryInfo} extends {@link TeaModel}
 *
 * <p>BenefitPkgDeliveryInfo</p>
 */
public class BenefitPkgDeliveryInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("amount")
    private Long amount;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("expire_time")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("is_permanent")
    private Boolean isPermanent;

    private BenefitPkgDeliveryInfo(Builder builder) {
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.expireTime = builder.expireTime;
        this.isPermanent = builder.isPermanent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BenefitPkgDeliveryInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return isPermanent
     */
    public Boolean getIsPermanent() {
        return this.isPermanent;
    }

    public static final class Builder {
        private Long amount; 
        private String createdAt; 
        private String expireTime; 
        private Boolean isPermanent; 

        private Builder() {
        } 

        private Builder(BenefitPkgDeliveryInfo model) {
            this.amount = model.amount;
            this.createdAt = model.createdAt;
            this.expireTime = model.expireTime;
            this.isPermanent = model.isPermanent;
        } 

        /**
         * amount.
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * expire_time.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * is_permanent.
         */
        public Builder isPermanent(Boolean isPermanent) {
            this.isPermanent = isPermanent;
            return this;
        }

        public BenefitPkgDeliveryInfo build() {
            return new BenefitPkgDeliveryInfo(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateCreditPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateCreditPackageRequest</p>
 */
public class CreateCreditPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelCookie")
    private String channelCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditAmount")
    private String creditAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageAmount")
    private String packageAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private CreateCreditPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.channelCookie = builder.channelCookie;
        this.creditAmount = builder.creditAmount;
        this.packageAmount = builder.packageAmount;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCreditPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return channelCookie
     */
    public String getChannelCookie() {
        return this.channelCookie;
    }

    /**
     * @return creditAmount
     */
    public String getCreditAmount() {
        return this.creditAmount;
    }

    /**
     * @return packageAmount
     */
    public String getPackageAmount() {
        return this.packageAmount;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<CreateCreditPackageRequest, Builder> {
        private Boolean autoPay; 
        private String channelCookie; 
        private String creditAmount; 
        private String packageAmount; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCreditPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.channelCookie = request.channelCookie;
            this.creditAmount = request.creditAmount;
            this.packageAmount = request.packageAmount;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ChannelCookie.
         */
        public Builder channelCookie(String channelCookie) {
            this.putQueryParameter("ChannelCookie", channelCookie);
            this.channelCookie = channelCookie;
            return this;
        }

        /**
         * CreditAmount.
         */
        public Builder creditAmount(String creditAmount) {
            this.putQueryParameter("CreditAmount", creditAmount);
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * PackageAmount.
         */
        public Builder packageAmount(String packageAmount) {
            this.putQueryParameter("PackageAmount", packageAmount);
            this.packageAmount = packageAmount;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public CreateCreditPackageRequest build() {
            return new CreateCreditPackageRequest(this);
        } 

    } 

}

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
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong> (default): generates an order without charging your account.</li>
         * </ul>
         * <blockquote>
         * <p>If your payment method has an insufficient balance, set this parameter to false. An unpaid order is generated, and you can log on to the Elastic Cloud Phone console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The number of credits.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <p>The duration for which you want to purchase the resource. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the duration for which you want to purchase the resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: month.</li>
         * <li><strong>Year</strong>: year.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the promotional campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
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

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
 * {@link RenewMobileAgentPackageRequest} extends {@link RequestModel}
 *
 * <p>RenewMobileAgentPackageRequest</p>
 */
public class RenewMobileAgentPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileAgentPackageIds")
    private java.util.List<String> mobileAgentPackageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidCallbackUrl")
    private String paidCallbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private RenewMobileAgentPackageRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.mobileAgentPackageIds = builder.mobileAgentPackageIds;
        this.paidCallbackUrl = builder.paidCallbackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewMobileAgentPackageRequest create() {
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
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return mobileAgentPackageIds
     */
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
    }

    /**
     * @return paidCallbackUrl
     */
    public String getPaidCallbackUrl() {
        return this.paidCallbackUrl;
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

    public static final class Builder extends Request.Builder<RenewMobileAgentPackageRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private java.util.List<String> mobileAgentPackageIds; 
        private String paidCallbackUrl; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(RenewMobileAgentPackageRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.mobileAgentPackageIds = request.mobileAgentPackageIds;
            this.paidCallbackUrl = request.paidCallbackUrl;
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
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * MobileAgentPackageIds.
         */
        public Builder mobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
            this.putQueryParameter("MobileAgentPackageIds", mobileAgentPackageIds);
            this.mobileAgentPackageIds = mobileAgentPackageIds;
            return this;
        }

        /**
         * PaidCallbackUrl.
         */
        public Builder paidCallbackUrl(String paidCallbackUrl) {
            this.putQueryParameter("PaidCallbackUrl", paidCallbackUrl);
            this.paidCallbackUrl = paidCallbackUrl;
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
        public RenewMobileAgentPackageRequest build() {
            return new RenewMobileAgentPackageRequest(this);
        } 

    } 

}

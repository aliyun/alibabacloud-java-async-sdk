// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsCallNumOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateCmsCallNumOrderRequest</p>
 */
public class CreateCmsCallNumOrderRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PhoneCount")
    private String phoneCount;

    private CreateCmsCallNumOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneCount = builder.phoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCmsCallNumOrderRequest create() {
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
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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
     * @return phoneCount
     */
    public String getPhoneCount() {
        return this.phoneCount;
    }

    public static final class Builder extends Request.Builder<CreateCmsCallNumOrderRequest, Builder> {
        private Boolean autoPay; 
        private Integer autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private Integer period; 
        private String periodUnit; 
        private String phoneCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateCmsCallNumOrderRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.phoneCount = request.phoneCount;
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
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
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
         * PhoneCount.
         */
        public Builder phoneCount(String phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        @Override
        public CreateCmsCallNumOrderRequest build() {
            return new CreateCmsCallNumOrderRequest(this);
        } 

    } 

}

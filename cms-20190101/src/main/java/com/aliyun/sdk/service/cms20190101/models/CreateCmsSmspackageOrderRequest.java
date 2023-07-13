// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsSmspackageOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateCmsSmspackageOrderRequest</p>
 */
public class CreateCmsSmspackageOrderRequest extends Request {
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
    @NameInMap("SmsCount")
    private String smsCount;

    private CreateCmsSmspackageOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.smsCount = builder.smsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCmsSmspackageOrderRequest create() {
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
     * @return smsCount
     */
    public String getSmsCount() {
        return this.smsCount;
    }

    public static final class Builder extends Request.Builder<CreateCmsSmspackageOrderRequest, Builder> {
        private Boolean autoPay; 
        private Integer autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private Integer period; 
        private String periodUnit; 
        private String smsCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateCmsSmspackageOrderRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.smsCount = request.smsCount;
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
         * SmsCount.
         */
        public Builder smsCount(String smsCount) {
            this.putQueryParameter("SmsCount", smsCount);
            this.smsCount = smsCount;
            return this;
        }

        @Override
        public CreateCmsSmspackageOrderRequest build() {
            return new CreateCmsSmspackageOrderRequest(this);
        } 

    } 

}

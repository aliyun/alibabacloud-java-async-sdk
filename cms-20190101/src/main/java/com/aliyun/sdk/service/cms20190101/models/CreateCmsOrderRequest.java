// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateCmsOrderRequest</p>
 */
public class CreateCmsOrderRequest extends Request {
    @Query
    @NameInMap("ApiCount")
    private String apiCount;

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
    @NameInMap("CustomTimeSeries")
    private String customTimeSeries;

    @Query
    @NameInMap("EventStoreNum")
    private String eventStoreNum;

    @Query
    @NameInMap("EventStoreTime")
    private String eventStoreTime;

    @Query
    @NameInMap("LogMonitorStream")
    private String logMonitorStream;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PhoneCount")
    private String phoneCount;

    @Query
    @NameInMap("SiteEcsNum")
    private String siteEcsNum;

    @Query
    @NameInMap("SiteOperatorNum")
    private String siteOperatorNum;

    @Query
    @NameInMap("SiteTaskNum")
    private String siteTaskNum;

    @Query
    @NameInMap("SmsCount")
    private String smsCount;

    @Query
    @NameInMap("SuggestType")
    private String suggestType;

    private CreateCmsOrderRequest(Builder builder) {
        super(builder);
        this.apiCount = builder.apiCount;
        this.autoPay = builder.autoPay;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.customTimeSeries = builder.customTimeSeries;
        this.eventStoreNum = builder.eventStoreNum;
        this.eventStoreTime = builder.eventStoreTime;
        this.logMonitorStream = builder.logMonitorStream;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneCount = builder.phoneCount;
        this.siteEcsNum = builder.siteEcsNum;
        this.siteOperatorNum = builder.siteOperatorNum;
        this.siteTaskNum = builder.siteTaskNum;
        this.smsCount = builder.smsCount;
        this.suggestType = builder.suggestType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCmsOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiCount
     */
    public String getApiCount() {
        return this.apiCount;
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
     * @return customTimeSeries
     */
    public String getCustomTimeSeries() {
        return this.customTimeSeries;
    }

    /**
     * @return eventStoreNum
     */
    public String getEventStoreNum() {
        return this.eventStoreNum;
    }

    /**
     * @return eventStoreTime
     */
    public String getEventStoreTime() {
        return this.eventStoreTime;
    }

    /**
     * @return logMonitorStream
     */
    public String getLogMonitorStream() {
        return this.logMonitorStream;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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

    /**
     * @return siteEcsNum
     */
    public String getSiteEcsNum() {
        return this.siteEcsNum;
    }

    /**
     * @return siteOperatorNum
     */
    public String getSiteOperatorNum() {
        return this.siteOperatorNum;
    }

    /**
     * @return siteTaskNum
     */
    public String getSiteTaskNum() {
        return this.siteTaskNum;
    }

    /**
     * @return smsCount
     */
    public String getSmsCount() {
        return this.smsCount;
    }

    /**
     * @return suggestType
     */
    public String getSuggestType() {
        return this.suggestType;
    }

    public static final class Builder extends Request.Builder<CreateCmsOrderRequest, Builder> {
        private String apiCount; 
        private Boolean autoPay; 
        private Integer autoRenewPeriod; 
        private Boolean autoUseCoupon; 
        private String customTimeSeries; 
        private String eventStoreNum; 
        private String eventStoreTime; 
        private String logMonitorStream; 
        private String payType; 
        private Integer period; 
        private String periodUnit; 
        private String phoneCount; 
        private String siteEcsNum; 
        private String siteOperatorNum; 
        private String siteTaskNum; 
        private String smsCount; 
        private String suggestType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCmsOrderRequest request) {
            super(request);
            this.apiCount = request.apiCount;
            this.autoPay = request.autoPay;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.autoUseCoupon = request.autoUseCoupon;
            this.customTimeSeries = request.customTimeSeries;
            this.eventStoreNum = request.eventStoreNum;
            this.eventStoreTime = request.eventStoreTime;
            this.logMonitorStream = request.logMonitorStream;
            this.payType = request.payType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.phoneCount = request.phoneCount;
            this.siteEcsNum = request.siteEcsNum;
            this.siteOperatorNum = request.siteOperatorNum;
            this.siteTaskNum = request.siteTaskNum;
            this.smsCount = request.smsCount;
            this.suggestType = request.suggestType;
        } 

        /**
         * ApiCount.
         */
        public Builder apiCount(String apiCount) {
            this.putQueryParameter("ApiCount", apiCount);
            this.apiCount = apiCount;
            return this;
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
         * CustomTimeSeries.
         */
        public Builder customTimeSeries(String customTimeSeries) {
            this.putQueryParameter("CustomTimeSeries", customTimeSeries);
            this.customTimeSeries = customTimeSeries;
            return this;
        }

        /**
         * EventStoreNum.
         */
        public Builder eventStoreNum(String eventStoreNum) {
            this.putQueryParameter("EventStoreNum", eventStoreNum);
            this.eventStoreNum = eventStoreNum;
            return this;
        }

        /**
         * EventStoreTime.
         */
        public Builder eventStoreTime(String eventStoreTime) {
            this.putQueryParameter("EventStoreTime", eventStoreTime);
            this.eventStoreTime = eventStoreTime;
            return this;
        }

        /**
         * LogMonitorStream.
         */
        public Builder logMonitorStream(String logMonitorStream) {
            this.putQueryParameter("LogMonitorStream", logMonitorStream);
            this.logMonitorStream = logMonitorStream;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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

        /**
         * SiteEcsNum.
         */
        public Builder siteEcsNum(String siteEcsNum) {
            this.putQueryParameter("SiteEcsNum", siteEcsNum);
            this.siteEcsNum = siteEcsNum;
            return this;
        }

        /**
         * SiteOperatorNum.
         */
        public Builder siteOperatorNum(String siteOperatorNum) {
            this.putQueryParameter("SiteOperatorNum", siteOperatorNum);
            this.siteOperatorNum = siteOperatorNum;
            return this;
        }

        /**
         * SiteTaskNum.
         */
        public Builder siteTaskNum(String siteTaskNum) {
            this.putQueryParameter("SiteTaskNum", siteTaskNum);
            this.siteTaskNum = siteTaskNum;
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

        /**
         * SuggestType.
         */
        public Builder suggestType(String suggestType) {
            this.putQueryParameter("SuggestType", suggestType);
            this.suggestType = suggestType;
            return this;
        }

        @Override
        public CreateCmsOrderRequest build() {
            return new CreateCmsOrderRequest(this);
        } 

    } 

}

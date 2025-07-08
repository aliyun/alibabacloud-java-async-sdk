// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryWarningThresholdNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWarningThresholdNewResponseBody</p>
 */
public class QueryWarningThresholdNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("ContactPhone")
    private String contactPhone;

    @com.aliyun.core.annotation.NameInMap("DailyHaltLimit")
    private Integer dailyHaltLimit;

    @com.aliyun.core.annotation.NameInMap("DailyWarningLimit")
    private Integer dailyWarningLimit;

    @com.aliyun.core.annotation.NameInMap("DomesticDailySuccess")
    private Long domesticDailySuccess;

    @com.aliyun.core.annotation.NameInMap("DomesticDailyTotal")
    private Long domesticDailyTotal;

    @com.aliyun.core.annotation.NameInMap("DomesticMonthlySuccess")
    private Long domesticMonthlySuccess;

    @com.aliyun.core.annotation.NameInMap("DomesticMonthlyTotal")
    private Long domesticMonthlyTotal;

    @com.aliyun.core.annotation.NameInMap("MonthlyHaltLimit")
    private Integer monthlyHaltLimit;

    @com.aliyun.core.annotation.NameInMap("MonthlyWarningLimit")
    private Integer monthlyWarningLimit;

    @com.aliyun.core.annotation.NameInMap("OutDailySuccess")
    private Long outDailySuccess;

    @com.aliyun.core.annotation.NameInMap("OutDailyTotal")
    private Long outDailyTotal;

    @com.aliyun.core.annotation.NameInMap("OutMonthlySuccess")
    private Long outMonthlySuccess;

    @com.aliyun.core.annotation.NameInMap("OutMonthlyTotal")
    private Long outMonthlyTotal;

    @com.aliyun.core.annotation.NameInMap("PrevWaringNotice")
    private Boolean prevWaringNotice;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryWarningThresholdNewResponseBody(Builder builder) {
        this.bizType = builder.bizType;
        this.contactPhone = builder.contactPhone;
        this.dailyHaltLimit = builder.dailyHaltLimit;
        this.dailyWarningLimit = builder.dailyWarningLimit;
        this.domesticDailySuccess = builder.domesticDailySuccess;
        this.domesticDailyTotal = builder.domesticDailyTotal;
        this.domesticMonthlySuccess = builder.domesticMonthlySuccess;
        this.domesticMonthlyTotal = builder.domesticMonthlyTotal;
        this.monthlyHaltLimit = builder.monthlyHaltLimit;
        this.monthlyWarningLimit = builder.monthlyWarningLimit;
        this.outDailySuccess = builder.outDailySuccess;
        this.outDailyTotal = builder.outDailyTotal;
        this.outMonthlySuccess = builder.outMonthlySuccess;
        this.outMonthlyTotal = builder.outMonthlyTotal;
        this.prevWaringNotice = builder.prevWaringNotice;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWarningThresholdNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return contactPhone
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * @return dailyHaltLimit
     */
    public Integer getDailyHaltLimit() {
        return this.dailyHaltLimit;
    }

    /**
     * @return dailyWarningLimit
     */
    public Integer getDailyWarningLimit() {
        return this.dailyWarningLimit;
    }

    /**
     * @return domesticDailySuccess
     */
    public Long getDomesticDailySuccess() {
        return this.domesticDailySuccess;
    }

    /**
     * @return domesticDailyTotal
     */
    public Long getDomesticDailyTotal() {
        return this.domesticDailyTotal;
    }

    /**
     * @return domesticMonthlySuccess
     */
    public Long getDomesticMonthlySuccess() {
        return this.domesticMonthlySuccess;
    }

    /**
     * @return domesticMonthlyTotal
     */
    public Long getDomesticMonthlyTotal() {
        return this.domesticMonthlyTotal;
    }

    /**
     * @return monthlyHaltLimit
     */
    public Integer getMonthlyHaltLimit() {
        return this.monthlyHaltLimit;
    }

    /**
     * @return monthlyWarningLimit
     */
    public Integer getMonthlyWarningLimit() {
        return this.monthlyWarningLimit;
    }

    /**
     * @return outDailySuccess
     */
    public Long getOutDailySuccess() {
        return this.outDailySuccess;
    }

    /**
     * @return outDailyTotal
     */
    public Long getOutDailyTotal() {
        return this.outDailyTotal;
    }

    /**
     * @return outMonthlySuccess
     */
    public Long getOutMonthlySuccess() {
        return this.outMonthlySuccess;
    }

    /**
     * @return outMonthlyTotal
     */
    public Long getOutMonthlyTotal() {
        return this.outMonthlyTotal;
    }

    /**
     * @return prevWaringNotice
     */
    public Boolean getPrevWaringNotice() {
        return this.prevWaringNotice;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bizType; 
        private String contactPhone; 
        private Integer dailyHaltLimit; 
        private Integer dailyWarningLimit; 
        private Long domesticDailySuccess; 
        private Long domesticDailyTotal; 
        private Long domesticMonthlySuccess; 
        private Long domesticMonthlyTotal; 
        private Integer monthlyHaltLimit; 
        private Integer monthlyWarningLimit; 
        private Long outDailySuccess; 
        private Long outDailyTotal; 
        private Long outMonthlySuccess; 
        private Long outMonthlyTotal; 
        private Boolean prevWaringNotice; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryWarningThresholdNewResponseBody model) {
            this.bizType = model.bizType;
            this.contactPhone = model.contactPhone;
            this.dailyHaltLimit = model.dailyHaltLimit;
            this.dailyWarningLimit = model.dailyWarningLimit;
            this.domesticDailySuccess = model.domesticDailySuccess;
            this.domesticDailyTotal = model.domesticDailyTotal;
            this.domesticMonthlySuccess = model.domesticMonthlySuccess;
            this.domesticMonthlyTotal = model.domesticMonthlyTotal;
            this.monthlyHaltLimit = model.monthlyHaltLimit;
            this.monthlyWarningLimit = model.monthlyWarningLimit;
            this.outDailySuccess = model.outDailySuccess;
            this.outDailyTotal = model.outDailyTotal;
            this.outMonthlySuccess = model.outMonthlySuccess;
            this.outMonthlyTotal = model.outMonthlyTotal;
            this.prevWaringNotice = model.prevWaringNotice;
            this.requestId = model.requestId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * ContactPhone.
         */
        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        /**
         * DailyHaltLimit.
         */
        public Builder dailyHaltLimit(Integer dailyHaltLimit) {
            this.dailyHaltLimit = dailyHaltLimit;
            return this;
        }

        /**
         * DailyWarningLimit.
         */
        public Builder dailyWarningLimit(Integer dailyWarningLimit) {
            this.dailyWarningLimit = dailyWarningLimit;
            return this;
        }

        /**
         * DomesticDailySuccess.
         */
        public Builder domesticDailySuccess(Long domesticDailySuccess) {
            this.domesticDailySuccess = domesticDailySuccess;
            return this;
        }

        /**
         * DomesticDailyTotal.
         */
        public Builder domesticDailyTotal(Long domesticDailyTotal) {
            this.domesticDailyTotal = domesticDailyTotal;
            return this;
        }

        /**
         * DomesticMonthlySuccess.
         */
        public Builder domesticMonthlySuccess(Long domesticMonthlySuccess) {
            this.domesticMonthlySuccess = domesticMonthlySuccess;
            return this;
        }

        /**
         * DomesticMonthlyTotal.
         */
        public Builder domesticMonthlyTotal(Long domesticMonthlyTotal) {
            this.domesticMonthlyTotal = domesticMonthlyTotal;
            return this;
        }

        /**
         * MonthlyHaltLimit.
         */
        public Builder monthlyHaltLimit(Integer monthlyHaltLimit) {
            this.monthlyHaltLimit = monthlyHaltLimit;
            return this;
        }

        /**
         * MonthlyWarningLimit.
         */
        public Builder monthlyWarningLimit(Integer monthlyWarningLimit) {
            this.monthlyWarningLimit = monthlyWarningLimit;
            return this;
        }

        /**
         * OutDailySuccess.
         */
        public Builder outDailySuccess(Long outDailySuccess) {
            this.outDailySuccess = outDailySuccess;
            return this;
        }

        /**
         * OutDailyTotal.
         */
        public Builder outDailyTotal(Long outDailyTotal) {
            this.outDailyTotal = outDailyTotal;
            return this;
        }

        /**
         * OutMonthlySuccess.
         */
        public Builder outMonthlySuccess(Long outMonthlySuccess) {
            this.outMonthlySuccess = outMonthlySuccess;
            return this;
        }

        /**
         * OutMonthlyTotal.
         */
        public Builder outMonthlyTotal(Long outMonthlyTotal) {
            this.outMonthlyTotal = outMonthlyTotal;
            return this;
        }

        /**
         * PrevWaringNotice.
         */
        public Builder prevWaringNotice(Boolean prevWaringNotice) {
            this.prevWaringNotice = prevWaringNotice;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryWarningThresholdNewResponseBody build() {
            return new QueryWarningThresholdNewResponseBody(this);
        } 

    } 

}

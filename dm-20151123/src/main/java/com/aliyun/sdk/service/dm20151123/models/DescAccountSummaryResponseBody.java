// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescAccountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescAccountSummaryResponseBody</p>
 */
public class DescAccountSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyQuota")
    private Integer dailyQuota;

    @com.aliyun.core.annotation.NameInMap("DayuStatus")
    private Integer dayuStatus;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private Integer domains;

    @com.aliyun.core.annotation.NameInMap("EnableTimes")
    private Integer enableTimes;

    @com.aliyun.core.annotation.NameInMap("MailAddresses")
    private Integer mailAddresses;

    @com.aliyun.core.annotation.NameInMap("MaxQuotaLevel")
    private Integer maxQuotaLevel;

    @com.aliyun.core.annotation.NameInMap("MonthQuota")
    private Integer monthQuota;

    @com.aliyun.core.annotation.NameInMap("QuotaLevel")
    private Integer quotaLevel;

    @com.aliyun.core.annotation.NameInMap("Receivers")
    private Integer receivers;

    @com.aliyun.core.annotation.NameInMap("RemainFreeQuota")
    private Integer remainFreeQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsRecord")
    private Integer smsRecord;

    @com.aliyun.core.annotation.NameInMap("SmsSign")
    private Integer smsSign;

    @com.aliyun.core.annotation.NameInMap("SmsTemplates")
    private Integer smsTemplates;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Integer tags;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private Integer templates;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private Integer userStatus;

    private DescAccountSummaryResponseBody(Builder builder) {
        this.dailyQuota = builder.dailyQuota;
        this.dayuStatus = builder.dayuStatus;
        this.domains = builder.domains;
        this.enableTimes = builder.enableTimes;
        this.mailAddresses = builder.mailAddresses;
        this.maxQuotaLevel = builder.maxQuotaLevel;
        this.monthQuota = builder.monthQuota;
        this.quotaLevel = builder.quotaLevel;
        this.receivers = builder.receivers;
        this.remainFreeQuota = builder.remainFreeQuota;
        this.requestId = builder.requestId;
        this.smsRecord = builder.smsRecord;
        this.smsSign = builder.smsSign;
        this.smsTemplates = builder.smsTemplates;
        this.tags = builder.tags;
        this.templates = builder.templates;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescAccountSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return dailyQuota
     */
    public Integer getDailyQuota() {
        return this.dailyQuota;
    }

    /**
     * @return dayuStatus
     */
    public Integer getDayuStatus() {
        return this.dayuStatus;
    }

    /**
     * @return domains
     */
    public Integer getDomains() {
        return this.domains;
    }

    /**
     * @return enableTimes
     */
    public Integer getEnableTimes() {
        return this.enableTimes;
    }

    /**
     * @return mailAddresses
     */
    public Integer getMailAddresses() {
        return this.mailAddresses;
    }

    /**
     * @return maxQuotaLevel
     */
    public Integer getMaxQuotaLevel() {
        return this.maxQuotaLevel;
    }

    /**
     * @return monthQuota
     */
    public Integer getMonthQuota() {
        return this.monthQuota;
    }

    /**
     * @return quotaLevel
     */
    public Integer getQuotaLevel() {
        return this.quotaLevel;
    }

    /**
     * @return receivers
     */
    public Integer getReceivers() {
        return this.receivers;
    }

    /**
     * @return remainFreeQuota
     */
    public Integer getRemainFreeQuota() {
        return this.remainFreeQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsRecord
     */
    public Integer getSmsRecord() {
        return this.smsRecord;
    }

    /**
     * @return smsSign
     */
    public Integer getSmsSign() {
        return this.smsSign;
    }

    /**
     * @return smsTemplates
     */
    public Integer getSmsTemplates() {
        return this.smsTemplates;
    }

    /**
     * @return tags
     */
    public Integer getTags() {
        return this.tags;
    }

    /**
     * @return templates
     */
    public Integer getTemplates() {
        return this.templates;
    }

    /**
     * @return userStatus
     */
    public Integer getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder {
        private Integer dailyQuota; 
        private Integer dayuStatus; 
        private Integer domains; 
        private Integer enableTimes; 
        private Integer mailAddresses; 
        private Integer maxQuotaLevel; 
        private Integer monthQuota; 
        private Integer quotaLevel; 
        private Integer receivers; 
        private Integer remainFreeQuota; 
        private String requestId; 
        private Integer smsRecord; 
        private Integer smsSign; 
        private Integer smsTemplates; 
        private Integer tags; 
        private Integer templates; 
        private Integer userStatus; 

        /**
         * DailyQuota.
         */
        public Builder dailyQuota(Integer dailyQuota) {
            this.dailyQuota = dailyQuota;
            return this;
        }

        /**
         * DayuStatus.
         */
        public Builder dayuStatus(Integer dayuStatus) {
            this.dayuStatus = dayuStatus;
            return this;
        }

        /**
         * Domains.
         */
        public Builder domains(Integer domains) {
            this.domains = domains;
            return this;
        }

        /**
         * EnableTimes.
         */
        public Builder enableTimes(Integer enableTimes) {
            this.enableTimes = enableTimes;
            return this;
        }

        /**
         * MailAddresses.
         */
        public Builder mailAddresses(Integer mailAddresses) {
            this.mailAddresses = mailAddresses;
            return this;
        }

        /**
         * MaxQuotaLevel.
         */
        public Builder maxQuotaLevel(Integer maxQuotaLevel) {
            this.maxQuotaLevel = maxQuotaLevel;
            return this;
        }

        /**
         * MonthQuota.
         */
        public Builder monthQuota(Integer monthQuota) {
            this.monthQuota = monthQuota;
            return this;
        }

        /**
         * QuotaLevel.
         */
        public Builder quotaLevel(Integer quotaLevel) {
            this.quotaLevel = quotaLevel;
            return this;
        }

        /**
         * Receivers.
         */
        public Builder receivers(Integer receivers) {
            this.receivers = receivers;
            return this;
        }

        /**
         * RemainFreeQuota.
         */
        public Builder remainFreeQuota(Integer remainFreeQuota) {
            this.remainFreeQuota = remainFreeQuota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmsRecord.
         */
        public Builder smsRecord(Integer smsRecord) {
            this.smsRecord = smsRecord;
            return this;
        }

        /**
         * SmsSign.
         */
        public Builder smsSign(Integer smsSign) {
            this.smsSign = smsSign;
            return this;
        }

        /**
         * SmsTemplates.
         */
        public Builder smsTemplates(Integer smsTemplates) {
            this.smsTemplates = smsTemplates;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Integer tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(Integer templates) {
            this.templates = templates;
            return this;
        }

        /**
         * UserStatus.
         */
        public Builder userStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public DescAccountSummaryResponseBody build() {
            return new DescAccountSummaryResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DescAccountSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescAccountSummaryResponseBody</p>
 */
public class DescAccountSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyQuota")
    private Integer dailyQuota;

    @com.aliyun.core.annotation.NameInMap("DailyRemainFreeQuota")
    private Integer dailyRemainFreeQuota;

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
        this.dailyRemainFreeQuota = builder.dailyRemainFreeQuota;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyQuota
     */
    public Integer getDailyQuota() {
        return this.dailyQuota;
    }

    /**
     * @return dailyRemainFreeQuota
     */
    public Integer getDailyRemainFreeQuota() {
        return this.dailyRemainFreeQuota;
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
        private Integer dailyRemainFreeQuota; 
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

        private Builder() {
        } 

        private Builder(DescAccountSummaryResponseBody model) {
            this.dailyQuota = model.dailyQuota;
            this.dailyRemainFreeQuota = model.dailyRemainFreeQuota;
            this.dayuStatus = model.dayuStatus;
            this.domains = model.domains;
            this.enableTimes = model.enableTimes;
            this.mailAddresses = model.mailAddresses;
            this.maxQuotaLevel = model.maxQuotaLevel;
            this.monthQuota = model.monthQuota;
            this.quotaLevel = model.quotaLevel;
            this.receivers = model.receivers;
            this.remainFreeQuota = model.remainFreeQuota;
            this.requestId = model.requestId;
            this.smsRecord = model.smsRecord;
            this.smsSign = model.smsSign;
            this.smsTemplates = model.smsTemplates;
            this.tags = model.tags;
            this.templates = model.templates;
            this.userStatus = model.userStatus;
        } 

        /**
         * <p>Daily quota</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder dailyQuota(Integer dailyQuota) {
            this.dailyQuota = dailyQuota;
            return this;
        }

        /**
         * <p>remaining amount of daily free quota</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder dailyRemainFreeQuota(Integer dailyRemainFreeQuota) {
            this.dailyRemainFreeQuota = dailyRemainFreeQuota;
            return this;
        }

        /**
         * <p>Dayu status (deprecated, retained for compatibility reasons.)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dayuStatus(Integer dayuStatus) {
            this.dayuStatus = dayuStatus;
            return this;
        }

        /**
         * <p>Number of domains</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domains(Integer domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>Effective time</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder enableTimes(Integer enableTimes) {
            this.enableTimes = enableTimes;
            return this;
        }

        /**
         * <p>Number of sending addresses</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mailAddresses(Integer mailAddresses) {
            this.mailAddresses = mailAddresses;
            return this;
        }

        /**
         * <p>Maximum level</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxQuotaLevel(Integer maxQuotaLevel) {
            this.maxQuotaLevel = maxQuotaLevel;
            return this;
        }

        /**
         * <p>Monthly quota</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        public Builder monthQuota(Integer monthQuota) {
            this.monthQuota = monthQuota;
            return this;
        }

        /**
         * <p>Credit level</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder quotaLevel(Integer quotaLevel) {
            this.quotaLevel = quotaLevel;
            return this;
        }

        /**
         * <p>Number of recipients</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder receivers(Integer receivers) {
            this.receivers = receivers;
            return this;
        }

        /**
         * <p>Remaining amount of total free quota</p>
         * 
         * <strong>example:</strong>
         * <p>1910</p>
         */
        public Builder remainFreeQuota(Integer remainFreeQuota) {
            this.remainFreeQuota = remainFreeQuota;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>82B295BB-7E69-491F-9896-ECEAFF09E1A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Deprecated, retained for compatibility reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsRecord(Integer smsRecord) {
            this.smsRecord = smsRecord;
            return this;
        }

        /**
         * <p>Deprecated, retained for compatibility reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsSign(Integer smsSign) {
            this.smsSign = smsSign;
            return this;
        }

        /**
         * <p>Deprecated, retained for compatibility reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder smsTemplates(Integer smsTemplates) {
            this.smsTemplates = smsTemplates;
            return this;
        }

        /**
         * <p>Number of tags</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder tags(Integer tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>Number of templates</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templates(Integer templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>User status:
         * 1 Frozen
         * 2 In arrears
         * 4 Restricted from sending
         * 8 Logically deleted</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

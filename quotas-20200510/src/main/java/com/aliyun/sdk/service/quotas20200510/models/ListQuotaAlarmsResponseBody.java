// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaAlarmsResponseBody</p>
 */
public class ListQuotaAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaAlarms")
    private java.util.List < QuotaAlarms> quotaAlarms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaAlarmsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaAlarms = builder.quotaAlarms;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaAlarmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotaAlarms
     */
    public java.util.List < QuotaAlarms> getQuotaAlarms() {
        return this.quotaAlarms;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < QuotaAlarms> quotaAlarms; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The maximum number of records that are returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position at which the query ends.
         * <p>
         * 
         * > An empty value indicates that all data is returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The details about the quota alert.
         */
        public Builder quotaAlarms(java.util.List < QuotaAlarms> quotaAlarms) {
            this.quotaAlarms = quotaAlarms;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of quota alerts.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaAlarmsResponseBody build() {
            return new ListQuotaAlarmsResponseBody(this);
        } 

    } 

    public static class QuotaAlarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private String alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExceedThreshold")
        private Boolean exceedThreshold;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyTarget")
        private String notifyTarget;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaDimensions")
        private java.util.Map < String, ? > quotaDimensions;

        @com.aliyun.core.annotation.NameInMap("QuotaUsage")
        private Float quotaUsage;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private Float quotaValue;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Float thresholdPercent;

        @com.aliyun.core.annotation.NameInMap("ThresholdType")
        private String thresholdType;

        @com.aliyun.core.annotation.NameInMap("WebHook")
        private String webHook;

        private QuotaAlarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.exceedThreshold = builder.exceedThreshold;
            this.notifyChannels = builder.notifyChannels;
            this.notifyTarget = builder.notifyTarget;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaDimensions = builder.quotaDimensions;
            this.quotaUsage = builder.quotaUsage;
            this.quotaValue = builder.quotaValue;
            this.threshold = builder.threshold;
            this.thresholdPercent = builder.thresholdPercent;
            this.thresholdType = builder.thresholdType;
            this.webHook = builder.webHook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaAlarms create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public String getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return exceedThreshold
         */
        public Boolean getExceedThreshold() {
            return this.exceedThreshold;
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return notifyTarget
         */
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaActionCode
         */
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        /**
         * @return quotaDimensions
         */
        public java.util.Map < String, ? > getQuotaDimensions() {
            return this.quotaDimensions;
        }

        /**
         * @return quotaUsage
         */
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        /**
         * @return quotaValue
         */
        public Float getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return thresholdPercent
         */
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        /**
         * @return thresholdType
         */
        public String getThresholdType() {
            return this.thresholdType;
        }

        /**
         * @return webHook
         */
        public String getWebHook() {
            return this.webHook;
        }

        public static final class Builder {
            private String alarmId; 
            private String alarmName; 
            private String createTime; 
            private Boolean exceedThreshold; 
            private java.util.List < String > notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private java.util.Map < String, ? > quotaDimensions; 
            private Float quotaUsage; 
            private Float quotaValue; 
            private Float threshold; 
            private Float thresholdPercent; 
            private String thresholdType; 
            private String webHook; 

            /**
             * The ID of the alert.
             */
            public Builder alarmId(String alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * The name of the alert event.
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * The time when the quota alert was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the alert threshold was reached. Valid values:
             * <p>
             * 
             * *   false
             * *   true
             */
            public Builder exceedThreshold(Boolean exceedThreshold) {
                this.exceedThreshold = exceedThreshold;
                return this;
            }

            /**
             * The alert notification methods.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The alert contact. The value is accountContact.
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * The abbreviation of the Alibaba Cloud service name.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the quota.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The quota dimensions.
             */
            public Builder quotaDimensions(java.util.Map < String, ? > quotaDimensions) {
                this.quotaDimensions = quotaDimensions;
                return this;
            }

            /**
             * The used quota.
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
                return this;
            }

            /**
             * The value of the quota.
             */
            public Builder quotaValue(Float quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * The numeric value of the alert threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The percentage of the alert threshold.
             */
            public Builder thresholdPercent(Float thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * The type of the quota alert. Valid values:
             * <p>
             * 
             * *   used: The alert is created for the used quota.
             * *   usable: The alert is created for the available quota.
             */
            public Builder thresholdType(String thresholdType) {
                this.thresholdType = thresholdType;
                return this;
            }

            /**
             * The webhook URL.
             */
            public Builder webHook(String webHook) {
                this.webHook = webHook;
                return this;
            }

            public QuotaAlarms build() {
                return new QuotaAlarms(this);
            } 

        } 

    }
}

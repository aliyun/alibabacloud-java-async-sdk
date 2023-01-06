// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoriesResponseBody</p>
 */
public class ListAlarmHistoriesResponseBody extends TeaModel {
    @NameInMap("AlarmHistories")
    private java.util.List < AlarmHistories> alarmHistories;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAlarmHistoriesResponseBody(Builder builder) {
        this.alarmHistories = builder.alarmHistories;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmHistories
     */
    public java.util.List < AlarmHistories> getAlarmHistories() {
        return this.alarmHistories;
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
        private java.util.List < AlarmHistories> alarmHistories; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the alert records.
         */
        public Builder alarmHistories(java.util.List < AlarmHistories> alarmHistories) {
            this.alarmHistories = alarmHistories;
            return this;
        }

        /**
         * The maximum number of records returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to mark the location where the query is ended. An empty value indicates that all the data is queried.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of records returned for the query.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlarmHistoriesResponseBody build() {
            return new ListAlarmHistoriesResponseBody(this);
        } 

    } 

    public static class AlarmHistories extends TeaModel {
        @NameInMap("AlarmName")
        private String alarmName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("NotifyTarget")
        private String notifyTarget;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @NameInMap("QuotaUsage")
        private Float quotaUsage;

        @NameInMap("Threshold")
        private Float threshold;

        @NameInMap("ThresholdPercent")
        private Float thresholdPercent;

        private AlarmHistories(Builder builder) {
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.notifyChannels = builder.notifyChannels;
            this.notifyTarget = builder.notifyTarget;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaUsage = builder.quotaUsage;
            this.threshold = builder.threshold;
            this.thresholdPercent = builder.thresholdPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistories create() {
            return builder().build();
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
         * @return quotaUsage
         */
        public Float getQuotaUsage() {
            return this.quotaUsage;
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

        public static final class Builder {
            private String alarmName; 
            private String createTime; 
            private java.util.List < String > notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private Float quotaUsage; 
            private Float threshold; 
            private Float thresholdPercent; 

            /**
             * The name of the quota alert.
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
             * The notification methods of the quota alert. Valid values:
             * <p>
             * 
             * *   sms: short messages
             * *   email: emails
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The alert contact.
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * The abbreviation of the cloud service name.
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
             * The used quota.
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
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

            public AlarmHistories build() {
                return new AlarmHistories(this);
            } 

        } 

    }
}

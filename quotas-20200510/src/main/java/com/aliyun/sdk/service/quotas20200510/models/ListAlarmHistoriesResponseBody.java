// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoriesResponseBody</p>
 */
public class ListAlarmHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmHistories")
    private java.util.List < AlarmHistories> alarmHistories;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The details of the quota alert records.
         */
        public Builder alarmHistories(java.util.List < AlarmHistories> alarmHistories) {
            this.alarmHistories = alarmHistories;
            return this;
        }

        /**
         * The maximum number of records that are returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position at which the query ends. An empty value indicates that all data is returned.
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
         * The total number of records that are returned for the query.
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
        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyTarget")
        private String notifyTarget;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaUsage")
        private Float quotaUsage;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
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
             * The time when the quota alert rule was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The notification methods of the quota alert.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The quota alert contact.
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
             * The quota ID.
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
             * The threshold to trigger quota alerts.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The percentage of the quota alert threshold.
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

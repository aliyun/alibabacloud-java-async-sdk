// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListAlarmHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoriesResponseBody</p>
 */
public class ListAlarmHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmHistories")
    private java.util.List<AlarmHistories> alarmHistories;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmHistories
     */
    public java.util.List<AlarmHistories> getAlarmHistories() {
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
        private java.util.List<AlarmHistories> alarmHistories; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAlarmHistoriesResponseBody model) {
            this.alarmHistories = model.alarmHistories;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the quota alert history records.</p>
         */
        public Builder alarmHistories(java.util.List<AlarmHistories> alarmHistories) {
            this.alarmHistories = alarmHistories;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position of the returned query data. An empty value indicates that all data has been queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB38DDF9-B1E0-48C1-9966-19C443C2841E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlarmHistoriesResponseBody build() {
            return new ListAlarmHistoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlarmHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmHistoriesResponseBody</p>
     */
    public static class AlarmHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List<String> notifyChannels;

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
        public java.util.List<String> getNotifyChannels() {
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
            private java.util.List<String> notifyChannels; 
            private String notifyTarget; 
            private String productCode; 
            private String quotaActionCode; 
            private Float quotaUsage; 
            private Float threshold; 
            private Float thresholdPercent; 

            private Builder() {
            } 

            private Builder(AlarmHistories model) {
                this.alarmName = model.alarmName;
                this.createTime = model.createTime;
                this.notifyChannels = model.notifyChannels;
                this.notifyTarget = model.notifyTarget;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaUsage = model.quotaUsage;
                this.threshold = model.threshold;
                this.thresholdPercent = model.thresholdPercent;
            } 

            /**
             * <p>The name of the quota alert.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups alarm</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>The time when the quota alert was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-24T09:20:09Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The notification channels for the quota alert.</p>
             */
            public Builder notifyChannels(java.util.List<String> notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * <p>The notification recipients of the quota alert.</p>
             * 
             * <strong>example:</strong>
             * <p>accountContact</p>
             */
            public Builder notifyTarget(String notifyTarget) {
                this.notifyTarget = notifyTarget;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The quota usage.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder quotaUsage(Float quotaUsage) {
                this.quotaUsage = quotaUsage;
                return this;
            }

            /**
             * <p>The value of the quota alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The percentage of the quota alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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

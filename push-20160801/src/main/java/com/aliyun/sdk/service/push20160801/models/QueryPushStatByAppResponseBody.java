// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPushStatByAppResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushStatByAppResponseBody</p>
 */
public class QueryPushStatByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppPushStats")
    private AppPushStats appPushStats;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPushStatByAppResponseBody(Builder builder) {
        this.appPushStats = builder.appPushStats;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushStatByAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appPushStats
     */
    public AppPushStats getAppPushStats() {
        return this.appPushStats;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppPushStats appPushStats; 
        private String requestId; 

        /**
         * AppPushStats.
         */
        public Builder appPushStats(AppPushStats appPushStats) {
            this.appPushStats = appPushStats;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPushStatByAppResponseBody build() {
            return new QueryPushStatByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPushStatByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushStatByAppResponseBody</p>
     */
    public static class AppPushStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptCount")
        private Long acceptCount;

        @com.aliyun.core.annotation.NameInMap("DeletedCount")
        private Long deletedCount;

        @com.aliyun.core.annotation.NameInMap("OpenedCount")
        private Long openedCount;

        @com.aliyun.core.annotation.NameInMap("ReceivedCount")
        private Long receivedCount;

        @com.aliyun.core.annotation.NameInMap("SentCount")
        private Long sentCount;

        @com.aliyun.core.annotation.NameInMap("SmsFailedCount")
        private Long smsFailedCount;

        @com.aliyun.core.annotation.NameInMap("SmsReceiveFailedCount")
        private Long smsReceiveFailedCount;

        @com.aliyun.core.annotation.NameInMap("SmsReceiveSuccessCount")
        private Long smsReceiveSuccessCount;

        @com.aliyun.core.annotation.NameInMap("SmsSentCount")
        private Long smsSentCount;

        @com.aliyun.core.annotation.NameInMap("SmsSkipCount")
        private Long smsSkipCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private AppPushStat(Builder builder) {
            this.acceptCount = builder.acceptCount;
            this.deletedCount = builder.deletedCount;
            this.openedCount = builder.openedCount;
            this.receivedCount = builder.receivedCount;
            this.sentCount = builder.sentCount;
            this.smsFailedCount = builder.smsFailedCount;
            this.smsReceiveFailedCount = builder.smsReceiveFailedCount;
            this.smsReceiveSuccessCount = builder.smsReceiveSuccessCount;
            this.smsSentCount = builder.smsSentCount;
            this.smsSkipCount = builder.smsSkipCount;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPushStat create() {
            return builder().build();
        }

        /**
         * @return acceptCount
         */
        public Long getAcceptCount() {
            return this.acceptCount;
        }

        /**
         * @return deletedCount
         */
        public Long getDeletedCount() {
            return this.deletedCount;
        }

        /**
         * @return openedCount
         */
        public Long getOpenedCount() {
            return this.openedCount;
        }

        /**
         * @return receivedCount
         */
        public Long getReceivedCount() {
            return this.receivedCount;
        }

        /**
         * @return sentCount
         */
        public Long getSentCount() {
            return this.sentCount;
        }

        /**
         * @return smsFailedCount
         */
        public Long getSmsFailedCount() {
            return this.smsFailedCount;
        }

        /**
         * @return smsReceiveFailedCount
         */
        public Long getSmsReceiveFailedCount() {
            return this.smsReceiveFailedCount;
        }

        /**
         * @return smsReceiveSuccessCount
         */
        public Long getSmsReceiveSuccessCount() {
            return this.smsReceiveSuccessCount;
        }

        /**
         * @return smsSentCount
         */
        public Long getSmsSentCount() {
            return this.smsSentCount;
        }

        /**
         * @return smsSkipCount
         */
        public Long getSmsSkipCount() {
            return this.smsSkipCount;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long acceptCount; 
            private Long deletedCount; 
            private Long openedCount; 
            private Long receivedCount; 
            private Long sentCount; 
            private Long smsFailedCount; 
            private Long smsReceiveFailedCount; 
            private Long smsReceiveSuccessCount; 
            private Long smsSentCount; 
            private Long smsSkipCount; 
            private String time; 

            /**
             * AcceptCount.
             */
            public Builder acceptCount(Long acceptCount) {
                this.acceptCount = acceptCount;
                return this;
            }

            /**
             * DeletedCount.
             */
            public Builder deletedCount(Long deletedCount) {
                this.deletedCount = deletedCount;
                return this;
            }

            /**
             * OpenedCount.
             */
            public Builder openedCount(Long openedCount) {
                this.openedCount = openedCount;
                return this;
            }

            /**
             * ReceivedCount.
             */
            public Builder receivedCount(Long receivedCount) {
                this.receivedCount = receivedCount;
                return this;
            }

            /**
             * SentCount.
             */
            public Builder sentCount(Long sentCount) {
                this.sentCount = sentCount;
                return this;
            }

            /**
             * SmsFailedCount.
             */
            public Builder smsFailedCount(Long smsFailedCount) {
                this.smsFailedCount = smsFailedCount;
                return this;
            }

            /**
             * SmsReceiveFailedCount.
             */
            public Builder smsReceiveFailedCount(Long smsReceiveFailedCount) {
                this.smsReceiveFailedCount = smsReceiveFailedCount;
                return this;
            }

            /**
             * SmsReceiveSuccessCount.
             */
            public Builder smsReceiveSuccessCount(Long smsReceiveSuccessCount) {
                this.smsReceiveSuccessCount = smsReceiveSuccessCount;
                return this;
            }

            /**
             * SmsSentCount.
             */
            public Builder smsSentCount(Long smsSentCount) {
                this.smsSentCount = smsSentCount;
                return this;
            }

            /**
             * SmsSkipCount.
             */
            public Builder smsSkipCount(Long smsSkipCount) {
                this.smsSkipCount = smsSkipCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public AppPushStat build() {
                return new AppPushStat(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPushStatByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushStatByAppResponseBody</p>
     */
    public static class AppPushStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppPushStat")
        private java.util.List < AppPushStat> appPushStat;

        private AppPushStats(Builder builder) {
            this.appPushStat = builder.appPushStat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPushStats create() {
            return builder().build();
        }

        /**
         * @return appPushStat
         */
        public java.util.List < AppPushStat> getAppPushStat() {
            return this.appPushStat;
        }

        public static final class Builder {
            private java.util.List < AppPushStat> appPushStat; 

            /**
             * AppPushStat.
             */
            public Builder appPushStat(java.util.List < AppPushStat> appPushStat) {
                this.appPushStat = appPushStat;
                return this;
            }

            public AppPushStats build() {
                return new AppPushStats(this);
            } 

        } 

    }
}

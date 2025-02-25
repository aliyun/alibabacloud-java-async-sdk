// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPushStatByMsgResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushStatByMsgResponseBody</p>
 */
public class QueryPushStatByMsgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PushStats")
    private PushStats pushStats;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPushStatByMsgResponseBody(Builder builder) {
        this.pushStats = builder.pushStats;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushStatByMsgResponseBody create() {
        return builder().build();
    }

    /**
     * @return pushStats
     */
    public PushStats getPushStats() {
        return this.pushStats;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PushStats pushStats; 
        private String requestId; 

        /**
         * PushStats.
         */
        public Builder pushStats(PushStats pushStats) {
            this.pushStats = pushStats;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPushStatByMsgResponseBody build() {
            return new QueryPushStatByMsgResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPushStatByMsgResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushStatByMsgResponseBody</p>
     */
    public static class PushStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptCount")
        private Long acceptCount;

        @com.aliyun.core.annotation.NameInMap("DeletedCount")
        private Long deletedCount;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

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

        private PushStat(Builder builder) {
            this.acceptCount = builder.acceptCount;
            this.deletedCount = builder.deletedCount;
            this.messageId = builder.messageId;
            this.openedCount = builder.openedCount;
            this.receivedCount = builder.receivedCount;
            this.sentCount = builder.sentCount;
            this.smsFailedCount = builder.smsFailedCount;
            this.smsReceiveFailedCount = builder.smsReceiveFailedCount;
            this.smsReceiveSuccessCount = builder.smsReceiveSuccessCount;
            this.smsSentCount = builder.smsSentCount;
            this.smsSkipCount = builder.smsSkipCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushStat create() {
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
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
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

        public static final class Builder {
            private Long acceptCount; 
            private Long deletedCount; 
            private String messageId; 
            private Long openedCount; 
            private Long receivedCount; 
            private Long sentCount; 
            private Long smsFailedCount; 
            private Long smsReceiveFailedCount; 
            private Long smsReceiveSuccessCount; 
            private Long smsSentCount; 
            private Long smsSkipCount; 

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
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
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

            public PushStat build() {
                return new PushStat(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPushStatByMsgResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushStatByMsgResponseBody</p>
     */
    public static class PushStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushStat")
        private java.util.List < PushStat> pushStat;

        private PushStats(Builder builder) {
            this.pushStat = builder.pushStat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushStats create() {
            return builder().build();
        }

        /**
         * @return pushStat
         */
        public java.util.List < PushStat> getPushStat() {
            return this.pushStat;
        }

        public static final class Builder {
            private java.util.List < PushStat> pushStat; 

            /**
             * PushStat.
             */
            public Builder pushStat(java.util.List < PushStat> pushStat) {
                this.pushStat = pushStat;
                return this;
            }

            public PushStats build() {
                return new PushStats(this);
            } 

        } 

    }
}

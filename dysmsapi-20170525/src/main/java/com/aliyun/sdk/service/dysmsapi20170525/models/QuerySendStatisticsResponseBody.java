// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendStatisticsResponseBody</p>
 */
public class QuerySendStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySendStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   Other values indicate that the request fails. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySendStatisticsResponseBody build() {
            return new QuerySendStatisticsResponseBody(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoRespondedCount")
        private Long noRespondedCount;

        @com.aliyun.core.annotation.NameInMap("RespondedFailCount")
        private Long respondedFailCount;

        @com.aliyun.core.annotation.NameInMap("RespondedSuccessCount")
        private Long respondedSuccessCount;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private TargetList(Builder builder) {
            this.noRespondedCount = builder.noRespondedCount;
            this.respondedFailCount = builder.respondedFailCount;
            this.respondedSuccessCount = builder.respondedSuccessCount;
            this.sendDate = builder.sendDate;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return noRespondedCount
         */
        public Long getNoRespondedCount() {
            return this.noRespondedCount;
        }

        /**
         * @return respondedFailCount
         */
        public Long getRespondedFailCount() {
            return this.respondedFailCount;
        }

        /**
         * @return respondedSuccessCount
         */
        public Long getRespondedSuccessCount() {
            return this.respondedSuccessCount;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long noRespondedCount; 
            private Long respondedFailCount; 
            private Long respondedSuccessCount; 
            private String sendDate; 
            private Long totalCount; 

            /**
             * The number of messages without a delivery receipt.
             */
            public Builder noRespondedCount(Long noRespondedCount) {
                this.noRespondedCount = noRespondedCount;
                return this;
            }

            /**
             * The number of messages with a delivery receipt that indicates a failure.
             */
            public Builder respondedFailCount(Long respondedFailCount) {
                this.respondedFailCount = respondedFailCount;
                return this;
            }

            /**
             * The number of messages with a delivery receipt that indicates a success.
             */
            public Builder respondedSuccessCount(Long respondedSuccessCount) {
                this.respondedSuccessCount = respondedSuccessCount;
                return this;
            }

            /**
             * The date when the message is sent. Format: yyyyMMdd. Example: 20181225.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * The number of delivered messages.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.targetList = builder.targetList;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetList
         */
        public java.util.List < TargetList> getTargetList() {
            return this.targetList;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List < TargetList> targetList; 
            private Long totalSize; 

            /**
             * The details of the data returned.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

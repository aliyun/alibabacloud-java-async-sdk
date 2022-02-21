// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendStatisticsResponseBody</p>
 */
public class QuerySendStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("NoRespondedCount")
        private Long noRespondedCount;

        @NameInMap("RespondedFailCount")
        private Long respondedFailCount;

        @NameInMap("RespondedSuccessCount")
        private Long respondedSuccessCount;

        @NameInMap("SendDate")
        private String sendDate;

        @NameInMap("TotalCount")
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
             * NoRespondedCount.
             */
            public Builder noRespondedCount(Long noRespondedCount) {
                this.noRespondedCount = noRespondedCount;
                return this;
            }

            /**
             * RespondedFailCount.
             */
            public Builder respondedFailCount(Long respondedFailCount) {
                this.respondedFailCount = respondedFailCount;
                return this;
            }

            /**
             * RespondedSuccessCount.
             */
            public Builder respondedSuccessCount(Long respondedSuccessCount) {
                this.respondedSuccessCount = respondedSuccessCount;
                return this;
            }

            /**
             * SendDate.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * TotalCount.
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
        @NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @NameInMap("TotalSize")
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
             * TargetList.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * TotalSize.
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

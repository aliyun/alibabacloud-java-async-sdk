// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySendStatisticsResponseBody build() {
            return new QuerySendStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySendStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendStatisticsResponseBody</p>
     */
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
             * <p>The number of messages without a delivery receipt.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder noRespondedCount(Long noRespondedCount) {
                this.noRespondedCount = noRespondedCount;
                return this;
            }

            /**
             * <p>The number of messages with a delivery receipt that indicates a failure.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder respondedFailCount(Long respondedFailCount) {
                this.respondedFailCount = respondedFailCount;
                return this;
            }

            /**
             * <p>The number of messages with a delivery receipt that indicates a success.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder respondedSuccessCount(Long respondedSuccessCount) {
                this.respondedSuccessCount = respondedSuccessCount;
                return this;
            }

            /**
             * <p>The date when the message is sent. Format: yyyyMMdd. Example: 20181225.</p>
             * 
             * <strong>example:</strong>
             * <p>20201010</p>
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * <p>The number of delivered messages.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link QuerySendStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List<TargetList> targetList;

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
        public java.util.List<TargetList> getTargetList() {
            return this.targetList;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<TargetList> targetList; 
            private Long totalSize; 

            /**
             * <p>The details of the data returned.</p>
             */
            public Builder targetList(java.util.List<TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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

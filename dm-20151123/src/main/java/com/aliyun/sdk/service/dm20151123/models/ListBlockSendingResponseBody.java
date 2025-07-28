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
 * {@link ListBlockSendingResponseBody} extends {@link TeaModel}
 *
 * <p>ListBlockSendingResponseBody</p>
 */
public class ListBlockSendingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBlockSendingResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBlockSendingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListBlockSendingResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBlockSendingResponseBody build() {
            return new ListBlockSendingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBlockSendingResponseBody} extends {@link TeaModel}
     *
     * <p>ListBlockSendingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockEmail")
        private String blockEmail;

        @com.aliyun.core.annotation.NameInMap("BlockTime")
        private Integer blockTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private Integer reason;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private Integer sendTime;

        @com.aliyun.core.annotation.NameInMap("SenderEmail")
        private String senderEmail;

        private Data(Builder builder) {
            this.blockEmail = builder.blockEmail;
            this.blockTime = builder.blockTime;
            this.reason = builder.reason;
            this.sendTime = builder.sendTime;
            this.senderEmail = builder.senderEmail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockEmail
         */
        public String getBlockEmail() {
            return this.blockEmail;
        }

        /**
         * @return blockTime
         */
        public Integer getBlockTime() {
            return this.blockTime;
        }

        /**
         * @return reason
         */
        public Integer getReason() {
            return this.reason;
        }

        /**
         * @return sendTime
         */
        public Integer getSendTime() {
            return this.sendTime;
        }

        /**
         * @return senderEmail
         */
        public String getSenderEmail() {
            return this.senderEmail;
        }

        public static final class Builder {
            private String blockEmail; 
            private Integer blockTime; 
            private Integer reason; 
            private Integer sendTime; 
            private String senderEmail; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.blockEmail = model.blockEmail;
                this.blockTime = model.blockTime;
                this.reason = model.reason;
                this.sendTime = model.sendTime;
                this.senderEmail = model.senderEmail;
            } 

            /**
             * BlockEmail.
             */
            public Builder blockEmail(String blockEmail) {
                this.blockEmail = blockEmail;
                return this;
            }

            /**
             * BlockTime.
             */
            public Builder blockTime(Integer blockTime) {
                this.blockTime = blockTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(Integer reason) {
                this.reason = reason;
                return this;
            }

            /**
             * SendTime.
             */
            public Builder sendTime(Integer sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * SenderEmail.
             */
            public Builder senderEmail(String senderEmail) {
                this.senderEmail = senderEmail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

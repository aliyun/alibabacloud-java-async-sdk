// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarAgentChatRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarAgentChatRecordsResponseBody</p>
 */
public class DescribePolarAgentChatRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarAgentChatRecordsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentChatRecordsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolarAgentChatRecordsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result set.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarAgentChatRecordsResponseBody build() {
            return new DescribePolarAgentChatRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarAgentChatRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarAgentChatRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("FeedbackType")
        private String feedbackType;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.answer = builder.answer;
            this.feedbackType = builder.feedbackType;
            this.query = builder.query;
            this.queryId = builder.queryId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return feedbackType
         */
        public String getFeedbackType() {
            return this.feedbackType;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String answer; 
            private String feedbackType; 
            private String query; 
            private String queryId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.answer = model.answer;
                this.feedbackType = model.feedbackType;
                this.query = model.query;
                this.queryId = model.queryId;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>The answer.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The feedback type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder feedbackType(String feedbackType) {
                this.feedbackType = feedbackType;
                return this;
            }

            /**
             * <p>The session query. Obtain this value from the response of the API call to start a digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sq202506261002hz8b24fe80067683</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>44dcdf31-04cd-4a44-9bae-834dd6657e29</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

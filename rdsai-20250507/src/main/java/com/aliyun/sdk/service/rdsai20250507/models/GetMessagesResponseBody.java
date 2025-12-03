// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessagesResponseBody</p>
 */
public class GetMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.hasMore = builder.hasMore;
        this.limit = builder.limit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessagesResponseBody create() {
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
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Boolean hasMore; 
        private Long limit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMessagesResponseBody model) {
            this.data = model.data;
            this.hasMore = model.hasMore;
            this.limit = model.limit;
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
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessagesResponseBody build() {
            return new GetMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("RetrieverResources")
        private java.util.List<?> retrieverResources;

        private Data(Builder builder) {
            this.answer = builder.answer;
            this.conversationId = builder.conversationId;
            this.createdAt = builder.createdAt;
            this.feedback = builder.feedback;
            this.id = builder.id;
            this.query = builder.query;
            this.retrieverResources = builder.retrieverResources;
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
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return retrieverResources
         */
        public java.util.List<?> getRetrieverResources() {
            return this.retrieverResources;
        }

        public static final class Builder {
            private String answer; 
            private String conversationId; 
            private String createdAt; 
            private String feedback; 
            private String id; 
            private String query; 
            private java.util.List<?> retrieverResources; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.answer = model.answer;
                this.conversationId = model.conversationId;
                this.createdAt = model.createdAt;
                this.feedback = model.feedback;
                this.id = model.id;
                this.query = model.query;
                this.retrieverResources = model.retrieverResources;
            } 

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * ConversationId.
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * RetrieverResources.
             */
            public Builder retrieverResources(java.util.List<?> retrieverResources) {
                this.retrieverResources = retrieverResources;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

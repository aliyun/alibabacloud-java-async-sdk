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
         * <p>The returned results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
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
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        private Events(Builder builder) {
            this.answer = builder.answer;
            this.event = builder.event;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        public static final class Builder {
            private String answer; 
            private String event; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.answer = model.answer;
                this.event = model.event;
            } 

            /**
             * answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<Events> events;

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
            this.events = builder.events;
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
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
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
            private java.util.List<Events> events; 
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
                this.events = model.events;
                this.feedback = model.feedback;
                this.id = model.id;
                this.query = model.query;
                this.retrieverResources = model.retrieverResources;
            } 

            /**
             * <p>The response to the query.</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The ID of the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>9cbbe885-b240-4803-9d15-6781a3fd****</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time of the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>1763986004</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>like</p>
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The query statement.</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The retriever resources.</p>
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

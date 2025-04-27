// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link ListQueueConsumersResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueueConsumersResponseBody</p>
 */
public class ListQueueConsumersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQueueConsumersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueConsumersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQueueConsumersResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4409B7D5-E4EC-4EB5-804A-385DCDFCD***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueueConsumersResponseBody build() {
            return new ListQueueConsumersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueueConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueConsumersResponseBody</p>
     */
    public static class Consumers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerTag")
        private String consumerTag;

        private Consumers(Builder builder) {
            this.consumerTag = builder.consumerTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Consumers create() {
            return builder().build();
        }

        /**
         * @return consumerTag
         */
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public static final class Builder {
            private String consumerTag; 

            private Builder() {
            } 

            private Builder(Consumers model) {
                this.consumerTag = model.consumerTag;
            } 

            /**
             * <p>The consumer tag.</p>
             * 
             * <strong>example:</strong>
             * <p>sgen-1</p>
             */
            public Builder consumerTag(String consumerTag) {
                this.consumerTag = consumerTag;
                return this;
            }

            public Consumers build() {
                return new Consumers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueConsumersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Consumers")
        private java.util.List<Consumers> consumers;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.consumers = builder.consumers;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumers
         */
        public java.util.List<Consumers> getConsumers() {
            return this.consumers;
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

        public static final class Builder {
            private java.util.List<Consumers> consumers; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumers = model.consumers;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The consumers.</p>
             */
            public Builder consumers(java.util.List<Consumers> consumers) {
                this.consumers = consumers;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>caebacccb2be03f84eb48b699f0a****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

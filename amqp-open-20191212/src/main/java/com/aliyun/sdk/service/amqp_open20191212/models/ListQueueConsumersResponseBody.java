// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueueConsumersResponseBody build() {
            return new ListQueueConsumersResponseBody(this);
        } 

    } 

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

            /**
             * The consumer tag.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Consumers")
        private java.util.List < Consumers> consumers;

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
        public java.util.List < Consumers> getConsumers() {
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
            private java.util.List < Consumers> consumers; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The consumers.
             */
            public Builder consumers(java.util.List < Consumers> consumers) {
                this.consumers = consumers;
                return this;
            }

            /**
             * The maximum number of entries returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.
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

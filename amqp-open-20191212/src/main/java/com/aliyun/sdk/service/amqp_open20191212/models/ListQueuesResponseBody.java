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
 * {@link ListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueuesResponseBody</p>
 */
public class ListQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQueuesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueuesResponseBody create() {
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
         * <p>CE811989-9F02-42CE-97A6-2239CB5C2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, ?> attributes;

        @com.aliyun.core.annotation.NameInMap("AutoDeleteState")
        private Boolean autoDeleteState;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExclusiveState")
        private Boolean exclusiveState;

        @com.aliyun.core.annotation.NameInMap("LastConsumeTime")
        private Long lastConsumeTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("VHostName")
        private String vHostName;

        private Queues(Builder builder) {
            this.attributes = builder.attributes;
            this.autoDeleteState = builder.autoDeleteState;
            this.createTime = builder.createTime;
            this.exclusiveState = builder.exclusiveState;
            this.lastConsumeTime = builder.lastConsumeTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.vHostName = builder.vHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        /**
         * @return autoDeleteState
         */
        public Boolean getAutoDeleteState() {
            return this.autoDeleteState;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return exclusiveState
         */
        public Boolean getExclusiveState() {
            return this.exclusiveState;
        }

        /**
         * @return lastConsumeTime
         */
        public Long getLastConsumeTime() {
            return this.lastConsumeTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return vHostName
         */
        public String getVHostName() {
            return this.vHostName;
        }

        public static final class Builder {
            private java.util.Map<String, ?> attributes; 
            private Boolean autoDeleteState; 
            private Long createTime; 
            private Boolean exclusiveState; 
            private Long lastConsumeTime; 
            private String name; 
            private String ownerId; 
            private String vHostName; 

            /**
             * <p>The attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder attributes(java.util.Map<String, ?> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Indicates whether the queue was automatically deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoDeleteState(Boolean autoDeleteState) {
                this.autoDeleteState = autoDeleteState;
                return this;
            }

            /**
             * <p>The time when the queue was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1580887085240</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the queue is an exclusive queue.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exclusiveState(Boolean exclusiveState) {
                this.exclusiveState = exclusiveState;
                return this;
            }

            /**
             * <p>The time when messages in the queue were last consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>1680887085240</p>
             */
            public Builder lastConsumeTime(Long lastConsumeTime) {
                this.lastConsumeTime = lastConsumeTime;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>QueueTest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the queue belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1880770869023***</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The vhost name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder vHostName(String vHostName) {
                this.vHostName = vHostName;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Queues")
        private java.util.List<Queues> queues;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.queues = builder.queues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return queues
         */
        public java.util.List<Queues> getQueues() {
            return this.queues;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<Queues> queues; 

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

            /**
             * <p>The queues.</p>
             */
            public Builder queues(java.util.List<Queues> queues) {
                this.queues = queues;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

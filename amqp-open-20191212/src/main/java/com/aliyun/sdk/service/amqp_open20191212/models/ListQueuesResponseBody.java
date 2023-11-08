// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueuesResponseBody</p>
 */
public class ListQueuesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    public static class Queues extends TeaModel {
        @NameInMap("Attributes")
        private java.util.Map < String, ? > attributes;

        @NameInMap("AutoDeleteState")
        private Boolean autoDeleteState;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExclusiveState")
        private Boolean exclusiveState;

        @NameInMap("LastConsumeTime")
        private Long lastConsumeTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("VHostName")
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
        public java.util.Map < String, ? > getAttributes() {
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
            private java.util.Map < String, ? > attributes; 
            private Boolean autoDeleteState; 
            private Long createTime; 
            private Boolean exclusiveState; 
            private Long lastConsumeTime; 
            private String name; 
            private String ownerId; 
            private String vHostName; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map < String, ? > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * AutoDeleteState.
             */
            public Builder autoDeleteState(Boolean autoDeleteState) {
                this.autoDeleteState = autoDeleteState;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExclusiveState.
             */
            public Builder exclusiveState(Boolean exclusiveState) {
                this.exclusiveState = exclusiveState;
                return this;
            }

            /**
             * LastConsumeTime.
             */
            public Builder lastConsumeTime(Long lastConsumeTime) {
                this.lastConsumeTime = lastConsumeTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * VHostName.
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
    public static class Data extends TeaModel {
        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("Queues")
        private java.util.List < Queues> queues;

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
        public java.util.List < Queues> getQueues() {
            return this.queues;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List < Queues> queues; 

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
             * Queue。
             */
            public Builder queues(java.util.List < Queues> queues) {
                this.queues = queues;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

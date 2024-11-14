// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTopicSubscribeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicSubscribeStatusResponseBody</p>
 */
public class GetTopicSubscribeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicSubscribeStatus")
    private TopicSubscribeStatus topicSubscribeStatus;

    private GetTopicSubscribeStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicSubscribeStatus = builder.topicSubscribeStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicSubscribeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return topicSubscribeStatus
     */
    public TopicSubscribeStatus getTopicSubscribeStatus() {
        return this.topicSubscribeStatus;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TopicSubscribeStatus topicSubscribeStatus; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06084011-E093-46F3-A51F-4B19A8AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The subscription details.</p>
         */
        public Builder topicSubscribeStatus(TopicSubscribeStatus topicSubscribeStatus) {
            this.topicSubscribeStatus = topicSubscribeStatus;
            return this;
        }

        public GetTopicSubscribeStatusResponseBody build() {
            return new GetTopicSubscribeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicSubscribeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicSubscribeStatusResponseBody</p>
     */
    public static class TopicSubscribeStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroups")
        private java.util.List < String > consumerGroups;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private TopicSubscribeStatus(Builder builder) {
            this.consumerGroups = builder.consumerGroups;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicSubscribeStatus create() {
            return builder().build();
        }

        /**
         * @return consumerGroups
         */
        public java.util.List < String > getConsumerGroups() {
            return this.consumerGroups;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List < String > consumerGroups; 
            private String topic; 

            /**
             * <p>The groups that subscribe to the topic.</p>
             */
            public Builder consumerGroups(java.util.List < String > consumerGroups) {
                this.consumerGroups = consumerGroups;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_api_1681624879908</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public TopicSubscribeStatus build() {
                return new TopicSubscribeStatus(this);
            } 

        } 

    }
}

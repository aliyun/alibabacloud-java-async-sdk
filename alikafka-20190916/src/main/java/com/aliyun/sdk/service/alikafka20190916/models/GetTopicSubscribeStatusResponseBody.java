// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicSubscribeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicSubscribeStatusResponseBody</p>
 */
public class GetTopicSubscribeStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TopicSubscribeStatus")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TopicSubscribeStatus.
         */
        public Builder topicSubscribeStatus(TopicSubscribeStatus topicSubscribeStatus) {
            this.topicSubscribeStatus = topicSubscribeStatus;
            return this;
        }

        public GetTopicSubscribeStatusResponseBody build() {
            return new GetTopicSubscribeStatusResponseBody(this);
        } 

    } 

    public static class TopicSubscribeStatus extends TeaModel {
        @NameInMap("ConsumerGroups")
        private java.util.List < String > consumerGroups;

        @NameInMap("Topic")
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
             * ConsumerGroups.
             */
            public Builder consumerGroups(java.util.List < String > consumerGroups) {
                this.consumerGroups = consumerGroups;
                return this;
            }

            /**
             * Topic.
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

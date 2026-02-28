// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link UnsubscribeTopicResponseBody} extends {@link TeaModel}
 *
 * <p>UnsubscribeTopicResponseBody</p>
 */
public class UnsubscribeTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FailureTopics")
    private FailureTopics failureTopics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UnsubscribeTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.failureTopics = builder.failureTopics;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeTopicResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return failureTopics
     */
    public FailureTopics getFailureTopics() {
        return this.failureTopics;
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

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private FailureTopics failureTopics; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UnsubscribeTopicResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.failureTopics = model.failureTopics;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * FailureTopics.
         */
        public Builder failureTopics(FailureTopics failureTopics) {
            this.failureTopics = failureTopics;
            return this;
        }

        /**
         * RequestId.
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

        public UnsubscribeTopicResponseBody build() {
            return new UnsubscribeTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UnsubscribeTopicResponseBody} extends {@link TeaModel}
     *
     * <p>UnsubscribeTopicResponseBody</p>
     */
    public static class FailureTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("topic")
        private java.util.List<java.util.Map<String, ?>> topic;

        private FailureTopics(Builder builder) {
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureTopics create() {
            return builder().build();
        }

        /**
         * @return topic
         */
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> topic; 

            private Builder() {
            } 

            private Builder(FailureTopics model) {
                this.topic = model.topic;
            } 

            /**
             * topic.
             */
            public Builder topic(java.util.List<java.util.Map<String, ?>> topic) {
                this.topic = topic;
                return this;
            }

            public FailureTopics build() {
                return new FailureTopics(this);
            } 

        } 

    }
}

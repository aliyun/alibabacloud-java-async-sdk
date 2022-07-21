// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTopicRouteTableResponseBody</p>
 */
public class CreateTopicRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("FailureTopics")
    private FailureTopics failureTopics;

    @NameInMap("IsAllSucceed")
    private Boolean isAllSucceed;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateTopicRouteTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.failureTopics = builder.failureTopics;
        this.isAllSucceed = builder.isAllSucceed;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRouteTableResponseBody create() {
        return builder().build();
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
     * @return isAllSucceed
     */
    public Boolean getIsAllSucceed() {
        return this.isAllSucceed;
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
        private Boolean isAllSucceed; 
        private String requestId; 
        private Boolean success; 

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
         * IsAllSucceed.
         */
        public Builder isAllSucceed(Boolean isAllSucceed) {
            this.isAllSucceed = isAllSucceed;
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

        public CreateTopicRouteTableResponseBody build() {
            return new CreateTopicRouteTableResponseBody(this);
        } 

    } 

    public static class FailureTopics extends TeaModel {
        @NameInMap("Topic")
        private java.util.List < java.util.Map<String, ?>> topic;

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
        public java.util.List < java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> topic; 

            /**
             * Topic.
             */
            public Builder topic(java.util.List < java.util.Map<String, ?>> topic) {
                this.topic = topic;
                return this;
            }

            public FailureTopics build() {
                return new FailureTopics(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTopicReverseRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTopicReverseRouteTableResponseBody</p>
 */
public class QueryTopicReverseRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SrcTopics")
    private SrcTopics srcTopics;

    @NameInMap("Success")
    private Boolean success;

    private QueryTopicReverseRouteTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.srcTopics = builder.srcTopics;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTopicReverseRouteTableResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcTopics
     */
    public SrcTopics getSrcTopics() {
        return this.srcTopics;
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
        private String requestId; 
        private SrcTopics srcTopics; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SrcTopics.
         */
        public Builder srcTopics(SrcTopics srcTopics) {
            this.srcTopics = srcTopics;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTopicReverseRouteTableResponseBody build() {
            return new QueryTopicReverseRouteTableResponseBody(this);
        } 

    } 

    public static class SrcTopics extends TeaModel {
        @NameInMap("Topic")
        private java.util.List < java.util.Map<String, String>> topic;

        private SrcTopics(Builder builder) {
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcTopics create() {
            return builder().build();
        }

        /**
         * @return topic
         */
        public java.util.List < java.util.Map<String, String>> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, String>> topic; 

            /**
             * Topic.
             */
            public Builder topic(java.util.List < java.util.Map<String, String>> topic) {
                this.topic = topic;
                return this;
            }

            public SrcTopics build() {
                return new SrcTopics(this);
            } 

        } 

    }
}

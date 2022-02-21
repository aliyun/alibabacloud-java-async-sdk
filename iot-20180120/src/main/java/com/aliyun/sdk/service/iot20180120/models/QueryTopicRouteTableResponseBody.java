// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTopicRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTopicRouteTableResponseBody</p>
 */
public class QueryTopicRouteTableResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DstTopics")
    private DstTopics dstTopics;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryTopicRouteTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.dstTopics = builder.dstTopics;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTopicRouteTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dstTopics
     */
    public DstTopics getDstTopics() {
        return this.dstTopics;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private DstTopics dstTopics; 
        private String errorMessage; 
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
         * DstTopics.
         */
        public Builder dstTopics(DstTopics dstTopics) {
            this.dstTopics = dstTopics;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTopicRouteTableResponseBody build() {
            return new QueryTopicRouteTableResponseBody(this);
        } 

    } 

    public static class DstTopics extends TeaModel {
        @NameInMap("Topic")
        private java.util.List < java.util.Map<String, String>> topic;

        private DstTopics(Builder builder) {
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstTopics create() {
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

            public DstTopics build() {
                return new DstTopics(this);
            } 

        } 

    }
}

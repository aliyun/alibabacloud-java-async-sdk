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
 * {@link CreateTopicRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTopicRouteTableResponseBody</p>
 */
public class CreateTopicRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FailureTopics")
    private FailureTopics failureTopics;

    @com.aliyun.core.annotation.NameInMap("IsAllSucceed")
    private Boolean isAllSucceed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(CreateTopicRouteTableResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.failureTopics = model.failureTopics;
            this.isAllSucceed = model.isAllSucceed;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The list of topics returned if the call fails.</p>
         */
        public Builder failureTopics(FailureTopics failureTopics) {
            this.failureTopics = failureTopics;
            return this;
        }

        /**
         * <p>Indicates whether all the message routing relationships between topics are established.</p>
         * <ul>
         * <li><strong>true</strong>: All the message routing relationships between topics are established.</li>
         * <li><strong>false</strong>: Not all the message routing relationships between topics are established.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAllSucceed(Boolean isAllSucceed) {
            this.isAllSucceed = isAllSucceed;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FCC27691-9151-4B93-9622-9C90F30542EC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateTopicRouteTableResponseBody build() {
            return new CreateTopicRouteTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTopicRouteTableResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTopicRouteTableResponseBody</p>
     */
    public static class FailureTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * Topic.
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

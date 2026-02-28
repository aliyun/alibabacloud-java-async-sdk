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
 * {@link QueryTopicReverseRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTopicReverseRouteTableResponseBody</p>
 */
public class QueryTopicReverseRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcTopics")
    private SrcTopics srcTopics;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryTopicReverseRouteTableResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.srcTopics = model.srcTopics;
            this.success = model.success;
        } 

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * <p>FCC27691-9151-4B93-9622-9C90F30542EC&quot;</p>
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
         * <p>The list of source topics returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTopicReverseRouteTableResponseBody build() {
            return new QueryTopicReverseRouteTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTopicReverseRouteTableResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTopicReverseRouteTableResponseBody</p>
     */
    public static class SrcTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Topic")
        private java.util.List<java.util.Map<String, ?>> topic;

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
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> topic; 

            private Builder() {
            } 

            private Builder(SrcTopics model) {
                this.topic = model.topic;
            } 

            /**
             * Topic.
             */
            public Builder topic(java.util.List<java.util.Map<String, ?>> topic) {
                this.topic = topic;
                return this;
            }

            public SrcTopics build() {
                return new SrcTopics(this);
            } 

        } 

    }
}

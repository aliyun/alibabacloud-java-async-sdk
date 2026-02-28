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
 * {@link QueryTopicRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTopicRouteTableResponseBody</p>
 */
public class QueryTopicRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DstTopics")
    private DstTopics dstTopics;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryTopicRouteTableResponseBody model) {
            this.code = model.code;
            this.dstTopics = model.dstTopics;
            this.errorMessage = model.errorMessage;
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
         * <p>The list of destination topics returned if the call is successful.</p>
         */
        public Builder dstTopics(DstTopics dstTopics) {
            this.dstTopics = dstTopics;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryTopicRouteTableResponseBody build() {
            return new QueryTopicRouteTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTopicRouteTableResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTopicRouteTableResponseBody</p>
     */
    public static class DstTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Topic")
        private java.util.List<java.util.Map<String, ?>> topic;

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
        public java.util.List<java.util.Map<String, ?>> getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> topic; 

            private Builder() {
            } 

            private Builder(DstTopics model) {
                this.topic = model.topic;
            } 

            /**
             * Topic.
             */
            public Builder topic(java.util.List<java.util.Map<String, ?>> topic) {
                this.topic = topic;
                return this;
            }

            public DstTopics build() {
                return new DstTopics(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListSwimmingLaneGroupTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneGroupTagsResponseBody</p>
 */
public class ListSwimmingLaneGroupTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListSwimmingLaneGroupTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneGroupTagsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListSwimmingLaneGroupTagsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code or the error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The request was successful.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Responses.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code. Valid values:</p>
         * <ul>
         * <li>If the request is successful, no <strong>ErrorCode</strong> fields are returned.</li>
         * <li>Request failed: <strong>ErrorCode</strong> fields are returned. For more information, see <strong>Error codes</strong>.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Additional information. Valid values:</p>
         * <ul>
         * <li>The error message returned because the request is normal and <strong>success</strong> is returned.</li>
         * <li>If the request is abnormal, the specific exception error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>30375C38-F4ED-4135-A0AE-5C75DC7F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the data is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the trace. This parameter is used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a0b2215622920113732501e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListSwimmingLaneGroupTagsResponseBody build() {
            return new ListSwimmingLaneGroupTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSwimmingLaneGroupTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGroupTagsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.metadata = builder.metadata;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String metadata; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.metadata = model.metadata;
                this.tag = model.tag;
            } 

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;version&quot;:&quot;1.0.0&quot;,&quot;owner&quot;:&quot;team-a&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The label of the lane.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

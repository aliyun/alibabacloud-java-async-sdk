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
 * {@link DeleteJobResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteJobResponseBody</p>
 */
public class DeleteJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

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

    private DeleteJobResponseBody(Builder builder) {
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

    public static DeleteJobResponseBody create() {
        return builder().build();
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
    public String getData() {
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
        private String data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
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
         * <p>The returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>{msg: &quot;&quot;, code: 200, success: true}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code that is returned. Take note of the following rules:</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned if the request is successful.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information that is returned. Valid values:</p>
         * <ul>
         * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
         * <li>An error code: If the call fails, an error code is returned.</li>
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
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the application is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The namespaces were obtained.</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DeleteJobResponseBody build() {
            return new DeleteJobResponseBody(this);
        } 

    } 

}

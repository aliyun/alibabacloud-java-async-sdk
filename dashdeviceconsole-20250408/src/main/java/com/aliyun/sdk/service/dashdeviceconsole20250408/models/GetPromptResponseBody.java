// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dashdeviceconsole20250408.models;

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
 * {@link GetPromptResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptResponseBody</p>
 */
public class GetPromptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    private GetPromptResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private Object data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(GetPromptResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.statusCode = model.statusCode;
        } 

        /**
         * data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BDA59622-2114-5F68-A530-3FCACAF0F04F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * statusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public GetPromptResponseBody build() {
            return new GetPromptResponseBody(this);
        } 

    } 

}

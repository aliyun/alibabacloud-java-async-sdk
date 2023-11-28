// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeLogstashTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ResumeLogstashTaskResponseBody</p>
 */
public class ResumeLogstashTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private ResumeLogstashTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeLogstashTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean result; 

        /**
         * The error code returned. If the API operation is successfully called, this parameter is not returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned. If the API operation is successfully called, this parameter is not returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the change task is resumed. Valid values:
         * <p>
         * 
         * *   true: The change task is resumed.
         * *   false: The change task fails to be resumed.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ResumeLogstashTaskResponseBody build() {
            return new ResumeLogstashTaskResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateEventSourceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEventSourceResponseBody</p>
 */
public class UpdateEventSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateEventSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventSourceResponseBody create() {
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
    public Boolean getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Boolean data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned response code. Valid values:
         * <p>
         * 
         * *   Success: The request is successful.
         * *   Other codes: The request failed. For more information about error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The result of the operation.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation is successful. The value true indicates that the operation is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateEventSourceResponseBody build() {
            return new UpdateEventSourceResponseBody(this);
        } 

    } 

}

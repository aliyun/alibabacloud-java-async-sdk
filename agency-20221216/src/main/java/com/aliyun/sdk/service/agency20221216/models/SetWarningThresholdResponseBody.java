// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWarningThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>SetWarningThresholdResponseBody</p>
 */
public class SetWarningThresholdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SetWarningThresholdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWarningThresholdResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Result Code:
         * <p>
         * * 200 OK
         * * 1109 System Error
         * * 3040 The Sub Account is frozen, the operation cannot be completed. 
         * * 3044 Alert proportion value is not a number.
         * * 3045 Alert proportion value should between 1 to 100.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Same as Code parameter value
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, the unique request identifier generated by Alibaba Cloud.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Candidate Value: True or False, which indicates whether the current API call itself is successful. does not represent the success of subsequent business operations.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SetWarningThresholdResponseBody build() {
            return new SetWarningThresholdResponseBody(this);
        } 

    } 

}

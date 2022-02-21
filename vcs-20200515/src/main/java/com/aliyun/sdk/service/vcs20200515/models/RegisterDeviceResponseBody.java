// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterDeviceResponseBody</p>
 */
public class RegisterDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetryInterval")
    private String retryInterval;

    private RegisterDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.retryInterval = builder.retryInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceResponseBody create() {
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
     * @return retryInterval
     */
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String retryInterval; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RetryInterval.
         */
        public Builder retryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        public RegisterDeviceResponseBody build() {
            return new RegisterDeviceResponseBody(this);
        } 

    } 

}

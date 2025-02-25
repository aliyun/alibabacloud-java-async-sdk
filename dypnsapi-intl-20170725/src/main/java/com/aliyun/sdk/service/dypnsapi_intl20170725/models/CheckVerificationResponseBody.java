// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi_intl20170725.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVerificationResponseBody</p>
 */
public class CheckVerificationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.Map < String, ? > model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CheckVerificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVerificationResponseBody create() {
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
     * @return model
     */
    public java.util.Map < String, ? > getModel() {
        return this.model;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.Map < String, ? > model; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code that was returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that was returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The data that was returned for the successful request. Example: "Model": { "phoneNumber": "", "channel": "", "verificationId": "", "status": "approved" },
         */
        public Builder model(java.util.Map < String, ? > model) {
            this.model = model;
            return this;
        }

        /**
         * The ID of the request. An ID is a unique identifier that Alibaba Cloud generates for a request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CheckVerificationResponseBody build() {
            return new CheckVerificationResponseBody(this);
        } 

    } 

}

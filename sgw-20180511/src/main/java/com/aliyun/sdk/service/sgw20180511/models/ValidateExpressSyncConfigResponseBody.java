// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateExpressSyncConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateExpressSyncConfigResponseBody</p>
 */
public class ValidateExpressSyncConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsValid")
    private Boolean isValid;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("ValidateMessage")
    private String validateMessage;

    private ValidateExpressSyncConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.isValid = builder.isValid;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.validateMessage = builder.validateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateExpressSyncConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isValid
     */
    public Boolean getIsValid() {
        return this.isValid;
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
     * @return validateMessage
     */
    public String getValidateMessage() {
        return this.validateMessage;
    }

    public static final class Builder {
        private String code; 
        private Boolean isValid; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String validateMessage; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsValid.
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ValidateMessage.
         */
        public Builder validateMessage(String validateMessage) {
            this.validateMessage = validateMessage;
            return this;
        }

        public ValidateExpressSyncConfigResponseBody build() {
            return new ValidateExpressSyncConfigResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckMnsServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckMnsServiceResponseBody</p>
 */
public class CheckMnsServiceResponseBody extends TeaModel {
    @NameInMap("CheckMessage")
    private String checkMessage;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckMnsServiceResponseBody(Builder builder) {
        this.checkMessage = builder.checkMessage;
        this.code = builder.code;
        this.isEnabled = builder.isEnabled;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckMnsServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkMessage
     */
    public String getCheckMessage() {
        return this.checkMessage;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
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
        private String checkMessage; 
        private String code; 
        private Boolean isEnabled; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * CheckMessage.
         */
        public Builder checkMessage(String checkMessage) {
            this.checkMessage = checkMessage;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
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

        public CheckMnsServiceResponseBody build() {
            return new CheckMnsServiceResponseBody(this);
        } 

    } 

}

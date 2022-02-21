// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>AddSmsSignResponseBody</p>
 */
public class AddSmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignName")
    private String signName;

    private AddSmsSignResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSmsSignResponseBody create() {
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String signName; 

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
         * SignName.
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        public AddSmsSignResponseBody build() {
            return new AddSmsSignResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindSubscriptionResponseBody</p>
 */
public class UnbindSubscriptionResponseBody extends TeaModel {
    @NameInMap("ChargeId")
    private String chargeId;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UnbindSubscriptionResponseBody(Builder builder) {
        this.chargeId = builder.chargeId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindSubscriptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return chargeId
     */
    public String getChargeId() {
        return this.chargeId;
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

    public static final class Builder {
        private String chargeId; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * ChargeId.
         */
        public Builder chargeId(String chargeId) {
            this.chargeId = chargeId;
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

        public UnbindSubscriptionResponseBody build() {
            return new UnbindSubscriptionResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindSubscriptionResponseBody</p>
 */
public class UnbindSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeId")
    private String chargeId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * A deprecated parameter.
         */
        public Builder chargeId(String chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
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

        public UnbindSubscriptionResponseBody build() {
            return new UnbindSubscriptionResponseBody(this);
        } 

    } 

}

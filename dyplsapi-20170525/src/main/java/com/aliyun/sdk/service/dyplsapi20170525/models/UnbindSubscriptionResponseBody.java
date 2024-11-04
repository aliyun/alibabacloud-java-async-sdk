// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>A deprecated parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder chargeId(String chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>986BCB6D-C9BF-42F9-91CE-3A9901233D36</p>
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

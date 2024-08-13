// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyResponseBody</p>
 */
public class VerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureValid")
    private Boolean signatureValid;

    private VerifyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signatureValid = builder.signatureValid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signatureValid
     */
    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean signatureValid; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the signature is valid. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder signatureValid(Boolean signatureValid) {
            this.signatureValid = signatureValid;
            return this;
        }

        public VerifyResponseBody build() {
            return new VerifyResponseBody(this);
        } 

    } 

}

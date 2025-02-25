// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1ed33293-2e48-6b14-861e-538e28e408eb</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the signature is valid. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

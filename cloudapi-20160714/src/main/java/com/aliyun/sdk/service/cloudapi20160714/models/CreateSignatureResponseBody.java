// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSignatureResponseBody</p>
 */
public class CreateSignatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignatureId")
    private String signatureId;

    @NameInMap("SignatureName")
    private String signatureName;

    private CreateSignatureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signatureId = builder.signatureId;
        this.signatureName = builder.signatureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return signatureName
     */
    public String getSignatureName() {
        return this.signatureName;
    }

    public static final class Builder {
        private String requestId; 
        private String signatureId; 
        private String signatureName; 

        /**
         * The name of the back-end signature key.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   The API operation only creates a key policy. You must call the binding operation to bind the key to an API.
         * *   After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.
         * *   The QPS limit on this operation is 50 per user.
         */
        public Builder signatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }

        /**
         * Creates a backend signature key.
         */
        public Builder signatureName(String signatureName) {
            this.signatureName = signatureName;
            return this;
        }

        public CreateSignatureResponseBody build() {
            return new CreateSignatureResponseBody(this);
        } 

    } 

}

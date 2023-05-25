// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySignatureResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySignatureResponseBody</p>
 */
public class ModifySignatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignatureId")
    private String signatureId;

    @NameInMap("SignatureName")
    private String signatureName;

    private ModifySignatureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signatureId = builder.signatureId;
        this.signatureName = builder.signatureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySignatureResponseBody create() {
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
         * The name of the key.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   This API operation modifies the name, Key value, and Secret value of an existing signature key.
         * *   Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.
         * *   The QPS limit on this operation is 50 per user.
         */
        public Builder signatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }

        /**
         * Modifies a backend signature key.
         */
        public Builder signatureName(String signatureName) {
            this.signatureName = signatureName;
            return this;
        }

        public ModifySignatureResponseBody build() {
            return new ModifySignatureResponseBody(this);
        } 

    } 

}

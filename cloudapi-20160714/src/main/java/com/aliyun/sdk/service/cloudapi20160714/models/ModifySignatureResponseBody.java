// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySignatureResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySignatureResponseBody</p>
 */
public class ModifySignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureId")
    private String signatureId;

    @com.aliyun.core.annotation.NameInMap("SignatureName")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the key.
         */
        public Builder signatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }

        /**
         * The name of the key.
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

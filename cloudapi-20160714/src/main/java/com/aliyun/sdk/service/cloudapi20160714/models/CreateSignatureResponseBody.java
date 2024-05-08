// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSignatureResponseBody</p>
 */
public class CreateSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureId")
    private String signatureId;

    @com.aliyun.core.annotation.NameInMap("SignatureName")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the back-end signature key.
         */
        public Builder signatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }

        /**
         * The name of the back-end signature key.
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

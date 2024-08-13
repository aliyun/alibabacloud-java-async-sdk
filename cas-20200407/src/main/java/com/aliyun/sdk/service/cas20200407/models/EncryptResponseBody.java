// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncryptResponseBody} extends {@link TeaModel}
 *
 * <p>EncryptResponseBody</p>
 */
public class EncryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EncryptResponseBody(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptResponseBody create() {
        return builder().build();
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String ciphertextBlob; 
        private String requestId; 

        /**
         * The unique identifier of the certificate.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * The data after encryption. The value is encoded in Base64.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EncryptResponseBody build() {
            return new EncryptResponseBody(this);
        } 

    } 

}

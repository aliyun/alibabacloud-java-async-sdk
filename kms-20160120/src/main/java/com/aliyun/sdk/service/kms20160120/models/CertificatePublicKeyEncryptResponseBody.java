// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePublicKeyEncryptResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePublicKeyEncryptResponseBody</p>
 */
public class CertificatePublicKeyEncryptResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @NameInMap("RequestId")
    private String requestId;

    private CertificatePublicKeyEncryptResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyEncryptResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
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
        private String certificateId; 
        private String ciphertextBlob; 
        private String requestId; 

        /**
         * The ID of the certificate.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The ciphertext.
         * <p>
         * 
         * The value is encoded in Base64.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CertificatePublicKeyEncryptResponseBody build() {
            return new CertificatePublicKeyEncryptResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeyDecryptResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePrivateKeyDecryptResponseBody</p>
 */
public class CertificatePrivateKeyDecryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CertificatePrivateKeyDecryptResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeyDecryptResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificateId; 
        private String plaintext; 
        private String requestId; 

        /**
         * The ID of the certificate.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The plaintext after data is decrypted.
         * <p>
         * 
         * The value is encoded in Base64.
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CertificatePrivateKeyDecryptResponseBody build() {
            return new CertificatePrivateKeyDecryptResponseBody(this);
        } 

    } 

}

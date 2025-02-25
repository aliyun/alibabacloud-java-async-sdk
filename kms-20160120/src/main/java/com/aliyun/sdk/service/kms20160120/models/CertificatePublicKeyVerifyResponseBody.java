// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePublicKeyVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>CertificatePublicKeyVerifyResponseBody</p>
 */
public class CertificatePublicKeyVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureValid")
    private Boolean signatureValid;

    private CertificatePublicKeyVerifyResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
        this.signatureValid = builder.signatureValid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePublicKeyVerifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
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
        private String certificateId; 
        private String requestId; 
        private Boolean signatureValid; 

        /**
         * The ID of the certificate.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The verification result. Valid values:
         * <p>
         * 
         * *   true: The signature is valid.
         * *   false: The signature is invalid.
         */
        public Builder signatureValid(Boolean signatureValid) {
            this.signatureValid = signatureValid;
            return this;
        }

        public CertificatePublicKeyVerifyResponseBody build() {
            return new CertificatePublicKeyVerifyResponseBody(this);
        } 

    } 

}

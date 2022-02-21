// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ExportCertificateResponseBody</p>
 */
public class ExportCertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("CertificateChain")
    private String certificateChain;

    @NameInMap("CertificateId")
    private String certificateId;

    @NameInMap("PKCS12Blob")
    private String PKCS12Blob;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RequestId")
    private String requestId;

    private ExportCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.certificateChain = builder.certificateChain;
        this.certificateId = builder.certificateId;
        this.PKCS12Blob = builder.PKCS12Blob;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return certificateChain
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return PKCS12Blob
     */
    public String getPKCS12Blob() {
        return this.PKCS12Blob;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificate; 
        private String certificateChain; 
        private String certificateId; 
        private String PKCS12Blob; 
        private String privateKey; 
        private String requestId; 

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * CertificateChain.
         */
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * PKCS12Blob.
         */
        public Builder PKCS12Blob(String PKCS12Blob) {
            this.PKCS12Blob = PKCS12Blob;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportCertificateResponseBody build() {
            return new ExportCertificateResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSMCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSMCertificateDetailResponseBody</p>
 */
public class DescribeCdnSMCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertExpireTime")
    private String certExpireTime;

    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("CertOrg")
    private String certOrg;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("EncryptCertificate")
    private String encryptCertificate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sans")
    private String sans;

    @com.aliyun.core.annotation.NameInMap("SignCertificate")
    private String signCertificate;

    private DescribeCdnSMCertificateDetailResponseBody(Builder builder) {
        this.certExpireTime = builder.certExpireTime;
        this.certIdentifier = builder.certIdentifier;
        this.certName = builder.certName;
        this.certOrg = builder.certOrg;
        this.commonName = builder.commonName;
        this.encryptCertificate = builder.encryptCertificate;
        this.requestId = builder.requestId;
        this.sans = builder.sans;
        this.signCertificate = builder.signCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSMCertificateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return certExpireTime
     */
    public String getCertExpireTime() {
        return this.certExpireTime;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certOrg
     */
    public String getCertOrg() {
        return this.certOrg;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return encryptCertificate
     */
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sans
     */
    public String getSans() {
        return this.sans;
    }

    /**
     * @return signCertificate
     */
    public String getSignCertificate() {
        return this.signCertificate;
    }

    public static final class Builder {
        private String certExpireTime; 
        private String certIdentifier; 
        private String certName; 
        private String certOrg; 
        private String commonName; 
        private String encryptCertificate; 
        private String requestId; 
        private String sans; 
        private String signCertificate; 

        /**
         * The expiration time of the certificate. The time is displayed in UTC.
         */
        public Builder certExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }

        /**
         * The ID of the certificate.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * The name of the certificate.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * The certificate authority (CA) that issued the certificate.
         */
        public Builder certOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }

        /**
         * The common name.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * The content of the encryption certificate.
         */
        public Builder encryptCertificate(String encryptCertificate) {
            this.encryptCertificate = encryptCertificate;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The subdomain name.
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * The content of the signature certificate.
         */
        public Builder signCertificate(String signCertificate) {
            this.signCertificate = signCertificate;
            return this;
        }

        public DescribeCdnSMCertificateDetailResponseBody build() {
            return new DescribeCdnSMCertificateDetailResponseBody(this);
        } 

    } 

}

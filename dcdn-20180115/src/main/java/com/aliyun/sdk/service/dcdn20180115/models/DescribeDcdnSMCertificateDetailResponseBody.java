// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSMCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSMCertificateDetailResponseBody</p>
 */
public class DescribeDcdnSMCertificateDetailResponseBody extends TeaModel {
    @NameInMap("CertExpireTime")
    private String certExpireTime;

    @NameInMap("CertIdentifier")
    private String certIdentifier;

    @NameInMap("CertName")
    private String certName;

    @NameInMap("CertOrg")
    private String certOrg;

    @NameInMap("CommonName")
    private String commonName;

    @NameInMap("EncryptCertificate")
    private String encryptCertificate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sans")
    private String sans;

    @NameInMap("SignCertificate")
    private String signCertificate;

    private DescribeDcdnSMCertificateDetailResponseBody(Builder builder) {
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

    public static DescribeDcdnSMCertificateDetailResponseBody create() {
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
         * The time when the certificate expires. The time is displayed in UTC.
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
         * The top-level domain name.
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
         * The domain name on the additional certificate.
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

        public DescribeDcdnSMCertificateDetailResponseBody build() {
            return new DescribeDcdnSMCertificateDetailResponseBody(this);
        } 

    } 

}

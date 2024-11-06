// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSMCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSMCertificateDetailResponseBody</p>
 */
public class DescribeDcdnSMCertificateDetailResponseBody extends TeaModel {
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
         * <p>The time when the certificate expires. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T09:42:28Z</p>
         */
        public Builder certExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>648****-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert Inc</p>
         */
        public Builder certOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }

        /**
         * <p>The top-level domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The content of the encryption certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>--BEGIN CERTIFICATE-----***-----END CERTIFICATE--</p>
         */
        public Builder encryptCertificate(String encryptCertificate) {
            this.encryptCertificate = encryptCertificate;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A7C69682-7F88-40DD-A198-10D0309E439D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The domain name on the additional certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>***.example.com</p>
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * <p>The content of the signature certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>--BEGIN CERTIFICATE-----***-----END CERTIFICATE--</p>
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

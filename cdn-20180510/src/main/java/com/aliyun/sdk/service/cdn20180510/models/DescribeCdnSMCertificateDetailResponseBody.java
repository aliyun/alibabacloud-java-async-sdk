// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSMCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSMCertificateDetailResponseBody</p>
 */
public class DescribeCdnSMCertificateDetailResponseBody extends TeaModel {
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
         * CertExpireTime.
         */
        public Builder certExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * CertOrg.
         */
        public Builder certOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * EncryptCertificate.
         */
        public Builder encryptCertificate(String encryptCertificate) {
            this.encryptCertificate = encryptCertificate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sans.
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * SignCertificate.
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

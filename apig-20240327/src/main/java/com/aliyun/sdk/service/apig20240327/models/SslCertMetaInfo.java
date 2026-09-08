// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SslCertMetaInfo} extends {@link TeaModel}
 *
 * <p>SslCertMetaInfo</p>
 */
public class SslCertMetaInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("certId")
    private Long certId;

    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("certName")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("commonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("domainMatchCert")
    private Boolean domainMatchCert;

    @com.aliyun.core.annotation.NameInMap("fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("isChainCompleted")
    private Boolean isChainCompleted;

    @com.aliyun.core.annotation.NameInMap("issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("keySize")
    private String keySize;

    @com.aliyun.core.annotation.NameInMap("md5")
    private String md5;

    @com.aliyun.core.annotation.NameInMap("notAfterTimestamp")
    private Long notAfterTimestamp;

    @com.aliyun.core.annotation.NameInMap("notBeforeTimestamp")
    private Long notBeforeTimestamp;

    @com.aliyun.core.annotation.NameInMap("sans")
    private String sans;

    @com.aliyun.core.annotation.NameInMap("serialNo")
    private String serialNo;

    @com.aliyun.core.annotation.NameInMap("sha2")
    private String sha2;

    @com.aliyun.core.annotation.NameInMap("signAlgorithm")
    private String signAlgorithm;

    private SslCertMetaInfo(Builder builder) {
        this.algorithm = builder.algorithm;
        this.certId = builder.certId;
        this.certIdentifier = builder.certIdentifier;
        this.certName = builder.certName;
        this.commonName = builder.commonName;
        this.domain = builder.domain;
        this.domainMatchCert = builder.domainMatchCert;
        this.fingerprint = builder.fingerprint;
        this.instanceId = builder.instanceId;
        this.isChainCompleted = builder.isChainCompleted;
        this.issuer = builder.issuer;
        this.keySize = builder.keySize;
        this.md5 = builder.md5;
        this.notAfterTimestamp = builder.notAfterTimestamp;
        this.notBeforeTimestamp = builder.notBeforeTimestamp;
        this.sans = builder.sans;
        this.serialNo = builder.serialNo;
        this.sha2 = builder.sha2;
        this.signAlgorithm = builder.signAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SslCertMetaInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
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
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainMatchCert
     */
    public Boolean getDomainMatchCert() {
        return this.domainMatchCert;
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isChainCompleted
     */
    public Boolean getIsChainCompleted() {
        return this.isChainCompleted;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return keySize
     */
    public String getKeySize() {
        return this.keySize;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return notAfterTimestamp
     */
    public Long getNotAfterTimestamp() {
        return this.notAfterTimestamp;
    }

    /**
     * @return notBeforeTimestamp
     */
    public Long getNotBeforeTimestamp() {
        return this.notBeforeTimestamp;
    }

    /**
     * @return sans
     */
    public String getSans() {
        return this.sans;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return sha2
     */
    public String getSha2() {
        return this.sha2;
    }

    /**
     * @return signAlgorithm
     */
    public String getSignAlgorithm() {
        return this.signAlgorithm;
    }

    public static final class Builder {
        private String algorithm; 
        private Long certId; 
        private String certIdentifier; 
        private String certName; 
        private String commonName; 
        private String domain; 
        private Boolean domainMatchCert; 
        private String fingerprint; 
        private String instanceId; 
        private Boolean isChainCompleted; 
        private String issuer; 
        private String keySize; 
        private String md5; 
        private Long notAfterTimestamp; 
        private Long notBeforeTimestamp; 
        private String sans; 
        private String serialNo; 
        private String sha2; 
        private String signAlgorithm; 

        private Builder() {
        } 

        private Builder(SslCertMetaInfo model) {
            this.algorithm = model.algorithm;
            this.certId = model.certId;
            this.certIdentifier = model.certIdentifier;
            this.certName = model.certName;
            this.commonName = model.commonName;
            this.domain = model.domain;
            this.domainMatchCert = model.domainMatchCert;
            this.fingerprint = model.fingerprint;
            this.instanceId = model.instanceId;
            this.isChainCompleted = model.isChainCompleted;
            this.issuer = model.issuer;
            this.keySize = model.keySize;
            this.md5 = model.md5;
            this.notAfterTimestamp = model.notAfterTimestamp;
            this.notBeforeTimestamp = model.notBeforeTimestamp;
            this.sans = model.sans;
            this.serialNo = model.serialNo;
            this.sha2 = model.sha2;
            this.signAlgorithm = model.signAlgorithm;
        } 

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA2048</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-123</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The certificate matching the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder domainMatchCert(Boolean domainMatchCert) {
            this.domainMatchCert = domainMatchCert;
            return this;
        }

        /**
         * <p>The certificate fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>A1:B2:C3:D4:E5:F6:78:90:AB:CD:EF:12:34:56:78:90</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1234567890</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>isChainCompleted</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isChainCompleted(Boolean isChainCompleted) {
            this.isChainCompleted = isChainCompleted;
            return this;
        }

        /**
         * <p>The certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert Inc</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The key size.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder keySize(String keySize) {
            this.keySize = keySize;
            return this;
        }

        /**
         * <p>The md5 value.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4E5F67890ABCDEF1234567890</p>
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890000</p>
         */
        public Builder notAfterTimestamp(Long notAfterTimestamp) {
            this.notAfterTimestamp = notAfterTimestamp;
            return this;
        }

        /**
         * <p>The time when the certificate starts to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890000</p>
         */
        public Builder notBeforeTimestamp(Long notBeforeTimestamp) {
            this.notBeforeTimestamp = notBeforeTimestamp;
            return this;
        }

        /**
         * <p>sans</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com,api.example.com,<a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * <p>The serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>03:A1:B2:C3:D4:E5:F6:78:90:AB:CD:EF:12:34:56:78:90</p>
         */
        public Builder serialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }

        /**
         * <p>The sha2 value.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4E5F67890ABCDEF1234567890ABCDEF1234567890ABCDEF1234567890</p>
         */
        public Builder sha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }

        /**
         * <p>The signature algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256WithRSAEncryption</p>
         */
        public Builder signAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }

        public SslCertMetaInfo build() {
            return new SslCertMetaInfo(this);
        } 

    } 

}

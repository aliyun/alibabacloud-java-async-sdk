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

        /**
         * algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * certId.
         */
        public Builder certId(Long certId) {
            this.certId = certId;
            return this;
        }

        /**
         * certIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * certName.
         */
        public Builder certName(String certName) {
            this.certName = certName;
            return this;
        }

        /**
         * commonName.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * domainMatchCert.
         */
        public Builder domainMatchCert(Boolean domainMatchCert) {
            this.domainMatchCert = domainMatchCert;
            return this;
        }

        /**
         * fingerprint.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * isChainCompleted.
         */
        public Builder isChainCompleted(Boolean isChainCompleted) {
            this.isChainCompleted = isChainCompleted;
            return this;
        }

        /**
         * issuer.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * keySize.
         */
        public Builder keySize(String keySize) {
            this.keySize = keySize;
            return this;
        }

        /**
         * md5.
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * notAfterTimestamp.
         */
        public Builder notAfterTimestamp(Long notAfterTimestamp) {
            this.notAfterTimestamp = notAfterTimestamp;
            return this;
        }

        /**
         * notBeforeTimestamp.
         */
        public Builder notBeforeTimestamp(Long notBeforeTimestamp) {
            this.notBeforeTimestamp = notBeforeTimestamp;
            return this;
        }

        /**
         * sans.
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * serialNo.
         */
        public Builder serialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }

        /**
         * sha2.
         */
        public Builder sha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }

        /**
         * signAlgorithm.
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

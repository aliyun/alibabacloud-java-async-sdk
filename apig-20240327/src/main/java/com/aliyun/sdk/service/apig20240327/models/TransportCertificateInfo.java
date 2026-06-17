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
 * {@link TransportCertificateInfo} extends {@link TeaModel}
 *
 * <p>TransportCertificateInfo</p>
 */
public class TransportCertificateInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("certName")
    private String certName;

    @com.aliyun.core.annotation.NameInMap("certificateMatchStatus")
    private String certificateMatchStatus;

    @com.aliyun.core.annotation.NameInMap("commonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("coveredDomains")
    private java.util.List<String> coveredDomains;

    @com.aliyun.core.annotation.NameInMap("issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("matchedDomains")
    private java.util.List<String> matchedDomains;

    @com.aliyun.core.annotation.NameInMap("notAfterTimestamp")
    private Long notAfterTimestamp;

    @com.aliyun.core.annotation.NameInMap("notBeforeTimestamp")
    private Long notBeforeTimestamp;

    @com.aliyun.core.annotation.NameInMap("sans")
    private String sans;

    private TransportCertificateInfo(Builder builder) {
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.certName = builder.certName;
        this.certificateMatchStatus = builder.certificateMatchStatus;
        this.commonName = builder.commonName;
        this.coveredDomains = builder.coveredDomains;
        this.issuer = builder.issuer;
        this.matchedDomains = builder.matchedDomains;
        this.notAfterTimestamp = builder.notAfterTimestamp;
        this.notBeforeTimestamp = builder.notBeforeTimestamp;
        this.sans = builder.sans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransportCertificateInfo create() {
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
     * @return certificateMatchStatus
     */
    public String getCertificateMatchStatus() {
        return this.certificateMatchStatus;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return coveredDomains
     */
    public java.util.List<String> getCoveredDomains() {
        return this.coveredDomains;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return matchedDomains
     */
    public java.util.List<String> getMatchedDomains() {
        return this.matchedDomains;
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

    public static final class Builder {
        private String algorithm; 
        private String certIdentifier; 
        private String certName; 
        private String certificateMatchStatus; 
        private String commonName; 
        private java.util.List<String> coveredDomains; 
        private String issuer; 
        private java.util.List<String> matchedDomains; 
        private Long notAfterTimestamp; 
        private Long notBeforeTimestamp; 
        private String sans; 

        private Builder() {
        } 

        private Builder(TransportCertificateInfo model) {
            this.algorithm = model.algorithm;
            this.certIdentifier = model.certIdentifier;
            this.certName = model.certName;
            this.certificateMatchStatus = model.certificateMatchStatus;
            this.commonName = model.commonName;
            this.coveredDomains = model.coveredDomains;
            this.issuer = model.issuer;
            this.matchedDomains = model.matchedDomains;
            this.notAfterTimestamp = model.notAfterTimestamp;
            this.notBeforeTimestamp = model.notBeforeTimestamp;
            this.sans = model.sans;
        } 

        /**
         * algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
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
         * certificateMatchStatus.
         */
        public Builder certificateMatchStatus(String certificateMatchStatus) {
            this.certificateMatchStatus = certificateMatchStatus;
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
         * coveredDomains.
         */
        public Builder coveredDomains(java.util.List<String> coveredDomains) {
            this.coveredDomains = coveredDomains;
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
         * matchedDomains.
         */
        public Builder matchedDomains(java.util.List<String> matchedDomains) {
            this.matchedDomains = matchedDomains;
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

        public TransportCertificateInfo build() {
            return new TransportCertificateInfo(this);
        } 

    } 

}

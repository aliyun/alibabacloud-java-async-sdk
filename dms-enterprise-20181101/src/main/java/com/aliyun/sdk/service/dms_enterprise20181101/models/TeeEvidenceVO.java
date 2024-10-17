// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TeeEvidenceVO} extends {@link TeaModel}
 *
 * <p>TeeEvidenceVO</p>
 */
public class TeeEvidenceVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CipherSuite")
    private String cipherSuite;

    @com.aliyun.core.annotation.NameInMap("EnclaveData")
    private String enclaveData;

    @com.aliyun.core.annotation.NameInMap("EncryptPublicKeyPem")
    private String encryptPublicKeyPem;

    @com.aliyun.core.annotation.NameInMap("EncryptPublicKeyType")
    private String encryptPublicKeyType;

    @com.aliyun.core.annotation.NameInMap("ModifiedDate")
    private String modifiedDate;

    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    @com.aliyun.core.annotation.NameInMap("PublicKeyRaBase64")
    private String publicKeyRaBase64;

    @com.aliyun.core.annotation.NameInMap("PublicKeyRaType")
    private String publicKeyRaType;

    @com.aliyun.core.annotation.NameInMap("QuoteReport")
    private String quoteReport;

    @com.aliyun.core.annotation.NameInMap("SignPublicKeyPem")
    private String signPublicKeyPem;

    @com.aliyun.core.annotation.NameInMap("SignPublicKeyType")
    private String signPublicKeyType;

    @com.aliyun.core.annotation.NameInMap("TrustedMrEnclave")
    private java.util.List < String > trustedMrEnclave;

    private TeeEvidenceVO(Builder builder) {
        this.cipherSuite = builder.cipherSuite;
        this.enclaveData = builder.enclaveData;
        this.encryptPublicKeyPem = builder.encryptPublicKeyPem;
        this.encryptPublicKeyType = builder.encryptPublicKeyType;
        this.modifiedDate = builder.modifiedDate;
        this.publicKey = builder.publicKey;
        this.publicKeyRaBase64 = builder.publicKeyRaBase64;
        this.publicKeyRaType = builder.publicKeyRaType;
        this.quoteReport = builder.quoteReport;
        this.signPublicKeyPem = builder.signPublicKeyPem;
        this.signPublicKeyType = builder.signPublicKeyType;
        this.trustedMrEnclave = builder.trustedMrEnclave;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TeeEvidenceVO create() {
        return builder().build();
    }

    /**
     * @return cipherSuite
     */
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    /**
     * @return enclaveData
     */
    public String getEnclaveData() {
        return this.enclaveData;
    }

    /**
     * @return encryptPublicKeyPem
     */
    public String getEncryptPublicKeyPem() {
        return this.encryptPublicKeyPem;
    }

    /**
     * @return encryptPublicKeyType
     */
    public String getEncryptPublicKeyType() {
        return this.encryptPublicKeyType;
    }

    /**
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return publicKeyRaBase64
     */
    public String getPublicKeyRaBase64() {
        return this.publicKeyRaBase64;
    }

    /**
     * @return publicKeyRaType
     */
    public String getPublicKeyRaType() {
        return this.publicKeyRaType;
    }

    /**
     * @return quoteReport
     */
    public String getQuoteReport() {
        return this.quoteReport;
    }

    /**
     * @return signPublicKeyPem
     */
    public String getSignPublicKeyPem() {
        return this.signPublicKeyPem;
    }

    /**
     * @return signPublicKeyType
     */
    public String getSignPublicKeyType() {
        return this.signPublicKeyType;
    }

    /**
     * @return trustedMrEnclave
     */
    public java.util.List < String > getTrustedMrEnclave() {
        return this.trustedMrEnclave;
    }

    public static final class Builder {
        private String cipherSuite; 
        private String enclaveData; 
        private String encryptPublicKeyPem; 
        private String encryptPublicKeyType; 
        private String modifiedDate; 
        private String publicKey; 
        private String publicKeyRaBase64; 
        private String publicKeyRaType; 
        private String quoteReport; 
        private String signPublicKeyPem; 
        private String signPublicKeyType; 
        private java.util.List < String > trustedMrEnclave; 

        /**
         * CipherSuite.
         */
        public Builder cipherSuite(String cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * EnclaveData.
         */
        public Builder enclaveData(String enclaveData) {
            this.enclaveData = enclaveData;
            return this;
        }

        /**
         * EncryptPublicKeyPem.
         */
        public Builder encryptPublicKeyPem(String encryptPublicKeyPem) {
            this.encryptPublicKeyPem = encryptPublicKeyPem;
            return this;
        }

        /**
         * EncryptPublicKeyType.
         */
        public Builder encryptPublicKeyType(String encryptPublicKeyType) {
            this.encryptPublicKeyType = encryptPublicKeyType;
            return this;
        }

        /**
         * ModifiedDate.
         */
        public Builder modifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * PublicKeyRaBase64.
         */
        public Builder publicKeyRaBase64(String publicKeyRaBase64) {
            this.publicKeyRaBase64 = publicKeyRaBase64;
            return this;
        }

        /**
         * PublicKeyRaType.
         */
        public Builder publicKeyRaType(String publicKeyRaType) {
            this.publicKeyRaType = publicKeyRaType;
            return this;
        }

        /**
         * QuoteReport.
         */
        public Builder quoteReport(String quoteReport) {
            this.quoteReport = quoteReport;
            return this;
        }

        /**
         * SignPublicKeyPem.
         */
        public Builder signPublicKeyPem(String signPublicKeyPem) {
            this.signPublicKeyPem = signPublicKeyPem;
            return this;
        }

        /**
         * SignPublicKeyType.
         */
        public Builder signPublicKeyType(String signPublicKeyType) {
            this.signPublicKeyType = signPublicKeyType;
            return this;
        }

        /**
         * TrustedMrEnclave.
         */
        public Builder trustedMrEnclave(java.util.List < String > trustedMrEnclave) {
            this.trustedMrEnclave = trustedMrEnclave;
            return this;
        }

        public TeeEvidenceVO build() {
            return new TeeEvidenceVO(this);
        } 

    } 

}

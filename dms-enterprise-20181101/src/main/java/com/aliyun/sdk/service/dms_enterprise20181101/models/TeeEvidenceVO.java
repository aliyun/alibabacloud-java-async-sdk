// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TeeEvidenceVO} extends {@link TeaModel}
 *
 * <p>TeeEvidenceVO</p>
 */
public class TeeEvidenceVO extends TeaModel {
    @NameInMap("CipherSuite")
    private String cipherSuite;

    @NameInMap("EnclaveData")
    private String enclaveData;

    @NameInMap("EncryptPublicKeyPem")
    private String encryptPublicKeyPem;

    @NameInMap("EncryptPublicKeyType")
    private String encryptPublicKeyType;

    @NameInMap("ModifiedDate")
    private String modifiedDate;

    @NameInMap("PublicKey")
    private String publicKey;

    @NameInMap("PublicKeyRaBase64")
    private String publicKeyRaBase64;

    @NameInMap("PublicKeyRaType")
    private String publicKeyRaType;

    @NameInMap("QuoteReport")
    private String quoteReport;

    @NameInMap("SignPublicKeyPem")
    private String signPublicKeyPem;

    @NameInMap("SignPublicKeyType")
    private String signPublicKeyType;

    @NameInMap("TrustedMrEnclave")
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
         * cipherSuite
         */
        public Builder cipherSuite(String cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * enclaveData
         */
        public Builder enclaveData(String enclaveData) {
            this.enclaveData = enclaveData;
            return this;
        }

        /**
         * 公钥pem格式数据
         */
        public Builder encryptPublicKeyPem(String encryptPublicKeyPem) {
            this.encryptPublicKeyPem = encryptPublicKeyPem;
            return this;
        }

        /**
         * 加密类型
         */
        public Builder encryptPublicKeyType(String encryptPublicKeyType) {
            this.encryptPublicKeyType = encryptPublicKeyType;
            return this;
        }

        /**
         * modifiedDate
         */
        public Builder modifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * publicKey
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * 校验数据
         */
        public Builder publicKeyRaBase64(String publicKeyRaBase64) {
            this.publicKeyRaBase64 = publicKeyRaBase64;
            return this;
        }

        /**
         * RA 校验类型
         */
        public Builder publicKeyRaType(String publicKeyRaType) {
            this.publicKeyRaType = publicKeyRaType;
            return this;
        }

        /**
         * quoteReport
         */
        public Builder quoteReport(String quoteReport) {
            this.quoteReport = quoteReport;
            return this;
        }

        /**
         * 签名pem格式数据
         */
        public Builder signPublicKeyPem(String signPublicKeyPem) {
            this.signPublicKeyPem = signPublicKeyPem;
            return this;
        }

        /**
         * 签名类型
         */
        public Builder signPublicKeyType(String signPublicKeyType) {
            this.signPublicKeyType = signPublicKeyType;
            return this;
        }

        /**
         * trustedMrEnclave
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

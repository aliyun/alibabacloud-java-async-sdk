// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UploadClientCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadClientCaCertificateResponseBody</p>
 */
public class UploadClientCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("FingerprintSha256")
    private String fingerprintSha256;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
    private String signatureAlgorithm;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("ValidityDays")
    private String validityDays;

    private UploadClientCaCertificateResponseBody(Builder builder) {
        this.commonName = builder.commonName;
        this.fingerprintSha256 = builder.fingerprintSha256;
        this.id = builder.id;
        this.issuer = builder.issuer;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.signatureAlgorithm = builder.signatureAlgorithm;
        this.status = builder.status;
        this.validityDays = builder.validityDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadClientCaCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return fingerprintSha256
     */
    public String getFingerprintSha256() {
        return this.fingerprintSha256;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return validityDays
     */
    public String getValidityDays() {
        return this.validityDays;
    }

    public static final class Builder {
        private String commonName; 
        private String fingerprintSha256; 
        private String id; 
        private String issuer; 
        private String notAfter; 
        private String notBefore; 
        private String requestId; 
        private String serialNumber; 
        private String signatureAlgorithm; 
        private String status; 
        private String validityDays; 

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * FingerprintSha256.
         */
        public Builder fingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
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
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * SignatureAlgorithm.
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ValidityDays.
         */
        public Builder validityDays(String validityDays) {
            this.validityDays = validityDays;
            return this;
        }

        public UploadClientCaCertificateResponseBody build() {
            return new UploadClientCaCertificateResponseBody(this);
        } 

    } 

}

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
 * {@link UploadSiteOriginClientCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadSiteOriginClientCertificateResponseBody</p>
 */
public class UploadSiteOriginClientCertificateResponseBody extends TeaModel {
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

    private UploadSiteOriginClientCertificateResponseBody(Builder builder) {
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

    public static UploadSiteOriginClientCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadSiteOriginClientCertificateResponseBody model) {
            this.commonName = model.commonName;
            this.fingerprintSha256 = model.fingerprintSha256;
            this.id = model.id;
            this.issuer = model.issuer;
            this.notAfter = model.notAfter;
            this.notBefore = model.notBefore;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
            this.signatureAlgorithm = model.signatureAlgorithm;
            this.status = model.status;
            this.validityDays = model.validityDays;
        } 

        /**
         * <p>The Common Name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The SHA-256 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456aca**</p>
         */
        public Builder fingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }

        /**
         * <p>The certificate ID on ESA.</p>
         * 
         * <strong>example:</strong>
         * <p>babaabcd****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The CA that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>GlobalSign nv-sa</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01T02:12:49Z</p>
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The time when the certificate takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-01T02:13:07Z</p>
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>babaded901474b9693acf530e0fb1d**</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256-RSA</p>
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The validity period of the certificate. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder validityDays(String validityDays) {
            this.validityDays = validityDays;
            return this;
        }

        public UploadSiteOriginClientCertificateResponseBody build() {
            return new UploadSiteOriginClientCertificateResponseBody(this);
        } 

    } 

}

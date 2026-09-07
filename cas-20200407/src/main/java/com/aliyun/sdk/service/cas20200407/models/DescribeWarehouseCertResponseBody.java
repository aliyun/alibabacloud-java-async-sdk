// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link DescribeWarehouseCertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWarehouseCertResponseBody</p>
 */
public class DescribeWarehouseCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CertStatus")
    private String certStatus;

    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("IssuerIdentifier")
    private String issuerIdentifier;

    @com.aliyun.core.annotation.NameInMap("PrivateCaInstanceId")
    private String privateCaInstanceId;

    @com.aliyun.core.annotation.NameInMap("PrivateCaRegionId")
    private String privateCaRegionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarehouseInstanceId")
    private String warehouseInstanceId;

    private DescribeWarehouseCertResponseBody(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.certStatus = builder.certStatus;
        this.certType = builder.certType;
        this.commonName = builder.commonName;
        this.content = builder.content;
        this.fingerprint = builder.fingerprint;
        this.issuer = builder.issuer;
        this.issuerIdentifier = builder.issuerIdentifier;
        this.privateCaInstanceId = builder.privateCaInstanceId;
        this.privateCaRegionId = builder.privateCaRegionId;
        this.requestId = builder.requestId;
        this.warehouseInstanceId = builder.warehouseInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarehouseCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return certStatus
     */
    public String getCertStatus() {
        return this.certStatus;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return issuerIdentifier
     */
    public String getIssuerIdentifier() {
        return this.issuerIdentifier;
    }

    /**
     * @return privateCaInstanceId
     */
    public String getPrivateCaInstanceId() {
        return this.privateCaInstanceId;
    }

    /**
     * @return privateCaRegionId
     */
    public String getPrivateCaRegionId() {
        return this.privateCaRegionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return warehouseInstanceId
     */
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String certStatus; 
        private String certType; 
        private String commonName; 
        private String content; 
        private String fingerprint; 
        private String issuer; 
        private String issuerIdentifier; 
        private String privateCaInstanceId; 
        private String privateCaRegionId; 
        private String requestId; 
        private String warehouseInstanceId; 

        private Builder() {
        } 

        private Builder(DescribeWarehouseCertResponseBody model) {
            this.certIdentifier = model.certIdentifier;
            this.certStatus = model.certStatus;
            this.certType = model.certType;
            this.commonName = model.commonName;
            this.content = model.content;
            this.fingerprint = model.fingerprint;
            this.issuer = model.issuer;
            this.issuerIdentifier = model.issuerIdentifier;
            this.privateCaInstanceId = model.privateCaInstanceId;
            this.privateCaRegionId = model.privateCaRegionId;
            this.requestId = model.requestId;
            this.warehouseInstanceId = model.warehouseInstanceId;
        } 

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        public Builder certStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>OV</p>
         */
        public Builder certType(String certType) {
            this.certType = certType;
            return this;
        }

        /**
         * <p>The common name of the certificate subject. This field is empty if the certificate subject does not include a common name (CN).</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The content of the certificate, including the certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>---BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The fingerprint of the certificate content.</p>
         * 
         * <strong>example:</strong>
         * <p>C1291AF83F48170E48140FDFE5DADC19FE51F261</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The common name (or organization name) of the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The unique identifier of the issuer certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder issuerIdentifier(String issuerIdentifier) {
            this.issuerIdentifier = issuerIdentifier;
            return this;
        }

        /**
         * <p>The instance ID of the private CA instance associated with the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder privateCaInstanceId(String privateCaInstanceId) {
            this.privateCaInstanceId = privateCaInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the private CA instance associated with the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder privateCaRegionId(String privateCaRegionId) {
            this.privateCaRegionId = privateCaRegionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance ID of the certificate warehouse.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        public Builder warehouseInstanceId(String warehouseInstanceId) {
            this.warehouseInstanceId = warehouseInstanceId;
            return this;
        }

        public DescribeWarehouseCertResponseBody build() {
            return new DescribeWarehouseCertResponseBody(this);
        } 

    } 

}

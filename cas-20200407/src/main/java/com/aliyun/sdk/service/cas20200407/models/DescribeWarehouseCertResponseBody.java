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
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * CertStatus.
         */
        public Builder certStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.certType = certType;
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
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Fingerprint.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
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
         * IssuerIdentifier.
         */
        public Builder issuerIdentifier(String issuerIdentifier) {
            this.issuerIdentifier = issuerIdentifier;
            return this;
        }

        /**
         * PrivateCaInstanceId.
         */
        public Builder privateCaInstanceId(String privateCaInstanceId) {
            this.privateCaInstanceId = privateCaInstanceId;
            return this;
        }

        /**
         * PrivateCaRegionId.
         */
        public Builder privateCaRegionId(String privateCaRegionId) {
            this.privateCaRegionId = privateCaRegionId;
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
         * WarehouseInstanceId.
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

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
 * {@link GetCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateResponseBody</p>
 */
public class GetCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String certificate; 
        private String requestId; 
        private Result result; 
        private Long siteId; 
        private String siteName; 
        private String status; 

        /**
         * <p>The certificate content.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The certificate information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>The certificate status.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetCertificateResponseBody build() {
            return new GetCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateResponseBody</p>
     */
    public static class DCV extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DCV(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DCV create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String id; 
            private String key; 
            private String status; 
            private String type; 
            private String value; 

            /**
             * <p>DCV ID。</p>
             * 
             * <strong>example:</strong>
             * <p>bababf7cdd1546a2ad04c0def1f4c980</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The certificate status.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DCV build() {
                return new DCV(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyCode")
        private Long applyCode;

        @com.aliyun.core.annotation.NameInMap("ApplyMessage")
        private String applyMessage;

        @com.aliyun.core.annotation.NameInMap("CasId")
        private String casId;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DCV")
        private java.util.List<DCV> DCV;

        @com.aliyun.core.annotation.NameInMap("FingerprintSha256")
        private String fingerprintSha256;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("IssuerCN")
        private String issuerCN;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private String notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private String notBefore;

        @com.aliyun.core.annotation.NameInMap("PubAlg")
        private String pubAlg;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SAN")
        private String SAN;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SigAlg")
        private String sigAlg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.applyCode = builder.applyCode;
            this.applyMessage = builder.applyMessage;
            this.casId = builder.casId;
            this.commonName = builder.commonName;
            this.createTime = builder.createTime;
            this.DCV = builder.DCV;
            this.fingerprintSha256 = builder.fingerprintSha256;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.issuerCN = builder.issuerCN;
            this.name = builder.name;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.pubAlg = builder.pubAlg;
            this.region = builder.region;
            this.SAN = builder.SAN;
            this.serialNumber = builder.serialNumber;
            this.sigAlg = builder.sigAlg;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return applyCode
         */
        public Long getApplyCode() {
            return this.applyCode;
        }

        /**
         * @return applyMessage
         */
        public String getApplyMessage() {
            return this.applyMessage;
        }

        /**
         * @return casId
         */
        public String getCasId() {
            return this.casId;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DCV
         */
        public java.util.List<DCV> getDCV() {
            return this.DCV;
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
         * @return issuerCN
         */
        public String getIssuerCN() {
            return this.issuerCN;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return pubAlg
         */
        public String getPubAlg() {
            return this.pubAlg;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return SAN
         */
        public String getSAN() {
            return this.SAN;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return sigAlg
         */
        public String getSigAlg() {
            return this.sigAlg;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long applyCode; 
            private String applyMessage; 
            private String casId; 
            private String commonName; 
            private String createTime; 
            private java.util.List<DCV> DCV; 
            private String fingerprintSha256; 
            private String id; 
            private String issuer; 
            private String issuerCN; 
            private String name; 
            private String notAfter; 
            private String notBefore; 
            private String pubAlg; 
            private String region; 
            private String SAN; 
            private String serialNumber; 
            private String sigAlg; 
            private String status; 
            private String type; 
            private String updateTime; 

            /**
             * ApplyCode.
             */
            public Builder applyCode(Long applyCode) {
                this.applyCode = applyCode;
                return this;
            }

            /**
             * ApplyMessage.
             */
            public Builder applyMessage(String applyMessage) {
                this.applyMessage = applyMessage;
                return this;
            }

            /**
             * <p>The certificate ID on Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>30000478</p>
             */
            public Builder casId(String casId) {
                this.casId = casId;
                return this;
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
             * <p>The time when the certificate was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12 02:00:53</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DCV.
             */
            public Builder DCV(java.util.List<DCV> DCV) {
                this.DCV = DCV;
                return this;
            }

            /**
             * <p>The SHA-256 fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456aca66</p>
             */
            public Builder fingerprintSha256(String fingerprintSha256) {
                this.fingerprintSha256 = fingerprintSha256;
                return this;
            }

            /**
             * <p>The certificate ID on ESA.</p>
             * 
             * <strong>example:</strong>
             * <p>babaded901474b9693acf530e0fb1d95</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>DigiCert</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The Common Name of the CA that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>DigiCert Global Root CA</p>
             */
            public Builder issuerCN(String issuerCN) {
                this.issuerCN = issuerCN;
                return this;
            }

            /**
             * <p>The certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>yourCertName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-26T16:00:00Z</p>
             */
            public Builder notAfter(String notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The time when the certificate takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-26T16:00:00Z</p>
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The public-key algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>ECDSA</p>
             */
            public Builder pubAlg(String pubAlg) {
                this.pubAlg = pubAlg;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The Subject Alternative Name (SAN) of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
             */
            public Builder SAN(String SAN) {
                this.SAN = SAN;
                return this;
            }

            /**
             * <p>The serial number of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>babaded901474b9693acf530e0fb1daa</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The signature algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>ECDSA-SHA1</p>
             */
            public Builder sigAlg(String sigAlg) {
                this.sigAlg = sigAlg;
                return this;
            }

            /**
             * <p>The certificate status.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The certificate type.</p>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the certificate was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-22 05:33:13</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

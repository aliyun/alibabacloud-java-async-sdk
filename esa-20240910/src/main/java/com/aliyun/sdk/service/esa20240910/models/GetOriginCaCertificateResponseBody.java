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
 * {@link GetOriginCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetOriginCaCertificateResponseBody</p>
 */
public class GetOriginCaCertificateResponseBody extends TeaModel {
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

    private GetOriginCaCertificateResponseBody(Builder builder) {
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

    public static GetOriginCaCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOriginCaCertificateResponseBody model) {
            this.certificate = model.certificate;
            this.requestId = model.requestId;
            this.result = model.result;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.status = model.status;
        } 

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
         * <p>3558df77-8a7a-4060-a900-2d7949403836</p>
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
         * <p>123456789****</p>
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
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetOriginCaCertificateResponseBody build() {
            return new GetOriginCaCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOriginCaCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginCaCertificateResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FingerprintSha256")
        private String fingerprintSha256;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private String notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private String notBefore;

        @com.aliyun.core.annotation.NameInMap("PubkeyAlgorithm")
        private String pubkeyAlgorithm;

        @com.aliyun.core.annotation.NameInMap("SAN")
        private String SAN;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SignatureAlgorithm")
        private String signatureAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.commonName = builder.commonName;
            this.createTime = builder.createTime;
            this.fingerprintSha256 = builder.fingerprintSha256;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.pubkeyAlgorithm = builder.pubkeyAlgorithm;
            this.SAN = builder.SAN;
            this.serialNumber = builder.serialNumber;
            this.signatureAlgorithm = builder.signatureAlgorithm;
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
         * @return pubkeyAlgorithm
         */
        public String getPubkeyAlgorithm() {
            return this.pubkeyAlgorithm;
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
            private String commonName; 
            private String createTime; 
            private String fingerprintSha256; 
            private String id; 
            private String issuer; 
            private String name; 
            private String notAfter; 
            private String notBefore; 
            private String pubkeyAlgorithm; 
            private String SAN; 
            private String serialNumber; 
            private String signatureAlgorithm; 
            private String status; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.commonName = model.commonName;
                this.createTime = model.createTime;
                this.fingerprintSha256 = model.fingerprintSha256;
                this.id = model.id;
                this.issuer = model.issuer;
                this.name = model.name;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.pubkeyAlgorithm = model.pubkeyAlgorithm;
                this.SAN = model.SAN;
                this.serialNumber = model.serialNumber;
                this.signatureAlgorithm = model.signatureAlgorithm;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
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
             * <p>2024-03-05 18:24:04</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The SHA-256 fingerprint of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456a****</p>
             */
            public Builder fingerprintSha256(String fingerprintSha256) {
                this.fingerprintSha256 = fingerprintSha256;
                return this;
            }

            /**
             * <p>The certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>babaabcd****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The certificate authority (CA) that issued the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>GlobalSign nv-sa</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
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
             * <p>2024-03-31 02:08:00</p>
             */
            public Builder notAfter(String notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The time when the certificate takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-31 02:08:00</p>
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The public-key algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder pubkeyAlgorithm(String pubkeyAlgorithm) {
                this.pubkeyAlgorithm = pubkeyAlgorithm;
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
             * <p>The certificate type.</p>
             * 
             * <strong>example:</strong>
             * <p>upload</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the certificate was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:24:04</p>
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

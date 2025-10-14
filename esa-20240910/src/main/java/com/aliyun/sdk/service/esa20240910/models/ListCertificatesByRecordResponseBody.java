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
 * {@link ListCertificatesByRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificatesByRecordResponseBody</p>
 */
public class ListCertificatesByRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCertificatesByRecordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesByRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Long siteId; 
        private String siteName; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertificatesByRecordResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried certificates.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The website ID,</p>
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
         * <p>The total number of records that you specified.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertificatesByRecordResponseBody build() {
            return new ListCertificatesByRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertificatesByRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificatesByRecordResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasId")
        private String casId;

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

        private Certificates(Builder builder) {
            this.casId = builder.casId;
            this.commonName = builder.commonName;
            this.createTime = builder.createTime;
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

        public static Certificates create() {
            return builder().build();
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
            private String casId; 
            private String commonName; 
            private String createTime; 
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

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.casId = model.casId;
                this.commonName = model.commonName;
                this.createTime = model.createTime;
                this.fingerprintSha256 = model.fingerprintSha256;
                this.id = model.id;
                this.issuer = model.issuer;
                this.issuerCN = model.issuerCN;
                this.name = model.name;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.pubAlg = model.pubAlg;
                this.region = model.region;
                this.SAN = model.SAN;
                this.serialNumber = model.serialNumber;
                this.sigAlg = model.sigAlg;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The certificate ID on Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>30000137</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-28 06:17:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>babab022c5e9b27bf9c64d7f4b1667f4</p>
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
             * <p>The Common Name of the certificate issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>GlobalSign Organization Validation CA - SHA256 - G3</p>
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
             * <p>2024-02-28 06:17:11</p>
             */
            public Builder notAfter(String notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The time when the certificate takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-28 06:17:11</p>
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The public key algorithm of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder pubAlg(String pubAlg) {
                this.pubAlg = pubAlg;
                return this;
            }

            /**
             * <p>The region where the certificate is stored.</p>
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
             * <p>baba39055622c008b90285a8838ed09a</p>
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
            public Builder sigAlg(String sigAlg) {
                this.sigAlg = sigAlg;
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
             * <p>The type of the SSL certificate. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-28 06:17:11</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCertificatesByRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificatesByRecordResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplylingCount")
        private Long applylingCount;

        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.applylingCount = builder.applylingCount;
            this.certificates = builder.certificates;
            this.count = builder.count;
            this.recordName = builder.recordName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return applylingCount
         */
        public Long getApplylingCount() {
            return this.applylingCount;
        }

        /**
         * @return certificates
         */
        public java.util.List<Certificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long applylingCount; 
            private java.util.List<Certificates> certificates; 
            private Long count; 
            private String recordName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.applylingCount = model.applylingCount;
                this.certificates = model.certificates;
                this.count = model.count;
                this.recordName = model.recordName;
                this.status = model.status;
            } 

            /**
             * <p>The number of certificates that are being requested.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder applylingCount(Long applylingCount) {
                this.applylingCount = applylingCount;
                return this;
            }

            /**
             * <p>The certificates that match the specified records.</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The number of certificates that match the specified records.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the record.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>Certificate configuration status. Possible values: none; configured; applying; failed.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

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
 * {@link ListCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificatesResponseBody</p>
 */
public class ListCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

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

    private ListCertificatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Long siteId; 
        private String siteName; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertificatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.result = model.result;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertificatesResponseBody build() {
            return new ListCertificatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DCV model) {
                this.id = model.id;
                this.key = model.key;
                this.status = model.status;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The DCV ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bababf7cdd1546a2ad04c0def1f4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The DCV name. It is a TXT record name if Type is DNS or URL if Type is HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow">http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow</a></p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The verification status.</p>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The DCV type. Valid values: DNS and HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The DCV content.</p>
             * 
             * <strong>example:</strong>
             * <p>pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow.KfzYo4LH3EgOt7a73G-RqZkbR0eYtLfEUmtmqGmr4FQ</p>
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
     * {@link ListCertificatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertificatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.applyCode = model.applyCode;
                this.applyMessage = model.applyMessage;
                this.casId = model.casId;
                this.commonName = model.commonName;
                this.createTime = model.createTime;
                this.DCV = model.DCV;
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
             * <p>The error code returned for certificate application.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder applyCode(Long applyCode) {
                this.applyCode = applyCode;
                return this;
            }

            /**
             * <p>The error message returned for certificate application.</p>
             * 
             * <strong>example:</strong>
             * <p>canceled</p>
             */
            public Builder applyMessage(String applyMessage) {
                this.applyMessage = applyMessage;
                return this;
            }

            /**
             * <p>The certificate ID on Certificate Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>30000569</p>
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
             * <p>2022-06-24 07:48:51</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Domain Control Validation (DCV) information.</p>
             */
            public Builder DCV(java.util.List<DCV> DCV) {
                this.DCV = DCV;
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
             * <p>The certificate ID on ESA.</p>
             * 
             * <strong>example:</strong>
             * <p>baba39055622c008b90285a8838e****</p>
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
             * <p>babab022c5e9b27bf9c64d7f4b16****</p>
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
             * <p>The certificate status.</p>
             * <ul>
             * <li>OK</li>
             * <li>Expired</li>
             * <li>Expiring</li>
             * <li>Issued</li>
             * <li>Applying</li>
             * <li>ApplyFailed</li>
             * <li>Canceled</li>
             * </ul>
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
             * <ul>
             * <li>cas: certificate that is purchased by using Certificate Management Service</li>
             * <li>upload: custom certificate that you upload</li>
             * <li>free: free certificate</li>
             * </ul>
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
             * <p>2023-04-20 06:18:42</p>
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

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
 * {@link ListCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertificatesResponseBody</p>
 */
public class ListCertificatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateList")
    private java.util.List<CertificateList> certificateList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCertificatesResponseBody(Builder builder) {
        this.certificateList = builder.certificateList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
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
     * @return certificateList
     */
    public java.util.List<CertificateList> getCertificateList() {
        return this.certificateList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CertificateList> certificateList; 
        private Integer currentPage; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertificatesResponseBody model) {
            this.certificateList = model.certificateList;
            this.currentPage = model.currentPage;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of certificates.</p>
         */
        public Builder certificateList(java.util.List<CertificateList> certificateList) {
            this.certificateList = certificateList;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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
    public static class CertificateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateSource")
        private String certificateSource;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ExistPrivateKey")
        private Boolean existPrivateKey;

        @com.aliyun.core.annotation.NameInMap("FingerPrint")
        private String fingerPrint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("KeySize")
        private Integer keySize;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("Serial")
        private String serial;

        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
        private java.util.List<String> subjectAlternativeNames;

        @com.aliyun.core.annotation.NameInMap("UsingProductList")
        private java.util.List<String> usingProductList;

        private CertificateList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certIdentifier = builder.certIdentifier;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateSource = builder.certificateSource;
            this.certificateStatus = builder.certificateStatus;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.existPrivateKey = builder.existPrivateKey;
            this.fingerPrint = builder.fingerPrint;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.keySize = builder.keySize;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.serial = builder.serial;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
            this.usingProductList = builder.usingProductList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateList create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateSource
         */
        public String getCertificateSource() {
            return this.certificateSource;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return existPrivateKey
         */
        public Boolean getExistPrivateKey() {
            return this.existPrivateKey;
        }

        /**
         * @return fingerPrint
         */
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return keySize
         */
        public Integer getKeySize() {
            return this.keySize;
        }

        /**
         * @return notAfter
         */
        public Long getNotAfter() {
            return this.notAfter;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return serial
         */
        public String getSerial() {
            return this.serial;
        }

        /**
         * @return subjectAlternativeNames
         */
        public java.util.List<String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        /**
         * @return usingProductList
         */
        public java.util.List<String> getUsingProductList() {
            return this.usingProductList;
        }

        public static final class Builder {
            private String algorithm; 
            private String certIdentifier; 
            private String certificateId; 
            private String certificateName; 
            private String certificateSource; 
            private String certificateStatus; 
            private String commonName; 
            private String domain; 
            private Boolean existPrivateKey; 
            private String fingerPrint; 
            private String instanceId; 
            private String issuer; 
            private Integer keySize; 
            private Long notAfter; 
            private Long notBefore; 
            private String serial; 
            private java.util.List<String> subjectAlternativeNames; 
            private java.util.List<String> usingProductList; 

            private Builder() {
            } 

            private Builder(CertificateList model) {
                this.algorithm = model.algorithm;
                this.certIdentifier = model.certIdentifier;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
                this.certificateSource = model.certificateSource;
                this.certificateStatus = model.certificateStatus;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.existPrivateKey = model.existPrivateKey;
                this.fingerPrint = model.fingerPrint;
                this.instanceId = model.instanceId;
                this.issuer = model.issuer;
                this.keySize = model.keySize;
                this.notAfter = model.notAfter;
                this.notBefore = model.notBefore;
                this.serial = model.serial;
                this.subjectAlternativeNames = model.subjectAlternativeNames;
                this.usingProductList = model.usingProductList;
            } 

            /**
             * <p>The encryption algorithm of the certificate. Valid values:</p>
             * <ul>
             * <li><p><strong>RSA</strong></p>
             * </li>
             * <li><p><strong>ECC</strong></p>
             * </li>
             * <li><p><strong>SM2</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The global ID of the certificate. This ID is used across Alibaba Cloud services and is in the <code>Certificate ID-Region ID</code> format. For example, if a certificate ID is <code>123</code>, the <code>CertIdentifier</code> is <code>123-cn-hangzhou</code> for the Alibaba Cloud China site and <code>123-ap-southeast-1</code> for the Alibaba Cloud International site (www\.alibabacloud.com).</p>
             * <ul>
             * <li><p>For the Alibaba Cloud China website, the format is certificate ID + &quot;-cn-hangzhou&quot;.</p>
             * </li>
             * <li><p>For the Alibaba Cloud International website (www\.alibabacloud.com), the format is certificate ID + &quot;-ap-southeast-1&quot;.</p>
             * </li>
             * </ul>
             * <p>For example, if the certificate ID is 123, the CertIdentifier is &quot;123-cn-hangzhou&quot; for the China site and &quot;123-ap-southeast-1&quot; for the International site.</p>
             * 
             * <strong>example:</strong>
             * <p>21589515-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>17281539</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>The source of the certificate.</p>
             * <ul>
             * <li><p>BUY: A purchased certificate.</p>
             * </li>
             * <li><p>TEST: A test certificate.</p>
             * </li>
             * <li><p>UPLOAD: An uploaded certificate.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder certificateSource(String certificateSource) {
                this.certificateSource = certificateSource;
                return this;
            }

            /**
             * <p>The status of the certificate.</p>
             * <ul>
             * <li><p><strong>issued</strong>: The certificate is issued.</p>
             * </li>
             * <li><p><strong>revoked</strong>: The certificate is revoked.</p>
             * </li>
             * <li><p><strong>willExpire</strong>: The certificate is about to expire.</p>
             * </li>
             * <li><p><strong>expired</strong>: The certificate has expired.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>issued</p>
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * <p>The common name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The domain names that are bound to the certificate. Multiple domain names are separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether a private key is available. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: A private key is available.</p>
             * </li>
             * <li><p><strong>false</strong>: A private key is not available.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder existPrivateKey(Boolean existPrivateKey) {
                this.existPrivateKey = existPrivateKey;
                return this;
            }

            /**
             * <p>The fingerprint of the public key.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fingerPrint(String fingerPrint) {
                this.fingerPrint = fingerPrint;
                return this;
            }

            /**
             * <p>The ID of the certificate instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-cn-v***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The certification authority.</p>
             * 
             * <strong>example:</strong>
             * <p>DigiCert</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The key size, in bits.</p>
             * <ul>
             * <li><p>For RSA keys, typical sizes are 2048, 3072, or 4096.</p>
             * </li>
             * <li><p>For ECC or SM2 keys, the typical size is 256.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder keySize(Integer keySize) {
                this.keySize = keySize;
                return this;
            }

            /**
             * <p>The end of the certificate validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1749580567000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The beginning of the certificate validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1760745600000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The serial number of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder serial(String serial) {
                this.serial = serial;
                return this;
            }

            /**
             * <p>An array that contains the alternative domain names of the certificate. This parameter corresponds to the <code>Subject Alternative Name</code> field of the certificate.</p>
             */
            public Builder subjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            /**
             * <p>The list of Alibaba Cloud products in which the certificate is deployed.</p>
             */
            public Builder usingProductList(java.util.List<String> usingProductList) {
                this.usingProductList = usingProductList;
                return this;
            }

            public CertificateList build() {
                return new CertificateList(this);
            } 

        } 

    }
}

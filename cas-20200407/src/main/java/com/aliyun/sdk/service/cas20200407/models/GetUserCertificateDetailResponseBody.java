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
 * {@link GetUserCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserCertificateDetailResponseBody</p>
 */
public class GetUserCertificateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("BuyInAliyun")
    private Boolean buyInAliyun;

    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.NameInMap("CertChain")
    private java.util.List<CertChain> certChain;

    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("Common")
    private String common;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("EncryptCert")
    private String encryptCert;

    @com.aliyun.core.annotation.NameInMap("EncryptPrivateKey")
    private String encryptPrivateKey;

    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private Long notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private Long notBefore;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("OrgName")
    private String orgName;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Sans")
    private String sans;

    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.NameInMap("Sha2")
    private String sha2;

    @com.aliyun.core.annotation.NameInMap("SignCert")
    private String signCert;

    @com.aliyun.core.annotation.NameInMap("SignPrivateKey")
    private String signPrivateKey;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private GetUserCertificateDetailResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.buyInAliyun = builder.buyInAliyun;
        this.cert = builder.cert;
        this.certChain = builder.certChain;
        this.certIdentifier = builder.certIdentifier;
        this.city = builder.city;
        this.common = builder.common;
        this.country = builder.country;
        this.encryptCert = builder.encryptCert;
        this.encryptPrivateKey = builder.encryptPrivateKey;
        this.endDate = builder.endDate;
        this.expired = builder.expired;
        this.fingerprint = builder.fingerprint;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.issuer = builder.issuer;
        this.key = builder.key;
        this.name = builder.name;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.orderId = builder.orderId;
        this.orgName = builder.orgName;
        this.province = builder.province;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sans = builder.sans;
        this.serialNo = builder.serialNo;
        this.sha2 = builder.sha2;
        this.signCert = builder.signCert;
        this.signPrivateKey = builder.signPrivateKey;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCertificateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return buyInAliyun
     */
    public Boolean getBuyInAliyun() {
        return this.buyInAliyun;
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return certChain
     */
    public java.util.List<CertChain> getCertChain() {
        return this.certChain;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return common
     */
    public String getCommon() {
        return this.common;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return encryptCert
     */
    public String getEncryptCert() {
        return this.encryptCert;
    }

    /**
     * @return encryptPrivateKey
     */
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sans
     */
    public String getSans() {
        return this.sans;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return sha2
     */
    public String getSha2() {
        return this.sha2;
    }

    /**
     * @return signCert
     */
    public String getSignCert() {
        return this.signCert;
    }

    /**
     * @return signPrivateKey
     */
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder {
        private String algorithm; 
        private Boolean buyInAliyun; 
        private String cert; 
        private java.util.List<CertChain> certChain; 
        private String certIdentifier; 
        private String city; 
        private String common; 
        private String country; 
        private String encryptCert; 
        private String encryptPrivateKey; 
        private String endDate; 
        private Boolean expired; 
        private String fingerprint; 
        private Long id; 
        private String instanceId; 
        private String issuer; 
        private String key; 
        private String name; 
        private Long notAfter; 
        private Long notBefore; 
        private Long orderId; 
        private String orgName; 
        private String province; 
        private String requestId; 
        private String resourceGroupId; 
        private String sans; 
        private String serialNo; 
        private String sha2; 
        private String signCert; 
        private String signPrivateKey; 
        private String startDate; 

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>Indicates whether the certificate was purchased from Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder buyInAliyun(Boolean buyInAliyun) {
            this.buyInAliyun = buyInAliyun;
            return this;
        }

        /**
         * <p>The content of the certificate if the certificate does not use an SM algorithm. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>---BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * <p>The certificate chain.</p>
         */
        public Builder certChain(java.util.List<CertChain> certChain) {
            this.certChain = certChain;
            return this;
        }

        /**
         * <p>The certificate identifier. The value is in the &quot;Certificate ID-cn-hangzhou&quot; format. For example, if the ID of the certificate is 123, the value of CertIdentifier is 123-cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>10741304-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The city of the company or organization to which the certificate purchaser belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>The primary domain name that is bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        public Builder common(String common) {
            this.common = common;
            return this;
        }

        /**
         * <p>The country or region of the company or organization to which the certificate purchaser belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * <p>The content of the encryption certificate if the certificate uses an SM algorithm and is encoded in the PEM format. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICDzCCA***
         * -----END CERTIFICATE-----</p>
         */
        public Builder encryptCert(String encryptCert) {
            this.encryptCert = encryptCert;
            return this;
        }

        /**
         * <p>The private key of the encryption certificate if the certificate uses an SM algorithm and is encoded in the PEM format. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN EC PRIVATE KEY-----
         * MHcCAQEEI****
         * -----END EC PRIVATE KEY-----</p>
         */
        public Builder encryptPrivateKey(String encryptPrivateKey) {
            this.encryptPrivateKey = encryptPrivateKey;
            return this;
        }

        /**
         * <p>The expiration date of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-25</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Indicates whether the certificate has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1D7801BBE772D5DE55CBF1F88AEB41A42402DA07</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>121345</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The instance ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-upload-50yf1q</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>The private key of the certificate if the certificate does not use an SM algorithm. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY----- MII.... -----END RSA PRIVATE KEY-----</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cert_name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The end of the validity period of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>17322613180000</p>
         */
        public Builder notAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The beginning of the validity period of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>17312613180000</p>
         */
        public Builder notBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The name of the company or organization to which the certificate purchaser belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * <p>The province of the company or organization to which the certificate purchaser belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>zhejiang</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek****wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>All domain names that are bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>06ea4879591ddf84e6c8b6ba43607ccf</p>
         */
        public Builder serialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }

        /**
         * <p>The SHA-2 value of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>840707695D5EE41323102DDC2CB4924AA561012FBDC4E1A6324147119ED3C339</p>
         */
        public Builder sha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }

        /**
         * <p>The content of the signing certificate if the certificate uses an SM algorithm and is encoded in the PEM format. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICDzCCAbagAw****
         * -----END CERTIFICATE-----</p>
         */
        public Builder signCert(String signCert) {
            this.signCert = signCert;
            return this;
        }

        /**
         * <p>The private key of the signing certificate if the certificate uses an SM algorithm and is encoded in the PEM format. If certFilter is set to false, this parameter is returned. Otherwise, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN EC PRIVATE KEY-----
         * MHcCAQEEILR****
         * -----END EC PRIVATE KEY-----</p>
         */
        public Builder signPrivateKey(String signPrivateKey) {
            this.signPrivateKey = signPrivateKey;
            return this;
        }

        /**
         * <p>The issuance date of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public GetUserCertificateDetailResponseBody build() {
            return new GetUserCertificateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserCertificateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserCertificateDetailResponseBody</p>
     */
    public static class CertChain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("IssuerCommonName")
        private String issuerCommonName;

        @com.aliyun.core.annotation.NameInMap("NotAfter")
        private Long notAfter;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("RemainDay")
        private Integer remainDay;

        private CertChain(Builder builder) {
            this.commonName = builder.commonName;
            this.issuerCommonName = builder.issuerCommonName;
            this.notAfter = builder.notAfter;
            this.notBefore = builder.notBefore;
            this.remainDay = builder.remainDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertChain create() {
            return builder().build();
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return issuerCommonName
         */
        public String getIssuerCommonName() {
            return this.issuerCommonName;
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
         * @return remainDay
         */
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public static final class Builder {
            private String commonName; 
            private String issuerCommonName; 
            private Long notAfter; 
            private Long notBefore; 
            private Integer remainDay; 

            /**
             * <p>The common name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The common name of the issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>Encryption Everywhere DV TLS CA - G2</p>
             */
            public Builder issuerCommonName(String issuerCommonName) {
                this.issuerCommonName = issuerCommonName;
                return this;
            }

            /**
             * <p>The end of the validity period of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>17322613180000</p>
             */
            public Builder notAfter(Long notAfter) {
                this.notAfter = notAfter;
                return this;
            }

            /**
             * <p>The beginning of the validity period of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>17302633180000</p>
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * <p>The remaining days of the certificate validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder remainDay(Integer remainDay) {
                this.remainDay = remainDay;
                return this;
            }

            public CertChain build() {
                return new CertChain(this);
            } 

        } 

    }
}

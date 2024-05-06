// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
        this.city = builder.city;
        this.common = builder.common;
        this.country = builder.country;
        this.encryptCert = builder.encryptCert;
        this.encryptPrivateKey = builder.encryptPrivateKey;
        this.endDate = builder.endDate;
        this.expired = builder.expired;
        this.fingerprint = builder.fingerprint;
        this.id = builder.id;
        this.issuer = builder.issuer;
        this.key = builder.key;
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.orgName = builder.orgName;
        this.province = builder.province;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sans = builder.sans;
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
        private String city; 
        private String common; 
        private String country; 
        private String encryptCert; 
        private String encryptPrivateKey; 
        private String endDate; 
        private Boolean expired; 
        private String fingerprint; 
        private Long id; 
        private String issuer; 
        private String key; 
        private String name; 
        private Long orderId; 
        private String orgName; 
        private String province; 
        private String requestId; 
        private String resourceGroupId; 
        private String sans; 
        private String signCert; 
        private String signPrivateKey; 
        private String startDate; 

        /**
         * The algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Indicates whether the certificate was purchased from Alibaba Cloud. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder buyInAliyun(Boolean buyInAliyun) {
            this.buyInAliyun = buyInAliyun;
            return this;
        }

        /**
         * The content of the certificate.
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * The city of the company or organization to which the certificate purchaser belongs.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * The parent domain name that is bound to the certificate.
         */
        public Builder common(String common) {
            this.common = common;
            return this;
        }

        /**
         * The country or region of the company or organization to which the certificate purchaser belongs.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * The content of the encryption certificate in PEM format.
         */
        public Builder encryptCert(String encryptCert) {
            this.encryptCert = encryptCert;
            return this;
        }

        /**
         * The private key of the encryption certificate in the PEM format.
         */
        public Builder encryptPrivateKey(String encryptPrivateKey) {
            this.encryptPrivateKey = encryptPrivateKey;
            return this;
        }

        /**
         * The expiration date of the certificate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Indicates whether the certificate has expired. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * The fingerprint of the certificate.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * The ID of the certificate.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The certificate authority (CA) that issued the certificate.
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * The private key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The name of the certificate.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the certificate application order.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The name of the company or organization to which the certificate purchaser belongs.
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * The province of the company or organization to which the certificate purchaser belongs.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the certificate belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * All domain names that are bound to the certificate.
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * The content of the signing certificate in the PEM format.
         */
        public Builder signCert(String signCert) {
            this.signCert = signCert;
            return this;
        }

        /**
         * The private key of the signing certificate in the PEM format.
         */
        public Builder signPrivateKey(String signPrivateKey) {
            this.signPrivateKey = signPrivateKey;
            return this;
        }

        /**
         * The issuance date of the certificate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public GetUserCertificateDetailResponseBody build() {
            return new GetUserCertificateDetailResponseBody(this);
        } 

    } 

}

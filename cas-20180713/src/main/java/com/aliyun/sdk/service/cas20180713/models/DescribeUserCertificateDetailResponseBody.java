// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserCertificateDetailResponseBody</p>
 */
public class DescribeUserCertificateDetailResponseBody extends TeaModel {
    @NameInMap("BuyInAliyun")
    private Boolean buyInAliyun;

    @NameInMap("Cert")
    private String cert;

    @NameInMap("City")
    private String city;

    @NameInMap("Common")
    private String common;

    @NameInMap("Country")
    private String country;

    @NameInMap("EndDate")
    private String endDate;

    @NameInMap("Expired")
    private Boolean expired;

    @NameInMap("Fingerprint")
    private String fingerprint;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Issuer")
    private String issuer;

    @NameInMap("Key")
    private String key;

    @NameInMap("Name")
    private String name;

    @NameInMap("OrgName")
    private String orgName;

    @NameInMap("Province")
    private String province;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sans")
    private String sans;

    @NameInMap("StartDate")
    private String startDate;

    private DescribeUserCertificateDetailResponseBody(Builder builder) {
        this.buyInAliyun = builder.buyInAliyun;
        this.cert = builder.cert;
        this.city = builder.city;
        this.common = builder.common;
        this.country = builder.country;
        this.endDate = builder.endDate;
        this.expired = builder.expired;
        this.fingerprint = builder.fingerprint;
        this.id = builder.id;
        this.issuer = builder.issuer;
        this.key = builder.key;
        this.name = builder.name;
        this.orgName = builder.orgName;
        this.province = builder.province;
        this.requestId = builder.requestId;
        this.sans = builder.sans;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateDetailResponseBody create() {
        return builder().build();
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
     * @return sans
     */
    public String getSans() {
        return this.sans;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder {
        private Boolean buyInAliyun; 
        private String cert; 
        private String city; 
        private String common; 
        private String country; 
        private String endDate; 
        private Boolean expired; 
        private String fingerprint; 
        private Long id; 
        private String issuer; 
        private String key; 
        private String name; 
        private String orgName; 
        private String province; 
        private String requestId; 
        private String sans; 
        private String startDate; 

        /**
         * BuyInAliyun.
         */
        public Builder buyInAliyun(Boolean buyInAliyun) {
            this.buyInAliyun = buyInAliyun;
            return this;
        }

        /**
         * Cert.
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Common.
         */
        public Builder common(String common) {
            this.common = common;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
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
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OrgName.
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.province = province;
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
         * Sans.
         */
        public Builder sans(String sans) {
            this.sans = sans;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public DescribeUserCertificateDetailResponseBody build() {
            return new DescribeUserCertificateDetailResponseBody(this);
        } 

    } 

}

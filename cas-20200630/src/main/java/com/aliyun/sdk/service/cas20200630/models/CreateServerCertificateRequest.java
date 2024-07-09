// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateServerCertificateRequest</p>
 */
public class CreateServerCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterTime")
    private Long afterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTime")
    private Long beforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrl")
    private Long enableCrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Immediately")
    private Integer immediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locality")
    private String locality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Months")
    private Integer months;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
    private String organizationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Integer years;

    private CreateServerCertificateRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.days = builder.days;
        this.domain = builder.domain;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.locality = builder.locality;
        this.months = builder.months;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterTime
     */
    public Long getAfterTime() {
        return this.afterTime;
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return beforeTime
     */
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enableCrl
     */
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    /**
     * @return immediately
     */
    public Integer getImmediately() {
        return this.immediately;
    }

    /**
     * @return locality
     */
    public String getLocality() {
        return this.locality;
    }

    /**
     * @return months
     */
    public Integer getMonths() {
        return this.months;
    }

    /**
     * @return organization
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return organizationUnit
     */
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    /**
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return years
     */
    public Integer getYears() {
        return this.years;
    }

    public static final class Builder extends Request.Builder<CreateServerCertificateRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private Integer days; 
        private String domain; 
        private Long enableCrl; 
        private Integer immediately; 
        private String locality; 
        private Integer months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private String state; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerCertificateRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.days = request.days;
            this.domain = request.domain;
            this.enableCrl = request.enableCrl;
            this.immediately = request.immediately;
            this.locality = request.locality;
            this.months = request.months;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * The expiration time of the server certificate. This value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * >  The **BeforeTime** and **AfterTime** parameters must be both empty or both specified.
         */
        public Builder afterTime(Long afterTime) {
            this.putQueryParameter("AfterTime", afterTime);
            this.afterTime = afterTime;
            return this;
        }

        /**
         * The key algorithm of the server certificate. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:
         * <p>
         * 
         * *   **RSA\_1024**: The signature algorithm is Sha256WithRSA.
         * *   **RSA\_2048**: The signature algorithm is Sha256WithRSA.
         * *   **RSA\_4096**: The signature algorithm is Sha256WithRSA.
         * *   **ECC\_256**: The signature algorithm is Sha256WithECDSA.
         * *   **ECC\_384**: The signature algorithm is Sha256WithECDSA.
         * *   **ECC\_512**: The signature algorithm is Sha256WithECDSA.
         * *   **SM2\_256**: The signature algorithm is SM3WithSM2.
         * 
         * The encryption algorithm of the server certificate must be the same as the encryption algorithm of the intermediate CA certificate. The key length can be different. For example, if the key algorithm of the intermediate CA certificate is RSA\_2048, the key algorithm of the server certificate must be RSA\_1024, RSA\_2048, or RSA\_4096.
         * 
         * >  You can call the [DescribeCACertificate](~~328096~~) operation to query the key algorithm of an intermediate CA certificate.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The issuance time of the server certificate. This value is a UNIX timestamp. The default value is the time when you call this operation. Unit: seconds.
         * <p>
         * 
         * >  The **BeforeTime** and **AfterTime** parameters must be both empty or both specified.
         */
        public Builder beforeTime(Long beforeTime) {
            this.putQueryParameter("BeforeTime", beforeTime);
            this.beforeTime = beforeTime;
            return this;
        }

        /**
         * The name of the certificate user. The user of a server certificate is a server. We recommend that you enter the domain name or IP address of the server.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * The code of the country in which the organization is located, such as CN or US.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * The validity period of the server certificate. Unit: days. You must specify at least one of the **Days**, **BeforeTime**, and **AfterTime** parameters. The **BeforeTime** and **AfterTime** parameters must be both empty or both specified. The following list describes how to specify these parameters:
         * <p>
         * 
         * *   If you specify the **Days** parameter, you can specify both the **BeforeTime** and **AfterTime** parameters or leave them both empty.
         * *   If you do not specify the **Days** parameter, you must specify both the **BeforeTime** and **AfterTime** parameters.
         * 
         * > 
         * 
         * *   If you specify the **Days**, **BeforeTime**, and **AfterTime** parameters together, the validity period of the server certificate is determined by the value of the **Days** parameter.
         * 
         * *   The validity period of the server certificate cannot exceed the validity period of the intermediate CA certificate. You can call the [DescribeCACertificate](~~328096~~) operation to query the validity period of an intermediate CA certificate.
         */
        public Builder days(Integer days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        /**
         * The additional domain names and additional IP addresses of the server certificate. After you add additional domain names and additional IP addresses to a certificate, you can apply the certificate to the domain names and IP addresses.
         * <p>
         * 
         * Separate multiple domain names and multiple IP addresses with commas (,).
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * include the CRL address.
         * <p>
         * 
         * - 0- No
         * - 1- Yes
         */
        public Builder enableCrl(Long enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * Specifies whether to return the certificate. Valid values:
         * <p>
         * 
         * *   **0**: does not return the certificate. This is the default value.
         * *   **1**: returns the certificate.
         * *   **2**: returns the certificate and the certificate chain of the certificate.
         */
        public Builder immediately(Integer immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * The name of the city in which the organization is located. The value can contain letters. The default value is the name of the city in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * The validity period of the server certificate. Unit: months.
         */
        public Builder months(Integer months) {
            this.putQueryParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * The name of the organization. Default value: Alibaba Inc.
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * The name of the department. Default value: Aliyun CDN.
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * The unique identifier of the intermediate CA certificate from which the server certificate is issued.
         * <p>
         * 
         * >  You can call the [DescribeCACertificateList](~~328095~~) operation to query the unique identifier of an intermediate CA certificate.
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * The province, municipality, or autonomous region in which the organization is located. The value can contain letters. The default value is the name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The validity period of the server certificate. Unit: years.
         */
        public Builder years(Integer years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateServerCertificateRequest build() {
            return new CreateServerCertificateRequest(this);
        } 

    } 

}

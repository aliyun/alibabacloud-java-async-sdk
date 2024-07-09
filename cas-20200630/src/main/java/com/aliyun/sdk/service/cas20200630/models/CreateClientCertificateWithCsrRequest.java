// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientCertificateWithCsrRequest} extends {@link RequestModel}
 *
 * <p>CreateClientCertificateWithCsrRequest</p>
 */
public class CreateClientCertificateWithCsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterTime")
    private Long afterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTime")
    private Long beforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

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
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanType")
    private Integer sanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanValue")
    private String sanValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Integer years;

    private CreateClientCertificateWithCsrRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.csr = builder.csr;
        this.days = builder.days;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.locality = builder.locality;
        this.months = builder.months;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.sanType = builder.sanType;
        this.sanValue = builder.sanValue;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientCertificateWithCsrRequest create() {
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
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
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
     * @return sanType
     */
    public Integer getSanType() {
        return this.sanType;
    }

    /**
     * @return sanValue
     */
    public String getSanValue() {
        return this.sanValue;
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

    public static final class Builder extends Request.Builder<CreateClientCertificateWithCsrRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private String csr; 
        private Integer days; 
        private Long enableCrl; 
        private Integer immediately; 
        private String locality; 
        private Integer months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private Integer sanType; 
        private String sanValue; 
        private String state; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientCertificateWithCsrRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.csr = request.csr;
            this.days = request.days;
            this.enableCrl = request.enableCrl;
            this.immediately = request.immediately;
            this.locality = request.locality;
            this.months = request.months;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.sanType = request.sanType;
            this.sanValue = request.sanValue;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * The expiration time of the client certificate. This value is a UNIX timestamp. Unit: seconds.
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
         * The key algorithm of the client certificate. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:
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
         * The encryption algorithm of the client certificate must be the same with the encryption algorithm of the intermediate CA certificate. The key length can be different. For example, if the key algorithm of the intermediate CA certificate is RSA\_2048, the key algorithm of the client certificate must be RSA\_1024, RSA\_2048, or RSA\_4096.
         * 
         * >  You can call the [DescribeCACertificate](~~328096~~) operation to query the key algorithm of an intermediate CA certificate.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The issuance time of the client certificate. This value is a UNIX timestamp. The default value is the time when you call this operation. Unit: seconds.
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
         * The common name of the certificate. The value can contain letters.
         * <p>
         * 
         * >  If you specify the **CsrPemString** parameter, the value of the **CommonName** parameter is determined by the **CsrPemString** parameter.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * The code of the country in which the organization is located, such as **CN** and **US**.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * The content of the CSR file. You can generate a CSR file by using the OpenSSL tool or Keytool. For more information, see [How do I create a CSR file?](~~42218~~) You can also create a CSR file in the Certificate Management Service console. For more information, see [Create a CSR](~~313297~~).
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * The validity period of the client certificate. Unit: days. You must specify at least one of the **Days**, **BeforeTime**, and **AfterTime** parameters. The **BeforeTime** and **AfterTime** parameters must be both empty or both specified. The following list describes how to specify these parameters:
         * <p>
         * 
         * *   If you specify the **Days** parameter, you can specify both the **BeforeTime** and **AfterTime** parameters or leave them both empty.********
         * *   If you do not specify the **Days** parameter, you must specify both the **BeforeTime** and **AfterTime** parameters.
         * 
         * > 
         * 
         * *   If you specify the **Days**, **BeforeTime**, and **AfterTime** parameters together, the validity period of the client certificate is determined by the value of the **Days** parameter.
         * 
         * *   The validity period of the client certificate cannot exceed the validity period of the intermediate CA certificate. You can call the [DescribeCACertificate](~~328096~~) operation to query the validity period of an intermediate CA certificate.
         */
        public Builder days(Integer days) {
            this.putQueryParameter("Days", days);
            this.days = days;
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
         * The validity period of the client certificate. Unit: months.
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
         * The unique identifier of the intermediate CA certificate from which the client certificate is issued.
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
         * The type of the Subject Alternative Name (SAN) extension that is supported by the client certificate. Valid values:
         * <p>
         * 
         * *   **1**: an email address
         * *   **6**: a Uniform Resource Identifier (URI)
         */
        public Builder sanType(Integer sanType) {
            this.putQueryParameter("SanType", sanType);
            this.sanType = sanType;
            return this;
        }

        /**
         * The content of the extension. You can specify multiple SAN extensions. If you want to specify multiple SAN extensions, separate them with commas (,).
         */
        public Builder sanValue(String sanValue) {
            this.putQueryParameter("SanValue", sanValue);
            this.sanValue = sanValue;
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
         * The validity period of the client certificate. Unit: years.
         */
        public Builder years(Integer years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateClientCertificateWithCsrRequest build() {
            return new CreateClientCertificateWithCsrRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRootCACertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateRootCACertificateRequest</p>
 */
public class CreateRootCACertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locality")
    @com.aliyun.core.annotation.Validation(required = true)
    private String locality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    @com.aliyun.core.annotation.Validation(required = true)
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer years;

    private CreateRootCACertificateRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.commonName = builder.commonName;
        this.countryCode = builder.countryCode;
        this.locality = builder.locality;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRootCACertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return locality
     */
    public String getLocality() {
        return this.locality;
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

    public static final class Builder extends Request.Builder<CreateRootCACertificateRequest, Builder> {
        private String algorithm; 
        private String commonName; 
        private String countryCode; 
        private String locality; 
        private String organization; 
        private String organizationUnit; 
        private String state; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateRootCACertificateRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.commonName = request.commonName;
            this.countryCode = request.countryCode;
            this.locality = request.locality;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * The key algorithm of the root CA certificate. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:
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
         * The encryption algorithm of the root CA certificate must be consistent with the **encryption algorithm** of the private root CA instance that you purchase. For example, if the **encryption algorithm** of the private root CA instance that you purchase is **RSA**, the key algorithm of the root CA certificate must be **RSA\_1024**, **RSA\_2048**, or **RSA\_4096**.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The common name or abbreviation of the organization. The value can contain letters.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * The code of the country or region in which the organization is located. You can enter an alpha-2 code. For example, you can use **CN** to indicate China and use **US** to indicate the United States.
         * <p>
         * 
         * For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * The name of the city in which the organization is located. The value can contain letters.
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * The name of the organization that is associated with the root CA certificate. You can enter the name of your enterprise or company. The value can contain letters.
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * The name of the department or branch in the organization. The value can contain letters.
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * The name of the province, municipality, or autonomous region in which the organization is located. The value can contain letters.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The validity period of the root CA certificate. Unit: years.
         * <p>
         * 
         * >  We recommend that you set this parameter to a value from 5 to 10.
         */
        public Builder years(Integer years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateRootCACertificateRequest build() {
            return new CreateRootCACertificateRequest(this);
        } 

    } 

}

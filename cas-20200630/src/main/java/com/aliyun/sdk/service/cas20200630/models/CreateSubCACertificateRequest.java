// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCACertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateSubCACertificateRequest</p>
 */
public class CreateSubCACertificateRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CommonName")
    @Validation(required = true)
    private String commonName;

    @Query
    @NameInMap("CountryCode")
    private String countryCode;

    @Query
    @NameInMap("CrlDay")
    private Integer crlDay;

    @Query
    @NameInMap("EnableCrl")
    private Boolean enableCrl;

    @Query
    @NameInMap("ExtendedKeyUsages")
    private java.util.List < String > extendedKeyUsages;

    @Query
    @NameInMap("Locality")
    @Validation(required = true)
    private String locality;

    @Query
    @NameInMap("Organization")
    @Validation(required = true)
    private String organization;

    @Query
    @NameInMap("OrganizationUnit")
    @Validation(required = true)
    private String organizationUnit;

    @Query
    @NameInMap("ParentIdentifier")
    @Validation(required = true)
    private String parentIdentifier;

    @Query
    @NameInMap("PathLenConstraint")
    private Integer pathLenConstraint;

    @Query
    @NameInMap("State")
    @Validation(required = true)
    private String state;

    @Query
    @NameInMap("Years")
    @Validation(required = true)
    private Integer years;

    private CreateSubCACertificateRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.commonName = builder.commonName;
        this.countryCode = builder.countryCode;
        this.crlDay = builder.crlDay;
        this.enableCrl = builder.enableCrl;
        this.extendedKeyUsages = builder.extendedKeyUsages;
        this.locality = builder.locality;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.pathLenConstraint = builder.pathLenConstraint;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCACertificateRequest create() {
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
     * @return crlDay
     */
    public Integer getCrlDay() {
        return this.crlDay;
    }

    /**
     * @return enableCrl
     */
    public Boolean getEnableCrl() {
        return this.enableCrl;
    }

    /**
     * @return extendedKeyUsages
     */
    public java.util.List < String > getExtendedKeyUsages() {
        return this.extendedKeyUsages;
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
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    /**
     * @return pathLenConstraint
     */
    public Integer getPathLenConstraint() {
        return this.pathLenConstraint;
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

    public static final class Builder extends Request.Builder<CreateSubCACertificateRequest, Builder> {
        private String algorithm; 
        private String commonName; 
        private String countryCode; 
        private Integer crlDay; 
        private Boolean enableCrl; 
        private java.util.List < String > extendedKeyUsages; 
        private String locality; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private Integer pathLenConstraint; 
        private String state; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubCACertificateRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.commonName = request.commonName;
            this.countryCode = request.countryCode;
            this.crlDay = request.crlDay;
            this.enableCrl = request.enableCrl;
            this.extendedKeyUsages = request.extendedKeyUsages;
            this.locality = request.locality;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.pathLenConstraint = request.pathLenConstraint;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * The type of the key algorithm of the intermediate CA. The key algorithm is in the `<Encryption algorithm>_<Key length>` format. Valid values:
         * <p>
         * 
         * *   **RSA\_1024**: The signature algorithm is Sha256WithRSA.
         * *   **RSA\_2048**: The signature algorithm is Sha256WithRSA.
         * *   **RSA\_4096**: The signature algorithm is Sha256WithRSA.
         * *   **ECC\_256**: The signature algorithm is Sha256WithECDSA.
         * *   **SM2\_256**: The signature algorithm is SM3WithSM2.
         * 
         * The encryption algorithm of an intermediate CA certificate must be consistent with the encryption algorithm of a root CA certificate. The length of the keys can be different. For example, if the key algorithm of the root CA certificate is **RSA\_2048**, the key algorithm of the intermediate CA certificate must be **RSA\_1024**, **RSA\_2048**, or **RSA\_4096**.
         * 
         * > You can call the [DescribeCACertificate](~~465954~~) operation to query the key algorithm of a root CA certificate.
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
         * The code of the country or region in which the organization is located. You can enter an alpha-2 or alpha-3 code. For example, you can use **CN** to indicate China and use **US** to indicate the United States.
         * <p>
         * 
         * For more information about country codes, see the **"Country codes"** section in [Manage company profiles](~~198289~~).
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * CRL validity period: 1-365 days
         */
        public Builder crlDay(Integer crlDay) {
            this.putQueryParameter("CrlDay", crlDay);
            this.crlDay = crlDay;
            return this;
        }

        /**
         * Enable Crl Service.
         * <p>
         * 
         * - 0- No
         * - 1- Yes
         */
        public Builder enableCrl(Boolean enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * The extended key usages of the certificate.
         */
        public Builder extendedKeyUsages(java.util.List < String > extendedKeyUsages) {
            this.putQueryParameter("ExtendedKeyUsages", extendedKeyUsages);
            this.extendedKeyUsages = extendedKeyUsages;
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
         * The name of the organization that is associated with the intermediate CA certificate. You can enter the name of your enterprise or company. The value can contain letters.
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
         * The unique identifier of the root CA certificate.
         * <p>
         * 
         * > You can call the [DescribeCACertificateList] operation to query the unique identifiers of all CA certificates.
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * The path length constraint of the certificate. Default value: 0.
         */
        public Builder pathLenConstraint(Integer pathLenConstraint) {
            this.putQueryParameter("PathLenConstraint", pathLenConstraint);
            this.pathLenConstraint = pathLenConstraint;
            return this;
        }

        /**
         * The name of the province or state in which the organization is located. The value can contain letters.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The validity period of the intermediate CA certificate. Unit: years.
         * <p>
         * 
         * We recommend that you set this parameter to 5 to 10.
         * 
         * > The validity period of the intermediate CA certificate cannot exceed the validity period of the root CA certificate. You can call the [DescribeCACertificate]operation to query the validity period of a root CA certificate.
         */
        public Builder years(Integer years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateSubCACertificateRequest build() {
            return new CreateSubCACertificateRequest(this);
        } 

    } 

}

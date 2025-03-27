// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link CreateSubCACertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateSubCACertificateRequest</p>
 */
public class CreateSubCACertificateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CrlDay")
    private Integer crlDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrl")
    private Boolean enableCrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendedKeyUsages")
    private java.util.List<String> extendedKeyUsages;

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
    @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathLenConstraint")
    private Integer pathLenConstraint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    @com.aliyun.core.annotation.Validation(required = true)
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getExtendedKeyUsages() {
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
        private java.util.List<String> extendedKeyUsages; 
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
         * <p>The type of the key algorithm of the intermediate CA. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of an intermediate CA certificate must be consistent with the encryption algorithm of a root CA certificate. The length of the keys can be different. For example, if the key algorithm of the root CA certificate is <strong>RSA_2048</strong>, the key algorithm of the intermediate CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> operation to query the key algorithm of a root CA certificate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The common name or abbreviation of the organization. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The code of the country or region in which the organization is located. You can enter an alpha-2 or alpha-3 code. For example, you can use <strong>CN</strong> to indicate China and use <strong>US</strong> to indicate the United States.</p>
         * <p>For more information about country codes, see the <strong>&quot;Country codes&quot;</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>CRL validity period: 1-365 days</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder crlDay(Integer crlDay) {
            this.putQueryParameter("CrlDay", crlDay);
            this.crlDay = crlDay;
            return this;
        }

        /**
         * <p>Enable Crl Service.</p>
         * <ul>
         * <li>0- No</li>
         * <li>1- Yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrl(Boolean enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * <p>The extended key usages of the certificate.</p>
         */
        public Builder extendedKeyUsages(java.util.List<String> extendedKeyUsages) {
            this.putQueryParameter("ExtendedKeyUsages", extendedKeyUsages);
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }

        /**
         * <p>The name of the city in which the organization is located. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * <p>The name of the organization that is associated with the intermediate CA certificate. You can enter the name of your enterprise or company. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Maizi Technology</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The name of the department or branch in the organization. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * <p>The unique identifier of the root CA certificate.</p>
         * <blockquote>
         * <p>You can call the [DescribeCACertificateList] operation to query the unique identifiers of all CA certificates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1a83bcbb89e562885e40aa0108f5****</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * <p>The path length constraint of the certificate. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pathLenConstraint(Integer pathLenConstraint) {
            this.putQueryParameter("PathLenConstraint", pathLenConstraint);
            this.pathLenConstraint = pathLenConstraint;
            return this;
        }

        /**
         * <p>The name of the province or state in which the organization is located. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The validity period of the intermediate CA certificate. Unit: years.</p>
         * <p>We recommend that you set this parameter to 5 to 10.</p>
         * <blockquote>
         * <p>The validity period of the intermediate CA certificate cannot exceed the validity period of the root CA certificate. You can call the [DescribeCACertificate]operation to query the validity period of a root CA certificate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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

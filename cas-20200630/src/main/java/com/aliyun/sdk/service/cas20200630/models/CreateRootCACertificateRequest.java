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
         * <p>The key algorithm of the root CA certificate. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the root CA certificate must be consistent with the <strong>encryption algorithm</strong> of the private root CA instance that you purchase. For example, if the <strong>encryption algorithm</strong> of the private root CA instance that you purchase is <strong>RSA</strong>, the key algorithm of the root CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
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
         * <p>Alibaba</p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The code of the country or region in which the organization is located. You can enter an alpha-2 code. For example, you can use <strong>CN</strong> to indicate China and use <strong>US</strong> to indicate the United States.</p>
         * <p>For more information about country codes, see the <strong>&quot;Country codes&quot;</strong> section of the <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a> topic.</p>
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
         * <p>The name of the organization that is associated with the root CA certificate. You can enter the name of your enterprise or company. The value can contain letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
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
         * <p>The name of the province, municipality, or autonomous region in which the organization is located. The value can contain letters.</p>
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
         * <p>The validity period of the root CA certificate. Unit: years.</p>
         * <blockquote>
         * <p> We recommend that you set this parameter to a value from 5 to 10.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

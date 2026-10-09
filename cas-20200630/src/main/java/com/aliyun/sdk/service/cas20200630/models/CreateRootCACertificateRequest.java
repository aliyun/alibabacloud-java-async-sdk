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
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    @com.aliyun.core.annotation.Validation(required = true)
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer years;

    private CreateRootCACertificateRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.clientToken = builder.clientToken;
        this.commonName = builder.commonName;
        this.countryCode = builder.countryCode;
        this.locality = builder.locality;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.tags = builder.tags;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return years
     */
    public Integer getYears() {
        return this.years;
    }

    public static final class Builder extends Request.Builder<CreateRootCACertificateRequest, Builder> {
        private String algorithm; 
        private String clientToken; 
        private String commonName; 
        private String countryCode; 
        private String locality; 
        private String organization; 
        private String organizationUnit; 
        private String resourceGroupId; 
        private String state; 
        private java.util.List<Tags> tags; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateRootCACertificateRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.clientToken = request.clientToken;
            this.commonName = request.commonName;
            this.countryCode = request.countryCode;
            this.locality = request.locality;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.resourceGroupId = request.resourceGroupId;
            this.state = request.state;
            this.tags = request.tags;
            this.years = request.years;
        } 

        /**
         * <p>The key algorithm of the root CA certificate. The key algorithm is in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><p><strong>RSA_1024</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
         * </li>
         * <li><p><strong>RSA_2048</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
         * </li>
         * <li><p><strong>RSA_4096</strong>: The corresponding signature algorithm is Sha256WithRSA.</p>
         * </li>
         * <li><p><strong>ECC_256</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
         * </li>
         * <li><p><strong>ECC_384</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
         * </li>
         * <li><p><strong>ECC_512</strong>: The corresponding signature algorithm is Sha256WithECDSA.</p>
         * </li>
         * <li><p><strong>SM2_256</strong>: The corresponding signature algorithm is SM3WithSM2.</p>
         * </li>
         * </ul>
         * <p>The encryption algorithm of the root CA certificate must be the same as the <strong>Certificate Algorithm</strong> of the private root CA that you purchased. For example, if you set <strong>Certificate Algorithm</strong> to <strong>RSA</strong> when you purchase a private root CA, the key algorithm of the root CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
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
         * <p>A client token to ensure the idempotence of the request.</p>
         * <p>Generate a unique value for this parameter from your client. The token supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3838B684-3075-582B-9A45-8C99104029DF</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The common name or abbreviation of the organization. Supports Chinese characters and letters.</p>
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
         * <p>The two-letter uppercase code of the country or region where the organization is located. For example, <strong>CN</strong> indicates China and <strong>US</strong> indicates the United States.</p>
         * <p>For more information about country codes, see the <strong>Country codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
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
         * <p>The name of the city where the organization is located. Supports Chinese characters and letters.</p>
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
         * <p>The name of the organization for the root CA certificate. This is typically your company or enterprise name. Supports Chinese characters and letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The name of the department or branch in the organization. Supports Chinese characters and letters.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek****wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>&lt;props=&quot;intl&quot;&gt;The name of the province or state where the organization is located. Supports Chinese characters and letters.</p>
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
         * <p>A list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The validity period of the root CA certificate. Unit: years.</p>
         * <blockquote>
         * <p>Set the validity period to 5 to 10 years.</p>
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

    /**
     * 
     * {@link CreateRootCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateRootCACertificateRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>runtime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}

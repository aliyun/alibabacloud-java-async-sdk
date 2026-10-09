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
    @com.aliyun.core.annotation.NameInMap("CertMaxTime")
    private Integer certMaxTime;

    @com.aliyun.core.annotation.Body
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
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathLenConstraint")
    private Integer pathLenConstraint;

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

    private CreateSubCACertificateRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certMaxTime = builder.certMaxTime;
        this.clientToken = builder.clientToken;
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
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.tags = builder.tags;
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
     * @return certMaxTime
     */
    public Integer getCertMaxTime() {
        return this.certMaxTime;
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

    public static final class Builder extends Request.Builder<CreateSubCACertificateRequest, Builder> {
        private String algorithm; 
        private Integer certMaxTime; 
        private String clientToken; 
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
        private String resourceGroupId; 
        private String state; 
        private java.util.List<Tags> tags; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubCACertificateRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certMaxTime = request.certMaxTime;
            this.clientToken = request.clientToken;
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
            this.resourceGroupId = request.resourceGroupId;
            this.state = request.state;
            this.tags = request.tags;
            this.years = request.years;
        } 

        /**
         * <p>The key algorithm type of the subordinate CA certificate. The key algorithm is represented in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The corresponding signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The corresponding signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The corresponding signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The corresponding signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The corresponding signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the subordinate CA certificate must be the same as that of the root CA certificate, but the key length can be different. Example: If the key algorithm of the root CA certificate is <strong>RSA_2048</strong>, the key algorithm of the subordinate CA certificate must be <strong>RSA_1024</strong>, <strong>RSA_2048</strong>, or <strong>RSA_4096</strong>.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the key algorithm of the root CA certificate.</p>
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
         * <p>The maximum validity period of certificates issued by the CA, specified by the certMaxTime of the CA. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder certMaxTime(Integer certMaxTime) {
            this.putQueryParameter("CertMaxTime", certMaxTime);
            this.certMaxTime = certMaxTime;
            return this;
        }

        /**
         * <p>A client token that is used to ensure the idempotence of the request. The value is generated by the client and must be unique across different requests. The parameter value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The common name or abbreviation of the organization. Chinese and English characters are supported.</p>
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
         * <p>The code of the country or region where the organization is located, represented by a two-letter or three-letter uppercase abbreviation. For example, <strong>CN</strong> represents China, and <strong>US</strong> represents the United States.</p>
         * <p>For the codes of different countries, see the <strong>International codes</strong> section in <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>.</p>
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
         * <p>The validity period of the CRL. Valid values: 1 to 365. Unit: days.</p>
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
         * <p>Specifies whether to enable the CRL service. Valid values:</p>
         * <ul>
         * <li>false: Disabled.</li>
         * <li>true: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCrl(Boolean enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * <p>The extension key usages.</p>
         */
        public Builder extendedKeyUsages(java.util.List<String> extendedKeyUsages) {
            this.putQueryParameter("ExtendedKeyUsages", extendedKeyUsages);
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }

        /**
         * <p>The name of the city where the organization is located. Chinese and English characters are supported.</p>
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
         * <p>The name of the organization associated with the subordinate CA certificate (corresponding to your enterprise or entity). Chinese and English characters are supported.</p>
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
         * <p>The name of the department or branch under the organization. Chinese and English characters are supported.</p>
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
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
         * </blockquote>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae****vty</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the organization is located. Chinese and English characters are supported.
         * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the organization is located. Chinese and English characters are supported.</p>
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
         * <p>The label list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The validity period of the subordinate CA certificate. Unit: years.</p>
         * <p>Set this value to 5 to 10 years.</p>
         * <blockquote>
         * <p>The validity period of the subordinate CA certificate cannot exceed that of the root CA certificate. You can invoke <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the validity period of the root CA certificate.</p>
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

    /**
     * 
     * {@link CreateSubCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateSubCACertificateRequest</p>
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
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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

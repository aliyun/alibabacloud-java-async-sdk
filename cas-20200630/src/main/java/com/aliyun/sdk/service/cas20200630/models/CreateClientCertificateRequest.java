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
 * {@link CreateClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateClientCertificateRequest</p>
 */
public class CreateClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterTime")
    private Long afterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsynchronousFlag")
    private Boolean asynchronousFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTime")
    private Long beforeTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
    private String customIdentifier;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Integer years;

    private CreateClientCertificateRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.aliasName = builder.aliasName;
        this.asynchronousFlag = builder.asynchronousFlag;
        this.beforeTime = builder.beforeTime;
        this.clientToken = builder.clientToken;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.customIdentifier = builder.customIdentifier;
        this.days = builder.days;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.locality = builder.locality;
        this.months = builder.months;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.resourceGroupId = builder.resourceGroupId;
        this.sanType = builder.sanType;
        this.sanValue = builder.sanValue;
        this.state = builder.state;
        this.tags = builder.tags;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientCertificateRequest create() {
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
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return asynchronousFlag
     */
    public Boolean getAsynchronousFlag() {
        return this.asynchronousFlag;
    }

    /**
     * @return beforeTime
     */
    public Long getBeforeTime() {
        return this.beforeTime;
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
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return customIdentifier
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<CreateClientCertificateRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private String aliasName; 
        private Boolean asynchronousFlag; 
        private Long beforeTime; 
        private String clientToken; 
        private String commonName; 
        private String country; 
        private String customIdentifier; 
        private Integer days; 
        private Long enableCrl; 
        private Integer immediately; 
        private String locality; 
        private Integer months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private String resourceGroupId; 
        private Integer sanType; 
        private String sanValue; 
        private String state; 
        private java.util.List<Tags> tags; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientCertificateRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.aliasName = request.aliasName;
            this.asynchronousFlag = request.asynchronousFlag;
            this.beforeTime = request.beforeTime;
            this.clientToken = request.clientToken;
            this.commonName = request.commonName;
            this.country = request.country;
            this.customIdentifier = request.customIdentifier;
            this.days = request.days;
            this.enableCrl = request.enableCrl;
            this.immediately = request.immediately;
            this.locality = request.locality;
            this.months = request.months;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.resourceGroupId = request.resourceGroupId;
            this.sanType = request.sanType;
            this.sanValue = request.sanValue;
            this.state = request.state;
            this.tags = request.tags;
            this.years = request.years;
        } 

        /**
         * <p>The expiration time of the client certificate in timestamp format. Unit: seconds.</p>
         * <blockquote>
         * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1665819958</p>
         */
        public Builder afterTime(Long afterTime) {
            this.putQueryParameter("AfterTime", afterTime);
            this.afterTime = afterTime;
            return this;
        }

        /**
         * <p>The key algorithm of the client certificate. The key algorithm is in the format of <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code>. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the client certificate must be the same as that of the sub-CA certificate, but the key length can be different. For example, if the key algorithm of the sub-CA certificate is RSA_2048, the key algorithm of the client certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the key algorithm of the sub-CA certificate.</p>
         * </blockquote>
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
         * <p>The name of the issued certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-name</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The asynchronous processing flag. If the value is set to &quot;true&quot;, the backend service issues the certificate asynchronously.
         * After the request is submitted, you can call the ListClientCertificate operation to obtain the latest certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder asynchronousFlag(Boolean asynchronousFlag) {
            this.putQueryParameter("AsynchronousFlag", asynchronousFlag);
            this.asynchronousFlag = asynchronousFlag;
            return this;
        }

        /**
         * <p>The issuance time of the client certificate in timestamp format. Default value: the time when you call this operation. Unit: seconds.</p>
         * <blockquote>
         * <p>The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1634283958</p>
         */
        public Builder beforeTime(Long beforeTime) {
            this.putQueryParameter("BeforeTime", beforeTime);
            this.beforeTime = beforeTime;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The value is generated by the client and must be unique across different requests. The value can contain up to 64 ASCII characters and cannot contain non-ASCII characters.</p>
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
         * <p>The name of the certificate subject. The subject of a client authentication (ClientAuth) certificate is typically a person, company, organization, or application. Specify the common name of the subject. For example, John Doe, Alibaba, Alibaba Cloud Crypto Platform, or Tmall Genie.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The country. Default value: CN.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>The custom identifier, which serves as a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("CustomIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        /**
         * <p>The validity period of the client certificate. Unit: days.
         * The <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters cannot all be empty, and the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified. The following rules apply:</p>
         * <ul>
         * <li>If you set the <strong>Days</strong> parameter, you can optionally set both <strong>BeforeTime</strong> and <strong>AfterTime</strong> or leave them empty.</li>
         * <li>If you do not set the <strong>Days</strong> parameter, you must set both <strong>BeforeTime</strong> and <strong>AfterTime</strong>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> at the same time, the validity period is determined by the <strong>Days</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The validity period of the client certificate cannot exceed that of the sub-CA certificate. You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the validity period of the sub-CA certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder days(Integer days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        /**
         * <p>Specifies whether to include the Certificate Revocation List (CRL) address. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrl(Long enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * <p>Specifies whether to immediately return the digital certificate. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Does not return the certificate. This is the default value.</li>
         * <li><strong>1</strong>: Returns the certificate.</li>
         * <li><strong>2</strong>: Returns the certificate and its certificate chain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder immediately(Integer immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * <p>The name of the city where the certificate organization is located. Chinese and English characters are supported.
         * Default value: the city of the sub-CA certificate that issues this certificate.</p>
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
         * <p>The validity period of the certificate. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder months(Integer months) {
            this.putQueryParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * <p>The organization name. Default value: Alibaba Inc.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The department name. Default value: Aliyun CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>IT</p>
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * <p>The unique identifier of the sub-CA certificate that issues this certificate. The Private Certificate Authority instance (PrivateCaInstanceId) bound to the sub-CA must be in a valid and unexpired state.</p>
         * <blockquote>
         * <p>You can call [DescribeCACertificateList] to query the unique identifier of the sub-CA certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>273ae6bb538d538c70c01f81jh2****</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
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
         * <p>The Subject Alternative Name (SAN) type supported by the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: email address.</li>
         * <li><strong>6</strong>: Uniform Resource Identifier (URI).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sanType(Integer sanType) {
            this.putQueryParameter("SanType", sanType);
            this.sanType = sanType;
            return this;
        }

        /**
         * <p>The specific SAN extension information of the client certificate. You can enter multiple SAN values separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:somebody@example.com">somebody@example.com</a></p>
         */
        public Builder sanValue(String sanValue) {
            this.putQueryParameter("SanValue", sanValue);
            this.sanValue = sanValue;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the certificate organization is located. Chinese and English characters are supported. Default value: the province, municipality, or autonomous region of the sub-CA certificate that issues this certificate.
         * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the certificate organization is located. Chinese and English characters are supported. Default value: the province or state of the sub-CA certificate that issues this certificate.</p>
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
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The validity period of the certificate. Unit: years.</p>
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
        public CreateClientCertificateRequest build() {
            return new CreateClientCertificateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClientCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateClientCertificateRequest</p>
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
             * <p>account</p>
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

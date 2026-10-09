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
    @com.aliyun.core.annotation.NameInMap("AsynchronousFlag")
    private Boolean asynchronousFlag;

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

    private CreateClientCertificateWithCsrRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.asynchronousFlag = builder.asynchronousFlag;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.csr = builder.csr;
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

    public static final class Builder extends Request.Builder<CreateClientCertificateWithCsrRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Boolean asynchronousFlag; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private String csr; 
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

        private Builder(CreateClientCertificateWithCsrRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.asynchronousFlag = request.asynchronousFlag;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.csr = request.csr;
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
         * <p>The expiration time of the client certificate in UNIX timestamp format. Unit: seconds.</p>
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
         * <p>The key algorithm of the client certificate. The key algorithm is in the <code>&lt;encryption algorithm&gt;_&lt;key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the client certificate must be the same as that of the sub-CA certificate, but the key length can be different. For example, if the key algorithm of the sub-CA certificate is RSA_2048, the key algorithm of the client certificate must be one of RSA_1024, RSA_2048, or RSA_4096.</p>
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
         * <p>The asynchronous processing flag. If the value is &quot;true&quot;, the backend service issues the certificate asynchronously.
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
         * <p>The issuance time of the client certificate in UNIX timestamp format. The default value is the time when you call this operation. Unit: seconds.</p>
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
         * <p>The common name of the certificate. Chinese characters, English characters, and other characters are supported.</p>
         * <blockquote>
         * <p>If you set the <strong>CsrPemString</strong> parameter, the value of the <strong>CommonName</strong> parameter is determined by the corresponding information in the <strong>CsrPemString</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The country code. Example: <strong>CN</strong> or <strong>US</strong>.</p>
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
         * <p>The CSR content. You can use OpenSSL or Keytool to generate a CSR. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file</a>.
         * &lt;props=&quot;china&quot;&gt;You can also create a CSR in the SSL Certificates Service console. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * <p>The custom identifier, which serves as a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>e6bb538d538c70c01f81fg3</strong></em>*</p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("CustomIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        /**
         * <p>The validity period of the client certificate. Unit: days.
         * The <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters cannot all be empty. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must both be empty or both be specified. The following rules apply:</p>
         * <ul>
         * <li>If you set the <strong>Days</strong> parameter, you can choose to set or not set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
         * <li>If you do not set the <strong>Days</strong> parameter, you must set the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters at the same time, the validity period of the client certificate is determined by the value of the <strong>Days</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The validity period of the client certificate cannot exceed the validity period of the sub-CA certificate. You can call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to view the validity period of the sub-CA certificate.</li>
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
         * <li>0: no.</li>
         * <li>1: yes.</li>
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
         * <li><strong>0</strong>: does not return the certificate. This is the default value.</li>
         * <li><strong>1</strong>: returns the certificate.</li>
         * <li><strong>2</strong>: returns the certificate and its certificate chain.</li>
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
         * <p>The name of the city where the certificate organization is located. Chinese characters, English characters, and other characters are supported.
         * The default value is the name of the city where the sub-CA certificate organization that issues this certificate is located.</p>
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
         * <p>The certificate validity period. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
         * <p>Alibaba Inc</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The organizational unit name. Default value: Aliyun CDN.</p>
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
         * <p>The unique identifier of the sub-CA certificate that issues this certificate.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifier of the sub-CA certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>270ae6bb538d538c70c01f81fg3****</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the certificate belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******4wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the Subject Alternative Name (SAN) extension of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: otherName (0): other name.</li>
         * <li><strong>1</strong>: rfc822Name (1): RFC 822 name, which is typically an email address.</li>
         * <li><strong>2</strong>: dNSName (2): DNS name (domain name).</li>
         * <li><strong>3</strong>: x400Address (3): X.400 address, an early email standard address.</li>
         * <li><strong>4</strong>: directoryName (4): directory name, which is typically an X.500 distinguished name (DN).</li>
         * <li><strong>5</strong>: ediPartyName (5): Electronic Data Interchange (EDI) party name.</li>
         * <li><strong>6</strong>: uniformResourceIdentifier (6): Uniform Resource Identifier (URI).</li>
         * <li><strong>7</strong>: iPAddress (7): IP address.</li>
         * <li><strong>8</strong>: registeredID (8): registered ID (Object Identifier, OID).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sanType(Integer sanType) {
            this.putQueryParameter("SanType", sanType);
            this.sanType = sanType;
            return this;
        }

        /**
         * <p>The specific SAN extension information of the client certificate. You can enter multiple values separated by commas (,).</p>
         * <ol>
         * <li>otherName (0): other name</li>
         * </ol>
         * <ul>
         * <li>Example: 1.3.6.1.4.1.311.20.2.3 (OID) + <a href="mailto:user@domain.com">user@domain.com</a> (UPN, User Principal Name)</li>
         * <li>Description: A custom extension type that typically consists of a specific OID (Object Identifier) and a corresponding value. In Windows environments, it is commonly used to store UPN (User Principal Name), such as <a href="mailto:zhangsan@company.com">zhangsan@company.com</a> for smart card logon.</li>
         * </ul>
         * <ol start="2">
         * <li>rfc822Name (1): RFC 822 name (email address)</li>
         * </ol>
         * <ul>
         * <li>Example: <a href="mailto:admin@example.com">admin@example.com</a>,<a href="mailto:support@company.cn">support@company.cn</a></li>
         * <li>Description: An Internet email address that complies with the RFC 822 standard. It is commonly used in S/MIME email signing and encryption certificates to identify the sender or recipient of an email.</li>
         * <li>dNSName (2): DNS name (domain name)</li>
         * <li>Example: <a href="http://www.example.com,api.test.cn,*.mydomain.com">www.example.com,api.test.cn,*.mydomain.com</a> (wildcard domain name)</li>
         * <li>Description: The most commonly used type in HTTPS website SSL/TLS certificates. A certificate can contain multiple DNS names through the SAN extension, allowing a single certificate to protect multiple subdomains or completely different domain names.</li>
         * </ul>
         * <ol start="3">
         * <li>x400Address (3): X.400 address</li>
         * </ol>
         * <ul>
         * <li>Example: G=Zhang; S=San; O=Company; PRMD=IT; ADMD=Telecom; C=CN</li>
         * <li>Description: An early email system address standard with a complex structure that includes attributes such as country (C), administration domain (ADMD), organization (O), surname (S), and given name (G). It is rarely used in modern Internet HTTPS certificates and is mostly found in traditional European government, enterprise, or military communication systems.</li>
         * </ul>
         * <ol start="4">
         * <li>directoryName (4): directory name</li>
         * </ol>
         * <ul>
         * <li>Example: CN=IT Department, OU=Tech, O=Company Ltd, L=Beijing, ST=Beijing, C=CN</li>
         * <li>Description: A standard X.500 distinguished name (DN). It is typically used to explicitly identify the full hierarchical information of an organization, department, or entity in a certificate. It is commonly found in enterprise internal root certificates or specific government digital certificates.</li>
         * </ul>
         * <ol start="5">
         * <li>ediPartyName (5): EDI party name</li>
         * </ol>
         * <ul>
         * <li>Example: nameAssigner=GlobalTradeOrg, partyName=SupplierA</li>
         * <li>Description: Used specifically in the Electronic Data Interchange (EDI) domain. It identifies a specific party in business message exchanges (such as order and invoice transmissions) and typically includes the name-assigning authority (nameAssigner) and the party name (partyName).</li>
         * </ul>
         * <ol start="6">
         * <li>uniformResourceIdentifier (6): Uniform Resource Identifier (URI)</li>
         * </ol>
         * <ul>
         * <li>Example: <a href="http://www.example.com/verify,https://api.test.cn/status">http://www.example.com/verify,https://api.test.cn/status</a></li>
         * <li>Description: A standard URL format that must include a protocol prefix (such as http:// or https://). It can point to a specific network resource address.</li>
         * </ul>
         * <ol start="7">
         * <li>iPAddress (7): IP address</li>
         * </ol>
         * <ul>
         * <li>Example: 192.168.1.100 (IPv4), 2001:0db8:85a3::8a2e:0370:7334 (IPv6)</li>
         * <li>Description: Directly binds to a server IP address. It is commonly used for internal systems without domain names, API servers, or specific services that can only be accessed through a public IP address. Note: Public IP certificates typically require strict Organization Validation (OV).</li>
         * </ul>
         * <ol start="8">
         * <li>registeredID (8): registered ID (Object Identifier, OID)</li>
         * </ol>
         * <ul>
         * <li>Example: 1.2.3.4.55.6.5.99, 2.5.29.17</li>
         * <li>Description: A unique numeric identifier assigned by international standards organizations. It is rarely used directly as a subject name in certificates and is more commonly used as a unique identity code or policy identifier within systems.</li>
         * </ul>
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
         * <p>&lt;props=&quot;china&quot;&gt;The name of the province, municipality, or autonomous region where the certificate organization is located. Chinese characters, English characters, and other characters are supported. The default value is the name of the province, municipality, or autonomous region where the sub-CA certificate organization that issues this certificate is located.
         * &lt;props=&quot;intl&quot;&gt;The name of the province or state where the certificate organization is located. Chinese characters, English characters, and other characters are supported. The default value is the name of the province or state where the sub-CA certificate organization that issues this certificate is located.</p>
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
         * <p>The certificate validity period. Unit: years.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    /**
     * 
     * {@link CreateClientCertificateWithCsrRequest} extends {@link TeaModel}
     *
     * <p>CreateClientCertificateWithCsrRequest</p>
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
             * <p>database</p>
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

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
         * <p>The expiration time of the client certificate. This value is a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p> The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be both empty or both specified.</p>
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
         * <p>The key algorithm of the client certificate. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the client certificate must be the same with the encryption algorithm of the intermediate CA certificate. The key length can be different. For example, if the key algorithm of the intermediate CA certificate is RSA_2048, the key algorithm of the client certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the key algorithm of an intermediate CA certificate.</p>
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
         * <p>The issuance time of the client certificate. This value is a UNIX timestamp. The default value is the time when you call this operation. Unit: seconds.</p>
         * <blockquote>
         * <p> The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be both empty or both specified.</p>
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
         * <p>The common name of the certificate. The value can contain letters.</p>
         * <blockquote>
         * <p> If you specify the <strong>CsrPemString</strong> parameter, the value of the <strong>CommonName</strong> parameter is determined by the <strong>CsrPemString</strong> parameter.</p>
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
         * <p>The code of the country in which the organization is located, such as <strong>CN</strong> and <strong>US</strong>.</p>
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
         * <p>The content of the CSR file. You can generate a CSR file by using the OpenSSL tool or Keytool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a> You can also create a CSR file in the Certificate Management Service console. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.</p>
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
         * <p>The validity period of the client certificate. Unit: days. You must specify at least one of the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be both empty or both specified. The following list describes how to specify these parameters:</p>
         * <ul>
         * <li>If you specify the <strong>Days</strong> parameter, you can specify both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters or leave them both empty.********</li>
         * <li>If you do not specify the <strong>Days</strong> parameter, you must specify both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters together, the validity period of the client certificate is determined by the value of the <strong>Days</strong> parameter.</p>
         * </li>
         * <li><p>The validity period of the client certificate cannot exceed the validity period of the intermediate CA certificate. You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the validity period of an intermediate CA certificate.</p>
         * </li>
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
         * <p>include the CRL address.</p>
         * <ul>
         * <li>0- No</li>
         * <li>1- Yes</li>
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
         * <p>Specifies whether to return the certificate. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not return the certificate. This is the default value.</li>
         * <li><strong>1</strong>: returns the certificate.</li>
         * <li><strong>2</strong>: returns the certificate and the certificate chain of the certificate.</li>
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
         * <p>The name of the city in which the organization is located. The value can contain letters. The default value is the name of the city in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.</p>
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
         * <p>The validity period of the client certificate. Unit: months.</p>
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
         * <p>The name of the organization. Default value: Alibaba Inc.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Computing Co., Ltd.</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The name of the department. Default value: Aliyun CDN.</p>
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
         * <p>The unique identifier of the intermediate CA certificate from which the client certificate is issued.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifier of an intermediate CA certificate.</p>
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
         * <p>The type of the Subject Alternative Name (SAN) extension that is supported by the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: an email address</li>
         * <li><strong>6</strong>: a Uniform Resource Identifier (URI)</li>
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
         * <p>The content of the extension. You can specify multiple SAN extensions. If you want to specify multiple SAN extensions, separate them with commas (,).</p>
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
         * <p>The province, municipality, or autonomous region in which the organization is located. The value can contain letters. The default value is the name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued.</p>
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
         * <p>The validity period of the client certificate. Unit: years.</p>
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

}

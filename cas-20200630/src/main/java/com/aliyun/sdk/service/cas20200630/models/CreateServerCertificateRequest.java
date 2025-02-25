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
 * {@link CreateServerCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateServerCertificateRequest</p>
 */
public class CreateServerCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterTime")
    private Long afterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTime")
    private Long beforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Integer years;

    private CreateServerCertificateRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.days = builder.days;
        this.domain = builder.domain;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.locality = builder.locality;
        this.months = builder.months;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerCertificateRequest create() {
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
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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

    public static final class Builder extends Request.Builder<CreateServerCertificateRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private Integer days; 
        private String domain; 
        private Long enableCrl; 
        private Integer immediately; 
        private String locality; 
        private Integer months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private String state; 
        private Integer years; 

        private Builder() {
            super();
        } 

        private Builder(CreateServerCertificateRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.days = request.days;
            this.domain = request.domain;
            this.enableCrl = request.enableCrl;
            this.immediately = request.immediately;
            this.locality = request.locality;
            this.months = request.months;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * <p>The expiration time of the server certificate. This value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The key algorithm of the server certificate. The key algorithm is in the <code>&lt;Encryption algorithm&gt;_&lt;Key length&gt;</code> format. Valid values:</p>
         * <ul>
         * <li><strong>RSA_1024</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_2048</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>RSA_4096</strong>: The signature algorithm is Sha256WithRSA.</li>
         * <li><strong>ECC_256</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_384</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>ECC_512</strong>: The signature algorithm is Sha256WithECDSA.</li>
         * <li><strong>SM2_256</strong>: The signature algorithm is SM3WithSM2.</li>
         * </ul>
         * <p>The encryption algorithm of the server certificate must be the same as the encryption algorithm of the intermediate CA certificate. The key length can be different. For example, if the key algorithm of the intermediate CA certificate is RSA_2048, the key algorithm of the server certificate must be RSA_1024, RSA_2048, or RSA_4096.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the key algorithm of an intermediate CA certificate.</p>
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
         * <p>The issuance time of the server certificate. This value is a UNIX timestamp. The default value is the time when you call this operation. Unit: seconds.</p>
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
         * <p>The name of the certificate user. The user of a server certificate is a server. We recommend that you enter the domain name or IP address of the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The code of the country in which the organization is located, such as CN or US.</p>
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
         * <p>The validity period of the server certificate. Unit: days. You must specify at least one of the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters. The <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters must be both empty or both specified. The following list describes how to specify these parameters:</p>
         * <ul>
         * <li>If you specify the <strong>Days</strong> parameter, you can specify both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters or leave them both empty.</li>
         * <li>If you do not specify the <strong>Days</strong> parameter, you must specify both the <strong>BeforeTime</strong> and <strong>AfterTime</strong> parameters.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify the <strong>Days</strong>, <strong>BeforeTime</strong>, and <strong>AfterTime</strong> parameters together, the validity period of the server certificate is determined by the value of the <strong>Days</strong> parameter.</p>
         * </li>
         * <li><p>The validity period of the server certificate cannot exceed the validity period of the intermediate CA certificate. You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the validity period of an intermediate CA certificate.</p>
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
         * <p>The additional domain names and additional IP addresses of the server certificate. After you add additional domain names and additional IP addresses to a certificate, you can apply the certificate to the domain names and IP addresses.</p>
         * <p>Separate multiple domain names and multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * <p>The validity period of the server certificate. Unit: months.</p>
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
         * <p>Alibaba Cloud</p>
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
         * <p>IT</p>
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * <p>The unique identifier of the intermediate CA certificate from which the server certificate is issued.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifier of an intermediate CA certificate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>271ae6bb538d538c70c01f81dg3****</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
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
         * <p>The validity period of the server certificate. Unit: years.</p>
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
        public CreateServerCertificateRequest build() {
            return new CreateServerCertificateRequest(this);
        } 

    } 

}

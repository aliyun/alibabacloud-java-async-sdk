// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link CreateWHClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateWHClientCertificateRequest</p>
 */
public class CreateWHClientCertificateRequest extends Request {
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
    private Long days;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Immediately")
    private Long immediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locality")
    private String locality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Months")
    private Long months;

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
    @com.aliyun.core.annotation.NameInMap("SanType")
    private Long sanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanValue")
    private String sanValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Long years;

    private CreateWHClientCertificateRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.csr = builder.csr;
        this.days = builder.days;
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

    public static CreateWHClientCertificateRequest create() {
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
    public Long getDays() {
        return this.days;
    }

    /**
     * @return immediately
     */
    public Long getImmediately() {
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
    public Long getMonths() {
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
    public Long getSanType() {
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
    public Long getYears() {
        return this.years;
    }

    public static final class Builder extends Request.Builder<CreateWHClientCertificateRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private String csr; 
        private Long days; 
        private Long immediately; 
        private String locality; 
        private Long months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private Long sanType; 
        private String sanValue; 
        private String state; 
        private Long years; 

        private Builder() {
            super();
        } 

        private Builder(CreateWHClientCertificateRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.csr = request.csr;
            this.days = request.days;
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
         * <p>The expiration time of the client certificate, specified as a Unix timestamp in seconds.</p>
         * <blockquote>
         * <p>The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
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
         * <p>The key algorithm for the client certificate. The format is <code>&lt;encryption_algorithm&gt;_&lt;key_length&gt;</code>. Valid values:</p>
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
         * <p>The encryption algorithm of the client certificate must match that of the issuing subordinate CA certificate, but the key lengths can differ. For example, if the key algorithm of the subordinate CA certificate is RSA_2048, the key algorithm for the client certificate must be one of RSA_1024, RSA_2048, or RSA_4096.</p>
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
         * <p>The issuance time of the client certificate, as a Unix timestamp in seconds. If omitted, this defaults to the time of the API call.</p>
         * <blockquote>
         * <p>The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
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
         * <p>The common name of the client certificate. Supports Chinese, English, and other characters.</p>
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
         * <p>The country where the organization is located.</p>
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
         * <p>The content of the certificate signing request (CSR). You can generate a CSR with tools like OpenSSL or Keytool.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * <p>The validity period of the client certificate, in days.</p>
         * <p>You cannot leave the <code>Days</code>, <code>BeforeTime</code>, and <code>AfterTime</code> parameters all empty. The <code>BeforeTime</code> and <code>AfterTime</code> parameters must be specified together or not at all.</p>
         * <ul>
         * <li><p>If you specify the <code>Days</code> parameter, specifying <code>BeforeTime</code> and <code>AfterTime</code> is optional.</p>
         * </li>
         * <li><p>If you do not specify the <code>Days</code> parameter, you must specify both <code>BeforeTime</code> and <code>AfterTime</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify <code>Days</code>, <code>BeforeTime</code>, and <code>AfterTime</code> simultaneously, the <code>Days</code> parameter takes precedence in determining the validity period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder days(Long days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        /**
         * <p>Specifies which certificate content to return in the response.</p>
         * <ul>
         * <li><p><strong>0</strong>: Does not return the certificate (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Returns the certificate.</p>
         * </li>
         * <li><p><strong>2</strong>: Returns the certificate and its certificate chain.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder immediately(Long immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * <p>The city where the organization is located. Chinese, English, and other characters are supported.</p>
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
         * <p>The validity period of the certificate, in months.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder months(Long months) {
            this.putQueryParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * <p>The organization name associated with the root CA certificate, typically your company or enterprise name. Supports Chinese, English, and other characters.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里巴巴网络技术有限公司</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The name of the department or business unit within the organization.</p>
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
         * <p>The unique identifier of the issuing subordinate CA certificate.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the subject alternative name (SAN) for the client certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: email address.</p>
         * </li>
         * <li><p><strong>2</strong>: domain name.</p>
         * </li>
         * <li><p><strong>6</strong>: Uniform Resource Identifier (URI).</p>
         * </li>
         * <li><p><strong>7</strong>: IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sanType(Long sanType) {
            this.putQueryParameter("SanType", sanType);
            this.sanType = sanType;
            return this;
        }

        /**
         * <p>The value of the SAN extension. To specify multiple values, separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder sanValue(String sanValue) {
            this.putQueryParameter("SanValue", sanValue);
            this.sanValue = sanValue;
            return this;
        }

        /**
         * <p>The province, municipality, or autonomous region where the organization is located. Chinese, English, and other characters are supported.</p>
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
         * <p>The validity period of the certificate, in years.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder years(Long years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateWHClientCertificateRequest build() {
            return new CreateWHClientCertificateRequest(this);
        } 

    } 

}

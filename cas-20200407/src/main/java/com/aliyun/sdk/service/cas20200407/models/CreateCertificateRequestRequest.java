// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCertificateRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateRequestRequest</p>
 */
public class CreateCertificateRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validateType;

    private CreateCertificateRequestRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.email = builder.email;
        this.phone = builder.phone;
        this.productCode = builder.productCode;
        this.username = builder.username;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return validateType
     */
    public String getValidateType() {
        return this.validateType;
    }

    public static final class Builder extends Request.Builder<CreateCertificateRequestRequest, Builder> {
        private String domain; 
        private String email; 
        private String phone; 
        private String productCode; 
        private String username; 
        private String validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateRequestRequest request) {
            super(request);
            this.domain = request.domain;
            this.email = request.email;
            this.phone = request.phone;
            this.productCode = request.productCode;
            this.username = request.username;
            this.validateType = request.validateType;
        } 

        /**
         * <p>The domain name that you want to bind to the certificate. You can specify only one domain name.</p>
         * <blockquote>
         * <p> The domain name must match the certificate specifications that you specify for the <strong>ProductCode</strong> parameter. If you apply for a single-domain certificate, you must specify a single domain name for this parameter. If you apply for a wildcard certificate, you must specify a wildcard domain name such as <code>*.aliyundoc.com</code> for this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The contact email address of the applicant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The phone number of the applicant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>The specifications of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain DV certificate, which is free and valid for 3 months.</li>
         * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate, which is free and valid for 1 year. This value is available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
         * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
         * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
         * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
         * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>symantec-free-1-free</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The name of the applicant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The method to verify the ownership of a domain name. Valid values:</p>
         * <ul>
         * <li><strong>DNS</strong>: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</li>
         * <li><strong>FILE</strong>: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</li>
         * </ul>
         * <p>For more information about the verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">Verify the ownership of a domain name</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder validateType(String validateType) {
            this.putQueryParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        @Override
        public CreateCertificateRequestRequest build() {
            return new CreateCertificateRequestRequest(this);
        } 

    } 

}

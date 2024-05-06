// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The domain name that you want to bind to the certificate. You can specify only one domain name.
         * <p>
         * 
         * > The domain name must match the certificate specifications that you specify for the **ProductCode** parameter. If you apply for a single-domain certificate, you must specify a single domain name for this parameter. If you apply for a wildcard certificate, you must specify a wildcard domain name such as `*.aliyundoc.com` for this parameter.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The email address of the applicant.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The phone number of the applicant.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * The specifications of the certificate. Valid values:
         * <p>
         * 
         * *   **digicert-free-1-free**: DigiCert single-domain DV certificate in 3 months free trial. This is the default value.
         * *   **symantec-free-1-free**: DigiCert single-domain DV certificate in 1 year free trial.
         * *   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.
         * *   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.
         * *   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.
         * *   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.
         * *   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The name of the applicant.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The verification method of the domain name ownership. Valid values:
         * <p>
         * 
         * *   **DNS**: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.
         * *   **FILE**: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.
         * 
         * For more information about the verification methods, see [Verify the ownership of a domain name](~~48016~~).
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

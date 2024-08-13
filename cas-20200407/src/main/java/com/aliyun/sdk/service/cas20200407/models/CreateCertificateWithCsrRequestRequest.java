// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateWithCsrRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateWithCsrRequestRequest</p>
 */
public class CreateCertificateWithCsrRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String csr;

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

    private CreateCertificateWithCsrRequestRequest(Builder builder) {
        super(builder);
        this.csr = builder.csr;
        this.email = builder.email;
        this.phone = builder.phone;
        this.productCode = builder.productCode;
        this.username = builder.username;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateWithCsrRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
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

    public static final class Builder extends Request.Builder<CreateCertificateWithCsrRequestRequest, Builder> {
        private String csr; 
        private String email; 
        private String phone; 
        private String productCode; 
        private String username; 
        private String validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateWithCsrRequestRequest request) {
            super(request);
            this.csr = request.csr;
            this.email = request.email;
            this.phone = request.phone;
            this.productCode = request.productCode;
            this.username = request.username;
            this.validateType = request.validateType;
        } 

        /**
         * The content of the CSR file.\
         * <p>
         * The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see [How do I create a CSR file?](~~42218~~)\
         * A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.
         * 
         * >  The **CN** field in the CSR file specifies the domain name that is bound to the certificate.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * The contact email address of the applicant.
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
         * The specifications of the certificate that you want to apply for. Valid values:
         * <p>
         * 
         * *   **digicert-free-1-free** (default): DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).
         * *   **symantec-free-1-free**: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).
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
         * The method to verify the ownership of a domain name. Valid values:
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
        public CreateCertificateWithCsrRequestRequest build() {
            return new CreateCertificateWithCsrRequestRequest(this);
        } 

    } 

}

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
 * {@link CreateCertificateForPackageRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateForPackageRequestRequest</p>
 */
public class CreateCertificateForPackageRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidateType")
    private String validateType;

    private CreateCertificateForPackageRequestRequest(Builder builder) {
        super(builder);
        this.companyName = builder.companyName;
        this.csr = builder.csr;
        this.domain = builder.domain;
        this.email = builder.email;
        this.phone = builder.phone;
        this.productCode = builder.productCode;
        this.tags = builder.tags;
        this.username = builder.username;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateForPackageRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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

    public static final class Builder extends Request.Builder<CreateCertificateForPackageRequestRequest, Builder> {
        private String companyName; 
        private String csr; 
        private String domain; 
        private String email; 
        private String phone; 
        private String productCode; 
        private java.util.List<Tags> tags; 
        private String username; 
        private String validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateForPackageRequestRequest request) {
            super(request);
            this.companyName = request.companyName;
            this.csr = request.csr;
            this.domain = request.domain;
            this.email = request.email;
            this.phone = request.phone;
            this.productCode = request.productCode;
            this.tags = request.tags;
            this.username = request.username;
            this.validateType = request.validateType;
        } 

        /**
         * <p>The company name of the certificate application.</p>
         * <blockquote>
         * <p> This parameter is available only when you apply for OV certificates. For more information, see <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a>. If you want to apply for a DV certificate, you do not need to add a company profile.</p>
         * </blockquote>
         * <p>If you specify a company name, the information about the company that is configured in the <strong>Information Management</strong> module is used. If you do not specify this parameter, the information about the most recent company that is added to the <strong>Information Management</strong> module is used.</p>
         * 
         * <strong>example:</strong>
         * <p>A company</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>The content of the certificate signing request (CSR) file that is manually generated by using OpenSSL or Keytool for the domain name. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR file</a>. If you do not specify this parameter, Certificate Management Service automatically creates a CSR file.</p>
         * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
         * <blockquote>
         * <p> The **CN** field in CSR file specifies the domain name that is bound to the certificate. You must include the field in the parameter value.</p>
         * </blockquote>
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
         * <p>The domain name that you want to bind to the certificate. The domain name must meet the following requirements:</p>
         * <ul>
         * <li>The domain name must be a single domain name or a wildcard domain name. Example: <code>*.aliyundoc.com</code>.</li>
         * <li>You can specify multiple domain names. Separate multiple domain names with commas (,). You can specify a maximum of five domain names.</li>
         * <li>If you specify multiple domain names, the domain names must be only single domain names or only wildcard domain names. You cannot specify both single domain names and wildcard domain names.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to bind multiple domain names to the certificate, you must specify this parameter. You must specify at least one of the Domain parameter and the **Csr** parameter. If you specify both the Domain parameter and the **Csr** parameter, the value of the **CN** field in the **Csr** parameter is used as the domain name that is bound to the certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The email address of the applicant. After the CA receives your certificate application, the CA sends a verification email to the email address that you specify. You must log on to the mailbox, open the mail, and complete the verification of the domain name ownership based on the steps that are described in the email.</p>
         * <p>If you do not specify this parameter, the information about the most recent contact that is added to the <strong>Information Management</strong> module is used. For more information about how to add a contact to the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The contact phone number of the applicant. CA staff can call the phone number to confirm the information in your certificate application.</p>
         * <p>If you do not specify this parameter, the information about the most recent contact that is added to the <strong>Information Management</strong> module is used. For more information about how to add a contact to the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The specifications of the certificate that you want to apply for. Valid values:</p>
         * <ul>
         * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain domain validated (DV) certificate, which is free and valid for 3 months. This value is available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate, which is free and valid for 1 year. This value is available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
         * <li><strong>symantec-ov-1-personal</strong>: DigiCert single-domain organization validated (OV) certificate.</li>
         * <li><strong>symantec-ov-w-personal</strong>: DigiCert wildcard OV certificate.</li>
         * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
         * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
         * <li><strong>geotrust-ov-1-personal</strong>: GeoTrust single-domain OV certificate.</li>
         * <li><strong>geotrust-ov-w-personal</strong>: GeoTrust wildcard OV certificate.</li>
         * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
         * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
         * <li><strong>globalsign-ov-1-personal</strong>: GlobalSign single-domain OV certificate.</li>
         * <li><strong>globalsign-ov-w-advanced</strong>: GlobalSign wildcard OV certificate.</li>
         * <li><strong>cfca-ov-1-personal</strong>: China Financial Certification Authority (CFCA) single-domain OV certificate, available only on the China site (aliyun.com).</li>
         * <li><strong>cfca-ev-w-advanced</strong>: CFCA wildcard OV certificate, available only on the China site (aliyun.com).</li>
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
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The name of the applicant.</p>
         * <p>If you do not specify this parameter, the information about the most recent contact that is added to the <strong>Information Management</strong> module is used. For more information about how to add a contact to the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The verification method of the domain name ownership. Valid values:</p>
         * <ul>
         * <li><strong>DNS</strong>: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</li>
         * <li><strong>FILE</strong>: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</li>
         * </ul>
         * <p>For more information about the verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">Verify the ownership of a domain name</a>.</p>
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
        public CreateCertificateForPackageRequestRequest build() {
            return new CreateCertificateForPackageRequestRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCertificateForPackageRequestRequest} extends {@link TeaModel}
     *
     * <p>CreateCertificateForPackageRequestRequest</p>
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

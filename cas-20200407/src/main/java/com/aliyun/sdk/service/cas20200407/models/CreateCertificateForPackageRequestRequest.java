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
         * <p>The name of the company that applies for the certificate.</p>
         * <blockquote>
         * <p>This parameter applies only to OV certificates. When you apply for an OV certificate, you must first add the company information in the <strong>Information Management</strong> module of the <a href="https://yundun.console.aliyun.com/?p=cas#/">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>. When you apply for a DV certificate, you do not need to add company information.</p>
         * </blockquote>
         * <p>When you apply for an OV certificate, if you specify the company name here, the corresponding company information in the <strong>Information Management</strong> module is used. If you do not specify this parameter, the latest company information added in the <strong>Information Management</strong> module is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Company</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>The content of the certificate signing request (CSR) file that you manually generated for the domain name by using OpenSSL or Keytool. The key type of the CSR file must be RSA or ECC, and the key length of the RSA algorithm must be greater than or equal to 2048 bits. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>. If you do not specify this parameter, Certificate Management Service automatically creates a CSR for you.</p>
         * <p>A CSR is a certificate signing request file that contains your server and company information. When you apply for a certificate, you must submit the CSR file to the certificate authority (CA) for review. After the CA signs the CSR file by using the private key of the root certificate, a certificate public key file (the SSL certificate issued to you) is generated.</p>
         * <blockquote>
         * <p>Notice:  </p>
         * </blockquote>
         * <p>The <strong>CN</strong> field in the CSR indicates the domain name bound to the certificate. This field is required when you specify the CSR parameter.</p>
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
         * <p>The domain name to be bound to the certificate. Requirements:</p>
         * <ul>
         * <li>You can specify a single domain name or a wildcard domain name, such as <code>*.aliyundoc.com</code>.</li>
         * <li>You can specify multiple domain names. Separate multiple domain names with commas (,). You can specify up to five domain names.</li>
         * <li>If you specify multiple domain names, all the domain names must be single domain names or wildcard domain names. You cannot specify both single domain names and wildcard domain names at the same time.</li>
         * </ul>
         * <blockquote>
         * <p>Notice:  </p>
         * </blockquote>
         * <p>If you bind multiple domain names to the certificate, this parameter is required. This parameter and the <strong>Csr</strong> parameter cannot be left empty at the same time. If you specify both this parameter and the <strong>Csr</strong> parameter, the value of the <strong>CN</strong> field in the <strong>Csr</strong> parameter is used as the domain name bound to the certificate.</p>
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
         * <p>The email address of the contact for the application. After the CA receives your certificate application, the CA sends a certificate application verification email to this email address. You must log on to the email account, check the email, and complete the verification as prompted in the email.</p>
         * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The mobile phone number of the contact for the application. The CA staff may contact you at this phone number to verify your certificate application information.</p>
         * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The specifications of the certificate for which you want to apply. Valid values:</p>
         * <ul>
         * <li><p><strong>digicert-free-1-free</strong> (default): a 3-month personal test certificate (free edition). Available only on the China site.</p>
         * </li>
         * <li><p><strong>symantec-free-1-free</strong>: a 12-month personal test certificate (pro). Available only on the China site.</p>
         * </li>
         * <li><p><strong>symantec-dv-1-starter</strong>: a DigiCert DV wildcard certificate.</p>
         * </li>
         * <li><p><strong>symantec-ov-1-personal</strong>: a DigiCert OV single-domain certificate.</p>
         * </li>
         * <li><p><strong>symantec-ov-w-personal</strong>: a DigiCert OV wildcard certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-1-starter</strong>: a GeoTrust DV single-domain certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-w-starter</strong>: a GeoTrust DV wildcard certificate.</p>
         * </li>
         * <li><p><strong>geotrust-ov-1-personal</strong>: a GeoTrust OV single-domain certificate.</p>
         * </li>
         * <li><p><strong>geotrust-ov-w-personal</strong>: a GeoTrust OV wildcard certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-1-personal</strong>: a GlobalSign DV single-domain certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-w-advanced</strong>: a GlobalSign DV wildcard certificate.</p>
         * </li>
         * <li><p><strong>globalsign-ov-1-personal</strong>: a GlobalSign OV single-domain certificate.</p>
         * </li>
         * <li><p><strong>globalsign-ov-w-advanced</strong>: a GlobalSign OV wildcard certificate.</p>
         * </li>
         * <li><p><strong>cfca-ov-1-personal</strong>: a CFCA OV single-domain certificate (available only on the China site).</p>
         * </li>
         * <li><p><strong>cfca-ev-w-advanced</strong>: a CFCA OV wildcard certificate (available only on the China site).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>digicert-free-1-free</p>
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
         * <p>The name of the contact for the application.</p>
         * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
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
         * <p>The verification method for domain name ownership. Valid values:</p>
         * <ul>
         * <li><p><strong>DNS</strong>: DNS verification. You can verify the ownership of the domain name by adding a TXT record for the domain name on the DNS management platform. You must have the management permissions on DNS resolution to complete the verification.</p>
         * </li>
         * <li><p><strong>FILE</strong>: file verification. You can verify the ownership of the domain name by creating a specified file on the domain name server. You must have the administrator permissions on the domain name server to complete the verification.</p>
         * </li>
         * </ul>
         * <p>For more information about the two verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">How do I configure domain name authorization verification?</a>.</p>
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
             * <p>runtime</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can query multiple tag values.</p>
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

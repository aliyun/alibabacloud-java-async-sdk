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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
        this.tags = builder.tags;
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

    public static final class Builder extends Request.Builder<CreateCertificateWithCsrRequestRequest, Builder> {
        private String csr; 
        private String email; 
        private String phone; 
        private String productCode; 
        private java.util.List<Tags> tags; 
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
            this.tags = request.tags;
            this.username = request.username;
            this.validateType = request.validateType;
        } 

        /**
         * <p>The content of the existing CSR file.<br>The key type of the CSR file must be RSA or ECC. If the RSA algorithm is used, the key length must be greater than or equal to 2048 bits. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How to create a CSR file</a>.  &lt;props=&quot;china&quot;&gt;You can also create a CSR in the <a href="https://yundunnext.console.aliyun.com/?&p=cas">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.<br>A CSR is digital certificate signing request file that contains your server and company information. When you apply for digital certificate, you must submit the CSR file to the CA for review. After the CA signs the CSR file with the private key of the root certificate, digital certificate public key file (the SSL certificate issued to you) is generated.</p>
         * <blockquote>
         * <p>The <strong>CN</strong> field in the CSR specifies the domain name bound to the certificate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The email address of the contact for the application.</p>
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
         * <p>The mobile phone number of the contact for the application.</p>
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
         * <p>The certificate specification for which you want to apply. Valid values:</p>
         * <ul>
         * <li><p><strong>digicert-free-1-free</strong> (default): a 3-month free DV certificate for individual testing. Available only on the China site.</p>
         * </li>
         * <li><p><strong>symantec-free-1-free</strong>: a 12-month pro DV certificate for individual testing. Available only on the China site.</p>
         * </li>
         * <li><p><strong>symantec-dv-1-starter</strong>: a DigiCert DV wildcard certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-1-starter</strong>: a GeoTrust DV single-domain certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-w-starter</strong>: a GeoTrust DV wildcard certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-1-personal</strong>: a GlobalSign DV single-domain certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-w-advanced</strong>: a GlobalSign DV wildcard certificate.</p>
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
         * <p>The validation method for domain name ownership. Valid values:</p>
         * <ul>
         * <li><strong>DNS</strong>: DNS validation. You can validate the ownership of the domain name by adding a TXT DNS record for the domain name on the DNS management platform. You must have the management permissions on DNS resolution to complete the validation.</li>
         * <li><strong>FILE</strong>: file validation. You can validate the ownership of the domain name by creating a specified file on the domain name server. You must have the administrator permissions on the domain name server to complete the validation.</li>
         * </ul>
         * <p>For more information about the two validation methods, see <a href="https://help.aliyun.com/document_detail/48016.html">How do I configure domain name ownership validation?</a>.</p>
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
        public CreateCertificateWithCsrRequestRequest build() {
            return new CreateCertificateWithCsrRequestRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCertificateWithCsrRequestRequest} extends {@link TeaModel}
     *
     * <p>CreateCertificateWithCsrRequestRequest</p>
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

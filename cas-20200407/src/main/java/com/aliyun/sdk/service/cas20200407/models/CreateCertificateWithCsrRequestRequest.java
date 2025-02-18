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
         * <p>The content of the CSR file.<br>The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a><br>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
         * <blockquote>
         * <p> The <strong>CN</strong> field in the CSR file specifies the domain name that is bound to the certificate.</p>
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
         * <p>The specifications of the certificate that you want to apply for. Valid values:</p>
         * <ul>
         * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</li>
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
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
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

            /**
             * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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

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
 * {@link RenewCertificateOrderForPackageRequestRequest} extends {@link RequestModel}
 *
 * <p>RenewCertificateOrderForPackageRequestRequest</p>
 */
public class RenewCertificateOrderForPackageRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private RenewCertificateOrderForPackageRequestRequest(Builder builder) {
        super(builder);
        this.csr = builder.csr;
        this.orderId = builder.orderId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewCertificateOrderForPackageRequestRequest create() {
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
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<RenewCertificateOrderForPackageRequestRequest, Builder> {
        private String csr; 
        private Long orderId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(RenewCertificateOrderForPackageRequestRequest request) {
            super(request);
            this.csr = request.csr;
            this.orderId = request.orderId;
            this.tags = request.tags;
        } 

        /**
         * <p>The content of the certificate signing request (CSR) file that is manually generated for the domain name by using OpenSSL or Keytool. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a></p>
         * <p>If you do not specify this parameter, Certificate Management Service automatically generates a CSR file for the domain name in the certificate application order that you want to renew.</p>
         * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
         * <blockquote>
         * <p> The <strong>CN</strong> field in the CSR file specifies the domain name that is bound to the certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST----- MIIC1TCCAb0CAQAwgY8xCzAJBgNVBAYTAkNOMRIwEAYDVQQIDAlHdWFuZ3pob3Ux ETAPBgNVBAcMCFNoZW56aGVuMQ8wDQYDVQQKDAZDaGFjdW8xEDAOBgNVBAsMB0lU IERlcHQxFzAVBgNVBAMMDnd3dy5jaGFjdW8ubmV0MR0wGwYJKoZIhvcNAQkBFg44 MjkyNjY5QHFxLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALo7 atRvQf9tKo1NJ/MQqzHvIjHNhU+0MMerDq+tRlJ+a7Ro1r6IWNF5MB0Z****** -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * <p>The ID of the certificate application order that you want to renew.</p>
         * <blockquote>
         * <p> After you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/455292.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/455801.html">CreateCertificateWithCsrRequest</a> operation to submit a certificate application, you can obtain the ID of the certificate application order from the <strong>OrderId</strong> response parameter. You can also call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the order ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123451222</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public RenewCertificateOrderForPackageRequestRequest build() {
            return new RenewCertificateOrderForPackageRequestRequest(this);
        } 

    } 

    /**
     * 
     * {@link RenewCertificateOrderForPackageRequestRequest} extends {@link TeaModel}
     *
     * <p>RenewCertificateOrderForPackageRequestRequest</p>
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
             * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>account</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the resource tag. A maximum of 20 tag values can be entered. If this value needs to be passed in, an empty string can be entered.</p>
             * <p>A maximum of 128 characters are supported, it cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, and it cannot contain &quot;http://&quot; or &quot;https://&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private RenewCertificateOrderForPackageRequestRequest(Builder builder) {
        super(builder);
        this.csr = builder.csr;
        this.orderId = builder.orderId;
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

    public static final class Builder extends Request.Builder<RenewCertificateOrderForPackageRequestRequest, Builder> {
        private String csr; 
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(RenewCertificateOrderForPackageRequestRequest request) {
            super(request);
            this.csr = request.csr;
            this.orderId = request.orderId;
        } 

        /**
         * The content of the certificate signing request (CSR) file that is manually generated for the domain name by using OpenSSL or Keytool. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see [How do I create a CSR file?](~~42218~~)
         * <p>
         * 
         * If you do not specify this parameter, Certificate Management Service automatically generates a CSR file for the domain name in the certificate application order that you want to renew.
         * 
         * A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.
         * 
         * > The **CN** field in the CSR file specifies the domain name that is bound to the certificate.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * The ID of the certificate application order that you want to renew.
         * <p>
         * 
         * > After you call the [CreateCertificateForPackageRequest](~~455296~~), [CreateCertificateRequest](~~455292~~), or [CreateCertificateWithCsrRequest](~~455801~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public RenewCertificateOrderForPackageRequestRequest build() {
            return new RenewCertificateOrderForPackageRequestRequest(this);
        } 

    } 

}

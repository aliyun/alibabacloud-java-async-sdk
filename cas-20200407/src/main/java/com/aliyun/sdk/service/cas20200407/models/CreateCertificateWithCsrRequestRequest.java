// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateWithCsrRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateWithCsrRequestRequest</p>
 */
public class CreateCertificateWithCsrRequestRequest extends Request {
    @Query
    @NameInMap("Csr")
    @Validation(required = true)
    private String csr;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("Phone")
    @Validation(required = true)
    private String phone;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    @Query
    @NameInMap("ValidateType")
    @Validation(required = true)
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

        private Builder(CreateCertificateWithCsrRequestRequest response) {
            super(response);
            this.csr = response.csr;
            this.email = response.email;
            this.phone = response.phone;
            this.productCode = response.productCode;
            this.username = response.username;
            this.validateType = response.validateType;
        } 

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * ValidateType.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateForPackageRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateForPackageRequestRequest</p>
 */
public class CreateCertificateForPackageRequestRequest extends Request {
    @Query
    @NameInMap("CompanyName")
    private String companyName;

    @Query
    @NameInMap("Csr")
    private String csr;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("ValidateType")
    private String validateType;

    private CreateCertificateForPackageRequestRequest(Builder builder) {
        super(builder);
        this.companyName = builder.companyName;
        this.csr = builder.csr;
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
        private String username; 
        private String validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateForPackageRequestRequest response) {
            super(response);
            this.companyName = response.companyName;
            this.csr = response.csr;
            this.domain = response.domain;
            this.email = response.email;
            this.phone = response.phone;
            this.productCode = response.productCode;
            this.username = response.username;
            this.validateType = response.validateType;
        } 

        /**
         * CompanyName.
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
        public CreateCertificateForPackageRequestRequest build() {
            return new CreateCertificateForPackageRequestRequest(this);
        } 

    } 

}

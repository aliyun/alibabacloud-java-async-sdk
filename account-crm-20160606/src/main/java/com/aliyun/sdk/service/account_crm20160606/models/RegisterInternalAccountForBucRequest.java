// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link RegisterInternalAccountForBucRequest} extends {@link RequestModel}
 *
 * <p>RegisterInternalAccountForBucRequest</p>
 */
public class RegisterInternalAccountForBucRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEmailConfirmed")
    private Boolean isEmailConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMobileConfirmed")
    private Boolean isMobileConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMobileLogin")
    private Boolean isMobileLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NationalityCode")
    private String nationalityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlainPassword")
    private String plainPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredLanguage")
    private String preferredLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountTypeCode")
    private String accountTypeCode;

    private RegisterInternalAccountForBucRequest(Builder builder) {
        super(builder);
        this.bid = builder.bid;
        this.email = builder.email;
        this.isEmailConfirmed = builder.isEmailConfirmed;
        this.isMobileConfirmed = builder.isMobileConfirmed;
        this.isMobileLogin = builder.isMobileLogin;
        this.mobile = builder.mobile;
        this.nationalityCode = builder.nationalityCode;
        this.plainPassword = builder.plainPassword;
        this.preferredLanguage = builder.preferredLanguage;
        this.accountTypeCode = builder.accountTypeCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterInternalAccountForBucRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return isEmailConfirmed
     */
    public Boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    /**
     * @return isMobileConfirmed
     */
    public Boolean getIsMobileConfirmed() {
        return this.isMobileConfirmed;
    }

    /**
     * @return isMobileLogin
     */
    public Boolean getIsMobileLogin() {
        return this.isMobileLogin;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return nationalityCode
     */
    public String getNationalityCode() {
        return this.nationalityCode;
    }

    /**
     * @return plainPassword
     */
    public String getPlainPassword() {
        return this.plainPassword;
    }

    /**
     * @return preferredLanguage
     */
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    /**
     * @return accountTypeCode
     */
    public String getAccountTypeCode() {
        return this.accountTypeCode;
    }

    public static final class Builder extends Request.Builder<RegisterInternalAccountForBucRequest, Builder> {
        private String bid; 
        private String email; 
        private Boolean isEmailConfirmed; 
        private Boolean isMobileConfirmed; 
        private Boolean isMobileLogin; 
        private String mobile; 
        private String nationalityCode; 
        private String plainPassword; 
        private String preferredLanguage; 
        private String accountTypeCode; 

        private Builder() {
            super();
        } 

        private Builder(RegisterInternalAccountForBucRequest request) {
            super(request);
            this.bid = request.bid;
            this.email = request.email;
            this.isEmailConfirmed = request.isEmailConfirmed;
            this.isMobileConfirmed = request.isMobileConfirmed;
            this.isMobileLogin = request.isMobileLogin;
            this.mobile = request.mobile;
            this.nationalityCode = request.nationalityCode;
            this.plainPassword = request.plainPassword;
            this.preferredLanguage = request.preferredLanguage;
            this.accountTypeCode = request.accountTypeCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * IsEmailConfirmed.
         */
        public Builder isEmailConfirmed(Boolean isEmailConfirmed) {
            this.putQueryParameter("IsEmailConfirmed", isEmailConfirmed);
            this.isEmailConfirmed = isEmailConfirmed;
            return this;
        }

        /**
         * IsMobileConfirmed.
         */
        public Builder isMobileConfirmed(Boolean isMobileConfirmed) {
            this.putQueryParameter("IsMobileConfirmed", isMobileConfirmed);
            this.isMobileConfirmed = isMobileConfirmed;
            return this;
        }

        /**
         * IsMobileLogin.
         */
        public Builder isMobileLogin(Boolean isMobileLogin) {
            this.putQueryParameter("IsMobileLogin", isMobileLogin);
            this.isMobileLogin = isMobileLogin;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * NationalityCode.
         */
        public Builder nationalityCode(String nationalityCode) {
            this.putQueryParameter("NationalityCode", nationalityCode);
            this.nationalityCode = nationalityCode;
            return this;
        }

        /**
         * PlainPassword.
         */
        public Builder plainPassword(String plainPassword) {
            this.putQueryParameter("PlainPassword", plainPassword);
            this.plainPassword = plainPassword;
            return this;
        }

        /**
         * PreferredLanguage.
         */
        public Builder preferredLanguage(String preferredLanguage) {
            this.putQueryParameter("PreferredLanguage", preferredLanguage);
            this.preferredLanguage = preferredLanguage;
            return this;
        }

        /**
         * accountTypeCode.
         */
        public Builder accountTypeCode(String accountTypeCode) {
            this.putQueryParameter("accountTypeCode", accountTypeCode);
            this.accountTypeCode = accountTypeCode;
            return this;
        }

        @Override
        public RegisterInternalAccountForBucRequest build() {
            return new RegisterInternalAccountForBucRequest(this);
        } 

    } 

}

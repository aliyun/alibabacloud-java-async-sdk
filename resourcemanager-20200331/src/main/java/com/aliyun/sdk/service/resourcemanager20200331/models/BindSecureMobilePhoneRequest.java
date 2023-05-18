// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSecureMobilePhoneRequest} extends {@link RequestModel}
 *
 * <p>BindSecureMobilePhoneRequest</p>
 */
public class BindSecureMobilePhoneRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("SecureMobilePhone")
    @Validation(required = true)
    private String secureMobilePhone;

    @Query
    @NameInMap("VerificationCode")
    @Validation(required = true)
    private String verificationCode;

    private BindSecureMobilePhoneRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.secureMobilePhone = builder.secureMobilePhone;
        this.verificationCode = builder.verificationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindSecureMobilePhoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return secureMobilePhone
     */
    public String getSecureMobilePhone() {
        return this.secureMobilePhone;
    }

    /**
     * @return verificationCode
     */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public static final class Builder extends Request.Builder<BindSecureMobilePhoneRequest, Builder> {
        private String accountId; 
        private String secureMobilePhone; 
        private String verificationCode; 

        private Builder() {
            super();
        } 

        private Builder(BindSecureMobilePhoneRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.secureMobilePhone = request.secureMobilePhone;
            this.verificationCode = request.verificationCode;
        } 

        /**
         * The Alibaba Cloud account ID of the member.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The mobile phone number that you want to bind to the member for security purposes.
         * <p>
         * 
         * The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the [SendVerificationCodeForBindSecureMobilePhone](~~372556~~) operation to obtain a verification code.
         * 
         * Specify the mobile phone number in the \<Country code>-\<Mobile phone number> format.
         * 
         * >  Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.
         */
        public Builder secureMobilePhone(String secureMobilePhone) {
            this.putQueryParameter("SecureMobilePhone", secureMobilePhone);
            this.secureMobilePhone = secureMobilePhone;
            return this;
        }

        /**
         * The verification code.
         * <p>
         * 
         * You can call the [SendVerificationCodeForBindSecureMobilePhone](~~372556~~) operation to obtain the verification code.
         */
        public Builder verificationCode(String verificationCode) {
            this.putQueryParameter("VerificationCode", verificationCode);
            this.verificationCode = verificationCode;
            return this;
        }

        @Override
        public BindSecureMobilePhoneRequest build() {
            return new BindSecureMobilePhoneRequest(this);
        } 

    } 

}

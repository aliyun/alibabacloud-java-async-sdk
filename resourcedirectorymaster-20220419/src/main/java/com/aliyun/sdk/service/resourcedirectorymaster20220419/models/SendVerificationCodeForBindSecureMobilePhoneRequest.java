// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationCodeForBindSecureMobilePhoneRequest} extends {@link RequestModel}
 *
 * <p>SendVerificationCodeForBindSecureMobilePhoneRequest</p>
 */
public class SendVerificationCodeForBindSecureMobilePhoneRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("SecureMobilePhone")
    @Validation(required = true)
    private String secureMobilePhone;

    private SendVerificationCodeForBindSecureMobilePhoneRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.secureMobilePhone = builder.secureMobilePhone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerificationCodeForBindSecureMobilePhoneRequest create() {
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

    public static final class Builder extends Request.Builder<SendVerificationCodeForBindSecureMobilePhoneRequest, Builder> {
        private String accountId; 
        private String secureMobilePhone; 

        private Builder() {
            super();
        } 

        private Builder(SendVerificationCodeForBindSecureMobilePhoneRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.secureMobilePhone = request.secureMobilePhone;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * SecureMobilePhone.
         */
        public Builder secureMobilePhone(String secureMobilePhone) {
            this.putQueryParameter("SecureMobilePhone", secureMobilePhone);
            this.secureMobilePhone = secureMobilePhone;
            return this;
        }

        @Override
        public SendVerificationCodeForBindSecureMobilePhoneRequest build() {
            return new SendVerificationCodeForBindSecureMobilePhoneRequest(this);
        } 

    } 

}

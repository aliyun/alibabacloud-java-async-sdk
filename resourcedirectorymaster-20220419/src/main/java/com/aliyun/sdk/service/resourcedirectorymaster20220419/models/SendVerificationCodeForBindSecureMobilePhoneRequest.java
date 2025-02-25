// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link SendVerificationCodeForBindSecureMobilePhoneRequest} extends {@link RequestModel}
 *
 * <p>SendVerificationCodeForBindSecureMobilePhoneRequest</p>
 */
public class SendVerificationCodeForBindSecureMobilePhoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecureMobilePhone")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The Alibaba Cloud account ID of the member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>138660628348****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The mobile phone number that you want to bind to the member for security purposes.</p>
         * <p>Specify the mobile phone number in the &lt;Country code&gt;-&lt;Mobile phone number&gt; format.</p>
         * <blockquote>
         * <p>Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx-13900001234</p>
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

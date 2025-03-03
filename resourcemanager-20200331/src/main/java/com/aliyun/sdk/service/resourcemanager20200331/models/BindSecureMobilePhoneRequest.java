// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link BindSecureMobilePhoneRequest} extends {@link RequestModel}
 *
 * <p>BindSecureMobilePhoneRequest</p>
 */
public class BindSecureMobilePhoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecureMobilePhone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secureMobilePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> operation to obtain a verification code.</p>
         * <p>Specify the mobile phone number in the &lt;Country code&gt;-&lt;Mobile phone number&gt; format.</p>
         * <blockquote>
         * <p> Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
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

        /**
         * <p>The verification code.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/372556.html">SendVerificationCodeForBindSecureMobilePhone</a> operation to obtain the verification code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link UnbindVerificationRequest} extends {@link RequestModel}
 *
 * <p>UnbindVerificationRequest</p>
 */
public class UnbindVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobilePhone")
    private String mobilePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    private String verifyType;

    private UnbindVerificationRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.mobilePhone = builder.mobilePhone;
        this.userPrincipalName = builder.userPrincipalName;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<UnbindVerificationRequest, Builder> {
        private String email; 
        private String mobilePhone; 
        private String userPrincipalName; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(UnbindVerificationRequest request) {
            super(request);
            this.email = request.email;
            this.mobilePhone = request.mobilePhone;
            this.userPrincipalName = request.userPrincipalName;
            this.verifyType = request.verifyType;
        } 

        /**
         * <p>The email address.</p>
         * <blockquote>
         * <p> If you set <code>VerifyType</code> to <code>email</code>, you must specify this parameter.</p>
         * </blockquote>
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
         * <p>The mobile phone number.</p>
         * <blockquote>
         * <p> If you set <code>VerifyType</code> to <code>sms</code>, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-13900001234</p>
         */
        public Builder mobilePhone(String mobilePhone) {
            this.putQueryParameter("MobilePhone", mobilePhone);
            this.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        /**
         * <p>The multi-factor authentication (MFA) method. Valid values:</p>
         * <ul>
         * <li>sms: mobile phone.</li>
         * <li>email: email.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public UnbindVerificationRequest build() {
            return new UnbindVerificationRequest(this);
        } 

    } 

}

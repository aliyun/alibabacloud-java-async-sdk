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
 * {@link SendVerificationCodeForEnableRDRequest} extends {@link RequestModel}
 *
 * <p>SendVerificationCodeForEnableRDRequest</p>
 */
public class SendVerificationCodeForEnableRDRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecureMobilePhone")
    private String secureMobilePhone;

    private SendVerificationCodeForEnableRDRequest(Builder builder) {
        super(builder);
        this.secureMobilePhone = builder.secureMobilePhone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerificationCodeForEnableRDRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secureMobilePhone
     */
    public String getSecureMobilePhone() {
        return this.secureMobilePhone;
    }

    public static final class Builder extends Request.Builder<SendVerificationCodeForEnableRDRequest, Builder> {
        private String secureMobilePhone; 

        private Builder() {
            super();
        } 

        private Builder(SendVerificationCodeForEnableRDRequest request) {
            super(request);
            this.secureMobilePhone = request.secureMobilePhone;
        } 

        /**
         * <p>The mobile phone number that is bound to the newly created account. If you leave this parameter empty, the mobile phone number that is bound to the current account is used.</p>
         * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
         * <blockquote>
         * <p>Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
         * </blockquote>
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
        public SendVerificationCodeForEnableRDRequest build() {
            return new SendVerificationCodeForEnableRDRequest(this);
        } 

    } 

}

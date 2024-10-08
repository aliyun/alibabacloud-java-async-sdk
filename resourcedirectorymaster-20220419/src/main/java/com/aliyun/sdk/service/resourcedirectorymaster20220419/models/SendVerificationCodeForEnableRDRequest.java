// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The mobile phone number that is bound to the newly created account. If you leave this parameter empty, the mobile phone number that is bound to the current account is used.
         * <p>
         * 
         * Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.
         * 
         * > Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.
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

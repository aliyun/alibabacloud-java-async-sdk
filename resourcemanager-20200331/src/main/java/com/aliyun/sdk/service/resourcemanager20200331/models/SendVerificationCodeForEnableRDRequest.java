// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationCodeForEnableRDRequest} extends {@link RequestModel}
 *
 * <p>SendVerificationCodeForEnableRDRequest</p>
 */
public class SendVerificationCodeForEnableRDRequest extends Request {
    @Query
    @NameInMap("SecureMobilePhone")
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
         * SecureMobilePhone.
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

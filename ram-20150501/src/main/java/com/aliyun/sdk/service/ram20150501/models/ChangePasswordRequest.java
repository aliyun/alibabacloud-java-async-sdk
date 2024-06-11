// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangePasswordRequest} extends {@link RequestModel}
 *
 * <p>ChangePasswordRequest</p>
 */
public class ChangePasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPassword")
    private String newPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldPassword")
    private String oldPassword;

    private ChangePasswordRequest(Builder builder) {
        super(builder);
        this.newPassword = builder.newPassword;
        this.oldPassword = builder.oldPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangePasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * @return oldPassword
     */
    public String getOldPassword() {
        return this.oldPassword;
    }

    public static final class Builder extends Request.Builder<ChangePasswordRequest, Builder> {
        private String newPassword; 
        private String oldPassword; 

        private Builder() {
            super();
        } 

        private Builder(ChangePasswordRequest request) {
            super(request);
            this.newPassword = request.newPassword;
            this.oldPassword = request.oldPassword;
        } 

        /**
         * The new password that is used to log on to the Alibaba Cloud Management Console.
         * <p>
         * 
         * The password must meet the complexity requirements. For more information, see [SetPasswordPolicy](~~28739~~).
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * The old password that is used to log on to the Alibaba Cloud Management Console.
         */
        public Builder oldPassword(String oldPassword) {
            this.putQueryParameter("OldPassword", oldPassword);
            this.oldPassword = oldPassword;
            return this;
        }

        @Override
        public ChangePasswordRequest build() {
            return new ChangePasswordRequest(this);
        } 

    } 

}

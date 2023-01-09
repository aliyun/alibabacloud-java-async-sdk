// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangePasswordRequest} extends {@link RequestModel}
 *
 * <p>ChangePasswordRequest</p>
 */
public class ChangePasswordRequest extends Request {
    @Query
    @NameInMap("NewPassword")
    @Validation(required = true)
    private String newPassword;

    @Query
    @NameInMap("OldPassword")
    @Validation(required = true)
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
         * NewPassword.
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * OldPassword.
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

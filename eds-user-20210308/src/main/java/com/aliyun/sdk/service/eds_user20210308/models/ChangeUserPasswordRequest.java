// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link ChangeUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ChangeUserPasswordRequest</p>
 */
public class ChangeUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewPassword")
    private String newPassword;

    private ChangeUserPasswordRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.newPassword = builder.newPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeUserPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    public static final class Builder extends Request.Builder<ChangeUserPasswordRequest, Builder> {
        private String endUserId; 
        private String newPassword; 

        private Builder() {
            super();
        } 

        private Builder(ChangeUserPasswordRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.newPassword = request.newPassword;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * NewPassword.
         */
        public Builder newPassword(String newPassword) {
            this.putBodyParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        @Override
        public ChangeUserPasswordRequest build() {
            return new ChangeUserPasswordRequest(this);
        } 

    } 

}

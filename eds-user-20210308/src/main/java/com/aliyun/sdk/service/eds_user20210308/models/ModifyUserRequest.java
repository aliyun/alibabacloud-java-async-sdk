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
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserRequest create() {
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
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
        private String email; 
        private String endUserId; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
            super(request);
            this.email = request.email;
            this.endUserId = request.endUserId;
            this.phone = request.phone;
        } 

        /**
         * <p>The email address of the convenience user. For a user-activated convenience user, the email address or mobile number must be verified. You can choose to verify the email address or the mobile number. For an administrator-activated convenience user, the email address and mobile number can be left empty.</p>
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
         * <p>The name of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The mobile number of the convenience user. For a user-activated convenience user, the email address or mobile number must be verified. You can choose to verify the email address or the mobile number. For an administrator-activated convenience user, the email address and mobile number can be left empty.</p>
         * <blockquote>
         * <p> Accounts created on the International site (alibabacloud.com) do not support mobile number-based authentication.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}

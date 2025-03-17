// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link AddUserRequest} extends {@link RequestModel}
 *
 * <p>AddUserRequest</p>
 */
public class AddUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @Deprecated
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminUser")
    private Boolean adminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
    private Boolean authAdminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private String roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10, minimum = 1)
    private Integer userType;

    private AddUserRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.nickName = builder.nickName;
        this.roleIds = builder.roleIds;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserRequest create() {
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
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return adminUser
     */
    public Boolean getAdminUser() {
        return this.adminUser;
    }

    /**
     * @return authAdminUser
     */
    public Boolean getAuthAdminUser() {
        return this.authAdminUser;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return roleIds
     */
    public String getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<AddUserRequest, Builder> {
        private String accountId; 
        private String accountName; 
        private Boolean adminUser; 
        private Boolean authAdminUser; 
        private String nickName; 
        private String roleIds; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(AddUserRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.nickName = request.nickName;
            this.roleIds = request.roleIds;
            this.userType = request.userType;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Add organization members.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder adminUser(Boolean adminUser) {
            this.putQueryParameter("AdminUser", adminUser);
            this.adminUser = adminUser;
            return this;
        }

        /**
         * AuthAdminUser.
         */
        public Builder authAdminUser(Boolean authAdminUser) {
            this.putQueryParameter("AuthAdminUser", authAdminUser);
            this.authAdminUser = authAdminUser;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * RoleIds.
         */
        public Builder roleIds(String roleIds) {
            this.putBodyParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userType(Integer userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public AddUserRequest build() {
            return new AddUserRequest(this);
        } 

    } 

}

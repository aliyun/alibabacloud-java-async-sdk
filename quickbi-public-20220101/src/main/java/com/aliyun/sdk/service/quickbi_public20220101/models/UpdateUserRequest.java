// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminUser")
    private Boolean adminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
    private Boolean authAdminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private String roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer userType;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.isDeleted = builder.isDeleted;
        this.nickName = builder.nickName;
        this.roleIds = builder.roleIds;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private Boolean adminUser; 
        private Boolean authAdminUser; 
        private Boolean isDeleted; 
        private String nickName; 
        private String roleIds; 
        private String userId; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.isDeleted = request.isDeleted;
            this.nickName = request.nickName;
            this.roleIds = request.roleIds;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
         * Indicates whether the organization administrator. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder adminUser(Boolean adminUser) {
            this.putQueryParameter("AdminUser", adminUser);
            this.adminUser = adminUser;
            return this;
        }

        /**
         * Indicate whether the RAM user is a permission administrator. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder authAdminUser(Boolean authAdminUser) {
            this.putQueryParameter("AuthAdminUser", authAdminUser);
            this.authAdminUser = authAdminUser;
            return this;
        }

        /**
         * IsDeleted.
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.putQueryParameter("IsDeleted", isDeleted);
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * The nickname of the account.
         * <p>
         * 
         * *   Format check: The value can be up to 50 characters in length.
         * *   Special format verification: Chinese and English digits\_ \ / | () ] \[
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
            this.putQueryParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * The ID of the user to be updated. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The role type of the organization member. Valid values:
         * <p>
         * 
         * *   1 : developer
         * *   2 : visitors
         * *   3 : Analyst
         */
        public Builder userType(Integer userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}

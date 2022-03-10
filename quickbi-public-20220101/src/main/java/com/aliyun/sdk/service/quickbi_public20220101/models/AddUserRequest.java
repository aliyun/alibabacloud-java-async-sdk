// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserRequest} extends {@link RequestModel}
 *
 * <p>AddUserRequest</p>
 */
public class AddUserRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AdminUser")
    @Validation(required = true)
    private Boolean adminUser;

    @Query
    @NameInMap("AuthAdminUser")
    @Validation(required = true)
    private Boolean authAdminUser;

    @Query
    @NameInMap("NickName")
    @Validation(required = true)
    private String nickName;

    @Query
    @NameInMap("UserType")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer userType;

    private AddUserRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.nickName = builder.nickName;
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
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<AddUserRequest, Builder> {
        private String accountName; 
        private Boolean adminUser; 
        private Boolean authAdminUser; 
        private String nickName; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(AddUserRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.nickName = request.nickName;
            this.userType = request.userType;
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
         * AdminUser.
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
         * NickName.
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * UserType.
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

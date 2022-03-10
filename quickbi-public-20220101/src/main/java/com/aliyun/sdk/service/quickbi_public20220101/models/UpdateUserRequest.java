// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
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
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("UserType")
    @Validation(required = true, maximum = 10, minimum = 1)
    private Integer userType;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.nickName = builder.nickName;
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
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
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
        private String nickName; 
        private String userId; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.nickName = request.nickName;
            this.userId = request.userId;
            this.userType = request.userType;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}

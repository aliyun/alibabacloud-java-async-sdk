// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddFeishuUsersRequest} extends {@link RequestModel}
 *
 * <p>BatchAddFeishuUsersRequest</p>
 */
public class BatchAddFeishuUsersRequest extends Request {
    @Query
    @NameInMap("FeishuUsers")
    private String feishuUsers;

    @Query
    @NameInMap("IsAdmin")
    private Boolean isAdmin;

    @Query
    @NameInMap("IsAuthAdmin")
    private Boolean isAuthAdmin;

    @Query
    @NameInMap("UserGroupIds")
    private String userGroupIds;

    @Query
    @NameInMap("UserType")
    private Integer userType;

    private BatchAddFeishuUsersRequest(Builder builder) {
        super(builder);
        this.feishuUsers = builder.feishuUsers;
        this.isAdmin = builder.isAdmin;
        this.isAuthAdmin = builder.isAuthAdmin;
        this.userGroupIds = builder.userGroupIds;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddFeishuUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feishuUsers
     */
    public String getFeishuUsers() {
        return this.feishuUsers;
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return isAuthAdmin
     */
    public Boolean getIsAuthAdmin() {
        return this.isAuthAdmin;
    }

    /**
     * @return userGroupIds
     */
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<BatchAddFeishuUsersRequest, Builder> {
        private String feishuUsers; 
        private Boolean isAdmin; 
        private Boolean isAuthAdmin; 
        private String userGroupIds; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddFeishuUsersRequest request) {
            super(request);
            this.feishuUsers = request.feishuUsers;
            this.isAdmin = request.isAdmin;
            this.isAuthAdmin = request.isAuthAdmin;
            this.userGroupIds = request.userGroupIds;
            this.userType = request.userType;
        } 

        /**
         * FeishuUsers.
         */
        public Builder feishuUsers(String feishuUsers) {
            this.putQueryParameter("FeishuUsers", feishuUsers);
            this.feishuUsers = feishuUsers;
            return this;
        }

        /**
         * IsAdmin.
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.putQueryParameter("IsAdmin", isAdmin);
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * IsAuthAdmin.
         */
        public Builder isAuthAdmin(Boolean isAuthAdmin) {
            this.putQueryParameter("IsAuthAdmin", isAuthAdmin);
            this.isAuthAdmin = isAuthAdmin;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
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
        public BatchAddFeishuUsersRequest build() {
            return new BatchAddFeishuUsersRequest(this);
        } 

    } 

}

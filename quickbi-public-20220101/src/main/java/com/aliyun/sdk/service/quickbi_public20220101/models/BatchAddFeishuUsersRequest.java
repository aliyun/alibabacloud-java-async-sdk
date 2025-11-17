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
 * {@link BatchAddFeishuUsersRequest} extends {@link RequestModel}
 *
 * <p>BatchAddFeishuUsersRequest</p>
 */
public class BatchAddFeishuUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeishuUsers")
    private String feishuUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAdmin")
    private Boolean isAdmin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuthAdmin")
    private Boolean isAuthAdmin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private String userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
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
         * <p>Information of the users to be added</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ad<strong><strong>fd&quot;: &quot;TEST&quot;, &quot;82</strong></strong>5a&quot;: &quot;TEST&quot;}&quot;</p>
         */
        public Builder feishuUsers(String feishuUsers) {
            this.putQueryParameter("FeishuUsers", feishuUsers);
            this.feishuUsers = feishuUsers;
            return this;
        }

        /**
         * <p>Whether the user is an admin user:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default is false if not provided</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.putQueryParameter("IsAdmin", isAdmin);
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * <p>Whether the user is an authorization administrator</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default is false if not provided</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAuthAdmin(Boolean isAuthAdmin) {
            this.putQueryParameter("IsAuthAdmin", isAuthAdmin);
            this.isAuthAdmin = isAuthAdmin;
            return this;
        }

        /**
         * <p>User group ID(s)</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0d5fb19b-5555-41f0-99da-1248fc27ca51,0f868dd6_68dd_4d13_8422_c5dca3bd4b61&quot;</p>
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>User type</p>
         * <ul>
         * <li>Developer: 1</li>
         * <li>Visitor: 2</li>
         * <li>Analyst: 3</li>
         * </ul>
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
        public BatchAddFeishuUsersRequest build() {
            return new BatchAddFeishuUsersRequest(this);
        } 

    } 

}

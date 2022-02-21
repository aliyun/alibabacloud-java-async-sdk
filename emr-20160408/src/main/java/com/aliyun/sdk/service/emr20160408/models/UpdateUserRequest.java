// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

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
    @NameInMap("AliyunUserId")
    private String aliyunUserId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupIdList")
    private java.util.List < Integer > groupIdList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RoleIdList")
    private java.util.List < Integer > roleIdList;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("UserAccountParamList")
    private java.util.List < UserAccountParamList> userAccountParamList;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Query
    @NameInMap("UserType")
    private String userType;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.aliyunUserId = builder.aliyunUserId;
        this.description = builder.description;
        this.groupIdList = builder.groupIdList;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleIdList = builder.roleIdList;
        this.status = builder.status;
        this.userAccountParamList = builder.userAccountParamList;
        this.userName = builder.userName;
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
     * @return aliyunUserId
     */
    public String getAliyunUserId() {
        return this.aliyunUserId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupIdList
     */
    public java.util.List < Integer > getGroupIdList() {
        return this.groupIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return roleIdList
     */
    public java.util.List < Integer > getRoleIdList() {
        return this.roleIdList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userAccountParamList
     */
    public java.util.List < UserAccountParamList> getUserAccountParamList() {
        return this.userAccountParamList;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String aliyunUserId; 
        private String description; 
        private java.util.List < Integer > groupIdList; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < Integer > roleIdList; 
        private String status; 
        private java.util.List < UserAccountParamList> userAccountParamList; 
        private String userName; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest response) {
            super(response);
            this.aliyunUserId = response.aliyunUserId;
            this.description = response.description;
            this.groupIdList = response.groupIdList;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.roleIdList = response.roleIdList;
            this.status = response.status;
            this.userAccountParamList = response.userAccountParamList;
            this.userName = response.userName;
            this.userType = response.userType;
        } 

        /**
         * AliyunUserId.
         */
        public Builder aliyunUserId(String aliyunUserId) {
            this.putQueryParameter("AliyunUserId", aliyunUserId);
            this.aliyunUserId = aliyunUserId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupIdList.
         */
        public Builder groupIdList(java.util.List < Integer > groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RoleIdList.
         */
        public Builder roleIdList(java.util.List < Integer > roleIdList) {
            this.putQueryParameter("RoleIdList", roleIdList);
            this.roleIdList = roleIdList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserAccountParamList.
         */
        public Builder userAccountParamList(java.util.List < UserAccountParamList> userAccountParamList) {
            this.putQueryParameter("UserAccountParamList", userAccountParamList);
            this.userAccountParamList = userAccountParamList;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

    public static class UserAccountParamList extends TeaModel {
        @NameInMap("AccountPassword")
        @Validation(required = true)
        private String accountPassword;

        @NameInMap("AccountType")
        @Validation(required = true)
        private String accountType;

        @NameInMap("AuthType")
        private String authType;

        private UserAccountParamList(Builder builder) {
            this.accountPassword = builder.accountPassword;
            this.accountType = builder.accountType;
            this.authType = builder.authType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAccountParamList create() {
            return builder().build();
        }

        /**
         * @return accountPassword
         */
        public String getAccountPassword() {
            return this.accountPassword;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        public static final class Builder {
            private String accountPassword; 
            private String accountType; 
            private String authType; 

            /**
             * AccountPassword.
             */
            public Builder accountPassword(String accountPassword) {
                this.accountPassword = accountPassword;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            public UserAccountParamList build() {
                return new UserAccountParamList(this);
            } 

        } 

    }
}

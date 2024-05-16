// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgUserGroupAddOrUpdateRequest} extends {@link RequestModel}
 *
 * <p>DsgUserGroupAddOrUpdateRequest</p>
 */
public class DsgUserGroupAddOrUpdateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < UserGroups> userGroups;

    private DsgUserGroupAddOrUpdateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgUserGroupAddOrUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userGroups
     */
    public java.util.List < UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder extends Request.Builder<DsgUserGroupAddOrUpdateRequest, Builder> {
        private String regionId; 
        private java.util.List < UserGroups> userGroups; 

        private Builder() {
            super();
        } 

        private Builder(DsgUserGroupAddOrUpdateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.userGroups = request.userGroups;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserGroups.
         */
        public Builder userGroups(java.util.List < UserGroups> userGroups) {
            String userGroupsShrink = shrink(userGroups, "UserGroups", "json");
            this.putQueryParameter("UserGroups", userGroupsShrink);
            this.userGroups = userGroups;
            return this;
        }

        @Override
        public DsgUserGroupAddOrUpdateRequest build() {
            return new DsgUserGroupAddOrUpdateRequest(this);
        } 

    } 

    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > accounts;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer userGroupType;

        private UserGroups(Builder builder) {
            this.accounts = builder.accounts;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectName = builder.projectName;
            this.userGroupType = builder.userGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List < String > getAccounts() {
            return this.accounts;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return userGroupType
         */
        public Integer getUserGroupType() {
            return this.userGroupType;
        }

        public static final class Builder {
            private java.util.List < String > accounts; 
            private Long id; 
            private String name; 
            private String owner; 
            private String projectName; 
            private Integer userGroupType; 

            /**
             * Accounts.
             */
            public Builder accounts(java.util.List < String > accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * UserGroupType.
             */
            public Builder userGroupType(Integer userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}

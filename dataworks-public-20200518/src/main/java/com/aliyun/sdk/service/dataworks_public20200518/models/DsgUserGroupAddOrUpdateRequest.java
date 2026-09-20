// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    private java.util.List<UserGroups> userGroups;

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
    public java.util.List<UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder extends Request.Builder<DsgUserGroupAddOrUpdateRequest, Builder> {
        private String regionId; 
        private java.util.List<UserGroups> userGroups; 

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
         * <p>The user groups.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userGroups(java.util.List<UserGroups> userGroups) {
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

    /**
     * 
     * {@link DsgUserGroupAddOrUpdateRequest} extends {@link TeaModel}
     *
     * <p>DsgUserGroupAddOrUpdateRequest</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<String> accounts;

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

        @com.aliyun.core.annotation.NameInMap("projects")
        private String projects;

        private UserGroups(Builder builder) {
            this.accounts = builder.accounts;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectName = builder.projectName;
            this.userGroupType = builder.userGroupType;
            this.projects = builder.projects;
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
        public java.util.List<String> getAccounts() {
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

        /**
         * @return projects
         */
        public String getProjects() {
            return this.projects;
        }

        public static final class Builder {
            private java.util.List<String> accounts; 
            private Long id; 
            private String name; 
            private String owner; 
            private String projectName; 
            private Integer userGroupType; 
            private String projects; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.accounts = model.accounts;
                this.id = model.id;
                this.name = model.name;
                this.owner = model.owner;
                this.projectName = model.projectName;
                this.userGroupType = model.userGroupType;
                this.projects = model.projects;
            } 

            /**
             * <p>The users in the user group.</p>
             * <ul>
             * <li><p>For user groups created based on Alibaba Cloud accounts and Resource Access Management (RAM) roles, call the <a href="https://help.aliyun.com/document_detail/2786445.html">DsgUserGroupQueryUserList</a> API to query the user list.</p>
             * </li>
             * <li><p>For user groups created based on MaxCompute roles, call the <a href="https://help.aliyun.com/document_detail/2785695.html">DsgUserGroupGetOdpsRoleGroups</a> API to query the user list.</p>
             * </li>
             * </ul>
             */
            public Builder accounts(java.util.List<String> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * <ul>
             * <li><p>If you do not specify this parameter, a new user group is created.</p>
             * </li>
             * <li><p>If you specify this parameter, the specified user group is modified. You can call the <a href="https://help.aliyun.com/document_detail/2786441.html">DsgUserGroupQueryList</a> operation to query the ID of the user group.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>yun_group</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the user group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project. Set this parameter when you create a MaxCompute user group.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The type of the user group. The following values are valid:</p>
             * <ul>
             * <li><p>1: Alibaba Cloud user</p>
             * </li>
             * <li><p>2: RAM Role</p>
             * </li>
             * <li><p>3: MaxCompute Role</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userGroupType(Integer userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * projects.
             */
            public Builder projects(String projects) {
                this.projects = projects;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}

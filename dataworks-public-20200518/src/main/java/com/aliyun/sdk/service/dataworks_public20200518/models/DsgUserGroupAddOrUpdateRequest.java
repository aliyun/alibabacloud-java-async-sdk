// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The information about the user group.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link DsgUserGroupAddOrUpdateRequest} extends {@link TeaModel}
     *
     * <p>DsgUserGroupAddOrUpdateRequest</p>
     */
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
             * <p>The users in the group.</p>
             * <ul>
             * <li>If a user group is created by using an Alibaba Cloud account and a RAM role, you can call the <a href="https://help.aliyun.com/document_detail/2786445.html">DsgUserGroupQueryUserList</a> operation to query the users in the group.</li>
             * <li>If a user group is created by using a MaxCompute role, you can call the <a href="https://help.aliyun.com/document_detail/2785695.html">DsgUserGroupQueryUserList</a> operation to query the users in the group.</li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder accounts(java.util.List < String > accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * <ul>
             * <li>If you do not configure this parameter, the current operation is to add a user group.</li>
             * <li>If you configure this parameter, the current operation is to modify a user group. You can call the <a href="https://help.aliyun.com/document_detail/2786441.html">DsgUserGroupQueryList</a> operation to query the user group ID.</li>
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
             * <p>The name of the MaxCompute project. You must configure this parameter when you create a MaxCompute user group.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The type of the user group. Valid values:</p>
             * <ul>
             * <li>1: Alibaba Cloud account</li>
             * <li>2: RAM role</li>
             * <li>3: MaxCompute role</li>
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

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}

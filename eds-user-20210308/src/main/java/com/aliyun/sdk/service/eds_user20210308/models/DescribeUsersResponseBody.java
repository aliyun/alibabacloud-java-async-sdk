// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersResponseBody</p>
 */
public class DescribeUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private DescribeUsersResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Integer count; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(DescribeUsersResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>The total number of users that meet the query conditions</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The pagination token for the next query. An empty NextToken indicates that no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The collection of convenience account information.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUsersResponseBody build() {
            return new DescribeUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class ResourcePolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private ResourcePolicyList(Builder builder) {
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePolicyList create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String policyId; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(ResourcePolicyList model) {
                this.policyId = model.policyId;
                this.policyName = model.policyName;
            } 

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public ResourcePolicyList build() {
                return new ResourcePolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Extras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedResourceCount")
        private java.util.Map<String, ?> assignedResourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourcePolicyList")
        private java.util.List<ResourcePolicyList> resourcePolicyList;

        private Extras(Builder builder) {
            this.assignedResourceCount = builder.assignedResourceCount;
            this.resourcePolicyList = builder.resourcePolicyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extras create() {
            return builder().build();
        }

        /**
         * @return assignedResourceCount
         */
        public java.util.Map<String, ?> getAssignedResourceCount() {
            return this.assignedResourceCount;
        }

        /**
         * @return resourcePolicyList
         */
        public java.util.List<ResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

        public static final class Builder {
            private java.util.Map<String, ?> assignedResourceCount; 
            private java.util.List<ResourcePolicyList> resourcePolicyList; 

            private Builder() {
            } 

            private Builder(Extras model) {
                this.assignedResourceCount = model.assignedResourceCount;
                this.resourcePolicyList = model.resourcePolicyList;
            } 

            /**
             * <p>The number of assigned cloud resources.</p>
             */
            public Builder assignedResourceCount(java.util.Map<String, ?> assignedResourceCount) {
                this.assignedResourceCount = assignedResourceCount;
                return this;
            }

            /**
             * ResourcePolicyList.
             */
            public Builder resourcePolicyList(java.util.List<ResourcePolicyList> resourcePolicyList) {
                this.resourcePolicyList = resourcePolicyList;
                return this;
            }

            public Extras build() {
                return new Extras(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-12341234****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>UserGroup1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Orgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        @com.aliyun.core.annotation.NameInMap("OrgNamePath")
        private String orgNamePath;

        private Orgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
            this.orgNamePath = builder.orgNamePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orgs create() {
            return builder().build();
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        /**
         * @return orgNamePath
         */
        public String getOrgNamePath() {
            return this.orgNamePath;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 
            private String orgNamePath; 

            private Builder() {
            } 

            private Builder(Orgs model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
                this.orgNamePath = model.orgNamePath;
            } 

            /**
             * <p>The department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org-4mdgc1cocc59z****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The department name.</p>
             * 
             * <strong>example:</strong>
             * <p>Department1</p>
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * OrgNamePath.
             */
            public Builder orgNamePath(String orgNamePath) {
                this.orgNamePath = orgNamePath;
                return this;
            }

            public Orgs build() {
                return new Orgs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>Role</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>Student</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ExternalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private Extras extras;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsTenantManager")
        private Boolean isTenantManager;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("Orgs")
        private java.util.List<Orgs> orgs;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("PasswordExpireDays")
        private Integer passwordExpireDays;

        @com.aliyun.core.annotation.NameInMap("PasswordExpireRestDays")
        private Integer passwordExpireRestDays;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        @com.aliyun.core.annotation.NameInMap("RealNickName")
        private String realNickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private Users(Builder builder) {
            this.address = builder.address;
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.endUserId = builder.endUserId;
            this.externalName = builder.externalName;
            this.extras = builder.extras;
            this.groups = builder.groups;
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.jobNumber = builder.jobNumber;
            this.nickName = builder.nickName;
            this.orgId = builder.orgId;
            this.orgs = builder.orgs;
            this.ownerType = builder.ownerType;
            this.passwordExpireDays = builder.passwordExpireDays;
            this.passwordExpireRestDays = builder.passwordExpireRestDays;
            this.phone = builder.phone;
            this.properties = builder.properties;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
            this.status = builder.status;
            this.wyId = builder.wyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enableAdminAccess
         */
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
        }

        /**
         * @return extras
         */
        public Extras getExtras() {
            return this.extras;
        }

        /**
         * @return groups
         */
        public java.util.List<Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isTenantManager
         */
        public Boolean getIsTenantManager() {
            return this.isTenantManager;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgs
         */
        public java.util.List<Orgs> getOrgs() {
            return this.orgs;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return passwordExpireDays
         */
        public Integer getPasswordExpireDays() {
            return this.passwordExpireDays;
        }

        /**
         * @return passwordExpireRestDays
         */
        public Integer getPasswordExpireRestDays() {
            return this.passwordExpireRestDays;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return realNickName
         */
        public String getRealNickName() {
            return this.realNickName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String address; 
            private String avatar; 
            private String email; 
            private Boolean enableAdminAccess; 
            private String endUserId; 
            private String externalName; 
            private Extras extras; 
            private java.util.List<Groups> groups; 
            private Long id; 
            private Boolean isTenantManager; 
            private String jobNumber; 
            private String nickName; 
            private String orgId; 
            private java.util.List<Orgs> orgs; 
            private String ownerType; 
            private Integer passwordExpireDays; 
            private Integer passwordExpireRestDays; 
            private String phone; 
            private java.util.List<Properties> properties; 
            private String realNickName; 
            private String remark; 
            private Long status; 
            private String wyId; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.address = model.address;
                this.avatar = model.avatar;
                this.email = model.email;
                this.enableAdminAccess = model.enableAdminAccess;
                this.endUserId = model.endUserId;
                this.externalName = model.externalName;
                this.extras = model.extras;
                this.groups = model.groups;
                this.id = model.id;
                this.isTenantManager = model.isTenantManager;
                this.jobNumber = model.jobNumber;
                this.nickName = model.nickName;
                this.orgId = model.orgId;
                this.orgs = model.orgs;
                this.ownerType = model.ownerType;
                this.passwordExpireDays = model.passwordExpireDays;
                this.passwordExpireRestDays = model.passwordExpireRestDays;
                this.phone = model.phone;
                this.properties = model.properties;
                this.realNickName = model.realNickName;
                this.remark = model.remark;
                this.status = model.status;
                this.wyId = model.wyId;
            } 

            /**
             * <p>The work address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou ***</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The URL of the user\&quot;s profile picture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn">https://cdn</a>.*****</p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether administrator access permissions are enabled.</p>
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The username imported from an external source.</p>
             * <blockquote>
             * <p>This field is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Ma**</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The extended user information.</p>
             */
            public Builder extras(Extras extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The collection of user groups to which the convenience account belongs.</p>
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The convenience account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4205**</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the user is a user administrator. If the convenience account is of the administrator-activated type, a user administrator must be specified. Notifications such as password resets initiated by end users through the client are sent to the user administrator\&quot;s email or phone. For more information, see <a href="https://help.aliyun.com/document_detail/214472.html">Create a convenience account</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * <p>The employee ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>A10000**</p>
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * <p>The nickname of the user. The value is determined in the following order:</p>
             * <ul>
             * <li>RealNickName</li>
             * <li>Remark</li>
             * <li>EndUserId</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Li**</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The department ID to which the convenience account belongs.</p>
             * <blockquote>
             * <p>This parameter will be deprecated soon.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>org-4mdgc1cocc59z****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The collection of departments to which the convenience account belongs.</p>
             */
            public Builder orgs(java.util.List<Orgs> orgs) {
                this.orgs = orgs;
                return this;
            }

            /**
             * <p>The convenience account type, which includes:</p>
             * <ul>
             * <li>Administrator-activated type: The administrator sets the username and password. User notifications such as password resets are sent to the administrator\&quot;s email or phone.</li>
             * <li>User-activated type: The administrator sets the username and the user\&quot;s email or phone for receiving notifications. User notifications such as cloud computer provisioning notifications (including the initial password) are sent to the user\&quot;s email or phone.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * PasswordExpireDays.
             */
            public Builder passwordExpireDays(Integer passwordExpireDays) {
                this.passwordExpireDays = passwordExpireDays;
                return this;
            }

            /**
             * PasswordExpireRestDays.
             */
            public Builder passwordExpireRestDays(Integer passwordExpireRestDays) {
                this.passwordExpireRestDays = passwordExpireRestDays;
                return this;
            }

            /**
             * <p>The phone number. This parameter is not returned if it is not set.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The user properties.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>Li**</p>
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * <p>The remark of the convenience account.</p>
             * 
             * <strong>example:</strong>
             * <p>Test user.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The globally unique ID of the convenience account.</p>
             * 
             * <strong>example:</strong>
             * <p>41fd1254d8f7****</p>
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}

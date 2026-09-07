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
 * {@link FilterUsersResponseBody} extends {@link TeaModel}
 *
 * <p>FilterUsersResponseBody</p>
 */
public class FilterUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private FilterUsersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilterUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String nextToken; 
        private String requestId; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(FilterUsersResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>The token for paginated results. If the response is truncated, this parameter is returned. To retrieve the next page of results, include this value in a subsequent request.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
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
         * <p>A list of convenience accounts.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public FilterUsersResponseBody build() {
            return new FilterUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class ExternalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        private ExternalInfo(Builder builder) {
            this.externalName = builder.externalName;
            this.jobNumber = builder.jobNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalInfo create() {
            return builder().build();
        }

        /**
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        public static final class Builder {
            private String externalName; 
            private String jobNumber; 

            private Builder() {
            } 

            private Builder(ExternalInfo model) {
                this.externalName = model.externalName;
                this.jobNumber = model.jobNumber;
            } 

            /**
             * <p>The name of the mapped external account.</p>
             * 
             * <strong>example:</strong>
             * <p>account</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The ID of the external account, such as a student ID or an employee ID.</p>
             * 
             * <strong>example:</strong>
             * <p>030801</p>
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            public ExternalInfo build() {
                return new ExternalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
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
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class OrgList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        @com.aliyun.core.annotation.NameInMap("OrgNamePath")
        private String orgNamePath;

        private OrgList(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
            this.orgNamePath = builder.orgNamePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgList create() {
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

            private Builder(OrgList model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
                this.orgNamePath = model.orgNamePath;
            } 

            /**
             * <p>The organization ID.</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The organization name.</p>
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * <p>The organization name path.</p>
             */
            public Builder orgNamePath(String orgNamePath) {
                this.orgNamePath = orgNamePath;
                return this;
            }

            public OrgList build() {
                return new OrgList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
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
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class SupportLoginIdps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private String idpId;

        @com.aliyun.core.annotation.NameInMap("IdpName")
        private String idpName;

        private SupportLoginIdps(Builder builder) {
            this.idpId = builder.idpId;
            this.idpName = builder.idpName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportLoginIdps create() {
            return builder().build();
        }

        /**
         * @return idpId
         */
        public String getIdpId() {
            return this.idpId;
        }

        /**
         * @return idpName
         */
        public String getIdpName() {
            return this.idpName;
        }

        public static final class Builder {
            private String idpId; 
            private String idpName; 

            private Builder() {
            } 

            private Builder(SupportLoginIdps model) {
                this.idpId = model.idpId;
                this.idpName = model.idpName;
            } 

            /**
             * <p>The ID of the identity provider (IdP).</p>
             */
            public Builder idpId(String idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The name of the identity provider (IdP).</p>
             */
            public Builder idpName(String idpName) {
                this.idpName = idpName;
                return this;
            }

            public SupportLoginIdps build() {
                return new SupportLoginIdps(this);
            } 

        } 

    }
    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class PropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            private Builder() {
            } 

            private Builder(PropertyValues model) {
                this.propertyValue = model.propertyValue;
                this.propertyValueId = model.propertyValueId;
            } 

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * <p>The ID of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class UserSetPropertiesModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("PropertyType")
        private Integer propertyType;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
        private java.util.List<PropertyValues> propertyValues;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserSetPropertiesModels(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.propertyType = builder.propertyType;
            this.propertyValues = builder.propertyValues;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSetPropertiesModels create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyType
         */
        public Integer getPropertyType() {
            return this.propertyType;
        }

        /**
         * @return propertyValues
         */
        public java.util.List<PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private Integer propertyType; 
            private java.util.List<PropertyValues> propertyValues; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(UserSetPropertiesModels model) {
                this.propertyId = model.propertyId;
                this.propertyKey = model.propertyKey;
                this.propertyType = model.propertyType;
                this.propertyValues = model.propertyValues;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the user property.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The name of the user property.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>The type of the user property.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder propertyType(Integer propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            /**
             * <p>The property values.</p>
             */
            public Builder propertyValues(java.util.List<PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * <p>The ID of the user associated with the property.</p>
             * 
             * <strong>example:</strong>
             * <p>4205**</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The user name associated with the property.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserSetPropertiesModels build() {
                return new UserSetPropertiesModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link FilterUsersResponseBody} extends {@link TeaModel}
     *
     * <p>FilterUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoLockTime")
        private String autoLockTime;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Long desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupCount")
        private Long desktopGroupCount;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ExternalInfo")
        private ExternalInfo externalInfo;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsTenantManager")
        private Boolean isTenantManager;

        @com.aliyun.core.annotation.NameInMap("OrgList")
        private java.util.List<OrgList> orgList;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("PasswordExpireDays")
        private Integer passwordExpireDays;

        @com.aliyun.core.annotation.NameInMap("PasswordExpireRestDays")
        private Integer passwordExpireRestDays;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RealNickName")
        private String realNickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourcePolicyList")
        private java.util.List<ResourcePolicyList> resourcePolicyList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("SupportLoginIdps")
        private java.util.List<SupportLoginIdps> supportLoginIdps;

        @com.aliyun.core.annotation.NameInMap("UserSetPropertiesModels")
        private java.util.List<UserSetPropertiesModels> userSetPropertiesModels;

        private Users(Builder builder) {
            this.autoLockTime = builder.autoLockTime;
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.email = builder.email;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.endUserId = builder.endUserId;
            this.externalInfo = builder.externalInfo;
            this.groups = builder.groups;
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.orgList = builder.orgList;
            this.ownerType = builder.ownerType;
            this.passwordExpireDays = builder.passwordExpireDays;
            this.passwordExpireRestDays = builder.passwordExpireRestDays;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
            this.resourcePolicyList = builder.resourcePolicyList;
            this.status = builder.status;
            this.supportLoginIdps = builder.supportLoginIdps;
            this.userSetPropertiesModels = builder.userSetPropertiesModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return autoLockTime
         */
        public String getAutoLockTime() {
            return this.autoLockTime;
        }

        /**
         * @return desktopCount
         */
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Long getDesktopGroupCount() {
            return this.desktopGroupCount;
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
         * @return externalInfo
         */
        public ExternalInfo getExternalInfo() {
            return this.externalInfo;
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
         * @return orgList
         */
        public java.util.List<OrgList> getOrgList() {
            return this.orgList;
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
         * @return resourcePolicyList
         */
        public java.util.List<ResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return supportLoginIdps
         */
        public java.util.List<SupportLoginIdps> getSupportLoginIdps() {
            return this.supportLoginIdps;
        }

        /**
         * @return userSetPropertiesModels
         */
        public java.util.List<UserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

        public static final class Builder {
            private String autoLockTime; 
            private Long desktopCount; 
            private Long desktopGroupCount; 
            private String email; 
            private Boolean enableAdminAccess; 
            private String endUserId; 
            private ExternalInfo externalInfo; 
            private java.util.List<Groups> groups; 
            private Long id; 
            private Boolean isTenantManager; 
            private java.util.List<OrgList> orgList; 
            private String ownerType; 
            private Integer passwordExpireDays; 
            private Integer passwordExpireRestDays; 
            private String phone; 
            private String realNickName; 
            private String remark; 
            private java.util.List<ResourcePolicyList> resourcePolicyList; 
            private Long status; 
            private java.util.List<SupportLoginIdps> supportLoginIdps; 
            private java.util.List<UserSetPropertiesModels> userSetPropertiesModels; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.autoLockTime = model.autoLockTime;
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.email = model.email;
                this.enableAdminAccess = model.enableAdminAccess;
                this.endUserId = model.endUserId;
                this.externalInfo = model.externalInfo;
                this.groups = model.groups;
                this.id = model.id;
                this.isTenantManager = model.isTenantManager;
                this.orgList = model.orgList;
                this.ownerType = model.ownerType;
                this.passwordExpireDays = model.passwordExpireDays;
                this.passwordExpireRestDays = model.passwordExpireRestDays;
                this.phone = model.phone;
                this.realNickName = model.realNickName;
                this.remark = model.remark;
                this.resourcePolicyList = model.resourcePolicyList;
                this.status = model.status;
                this.supportLoginIdps = model.supportLoginIdps;
                this.userSetPropertiesModels = model.userSetPropertiesModels;
            } 

            /**
             * <p>The date the account will be automatically locked.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-03</p>
             */
            public Builder autoLockTime(String autoLockTime) {
                this.autoLockTime = autoLockTime;
                return this;
            }

            /**
             * <p>The number of cloud desktops assigned to the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of desktop groups the user can access. This parameter is returned only when <code>IncludeDesktopGroupCount</code> is set to <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desktopGroupCount(Long desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
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
             * <p>Indicates whether the user has local administrator permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * <p>The user name.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>External user information.</p>
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4205**</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the user is a tenant administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * <p>A list of organizations the user belongs to.</p>
             */
            public Builder orgList(java.util.List<OrgList> orgList) {
                this.orgList = orgList;
                return this;
            }

            /**
             * <p>The account ownership type.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The password validity period in days. By default, passwords do not expire. Set this to a value from 30 to 365 to enforce an expiration policy. When a password expires, the user must change it before logging on again.</p>
             * <blockquote>
             * <p>This feature is in preview and available by invitation only. To use this feature, submit a ticket.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder passwordExpireDays(Integer passwordExpireDays) {
                this.passwordExpireDays = passwordExpireDays;
                return this;
            }

            /**
             * <p>The number of days until the password expires.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder passwordExpireRestDays(Integer passwordExpireRestDays) {
                this.passwordExpireRestDays = passwordExpireRestDays;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The user\&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>小明</p>
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * <p>The remark about the user.</p>
             * 
             * <strong>example:</strong>
             * <p>测试专用</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ResourcePolicyList.
             */
            public Builder resourcePolicyList(java.util.List<ResourcePolicyList> resourcePolicyList) {
                this.resourcePolicyList = resourcePolicyList;
                return this;
            }

            /**
             * <p>The status of the convenience account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>A list of identity providers (IdPs) that the user can use to log on.</p>
             */
            public Builder supportLoginIdps(java.util.List<SupportLoginIdps> supportLoginIdps) {
                this.supportLoginIdps = supportLoginIdps;
                return this;
            }

            /**
             * <p>A list of user properties.</p>
             */
            public Builder userSetPropertiesModels(java.util.List<UserSetPropertiesModels> userSetPropertiesModels) {
                this.userSetPropertiesModels = userSetPropertiesModels;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}

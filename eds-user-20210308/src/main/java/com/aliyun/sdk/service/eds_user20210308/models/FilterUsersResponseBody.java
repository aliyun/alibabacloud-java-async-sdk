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

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to start the next query.</p>
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
         * <p>DBD276B5-00FF-5E04-8EF7-5CBA09BF112A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the convenience user.</p>
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

            /**
             * <p>The account that is associated with the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The account, student ID, or employee ID that is associated with the convenience user.</p>
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
    public static class OrgList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        private OrgList(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
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

        public static final class Builder {
            private String orgId; 
            private String orgName; 

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OrgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
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

            /**
             * IdpId.
             */
            public Builder idpId(String idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * IdpName.
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

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
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

            /**
             * <p>The property ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>The property type.</p>
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
             * <p>The ID of the convenience user that is bound to the property.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the convenience user that is bound to the property.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
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
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.orgList = builder.orgList;
            this.ownerType = builder.ownerType;
            this.passwordExpireDays = builder.passwordExpireDays;
            this.passwordExpireRestDays = builder.passwordExpireRestDays;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
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
            private Long id; 
            private Boolean isTenantManager; 
            private java.util.List<OrgList> orgList; 
            private String ownerType; 
            private Integer passwordExpireDays; 
            private Integer passwordExpireRestDays; 
            private String phone; 
            private String realNickName; 
            private String remark; 
            private Long status; 
            private java.util.List<SupportLoginIdps> supportLoginIdps; 
            private java.util.List<UserSetPropertiesModels> userSetPropertiesModels; 

            /**
             * AutoLockTime.
             */
            public Builder autoLockTime(String autoLockTime) {
                this.autoLockTime = autoLockTime;
                return this;
            }

            /**
             * <p>The number of cloud desktops that are assigned to the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of cloud desktop pools that are assigned to the convenience user. This value is returned if you set <code>IncludeDesktopGroupCount</code> to <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desktopGroupCount(Long desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * <p>The email address of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:testName@example.com">testName@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether the convenience user is a local administrator.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * <p>The username of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The additional information about the convenience user.</p>
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * <p>The ID of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the convenience user is a tenant administrator.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * OrgList.
             */
            public Builder orgList(java.util.List<OrgList> orgList) {
                this.orgList = orgList;
                return this;
            }

            /**
             * <p>The type of the account ownership.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CreateFromManager: administrator-activated</li>
             * <li>Normal: user-activated</li>
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
             * <p>The mobile number of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The nickname of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>Oliver</p>
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * <p>The remarks on the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the convenience user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>0: The convenience user is normal.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>9: The convenience user is locked.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * SupportLoginIdps.
             */
            public Builder supportLoginIdps(java.util.List<SupportLoginIdps> supportLoginIdps) {
                this.supportLoginIdps = supportLoginIdps;
                return this;
            }

            /**
             * <p>The information about the properties.</p>
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

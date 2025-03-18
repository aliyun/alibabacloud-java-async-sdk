// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountExpireTime")
    private Long accountExpireTime;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("customFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("emailVerified")
    private Boolean emailVerified;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("lockExpireTime")
    private Long lockExpireTime;

    @com.aliyun.core.annotation.NameInMap("organizationalUnits")
    private java.util.List<OrganizationalUnits> organizationalUnits;

    @com.aliyun.core.annotation.NameInMap("passwordSet")
    private Boolean passwordSet;

    @com.aliyun.core.annotation.NameInMap("phoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.NameInMap("phoneNumberVerified")
    private Boolean phoneNumberVerified;

    @com.aliyun.core.annotation.NameInMap("phoneRegion")
    private String phoneRegion;

    @com.aliyun.core.annotation.NameInMap("primaryOrganizationalUnitId")
    private String primaryOrganizationalUnitId;

    @com.aliyun.core.annotation.NameInMap("registerTime")
    private Long registerTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    @com.aliyun.core.annotation.NameInMap("userExternalId")
    private String userExternalId;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("userSourceId")
    private String userSourceId;

    @com.aliyun.core.annotation.NameInMap("userSourceType")
    private String userSourceType;

    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private GetUserResponseBody(Builder builder) {
        this.accountExpireTime = builder.accountExpireTime;
        this.createTime = builder.createTime;
        this.customFields = builder.customFields;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.groups = builder.groups;
        this.instanceId = builder.instanceId;
        this.lockExpireTime = builder.lockExpireTime;
        this.organizationalUnits = builder.organizationalUnits;
        this.passwordSet = builder.passwordSet;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.primaryOrganizationalUnitId = builder.primaryOrganizationalUnitId;
        this.registerTime = builder.registerTime;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.userExternalId = builder.userExternalId;
        this.userId = builder.userId;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountExpireTime
     */
    public Long getAccountExpireTime() {
        return this.accountExpireTime;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customFields
     */
    public java.util.List<CustomFields> getCustomFields() {
        return this.customFields;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return emailVerified
     */
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lockExpireTime
     */
    public Long getLockExpireTime() {
        return this.lockExpireTime;
    }

    /**
     * @return organizationalUnits
     */
    public java.util.List<OrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    /**
     * @return passwordSet
     */
    public Boolean getPasswordSet() {
        return this.passwordSet;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return phoneNumberVerified
     */
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    /**
     * @return phoneRegion
     */
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    /**
     * @return primaryOrganizationalUnitId
     */
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    /**
     * @return registerTime
     */
    public Long getRegisterTime() {
        return this.registerTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userSourceId
     */
    public String getUserSourceId() {
        return this.userSourceId;
    }

    /**
     * @return userSourceType
     */
    public String getUserSourceType() {
        return this.userSourceType;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private Long accountExpireTime; 
        private Long createTime; 
        private java.util.List<CustomFields> customFields; 
        private String description; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private java.util.List<Groups> groups; 
        private String instanceId; 
        private Long lockExpireTime; 
        private java.util.List<OrganizationalUnits> organizationalUnits; 
        private Boolean passwordSet; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String primaryOrganizationalUnitId; 
        private Long registerTime; 
        private String status; 
        private Long updateTime; 
        private String userExternalId; 
        private String userId; 
        private String userSourceId; 
        private String userSourceType; 
        private String username; 

        private Builder() {
        } 

        private Builder(GetUserResponseBody model) {
            this.accountExpireTime = model.accountExpireTime;
            this.createTime = model.createTime;
            this.customFields = model.customFields;
            this.description = model.description;
            this.displayName = model.displayName;
            this.email = model.email;
            this.emailVerified = model.emailVerified;
            this.groups = model.groups;
            this.instanceId = model.instanceId;
            this.lockExpireTime = model.lockExpireTime;
            this.organizationalUnits = model.organizationalUnits;
            this.passwordSet = model.passwordSet;
            this.phoneNumber = model.phoneNumber;
            this.phoneNumberVerified = model.phoneNumberVerified;
            this.phoneRegion = model.phoneRegion;
            this.primaryOrganizationalUnitId = model.primaryOrganizationalUnitId;
            this.registerTime = model.registerTime;
            this.status = model.status;
            this.updateTime = model.updateTime;
            this.userExternalId = model.userExternalId;
            this.userId = model.userId;
            this.userSourceId = model.userSourceId;
            this.userSourceType = model.userSourceType;
            this.username = model.username;
        } 

        /**
         * <p>The time when the account expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        public Builder accountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }

        /**
         * <p>The time when the account was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The extended fields of the account.</p>
         */
        public Builder customFields(java.util.List<CustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>display_name001</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Indicates whether the email address has been verified. A value of true indicates that the email address has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the email address has not been verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * <p>账户所属组列表。</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The time when the account lock expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        public Builder lockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }

        /**
         * <p>The organizational units to which the account belongs.</p>
         */
        public Builder organizationalUnits(java.util.List<OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * <p>Indicates whether the password is set.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder passwordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }

        /**
         * <p>The mobile number of the user who owns the account.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>Indicates whether the mobile number has been verified. A value of true indicates that the mobile number has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the mobile number has not been verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder phoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * <p>The ID of the primary organizational unit of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }

        /**
         * <p>The time when the account was registered. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        public Builder registerTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }

        /**
         * <p>The status of the account. Valid values: enabled disabled</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the account was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The external ID of the account. The external ID can be used to map external data to the data of the account in EIAM of Identity as a Service (IDaaS). By default, the external ID is the account ID.</p>
         * <p>Note: For accounts with the same source type and source ID, each account has a unique external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The source ID of the account.</p>
         * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder userSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * <p>The source type of the account. Valid values:</p>
         * <ul>
         * <li>build_in: The account was created in IDaaS.</li>
         * <li>ding_talk: The account was imported from DingTalk.</li>
         * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        public Builder userSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
        private String fieldValue;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 

            private Builder() {
            } 

            private Builder(CustomFields model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
            } 

            /**
             * <p>The name of the extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The value of the extended field. Field values are returned as strings regardless of the data types of the fields. For example, true or false is returned for a Boolean field.</p>
             * 
             * <strong>example:</strong>
             * <p>字段数据值</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        private Groups(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>组描述。</p>
             * 
             * <strong>example:</strong>
             * <p>description_demo</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>组ID。</p>
             * 
             * <strong>example:</strong>
             * <p>group_ufdsasn35ea5lmthk267xxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>组名称。</p>
             * 
             * <strong>example:</strong>
             * <p>name_test</p>
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
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class OrganizationalUnits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("organizationalUnitId")
        private String organizationalUnitId;

        @com.aliyun.core.annotation.NameInMap("organizationalUnitName")
        private String organizationalUnitName;

        @com.aliyun.core.annotation.NameInMap("primary")
        private Boolean primary;

        private OrganizationalUnits(Builder builder) {
            this.organizationalUnitId = builder.organizationalUnitId;
            this.organizationalUnitName = builder.organizationalUnitName;
            this.primary = builder.primary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnits create() {
            return builder().build();
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        /**
         * @return organizationalUnitName
         */
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        public static final class Builder {
            private String organizationalUnitId; 
            private String organizationalUnitName; 
            private Boolean primary; 

            private Builder() {
            } 

            private Builder(OrganizationalUnits model) {
                this.organizationalUnitId = model.organizationalUnitId;
                this.organizationalUnitName = model.organizationalUnitName;
                this.primary = model.primary;
            } 

            /**
             * <p>The ID of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * <p>The name of the organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>name001</p>
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * <p>Indicates whether the organizational unit is the primary organizational unit.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            public OrganizationalUnits build() {
                return new OrganizationalUnits(this);
            } 

        } 

    }
}

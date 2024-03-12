// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("User")
    private User user;

    private GetUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String requestId; 
        private User user; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The data object of the account.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class CustomFields extends TeaModel {
        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("FieldValue")
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

            /**
             * The identifier of the custom field.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The value of the custom field.
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
    public static class Groups extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
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

            /**
             * The description of the organizational unit.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the organizational unit.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the organizational unit.
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
    public static class OrganizationalUnits extends TeaModel {
        @NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @NameInMap("OrganizationalUnitName")
        private String organizationalUnitName;

        @NameInMap("Primary")
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

            /**
             * The ID of the organizational unit.
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * The name of the organizational unit.
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * Indicates whether the organization is the primary organization.
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
    public static class User extends TeaModel {
        @NameInMap("AccountExpireTime")
        private Long accountExpireTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CustomFields")
        private java.util.List < CustomFields> customFields;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("EmailVerified")
        private Boolean emailVerified;

        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LockExpireTime")
        private Long lockExpireTime;

        @NameInMap("OrganizationalUnits")
        private java.util.List < OrganizationalUnits> organizationalUnits;

        @NameInMap("PasswordExpireTime")
        private Long passwordExpireTime;

        @NameInMap("PasswordSet")
        private Boolean passwordSet;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("PhoneNumberVerified")
        private Boolean phoneNumberVerified;

        @NameInMap("PhoneRegion")
        private String phoneRegion;

        @NameInMap("PreferredLanguage")
        private String preferredLanguage;

        @NameInMap("PrimaryOrganizationalUnitId")
        private String primaryOrganizationalUnitId;

        @NameInMap("RegisterTime")
        private Long registerTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserExternalId")
        private String userExternalId;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserSourceId")
        private String userSourceId;

        @NameInMap("UserSourceType")
        private String userSourceType;

        @NameInMap("Username")
        private String username;

        private User(Builder builder) {
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
            this.passwordExpireTime = builder.passwordExpireTime;
            this.passwordSet = builder.passwordSet;
            this.phoneNumber = builder.phoneNumber;
            this.phoneNumberVerified = builder.phoneNumberVerified;
            this.phoneRegion = builder.phoneRegion;
            this.preferredLanguage = builder.preferredLanguage;
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

        public static User create() {
            return builder().build();
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
        public java.util.List < CustomFields> getCustomFields() {
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
        public java.util.List < Groups> getGroups() {
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
        public java.util.List < OrganizationalUnits> getOrganizationalUnits() {
            return this.organizationalUnits;
        }

        /**
         * @return passwordExpireTime
         */
        public Long getPasswordExpireTime() {
            return this.passwordExpireTime;
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
         * @return preferredLanguage
         */
        public String getPreferredLanguage() {
            return this.preferredLanguage;
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
            private java.util.List < CustomFields> customFields; 
            private String description; 
            private String displayName; 
            private String email; 
            private Boolean emailVerified; 
            private java.util.List < Groups> groups; 
            private String instanceId; 
            private Long lockExpireTime; 
            private java.util.List < OrganizationalUnits> organizationalUnits; 
            private Long passwordExpireTime; 
            private Boolean passwordSet; 
            private String phoneNumber; 
            private Boolean phoneNumberVerified; 
            private String phoneRegion; 
            private String preferredLanguage; 
            private String primaryOrganizationalUnitId; 
            private Long registerTime; 
            private String status; 
            private Long updateTime; 
            private String userExternalId; 
            private String userId; 
            private String userSourceId; 
            private String userSourceType; 
            private String username; 

            /**
             * The time when the account expires. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder accountExpireTime(Long accountExpireTime) {
                this.accountExpireTime = accountExpireTime;
                return this;
            }

            /**
             * The time when the account was created. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The list of custom fields that describe the account.
             */
            public Builder customFields(java.util.List < CustomFields> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * The description of the account.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the account.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The email address of the user who owns the account.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Indicates whether the email address has been verified. A value of true indicates that the email address has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the email address has not been verified.
             */
            public Builder emailVerified(Boolean emailVerified) {
                this.emailVerified = emailVerified;
                return this;
            }

            /**
             * The organizational units to which the account belongs.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the account lock expires. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder lockExpireTime(Long lockExpireTime) {
                this.lockExpireTime = lockExpireTime;
                return this;
            }

            /**
             * The organizational units to which the account belongs.
             */
            public Builder organizationalUnits(java.util.List < OrganizationalUnits> organizationalUnits) {
                this.organizationalUnits = organizationalUnits;
                return this;
            }

            /**
             * The time when the password of the account expires. This value is a UNIX timestamp. Unit: milliseconds.
             * <p>
             * 
             * *   If the value -1 is returned, the password does not expire.
             * *   If no value is returned, the password does not expire.
             * *   If a UNIX timestamp is returned, the password expires at the indicated point of time.
             */
            public Builder passwordExpireTime(Long passwordExpireTime) {
                this.passwordExpireTime = passwordExpireTime;
                return this;
            }

            /**
             * Indicates whether a password is set.
             */
            public Builder passwordSet(Boolean passwordSet) {
                this.passwordSet = passwordSet;
                return this;
            }

            /**
             * The mobile number of the user who owns the account.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Indicates whether the mobile number has been verified. A value of true indicates that the mobile number has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the mobile number has not been verified.
             */
            public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
                this.phoneNumberVerified = phoneNumberVerified;
                return this;
            }

            /**
             * The country code of the mobile number. For example, the country code of China is 86 without 00 or +.
             */
            public Builder phoneRegion(String phoneRegion) {
                this.phoneRegion = phoneRegion;
                return this;
            }

            /**
             * PreferredLanguage.
             */
            public Builder preferredLanguage(String preferredLanguage) {
                this.preferredLanguage = preferredLanguage;
                return this;
            }

            /**
             * The ID of the primary organizational unit to which the account belongs.
             */
            public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
                this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
                return this;
            }

            /**
             * The time when the account was registered. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * The status of the account. Valid values:
             * <p>
             * 
             * *   enabled: The account is enabled.
             * *   disabled: The account is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the account was last updated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The external ID of the account. The external ID can be used by external data to map the data of the account in IDaaS EIAM. By default, the external ID is the account ID.
             * <p>
             * 
             * For accounts with the same source type and source ID, each account has a unique external ID.
             */
            public Builder userExternalId(String userExternalId) {
                this.userExternalId = userExternalId;
                return this;
            }

            /**
             * The ID of the account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The source ID of the account.
             * <p>
             * 
             * If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.
             */
            public Builder userSourceId(String userSourceId) {
                this.userSourceId = userSourceId;
                return this;
            }

            /**
             * The source type of the account. Valid values:
             * <p>
             * 
             * *   build_in: The account was created in IDaaS.
             * *   ding_talk: The account was imported from DingTalk.
             * *   ad: The account was imported from Microsoft Active Directory (AD).
             * *   ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.
             */
            public Builder userSourceType(String userSourceType) {
                this.userSourceType = userSourceType;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}

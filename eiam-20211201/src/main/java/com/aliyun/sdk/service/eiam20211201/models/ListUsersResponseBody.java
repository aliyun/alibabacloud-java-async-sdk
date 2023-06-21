// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Users")
    private java.util.List < Users> users;

    private ListUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < Users> users; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries in the list.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of data objects of accounts.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("AccountExpireTime")
        private Long accountExpireTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("EmailVerified")
        private Boolean emailVerified;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LockExpireTime")
        private Long lockExpireTime;

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

        private Users(Builder builder) {
            this.accountExpireTime = builder.accountExpireTime;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.emailVerified = builder.emailVerified;
            this.instanceId = builder.instanceId;
            this.lockExpireTime = builder.lockExpireTime;
            this.passwordExpireTime = builder.passwordExpireTime;
            this.passwordSet = builder.passwordSet;
            this.phoneNumber = builder.phoneNumber;
            this.phoneNumberVerified = builder.phoneNumberVerified;
            this.phoneRegion = builder.phoneRegion;
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

        public static Users create() {
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
            private String description; 
            private String displayName; 
            private String email; 
            private Boolean emailVerified; 
            private String instanceId; 
            private Long lockExpireTime; 
            private Long passwordExpireTime; 
            private Boolean passwordSet; 
            private String phoneNumber; 
            private Boolean phoneNumberVerified; 
            private String phoneRegion; 
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
             * Time When Password Expires
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

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}

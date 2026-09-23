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
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListUsersResponseBody(Builder builder) {
        this.data = builder.data;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListUsersResponseBody model) {
            this.data = model.data;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of returned data objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListUsersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountExpireTime")
        private Long accountExpireTime;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("emailVerified")
        private Boolean emailVerified;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("lockExpireTime")
        private Long lockExpireTime;

        @com.aliyun.core.annotation.NameInMap("passwordSet")
        private Boolean passwordSet;

        @com.aliyun.core.annotation.NameInMap("phoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("phoneNumberVerified")
        private Boolean phoneNumberVerified;

        @com.aliyun.core.annotation.NameInMap("phoneRegion")
        private String phoneRegion;

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

        private Data(Builder builder) {
            this.accountExpireTime = builder.accountExpireTime;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.emailVerified = builder.emailVerified;
            this.instanceId = builder.instanceId;
            this.lockExpireTime = builder.lockExpireTime;
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

        public static Data create() {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountExpireTime = model.accountExpireTime;
                this.createTime = model.createTime;
                this.description = model.description;
                this.displayName = model.displayName;
                this.email = model.email;
                this.emailVerified = model.emailVerified;
                this.instanceId = model.instanceId;
                this.lockExpireTime = model.lockExpireTime;
                this.passwordSet = model.passwordSet;
                this.phoneNumber = model.phoneNumber;
                this.phoneNumberVerified = model.phoneNumberVerified;
                this.phoneRegion = model.phoneRegion;
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
             * <p>The time when the account expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder accountExpireTime(Long accountExpireTime) {
                this.accountExpireTime = accountExpireTime;
                return this;
            }

            /**
             * <p>The time when the account was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>测试账户</p>
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
             * <p>The email address of the account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:example@example.com">example@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether the email address is verified. A value of true indicates that the email address is verified by the user or set to verified by the administrator. A value of false indicates that the email address is not verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailVerified(Boolean emailVerified) {
                this.emailVerified = emailVerified;
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
             * <p>The time when the account lock expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder lockExpireTime(Long lockExpireTime) {
                this.lockExpireTime = lockExpireTime;
                return this;
            }

            /**
             * <p>Indicates whether a password is set.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passwordSet(Boolean passwordSet) {
                this.passwordSet = passwordSet;
                return this;
            }

            /**
             * <p>The mobile phone number of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>156xxxxxxx</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Indicates whether the mobile phone number is verified. A value of true indicates that the mobile phone number is verified by the user or set to verified by the administrator. A value of false indicates that the mobile phone number is not verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
                this.phoneNumberVerified = phoneNumberVerified;
                return this;
            }

            /**
             * <p>The area code for the mobile phone number. For example, the area code for a mobile phone number in the Chinese mainland is 86. Do not add 00 or a plus sign (+).</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder phoneRegion(String phoneRegion) {
                this.phoneRegion = phoneRegion;
                return this;
            }

            /**
             * <p>The time when the account was registered. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * <p>The status of the account. Valid values: enabled: The account is enabled. disabled: The account is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the account was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The external ID of the account. This ID is used to map external data to the IDaaS account. By default, this parameter is the same as the IDaaS account ID.</p>
             * <p>Note: The external ID must be unique for the same source type and source ID.</p>
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
             * <p>For accounts created in IDaaS, the default value is the instance ID. For other types of accounts, the value is the enterprise ID from the source. For example, for an account from DingTalk, the value is the corpId of the DingTalk enterprise.</p>
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
             * <li><p>build_in: The account is created in IDaaS.</p>
             * </li>
             * <li><p>ding_talk: The account is imported from DingTalk.</p>
             * </li>
             * <li><p>ad: The account is imported from Active Directory (AD).</p>
             * </li>
             * <li><p>ldap: The account is imported from LDAP.</p>
             * </li>
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
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p>name001</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

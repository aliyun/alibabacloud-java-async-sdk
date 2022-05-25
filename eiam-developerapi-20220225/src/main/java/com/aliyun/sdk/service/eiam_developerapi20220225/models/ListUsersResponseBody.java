// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("totalCount")
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

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 记录总数
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("accountExpireTime")
        private Long accountExpireTime;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("description")
        private String description;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("email")
        private String email;

        @NameInMap("emailVerified")
        private Boolean emailVerified;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("lockExpireTime")
        private Long lockExpireTime;

        @NameInMap("passwordSet")
        private Boolean passwordSet;

        @NameInMap("phoneNumber")
        private String phoneNumber;

        @NameInMap("phoneNumberVerified")
        private Boolean phoneNumberVerified;

        @NameInMap("phoneRegion")
        private String phoneRegion;

        @NameInMap("registerTime")
        private Long registerTime;

        @NameInMap("status")
        private String status;

        @NameInMap("updateTime")
        private Long updateTime;

        @NameInMap("userExternalId")
        private String userExternalId;

        @NameInMap("userId")
        private String userId;

        @NameInMap("userSourceId")
        private String userSourceId;

        @NameInMap("userSourceType")
        private String userSourceType;

        @NameInMap("username")
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

            /**
             * 账户过期时间, 毫秒时间
             */
            public Builder accountExpireTime(Long accountExpireTime) {
                this.accountExpireTime = accountExpireTime;
                return this;
            }

            /**
             * 创建时间, 毫秒时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 账号描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 显示名
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 邮箱是否验证
             */
            public Builder emailVerified(Boolean emailVerified) {
                this.emailVerified = emailVerified;
                return this;
            }

            /**
             * 实例ID
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 锁定过期时间, 毫秒时间
             */
            public Builder lockExpireTime(Long lockExpireTime) {
                this.lockExpireTime = lockExpireTime;
                return this;
            }

            /**
             * 密码是否已设置
             */
            public Builder passwordSet(Boolean passwordSet) {
                this.passwordSet = passwordSet;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * 手机号是否验证
             */
            public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
                this.phoneNumberVerified = phoneNumberVerified;
                return this;
            }

            /**
             * 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +
             */
            public Builder phoneRegion(String phoneRegion) {
                this.phoneRegion = phoneRegion;
                return this;
            }

            /**
             * registerTime.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * 账户状态, enabled:启用,disabled:禁用
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 最近一次更新时间, 毫秒时间
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 外部ID
             */
            public Builder userExternalId(String userExternalId) {
                this.userExternalId = userExternalId;
                return this;
            }

            /**
             * 账户ID
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 来源ID
             */
            public Builder userSourceId(String userSourceId) {
                this.userSourceId = userSourceId;
                return this;
            }

            /**
             * 来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]
             */
            public Builder userSourceType(String userSourceType) {
                this.userSourceType = userSourceType;
                return this;
            }

            /**
             * 账户名
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

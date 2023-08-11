// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserResponseBody</p>
 */
public class UpdateUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("User")
    private User user;

    private UpdateUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the RAM user.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public UpdateUserResponseBody build() {
            return new UpdateUserResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Comments")
        private String comments;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("LastLoginDate")
        private String lastLoginDate;

        @NameInMap("MobilePhone")
        private String mobilePhone;

        @NameInMap("ProvisionType")
        private String provisionType;

        @NameInMap("UpdateDate")
        private String updateDate;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private User(Builder builder) {
            this.comments = builder.comments;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.lastLoginDate = builder.lastLoginDate;
            this.mobilePhone = builder.mobilePhone;
            this.provisionType = builder.provisionType;
            this.updateDate = builder.updateDate;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
         * @return lastLoginDate
         */
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        /**
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        /**
         * @return provisionType
         */
        public String getProvisionType() {
            return this.provisionType;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String comments; 
            private String createDate; 
            private String displayName; 
            private String email; 
            private String lastLoginDate; 
            private String mobilePhone; 
            private String provisionType; 
            private String updateDate; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * The description.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The time when the RAM user was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The display name of the RAM user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The email address of the RAM user.
             * <p>
             * 
             * > This parameter is valid only on the China site (aliyun.com).
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The last time when the RAM user logged on to the Alibaba Cloud Management Console.
             */
            public Builder lastLoginDate(String lastLoginDate) {
                this.lastLoginDate = lastLoginDate;
                return this;
            }

            /**
             * The mobile phone number of the RAM user.
             * <p>
             * 
             * > This parameter is valid only on the China site (aliyun.com).
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * The source of the RAM user. Valid values:
             * <p>
             * 
             * - Manual: The RAM user is manually created in the RAM console.
             * - SCIM: The RAM user is mapped by using System for Cross-domain Identity Management (SCIM).
             * - CloudSSO: The RAM user is mapped from a CloudSSO user.
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * The time when the information about the RAM user was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * The ID of the RAM user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The logon name of the RAM user.
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}

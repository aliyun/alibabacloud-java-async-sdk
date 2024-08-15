// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsersRequest} extends {@link RequestModel}
 *
 * <p>CreateUsersRequest</p>
 */
public class CreateUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoLockTime")
    private String autoLockTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsLocalAdmin")
    private Boolean isLocalAdmin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordExpireDays")
    private String passwordExpireDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Users> users;

    private CreateUsersRequest(Builder builder) {
        super(builder);
        this.autoLockTime = builder.autoLockTime;
        this.isLocalAdmin = builder.isLocalAdmin;
        this.password = builder.password;
        this.passwordExpireDays = builder.passwordExpireDays;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoLockTime
     */
    public String getAutoLockTime() {
        return this.autoLockTime;
    }

    /**
     * @return isLocalAdmin
     */
    public Boolean getIsLocalAdmin() {
        return this.isLocalAdmin;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordExpireDays
     */
    public String getPasswordExpireDays() {
        return this.passwordExpireDays;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateUsersRequest, Builder> {
        private String autoLockTime; 
        private Boolean isLocalAdmin; 
        private String password; 
        private String passwordExpireDays; 
        private java.util.List < Users> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsersRequest request) {
            super(request);
            this.autoLockTime = request.autoLockTime;
            this.isLocalAdmin = request.isLocalAdmin;
            this.password = request.password;
            this.passwordExpireDays = request.passwordExpireDays;
            this.users = request.users;
        } 

        /**
         * The date on which the convenience users are automatically locked.
         */
        public Builder autoLockTime(String autoLockTime) {
            this.putQueryParameter("AutoLockTime", autoLockTime);
            this.autoLockTime = autoLockTime;
            return this;
        }

        /**
         * IsLocalAdmin.
         */
        public Builder isLocalAdmin(Boolean isLocalAdmin) {
            this.putQueryParameter("IsLocalAdmin", isLocalAdmin);
            this.isLocalAdmin = isLocalAdmin;
            return this;
        }

        /**
         * The initial password. If this parameter is left empty, an email for password reset is sent to the specified email address.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PasswordExpireDays.
         */
        public Builder passwordExpireDays(String passwordExpireDays) {
            this.putQueryParameter("PasswordExpireDays", passwordExpireDays);
            this.passwordExpireDays = passwordExpireDays;
            return this;
        }

        /**
         * The information about the convenience user.
         */
        public Builder users(java.util.List < Users> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateUsersRequest build() {
            return new CreateUsersRequest(this);
        } 

    } 

    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RealNickName")
        private String realNickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Users(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.orgId = builder.orgId;
            this.ownerType = builder.ownerType;
            this.password = builder.password;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
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

        public static final class Builder {
            private String email; 
            private String endUserId; 
            private String orgId; 
            private String ownerType; 
            private String password; 
            private String phone; 
            private String realNickName; 
            private String remark; 

            /**
             * The email address of the convenience user. The email address is used to receive notifications about events such as desktop assignment. You must specify an email address or a mobile number to receive notifications.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The username of the convenience user. The name can contain lowercase letters, digits, and underscores (\_), and must be 3 to 24 characters in length.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The organization to which the convenience user belongs.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * The type of the account ownership.
             * <p>
             * 
             * Valid values:
             * 
             * *   CreateFromManager: administrator-activated
             * *   Normal: user-activated
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * The user password.
             * <p>
             * 
             * >  The password must be at least 10 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (excluding spaces).
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Mobile numbers are not supported on the international site (alibabacloud.com).
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The display name of the end user.
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * The remarks on the convenience user.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}

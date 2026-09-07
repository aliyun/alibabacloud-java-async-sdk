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
 * {@link CreateUsersRequest} extends {@link RequestModel}
 *
 * <p>CreateUsersRequest</p>
 */
public class CreateUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoLockTime")
    private String autoLockTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

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
    private java.util.List<Users> users;

    private CreateUsersRequest(Builder builder) {
        super(builder);
        this.autoLockTime = builder.autoLockTime;
        this.businessChannel = builder.businessChannel;
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
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
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
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateUsersRequest, Builder> {
        private String autoLockTime; 
        private String businessChannel; 
        private Boolean isLocalAdmin; 
        private String password; 
        private String passwordExpireDays; 
        private java.util.List<Users> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsersRequest request) {
            super(request);
            this.autoLockTime = request.autoLockTime;
            this.businessChannel = request.businessChannel;
            this.isLocalAdmin = request.isLocalAdmin;
            this.password = request.password;
            this.passwordExpireDays = request.passwordExpireDays;
            this.users = request.users;
        } 

        /**
         * <p>The date and time when the system automatically locks the convenience user\&quot;s account. The value must be in the <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-28 00:00:00</p>
         */
        public Builder autoLockTime(String autoLockTime) {
            this.putQueryParameter("AutoLockTime", autoLockTime);
            this.autoLockTime = autoLockTime;
            return this;
        }

        /**
         * <p>The business channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>Specifies whether to set the convenience user as a local administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLocalAdmin(Boolean isLocalAdmin) {
            this.putQueryParameter("IsLocalAdmin", isLocalAdmin);
            this.isLocalAdmin = isLocalAdmin;
            return this;
        }

        /**
         * <p>The initial password. If you do not specify this parameter, the system sends a password reset email to the convenience user\&quot;s email address.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123****</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>By default, a convenience user\&quot;s password does not expire. You can use this parameter to specify a password validity period of 30 to 365 days. After the password expires, the user must reset it to log in again.</p>
         * <blockquote>
         * <p>This feature is in invited preview. To use this feature, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder passwordExpireDays(String passwordExpireDays) {
            this.putQueryParameter("PasswordExpireDays", passwordExpireDays);
            this.passwordExpireDays = passwordExpireDays;
            return this;
        }

        /**
         * <p>Details about the convenience users.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateUsers</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateUsersRequest build() {
            return new CreateUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUsersRequest} extends {@link TeaModel}
     *
     * <p>CreateUsersRequest</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("GroupIdList")
        private java.util.List<String> groupIdList;

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
            this.groupIdList = builder.groupIdList;
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
         * @return groupIdList
         */
        public java.util.List<String> getGroupIdList() {
            return this.groupIdList;
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
            private java.util.List<String> groupIdList; 
            private String orgId; 
            private String ownerType; 
            private String password; 
            private String phone; 
            private String realNickName; 
            private String remark; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.email = model.email;
                this.endUserId = model.endUserId;
                this.groupIdList = model.groupIdList;
                this.orgId = model.orgId;
                this.ownerType = model.ownerType;
                this.password = model.password;
                this.phone = model.phone;
                this.realNickName = model.realNickName;
                this.remark = model.remark;
            } 

            /**
             * <p>The email address of the convenience user. This email address is used for notifications, such as an alert when a cloud computer is assigned. You must specify either this parameter or the <code>Phone</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The user name. The user name must be 3 to 24 characters long and can contain lowercase letters, digits, and underscores (_).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * GroupIdList.
             */
            public Builder groupIdList(java.util.List<String> groupIdList) {
                this.groupIdList = groupIdList;
                return this;
            }

            /**
             * <p>The ID of the organization to which the convenience user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>design</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The account activation type.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The password for the convenience user.</p>
             * <blockquote>
             * <p>The password must be at least 10 characters long and contain characters from at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (excluding spaces).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Wuying1234</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>The phone number of the convenience user. This phone number is used for notifications, such as a text message when a cloud computer is assigned. You must specify either this parameter or the <code>Email</code> parameter.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <p>Phone numbers are not supported on the international site.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The display name of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>Bean</p>
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * <p>A remark for the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>remark1</p>
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

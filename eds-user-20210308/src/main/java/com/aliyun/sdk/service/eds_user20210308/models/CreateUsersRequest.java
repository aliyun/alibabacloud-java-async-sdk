// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsersRequest} extends {@link RequestModel}
 *
 * <p>CreateUsersRequest</p>
 */
public class CreateUsersRequest extends Request {
    @Body
    @NameInMap("Password")
    @Validation(maxLength = 256)
    private String password;

    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private java.util.List < Users> users;

    private CreateUsersRequest(Builder builder) {
        super(builder);
        this.password = builder.password;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateUsersRequest, Builder> {
        private String password; 
        private java.util.List < Users> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsersRequest request) {
            super(request);
            this.password = request.password;
            this.users = request.users;
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
         * Details of the convenience users.
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
        @NameInMap("Email")
        private String email;

        @NameInMap("EndUserId")
        @Validation(required = true)
        private String endUserId;

        @NameInMap("OrgId")
        private String orgId;

        @NameInMap("OwnerType")
        private String ownerType;

        @NameInMap("Password")
        private String password;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("Remark")
        private String remark;

        private Users(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.orgId = builder.orgId;
            this.ownerType = builder.ownerType;
            this.password = builder.password;
            this.phone = builder.phone;
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
            private String remark; 

            /**
             * The email address of the end user. The email address is used to receive notifications about events such as desktop assignment. You must specify an email address or a mobile number to receive notifications.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The name of the end user. The name must be 3 to 24 characters in length, and can contain lowercase letters, digits, and underscores (\_).
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The organization to which the end user belongs.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * The type of the account ownership.
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * The password of the end user.
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
             * The remarks of the end user.
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

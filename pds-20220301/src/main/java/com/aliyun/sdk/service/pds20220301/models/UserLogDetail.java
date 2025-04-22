// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link UserLogDetail} extends {@link TeaModel}
 *
 * <p>UserLogDetail</p>
 */
public class UserLogDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("expired_at")
    private Long expiredAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("role_id")
    private String roleId;

    @com.aliyun.core.annotation.NameInMap("update_to")
    private UpdateTo updateTo;

    private UserLogDetail(Builder builder) {
        this.email = builder.email;
        this.expiredAt = builder.expiredAt;
        this.name = builder.name;
        this.phone = builder.phone;
        this.roleId = builder.roleId;
        this.updateTo = builder.updateTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserLogDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return expiredAt
     */
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return updateTo
     */
    public UpdateTo getUpdateTo() {
        return this.updateTo;
    }

    public static final class Builder {
        private String email; 
        private Long expiredAt; 
        private String name; 
        private String phone; 
        private String roleId; 
        private UpdateTo updateTo; 

        private Builder() {
        } 

        private Builder(UserLogDetail model) {
            this.email = model.email;
            this.expiredAt = model.expiredAt;
            this.name = model.name;
            this.phone = model.phone;
            this.roleId = model.roleId;
            this.updateTo = model.updateTo;
        } 

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * expired_at.
         */
        public Builder expiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * role_id.
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * update_to.
         */
        public Builder updateTo(UpdateTo updateTo) {
            this.updateTo = updateTo;
            return this;
        }

        public UserLogDetail build() {
            return new UserLogDetail(this);
        } 

    } 

    /**
     * 
     * {@link UserLogDetail} extends {@link TeaModel}
     *
     * <p>UserLogDetail</p>
     */
    public static class UpdateTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("expired_at")
        private Long expiredAt;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("role_id")
        private String roleId;

        private UpdateTo(Builder builder) {
            this.email = builder.email;
            this.expiredAt = builder.expiredAt;
            this.name = builder.name;
            this.phone = builder.phone;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateTo create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return expiredAt
         */
        public Long getExpiredAt() {
            return this.expiredAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private String email; 
            private Long expiredAt; 
            private String name; 
            private String phone; 
            private String roleId; 

            private Builder() {
            } 

            private Builder(UpdateTo model) {
                this.email = model.email;
                this.expiredAt = model.expiredAt;
                this.name = model.name;
                this.phone = model.phone;
                this.roleId = model.roleId;
            } 

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * expired_at.
             */
            public Builder expiredAt(Long expiredAt) {
                this.expiredAt = expiredAt;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * role_id.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            public UpdateTo build() {
                return new UpdateTo(this);
            } 

        } 

    }
}

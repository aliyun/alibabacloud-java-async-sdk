// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListAuthRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthRolesResponseBody</p>
 */
public class ListAuthRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<Roles> roles;

    private ListAuthRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roles
     */
    public java.util.List<Roles> getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Roles> roles; 

        private Builder() {
        } 

        private Builder(ListAuthRolesResponseBody model) {
            this.requestId = model.requestId;
            this.roles = model.roles;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Roles.
         */
        public Builder roles(java.util.List<Roles> roles) {
            this.roles = roles;
            return this;
        }

        public ListAuthRolesResponseBody build() {
            return new ListAuthRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthRolesResponseBody</p>
     */
    public static class Token extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private Token(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.expiration = builder.expiration;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String expiration; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(Token model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.expiration = model.expiration;
                this.securityToken = model.securityToken;
            } 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthRolesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private String isEnabled;

        @com.aliyun.core.annotation.NameInMap("RoleARN")
        private String roleARN;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("Token")
        private Token token;

        private Roles(Builder builder) {
            this.isEnabled = builder.isEnabled;
            this.roleARN = builder.roleARN;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return isEnabled
         */
        public String getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return roleARN
         */
        public String getRoleARN() {
            return this.roleARN;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return token
         */
        public Token getToken() {
            return this.token;
        }

        public static final class Builder {
            private String isEnabled; 
            private String roleARN; 
            private String roleName; 
            private String roleType; 
            private Token token; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.isEnabled = model.isEnabled;
                this.roleARN = model.roleARN;
                this.roleName = model.roleName;
                this.roleType = model.roleType;
                this.token = model.token;
            } 

            /**
             * IsEnabled.
             */
            public Builder isEnabled(String isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * RoleARN.
             */
            public Builder roleARN(String roleARN) {
                this.roleARN = roleARN;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(Token token) {
                this.token = token;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link CredentialConfig} extends {@link TeaModel}
 *
 * <p>CredentialConfig</p>
 */
public class CredentialConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunEnvRoleKey")
    private String aliyunEnvRoleKey;

    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    private CredentialConfig(Builder builder) {
        this.aliyunEnvRoleKey = builder.aliyunEnvRoleKey;
        this.configs = builder.configs;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialConfig create() {
        return builder().build();
    }

    /**
     * @return aliyunEnvRoleKey
     */
    public String getAliyunEnvRoleKey() {
        return this.aliyunEnvRoleKey;
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder {
        private String aliyunEnvRoleKey; 
        private java.util.List<Configs> configs; 
        private Boolean enable; 

        /**
         * AliyunEnvRoleKey.
         */
        public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public CredentialConfig build() {
            return new CredentialConfig(this);
        } 

    } 

    /**
     * 
     * {@link CredentialConfig} extends {@link TeaModel}
     *
     * <p>CredentialConfig</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.id = builder.id;
            this.securityToken = builder.securityToken;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String id; 
            private String securityToken; 
            private String type; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CredentialConfig} extends {@link TeaModel}
     *
     * <p>CredentialConfig</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        private Roles(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.policy = builder.policy;
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String policy; 
            private String roleArn; 
            private String roleType; 
            private UserInfo userInfo; 

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123******:role/****</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link CredentialConfig} extends {@link TeaModel}
     *
     * <p>CredentialConfig</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Configs(Builder builder) {
            this.key = builder.key;
            this.roles = builder.roles;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Roles> roles; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Role</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}

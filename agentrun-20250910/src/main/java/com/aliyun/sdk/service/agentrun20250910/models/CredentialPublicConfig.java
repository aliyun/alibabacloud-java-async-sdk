// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CredentialPublicConfig} extends {@link TeaModel}
 *
 * <p>CredentialPublicConfig</p>
 */
public class CredentialPublicConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private java.util.Map<String, String> authConfig;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("headerKey")
    private String headerKey;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("remoteConfig")
    private RemoteConfig remoteConfig;

    @com.aliyun.core.annotation.NameInMap("users")
    private java.util.List<Users> users;

    private CredentialPublicConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.authType = builder.authType;
        this.headerKey = builder.headerKey;
        this.provider = builder.provider;
        this.remoteConfig = builder.remoteConfig;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialPublicConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public java.util.Map<String, String> getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return headerKey
     */
    public String getHeaderKey() {
        return this.headerKey;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return remoteConfig
     */
    public RemoteConfig getRemoteConfig() {
        return this.remoteConfig;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private java.util.Map<String, String> authConfig; 
        private String authType; 
        private String headerKey; 
        private String provider; 
        private RemoteConfig remoteConfig; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(CredentialPublicConfig model) {
            this.authConfig = model.authConfig;
            this.authType = model.authType;
            this.headerKey = model.headerKey;
            this.provider = model.provider;
            this.remoteConfig = model.remoteConfig;
            this.users = model.users;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(java.util.Map<String, String> authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * headerKey.
         */
        public Builder headerKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * remoteConfig.
         */
        public Builder remoteConfig(RemoteConfig remoteConfig) {
            this.remoteConfig = remoteConfig;
            return this;
        }

        /**
         * users.
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public CredentialPublicConfig build() {
            return new CredentialPublicConfig(this);
        } 

    } 

    /**
     * 
     * {@link CredentialPublicConfig} extends {@link TeaModel}
     *
     * <p>CredentialPublicConfig</p>
     */
    public static class RemoteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("uri")
        private String uri;

        private RemoteConfig(Builder builder) {
            this.timeout = builder.timeout;
            this.ttl = builder.ttl;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteConfig create() {
            return builder().build();
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Integer timeout; 
            private Integer ttl; 
            private String uri; 

            private Builder() {
            } 

            private Builder(RemoteConfig model) {
                this.timeout = model.timeout;
                this.ttl = model.ttl;
                this.uri = model.uri;
            } 

            /**
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public RemoteConfig build() {
                return new RemoteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CredentialPublicConfig} extends {@link TeaModel}
     *
     * <p>CredentialPublicConfig</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Users(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String username; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * username.
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

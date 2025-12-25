// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link MigrationSource} extends {@link TeaModel}
 *
 * <p>MigrationSource</p>
 */
public class MigrationSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authInfo")
    private AuthInfo authInfo;

    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private Endpoint endpoint;

    private MigrationSource(Builder builder) {
        this.authInfo = builder.authInfo;
        this.database = builder.database;
        this.endpoint = builder.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrationSource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authInfo
     */
    public AuthInfo getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return endpoint
     */
    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    public static final class Builder {
        private AuthInfo authInfo; 
        private String database; 
        private Endpoint endpoint; 

        private Builder() {
        } 

        private Builder(MigrationSource model) {
            this.authInfo = model.authInfo;
            this.database = model.database;
            this.endpoint = model.endpoint;
        } 

        /**
         * authInfo.
         */
        public Builder authInfo(AuthInfo authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public MigrationSource build() {
            return new MigrationSource(this);
        } 

    } 

    /**
     * 
     * {@link MigrationSource} extends {@link TeaModel}
     *
     * <p>MigrationSource</p>
     */
    public static class AuthInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private AuthInfo(Builder builder) {
            this.authType = builder.authType;
            this.password = builder.password;
            this.token = builder.token;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthInfo create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String authType; 
            private String password; 
            private String token; 
            private String username; 

            private Builder() {
            } 

            private Builder(AuthInfo model) {
                this.authType = model.authType;
                this.password = model.password;
                this.token = model.token;
                this.username = model.username;
            } 

            /**
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AuthInfo build() {
                return new AuthInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link MigrationSource} extends {@link TeaModel}
     *
     * <p>MigrationSource</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        private Endpoint(Builder builder) {
            this.endpoint = builder.endpoint;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String endpoint; 
            private String port; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.endpoint = model.endpoint;
                this.port = model.port;
            } 

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
}

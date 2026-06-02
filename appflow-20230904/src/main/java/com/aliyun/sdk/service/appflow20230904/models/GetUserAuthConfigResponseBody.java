// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link GetUserAuthConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserAuthConfigResponseBody</p>
 */
public class GetUserAuthConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserAuthConfig")
    private UserAuthConfig userAuthConfig;

    private GetUserAuthConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userAuthConfig = builder.userAuthConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserAuthConfigResponseBody create() {
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
     * @return userAuthConfig
     */
    public UserAuthConfig getUserAuthConfig() {
        return this.userAuthConfig;
    }

    public static final class Builder {
        private String requestId; 
        private UserAuthConfig userAuthConfig; 

        private Builder() {
        } 

        private Builder(GetUserAuthConfigResponseBody model) {
            this.requestId = model.requestId;
            this.userAuthConfig = model.userAuthConfig;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>458CB9FE-8C71-58A8-AD49-97EF28D58FAB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserAuthConfig.
         */
        public Builder userAuthConfig(UserAuthConfig userAuthConfig) {
            this.userAuthConfig = userAuthConfig;
            return this;
        }

        public GetUserAuthConfigResponseBody build() {
            return new GetUserAuthConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserAuthConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserAuthConfigResponseBody</p>
     */
    public static class UserAuthConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConfig")
        private String authConfig;

        @com.aliyun.core.annotation.NameInMap("AuthConfigId")
        private String authConfigId;

        @com.aliyun.core.annotation.NameInMap("AuthConfigName")
        private String authConfigName;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
        private String connectorVersion;

        private UserAuthConfig(Builder builder) {
            this.authConfig = builder.authConfig;
            this.authConfigId = builder.authConfigId;
            this.authConfigName = builder.authConfigName;
            this.authType = builder.authType;
            this.connectorId = builder.connectorId;
            this.connectorVersion = builder.connectorVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAuthConfig create() {
            return builder().build();
        }

        /**
         * @return authConfig
         */
        public String getAuthConfig() {
            return this.authConfig;
        }

        /**
         * @return authConfigId
         */
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        /**
         * @return authConfigName
         */
        public String getAuthConfigName() {
            return this.authConfigName;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorVersion
         */
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        public static final class Builder {
            private String authConfig; 
            private String authConfigId; 
            private String authConfigName; 
            private String authType; 
            private String connectorId; 
            private String connectorVersion; 

            private Builder() {
            } 

            private Builder(UserAuthConfig model) {
                this.authConfig = model.authConfig;
                this.authConfigId = model.authConfigId;
                this.authConfigName = model.authConfigName;
                this.authType = model.authType;
                this.connectorId = model.connectorId;
                this.connectorVersion = model.connectorVersion;
            } 

            /**
             * AuthConfig.
             */
            public Builder authConfig(String authConfig) {
                this.authConfig = authConfig;
                return this;
            }

            /**
             * AuthConfigId.
             */
            public Builder authConfigId(String authConfigId) {
                this.authConfigId = authConfigId;
                return this;
            }

            /**
             * AuthConfigName.
             */
            public Builder authConfigName(String authConfigName) {
                this.authConfigName = authConfigName;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * ConnectorId.
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * ConnectorVersion.
             */
            public Builder connectorVersion(String connectorVersion) {
                this.connectorVersion = connectorVersion;
                return this;
            }

            public UserAuthConfig build() {
                return new UserAuthConfig(this);
            } 

        } 

    }
}

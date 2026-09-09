// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link ConnectorAuthentication} extends {@link TeaModel}
 *
 * <p>ConnectorAuthentication</p>
 */
public class ConnectorAuthentication extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basic")
    private Basic basic;

    @com.aliyun.core.annotation.NameInMap("botToken")
    private BotToken botToken;

    @com.aliyun.core.annotation.NameInMap("oauth")
    private Oauth oauth;

    @com.aliyun.core.annotation.NameInMap("role")
    private Role role;

    @com.aliyun.core.annotation.NameInMap("satellite")
    private Satellite satellite;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ConnectorAuthentication(Builder builder) {
        this.basic = builder.basic;
        this.botToken = builder.botToken;
        this.oauth = builder.oauth;
        this.role = builder.role;
        this.satellite = builder.satellite;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorAuthentication create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basic
     */
    public Basic getBasic() {
        return this.basic;
    }

    /**
     * @return botToken
     */
    public BotToken getBotToken() {
        return this.botToken;
    }

    /**
     * @return oauth
     */
    public Oauth getOauth() {
        return this.oauth;
    }

    /**
     * @return role
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * @return satellite
     */
    public Satellite getSatellite() {
        return this.satellite;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Basic basic; 
        private BotToken botToken; 
        private Oauth oauth; 
        private Role role; 
        private Satellite satellite; 
        private String type; 

        private Builder() {
        } 

        private Builder(ConnectorAuthentication model) {
            this.basic = model.basic;
            this.botToken = model.botToken;
            this.oauth = model.oauth;
            this.role = model.role;
            this.satellite = model.satellite;
            this.type = model.type;
        } 

        /**
         * <p>The security identity information for basic authentication, excluding the password.</p>
         */
        public Builder basic(Basic basic) {
            this.basic = basic;
            return this;
        }

        /**
         * <p>The security identity information for the bot, excluding the token and signing key.</p>
         */
        public Builder botToken(BotToken botToken) {
            this.botToken = botToken;
            return this;
        }

        /**
         * <p>The security identity information for OAuth, excluding the client secret.</p>
         */
        public Builder oauth(Oauth oauth) {
            this.oauth = oauth;
            return this;
        }

        /**
         * <p>The security identity information based on the RAM role ARN.</p>
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The security identity information based on local credential binding.</p>
         */
        public Builder satellite(Satellite satellite) {
            this.satellite = satellite;
            return this;
        }

        /**
         * <p>Authentication type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ConnectorAuthentication build() {
            return new ConnectorAuthentication(this);
        } 

    } 

    /**
     * 
     * {@link ConnectorAuthentication} extends {@link TeaModel}
     *
     * <p>ConnectorAuthentication</p>
     */
    public static class Basic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("username")
        @com.aliyun.core.annotation.Validation(required = true)
        private String username;

        private Basic(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Basic create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            private Builder() {
            } 

            private Builder(Basic model) {
                this.username = model.username;
            } 

            /**
             * <p>Username</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>starops</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Basic build() {
                return new Basic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthentication} extends {@link TeaModel}
     *
     * <p>ConnectorAuthentication</p>
     */
    public static class BotToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("botId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String botId;

        private BotToken(Builder builder) {
            this.botId = builder.botId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BotToken create() {
            return builder().build();
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        public static final class Builder {
            private String botId; 

            private Builder() {
            } 

            private Builder(BotToken model) {
                this.botId = model.botId;
            } 

            /**
             * <p>Bot ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>bot-123456</p>
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            public BotToken build() {
                return new BotToken(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthentication} extends {@link TeaModel}
     *
     * <p>ConnectorAuthentication</p>
     */
    public static class Oauth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientId;

        private Oauth(Builder builder) {
            this.clientId = builder.clientId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oauth create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        public static final class Builder {
            private String clientId; 

            private Builder() {
            } 

            private Builder(Oauth model) {
                this.clientId = model.clientId;
            } 

            /**
             * <p>OAuth client ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>client-id</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            public Oauth build() {
                return new Oauth(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthentication} extends {@link TeaModel}
     *
     * <p>ConnectorAuthentication</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roleArn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleArn;

        private Role(Builder builder) {
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String roleArn; 

            private Builder() {
            } 

            private Builder(Role model) {
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>Role ARN</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1234567890123456:role/starops-reader</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthentication} extends {@link TeaModel}
     *
     * <p>ConnectorAuthentication</p>
     */
    public static class Satellite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bindingName;

        private Satellite(Builder builder) {
            this.bindingName = builder.bindingName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Satellite create() {
            return builder().build();
        }

        /**
         * @return bindingName
         */
        public String getBindingName() {
            return this.bindingName;
        }

        public static final class Builder {
            private String bindingName; 

            private Builder() {
            } 

            private Builder(Satellite model) {
                this.bindingName = model.bindingName;
            } 

            /**
             * <p>Local credential binding name</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>private-gitlab</p>
             */
            public Builder bindingName(String bindingName) {
                this.bindingName = bindingName;
                return this;
            }

            public Satellite build() {
                return new Satellite(this);
            } 

        } 

    }
}

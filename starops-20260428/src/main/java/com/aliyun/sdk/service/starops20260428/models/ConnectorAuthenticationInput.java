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
 * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
 *
 * <p>ConnectorAuthenticationInput</p>
 */
public class ConnectorAuthenticationInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("basic")
    private Basic basic;

    @com.aliyun.core.annotation.NameInMap("botToken")
    private BotToken botToken;

    @com.aliyun.core.annotation.NameInMap("oauth")
    private Oauth oauth;

    @com.aliyun.core.annotation.NameInMap("patToken")
    private PatToken patToken;

    @com.aliyun.core.annotation.NameInMap("role")
    private Role role;

    @com.aliyun.core.annotation.NameInMap("satellite")
    private Satellite satellite;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ConnectorAuthenticationInput(Builder builder) {
        this.basic = builder.basic;
        this.botToken = builder.botToken;
        this.oauth = builder.oauth;
        this.patToken = builder.patToken;
        this.role = builder.role;
        this.satellite = builder.satellite;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorAuthenticationInput create() {
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
     * @return patToken
     */
    public PatToken getPatToken() {
        return this.patToken;
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
        private PatToken patToken; 
        private Role role; 
        private Satellite satellite; 
        private String type; 

        private Builder() {
        } 

        private Builder(ConnectorAuthenticationInput model) {
            this.basic = model.basic;
            this.botToken = model.botToken;
            this.oauth = model.oauth;
            this.patToken = model.patToken;
            this.role = model.role;
            this.satellite = model.satellite;
            this.type = model.type;
        } 

        /**
         * <p>Authenticates by using a username and password.</p>
         */
        public Builder basic(Basic basic) {
            this.basic = basic;
            return this;
        }

        /**
         * <p>Authenticates by using a bot token and a signing key.</p>
         */
        public Builder botToken(BotToken botToken) {
            this.botToken = botToken;
            return this;
        }

        /**
         * <p>Authenticates by using an OAuth client identity.</p>
         */
        public Builder oauth(Oauth oauth) {
            this.oauth = oauth;
            return this;
        }

        /**
         * <p>Authenticates by using a personal access token.</p>
         */
        public Builder patToken(PatToken patToken) {
            this.patToken = patToken;
            return this;
        }

        /**
         * <p>Authenticates by using a RAM role ARN.</p>
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        /**
         * <p>Authenticates by using local credential binding.</p>
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
         * <p>ALIYUN_RESOURCE</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ConnectorAuthenticationInput build() {
            return new ConnectorAuthenticationInput(this);
        } 

    } 

    /**
     * 
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class Basic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("password")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 16384, minLength = 1)
        private String password;

        @com.aliyun.core.annotation.NameInMap("username")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
        private String username;

        private Basic(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Basic create() {
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

            private Builder(Basic model) {
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * <p>Password</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
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
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class BotToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("botToken")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 16384, minLength = 1)
        private String botToken;

        @com.aliyun.core.annotation.NameInMap("signingSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 16384)
        private String signingSecret;

        private BotToken(Builder builder) {
            this.botToken = builder.botToken;
            this.signingSecret = builder.signingSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BotToken create() {
            return builder().build();
        }

        /**
         * @return botToken
         */
        public String getBotToken() {
            return this.botToken;
        }

        /**
         * @return signingSecret
         */
        public String getSigningSecret() {
            return this.signingSecret;
        }

        public static final class Builder {
            private String botToken; 
            private String signingSecret; 

            private Builder() {
            } 

            private Builder(BotToken model) {
                this.botToken = model.botToken;
                this.signingSecret = model.signingSecret;
            } 

            /**
             * <p>Bot token</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bot-token</p>
             */
            public Builder botToken(String botToken) {
                this.botToken = botToken;
                return this;
            }

            /**
             * <p>Signing secret</p>
             * 
             * <strong>example:</strong>
             * <p>example-signing-secret</p>
             */
            public Builder signingSecret(String signingSecret) {
                this.signingSecret = signingSecret;
                return this;
            }

            public BotToken build() {
                return new BotToken(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class Oauth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("clientSecret")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048, minLength = 8)
        private String clientSecret;

        private Oauth(Builder builder) {
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
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

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String clientId; 
            private String clientSecret; 

            private Builder() {
            } 

            private Builder(Oauth model) {
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
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

            /**
             * <p>OAuth client secret</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-client-secret</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public Oauth build() {
                return new Oauth(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class PatToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("patToken")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 16384, minLength = 1)
        private String patToken;

        private PatToken(Builder builder) {
            this.patToken = builder.patToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatToken create() {
            return builder().build();
        }

        /**
         * @return patToken
         */
        public String getPatToken() {
            return this.patToken;
        }

        public static final class Builder {
            private String patToken; 

            private Builder() {
            } 

            private Builder(PatToken model) {
                this.patToken = model.patToken;
            } 

            /**
             * <p>The personal access token used to access the target service.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-personal-access-token</p>
             */
            public Builder patToken(String patToken) {
                this.patToken = patToken;
                return this;
            }

            public PatToken build() {
                return new PatToken(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roleArn")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048, minLength = 1)
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
     * {@link ConnectorAuthenticationInput} extends {@link TeaModel}
     *
     * <p>ConnectorAuthenticationInput</p>
     */
    public static class Satellite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindingName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
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

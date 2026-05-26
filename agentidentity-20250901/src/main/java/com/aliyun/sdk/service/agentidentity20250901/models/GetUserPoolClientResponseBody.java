// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetUserPoolClientResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserPoolClientResponseBody</p>
 */
public class GetUserPoolClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Client")
    private Client client;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserPoolClientResponseBody(Builder builder) {
        this.client = builder.client;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPoolClientResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return client
     */
    public Client getClient() {
        return this.client;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Client client; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserPoolClientResponseBody model) {
            this.client = model.client;
            this.requestId = model.requestId;
        } 

        /**
         * Client.
         */
        public Builder client(Client client) {
            this.client = client;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserPoolClientResponseBody build() {
            return new GetUserPoolClientResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserPoolClientResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserPoolClientResponseBody</p>
     */
    public static class ClientScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ScopeName")
        private String scopeName;

        private ClientScopes(Builder builder) {
            this.description = builder.description;
            this.scopeName = builder.scopeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientScopes create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return scopeName
         */
        public String getScopeName() {
            return this.scopeName;
        }

        public static final class Builder {
            private String description; 
            private String scopeName; 

            private Builder() {
            } 

            private Builder(ClientScopes model) {
                this.description = model.description;
                this.scopeName = model.scopeName;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ScopeName.
             */
            public Builder scopeName(String scopeName) {
                this.scopeName = scopeName;
                return this;
            }

            public ClientScopes build() {
                return new ClientScopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserPoolClientResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserPoolClientResponseBody</p>
     */
    public static class Client extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
        private String accessTokenValidity;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientScopes")
        private java.util.List<ClientScopes> clientScopes;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnforcePKCE")
        private Boolean enforcePKCE;

        @com.aliyun.core.annotation.NameInMap("RedirectURIs")
        private java.util.List<String> redirectURIs;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenValidity")
        private String refreshTokenValidity;

        @com.aliyun.core.annotation.NameInMap("SecretRequired")
        private Boolean secretRequired;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserPoolName")
        private String userPoolName;

        private Client(Builder builder) {
            this.accessTokenValidity = builder.accessTokenValidity;
            this.clientId = builder.clientId;
            this.clientName = builder.clientName;
            this.clientScopes = builder.clientScopes;
            this.createTime = builder.createTime;
            this.enforcePKCE = builder.enforcePKCE;
            this.redirectURIs = builder.redirectURIs;
            this.refreshTokenValidity = builder.refreshTokenValidity;
            this.secretRequired = builder.secretRequired;
            this.updateTime = builder.updateTime;
            this.userPoolName = builder.userPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Client create() {
            return builder().build();
        }

        /**
         * @return accessTokenValidity
         */
        public String getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientScopes
         */
        public java.util.List<ClientScopes> getClientScopes() {
            return this.clientScopes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enforcePKCE
         */
        public Boolean getEnforcePKCE() {
            return this.enforcePKCE;
        }

        /**
         * @return redirectURIs
         */
        public java.util.List<String> getRedirectURIs() {
            return this.redirectURIs;
        }

        /**
         * @return refreshTokenValidity
         */
        public String getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        /**
         * @return secretRequired
         */
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userPoolName
         */
        public String getUserPoolName() {
            return this.userPoolName;
        }

        public static final class Builder {
            private String accessTokenValidity; 
            private String clientId; 
            private String clientName; 
            private java.util.List<ClientScopes> clientScopes; 
            private String createTime; 
            private Boolean enforcePKCE; 
            private java.util.List<String> redirectURIs; 
            private String refreshTokenValidity; 
            private Boolean secretRequired; 
            private String updateTime; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(Client model) {
                this.accessTokenValidity = model.accessTokenValidity;
                this.clientId = model.clientId;
                this.clientName = model.clientName;
                this.clientScopes = model.clientScopes;
                this.createTime = model.createTime;
                this.enforcePKCE = model.enforcePKCE;
                this.redirectURIs = model.redirectURIs;
                this.refreshTokenValidity = model.refreshTokenValidity;
                this.secretRequired = model.secretRequired;
                this.updateTime = model.updateTime;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * AccessTokenValidity.
             */
            public Builder accessTokenValidity(String accessTokenValidity) {
                this.accessTokenValidity = accessTokenValidity;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * ClientScopes.
             */
            public Builder clientScopes(java.util.List<ClientScopes> clientScopes) {
                this.clientScopes = clientScopes;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnforcePKCE.
             */
            public Builder enforcePKCE(Boolean enforcePKCE) {
                this.enforcePKCE = enforcePKCE;
                return this;
            }

            /**
             * RedirectURIs.
             */
            public Builder redirectURIs(java.util.List<String> redirectURIs) {
                this.redirectURIs = redirectURIs;
                return this;
            }

            /**
             * RefreshTokenValidity.
             */
            public Builder refreshTokenValidity(String refreshTokenValidity) {
                this.refreshTokenValidity = refreshTokenValidity;
                return this;
            }

            /**
             * SecretRequired.
             */
            public Builder secretRequired(Boolean secretRequired) {
                this.secretRequired = secretRequired;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserPoolName.
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public Client build() {
                return new Client(this);
            } 

        } 

    }
}

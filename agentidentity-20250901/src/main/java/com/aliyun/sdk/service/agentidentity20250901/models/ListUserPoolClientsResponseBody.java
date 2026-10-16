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
 * {@link ListUserPoolClientsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPoolClientsResponseBody</p>
 */
public class ListUserPoolClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private java.util.List<Clients> clients;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListUserPoolClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPoolClientsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clients
     */
    public java.util.List<Clients> getClients() {
        return this.clients;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Clients> clients; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListUserPoolClientsResponseBody model) {
            this.clients = model.clients;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of clients.</p>
         */
        public Builder clients(java.util.List<Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of results. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdENsaWVudHM6OjIw</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of clients that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserPoolClientsResponseBody build() {
            return new ListUserPoolClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserPoolClientsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPoolClientsResponseBody</p>
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
             * <p>The description of the scope.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenID Connect identifier scope</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the scope.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
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
     * {@link ListUserPoolClientsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPoolClientsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
        private String accessTokenValidity;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientScopes")
        private java.util.List<ClientScopes> clientScopes;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

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

        private Clients(Builder builder) {
            this.accessTokenValidity = builder.accessTokenValidity;
            this.clientId = builder.clientId;
            this.clientName = builder.clientName;
            this.clientScopes = builder.clientScopes;
            this.clientType = builder.clientType;
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

        public static Clients create() {
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
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
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
            private String clientType; 
            private String createTime; 
            private Boolean enforcePKCE; 
            private java.util.List<String> redirectURIs; 
            private String refreshTokenValidity; 
            private Boolean secretRequired; 
            private String updateTime; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(Clients model) {
                this.accessTokenValidity = model.accessTokenValidity;
                this.clientId = model.clientId;
                this.clientName = model.clientName;
                this.clientScopes = model.clientScopes;
                this.clientType = model.clientType;
                this.createTime = model.createTime;
                this.enforcePKCE = model.enforcePKCE;
                this.redirectURIs = model.redirectURIs;
                this.refreshTokenValidity = model.refreshTokenValidity;
                this.secretRequired = model.secretRequired;
                this.updateTime = model.updateTime;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * <p>The validity period of the access token, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder accessTokenValidity(String accessTokenValidity) {
                this.accessTokenValidity = accessTokenValidity;
                return this;
            }

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>client-xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-web-app</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>The list of default scopes for the client.</p>
             */
            public Builder clientScopes(java.util.List<ClientScopes> clientScopes) {
                this.clientScopes = clientScopes;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The time when the client was created, in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether PKCE is enforced.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enforcePKCE(Boolean enforcePKCE) {
                this.enforcePKCE = enforcePKCE;
                return this;
            }

            /**
             * <p>The list of OAuth redirect URIs.</p>
             */
            public Builder redirectURIs(java.util.List<String> redirectURIs) {
                this.redirectURIs = redirectURIs;
                return this;
            }

            /**
             * <p>The validity period of the refresh token, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder refreshTokenValidity(String refreshTokenValidity) {
                this.refreshTokenValidity = refreshTokenValidity;
                return this;
            }

            /**
             * <p>Indicates whether a client secret is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder secretRequired(Boolean secretRequired) {
                this.secretRequired = secretRequired;
                return this;
            }

            /**
             * <p>The time when the client was updated, in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The name of the user pool.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-userpool</p>
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}

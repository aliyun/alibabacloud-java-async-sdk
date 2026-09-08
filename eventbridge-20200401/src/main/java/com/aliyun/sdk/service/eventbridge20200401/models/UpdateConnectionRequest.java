// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectionRequest</p>
 */
public class UpdateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthParameters")
    private AuthParameters authParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private NetworkParameters networkParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Object parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateConnectionRequest(Builder builder) {
        super(builder);
        this.authParameters = builder.authParameters;
        this.connectionName = builder.connectionName;
        this.description = builder.description;
        this.networkParameters = builder.networkParameters;
        this.parameters = builder.parameters;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authParameters
     */
    public AuthParameters getAuthParameters() {
        return this.authParameters;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return networkParameters
     */
    public NetworkParameters getNetworkParameters() {
        return this.networkParameters;
    }

    /**
     * @return parameters
     */
    public Object getParameters() {
        return this.parameters;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateConnectionRequest, Builder> {
        private AuthParameters authParameters; 
        private String connectionName; 
        private String description; 
        private NetworkParameters networkParameters; 
        private Object parameters; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectionRequest request) {
            super(request);
            this.authParameters = request.authParameters;
            this.connectionName = request.connectionName;
            this.description = request.description;
            this.networkParameters = request.networkParameters;
            this.parameters = request.parameters;
            this.type = request.type;
        } 

        /**
         * <p>The authentication data structure.</p>
         */
        public Builder authParameters(AuthParameters authParameters) {
            String authParametersShrink = shrink(authParameters, "AuthParameters", "json");
            this.putQueryParameter("AuthParameters", authParametersShrink);
            this.authParameters = authParameters;
            return this;
        }

        /**
         * <p>The name of the connection to update. Maximum length: 127 characters. Minimum length: 2 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The description. Maximum length: 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the connection configuration</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The data structure of the network configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkParameters(NetworkParameters networkParameters) {
            String networkParametersShrink = shrink(networkParameters, "NetworkParameters", "json");
            this.putQueryParameter("NetworkParameters", networkParametersShrink);
            this.networkParameters = networkParameters;
            return this;
        }

        /**
         * <p>The data source connection parameters (JSON object). For specific field definitions, call the GetConnectionType operation and refer to ParamsSchema in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
         */
        public Builder parameters(Object parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, Iceberg, lakehouse, Http.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateConnectionRequest build() {
            return new UpdateConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class ApiKeyAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyName")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String apiKeyName;

        @com.aliyun.core.annotation.NameInMap("ApiKeyValue")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String apiKeyValue;

        private ApiKeyAuthParameters(Builder builder) {
            this.apiKeyName = builder.apiKeyName;
            this.apiKeyValue = builder.apiKeyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeyAuthParameters create() {
            return builder().build();
        }

        /**
         * @return apiKeyName
         */
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public static final class Builder {
            private String apiKeyName; 
            private String apiKeyValue; 

            private Builder() {
            } 

            private Builder(ApiKeyAuthParameters model) {
                this.apiKeyName = model.apiKeyName;
                this.apiKeyValue = model.apiKeyValue;
            } 

            /**
             * <p>The key of the API Key.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * <p>The value of the API Key.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            public ApiKeyAuthParameters build() {
                return new ApiKeyAuthParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class BasicAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String password;

        @com.aliyun.core.annotation.NameInMap("Username")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String username;

        private BasicAuthParameters(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicAuthParameters create() {
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

            private Builder(BasicAuthParameters model) {
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * <p>The password for Basic authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The username for Basic authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public BasicAuthParameters build() {
                return new BasicAuthParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class ClientParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientID")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String clientID;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String clientSecret;

        private ClientParameters(Builder builder) {
            this.clientID = builder.clientID;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientParameters create() {
            return builder().build();
        }

        /**
         * @return clientID
         */
        public String getClientID() {
            return this.clientID;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String clientID; 
            private String clientSecret; 

            private Builder() {
            } 

            private Builder(ClientParameters model) {
                this.clientID = model.clientID;
                this.clientSecret = model.clientSecret;
            } 

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ClientID</p>
             */
            public Builder clientID(String clientID) {
                this.clientID = clientID;
                return this;
            }

            /**
             * <p>The client secret of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ClientSecret</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public ClientParameters build() {
                return new ClientParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class BodyParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsValueSecret")
        private String isValueSecret;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BodyParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String isValueSecret; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(BodyParameters model) {
                this.isValueSecret = model.isValueSecret;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Specifies whether the value is used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the body request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the body request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BodyParameters build() {
                return new BodyParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class HeaderParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsValueSecret")
        private String isValueSecret;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String isValueSecret; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(HeaderParameters model) {
                this.isValueSecret = model.isValueSecret;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Specifies whether the value is used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the header parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the header parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderParameters build() {
                return new HeaderParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class QueryStringParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsValueSecret")
        private String isValueSecret;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryStringParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String isValueSecret; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryStringParameters model) {
                this.isValueSecret = model.isValueSecret;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Specifies whether the value is used for authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the URI of the request path parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the URI of the request path parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryStringParameters build() {
                return new QueryStringParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class OAuthHttpParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyParameters")
        private java.util.List<BodyParameters> bodyParameters;

        @com.aliyun.core.annotation.NameInMap("HeaderParameters")
        private java.util.List<HeaderParameters> headerParameters;

        @com.aliyun.core.annotation.NameInMap("QueryStringParameters")
        private java.util.List<QueryStringParameters> queryStringParameters;

        private OAuthHttpParameters(Builder builder) {
            this.bodyParameters = builder.bodyParameters;
            this.headerParameters = builder.headerParameters;
            this.queryStringParameters = builder.queryStringParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthHttpParameters create() {
            return builder().build();
        }

        /**
         * @return bodyParameters
         */
        public java.util.List<BodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        /**
         * @return headerParameters
         */
        public java.util.List<HeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        /**
         * @return queryStringParameters
         */
        public java.util.List<QueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

        public static final class Builder {
            private java.util.List<BodyParameters> bodyParameters; 
            private java.util.List<HeaderParameters> headerParameters; 
            private java.util.List<QueryStringParameters> queryStringParameters; 

            private Builder() {
            } 

            private Builder(OAuthHttpParameters model) {
                this.bodyParameters = model.bodyParameters;
                this.headerParameters = model.headerParameters;
                this.queryStringParameters = model.queryStringParameters;
            } 

            /**
             * <p>The list of body request parameter data structures.</p>
             */
            public Builder bodyParameters(java.util.List<BodyParameters> bodyParameters) {
                this.bodyParameters = bodyParameters;
                return this;
            }

            /**
             * <p>The list of header parameter data structures.</p>
             */
            public Builder headerParameters(java.util.List<HeaderParameters> headerParameters) {
                this.headerParameters = headerParameters;
                return this;
            }

            /**
             * <p>The data structure of the URI of the request path parameters.</p>
             */
            public Builder queryStringParameters(java.util.List<QueryStringParameters> queryStringParameters) {
                this.queryStringParameters = queryStringParameters;
                return this;
            }

            public OAuthHttpParameters build() {
                return new OAuthHttpParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class OAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
        private String authorizationEndpoint;

        @com.aliyun.core.annotation.NameInMap("ClientParameters")
        private ClientParameters clientParameters;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("OAuthHttpParameters")
        private OAuthHttpParameters oAuthHttpParameters;

        private OAuthParameters(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.clientParameters = builder.clientParameters;
            this.httpMethod = builder.httpMethod;
            this.oAuthHttpParameters = builder.oAuthHttpParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthParameters create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return clientParameters
         */
        public ClientParameters getClientParameters() {
            return this.clientParameters;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return oAuthHttpParameters
         */
        public OAuthHttpParameters getOAuthHttpParameters() {
            return this.oAuthHttpParameters;
        }

        public static final class Builder {
            private String authorizationEndpoint; 
            private ClientParameters clientParameters; 
            private String httpMethod; 
            private OAuthHttpParameters oAuthHttpParameters; 

            private Builder() {
            } 

            private Builder(OAuthParameters model) {
                this.authorizationEndpoint = model.authorizationEndpoint;
                this.clientParameters = model.clientParameters;
                this.httpMethod = model.httpMethod;
                this.oAuthHttpParameters = model.oAuthHttpParameters;
            } 

            /**
             * <p>The request URL for obtaining the OAuth token. Maximum length: 127 characters.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The data structure for client parameters.</p>
             */
            public Builder clientParameters(ClientParameters clientParameters) {
                this.clientParameters = clientParameters;
                return this;
            }

            /**
             * <p>The HTTP method for the probe request. Valid values:</p>
             * <ul>
             * <li>GET</li>
             * <li>POST</li>
             * <li>HEAD</li>
             * <li>DELETE</li>
             * <li>PUT</li>
             * <li>PATCH</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The request parameters for OAuth authentication.</p>
             */
            public Builder oAuthHttpParameters(OAuthHttpParameters oAuthHttpParameters) {
                this.oAuthHttpParameters = oAuthHttpParameters;
                return this;
            }

            public OAuthParameters build() {
                return new OAuthParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class AuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyAuthParameters")
        private ApiKeyAuthParameters apiKeyAuthParameters;

        @com.aliyun.core.annotation.NameInMap("AuthorizationType")
        private String authorizationType;

        @com.aliyun.core.annotation.NameInMap("BasicAuthParameters")
        private BasicAuthParameters basicAuthParameters;

        @com.aliyun.core.annotation.NameInMap("OAuthParameters")
        private OAuthParameters oAuthParameters;

        private AuthParameters(Builder builder) {
            this.apiKeyAuthParameters = builder.apiKeyAuthParameters;
            this.authorizationType = builder.authorizationType;
            this.basicAuthParameters = builder.basicAuthParameters;
            this.oAuthParameters = builder.oAuthParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthParameters create() {
            return builder().build();
        }

        /**
         * @return apiKeyAuthParameters
         */
        public ApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return basicAuthParameters
         */
        public BasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        /**
         * @return oAuthParameters
         */
        public OAuthParameters getOAuthParameters() {
            return this.oAuthParameters;
        }

        public static final class Builder {
            private ApiKeyAuthParameters apiKeyAuthParameters; 
            private String authorizationType; 
            private BasicAuthParameters basicAuthParameters; 
            private OAuthParameters oAuthParameters; 

            private Builder() {
            } 

            private Builder(AuthParameters model) {
                this.apiKeyAuthParameters = model.apiKeyAuthParameters;
                this.authorizationType = model.authorizationType;
                this.basicAuthParameters = model.basicAuthParameters;
                this.oAuthParameters = model.oAuthParameters;
            } 

            /**
             * <p>The data structure for API Key authentication.</p>
             */
            public Builder apiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
                this.apiKeyAuthParameters = apiKeyAuthParameters;
                return this;
            }

            /**
             * <p>The authentication type:</p>
             * <ul>
             * <li><p>BASIC: BASIC_AUTH. This authorization method is a basic authorization method implemented by browsers in compliance with the HTTP protocol. During HTTP communication, the HTTP protocol defines a basic authentication method that allows HTTP servers to verify client identities. Add Authorization: Basic Base64-encoded(<code>username:password</code>) in the request header in a fixed format. Username and Password are required.</p>
             * </li>
             * <li><p>API KEY: API_KEY_AUTH. Add Token: token value in the request header in a fixed format. ApiKeyName and ApiKeyValue are required.</p>
             * </li>
             * <li><p>OAUTH: OAUTH_AUTH. OAuth 2.0 is an authorization mechanism. Normally, without an authorization mechanism such as OAuth 2.0, clients can directly access resources on the resource server. To ensure secure data access, an Access Token mechanism is added. Clients must carry an Access Token to access protected resources. OAuth 2.0 prevents resources from being accessed by malicious clients, thereby improving system security. AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod are required.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BASIC_AUTH</p>
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * <p>The data structure for Basic authentication.</p>
             */
            public Builder basicAuthParameters(BasicAuthParameters basicAuthParameters) {
                this.basicAuthParameters = basicAuthParameters;
                return this;
            }

            /**
             * <p>The data structure for OAuth authentication parameters.</p>
             */
            public Builder oAuthParameters(OAuthParameters oAuthParameters) {
                this.oAuthParameters = oAuthParameters;
                return this;
            }

            public AuthParameters build() {
                return new AuthParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class NetworkParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitcheId")
        private String vswitcheId;

        private NetworkParameters(Builder builder) {
            this.networkType = builder.networkType;
            this.securityGroupId = builder.securityGroupId;
            this.vpcId = builder.vpcId;
            this.vswitcheId = builder.vswitcheId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkParameters create() {
            return builder().build();
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitcheId
         */
        public String getVswitcheId() {
            return this.vswitcheId;
        }

        public static final class Builder {
            private String networkType; 
            private String securityGroupId; 
            private String vpcId; 
            private String vswitcheId; 

            private Builder() {
            } 

            private Builder(NetworkParameters model) {
                this.networkType = model.networkType;
                this.securityGroupId = model.securityGroupId;
                this.vpcId = model.vpcId;
                this.vswitcheId = model.vswitcheId;
            } 

            /**
             * <ul>
             * <li><p>Public network: PublicNetwork</p>
             * </li>
             * <li><p>Virtual private cloud (VPC): PrivateNetwork</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you select PrivateNetwork, VpcId, VswitcheId, and SecurityGroupId are required.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PublicNetwork</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9rtyb</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-test/vpc-bp1symadadwnwgmqud</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1iu4x7aeradadown1og8,vsw-bp193sqmadadlaszpeqbt2c</p>
             */
            public Builder vswitcheId(String vswitcheId) {
                this.vswitcheId = vswitcheId;
                return this;
            }

            public NetworkParameters build() {
                return new NetworkParameters(this);
            } 

        } 

    }
}

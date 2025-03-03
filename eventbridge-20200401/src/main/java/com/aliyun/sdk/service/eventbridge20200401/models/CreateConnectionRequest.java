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
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
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

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.authParameters = builder.authParameters;
        this.connectionName = builder.connectionName;
        this.description = builder.description;
        this.networkParameters = builder.networkParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
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

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private AuthParameters authParameters; 
        private String connectionName; 
        private String description; 
        private NetworkParameters networkParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.authParameters = request.authParameters;
            this.connectionName = request.connectionName;
            this.description = request.description;
            this.networkParameters = request.networkParameters;
        } 

        /**
         * <p>The parameters that are configured for authentication.</p>
         */
        public Builder authParameters(AuthParameters authParameters) {
            String authParametersShrink = shrink(authParameters, "AuthParameters", "json");
            this.putQueryParameter("AuthParameters", authParametersShrink);
            this.authParameters = authParameters;
            return this;
        }

        /**
         * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
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
         * <p>The description of the connection. The description can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The parameters that are configured for the network.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkParameters(NetworkParameters networkParameters) {
            String networkParametersShrink = shrink(networkParameters, "NetworkParameters", "json");
            this.putQueryParameter("NetworkParameters", networkParametersShrink);
            this.networkParameters = networkParameters;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>The key of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>Token</p>
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * <p>The value of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>adkjnakddh****</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>The password for basic authentication.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The username for basic authentication.</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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
             * <p>The AccessKey secret of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>Qo57Q<del>F249</del>S74GmNPA36pZJoJK4f4LY****</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>Specifies whether to enable authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>keyDemo</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>keyValue</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>Specifies whether to enable authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>keyDemo</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>keyValue</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>Specifies whether to enable authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * <p>The key of the request path.</p>
             * 
             * <strong>example:</strong>
             * <p>keyDemo</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the request path.</p>
             * 
             * <strong>example:</strong>
             * <p>valueDemo</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>The parameters that are configured for the request body.</p>
             */
            public Builder bodyParameters(java.util.List<BodyParameters> bodyParameters) {
                this.bodyParameters = bodyParameters;
                return this;
            }

            /**
             * <p>The parameters that are configured for the request header.</p>
             */
            public Builder headerParameters(java.util.List<HeaderParameters> headerParameters) {
                this.headerParameters = headerParameters;
                return this;
            }

            /**
             * <p>The parameters that are configured for the request path.</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>The endpoint of the authorized client. The endpoint can be up to 127 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * <p>The parameters that are configured for the client.</p>
             */
            public Builder clientParameters(ClientParameters clientParameters) {
                this.clientParameters = clientParameters;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
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
             * <p>The request parameters of OAuth authentication.</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <p>The parameters that are configured for API key authentication.</p>
             */
            public Builder apiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
                this.apiKeyAuthParameters = apiKeyAuthParameters;
                return this;
            }

            /**
             * <p>The authentication type. Valid values:</p>
             * <ul>
             * <li>BASIC: basic authentication. Basic authentication is a simple authentication scheme built into the HTTP protocol. When you use the HTTP protocol for communications, the authentication method that the HTTP server uses to authenticate user identities on the client is defined in the protocol. The request header is in the Authorization: Basic Base64-encoded string (<code>Username:Password</code>) format. If you use this authentication method, you must configure Username and Password.</li>
             * <li>API_KEY_AUTH: API key authentication. The request header is in the Token: Token value format. If you use this authentication method, you must configure ApiKeyName and ApiKeyValue.</li>
             * <li>OAUTH_AUTH: OAuth authentication. OAuth2.0 is an authentication mechanism. In normal cases, a system that does not use OAuth2.0 can access the resources of the server from the client. To ensure access security, access tokens are used to authenticate users in OAuth 2.0. The client must use an access token to access protected resources. This way, OAuth 2.0 protects resources from being accessed from malicious clients and improves system security. If you use this authentication method, you must configure AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod.</li>
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
             * <p>The parameters that are configured for basic authentication.</p>
             */
            public Builder basicAuthParameters(BasicAuthParameters basicAuthParameters) {
                this.basicAuthParameters = basicAuthParameters;
                return this;
            }

            /**
             * <p>The parameters that are configured for OAuth authentication.</p>
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
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
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

            /**
             * <ul>
             * <li>PublicNetwork: the Internet.</li>
             * <li>PrivateNetwork: virtual private cloud (VPC).</li>
             * </ul>
             * <blockquote>
             * <p> If you set this parameter to PrivateNetwork, you must also configure VpcId, VswitchId, and SecurityGroupId.</p>
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
             * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eb-test/vpc-bp1symadadwnwg****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1iu4x7aeradadown1og8,vsw-bp193sqmadadlaszpeq****</p>
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

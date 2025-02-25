// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionResponseBody</p>
 */
public class GetConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConnectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpCode; 
        private String message; 
        private String requestId; 

        /**
         * The returned response code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConnectionResponseBody build() {
            return new GetConnectionResponseBody(this);
        } 

    } 

    public static class ApiKeyAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyName")
        private String apiKeyName;

        @com.aliyun.core.annotation.NameInMap("ApiKeyValue")
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
             * The key of the API key.
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * The value of the API key.
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
    public static class BasicAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Username")
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
             * The password of basic authentication.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The username of basic authentication.
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
    public static class ClientParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientID")
        private String clientID;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
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
             * The client ID.
             */
            public Builder clientID(String clientID) {
                this.clientID = clientID;
                return this;
            }

            /**
             * The AccessKey secret of the client.
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
             * Indicates whether authentication is enabled.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request body.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request body.
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
             * Indicates whether authentication is enabled.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request header.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request header.
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
             * Indicates whether authentication is enabled.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request path.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request path.
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
    public static class OAuthHttpParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyParameters")
        private java.util.List < BodyParameters> bodyParameters;

        @com.aliyun.core.annotation.NameInMap("HeaderParameters")
        private java.util.List < HeaderParameters> headerParameters;

        @com.aliyun.core.annotation.NameInMap("QueryStringParameters")
        private java.util.List < QueryStringParameters> queryStringParameters;

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
        public java.util.List < BodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        /**
         * @return headerParameters
         */
        public java.util.List < HeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        /**
         * @return queryStringParameters
         */
        public java.util.List < QueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

        public static final class Builder {
            private java.util.List < BodyParameters> bodyParameters; 
            private java.util.List < HeaderParameters> headerParameters; 
            private java.util.List < QueryStringParameters> queryStringParameters; 

            /**
             * The information about the request body.
             */
            public Builder bodyParameters(java.util.List < BodyParameters> bodyParameters) {
                this.bodyParameters = bodyParameters;
                return this;
            }

            /**
             * The information about the request header.
             */
            public Builder headerParameters(java.util.List < HeaderParameters> headerParameters) {
                this.headerParameters = headerParameters;
                return this;
            }

            /**
             * The information about the request path.
             */
            public Builder queryStringParameters(java.util.List < QueryStringParameters> queryStringParameters) {
                this.queryStringParameters = queryStringParameters;
                return this;
            }

            public OAuthHttpParameters build() {
                return new OAuthHttpParameters(this);
            } 

        } 

    }
    public static class OAuthParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationEndpoint")
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
             * The endpoint that is used to obtain the OAuth token.
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * The information about the client.
             */
            public Builder clientParameters(ClientParameters clientParameters) {
                this.clientParameters = clientParameters;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * *   GET
             * *   POST
             * *   HEAD
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request parameters of OAuth authentication.
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
             * The information about API key authentication.
             */
            public Builder apiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
                this.apiKeyAuthParameters = apiKeyAuthParameters;
                return this;
            }

            /**
             * The authentication method. Valid values:
             * <p>
             * 
             * *   BASIC_AUTH: basic authentication.
             * *   API_KEY_AUTH: API key authentication.
             * *   OAUTH_AUTH: OAuth authentication.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * The information about basic authentication.
             */
            public Builder basicAuthParameters(BasicAuthParameters basicAuthParameters) {
                this.basicAuthParameters = basicAuthParameters;
                return this;
            }

            /**
             * The information about OAuth authentication.
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
    public static class NetworkParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkType")
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
             * *   PublicNetwork: the Internet.
             * <p>
             * *   PrivateNetwork: virtual private cloud (VPC).
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID.
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
    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthParameters")
        private AuthParameters authParameters;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NetworkParameters")
        private NetworkParameters networkParameters;

        private Connections(Builder builder) {
            this.authParameters = builder.authParameters;
            this.connectionName = builder.connectionName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.networkParameters = builder.networkParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return networkParameters
         */
        public NetworkParameters getNetworkParameters() {
            return this.networkParameters;
        }

        public static final class Builder {
            private AuthParameters authParameters; 
            private String connectionName; 
            private String description; 
            private Long gmtCreate; 
            private Long id; 
            private NetworkParameters networkParameters; 

            /**
             * The authentication methods.
             */
            public Builder authParameters(AuthParameters authParameters) {
                this.authParameters = authParameters;
                return this;
            }

            /**
             * The connection name.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * The connection description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the connection was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The data source ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The information about the network.
             */
            public Builder networkParameters(NetworkParameters networkParameters) {
                this.networkParameters = networkParameters;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private java.util.List < Connections> connections;

        private Data(Builder builder) {
            this.connections = builder.connections;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public java.util.List < Connections> getConnections() {
            return this.connections;
        }

        public static final class Builder {
            private java.util.List < Connections> connections; 

            /**
             * The queried connections.
             */
            public Builder connections(java.util.List < Connections> connections) {
                this.connections = connections;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

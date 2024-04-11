// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayAuthRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayAuthRequest</p>
 */
public class AddGatewayAuthRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AuthResourceConfig")
    private String authResourceConfig;

    @Query
    @NameInMap("AuthResourceList")
    private java.util.List < AuthResourceList> authResourceList;

    @Query
    @NameInMap("AuthResourceMode")
    private Integer authResourceMode;

    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("ClientSecret")
    private String clientSecret;

    @Query
    @NameInMap("CookieDomain")
    private String cookieDomain;

    @Query
    @NameInMap("ExternalAuthZJSON")
    private ExternalAuthZJSON externalAuthZJSON;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("IsWhite")
    private Boolean isWhite;

    @Query
    @NameInMap("Issuer")
    private String issuer;

    @Query
    @NameInMap("Jwks")
    private String jwks;

    @Query
    @NameInMap("LoginUrl")
    private String loginUrl;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RedirectUrl")
    private String redirectUrl;

    @Query
    @NameInMap("ScopesList")
    private java.util.List < String > scopesList;

    @Query
    @NameInMap("Status")
    private Boolean status;

    @Query
    @NameInMap("Sub")
    private String sub;

    @Query
    @NameInMap("TokenName")
    private String tokenName;

    @Query
    @NameInMap("TokenNamePrefix")
    private String tokenNamePrefix;

    @Query
    @NameInMap("TokenPass")
    private Boolean tokenPass;

    @Query
    @NameInMap("TokenPosition")
    private String tokenPosition;

    @Query
    @NameInMap("Type")
    private String type;

    private AddGatewayAuthRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authResourceConfig = builder.authResourceConfig;
        this.authResourceList = builder.authResourceList;
        this.authResourceMode = builder.authResourceMode;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.cookieDomain = builder.cookieDomain;
        this.externalAuthZJSON = builder.externalAuthZJSON;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.isWhite = builder.isWhite;
        this.issuer = builder.issuer;
        this.jwks = builder.jwks;
        this.loginUrl = builder.loginUrl;
        this.name = builder.name;
        this.redirectUrl = builder.redirectUrl;
        this.scopesList = builder.scopesList;
        this.status = builder.status;
        this.sub = builder.sub;
        this.tokenName = builder.tokenName;
        this.tokenNamePrefix = builder.tokenNamePrefix;
        this.tokenPass = builder.tokenPass;
        this.tokenPosition = builder.tokenPosition;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return authResourceConfig
     */
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    /**
     * @return authResourceList
     */
    public java.util.List < AuthResourceList> getAuthResourceList() {
        return this.authResourceList;
    }

    /**
     * @return authResourceMode
     */
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
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

    /**
     * @return cookieDomain
     */
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    /**
     * @return externalAuthZJSON
     */
    public ExternalAuthZJSON getExternalAuthZJSON() {
        return this.externalAuthZJSON;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return isWhite
     */
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return jwks
     */
    public String getJwks() {
        return this.jwks;
    }

    /**
     * @return loginUrl
     */
    public String getLoginUrl() {
        return this.loginUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * @return scopesList
     */
    public java.util.List < String > getScopesList() {
        return this.scopesList;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return sub
     */
    public String getSub() {
        return this.sub;
    }

    /**
     * @return tokenName
     */
    public String getTokenName() {
        return this.tokenName;
    }

    /**
     * @return tokenNamePrefix
     */
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    /**
     * @return tokenPass
     */
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    /**
     * @return tokenPosition
     */
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddGatewayAuthRequest, Builder> {
        private String acceptLanguage; 
        private String authResourceConfig; 
        private java.util.List < AuthResourceList> authResourceList; 
        private Integer authResourceMode; 
        private String clientId; 
        private String clientSecret; 
        private String cookieDomain; 
        private ExternalAuthZJSON externalAuthZJSON; 
        private String gatewayUniqueId; 
        private Boolean isWhite; 
        private String issuer; 
        private String jwks; 
        private String loginUrl; 
        private String name; 
        private String redirectUrl; 
        private java.util.List < String > scopesList; 
        private Boolean status; 
        private String sub; 
        private String tokenName; 
        private String tokenNamePrefix; 
        private Boolean tokenPass; 
        private String tokenPosition; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayAuthRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authResourceConfig = request.authResourceConfig;
            this.authResourceList = request.authResourceList;
            this.authResourceMode = request.authResourceMode;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.cookieDomain = request.cookieDomain;
            this.externalAuthZJSON = request.externalAuthZJSON;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.isWhite = request.isWhite;
            this.issuer = request.issuer;
            this.jwks = request.jwks;
            this.loginUrl = request.loginUrl;
            this.name = request.name;
            this.redirectUrl = request.redirectUrl;
            this.scopesList = request.scopesList;
            this.status = request.status;
            this.sub = request.sub;
            this.tokenName = request.tokenName;
            this.tokenNamePrefix = request.tokenNamePrefix;
            this.tokenPass = request.tokenPass;
            this.tokenPosition = request.tokenPosition;
            this.type = request.type;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AuthResourceConfig.
         */
        public Builder authResourceConfig(String authResourceConfig) {
            this.putQueryParameter("AuthResourceConfig", authResourceConfig);
            this.authResourceConfig = authResourceConfig;
            return this;
        }

        /**
         * The information about the resource to be authorized.
         */
        public Builder authResourceList(java.util.List < AuthResourceList> authResourceList) {
            String authResourceListShrink = shrink(authResourceList, "AuthResourceList", "json");
            this.putQueryParameter("AuthResourceList", authResourceListShrink);
            this.authResourceList = authResourceList;
            return this;
        }

        /**
         * AuthResourceMode.
         */
        public Builder authResourceMode(Integer authResourceMode) {
            this.putQueryParameter("AuthResourceMode", authResourceMode);
            this.authResourceMode = authResourceMode;
            return this;
        }

        /**
         * The application ID registered with the OIDC authentication service.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The application secret registered with the OIDC authentication service.
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The domain name of the cookie. After the authentication is passed, the cookie is sent to the specified domain name to maintain the logon status. For example, if you set `Cookie-domain` to a.example.com, the cookie is sent to the domain name `a.example.com`. If you set `Cookie-domain` to .example.com, the cookie is sent to all subdomains of `example.com`.
         */
        public Builder cookieDomain(String cookieDomain) {
            this.putQueryParameter("CookieDomain", cookieDomain);
            this.cookieDomain = cookieDomain;
            return this;
        }

        /**
         * The information about the custom authentication service.
         */
        public Builder externalAuthZJSON(ExternalAuthZJSON externalAuthZJSON) {
            String externalAuthZJSONShrink = shrink(externalAuthZJSON, "ExternalAuthZJSON", "json");
            this.putQueryParameter("ExternalAuthZJSON", externalAuthZJSONShrink);
            this.externalAuthZJSON = externalAuthZJSON;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Specifies whether to enable the whitelist feature.
         */
        public Builder isWhite(Boolean isWhite) {
            this.putQueryParameter("IsWhite", isWhite);
            this.isWhite = isWhite;
            return this;
        }

        /**
         * The iss value of JWT claims, which indicates the issuer. You must make sure that the value of this parameter is the same as the iss value in the payload of JWT claims.
         */
        public Builder issuer(String issuer) {
            this.putQueryParameter("Issuer", issuer);
            this.issuer = issuer;
            return this;
        }

        /**
         * The JWT public key. The JSON format is supported.
         */
        public Builder jwks(String jwks) {
            this.putQueryParameter("Jwks", jwks);
            this.jwks = jwks;
            return this;
        }

        /**
         * The URL that is used to log on to the IDaaS instance.
         */
        public Builder loginUrl(String loginUrl) {
            this.putQueryParameter("LoginUrl", loginUrl);
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * The name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The redirect URL.
         */
        public Builder redirectUrl(String redirectUrl) {
            this.putQueryParameter("RedirectUrl", redirectUrl);
            this.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * The OIDC scope.
         */
        public Builder scopesList(java.util.List < String > scopesList) {
            String scopesListShrink = shrink(scopesList, "ScopesList", "json");
            this.putQueryParameter("ScopesList", scopesListShrink);
            this.scopesList = scopesList;
            return this;
        }

        /**
         * The status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The sub value of JWT claims, which indicates the subject. You must make sure that the value of this parameter is the same as the sub value in the payload of JWT claims. If you do not set this parameter or leave it empty, the default value, which is the value of the Issuer parameter, is used.
         */
        public Builder sub(String sub) {
            this.putQueryParameter("Sub", sub);
            this.sub = sub;
            return this;
        }

        /**
         * The name of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`.
         */
        public Builder tokenName(String tokenName) {
            this.putQueryParameter("TokenName", tokenName);
            this.tokenName = tokenName;
            return this;
        }

        /**
         * The name prefix of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`
         */
        public Builder tokenNamePrefix(String tokenNamePrefix) {
            this.putQueryParameter("TokenNamePrefix", tokenNamePrefix);
            this.tokenNamePrefix = tokenNamePrefix;
            return this;
        }

        /**
         * Specifies whether to enable pass-through.
         */
        public Builder tokenPass(Boolean tokenPass) {
            this.putQueryParameter("TokenPass", tokenPass);
            this.tokenPass = tokenPass;
            return this;
        }

        /**
         * The position of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`.
         */
        public Builder tokenPosition(String tokenPosition) {
            this.putQueryParameter("TokenPosition", tokenPosition);
            this.tokenPosition = tokenPosition;
            return this;
        }

        /**
         * The authentication type. JSON Web Token (JWT) authentication, OpenID Connect (OIDC) authentication, Identity as a Service (IDaaS) authentication, or custom authentication are supported.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddGatewayAuthRequest build() {
            return new AddGatewayAuthRequest(this);
        } 

    } 

    public static class AuthResourceHeaderList extends TeaModel {
        @NameInMap("HeaderKey")
        private String headerKey;

        @NameInMap("HeaderMethod")
        private String headerMethod;

        @NameInMap("HeaderValue")
        private String headerValue;

        private AuthResourceHeaderList(Builder builder) {
            this.headerKey = builder.headerKey;
            this.headerMethod = builder.headerMethod;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthResourceHeaderList create() {
            return builder().build();
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        /**
         * @return headerMethod
         */
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerKey; 
            private String headerMethod; 
            private String headerValue; 

            /**
             * HeaderKey.
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * HeaderMethod.
             */
            public Builder headerMethod(String headerMethod) {
                this.headerMethod = headerMethod;
                return this;
            }

            /**
             * HeaderValue.
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public AuthResourceHeaderList build() {
                return new AuthResourceHeaderList(this);
            } 

        } 

    }
    public static class AuthResourceList extends TeaModel {
        @NameInMap("AuthResourceHeaderList")
        private java.util.List < AuthResourceHeaderList> authResourceHeaderList;

        @NameInMap("DomainId")
        private Long domainId;

        @NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @NameInMap("MatchType")
        private String matchType;

        @NameInMap("Path")
        private String path;

        private AuthResourceList(Builder builder) {
            this.authResourceHeaderList = builder.authResourceHeaderList;
            this.domainId = builder.domainId;
            this.ignoreCase = builder.ignoreCase;
            this.matchType = builder.matchType;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthResourceList create() {
            return builder().build();
        }

        /**
         * @return authResourceHeaderList
         */
        public java.util.List < AuthResourceHeaderList> getAuthResourceHeaderList() {
            return this.authResourceHeaderList;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
        }

        /**
         * @return ignoreCase
         */
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List < AuthResourceHeaderList> authResourceHeaderList; 
            private Long domainId; 
            private Boolean ignoreCase; 
            private String matchType; 
            private String path; 

            /**
             * AuthResourceHeaderList.
             */
            public Builder authResourceHeaderList(java.util.List < AuthResourceHeaderList> authResourceHeaderList) {
                this.authResourceHeaderList = authResourceHeaderList;
                return this;
            }

            /**
             * The domain ID.
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * IgnoreCase.
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * The request path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public AuthResourceList build() {
                return new AuthResourceList(this);
            } 

        } 

    }
    public static class ExternalAuthZJSON extends TeaModel {
        @NameInMap("AllowRequestHeaders")
        private java.util.List < String > allowRequestHeaders;

        @NameInMap("AllowUpstreamHeaders")
        private java.util.List < String > allowUpstreamHeaders;

        @NameInMap("BodyMaxBytes")
        private Integer bodyMaxBytes;

        @NameInMap("IsRestrict")
        private Boolean isRestrict;

        @NameInMap("PrefixPath")
        private String prefixPath;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("Timeout")
        private Integer timeout;

        @NameInMap("TokenKey")
        private String tokenKey;

        @NameInMap("WithRequestBody")
        private Boolean withRequestBody;

        private ExternalAuthZJSON(Builder builder) {
            this.allowRequestHeaders = builder.allowRequestHeaders;
            this.allowUpstreamHeaders = builder.allowUpstreamHeaders;
            this.bodyMaxBytes = builder.bodyMaxBytes;
            this.isRestrict = builder.isRestrict;
            this.prefixPath = builder.prefixPath;
            this.serviceId = builder.serviceId;
            this.timeout = builder.timeout;
            this.tokenKey = builder.tokenKey;
            this.withRequestBody = builder.withRequestBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalAuthZJSON create() {
            return builder().build();
        }

        /**
         * @return allowRequestHeaders
         */
        public java.util.List < String > getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        /**
         * @return allowUpstreamHeaders
         */
        public java.util.List < String > getAllowUpstreamHeaders() {
            return this.allowUpstreamHeaders;
        }

        /**
         * @return bodyMaxBytes
         */
        public Integer getBodyMaxBytes() {
            return this.bodyMaxBytes;
        }

        /**
         * @return isRestrict
         */
        public Boolean getIsRestrict() {
            return this.isRestrict;
        }

        /**
         * @return prefixPath
         */
        public String getPrefixPath() {
            return this.prefixPath;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return tokenKey
         */
        public String getTokenKey() {
            return this.tokenKey;
        }

        /**
         * @return withRequestBody
         */
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

        public static final class Builder {
            private java.util.List < String > allowRequestHeaders; 
            private java.util.List < String > allowUpstreamHeaders; 
            private Integer bodyMaxBytes; 
            private Boolean isRestrict; 
            private String prefixPath; 
            private Long serviceId; 
            private Integer timeout; 
            private String tokenKey; 
            private Boolean withRequestBody; 

            /**
             * The header that can be carried in an authentication request.
             */
            public Builder allowRequestHeaders(java.util.List < String > allowRequestHeaders) {
                this.allowRequestHeaders = allowRequestHeaders;
                return this;
            }

            /**
             * The header that can be retained in an authentication response.
             */
            public Builder allowUpstreamHeaders(java.util.List < String > allowUpstreamHeaders) {
                this.allowUpstreamHeaders = allowUpstreamHeaders;
                return this;
            }

            /**
             * BodyMaxBytes.
             */
            public Builder bodyMaxBytes(Integer bodyMaxBytes) {
                this.bodyMaxBytes = bodyMaxBytes;
                return this;
            }

            /**
             * Specifies whether the gateway allows a client request when the authentication server is unavailable. If a connection to the authentication server fails to be established or a 5xx error code is returned, the authentication server is unavailable.
             */
            public Builder isRestrict(Boolean isRestrict) {
                this.isRestrict = isRestrict;
                return this;
            }

            /**
             * The path of the authentication API provided by the authentication service. The path supports the prefix match method.
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The timeout period. Unit: seconds.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The header that stores a token in an authentication request. In most cases, a token is stored in the Authorization or Cookie header.
             */
            public Builder tokenKey(String tokenKey) {
                this.tokenKey = tokenKey;
                return this;
            }

            /**
             * WithRequestBody.
             */
            public Builder withRequestBody(Boolean withRequestBody) {
                this.withRequestBody = withRequestBody;
                return this;
            }

            public ExternalAuthZJSON build() {
                return new ExternalAuthZJSON(this);
            } 

        } 

    }
}

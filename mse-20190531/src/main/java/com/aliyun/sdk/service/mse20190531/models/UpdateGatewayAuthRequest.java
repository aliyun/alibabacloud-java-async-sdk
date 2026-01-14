// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayAuthRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthRequest</p>
 */
public class UpdateGatewayAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthResourceConfig")
    private String authResourceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthResourceList")
    private java.util.List<AuthResourceList> authResourceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthResourceMode")
    private Integer authResourceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieDomain")
    private String cookieDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteResourceIdList")
    private java.util.List<Long> deleteResourceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalAuthZJSON")
    private ExternalAuthZJSON externalAuthZJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsWhite")
    private Boolean isWhite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Issuer")
    private String issuer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Jwks")
    private String jwks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginUrl")
    private String loginUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectUrl")
    private String redirectUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopesList")
    private java.util.List<String> scopesList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sub")
    private String sub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenName")
    private String tokenName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenNamePrefix")
    private String tokenNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenPass")
    private Boolean tokenPass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenPosition")
    private String tokenPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateGatewayAuthRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authResourceConfig = builder.authResourceConfig;
        this.authResourceList = builder.authResourceList;
        this.authResourceMode = builder.authResourceMode;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.cookieDomain = builder.cookieDomain;
        this.deleteResourceIdList = builder.deleteResourceIdList;
        this.externalAuthZJSON = builder.externalAuthZJSON;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
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

    public static UpdateGatewayAuthRequest create() {
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
    public java.util.List<AuthResourceList> getAuthResourceList() {
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
     * @return deleteResourceIdList
     */
    public java.util.List<Long> getDeleteResourceIdList() {
        return this.deleteResourceIdList;
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
    public java.util.List<String> getScopesList() {
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

    public static final class Builder extends Request.Builder<UpdateGatewayAuthRequest, Builder> {
        private String acceptLanguage; 
        private String authResourceConfig; 
        private java.util.List<AuthResourceList> authResourceList; 
        private Integer authResourceMode; 
        private String clientId; 
        private String clientSecret; 
        private String cookieDomain; 
        private java.util.List<Long> deleteResourceIdList; 
        private ExternalAuthZJSON externalAuthZJSON; 
        private String gatewayUniqueId; 
        private Long id; 
        private Boolean isWhite; 
        private String issuer; 
        private String jwks; 
        private String loginUrl; 
        private String name; 
        private String redirectUrl; 
        private java.util.List<String> scopesList; 
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

        private Builder(UpdateGatewayAuthRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authResourceConfig = request.authResourceConfig;
            this.authResourceList = request.authResourceList;
            this.authResourceMode = request.authResourceMode;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.cookieDomain = request.cookieDomain;
            this.deleteResourceIdList = request.deleteResourceIdList;
            this.externalAuthZJSON = request.externalAuthZJSON;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
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
         * AuthResourceList.
         */
        public Builder authResourceList(java.util.List<AuthResourceList> authResourceList) {
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
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientSecret.
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * CookieDomain.
         */
        public Builder cookieDomain(String cookieDomain) {
            this.putQueryParameter("CookieDomain", cookieDomain);
            this.cookieDomain = cookieDomain;
            return this;
        }

        /**
         * DeleteResourceIdList.
         */
        public Builder deleteResourceIdList(java.util.List<Long> deleteResourceIdList) {
            String deleteResourceIdListShrink = shrink(deleteResourceIdList, "DeleteResourceIdList", "json");
            this.putQueryParameter("DeleteResourceIdList", deleteResourceIdListShrink);
            this.deleteResourceIdList = deleteResourceIdList;
            return this;
        }

        /**
         * ExternalAuthZJSON.
         */
        public Builder externalAuthZJSON(ExternalAuthZJSON externalAuthZJSON) {
            String externalAuthZJSONShrink = shrink(externalAuthZJSON, "ExternalAuthZJSON", "json");
            this.putQueryParameter("ExternalAuthZJSON", externalAuthZJSONShrink);
            this.externalAuthZJSON = externalAuthZJSON;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IsWhite.
         */
        public Builder isWhite(Boolean isWhite) {
            this.putQueryParameter("IsWhite", isWhite);
            this.isWhite = isWhite;
            return this;
        }

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.putQueryParameter("Issuer", issuer);
            this.issuer = issuer;
            return this;
        }

        /**
         * Jwks.
         */
        public Builder jwks(String jwks) {
            this.putQueryParameter("Jwks", jwks);
            this.jwks = jwks;
            return this;
        }

        /**
         * LoginUrl.
         */
        public Builder loginUrl(String loginUrl) {
            this.putQueryParameter("LoginUrl", loginUrl);
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RedirectUrl.
         */
        public Builder redirectUrl(String redirectUrl) {
            this.putQueryParameter("RedirectUrl", redirectUrl);
            this.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * ScopesList.
         */
        public Builder scopesList(java.util.List<String> scopesList) {
            String scopesListShrink = shrink(scopesList, "ScopesList", "json");
            this.putQueryParameter("ScopesList", scopesListShrink);
            this.scopesList = scopesList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Sub.
         */
        public Builder sub(String sub) {
            this.putQueryParameter("Sub", sub);
            this.sub = sub;
            return this;
        }

        /**
         * TokenName.
         */
        public Builder tokenName(String tokenName) {
            this.putQueryParameter("TokenName", tokenName);
            this.tokenName = tokenName;
            return this;
        }

        /**
         * TokenNamePrefix.
         */
        public Builder tokenNamePrefix(String tokenNamePrefix) {
            this.putQueryParameter("TokenNamePrefix", tokenNamePrefix);
            this.tokenNamePrefix = tokenNamePrefix;
            return this;
        }

        /**
         * TokenPass.
         */
        public Builder tokenPass(Boolean tokenPass) {
            this.putQueryParameter("TokenPass", tokenPass);
            this.tokenPass = tokenPass;
            return this;
        }

        /**
         * TokenPosition.
         */
        public Builder tokenPosition(String tokenPosition) {
            this.putQueryParameter("TokenPosition", tokenPosition);
            this.tokenPosition = tokenPosition;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateGatewayAuthRequest build() {
            return new UpdateGatewayAuthRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayAuthRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayAuthRequest</p>
     */
    public static class AuthResourceHeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderKey")
        private String headerKey;

        @com.aliyun.core.annotation.NameInMap("HeaderMethod")
        private String headerMethod;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
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

            private Builder() {
            } 

            private Builder(AuthResourceHeaderList model) {
                this.headerKey = model.headerKey;
                this.headerMethod = model.headerMethod;
                this.headerValue = model.headerValue;
            } 

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
    /**
     * 
     * {@link UpdateGatewayAuthRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayAuthRequest</p>
     */
    public static class AuthResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthResourceHeaderList")
        private java.util.List<AuthResourceHeaderList> authResourceHeaderList;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private Long domainId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private AuthResourceList(Builder builder) {
            this.authResourceHeaderList = builder.authResourceHeaderList;
            this.domainId = builder.domainId;
            this.id = builder.id;
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
        public java.util.List<AuthResourceHeaderList> getAuthResourceHeaderList() {
            return this.authResourceHeaderList;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private java.util.List<AuthResourceHeaderList> authResourceHeaderList; 
            private Long domainId; 
            private Long id; 
            private Boolean ignoreCase; 
            private String matchType; 
            private String path; 

            private Builder() {
            } 

            private Builder(AuthResourceList model) {
                this.authResourceHeaderList = model.authResourceHeaderList;
                this.domainId = model.domainId;
                this.id = model.id;
                this.ignoreCase = model.ignoreCase;
                this.matchType = model.matchType;
                this.path = model.path;
            } 

            /**
             * AuthResourceHeaderList.
             */
            public Builder authResourceHeaderList(java.util.List<AuthResourceHeaderList> authResourceHeaderList) {
                this.authResourceHeaderList = authResourceHeaderList;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Path.
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
    /**
     * 
     * {@link UpdateGatewayAuthRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayAuthRequest</p>
     */
    public static class ExternalAuthZJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowRequestHeaders")
        private java.util.List<String> allowRequestHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowUpstreamHeaders")
        private java.util.List<String> allowUpstreamHeaders;

        @com.aliyun.core.annotation.NameInMap("BodyMaxBytes")
        private Integer bodyMaxBytes;

        @com.aliyun.core.annotation.NameInMap("IsRestrict")
        private Boolean isRestrict;

        @com.aliyun.core.annotation.NameInMap("PrefixPath")
        private String prefixPath;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("TokenKey")
        private String tokenKey;

        @com.aliyun.core.annotation.NameInMap("WithRematchRoute")
        private Boolean withRematchRoute;

        @com.aliyun.core.annotation.NameInMap("WithRequestBody")
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
            this.withRematchRoute = builder.withRematchRoute;
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
        public java.util.List<String> getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        /**
         * @return allowUpstreamHeaders
         */
        public java.util.List<String> getAllowUpstreamHeaders() {
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
         * @return withRematchRoute
         */
        public Boolean getWithRematchRoute() {
            return this.withRematchRoute;
        }

        /**
         * @return withRequestBody
         */
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

        public static final class Builder {
            private java.util.List<String> allowRequestHeaders; 
            private java.util.List<String> allowUpstreamHeaders; 
            private Integer bodyMaxBytes; 
            private Boolean isRestrict; 
            private String prefixPath; 
            private Long serviceId; 
            private Integer timeout; 
            private String tokenKey; 
            private Boolean withRematchRoute; 
            private Boolean withRequestBody; 

            private Builder() {
            } 

            private Builder(ExternalAuthZJSON model) {
                this.allowRequestHeaders = model.allowRequestHeaders;
                this.allowUpstreamHeaders = model.allowUpstreamHeaders;
                this.bodyMaxBytes = model.bodyMaxBytes;
                this.isRestrict = model.isRestrict;
                this.prefixPath = model.prefixPath;
                this.serviceId = model.serviceId;
                this.timeout = model.timeout;
                this.tokenKey = model.tokenKey;
                this.withRematchRoute = model.withRematchRoute;
                this.withRequestBody = model.withRequestBody;
            } 

            /**
             * AllowRequestHeaders.
             */
            public Builder allowRequestHeaders(java.util.List<String> allowRequestHeaders) {
                this.allowRequestHeaders = allowRequestHeaders;
                return this;
            }

            /**
             * AllowUpstreamHeaders.
             */
            public Builder allowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
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
             * IsRestrict.
             */
            public Builder isRestrict(Boolean isRestrict) {
                this.isRestrict = isRestrict;
                return this;
            }

            /**
             * PrefixPath.
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * TokenKey.
             */
            public Builder tokenKey(String tokenKey) {
                this.tokenKey = tokenKey;
                return this;
            }

            /**
             * WithRematchRoute.
             */
            public Builder withRematchRoute(Boolean withRematchRoute) {
                this.withRematchRoute = withRematchRoute;
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

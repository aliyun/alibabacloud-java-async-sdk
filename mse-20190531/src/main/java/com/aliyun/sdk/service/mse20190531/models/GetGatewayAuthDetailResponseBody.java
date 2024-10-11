// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayAuthDetailResponseBody</p>
 */
public class GetGatewayAuthDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGatewayAuthDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayAuthDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayAuthDetailResponseBody build() {
            return new GetGatewayAuthDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthDetailResponseBody</p>
     */
    public static class Service extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private Service(Builder builder) {
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Service create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String groupName; 
            private String name; 
            private String namespace; 
            private String sourceType; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Service build() {
                return new Service(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthDetailResponseBody</p>
     */
    public static class ExternalAuthZ extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowRequestHeaders")
        private java.util.List < String > allowRequestHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowUpstreamHeaders")
        private java.util.List < String > allowUpstreamHeaders;

        @com.aliyun.core.annotation.NameInMap("BodyMaxBytes")
        private Integer bodyMaxBytes;

        @com.aliyun.core.annotation.NameInMap("IsRestrict")
        private Boolean isRestrict;

        @com.aliyun.core.annotation.NameInMap("PrefixPath")
        private String prefixPath;

        @com.aliyun.core.annotation.NameInMap("Service")
        private Service service;

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

        private ExternalAuthZ(Builder builder) {
            this.allowRequestHeaders = builder.allowRequestHeaders;
            this.allowUpstreamHeaders = builder.allowUpstreamHeaders;
            this.bodyMaxBytes = builder.bodyMaxBytes;
            this.isRestrict = builder.isRestrict;
            this.prefixPath = builder.prefixPath;
            this.service = builder.service;
            this.serviceId = builder.serviceId;
            this.timeout = builder.timeout;
            this.tokenKey = builder.tokenKey;
            this.withRematchRoute = builder.withRematchRoute;
            this.withRequestBody = builder.withRequestBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalAuthZ create() {
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
         * @return service
         */
        public Service getService() {
            return this.service;
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
            private java.util.List < String > allowRequestHeaders; 
            private java.util.List < String > allowUpstreamHeaders; 
            private Integer bodyMaxBytes; 
            private Boolean isRestrict; 
            private String prefixPath; 
            private Service service; 
            private Long serviceId; 
            private Integer timeout; 
            private String tokenKey; 
            private Boolean withRematchRoute; 
            private Boolean withRequestBody; 

            /**
             * AllowRequestHeaders.
             */
            public Builder allowRequestHeaders(java.util.List < String > allowRequestHeaders) {
                this.allowRequestHeaders = allowRequestHeaders;
                return this;
            }

            /**
             * AllowUpstreamHeaders.
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
             * Service.
             */
            public Builder service(Service service) {
                this.service = service;
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

            public ExternalAuthZ build() {
                return new ExternalAuthZ(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthDetailResponseBody</p>
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
     * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthDetailResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthId")
        private Long authId;

        @com.aliyun.core.annotation.NameInMap("AuthResourceHeaderList")
        private java.util.List < AuthResourceHeaderList> authResourceHeaderList;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private Long domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @com.aliyun.core.annotation.NameInMap("IsWhite")
        private Boolean isWhite;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ResourceList(Builder builder) {
            this.authId = builder.authId;
            this.authResourceHeaderList = builder.authResourceHeaderList;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ignoreCase = builder.ignoreCase;
            this.isWhite = builder.isWhite;
            this.matchType = builder.matchType;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return authId
         */
        public Long getAuthId() {
            return this.authId;
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
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return isWhite
         */
        public Boolean getIsWhite() {
            return this.isWhite;
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
            private Long authId; 
            private java.util.List < AuthResourceHeaderList> authResourceHeaderList; 
            private Long domainId; 
            private String domainName; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean ignoreCase; 
            private Boolean isWhite; 
            private String matchType; 
            private String path; 

            /**
             * AuthId.
             */
            public Builder authId(Long authId) {
                this.authId = authId;
                return this;
            }

            /**
             * AuthResourceHeaderList.
             */
            public Builder authResourceHeaderList(java.util.List < AuthResourceHeaderList> authResourceHeaderList) {
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * IsWhite.
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
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

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayAuthDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthResourceConfig")
        private String authResourceConfig;

        @com.aliyun.core.annotation.NameInMap("AuthResourceMode")
        private Integer authResourceMode;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("CookieDomain")
        private String cookieDomain;

        @com.aliyun.core.annotation.NameInMap("ExternalAuthZ")
        private ExternalAuthZ externalAuthZ;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsWhite")
        private Boolean isWhite;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Jwks")
        private String jwks;

        @com.aliyun.core.annotation.NameInMap("LoginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        @com.aliyun.core.annotation.NameInMap("ScopesList")
        private String scopesList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("Sub")
        private String sub;

        @com.aliyun.core.annotation.NameInMap("TokenName")
        private String tokenName;

        @com.aliyun.core.annotation.NameInMap("TokenNamePrefix")
        private String tokenNamePrefix;

        @com.aliyun.core.annotation.NameInMap("TokenPass")
        private Boolean tokenPass;

        @com.aliyun.core.annotation.NameInMap("TokenPosition")
        private String tokenPosition;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.authResourceConfig = builder.authResourceConfig;
            this.authResourceMode = builder.authResourceMode;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.cookieDomain = builder.cookieDomain;
            this.externalAuthZ = builder.externalAuthZ;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isWhite = builder.isWhite;
            this.issuer = builder.issuer;
            this.jwks = builder.jwks;
            this.loginUrl = builder.loginUrl;
            this.name = builder.name;
            this.redirectUrl = builder.redirectUrl;
            this.resourceList = builder.resourceList;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authResourceConfig
         */
        public String getAuthResourceConfig() {
            return this.authResourceConfig;
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
         * @return externalAuthZ
         */
        public ExternalAuthZ getExternalAuthZ() {
            return this.externalAuthZ;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return scopesList
         */
        public String getScopesList() {
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

        public static final class Builder {
            private String authResourceConfig; 
            private Integer authResourceMode; 
            private String clientId; 
            private String clientSecret; 
            private String cookieDomain; 
            private ExternalAuthZ externalAuthZ; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean isWhite; 
            private String issuer; 
            private String jwks; 
            private String loginUrl; 
            private String name; 
            private String redirectUrl; 
            private java.util.List < ResourceList> resourceList; 
            private String scopesList; 
            private Boolean status; 
            private String sub; 
            private String tokenName; 
            private String tokenNamePrefix; 
            private Boolean tokenPass; 
            private String tokenPosition; 
            private String type; 

            /**
             * AuthResourceConfig.
             */
            public Builder authResourceConfig(String authResourceConfig) {
                this.authResourceConfig = authResourceConfig;
                return this;
            }

            /**
             * AuthResourceMode.
             */
            public Builder authResourceMode(Integer authResourceMode) {
                this.authResourceMode = authResourceMode;
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
             * ClientSecret.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * CookieDomain.
             */
            public Builder cookieDomain(String cookieDomain) {
                this.cookieDomain = cookieDomain;
                return this;
            }

            /**
             * ExternalAuthZ.
             */
            public Builder externalAuthZ(ExternalAuthZ externalAuthZ) {
                this.externalAuthZ = externalAuthZ;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * IsWhite.
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Jwks.
             */
            public Builder jwks(String jwks) {
                this.jwks = jwks;
                return this;
            }

            /**
             * LoginUrl.
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RedirectUrl.
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            /**
             * ResourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * ScopesList.
             */
            public Builder scopesList(String scopesList) {
                this.scopesList = scopesList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * Sub.
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * TokenName.
             */
            public Builder tokenName(String tokenName) {
                this.tokenName = tokenName;
                return this;
            }

            /**
             * TokenNamePrefix.
             */
            public Builder tokenNamePrefix(String tokenNamePrefix) {
                this.tokenNamePrefix = tokenNamePrefix;
                return this;
            }

            /**
             * TokenPass.
             */
            public Builder tokenPass(Boolean tokenPass) {
                this.tokenPass = tokenPass;
                return this;
            }

            /**
             * TokenPosition.
             */
            public Builder tokenPosition(String tokenPosition) {
                this.tokenPosition = tokenPosition;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

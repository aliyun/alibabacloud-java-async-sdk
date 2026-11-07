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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetGatewayAuthDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. It synchronizes with the Success parameter. If Success is true, the code is 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The authentication details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C96CDF8-9E6C-XXXX-XXXX-8F87A10117E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Service model) {
                this.groupName = model.groupName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The group to which the authentication service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The authentication service name.</p>
             * 
             * <strong>example:</strong>
             * <p>httpbin-auth-service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the authentication service.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The source type of the authentication service.</p>
             * 
             * <strong>example:</strong>
             * <p>K8s</p>
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
        private java.util.List<String> allowRequestHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowUpstreamHeaders")
        private java.util.List<String> allowUpstreamHeaders;

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
            private java.util.List<String> allowRequestHeaders; 
            private java.util.List<String> allowUpstreamHeaders; 
            private Integer bodyMaxBytes; 
            private Boolean isRestrict; 
            private String prefixPath; 
            private Service service; 
            private Long serviceId; 
            private Integer timeout; 
            private String tokenKey; 
            private Boolean withRematchRoute; 
            private Boolean withRequestBody; 

            private Builder() {
            } 

            private Builder(ExternalAuthZ model) {
                this.allowRequestHeaders = model.allowRequestHeaders;
                this.allowUpstreamHeaders = model.allowUpstreamHeaders;
                this.bodyMaxBytes = model.bodyMaxBytes;
                this.isRestrict = model.isRestrict;
                this.prefixPath = model.prefixPath;
                this.service = model.service;
                this.serviceId = model.serviceId;
                this.timeout = model.timeout;
                this.tokenKey = model.tokenKey;
                this.withRematchRoute = model.withRematchRoute;
                this.withRequestBody = model.withRequestBody;
            } 

            /**
             * <p>The allowed request headers.</p>
             */
            public Builder allowRequestHeaders(java.util.List<String> allowRequestHeaders) {
                this.allowRequestHeaders = allowRequestHeaders;
                return this;
            }

            /**
             * <p>The allowed response headers.</p>
             */
            public Builder allowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
                this.allowUpstreamHeaders = allowUpstreamHeaders;
                return this;
            }

            /**
             * <p>The maximum size of the request body in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4000000</p>
             */
            public Builder bodyMaxBytes(Integer bodyMaxBytes) {
                this.bodyMaxBytes = bodyMaxBytes;
                return this;
            }

            /**
             * <p>Specifies the custom authentication mode. Valid values:</p>
             * <ul>
             * <li>true: Strict mode. If the authentication service is unavailable (for example, the connection fails or a 5xx status code is returned), the gateway rejects the client request.</li>
             * <li>false: Loose mode. If the authentication service is unavailable (for example, the connection fails or a 5xx status code is returned), the gateway allows the client request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRestrict(Boolean isRestrict) {
                this.isRestrict = isRestrict;
                return this;
            }

            /**
             * <p>The path of the authentication API.</p>
             * 
             * <strong>example:</strong>
             * <p>/auth</p>
             */
            public Builder prefixPath(String prefixPath) {
                this.prefixPath = prefixPath;
                return this;
            }

            /**
             * <p>The authentication service information.</p>
             */
            public Builder service(Service service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The ID of the authentication service.</p>
             * 
             * <strong>example:</strong>
             * <p>15300</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The timeout period of the authentication service, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The position of the token, which indicates the HTTP header that contains the token in the request. Common values include Authorization and Cookie.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorization</p>
             */
            public Builder tokenKey(String tokenKey) {
                this.tokenKey = tokenKey;
                return this;
            }

            /**
             * <p>Specifies whether to rematch the route after authentication is completed.</p>
             */
            public Builder withRematchRoute(Boolean withRematchRoute) {
                this.withRematchRoute = withRematchRoute;
                return this;
            }

            /**
             * <p>Specifies whether the request body is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(AuthResourceHeaderList model) {
                this.headerKey = model.headerKey;
                this.headerMethod = model.headerMethod;
                this.headerValue = model.headerValue;
            } 

            /**
             * <p>The name of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>x-req</p>
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * <p>The matching condition. Valid values:</p>
             * <ul>
             * <li>EQUAL: Equal to.</li>
             * <li>NOT_EQUAL: Not equal to.</li>
             * <li>EXIST: Exists.</li>
             * <li>NOT_EXIST: Does not exist.</li>
             * <li>INCLUDE: Includes.</li>
             * <li>EXCLUDE: Excludes.</li>
             * <li>PREFIX: Prefix.</li>
             * <li>SUFFIX: Suffix.</li>
             * <li>REGREX: Regular expression.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder headerMethod(String headerMethod) {
                this.headerMethod = headerMethod;
                return this;
            }

            /**
             * <p>The value of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
        private java.util.List<AuthResourceHeaderList> authResourceHeaderList;

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
            private java.util.List<AuthResourceHeaderList> authResourceHeaderList; 
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

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.authId = model.authId;
                this.authResourceHeaderList = model.authResourceHeaderList;
                this.domainId = model.domainId;
                this.domainName = model.domainName;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.ignoreCase = model.ignoreCase;
                this.isWhite = model.isWhite;
                this.matchType = model.matchType;
                this.path = model.path;
            } 

            /**
             * <p>The ID of the authentication to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2274</p>
             */
            public Builder authId(Long authId) {
                this.authId = authId;
                return this;
            }

            /**
             * <p>The request headers of the rule. This parameter is currently only used for custom authentication.</p>
             */
            public Builder authResourceHeaderList(java.util.List<AuthResourceHeaderList> authResourceHeaderList) {
                this.authResourceHeaderList = authResourceHeaderList;
                return this;
            }

            /**
             * <p>The ID of the domain name in the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1765</p>
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain name in the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the gateway to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2274</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-6f0dbd108a0249d2b675b3ef50b*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The GMT time when the authorization rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-19T03:32:38.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The GMT time when the authorization rule was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-19T03:32:38.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1303</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Specifies whether case sensitivity is enabled for the path. Valid values:</p>
             * <ul>
             * <li>true: Case sensitivity is enabled.</li>
             * <li>false: Case sensitivity is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * <p>The authorization blacklist and whitelist mode. Valid values:</p>
             * <ul>
             * <li>true: Whitelist mode. Hosts and paths in the list can be accessed without verification, while all others require verification.</li>
             * <li>false: Blacklist mode. Hosts and paths in the list require verification, while all others can be accessed directly.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * <p>The matching type for the request path. Valid values:</p>
             * <ul>
             * <li>EQUAL: Exact match.</li>
             * <li>PRE: Prefix match.</li>
             * <li>ERGULAR: Regular expression match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The matching path of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
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
        private java.util.List<ResourceList> resourceList;

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
        public java.util.List<ResourceList> getResourceList() {
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
            private java.util.List<ResourceList> resourceList; 
            private String scopesList; 
            private Boolean status; 
            private String sub; 
            private String tokenName; 
            private String tokenNamePrefix; 
            private Boolean tokenPass; 
            private String tokenPosition; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authResourceConfig = model.authResourceConfig;
                this.authResourceMode = model.authResourceMode;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.cookieDomain = model.cookieDomain;
                this.externalAuthZ = model.externalAuthZ;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isWhite = model.isWhite;
                this.issuer = model.issuer;
                this.jwks = model.jwks;
                this.loginUrl = model.loginUrl;
                this.name = model.name;
                this.redirectUrl = model.redirectUrl;
                this.resourceList = model.resourceList;
                this.scopesList = model.scopesList;
                this.status = model.status;
                this.sub = model.sub;
                this.tokenName = model.tokenName;
                this.tokenNamePrefix = model.tokenNamePrefix;
                this.tokenPass = model.tokenPass;
                this.tokenPosition = model.tokenPosition;
                this.type = model.type;
            } 

            /**
             * <p>The YAML configuration for the complex mode.</p>
             * 
             * <strong>example:</strong>
             * <p>permissions:</p>
             * <ul>
             * <li>not_rule:
             *   or_rules:
             * rules:
             * - and_rules:
             *     rules:
             *     - url_path:
             *         path:
             *           ignore_case: false
             *           prefix: /version
             * - and_rules:
             *     rules:
             *     - url_path:
             *         path:
             *           ignore_case: false
             *           prefix: /header</li>
             * </ul>
             */
            public Builder authResourceConfig(String authResourceConfig) {
                this.authResourceConfig = authResourceConfig;
                return this;
            }

            /**
             * <p>The authorization resource mode. Valid values:</p>
             * <ul>
             * <li>0: Simple mode.</li>
             * <li>1: Complex mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authResourceMode(Integer authResourceMode) {
                this.authResourceMode = authResourceMode;
                return this;
            }

            /**
             * <p>The application ID registered for the service. This parameter is used for OIDC and IDaaS.</p>
             * 
             * <strong>example:</strong>
             * <p>example-app</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The application secret registered for the service. This parameter is used for OIDC and IDaaS.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The domain name of the cookie. After authentication, the cookie is sent to the specified domain name to maintain the logon state. This parameter is used for OIDC and IDaaS.</p>
             * 
             * <strong>example:</strong>
             * <p>hello.com</p>
             */
            public Builder cookieDomain(String cookieDomain) {
                this.cookieDomain = cookieDomain;
                return this;
            }

            /**
             * <p>The custom authentication information.</p>
             */
            public Builder externalAuthZ(ExternalAuthZ externalAuthZ) {
                this.externalAuthZ = externalAuthZ;
                return this;
            }

            /**
             * <p>The ID of the gateway to which the authentication belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2274</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway to which the authentication belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-6f0dbd108a0249d2b675b3ef50b*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The GMT time when the authentication was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-19T02:41:03.000+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The GMT time when the authentication was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-19T02:41:03.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The authentication ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1100</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Authorization blacklist and whitelist mode:</p>
             * <ul>
             * <li>true: whitelist mode (hosts and paths in the list can be accessed without authentication, while all others require authentication).</li>
             * <li>false: blacklist mode (hosts and paths in the list require authentication, while all others can be accessed directly).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * <p>Used when the authentication type is JWT or OIDC. For JWT, it represents the iss (issuer) claim in the JWT. For OIDC, it represents the iss (issuer) claim in the OIDC token.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The JWT public key in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  \&quot;keys\&quot;:[\n    {\n      \&quot;kty\&quot;: \&quot;RSA\&quot;,\n      \&quot;e\&quot;: \&quot;AQAB\&quot;,\n      \&quot;use\&quot;: \&quot;sig\&quot;,\n      \&quot;kid\&quot;: \&quot;1rGufmH1YN8rqM9ZOLgo7eEST3AnL89Y-m-XGFioLoA\&quot;,\n      \&quot;alg\&quot;: \&quot;RS256\&quot;,\n      \&quot;n\&quot;: \&quot;rM2GIc0YTMqwNCwXnjKbW5QndkCEZgyLu3uQUnyZF7HvMTekiTvQg_39mg3dV1eaYYkYfZBogyroJBqAQXhk6VVCxlBjFVp2xstJPVWngMOOlcafwN_BKdN-EQ06O_Uu__e7gNKI3DunkNk0cNaFETE7d4meRYyTlgEzYgsrW05_ufR0BKoddL3E5JsCpUxRjH9ICbodBx0U74W6Dcci-R2EA1DBrEcboE6n90uoJs6UJNriAK_71nAsYonihU5aQFFnyPTkJHfRwHK6JlME6rn-b-rpLSpdyc6U1nOFZP2DEpz8U5FrYoLYSZIU-MQGxDhCnGc_rxl2IyP9B2qcCQ\&quot;\n    }\n  ]\n}\n</p>
             */
            public Builder jwks(String jwks) {
                this.jwks = jwks;
                return this;
            }

            /**
             * <p>The URL of the user logon page for the IDaaS instance. This parameter is used for IDaaS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The authentication name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The redirect URL after successful authorization. This parameter is used for OIDC and IDaaS, and must be consistent with the redirect URL configured in OIDC or IDaaS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://yourdomain/path">https://yourdomain/path</a></p>
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            /**
             * <p>The list of authorization rules for authentication. Multiple rule conditions have an OR relationship, and multiple matching items within a rule condition have an AND relationship.</p>
             */
            public Builder resourceList(java.util.List<ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * <p>The OIDC scopes. This parameter is used for OIDC.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;openid&quot;,&quot;email&quot;]</p>
             */
            public Builder scopesList(String scopesList) {
                this.scopesList = scopesList;
                return this;
            }

            /**
             * <p>Indicates whether authentication is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Used when the authentication type is JWT. It represents the sub (subject) claim in the JWT.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
             */
            public Builder sub(String sub) {
                this.sub = sub;
                return this;
            }

            /**
             * <p>The location where the JWT token is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>Authorization</p>
             */
            public Builder tokenName(String tokenName) {
                this.tokenName = tokenName;
                return this;
            }

            /**
             * <p>The prefix of the JWT token.</p>
             * 
             * <strong>example:</strong>
             * <p>Bearer</p>
             */
            public Builder tokenNamePrefix(String tokenNamePrefix) {
                this.tokenNamePrefix = tokenNamePrefix;
                return this;
            }

            /**
             * <p>Specifies whether to pass through the token.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tokenPass(Boolean tokenPass) {
                this.tokenPass = tokenPass;
                return this;
            }

            /**
             * <p>The position of the JWT token. Valid values:</p>
             * <ul>
             * <li>HEADER: Transmitted through the HTTP header.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder tokenPosition(String tokenPosition) {
                this.tokenPosition = tokenPosition;
                return this;
            }

            /**
             * <p>The authentication type. Valid values:</p>
             * <ul>
             * <li>JWT</li>
             * <li>OIDC</li>
             * <li>IDaaS</li>
             * <li>ExternalAuthZ (self-managed authentication service)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JWT</p>
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

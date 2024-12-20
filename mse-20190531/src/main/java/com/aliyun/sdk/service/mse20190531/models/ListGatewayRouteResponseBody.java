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
 * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteResponseBody</p>
 */
public class ListGatewayRouteResponseBody extends TeaModel {
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

    private ListGatewayRouteResponseBody(Builder builder) {
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

    public static ListGatewayRouteResponseBody create() {
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
         * <p>The code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to perform this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>83F02EAB-ECDF-55C6-B332-8649E5E7AF2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewayRouteResponseBody build() {
            return new ListGatewayRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class Comment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Comment(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comment create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Comment build() {
                return new Comment(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class DirectResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        private DirectResponse(Builder builder) {
            this.body = builder.body;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectResponse create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String body; 
            private Integer code; 

            /**
             * <p>The return value for service mocking.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The response code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public DirectResponse build() {
                return new DirectResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class FallbackServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private FallbackServices(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackServices create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
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
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private String serviceName; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            /**
             * <p>The type of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * <p>The name of the group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight in the form of a percentage value.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>353</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>service name</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8848</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public FallbackServices build() {
                return new FallbackServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private Redirect(Builder builder) {
            this.code = builder.code;
            this.host = builder.host;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer code; 
            private String host; 
            private String path; 

            /**
             * <p>The response code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The hostname to be redirected to.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class HeaderPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * <p>The header key.</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderPredicates build() {
                return new HeaderPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class PathPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PathPredicates(Builder builder) {
            this.ignoreCase = builder.ignoreCase;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicates create() {
            return builder().build();
        }

        /**
         * @return ignoreCase
         */
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean ignoreCase; 
            private String path; 
            private String type; 

            /**
             * <p>Indicates whether case sensitivity is ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * <p>The path of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>/getIp</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The matching type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PathPredicates build() {
                return new PathPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class QueryPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * <p>The key.</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryPredicates build() {
                return new QueryPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class RoutePredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderPredicates")
        private java.util.List<HeaderPredicates> headerPredicates;

        @com.aliyun.core.annotation.NameInMap("MethodPredicates")
        private java.util.List<String> methodPredicates;

        @com.aliyun.core.annotation.NameInMap("PathPredicates")
        private PathPredicates pathPredicates;

        @com.aliyun.core.annotation.NameInMap("QueryPredicates")
        private java.util.List<QueryPredicates> queryPredicates;

        private RoutePredicates(Builder builder) {
            this.headerPredicates = builder.headerPredicates;
            this.methodPredicates = builder.methodPredicates;
            this.pathPredicates = builder.pathPredicates;
            this.queryPredicates = builder.queryPredicates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutePredicates create() {
            return builder().build();
        }

        /**
         * @return headerPredicates
         */
        public java.util.List<HeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        /**
         * @return methodPredicates
         */
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        /**
         * @return pathPredicates
         */
        public PathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        /**
         * @return queryPredicates
         */
        public java.util.List<QueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

        public static final class Builder {
            private java.util.List<HeaderPredicates> headerPredicates; 
            private java.util.List<String> methodPredicates; 
            private PathPredicates pathPredicates; 
            private java.util.List<QueryPredicates> queryPredicates; 

            /**
             * <p>The headers used for route matching.</p>
             */
            public Builder headerPredicates(java.util.List<HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * <p>The HTTP methods used for route matching.</p>
             */
            public Builder methodPredicates(java.util.List<String> methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * <p>The path used for route matching.</p>
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * <p>The parameters used for route matching.</p>
             */
            public Builder queryPredicates(java.util.List<QueryPredicates> queryPredicates) {
                this.queryPredicates = queryPredicates;
                return this;
            }

            public RoutePredicates build() {
                return new RoutePredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class ParamMapsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtractKey")
        private String extractKey;

        @com.aliyun.core.annotation.NameInMap("ExtractKeySpec")
        private String extractKeySpec;

        @com.aliyun.core.annotation.NameInMap("MappingType")
        private String mappingType;

        private ParamMapsList(Builder builder) {
            this.extractKey = builder.extractKey;
            this.extractKeySpec = builder.extractKeySpec;
            this.mappingType = builder.mappingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamMapsList create() {
            return builder().build();
        }

        /**
         * @return extractKey
         */
        public String getExtractKey() {
            return this.extractKey;
        }

        /**
         * @return extractKeySpec
         */
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        /**
         * @return mappingType
         */
        public String getMappingType() {
            return this.mappingType;
        }

        public static final class Builder {
            private String extractKey; 
            private String extractKeySpec; 
            private String mappingType; 

            /**
             * <p>The key extracted from the input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * <p>The position of the input parameter.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p><code>ALL_QUERY_PARAMETER</code>: request parameter</p>
             * </li>
             * <li><p><code>ALL_HEADER</code>: request header</p>
             * </li>
             * <li><p><code>ALL_PATH</code>: request path</p>
             * </li>
             * <li><p><code>ALL_BODY</code>: request body</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_QUERY_PARAMETER</p>
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * <p>The type of the backend service parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
             */
            public Builder mappingType(String mappingType) {
                this.mappingType = mappingType;
                return this;
            }

            public ParamMapsList build() {
                return new ParamMapsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class MothedMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboMothedName")
        private String dubboMothedName;

        @com.aliyun.core.annotation.NameInMap("HttpMothed")
        private String httpMothed;

        @com.aliyun.core.annotation.NameInMap("Mothedpath")
        private String mothedpath;

        @com.aliyun.core.annotation.NameInMap("ParamMapsList")
        private java.util.List<ParamMapsList> paramMapsList;

        @com.aliyun.core.annotation.NameInMap("PassThroughAllHeaders")
        private String passThroughAllHeaders;

        @com.aliyun.core.annotation.NameInMap("PassThroughList")
        private java.util.List<String> passThroughList;

        private MothedMapList(Builder builder) {
            this.dubboMothedName = builder.dubboMothedName;
            this.httpMothed = builder.httpMothed;
            this.mothedpath = builder.mothedpath;
            this.paramMapsList = builder.paramMapsList;
            this.passThroughAllHeaders = builder.passThroughAllHeaders;
            this.passThroughList = builder.passThroughList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MothedMapList create() {
            return builder().build();
        }

        /**
         * @return dubboMothedName
         */
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        /**
         * @return httpMothed
         */
        public String getHttpMothed() {
            return this.httpMothed;
        }

        /**
         * @return mothedpath
         */
        public String getMothedpath() {
            return this.mothedpath;
        }

        /**
         * @return paramMapsList
         */
        public java.util.List<ParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        /**
         * @return passThroughAllHeaders
         */
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        /**
         * @return passThroughList
         */
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

        public static final class Builder {
            private String dubboMothedName; 
            private String httpMothed; 
            private String mothedpath; 
            private java.util.List<ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List<String> passThroughList; 

            /**
             * <p>The method name of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>sayHello</p>
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * <p>The HTTP method.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p>ALL_GET</p>
             * </li>
             * <li><p>ALL_POST</p>
             * </li>
             * <li><p>ALL_PUT</p>
             * </li>
             * <li><p>ALL_DELETE</p>
             * </li>
             * <li><p>ALL_PATCH</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_GET</p>
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * <p>The path used for method matching.</p>
             * 
             * <strong>example:</strong>
             * <p>/mytestzbk/sayhello</p>
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
                return this;
            }

            /**
             * <p>The information about parameter mappings.</p>
             */
            public Builder paramMapsList(java.util.List<ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * <p>The pass-through type of the header.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p>PASS_ALL: All headers are passed through.</p>
             * </li>
             * <li><p>PASS_NOT: All headers are not passed through.</p>
             * </li>
             * <li><p>PASS_ASSIGN: Specified headers are passed through.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS_NOT</p>
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * <p>The list of headers to be passed through.</p>
             */
            public Builder passThroughList(java.util.List<String> passThroughList) {
                this.passThroughList = passThroughList;
                return this;
            }

            public MothedMapList build() {
                return new MothedMapList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class HttpDubboTranscoder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboServiceGroup")
        private String dubboServiceGroup;

        @com.aliyun.core.annotation.NameInMap("DubboServiceName")
        private String dubboServiceName;

        @com.aliyun.core.annotation.NameInMap("DubboServiceVersion")
        private String dubboServiceVersion;

        @com.aliyun.core.annotation.NameInMap("MothedMapList")
        private java.util.List<MothedMapList> mothedMapList;

        private HttpDubboTranscoder(Builder builder) {
            this.dubboServiceGroup = builder.dubboServiceGroup;
            this.dubboServiceName = builder.dubboServiceName;
            this.dubboServiceVersion = builder.dubboServiceVersion;
            this.mothedMapList = builder.mothedMapList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpDubboTranscoder create() {
            return builder().build();
        }

        /**
         * @return dubboServiceGroup
         */
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        /**
         * @return dubboServiceName
         */
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        /**
         * @return dubboServiceVersion
         */
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        /**
         * @return mothedMapList
         */
        public java.util.List<MothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

        public static final class Builder {
            private String dubboServiceGroup; 
            private String dubboServiceName; 
            private String dubboServiceVersion; 
            private java.util.List<MothedMapList> mothedMapList; 

            /**
             * <p>The Dubbo service group.</p>
             * 
             * <strong>example:</strong>
             * <p>service group</p>
             */
            public Builder dubboServiceGroup(String dubboServiceGroup) {
                this.dubboServiceGroup = dubboServiceGroup;
                return this;
            }

            /**
             * <p>The name of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.dubbo.samples.basic.api.DemoService</p>
             */
            public Builder dubboServiceName(String dubboServiceName) {
                this.dubboServiceName = dubboServiceName;
                return this;
            }

            /**
             * <p>The version of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0</p>
             */
            public Builder dubboServiceVersion(String dubboServiceVersion) {
                this.dubboServiceVersion = dubboServiceVersion;
                return this;
            }

            /**
             * <p>The forwarding rules of the Dubbo service.</p>
             */
            public Builder mothedMapList(java.util.List<MothedMapList> mothedMapList) {
                this.mothedMapList = mothedMapList;
                return this;
            }

            public HttpDubboTranscoder build() {
                return new HttpDubboTranscoder(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class RouteServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("HttpDubboTranscoder")
        private HttpDubboTranscoder httpDubboTranscoder;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UnhealthyEndpoints")
        private java.util.List<String> unhealthyEndpoints;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private RouteServices(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.healthStatus = builder.healthStatus;
            this.httpDubboTranscoder = builder.httpDubboTranscoder;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.unhealthyEndpoints = builder.unhealthyEndpoints;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteServices create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return httpDubboTranscoder
         */
        public HttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
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
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return unhealthyEndpoints
         */
        public java.util.List<String> getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private String healthStatus; 
            private HttpDubboTranscoder httpDubboTranscoder; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private String serviceName; 
            private Integer servicePort; 
            private String sourceType; 
            private java.util.List<String> unhealthyEndpoints; 
            private String version; 

            /**
             * <p>The type of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * <p>The name of the group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The transcoder of the Dubbo protocol.</p>
             */
            public Builder httpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
                this.httpDubboTranscoder = httpDubboTranscoder;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight in the form of a percentage value.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>1563</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>hu</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The Dubbo port number.</p>
             * 
             * <strong>example:</strong>
             * <p>20880</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * UnhealthyEndpoints.
             */
            public Builder unhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
                this.unhealthyEndpoints = unhealthyEndpoints;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RouteServices build() {
                return new RouteServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private Comment comment;

        @com.aliyun.core.annotation.NameInMap("DefaultServiceId")
        private Long defaultServiceId;

        @com.aliyun.core.annotation.NameInMap("DefaultServiceName")
        private String defaultServiceName;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("DirectResponse")
        private DirectResponse directResponse;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private Long domainId;

        @com.aliyun.core.annotation.NameInMap("DomainIdList")
        private java.util.List<Long> domainIdList;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainNameList")
        private java.util.List<String> domainNameList;

        @com.aliyun.core.annotation.NameInMap("DynamicRoute")
        private Boolean dynamicRoute;

        @com.aliyun.core.annotation.NameInMap("EnableWaf")
        private String enableWaf;

        @com.aliyun.core.annotation.NameInMap("Fallback")
        private Boolean fallback;

        @com.aliyun.core.annotation.NameInMap("FallbackServices")
        private java.util.List<FallbackServices> fallbackServices;

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

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Predicates")
        private String predicates;

        @com.aliyun.core.annotation.NameInMap("Redirect")
        private Redirect redirect;

        @com.aliyun.core.annotation.NameInMap("RouteOrder")
        private Integer routeOrder;

        @com.aliyun.core.annotation.NameInMap("RoutePredicates")
        private RoutePredicates routePredicates;

        @com.aliyun.core.annotation.NameInMap("RouteServices")
        private java.util.List<RouteServices> routeServices;

        @com.aliyun.core.annotation.NameInMap("Services")
        private String services;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.comment = builder.comment;
            this.defaultServiceId = builder.defaultServiceId;
            this.defaultServiceName = builder.defaultServiceName;
            this.destinationType = builder.destinationType;
            this.directResponse = builder.directResponse;
            this.domainId = builder.domainId;
            this.domainIdList = builder.domainIdList;
            this.domainName = builder.domainName;
            this.domainNameList = builder.domainNameList;
            this.dynamicRoute = builder.dynamicRoute;
            this.enableWaf = builder.enableWaf;
            this.fallback = builder.fallback;
            this.fallbackServices = builder.fallbackServices;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.predicates = builder.predicates;
            this.redirect = builder.redirect;
            this.routeOrder = builder.routeOrder;
            this.routePredicates = builder.routePredicates;
            this.routeServices = builder.routeServices;
            this.services = builder.services;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public Comment getComment() {
            return this.comment;
        }

        /**
         * @return defaultServiceId
         */
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        /**
         * @return defaultServiceName
         */
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return directResponse
         */
        public DirectResponse getDirectResponse() {
            return this.directResponse;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainIdList
         */
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameList
         */
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        /**
         * @return dynamicRoute
         */
        public Boolean getDynamicRoute() {
            return this.dynamicRoute;
        }

        /**
         * @return enableWaf
         */
        public String getEnableWaf() {
            return this.enableWaf;
        }

        /**
         * @return fallback
         */
        public Boolean getFallback() {
            return this.fallback;
        }

        /**
         * @return fallbackServices
         */
        public java.util.List<FallbackServices> getFallbackServices() {
            return this.fallbackServices;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return predicates
         */
        public String getPredicates() {
            return this.predicates;
        }

        /**
         * @return redirect
         */
        public Redirect getRedirect() {
            return this.redirect;
        }

        /**
         * @return routeOrder
         */
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        /**
         * @return routePredicates
         */
        public RoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        /**
         * @return routeServices
         */
        public java.util.List<RouteServices> getRouteServices() {
            return this.routeServices;
        }

        /**
         * @return services
         */
        public String getServices() {
            return this.services;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Comment comment; 
            private Long defaultServiceId; 
            private String defaultServiceName; 
            private String destinationType; 
            private DirectResponse directResponse; 
            private Long domainId; 
            private java.util.List<Long> domainIdList; 
            private String domainName; 
            private java.util.List<String> domainNameList; 
            private Boolean dynamicRoute; 
            private String enableWaf; 
            private Boolean fallback; 
            private java.util.List<FallbackServices> fallbackServices; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String predicates; 
            private Redirect redirect; 
            private Integer routeOrder; 
            private RoutePredicates routePredicates; 
            private java.util.List<RouteServices> routeServices; 
            private String services; 
            private Integer status; 
            private String type; 

            /**
             * <p>The route comment (ingress).</p>
             */
            public Builder comment(Comment comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultServiceId(Long defaultServiceId) {
                this.defaultServiceId = defaultServiceId;
                return this;
            }

            /**
             * <p>The default service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder defaultServiceName(String defaultServiceName) {
                this.defaultServiceName = defaultServiceName;
                return this;
            }

            /**
             * <p>The destination service type.</p>
             * 
             * <strong>example:</strong>
             * <p>Single</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The information about service mocking.</p>
             */
            public Builder directResponse(DirectResponse directResponse) {
                this.directResponse = directResponse;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>265</p>
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain IDs.</p>
             */
            public Builder domainIdList(java.util.List<Long> domainIdList) {
                this.domainIdList = domainIdList;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>y.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The domain names.</p>
             */
            public Builder domainNameList(java.util.List<String> domainNameList) {
                this.domainNameList = domainNameList;
                return this;
            }

            /**
             * DynamicRoute.
             */
            public Builder dynamicRoute(Boolean dynamicRoute) {
                this.dynamicRoute = dynamicRoute;
                return this;
            }

            /**
             * <p>Indicates whether Web Application Firewall (WAF) is activated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableWaf(String enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * <p>Indicates whether the Fallback service is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fallback(Boolean fallback) {
                this.fallback = fallback;
                return this;
            }

            /**
             * <p>The information about the Fallback service.</p>
             */
            public Builder fallbackServices(java.util.List<FallbackServices> fallbackServices) {
                this.fallbackServices = fallbackServices;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>496</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cf0e7f52ecc7429dbc7ba4d5e3656100</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-25T07:14:01.817+0000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The matching rules.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PathPredicates&quot;:{&quot;Path&quot;:&quot;/rpc/compute &quot;,&quot;Type&quot;:&quot;PRE&quot;,&quot;IgnoreCase&quot;:true}}</p>
             */
            public Builder predicates(String predicates) {
                this.predicates = predicates;
                return this;
            }

            /**
             * <p>The information about redirection.</p>
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * <p>The order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * <p>The matching rules.</p>
             */
            public Builder routePredicates(RoutePredicates routePredicates) {
                this.routePredicates = routePredicates;
                return this;
            }

            /**
             * <p>The information about services.</p>
             */
            public Builder routeServices(java.util.List<RouteServices> routeServices) {
                this.routeServices = routeServices;
                return this;
            }

            /**
             * <p>The information about services.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The route type.</p>
             * 
             * <strong>example:</strong>
             * <p>Op</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayRouteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private Long totalSize; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The data structure.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

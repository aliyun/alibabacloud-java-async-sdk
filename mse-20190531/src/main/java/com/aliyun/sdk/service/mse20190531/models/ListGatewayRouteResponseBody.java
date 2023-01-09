// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteResponseBody</p>
 */
public class ListGatewayRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The code returned.
         */
        public Builder code(Integer code) {
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
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewayRouteResponseBody build() {
            return new ListGatewayRouteResponseBody(this);
        } 

    } 

    public static class Comment extends TeaModel {
        @NameInMap("Status")
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
             * The status.
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
    public static class DirectResponse extends TeaModel {
        @NameInMap("Body")
        private String body;

        @NameInMap("Code")
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
             * The return value for service mocking.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * The response code returned.
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
    public static class FallbackServices extends TeaModel {
        @NameInMap("AgreementType")
        private String agreementType;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServicePort")
        private Integer servicePort;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Version")
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
             * The type of the protocol.
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * The name of the group to which the service belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace to which the service belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The weight in the form of a percentage value.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
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
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The service port number.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The source type.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The version of the service.
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
    public static class Redirect extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Host")
        private String host;

        @NameInMap("Path")
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
             * The response code returned.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The hostname to be redirected to.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The path.
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
    public static class HeaderPredicates extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * Header KEY
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value.
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
    public static class PathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @NameInMap("Path")
        private String path;

        @NameInMap("Type")
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
             * Indicates whether case sensitivity is ignored.
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * The path of the node.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The matching type.
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
    public static class QueryPredicates extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * The key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value.
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
    public static class RoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        private java.util.List < HeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        private java.util.List < String > methodPredicates;

        @NameInMap("PathPredicates")
        private PathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        private java.util.List < QueryPredicates> queryPredicates;

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
        public java.util.List < HeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        /**
         * @return methodPredicates
         */
        public java.util.List < String > getMethodPredicates() {
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
        public java.util.List < QueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

        public static final class Builder {
            private java.util.List < HeaderPredicates> headerPredicates; 
            private java.util.List < String > methodPredicates; 
            private PathPredicates pathPredicates; 
            private java.util.List < QueryPredicates> queryPredicates; 

            /**
             * The headers used for route matching.
             */
            public Builder headerPredicates(java.util.List < HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * The HTTP methods used for route matching.
             */
            public Builder methodPredicates(java.util.List < String > methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * The path used for route matching.
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * The parameters used for route matching.
             */
            public Builder queryPredicates(java.util.List < QueryPredicates> queryPredicates) {
                this.queryPredicates = queryPredicates;
                return this;
            }

            public RoutePredicates build() {
                return new RoutePredicates(this);
            } 

        } 

    }
    public static class ParamMapsList extends TeaModel {
        @NameInMap("ExtractKey")
        private String extractKey;

        @NameInMap("ExtractKeySpec")
        private String extractKeySpec;

        @NameInMap("MappingType")
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
             * The key extracted from the input parameter.
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * The position of the input parameter.
             * <p>
             * 
             * > Valid values:
             * 
             * *   `ALL_QUERY_PARAMETER`: request parameter
             * 
             * *   `ALL_HEADER`: request header
             * 
             * *   `ALL_PATH`: request path
             * 
             * *   `ALL_BODY`: request body
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * The type of the backend service parameter.
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
    public static class MothedMapList extends TeaModel {
        @NameInMap("DubboMothedName")
        private String dubboMothedName;

        @NameInMap("HttpMothed")
        private String httpMothed;

        @NameInMap("Mothedpath")
        private String mothedpath;

        @NameInMap("ParamMapsList")
        private java.util.List < ParamMapsList> paramMapsList;

        @NameInMap("PassThroughAllHeaders")
        private String passThroughAllHeaders;

        @NameInMap("PassThroughList")
        private java.util.List < String > passThroughList;

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
        public java.util.List < ParamMapsList> getParamMapsList() {
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
        public java.util.List < String > getPassThroughList() {
            return this.passThroughList;
        }

        public static final class Builder {
            private String dubboMothedName; 
            private String httpMothed; 
            private String mothedpath; 
            private java.util.List < ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List < String > passThroughList; 

            /**
             * The method name of the Dubbo service.
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * The HTTP method.
             * <p>
             * 
             * > Valid values:
             * 
             * *   ALL_GET
             * 
             * *   ALL_POST
             * 
             * *   ALL_PUT
             * 
             * *   ALL_DELETE
             * 
             * *   ALL_PATCH
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * The path used for method matching.
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
                return this;
            }

            /**
             * The information about parameter mappings.
             */
            public Builder paramMapsList(java.util.List < ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * The pass-through type of the header.
             * <p>
             * 
             * > Valid values:
             * 
             * *   PASS_ALL: All headers are passed through.
             * 
             * *   PASS_NOT: All headers are not passed through.
             * 
             * *   PASS_ASSIGN: Specified headers are passed through.
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * The list of headers to be passed through.
             */
            public Builder passThroughList(java.util.List < String > passThroughList) {
                this.passThroughList = passThroughList;
                return this;
            }

            public MothedMapList build() {
                return new MothedMapList(this);
            } 

        } 

    }
    public static class HttpDubboTranscoder extends TeaModel {
        @NameInMap("DubboServiceGroup")
        private String dubboServiceGroup;

        @NameInMap("DubboServiceName")
        private String dubboServiceName;

        @NameInMap("DubboServiceVersion")
        private String dubboServiceVersion;

        @NameInMap("MothedMapList")
        private java.util.List < MothedMapList> mothedMapList;

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
        public java.util.List < MothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

        public static final class Builder {
            private String dubboServiceGroup; 
            private String dubboServiceName; 
            private String dubboServiceVersion; 
            private java.util.List < MothedMapList> mothedMapList; 

            /**
             * The Dubbo service group.
             */
            public Builder dubboServiceGroup(String dubboServiceGroup) {
                this.dubboServiceGroup = dubboServiceGroup;
                return this;
            }

            /**
             * The name of the Dubbo service.
             */
            public Builder dubboServiceName(String dubboServiceName) {
                this.dubboServiceName = dubboServiceName;
                return this;
            }

            /**
             * The version of the Dubbo service.
             */
            public Builder dubboServiceVersion(String dubboServiceVersion) {
                this.dubboServiceVersion = dubboServiceVersion;
                return this;
            }

            /**
             * The forwarding rules of the Dubbo service.
             */
            public Builder mothedMapList(java.util.List < MothedMapList> mothedMapList) {
                this.mothedMapList = mothedMapList;
                return this;
            }

            public HttpDubboTranscoder build() {
                return new HttpDubboTranscoder(this);
            } 

        } 

    }
    public static class RouteServices extends TeaModel {
        @NameInMap("AgreementType")
        private String agreementType;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HttpDubboTranscoder")
        private HttpDubboTranscoder httpDubboTranscoder;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServicePort")
        private Integer servicePort;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Version")
        private String version;

        private RouteServices(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.httpDubboTranscoder = builder.httpDubboTranscoder;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private HttpDubboTranscoder httpDubboTranscoder; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private String serviceName; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            /**
             * The type of the protocol.
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * The name of the group to which the service belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The transcoder of the Dubbo protocol.
             */
            public Builder httpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
                this.httpDubboTranscoder = httpDubboTranscoder;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The weight in the form of a percentage value.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
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
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The Dubbo port number.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The source type.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The version of the service.
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
    public static class Result extends TeaModel {
        @NameInMap("Comment")
        private Comment comment;

        @NameInMap("DefaultServiceId")
        private Long defaultServiceId;

        @NameInMap("DefaultServiceName")
        private String defaultServiceName;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("DirectResponse")
        private DirectResponse directResponse;

        @NameInMap("DomainId")
        private Long domainId;

        @NameInMap("DomainIdList")
        private java.util.List < Long > domainIdList;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameList")
        private java.util.List < String > domainNameList;

        @NameInMap("EnableWaf")
        private String enableWaf;

        @NameInMap("Fallback")
        private Boolean fallback;

        @NameInMap("FallbackServices")
        private java.util.List < FallbackServices> fallbackServices;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Predicates")
        private String predicates;

        @NameInMap("Redirect")
        private Redirect redirect;

        @NameInMap("RouteOrder")
        private Integer routeOrder;

        @NameInMap("RoutePredicates")
        private RoutePredicates routePredicates;

        @NameInMap("RouteServices")
        private java.util.List < RouteServices> routeServices;

        @NameInMap("Services")
        private String services;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
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
        public java.util.List < Long > getDomainIdList() {
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
        public java.util.List < String > getDomainNameList() {
            return this.domainNameList;
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
        public java.util.List < FallbackServices> getFallbackServices() {
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
        public java.util.List < RouteServices> getRouteServices() {
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
            private java.util.List < Long > domainIdList; 
            private String domainName; 
            private java.util.List < String > domainNameList; 
            private String enableWaf; 
            private Boolean fallback; 
            private java.util.List < FallbackServices> fallbackServices; 
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
            private java.util.List < RouteServices> routeServices; 
            private String services; 
            private Integer status; 
            private String type; 

            /**
             * The route comment (ingress).
             */
            public Builder comment(Comment comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The default service ID.
             */
            public Builder defaultServiceId(Long defaultServiceId) {
                this.defaultServiceId = defaultServiceId;
                return this;
            }

            /**
             * The default service name.
             */
            public Builder defaultServiceName(String defaultServiceName) {
                this.defaultServiceName = defaultServiceName;
                return this;
            }

            /**
             * The destination service type.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * The information about service mocking.
             */
            public Builder directResponse(DirectResponse directResponse) {
                this.directResponse = directResponse;
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
             * The IDs of domains.
             */
            public Builder domainIdList(java.util.List < Long > domainIdList) {
                this.domainIdList = domainIdList;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The list of domain names.
             */
            public Builder domainNameList(java.util.List < String > domainNameList) {
                this.domainNameList = domainNameList;
                return this;
            }

            /**
             * Specifies whether to activate Web Application Firewall (WAF).
             */
            public Builder enableWaf(String enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * Specifies whether to enable the Fallback service.
             */
            public Builder fallback(Boolean fallback) {
                this.fallback = fallback;
                return this;
            }

            /**
             * The information about the Fallback service.
             */
            public Builder fallbackServices(java.util.List < FallbackServices> fallbackServices) {
                this.fallbackServices = fallbackServices;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The matching rules.
             */
            public Builder predicates(String predicates) {
                this.predicates = predicates;
                return this;
            }

            /**
             * The information about redirection.
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * The order.
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * The matching rules.
             */
            public Builder routePredicates(RoutePredicates routePredicates) {
                this.routePredicates = routePredicates;
                return this;
            }

            /**
             * The information about services.
             */
            public Builder routeServices(java.util.List < RouteServices> routeServices) {
                this.routeServices = routeServices;
                return this;
            }

            /**
             * The information about services.
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The route type.
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
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private Long totalSize; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The data structure.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of entries returned.
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

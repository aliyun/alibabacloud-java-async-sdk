// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayRouteDetailResponseBody</p>
 */
public class GetGatewayRouteDetailResponseBody extends TeaModel {
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

    private GetGatewayRouteDetailResponseBody(Builder builder) {
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

    public static GetGatewayRouteDetailResponseBody create() {
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
         * The status code returned. A value of 200 indicates that the request is successful.
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

        public GetGatewayRouteDetailResponseBody build() {
            return new GetGatewayRouteDetailResponseBody(this);
        } 

    } 

    public static class Cors extends TeaModel {
        @NameInMap("AllowCredentials")
        private Boolean allowCredentials;

        @NameInMap("AllowHeaders")
        private String allowHeaders;

        @NameInMap("AllowMethods")
        private String allowMethods;

        @NameInMap("AllowOrigins")
        private String allowOrigins;

        @NameInMap("ExposeHeaders")
        private String exposeHeaders;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeUnit")
        private String timeUnit;

        @NameInMap("UnitNum")
        private Long unitNum;

        private Cors(Builder builder) {
            this.allowCredentials = builder.allowCredentials;
            this.allowHeaders = builder.allowHeaders;
            this.allowMethods = builder.allowMethods;
            this.allowOrigins = builder.allowOrigins;
            this.exposeHeaders = builder.exposeHeaders;
            this.status = builder.status;
            this.timeUnit = builder.timeUnit;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cors create() {
            return builder().build();
        }

        /**
         * @return allowCredentials
         */
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        /**
         * @return allowHeaders
         */
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public String getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigins
         */
        public String getAllowOrigins() {
            return this.allowOrigins;
        }

        /**
         * @return exposeHeaders
         */
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private Boolean allowCredentials; 
            private String allowHeaders; 
            private String allowMethods; 
            private String allowOrigins; 
            private String exposeHeaders; 
            private String status; 
            private String timeUnit; 
            private Long unitNum; 

            /**
             * The credentials allowed.
             */
            public Builder allowCredentials(Boolean allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * The headers allowed.
             */
            public Builder allowHeaders(String allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * The methods allowed.
             */
            public Builder allowMethods(String allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * The origins allowed.
             */
            public Builder allowOrigins(String allowOrigins) {
                this.allowOrigins = allowOrigins;
                return this;
            }

            /**
             * The response headers.
             */
            public Builder exposeHeaders(String exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * The unit number.
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public Cors build() {
                return new Cors(this);
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
             * The mock return value.
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
    public static class HTTPRewrite extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Path")
        private String path;

        @NameInMap("PathType")
        private String pathType;

        @NameInMap("Pattern")
        private String pattern;

        @NameInMap("Status")
        private String status;

        @NameInMap("Substitution")
        private String substitution;

        private HTTPRewrite(Builder builder) {
            this.host = builder.host;
            this.path = builder.path;
            this.pathType = builder.pathType;
            this.pattern = builder.pattern;
            this.status = builder.status;
            this.substitution = builder.substitution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPRewrite create() {
            return builder().build();
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

        /**
         * @return pathType
         */
        public String getPathType() {
            return this.pathType;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return substitution
         */
        public String getSubstitution() {
            return this.substitution;
        }

        public static final class Builder {
            private String host; 
            private String path; 
            private String pathType; 
            private String pattern; 
            private String status; 
            private String substitution; 

            /**
             * The hostname of the gateway.
             */
            public Builder host(String host) {
                this.host = host;
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
             * The rewrite type.
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * The matching pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The replacement.
             */
            public Builder substitution(String substitution) {
                this.substitution = substitution;
                return this;
            }

            public HTTPRewrite build() {
                return new HTTPRewrite(this);
            } 

        } 

    }
    public static class HeaderOpItems extends TeaModel {
        @NameInMap("DirectionType")
        private String directionType;

        @NameInMap("Key")
        private String key;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Value")
        private String value;

        private HeaderOpItems(Builder builder) {
            this.directionType = builder.directionType;
            this.key = builder.key;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderOpItems create() {
            return builder().build();
        }

        /**
         * @return directionType
         */
        public String getDirectionType() {
            return this.directionType;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String directionType; 
            private String key; 
            private String opType; 
            private String value; 

            /**
             * The request or response.
             */
            public Builder directionType(String directionType) {
                this.directionType = directionType;
                return this;
            }

            /**
             * The header key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The operation type.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * The header value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderOpItems build() {
                return new HeaderOpItems(this);
            } 

        } 

    }
    public static class HeaderOp extends TeaModel {
        @NameInMap("HeaderOpItems")
        private java.util.List < HeaderOpItems> headerOpItems;

        @NameInMap("Status")
        private String status;

        private HeaderOp(Builder builder) {
            this.headerOpItems = builder.headerOpItems;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderOp create() {
            return builder().build();
        }

        /**
         * @return headerOpItems
         */
        public java.util.List < HeaderOpItems> getHeaderOpItems() {
            return this.headerOpItems;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < HeaderOpItems> headerOpItems; 
            private String status; 

            /**
             * The information about headers.
             */
            public Builder headerOpItems(java.util.List < HeaderOpItems> headerOpItems) {
                this.headerOpItems = headerOpItems;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public HeaderOp build() {
                return new HeaderOp(this);
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
             * The hostname.
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
    public static class Retry extends TeaModel {
        @NameInMap("Attempts")
        private Integer attempts;

        @NameInMap("HttpCodes")
        private java.util.List < String > httpCodes;

        @NameInMap("RetryOn")
        private java.util.List < String > retryOn;

        @NameInMap("Status")
        private String status;

        private Retry(Builder builder) {
            this.attempts = builder.attempts;
            this.httpCodes = builder.httpCodes;
            this.retryOn = builder.retryOn;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Retry create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return httpCodes
         */
        public java.util.List < String > getHttpCodes() {
            return this.httpCodes;
        }

        /**
         * @return retryOn
         */
        public java.util.List < String > getRetryOn() {
            return this.retryOn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer attempts; 
            private java.util.List < String > httpCodes; 
            private java.util.List < String > retryOn; 
            private String status; 

            /**
             * The number of retries allowed.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * The HTTP status code returned.
             */
            public Builder httpCodes(java.util.List < String > httpCodes) {
                this.httpCodes = httpCodes;
                return this;
            }

            /**
             * The retry condition.
             */
            public Builder retryOn(java.util.List < String > retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * The retry status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Retry build() {
                return new Retry(this);
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
             * The key of the request header.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the request header.
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
             * The path.
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
             * The name of the parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter.
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
             * The information about header matching.
             */
            public Builder headerPredicates(java.util.List < HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * The information about method matching.
             */
            public Builder methodPredicates(java.util.List < String > methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * The information about route matching.
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * The information about parameter matching.
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
    public static class RouteServices extends TeaModel {
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

        private RouteServices(Builder builder) {
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
             * The name of the service.
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
             * The weight.
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
             * The source type of the service.
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
    public static class Timeout extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TimeUnit")
        private String timeUnit;

        @NameInMap("UnitNum")
        private Integer unitNum;

        private Timeout(Builder builder) {
            this.status = builder.status;
            this.timeUnit = builder.timeUnit;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeout create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private String status; 
            private String timeUnit; 
            private Integer unitNum; 

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time unit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * The unit number.
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public Timeout build() {
                return new Timeout(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AhasStatus")
        private Integer ahasStatus;

        @NameInMap("Cors")
        private Cors cors;

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
        private Boolean enableWaf;

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

        @NameInMap("HTTPRewrite")
        private HTTPRewrite HTTPRewrite;

        @NameInMap("HeaderOp")
        private HeaderOp headerOp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Predicates")
        private String predicates;

        @NameInMap("Redirect")
        private Redirect redirect;

        @NameInMap("Retry")
        private Retry retry;

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

        @NameInMap("Timeout")
        private Timeout timeout;

        private Data(Builder builder) {
            this.ahasStatus = builder.ahasStatus;
            this.cors = builder.cors;
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
            this.HTTPRewrite = builder.HTTPRewrite;
            this.headerOp = builder.headerOp;
            this.id = builder.id;
            this.name = builder.name;
            this.predicates = builder.predicates;
            this.redirect = builder.redirect;
            this.retry = builder.retry;
            this.routeOrder = builder.routeOrder;
            this.routePredicates = builder.routePredicates;
            this.routeServices = builder.routeServices;
            this.services = builder.services;
            this.status = builder.status;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ahasStatus
         */
        public Integer getAhasStatus() {
            return this.ahasStatus;
        }

        /**
         * @return cors
         */
        public Cors getCors() {
            return this.cors;
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
        public Boolean getEnableWaf() {
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
         * @return HTTPRewrite
         */
        public HTTPRewrite getHTTPRewrite() {
            return this.HTTPRewrite;
        }

        /**
         * @return headerOp
         */
        public HeaderOp getHeaderOp() {
            return this.headerOp;
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
         * @return retry
         */
        public Retry getRetry() {
            return this.retry;
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
         * @return timeout
         */
        public Timeout getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer ahasStatus; 
            private Cors cors; 
            private Long defaultServiceId; 
            private String defaultServiceName; 
            private String destinationType; 
            private DirectResponse directResponse; 
            private Long domainId; 
            private java.util.List < Long > domainIdList; 
            private String domainName; 
            private java.util.List < String > domainNameList; 
            private Boolean enableWaf; 
            private Boolean fallback; 
            private java.util.List < FallbackServices> fallbackServices; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private HTTPRewrite HTTPRewrite; 
            private HeaderOp headerOp; 
            private Long id; 
            private String name; 
            private String predicates; 
            private Redirect redirect; 
            private Retry retry; 
            private Integer routeOrder; 
            private RoutePredicates routePredicates; 
            private java.util.List < RouteServices> routeServices; 
            private String services; 
            private Integer status; 
            private Timeout timeout; 

            /**
             * The status of Application High Availability Service (AHAS).
             */
            public Builder ahasStatus(Integer ahasStatus) {
                this.ahasStatus = ahasStatus;
                return this;
            }

            /**
             * The configuration for cross-origin resource sharing (CORS).
             */
            public Builder cors(Cors cors) {
                this.cors = cors;
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
             * Indicates whether WAF is activated.
             */
            public Builder enableWaf(Boolean enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * Indicates whether the Fallback service is enabled.
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
             * The last modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The information about the rewrite policy.
             */
            public Builder HTTPRewrite(HTTPRewrite HTTPRewrite) {
                this.HTTPRewrite = HTTPRewrite;
                return this;
            }

            /**
             * The header settings.
             */
            public Builder headerOp(HeaderOp headerOp) {
                this.headerOp = headerOp;
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
             * The matching conditions.
             */
            public Builder predicates(String predicates) {
                this.predicates = predicates;
                return this;
            }

            /**
             * The configuration of the redirection.
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * The retry configuration.
             */
            public Builder retry(Retry retry) {
                this.retry = retry;
                return this;
            }

            /**
             * The sequence number of the route.
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * The information about route matching.
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
             * The configurations of services.
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * The status of the route. Valid values:
             * <p>
             * 
             * *   0: unpublished
             * *   2: publishing
             * *   3: published
             * *   4: editing (updated but not published)
             * *   5: unpublishing
             * *   6: unavailable
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The timeout configuration.
             */
            public Builder timeout(Timeout timeout) {
                this.timeout = timeout;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

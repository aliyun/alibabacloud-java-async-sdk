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
 * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayRouteDetailResponseBody</p>
 */
public class GetGatewayRouteDetailResponseBody extends TeaModel {
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

        private Builder(GetGatewayRouteDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
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
         * <p>FDF2D16C-5D28-5FAA-A56B-30BDE3559880</p>
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

        public GetGatewayRouteDetailResponseBody build() {
            return new GetGatewayRouteDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class Cors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCredentials")
        private Boolean allowCredentials;

        @com.aliyun.core.annotation.NameInMap("AllowHeaders")
        private String allowHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowMethods")
        private String allowMethods;

        @com.aliyun.core.annotation.NameInMap("AllowOrigins")
        private String allowOrigins;

        @com.aliyun.core.annotation.NameInMap("ExposeHeaders")
        private String exposeHeaders;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
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

            private Builder() {
            } 

            private Builder(Cors model) {
                this.allowCredentials = model.allowCredentials;
                this.allowHeaders = model.allowHeaders;
                this.allowMethods = model.allowMethods;
                this.allowOrigins = model.allowOrigins;
                this.exposeHeaders = model.exposeHeaders;
                this.status = model.status;
                this.timeUnit = model.timeUnit;
                this.unitNum = model.unitNum;
            } 

            /**
             * <p>The credentials allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowCredentials(Boolean allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * <p>The headers allowed.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder allowHeaders(String allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * <p>The methods allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH</p>
             */
            public Builder allowMethods(String allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * <p>The origins allowed.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder allowOrigins(String allowOrigins) {
                this.allowOrigins = allowOrigins;
                return this;
            }

            /**
             * <p>The response headers.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder exposeHeaders(String exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time unit.</p>
             * 
             * <strong>example:</strong>
             * <p>h</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The unit number.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DirectResponse model) {
                this.body = model.body;
                this.code = model.code;
            } 

            /**
             * <p>The mock return value.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FallbackServices model) {
                this.agreementType = model.agreementType;
                this.groupName = model.groupName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.percent = model.percent;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.servicePort = model.servicePort;
                this.sourceType = model.sourceType;
                this.version = model.version;
            } 

            /**
             * <p>The protocol type.</p>
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
             * <p>namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight in the form of a percentage value.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The port number of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>8848</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The service version.</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class FlowMirror extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetServiceId")
        private Long targetServiceId;

        @com.aliyun.core.annotation.NameInMap("TargetServiceName")
        private String targetServiceName;

        private FlowMirror(Builder builder) {
            this.percentage = builder.percentage;
            this.port = builder.port;
            this.status = builder.status;
            this.targetServiceId = builder.targetServiceId;
            this.targetServiceName = builder.targetServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowMirror create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetServiceId
         */
        public Long getTargetServiceId() {
            return this.targetServiceId;
        }

        /**
         * @return targetServiceName
         */
        public String getTargetServiceName() {
            return this.targetServiceName;
        }

        public static final class Builder {
            private Integer percentage; 
            private Integer port; 
            private String status; 
            private Long targetServiceId; 
            private String targetServiceName; 

            private Builder() {
            } 

            private Builder(FlowMirror model) {
                this.percentage = model.percentage;
                this.port = model.port;
                this.status = model.status;
                this.targetServiceId = model.targetServiceId;
                this.targetServiceName = model.targetServiceName;
            } 

            /**
             * <p>流量复制比例（%），取值0-100。</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>目标服务端口。</p>
             * 
             * <strong>example:</strong>
             * <p>8790</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>开启状态，取值：</p>
             * <ul>
             * <li>on：开启</li>
             * <li>off：关闭</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>目标服务ID。</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder targetServiceId(Long targetServiceId) {
                this.targetServiceId = targetServiceId;
                return this;
            }

            /**
             * <p>目标服务名称。</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder targetServiceName(String targetServiceName) {
                this.targetServiceName = targetServiceName;
                return this;
            }

            public FlowMirror build() {
                return new FlowMirror(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class HTTPRewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("PathType")
        private String pathType;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Substitution")
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

            private Builder() {
            } 

            private Builder(HTTPRewrite model) {
                this.host = model.host;
                this.path = model.path;
                this.pathType = model.pathType;
                this.pattern = model.pattern;
                this.status = model.status;
                this.substitution = model.substitution;
            } 

            /**
             * <p>The hostname of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyuncs.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The path of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/client</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The rewrite type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * <p>The matching pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The status of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The replacement.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class HeaderOpItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectionType")
        private String directionType;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(HeaderOpItems model) {
                this.directionType = model.directionType;
                this.key = model.key;
                this.opType = model.opType;
                this.value = model.value;
            } 

            /**
             * <p>The request or response.</p>
             * 
             * <strong>example:</strong>
             * <p>Response</p>
             */
            public Builder directionType(String directionType) {
                this.directionType = directionType;
                return this;
            }

            /**
             * <p>The header key.</p>
             * 
             * <strong>example:</strong>
             * <p>debug</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The type of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Add</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The header value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class HeaderOp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderOpItems")
        private java.util.List<HeaderOpItems> headerOpItems;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<HeaderOpItems> getHeaderOpItems() {
            return this.headerOpItems;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<HeaderOpItems> headerOpItems; 
            private String status; 

            private Builder() {
            } 

            private Builder(HeaderOp model) {
                this.headerOpItems = model.headerOpItems;
                this.status = model.status;
            } 

            /**
             * <p>The information about headers.</p>
             */
            public Builder headerOpItems(java.util.List<HeaderOpItems> headerOpItems) {
                this.headerOpItems = headerOpItems;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Redirect model) {
                this.code = model.code;
                this.host = model.host;
                this.path = model.path;
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

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>10111</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class Retry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        private Integer attempts;

        @com.aliyun.core.annotation.NameInMap("HttpCodes")
        private java.util.List<String> httpCodes;

        @com.aliyun.core.annotation.NameInMap("RetryOn")
        private java.util.List<String> retryOn;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        /**
         * @return retryOn
         */
        public java.util.List<String> getRetryOn() {
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
            private java.util.List<String> httpCodes; 
            private java.util.List<String> retryOn; 
            private String status; 

            private Builder() {
            } 

            private Builder(Retry model) {
                this.attempts = model.attempts;
                this.httpCodes = model.httpCodes;
                this.retryOn = model.retryOn;
                this.status = model.status;
            } 

            /**
             * <p>The number of retries allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>The HTTP status codes.</p>
             */
            public Builder httpCodes(java.util.List<String> httpCodes) {
                this.httpCodes = httpCodes;
                return this;
            }

            /**
             * <p>The retry condition.</p>
             */
            public Builder retryOn(java.util.List<String> retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * <p>The retry status.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HeaderPredicates model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The key of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The route type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PathPredicates model) {
                this.ignoreCase = model.ignoreCase;
                this.path = model.path;
                this.type = model.type;
            } 

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
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/api</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(QueryPredicates model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The route type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RoutePredicates model) {
                this.headerPredicates = model.headerPredicates;
                this.methodPredicates = model.methodPredicates;
                this.pathPredicates = model.pathPredicates;
                this.queryPredicates = model.queryPredicates;
            } 

            /**
             * <p>The information about header matching.</p>
             */
            public Builder headerPredicates(java.util.List<HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * <p>The information about method matching.</p>
             */
            public Builder methodPredicates(java.util.List<String> methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * <p>The information about route matching.</p>
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * <p>The information about parameter matching.</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ParamMapsList model) {
                this.extractKey = model.extractKey;
                this.extractKeySpec = model.extractKeySpec;
                this.mappingType = model.mappingType;
            } 

            /**
             * ExtractKey.
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * ExtractKeySpec.
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * MappingType.
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MothedMapList model) {
                this.dubboMothedName = model.dubboMothedName;
                this.httpMothed = model.httpMothed;
                this.mothedpath = model.mothedpath;
                this.paramMapsList = model.paramMapsList;
                this.passThroughAllHeaders = model.passThroughAllHeaders;
                this.passThroughList = model.passThroughList;
            } 

            /**
             * DubboMothedName.
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * HttpMothed.
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * Mothedpath.
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
                return this;
            }

            /**
             * ParamMapsList.
             */
            public Builder paramMapsList(java.util.List<ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * PassThroughAllHeaders.
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * PassThroughList.
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HttpDubboTranscoder model) {
                this.dubboServiceGroup = model.dubboServiceGroup;
                this.dubboServiceName = model.dubboServiceName;
                this.dubboServiceVersion = model.dubboServiceVersion;
                this.mothedMapList = model.mothedMapList;
            } 

            /**
             * DubboServiceGroup.
             */
            public Builder dubboServiceGroup(String dubboServiceGroup) {
                this.dubboServiceGroup = dubboServiceGroup;
                return this;
            }

            /**
             * DubboServiceName.
             */
            public Builder dubboServiceName(String dubboServiceName) {
                this.dubboServiceName = dubboServiceName;
                return this;
            }

            /**
             * DubboServiceVersion.
             */
            public Builder dubboServiceVersion(String dubboServiceVersion) {
                this.dubboServiceVersion = dubboServiceVersion;
                return this;
            }

            /**
             * MothedMapList.
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RouteServices model) {
                this.agreementType = model.agreementType;
                this.groupName = model.groupName;
                this.healthStatus = model.healthStatus;
                this.httpDubboTranscoder = model.httpDubboTranscoder;
                this.name = model.name;
                this.namespace = model.namespace;
                this.percent = model.percent;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.servicePort = model.servicePort;
                this.sourceType = model.sourceType;
                this.unhealthyEndpoints = model.unhealthyEndpoints;
                this.version = model.version;
            } 

            /**
             * <p>The protocol type.</p>
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
             * HttpDubboTranscoder.
             */
            public Builder httpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
                this.httpDubboTranscoder = httpDubboTranscoder;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>dubbo4</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>782</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>xkc-crm</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The port number of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>20880</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type of the service.</p>
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
             * <p>The service version.</p>
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
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class Timeout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
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

            private Builder() {
            } 

            private Builder(Timeout model) {
                this.status = model.status;
                this.timeUnit = model.timeUnit;
                this.unitNum = model.unitNum;
            } 

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time unit.</p>
             * 
             * <strong>example:</strong>
             * <p>s</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The unit number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link GetGatewayRouteDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayRouteDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AhasStatus")
        private Integer ahasStatus;

        @com.aliyun.core.annotation.NameInMap("Cors")
        private Cors cors;

        @com.aliyun.core.annotation.NameInMap("DefaultServiceId")
        private Long defaultServiceId;

        @com.aliyun.core.annotation.NameInMap("DefaultServiceName")
        private String defaultServiceName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("EnableWaf")
        private Boolean enableWaf;

        @com.aliyun.core.annotation.NameInMap("Fallback")
        private Boolean fallback;

        @com.aliyun.core.annotation.NameInMap("FallbackServices")
        private java.util.List<FallbackServices> fallbackServices;

        @com.aliyun.core.annotation.NameInMap("FlowMirror")
        private FlowMirror flowMirror;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HTTPRewrite")
        private HTTPRewrite HTTPRewrite;

        @com.aliyun.core.annotation.NameInMap("HeaderOp")
        private HeaderOp headerOp;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private String policies;

        @com.aliyun.core.annotation.NameInMap("Predicates")
        private String predicates;

        @com.aliyun.core.annotation.NameInMap("Redirect")
        private Redirect redirect;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Retry retry;

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

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Timeout timeout;

        private Data(Builder builder) {
            this.ahasStatus = builder.ahasStatus;
            this.cors = builder.cors;
            this.defaultServiceId = builder.defaultServiceId;
            this.defaultServiceName = builder.defaultServiceName;
            this.description = builder.description;
            this.destinationType = builder.destinationType;
            this.directResponse = builder.directResponse;
            this.domainId = builder.domainId;
            this.domainIdList = builder.domainIdList;
            this.domainName = builder.domainName;
            this.domainNameList = builder.domainNameList;
            this.enableWaf = builder.enableWaf;
            this.fallback = builder.fallback;
            this.fallbackServices = builder.fallbackServices;
            this.flowMirror = builder.flowMirror;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.HTTPRewrite = builder.HTTPRewrite;
            this.headerOp = builder.headerOp;
            this.id = builder.id;
            this.name = builder.name;
            this.policies = builder.policies;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public java.util.List<FallbackServices> getFallbackServices() {
            return this.fallbackServices;
        }

        /**
         * @return flowMirror
         */
        public FlowMirror getFlowMirror() {
            return this.flowMirror;
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
         * @return policies
         */
        public String getPolicies() {
            return this.policies;
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
            private String description; 
            private String destinationType; 
            private DirectResponse directResponse; 
            private Long domainId; 
            private java.util.List<Long> domainIdList; 
            private String domainName; 
            private java.util.List<String> domainNameList; 
            private Boolean enableWaf; 
            private Boolean fallback; 
            private java.util.List<FallbackServices> fallbackServices; 
            private FlowMirror flowMirror; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private HTTPRewrite HTTPRewrite; 
            private HeaderOp headerOp; 
            private Long id; 
            private String name; 
            private String policies; 
            private String predicates; 
            private Redirect redirect; 
            private Retry retry; 
            private Integer routeOrder; 
            private RoutePredicates routePredicates; 
            private java.util.List<RouteServices> routeServices; 
            private String services; 
            private Integer status; 
            private Timeout timeout; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ahasStatus = model.ahasStatus;
                this.cors = model.cors;
                this.defaultServiceId = model.defaultServiceId;
                this.defaultServiceName = model.defaultServiceName;
                this.description = model.description;
                this.destinationType = model.destinationType;
                this.directResponse = model.directResponse;
                this.domainId = model.domainId;
                this.domainIdList = model.domainIdList;
                this.domainName = model.domainName;
                this.domainNameList = model.domainNameList;
                this.enableWaf = model.enableWaf;
                this.fallback = model.fallback;
                this.fallbackServices = model.fallbackServices;
                this.flowMirror = model.flowMirror;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.HTTPRewrite = model.HTTPRewrite;
                this.headerOp = model.headerOp;
                this.id = model.id;
                this.name = model.name;
                this.policies = model.policies;
                this.predicates = model.predicates;
                this.redirect = model.redirect;
                this.retry = model.retry;
                this.routeOrder = model.routeOrder;
                this.routePredicates = model.routePredicates;
                this.routeServices = model.routeServices;
                this.services = model.services;
                this.status = model.status;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The status of Application High Availability Service (AHAS).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ahasStatus(Integer ahasStatus) {
                this.ahasStatus = ahasStatus;
                return this;
            }

            /**
             * <p>The configuration for cross-origin resource sharing (CORS).</p>
             */
            public Builder cors(Cors cors) {
                this.cors = cors;
                return this;
            }

            /**
             * <p>The default service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>235</p>
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The IDs of domains.</p>
             */
            public Builder domainIdList(java.util.List<Long> domainIdList) {
                this.domainIdList = domainIdList;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>123.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The list of domain names.</p>
             */
            public Builder domainNameList(java.util.List<String> domainNameList) {
                this.domainNameList = domainNameList;
                return this;
            }

            /**
             * <p>Indicates whether Web Application Firewall (WAF) is activated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWaf(Boolean enableWaf) {
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
             * <p>The information of the Fallback service.</p>
             */
            public Builder fallbackServices(java.util.List<FallbackServices> fallbackServices) {
                this.fallbackServices = fallbackServices;
                return this;
            }

            /**
             * <p>流量镜像配置。</p>
             */
            public Builder flowMirror(FlowMirror flowMirror) {
                this.flowMirror = flowMirror;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-7ea3da97b96543e19f6c597c****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The information about the rewrite policy.</p>
             */
            public Builder HTTPRewrite(HTTPRewrite HTTPRewrite) {
                this.HTTPRewrite = HTTPRewrite;
                return this;
            }

            /**
             * <p>The header settings.</p>
             */
            public Builder headerOp(HeaderOp headerOp) {
                this.headerOp = headerOp;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1050</p>
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
             * <p>The routing policy in a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;CORS&quot;: &quot;{&quot;allowMethods&quot;:&quot;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH&quot;,&quot;allowHeaders&quot;:&quot;<em>&quot;,&quot;exposeHeaders&quot;:&quot;</em>&quot;,&quot;unitNum&quot;:12,&quot;allowCredentials&quot;:true,&quot;status&quot;:&quot;off&quot;,&quot;allowOrigins&quot;:&quot;*&quot;,&quot;timeUnit&quot;:&quot;h&quot;}&quot;,
             *       &quot;Timeout&quot;: &quot;{&quot;unitNum&quot;:10,&quot;timeUnit&quot;:&quot;s&quot;,&quot;status&quot;:&quot;off&quot;}&quot;,
             *       &quot;Retry&quot;: &quot;{&quot;attempts&quot;:2,&quot;retryOn&quot;:[&quot;5xx&quot;],&quot;status&quot;:&quot;off&quot;}&quot;,
             *       &quot;HTTPRewrite&quot;: &quot;{&quot;pathType&quot;:&quot;EQUAL&quot;,&quot;path&quot;:&quot;/o&quot;,&quot;status&quot;:&quot;off&quot;}&quot;,
             *       &quot;Waf&quot;: &quot;{&quot;enabled&quot;:false}&quot;,
             *       &quot;HeaderOp&quot;: &quot;{&quot;status&quot;:&quot;off&quot;,&quot;headerOpItems&quot;:[{&quot;directionType&quot;:&quot;Request&quot;,&quot;opType&quot;:&quot;Add&quot;,&quot;key&quot;:&quot;kkk&quot;,&quot;value&quot;:&quot;ll&quot;}]}&quot;
             * }</p>
             */
            public Builder policies(String policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The matching conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder predicates(String predicates) {
                this.predicates = predicates;
                return this;
            }

            /**
             * <p>The configuration of the redirection.</p>
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * <p>The retry configuration.</p>
             */
            public Builder retry(Retry retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>The sequence number of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * <p>The information about route matching.</p>
             */
            public Builder routePredicates(RoutePredicates routePredicates) {
                this.routePredicates = routePredicates;
                return this;
            }

            /**
             * <p>The services.</p>
             */
            public Builder routeServices(java.util.List<RouteServices> routeServices) {
                this.routeServices = routeServices;
                return this;
            }

            /**
             * <p>The configurations of services.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Percent&quot;:100,&quot;ServiceId&quot;:126}]</p>
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * <p>The status of the route. Valid values:</p>
             * <ul>
             * <li>0: unpublished</li>
             * <li>2: publishing</li>
             * <li>3: published</li>
             * <li>4: editing (updated but not published)</li>
             * <li>5: unpublishing</li>
             * <li>6: unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The timeout configuration.</p>
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

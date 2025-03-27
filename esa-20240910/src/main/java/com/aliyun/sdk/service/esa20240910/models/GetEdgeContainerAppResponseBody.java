// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetEdgeContainerAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppResponseBody</p>
 */
public class GetEdgeContainerAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("App")
    private App app;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEdgeContainerAppResponseBody(Builder builder) {
        this.app = builder.app;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private App app; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerAppResponseBody model) {
            this.app = model.app;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The basic information about the application.</p>
         */
        public Builder app(App app) {
            this.app = app;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEdgeContainerAppResponseBody build() {
            return new GetEdgeContainerAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailTimes")
        private Integer failTimes;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HttpCode")
        private String httpCode;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("SuccTimes")
        private Integer succTimes;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private HealthCheck(Builder builder) {
            this.failTimes = builder.failTimes;
            this.host = builder.host;
            this.httpCode = builder.httpCode;
            this.interval = builder.interval;
            this.method = builder.method;
            this.port = builder.port;
            this.succTimes = builder.succTimes;
            this.timeout = builder.timeout;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return failTimes
         */
        public Integer getFailTimes() {
            return this.failTimes;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return succTimes
         */
        public Integer getSuccTimes() {
            return this.succTimes;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Integer failTimes; 
            private String host; 
            private String httpCode; 
            private Integer interval; 
            private String method; 
            private Integer port; 
            private Integer succTimes; 
            private Integer timeout; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.failTimes = model.failTimes;
                this.host = model.host;
                this.httpCode = model.httpCode;
                this.interval = model.interval;
                this.method = model.method;
                this.port = model.port;
                this.succTimes = model.succTimes;
                this.timeout = model.timeout;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * <p>The number of consecutive failed health checks required for an application to be considered as unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder failTimes(Integer failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The range of health check status codes that indicate successful health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>http_2xx</p>
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * <p>The interval between health checks. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The HTTP method that the health check request uses.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The health check port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks required for an application to be considered as healthy.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder succTimes(Integer succTimes) {
                this.succTimes = succTimes;
                return this;
            }

            /**
             * <p>The timeout period of the health check. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The health check type. Valid values:</p>
             * <ul>
             * <li>l7</li>
             * <li>l4</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>l7</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The health check URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/health_check</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEdgeContainerAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppResponseBody</p>
     */
    public static class App extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QuicCid")
        private String quicCid;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionCount")
        private Integer versionCount;

        private App(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.gatewayType = builder.gatewayType;
            this.healthCheck = builder.healthCheck;
            this.name = builder.name;
            this.quicCid = builder.quicCid;
            this.remarks = builder.remarks;
            this.servicePort = builder.servicePort;
            this.status = builder.status;
            this.targetPort = builder.targetPort;
            this.updateTime = builder.updateTime;
            this.versionCount = builder.versionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quicCid
         */
        public String getQuicCid() {
            return this.quicCid;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionCount
         */
        public Integer getVersionCount() {
            return this.versionCount;
        }

        public static final class Builder {
            private String appId; 
            private String createTime; 
            private String domainName; 
            private String gatewayType; 
            private HealthCheck healthCheck; 
            private String name; 
            private String quicCid; 
            private String remarks; 
            private Integer servicePort; 
            private String status; 
            private Integer targetPort; 
            private String updateTime; 
            private Integer versionCount; 

            private Builder() {
            } 

            private Builder(App model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.gatewayType = model.gatewayType;
                this.healthCheck = model.healthCheck;
                this.name = model.name;
                this.quicCid = model.quicCid;
                this.remarks = model.remarks;
                this.servicePort = model.servicePort;
                this.status = model.status;
                this.targetPort = model.targetPort;
                this.updateTime = model.updateTime;
                this.versionCount = model.versionCount;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-88068867578379****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T05:58:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain name that is associated with the application. If no domain name is associated with the application, the value is an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.1feel.cn">www.1feel.cn</a></p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The type of the gateway. Valid values:</p>
             * <ul>
             * <li>l7: Layer 7 gateway.</li>
             * <li>l4: Layer 4 gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>l7</p>
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * <p>The information about health checks.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether QUIC is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder quicCid(String quicCid) {
                this.quicCid = quicCid;
                return this;
            }

            /**
             * <p>The remarks about the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test app</p>
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * <p>The server port. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The status of the application. Valid values:</p>
             * <ul>
             * <li>creating: The application is being created.</li>
             * <li>failed: The application failed to be created.</li>
             * <li>created: The application is created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * <p>The time when the application was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-26T02:35:58Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The number of versions of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionCount(Integer versionCount) {
                this.versionCount = versionCount;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
}

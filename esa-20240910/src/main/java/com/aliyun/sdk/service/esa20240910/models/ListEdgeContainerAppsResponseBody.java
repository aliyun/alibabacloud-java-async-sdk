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
 * {@link ListEdgeContainerAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeContainerAppsResponseBody</p>
 */
public class ListEdgeContainerAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apps")
    private java.util.List<Apps> apps;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEdgeContainerAppsResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apps
     */
    public java.util.List<Apps> getApps() {
        return this.apps;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Apps> apps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEdgeContainerAppsResponseBody model) {
            this.apps = model.apps;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried applications.</p>
         */
        public Builder apps(java.util.List<Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEdgeContainerAppsResponseBody build() {
            return new ListEdgeContainerAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEdgeContainerAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppsResponseBody</p>
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
             * <p>The number of consecutive failed health checks for an application to be considered unhealthy.</p>
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
             * <p>http_2XX</p>
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
             * <p>The HTTP method used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The health check port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks for an application to be considered healthy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder succTimes(Integer succTimes) {
                this.succTimes = succTimes;
                return this;
            }

            /**
             * <p>The timeout period of health checks. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The type of health checks. Valid values:</p>
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
     * {@link ListEdgeContainerAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppsResponseBody</p>
     */
    public static class Apps extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

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

        private Apps(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.gatewayType = builder.gatewayType;
            this.healthCheck = builder.healthCheck;
            this.name = builder.name;
            this.percentage = builder.percentage;
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

        public static Apps create() {
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
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
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
            private Integer percentage; 
            private String quicCid; 
            private String remarks; 
            private Integer servicePort; 
            private String status; 
            private Integer targetPort; 
            private String updateTime; 
            private Integer versionCount; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.gatewayType = model.gatewayType;
                this.healthCheck = model.healthCheck;
                this.name = model.name;
                this.percentage = model.percentage;
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
             * <p>The time when the version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-01T16:16:27.418298794+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain name associated with the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
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
             * <p>app-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The progress of the application creation task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
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
             * <p>The remarks.</p>
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
             * <p>2023-11-15T12:11:02Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The number of versions of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder versionCount(Integer versionCount) {
                this.versionCount = versionCount;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}

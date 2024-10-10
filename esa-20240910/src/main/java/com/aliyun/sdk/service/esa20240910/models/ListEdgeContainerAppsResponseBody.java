// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < Apps> apps;

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

    /**
     * @return apps
     */
    public java.util.List < Apps> getApps() {
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
        private java.util.List < Apps> apps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Apps.
         */
        public Builder apps(java.util.List < Apps> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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

            /**
             * FailTimes.
             */
            public Builder failTimes(Integer failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * HttpCode.
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * SuccTimes.
             */
            public Builder succTimes(Integer succTimes) {
                this.succTimes = succTimes;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
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

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * GatewayType.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * HealthCheck.
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
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
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * QuicCid.
             */
            public Builder quicCid(String quicCid) {
                this.quicCid = quicCid;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * ServicePort.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VersionCount.
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

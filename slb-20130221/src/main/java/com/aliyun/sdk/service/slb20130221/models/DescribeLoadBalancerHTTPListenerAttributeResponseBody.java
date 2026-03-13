// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221.models;

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
 * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("Gzip")
    private String gzip;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("MaxConnection")
    private Integer maxConnection;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("SecurityStatus")
    private String securityStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StickySession")
    private String stickySession;

    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBID")
    private String xForwardedForSLBID;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBIP")
    private String xForwardedForSLBIP;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_proto")
    private String xForwardedForProto;

    private DescribeLoadBalancerHTTPListenerAttributeResponseBody(Builder builder) {
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.domain = builder.domain;
        this.gzip = builder.gzip;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthyThreshold = builder.healthyThreshold;
        this.interval = builder.interval;
        this.listenerPort = builder.listenerPort;
        this.maxConnection = builder.maxConnection;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.securityStatus = builder.securityStatus;
        this.status = builder.status;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.URI = builder.URI;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
        this.xForwardedFor = builder.xForwardedFor;
        this.xForwardedForSLBID = builder.xForwardedForSLBID;
        this.xForwardedForSLBIP = builder.xForwardedForSLBIP;
        this.xForwardedForProto = builder.xForwardedForProto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerHTTPListenerAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendServerPort
     */
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return cookie
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return gzip
     */
    public String getGzip() {
        return this.gzip;
    }

    /**
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthCheckConnectPort
     */
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    /**
     * @return healthCheckHttpCode
     */
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return maxConnection
     */
    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return securityStatus
     */
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stickySession
     */
    public String getStickySession() {
        return this.stickySession;
    }

    /**
     * @return stickySessionType
     */
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    /**
     * @return xForwardedForSLBID
     */
    public String getXForwardedForSLBID() {
        return this.xForwardedForSLBID;
    }

    /**
     * @return xForwardedForSLBIP
     */
    public String getXForwardedForSLBIP() {
        return this.xForwardedForSLBIP;
    }

    /**
     * @return xForwardedForProto
     */
    public String getXForwardedForProto() {
        return this.xForwardedForProto;
    }

    public static final class Builder {
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String cookie; 
        private Integer cookieTimeout; 
        private String domain; 
        private String gzip; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private String healthCheckHttpCode; 
        private Integer healthCheckTimeout; 
        private Integer healthyThreshold; 
        private Integer interval; 
        private Integer listenerPort; 
        private Integer maxConnection; 
        private String requestId; 
        private String scheduler; 
        private String securityStatus; 
        private String status; 
        private String stickySession; 
        private String stickySessionType; 
        private String URI; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 
        private String xForwardedFor; 
        private String xForwardedForSLBID; 
        private String xForwardedForSLBIP; 
        private String xForwardedForProto; 

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerHTTPListenerAttributeResponseBody model) {
            this.backendServerPort = model.backendServerPort;
            this.bandwidth = model.bandwidth;
            this.cookie = model.cookie;
            this.cookieTimeout = model.cookieTimeout;
            this.domain = model.domain;
            this.gzip = model.gzip;
            this.healthCheck = model.healthCheck;
            this.healthCheckConnectPort = model.healthCheckConnectPort;
            this.healthCheckHttpCode = model.healthCheckHttpCode;
            this.healthCheckTimeout = model.healthCheckTimeout;
            this.healthyThreshold = model.healthyThreshold;
            this.interval = model.interval;
            this.listenerPort = model.listenerPort;
            this.maxConnection = model.maxConnection;
            this.requestId = model.requestId;
            this.scheduler = model.scheduler;
            this.securityStatus = model.securityStatus;
            this.status = model.status;
            this.stickySession = model.stickySession;
            this.stickySessionType = model.stickySessionType;
            this.URI = model.URI;
            this.unhealthyThreshold = model.unhealthyThreshold;
            this.vServerGroupId = model.vServerGroupId;
            this.xForwardedFor = model.xForwardedFor;
            this.xForwardedForSLBID = model.xForwardedForSLBID;
            this.xForwardedForSLBIP = model.xForwardedForSLBIP;
            this.xForwardedForProto = model.xForwardedForProto;
        } 

        /**
         * BackendServerPort.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * Cookie.
         */
        public Builder cookie(String cookie) {
            this.cookie = cookie;
            return this;
        }

        /**
         * CookieTimeout.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Gzip.
         */
        public Builder gzip(String gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * HealthCheckConnectPort.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * HealthCheckHttpCode.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * HealthCheckTimeout.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
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
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * MaxConnection.
         */
        public Builder maxConnection(Integer maxConnection) {
            this.maxConnection = maxConnection;
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
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * SecurityStatus.
         */
        public Builder securityStatus(String securityStatus) {
            this.securityStatus = securityStatus;
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
         * StickySession.
         */
        public Builder stickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }

        /**
         * StickySessionType.
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * URI.
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * VServerGroupId.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * XForwardedFor.
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        /**
         * XForwardedFor_SLBID.
         */
        public Builder xForwardedForSLBID(String xForwardedForSLBID) {
            this.xForwardedForSLBID = xForwardedForSLBID;
            return this;
        }

        /**
         * XForwardedFor_SLBIP.
         */
        public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
            this.xForwardedForSLBIP = xForwardedForSLBIP;
            return this;
        }

        /**
         * XForwardedFor_proto.
         */
        public Builder xForwardedForProto(String xForwardedForProto) {
            this.xForwardedForProto = xForwardedForProto;
            return this;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerHTTPListenerAttributeResponseBody(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerListenersResponseBody</p>
 */
public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List<Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoadBalancerListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List<Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>A list of listeners of the CLB instance.</p>
         * <blockquote>
         * <p> This parameter is not returned if the CLB instance does not have a listener.</p>
         * </blockquote>
         */
        public Builder listeners(java.util.List<Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it indicates that no subsequent query is to be sent.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancerListenersResponseBody build() {
            return new DescribeLoadBalancerListenersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class HTTPListenerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("ForwardPort")
        private Integer forwardPort;

        @com.aliyun.core.annotation.NameInMap("Gzip")
        private String gzip;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("ListenerForward")
        private String listenerForward;

        @com.aliyun.core.annotation.NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @com.aliyun.core.annotation.NameInMap("StickySession")
        private String stickySession;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor")
        private String xForwardedFor;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientSrcPort")
        private String xForwardedForClientSrcPort;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBID")
        private String xForwardedForSLBID;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBIP")
        private String xForwardedForSLBIP;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBPORT")
        private String xForwardedForSLBPORT;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_proto")
        private String xForwardedForProto;

        private HTTPListenerConfig(Builder builder) {
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.forwardPort = builder.forwardPort;
            this.gzip = builder.gzip;
            this.healthCheck = builder.healthCheck;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckTimeout = builder.healthCheckTimeout;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckURI = builder.healthCheckURI;
            this.healthyThreshold = builder.healthyThreshold;
            this.idleTimeout = builder.idleTimeout;
            this.listenerForward = builder.listenerForward;
            this.requestTimeout = builder.requestTimeout;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.unhealthyThreshold = builder.unhealthyThreshold;
            this.xForwardedFor = builder.xForwardedFor;
            this.xForwardedForClientSrcPort = builder.xForwardedForClientSrcPort;
            this.xForwardedForSLBID = builder.xForwardedForSLBID;
            this.xForwardedForSLBIP = builder.xForwardedForSLBIP;
            this.xForwardedForSLBPORT = builder.xForwardedForSLBPORT;
            this.xForwardedForProto = builder.xForwardedForProto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPListenerConfig create() {
            return builder().build();
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
         * @return forwardPort
         */
        public Integer getForwardPort() {
            return this.forwardPort;
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
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckHttpCode
         */
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        /**
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckURI
         */
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerForward
         */
        public String getListenerForward() {
            return this.listenerForward;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
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
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        /**
         * @return xForwardedFor
         */
        public String getXForwardedFor() {
            return this.xForwardedFor;
        }

        /**
         * @return xForwardedForClientSrcPort
         */
        public String getXForwardedForClientSrcPort() {
            return this.xForwardedForClientSrcPort;
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
         * @return xForwardedForSLBPORT
         */
        public String getXForwardedForSLBPORT() {
            return this.xForwardedForSLBPORT;
        }

        /**
         * @return xForwardedForProto
         */
        public String getXForwardedForProto() {
            return this.xForwardedForProto;
        }

        public static final class Builder {
            private String cookie; 
            private Integer cookieTimeout; 
            private Integer forwardPort; 
            private String gzip; 
            private String healthCheck; 
            private Integer healthCheckConnectPort; 
            private String healthCheckDomain; 
            private String healthCheckHttpCode; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private Integer healthCheckTimeout; 
            private String healthCheckType; 
            private String healthCheckURI; 
            private Integer healthyThreshold; 
            private Integer idleTimeout; 
            private String listenerForward; 
            private Integer requestTimeout; 
            private String stickySession; 
            private String stickySessionType; 
            private Integer unhealthyThreshold; 
            private String xForwardedFor; 
            private String xForwardedForClientSrcPort; 
            private String xForwardedForSLBID; 
            private String xForwardedForSLBIP; 
            private String xForwardedForSLBPORT; 
            private String xForwardedForProto; 

            /**
             * <p>The cookie configures for the server.</p>
             * 
             * <strong>example:</strong>
             * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The maximum amount of time to wait before the session cookie expires. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>The listener port that is used for HTTP-to-HTTPS redirection.</p>
             * <blockquote>
             * <p> If the <strong>ListenerForward</strong> parameter is set to <strong>off</strong>, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * <p>Indicates whether GZIP compression is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The port that is used for health checks.</p>
             * <blockquote>
             * <p> This parameter takes effect only when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>The HTTP status code that indicates a healthy backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>http_2xx,http_3xx</p>
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The HTTP version for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP 1.0</p>
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The health check method. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The maximum timeout period of a health check. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The protocol that you want to use for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The URI that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
             * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>Indicates whether HTTP-to-HTTPS redirection is enabled for the listener. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1</strong> to <strong>180</strong>.</p>
             * <p>If no response is received from a backend server during the request timeout period, CLB sends the <code>HTTP 504</code> status code to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * <p>Indicates whether session persistence is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * <p>The method used to handle the cookie. Valid values:</p>
             * <ul>
             * <li><strong>insert</strong>: inserts a cookie. CLB inserts the SERVERID cookie to the HTTP or HTTPS response to the first request from a client. Subsequent requests that carry the SERVERID cookie from the client are forwarded to the same backend server as the first request.</li>
             * <li><strong>server</strong>: rewrites the original cookie. CLB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to preserve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedFor(String xForwardedFor) {
                this.xForwardedFor = xForwardedFor;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientSrcPort</code> header is used to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
                this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
                return this;
            }

            /**
             * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForSLBID(String xForwardedForSLBID) {
                this.xForwardedForSLBID = xForwardedForSLBID;
                return this;
            }

            /**
             * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the VIP of the client. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
                this.xForwardedForSLBIP = xForwardedForSLBIP;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listener port of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
                this.xForwardedForSLBPORT = xForwardedForSLBPORT;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to obtain the listener protocol. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForProto(String xForwardedForProto) {
                this.xForwardedForProto = xForwardedForProto;
                return this;
            }

            public HTTPListenerConfig build() {
                return new HTTPListenerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class HTTPSListenerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CACertificateId")
        private String CACertificateId;

        @com.aliyun.core.annotation.NameInMap("Cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @com.aliyun.core.annotation.NameInMap("EnableHttp2")
        private String enableHttp2;

        @com.aliyun.core.annotation.NameInMap("Gzip")
        private String gzip;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
        private String serverCertificateId;

        @com.aliyun.core.annotation.NameInMap("StickySession")
        private String stickySession;

        @com.aliyun.core.annotation.NameInMap("StickySessionType")
        private String stickySessionType;

        @com.aliyun.core.annotation.NameInMap("TLSCipherPolicy")
        private String TLSCipherPolicy;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor")
        private String xForwardedFor;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertClientVerify")
        private String xForwardedForClientCertClientVerify;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertFingerprint")
        private String xForwardedForClientCertFingerprint;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertIssuerDN")
        private String xForwardedForClientCertIssuerDN;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertSubjectDN")
        private String xForwardedForClientCertSubjectDN;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientSrcPort")
        private String xForwardedForClientSrcPort;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBID")
        private String xForwardedForSLBID;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBIP")
        private String xForwardedForSLBIP;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBPORT")
        private String xForwardedForSLBPORT;

        @com.aliyun.core.annotation.NameInMap("XForwardedFor_proto")
        private String xForwardedForProto;

        private HTTPSListenerConfig(Builder builder) {
            this.CACertificateId = builder.CACertificateId;
            this.cookie = builder.cookie;
            this.cookieTimeout = builder.cookieTimeout;
            this.enableHttp2 = builder.enableHttp2;
            this.gzip = builder.gzip;
            this.healthCheck = builder.healthCheck;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckTimeout = builder.healthCheckTimeout;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckURI = builder.healthCheckURI;
            this.healthyThreshold = builder.healthyThreshold;
            this.idleTimeout = builder.idleTimeout;
            this.requestTimeout = builder.requestTimeout;
            this.serverCertificateId = builder.serverCertificateId;
            this.stickySession = builder.stickySession;
            this.stickySessionType = builder.stickySessionType;
            this.TLSCipherPolicy = builder.TLSCipherPolicy;
            this.unhealthyThreshold = builder.unhealthyThreshold;
            this.xForwardedFor = builder.xForwardedFor;
            this.xForwardedForClientCertClientVerify = builder.xForwardedForClientCertClientVerify;
            this.xForwardedForClientCertFingerprint = builder.xForwardedForClientCertFingerprint;
            this.xForwardedForClientCertIssuerDN = builder.xForwardedForClientCertIssuerDN;
            this.xForwardedForClientCertSubjectDN = builder.xForwardedForClientCertSubjectDN;
            this.xForwardedForClientSrcPort = builder.xForwardedForClientSrcPort;
            this.xForwardedForSLBID = builder.xForwardedForSLBID;
            this.xForwardedForSLBIP = builder.xForwardedForSLBIP;
            this.xForwardedForSLBPORT = builder.xForwardedForSLBPORT;
            this.xForwardedForProto = builder.xForwardedForProto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPSListenerConfig create() {
            return builder().build();
        }

        /**
         * @return CACertificateId
         */
        public String getCACertificateId() {
            return this.CACertificateId;
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
         * @return enableHttp2
         */
        public String getEnableHttp2() {
            return this.enableHttp2;
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
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckHttpCode
         */
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        /**
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckURI
         */
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        /**
         * @return serverCertificateId
         */
        public String getServerCertificateId() {
            return this.serverCertificateId;
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
         * @return TLSCipherPolicy
         */
        public String getTLSCipherPolicy() {
            return this.TLSCipherPolicy;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        /**
         * @return xForwardedFor
         */
        public String getXForwardedFor() {
            return this.xForwardedFor;
        }

        /**
         * @return xForwardedForClientCertClientVerify
         */
        public String getXForwardedForClientCertClientVerify() {
            return this.xForwardedForClientCertClientVerify;
        }

        /**
         * @return xForwardedForClientCertFingerprint
         */
        public String getXForwardedForClientCertFingerprint() {
            return this.xForwardedForClientCertFingerprint;
        }

        /**
         * @return xForwardedForClientCertIssuerDN
         */
        public String getXForwardedForClientCertIssuerDN() {
            return this.xForwardedForClientCertIssuerDN;
        }

        /**
         * @return xForwardedForClientCertSubjectDN
         */
        public String getXForwardedForClientCertSubjectDN() {
            return this.xForwardedForClientCertSubjectDN;
        }

        /**
         * @return xForwardedForClientSrcPort
         */
        public String getXForwardedForClientSrcPort() {
            return this.xForwardedForClientSrcPort;
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
         * @return xForwardedForSLBPORT
         */
        public String getXForwardedForSLBPORT() {
            return this.xForwardedForSLBPORT;
        }

        /**
         * @return xForwardedForProto
         */
        public String getXForwardedForProto() {
            return this.xForwardedForProto;
        }

        public static final class Builder {
            private String CACertificateId; 
            private String cookie; 
            private Integer cookieTimeout; 
            private String enableHttp2; 
            private String gzip; 
            private String healthCheck; 
            private Integer healthCheckConnectPort; 
            private String healthCheckDomain; 
            private String healthCheckHttpCode; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private Integer healthCheckTimeout; 
            private String healthCheckType; 
            private String healthCheckURI; 
            private Integer healthyThreshold; 
            private Integer idleTimeout; 
            private Integer requestTimeout; 
            private String serverCertificateId; 
            private String stickySession; 
            private String stickySessionType; 
            private String TLSCipherPolicy; 
            private Integer unhealthyThreshold; 
            private String xForwardedFor; 
            private String xForwardedForClientCertClientVerify; 
            private String xForwardedForClientCertFingerprint; 
            private String xForwardedForClientCertIssuerDN; 
            private String xForwardedForClientCertSubjectDN; 
            private String xForwardedForClientSrcPort; 
            private String xForwardedForSLBID; 
            private String xForwardedForSLBIP; 
            private String xForwardedForSLBPORT; 
            private String xForwardedForProto; 

            /**
             * <p>The ID of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>idkp-234-cn-test-0****</p>
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
                return this;
            }

            /**
             * <p>The cookie configures for the server.</p>
             * 
             * <strong>example:</strong>
             * <p>B490B5EBF6F3CD402E515D22BCDA****</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>The maximum amount of time to wait before the session cookie expires. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * <p>Indicates whether <code>HTTP 2.0</code> is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder enableHttp2(String enableHttp2) {
                this.enableHttp2 = enableHttp2;
                return this;
            }

            /**
             * <p>Indicates whether GZIP compression is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The port that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>The HTTP status code that indicates a healthy backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>http_2xx,http_3xx</p>
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The HTTP version for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP 1.0</p>
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The health check method.</p>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The timeout period of a health check response. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * <p>The protocol that you want to use for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The URI that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
             * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>The request timeout period. Unit: seconds. Valid values: <strong>1</strong> to <strong>180</strong>.</p>
             * <p>If no response is received from a backend server during the request timeout period, CLB sends the <code>HTTP 504</code> status code to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * <p>The ID of the server certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>idkp-123-cn-test-0****</p>
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            /**
             * <p>Indicates whether session persistence is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * <p>The method used to handle the cookie.</p>
             * <ul>
             * <li><strong>insert</strong>: inserts a cookie. CLB inserts the SERVERID cookie to the HTTP or HTTPS response to the first request from a client. Subsequent requests that carry the SERVERID cookie from the client are forwarded to the same backend server as the first request.</li>
             * <li><strong>server</strong>: rewrites the original cookie. CLB rewrites the custom cookies in requests from a client. Subsequent requests from the client that carry the new cookie are forwarded to the same backend server as the first request.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>insert</p>
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * <p>A TLS security policy contains TLS protocols and cipher suites available for HTTPS.</p>
             * <ul>
             * <li><p><strong>tls_cipher_policy_1_0</strong>:</p>
             * <p>Supported TLS versions: TLSv1.0, TLSv1.1, and TLSv1.2.</p>
             * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
             * </li>
             * <li><p><strong>tls_cipher_policy_1_1</strong>:</p>
             * <p>Supported TLS versions: TLSv1.1 and TLSv1.2.</p>
             * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
             * </li>
             * <li><p><strong>tls_cipher_policy_1_2</strong></p>
             * <p>Supported TLS versions: TLSv1.2.</p>
             * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.</p>
             * </li>
             * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
             * <p>Supported TLS versions: TLSv1.2.</p>
             * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
             * </li>
             * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
             * <p>Supported TLS versions: TLSv1.2 and TLSv1.3.</p>
             * <p>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tls_cipher_policy_1_0</p>
             */
            public Builder TLSCipherPolicy(String TLSCipherPolicy) {
                this.TLSCipherPolicy = TLSCipherPolicy;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to retrieve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedFor(String xForwardedFor) {
                this.xForwardedFor = xForwardedFor;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientCertClientVerify</code> header is used to obtain the verification result of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForClientCertClientVerify(String xForwardedForClientCertClientVerify) {
                this.xForwardedForClientCertClientVerify = xForwardedForClientCertClientVerify;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientCertFingerprint</code> header is used to obtain the fingerprint of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForClientCertFingerprint(String xForwardedForClientCertFingerprint) {
                this.xForwardedForClientCertFingerprint = xForwardedForClientCertFingerprint;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientCertIssuerDN</code> header is used to obtain information about the authority that issues the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForClientCertIssuerDN(String xForwardedForClientCertIssuerDN) {
                this.xForwardedForClientCertIssuerDN = xForwardedForClientCertIssuerDN;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientCertSubjectDN</code> header is used to obtain information about the owner of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForClientCertSubjectDN(String xForwardedForClientCertSubjectDN) {
                this.xForwardedForClientCertSubjectDN = xForwardedForClientCertSubjectDN;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_ClientSrcPort</code> header is used to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
                this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
                return this;
            }

            /**
             * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForSLBID(String xForwardedForSLBID) {
                this.xForwardedForSLBID = xForwardedForSLBID;
                return this;
            }

            /**
             * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the VIP of the client. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
                this.xForwardedForSLBIP = xForwardedForSLBIP;
                return this;
            }

            /**
             * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listener port of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
                this.xForwardedForSLBPORT = xForwardedForSLBPORT;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to obtain the listener protocol. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder xForwardedForProto(String xForwardedForProto) {
                this.xForwardedForProto = xForwardedForProto;
                return this;
            }

            public HTTPSListenerConfig build() {
                return new HTTPSListenerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class TCPListenerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDrain")
        private String connectionDrain;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
        private Integer establishedTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
        private Integer persistenceTimeout;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Enabled")
        private String proxyProtocolV2Enabled;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private TCPListenerConfig(Builder builder) {
            this.connectionDrain = builder.connectionDrain;
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
            this.establishedTimeout = builder.establishedTimeout;
            this.healthCheck = builder.healthCheck;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckURI = builder.healthCheckURI;
            this.healthyThreshold = builder.healthyThreshold;
            this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
            this.persistenceTimeout = builder.persistenceTimeout;
            this.proxyProtocolV2Enabled = builder.proxyProtocolV2Enabled;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TCPListenerConfig create() {
            return builder().build();
        }

        /**
         * @return connectionDrain
         */
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        /**
         * @return establishedTimeout
         */
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
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
         * @return healthCheckConnectTimeout
         */
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        /**
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckHttpCode
         */
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckURI
         */
        public String getHealthCheckURI() {
            return this.healthCheckURI;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return masterSlaveServerGroupId
         */
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        /**
         * @return persistenceTimeout
         */
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        /**
         * @return proxyProtocolV2Enabled
         */
        public String getProxyProtocolV2Enabled() {
            return this.proxyProtocolV2Enabled;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private String connectionDrain; 
            private Integer connectionDrainTimeout; 
            private Integer establishedTimeout; 
            private String healthCheck; 
            private Integer healthCheckConnectPort; 
            private Integer healthCheckConnectTimeout; 
            private String healthCheckDomain; 
            private String healthCheckHttpCode; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private String healthCheckType; 
            private String healthCheckURI; 
            private Integer healthyThreshold; 
            private String masterSlaveServerGroupId; 
            private Integer persistenceTimeout; 
            private String proxyProtocolV2Enabled; 
            private Integer unhealthyThreshold; 

            /**
             * <p>Indicates whether connection draining is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * <p>The timeout period of connection draining. Unit: seconds.</p>
             * <p>Value values: <strong>10 to 900</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * <p>The timeout period of a connection. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder establishedTimeout(Integer establishedTimeout) {
                this.establishedTimeout = establishedTimeout;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The port that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The timeout period of health checks. Unit: seconds.</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * <p>The domain name that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>The HTTP status code that indicates a healthy backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>http_2xx,http_3xx</p>
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The health check method.</p>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * <p>The protocol that you want to use for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The URI that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health check status of the backend server changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The ID of the primary/secondary server group associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-0bfucw*****</p>
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * <p>Indicates whether session persistence is enabled. Unit: seconds.</p>
             * <p>Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
             * <p><strong>0</strong> indicates that session persistence is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol is used to pass source client IP addresses to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the burst feature for the data disk.</li>
             * <li><strong>false</strong>: The task is not being retried.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder proxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
                this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health check status of the backend server changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public TCPListenerConfig build() {
                return new TCPListenerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class UDPListenerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDrain")
        private String connectionDrain;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckExp")
        private String healthCheckExp;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckReq")
        private String healthCheckReq;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Enabled")
        private String proxyProtocolV2Enabled;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private UDPListenerConfig(Builder builder) {
            this.connectionDrain = builder.connectionDrain;
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
            this.healthCheck = builder.healthCheck;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckExp = builder.healthCheckExp;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckReq = builder.healthCheckReq;
            this.healthyThreshold = builder.healthyThreshold;
            this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
            this.proxyProtocolV2Enabled = builder.proxyProtocolV2Enabled;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UDPListenerConfig create() {
            return builder().build();
        }

        /**
         * @return connectionDrain
         */
        public String getConnectionDrain() {
            return this.connectionDrain;
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
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
         * @return healthCheckConnectTimeout
         */
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        /**
         * @return healthCheckExp
         */
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckReq
         */
        public String getHealthCheckReq() {
            return this.healthCheckReq;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return masterSlaveServerGroupId
         */
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        /**
         * @return proxyProtocolV2Enabled
         */
        public String getProxyProtocolV2Enabled() {
            return this.proxyProtocolV2Enabled;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private String connectionDrain; 
            private Integer connectionDrainTimeout; 
            private String healthCheck; 
            private Integer healthCheckConnectPort; 
            private Integer healthCheckConnectTimeout; 
            private String healthCheckExp; 
            private Integer healthCheckInterval; 
            private String healthCheckReq; 
            private Integer healthyThreshold; 
            private String masterSlaveServerGroupId; 
            private String proxyProtocolV2Enabled; 
            private Integer unhealthyThreshold; 

            /**
             * <p>Indicates whether connection draining is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * <p>The timeout period of connection draining. Unit: seconds.</p>
             * <p>Value values: <strong>10 to 900</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The port that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The timeout period for a health check response.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * <p>The response string of UDP health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthCheckExp(String healthCheckExp) {
                this.healthCheckExp = healthCheckExp;
                return this;
            }

            /**
             * <p>The interval between two consecutive health checks. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The request string of UDP health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
                return this;
            }

            /**
             * <p>The number of times that a backend server must consecutively pass health checks before it is declared healthy.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The ID of the primary/secondary server group that is associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-0bfucw****</p>
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol is used to pass source client IP addresses to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the burst feature for the data disk.</li>
             * <li><strong>false</strong>: The task is not being retried.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder proxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
                this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
                return this;
            }

            /**
             * <p>The number of times that a backend server must consecutively fail health checks before it is declared unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public UDPListenerConfig build() {
                return new UDPListenerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclIds")
        private java.util.List<String> aclIds;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("BackendServerPort")
        private Integer backendServerPort;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HTTPListenerConfig")
        private HTTPListenerConfig HTTPListenerConfig;

        @com.aliyun.core.annotation.NameInMap("HTTPSListenerConfig")
        private HTTPSListenerConfig HTTPSListenerConfig;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private String scheduler;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TCPListenerConfig")
        private TCPListenerConfig TCPListenerConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UDPListenerConfig")
        private UDPListenerConfig UDPListenerConfig;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Listeners(Builder builder) {
            this.aclId = builder.aclId;
            this.aclIds = builder.aclIds;
            this.aclStatus = builder.aclStatus;
            this.aclType = builder.aclType;
            this.backendServerPort = builder.backendServerPort;
            this.bandwidth = builder.bandwidth;
            this.description = builder.description;
            this.HTTPListenerConfig = builder.HTTPListenerConfig;
            this.HTTPSListenerConfig = builder.HTTPSListenerConfig;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.loadBalancerId = builder.loadBalancerId;
            this.scheduler = builder.scheduler;
            this.status = builder.status;
            this.TCPListenerConfig = builder.TCPListenerConfig;
            this.tags = builder.tags;
            this.UDPListenerConfig = builder.UDPListenerConfig;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclIds
         */
        public java.util.List<String> getAclIds() {
            return this.aclIds;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return HTTPListenerConfig
         */
        public HTTPListenerConfig getHTTPListenerConfig() {
            return this.HTTPListenerConfig;
        }

        /**
         * @return HTTPSListenerConfig
         */
        public HTTPSListenerConfig getHTTPSListenerConfig() {
            return this.HTTPSListenerConfig;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return scheduler
         */
        public String getScheduler() {
            return this.scheduler;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return TCPListenerConfig
         */
        public TCPListenerConfig getTCPListenerConfig() {
            return this.TCPListenerConfig;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return UDPListenerConfig
         */
        public UDPListenerConfig getUDPListenerConfig() {
            return this.UDPListenerConfig;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private String aclId; 
            private java.util.List<String> aclIds; 
            private String aclStatus; 
            private String aclType; 
            private Integer backendServerPort; 
            private Integer bandwidth; 
            private String description; 
            private HTTPListenerConfig HTTPListenerConfig; 
            private HTTPSListenerConfig HTTPSListenerConfig; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String loadBalancerId; 
            private String scheduler; 
            private String status; 
            private TCPListenerConfig TCPListenerConfig; 
            private java.util.List<Tags> tags; 
            private UDPListenerConfig UDPListenerConfig; 
            private String vServerGroupId; 

            /**
             * <p>The ID of the access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spzasx****</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The IDs of the ACLs.</p>
             */
            public Builder aclIds(java.util.List<String> aclIds) {
                this.aclIds = aclIds;
                return this;
            }

            /**
             * <p>Indicates whether access control is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * <p>The type of access control. Valid values:</p>
             * <ul>
             * <li><strong>white</strong>: The listener forwards requests only from IP addresses and CIDR blocks on the whitelist. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured, the listener forwards requests only from IP addresses that are added to the whitelist.</li>
             * </ul>
             * <p>If you configure a whitelist but no IP address is added to the whitelist, the listener forwards all requests.</p>
             * <ul>
             * <li><strong>black</strong>: The listener blocks requests from IP addresses and CIDR blocks on the blacklist.</li>
             * </ul>
             * <p>If you configure a blacklist but no IP address is added to the blacklist, the listener forwards all requests.</p>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The port of the backend server.</p>
             * <blockquote>
             * <p> This parameter takes effect only when the <code>VServerGroupId</code> and <code>MasterSlaveServerGroupId</code> parameters are both empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder backendServerPort(Integer backendServerPort) {
                this.backendServerPort = backendServerPort;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The description of the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configurations of the HTTP listener.</p>
             */
            public Builder HTTPListenerConfig(HTTPListenerConfig HTTPListenerConfig) {
                this.HTTPListenerConfig = HTTPListenerConfig;
                return this;
            }

            /**
             * <p>The configurations of the HTTPS listener.</p>
             */
            public Builder HTTPSListenerConfig(HTTPSListenerConfig HTTPSListenerConfig) {
                this.HTTPSListenerConfig = HTTPSListenerConfig;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The protocol used by the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The scheduling algorithm. Valid values:</p>
             * <ul>
             * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</li>
             * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
             * <li><strong>sch</strong>: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
             * <li><strong>tch</strong>: specifies consistent hashing based on the source IP address, destination IP address, source port, and destination port. Requests that have the same four factors are distributed to the same backend server.</li>
             * <li><strong>qch</strong>: specifies consistent hashing based on Quick UDP Internet Connection (QUIC) IDs. Requests that contain the same QUIC ID are scheduled to the same backend server.</li>
             * </ul>
             * <blockquote>
             * <p> Only high-performance CLB instances support the <strong>sch</strong>, <strong>tch</strong>, and <strong>qch</strong> consistent hashing algorithms.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>wrr</p>
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * <p>The status of the listener. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>stopped</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configurations of the TCP listener.</p>
             */
            public Builder TCPListenerConfig(TCPListenerConfig TCPListenerConfig) {
                this.TCPListenerConfig = TCPListenerConfig;
                return this;
            }

            /**
             * <p>A list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The configurations of the UDP listener.</p>
             */
            public Builder UDPListenerConfig(UDPListenerConfig UDPListenerConfig) {
                this.UDPListenerConfig = UDPListenerConfig;
                return this;
            }

            /**
             * <p>The ID of the vServer group associated with the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-cige6j****</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}

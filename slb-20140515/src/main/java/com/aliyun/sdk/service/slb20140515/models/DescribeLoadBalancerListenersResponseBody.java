// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerListenersResponseBody</p>
 */
public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

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
    public java.util.List < Listeners> getListeners() {
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
        private java.util.List < Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of listeners on the CLB instance.
         * <p>
         * 
         * >  This parameter is not returned if no listener is created on the CLB instance.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no subsequent query is to be sent.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancerListenersResponseBody build() {
            return new DescribeLoadBalancerListenersResponseBody(this);
        } 

    } 

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
             * The cookie that is configured on the server.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of a cookie. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **86400**.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * The listening port that is used to redirect HTTP requests to HTTPS.
             * <p>
             * 
             * >  If the **ListenerForward** parameter is set to **off**, this parameter is not displayed.
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * Indicates whether Gzip compression is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The port that is used for health checks.
             * <p>
             * 
             * >  This parameter takes effect when the **HealthCheck** parameter is set to **on**.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The domain name that is used for health checks.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * The HTTP status codes that are used to determine whether the backend server passes the health check.
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * The HTTP version that is used for health checks.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The health check method. Valid values: **head** and **get**.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The maximum timeout period of a health check. Unit: seconds.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The protocol that is used for health checks.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The URI that is used for health checks.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **60**.
             * <p>
             * 
             * If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * Indicates whether HTTP-to-HTTPS redirection is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * The timeout period of a request. Unit: seconds. Valid values: **1** to **180**.
             * <p>
             * 
             * If no response is received from a backend server during the request timeout period, CLB sends the `HTTP 504` status code to the client.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * Indicates whether session persistence is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * The method that is used to handle a cookie. Valid values:
             * <p>
             * 
             * *   **insert**: inserts a cookie. CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client contains this cookie, and the listener forwards this request to the recorded backend server.
             * *   **server**: rewrites a cookie. When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor` header is used to retrieve client IP addresses. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedFor(String xForwardedFor) {
                this.xForwardedFor = xForwardedFor;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientSrcPort` header is used to retrieve the client port. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
                this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
                return this;
            }

            /**
             * Indicates whether the `SLB-ID` header is used to retrieve the ID of the CLB instance. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBID(String xForwardedForSLBID) {
                this.xForwardedForSLBID = xForwardedForSLBID;
                return this;
            }

            /**
             * Indicates whether the `SLB-IP` header is used to retrieve the virtual IP address requested by the client. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
                this.xForwardedForSLBIP = xForwardedForSLBIP;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_SLBPORT` header is used to retrieve the listening port. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
                this.xForwardedForSLBPORT = xForwardedForSLBPORT;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listening protocol. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
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
             * The ID of the certificate authority (CA) certificate.
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
                return this;
            }

            /**
             * The cookie that is configured on the server.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * The timeout period of a cookie. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **86400**.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * Indicates whether `HTTP 2.0` is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder enableHttp2(String enableHttp2) {
                this.enableHttp2 = enableHttp2;
                return this;
            }

            /**
             * Indicates whether Gzip compression is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The port that is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The domain name that is used for health checks.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * The HTTP status codes that are used to determine whether the backend server passes the health check.
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * The HTTP version that is used for health checks.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The health check method.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The maximum timeout period of a health check. Unit: seconds.
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * The protocol that is used for health checks.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The URI that is used for health checks.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **60**.
             * <p>
             * 
             * If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * The request timeout period. Unit: seconds. Valid values: **1** to **180**.
             * <p>
             * 
             * If no response is received from a backend server during the request timeout period, CLB sends the `HTTP 504` status code to the client.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * The ID of the server certificate.
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            /**
             * Indicates whether session persistence is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder stickySession(String stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            /**
             * The method that is used to handle a cookie.
             * <p>
             * 
             * *   **insert**: inserts a cookie. CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client contains this cookie, and the listener forwards this request to the recorded backend server.
             * *   **server**: rewrites a cookie. When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.
             */
            public Builder stickySessionType(String stickySessionType) {
                this.stickySessionType = stickySessionType;
                return this;
            }

            /**
             * The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.
             * <p>
             * 
             * *   **tls_cipher_policy\_1\_0**:
             * 
             *     Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2
             * 
             *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_1**:
             * 
             *     Supported TLS versions: TLS 1.1 and TLS 1.2
             * 
             *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_2**
             * 
             *     Supported TLS version: TLS 1.2
             * 
             *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_2\_strict**
             * 
             *     Supported TLS version: TLS 1.2
             * 
             *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
             * 
             * *   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**
             * 
             *     Supported TLS versions: TLS 1.2 and TLS 1.3
             * 
             *     Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
             */
            public Builder TLSCipherPolicy(String TLSCipherPolicy) {
                this.TLSCipherPolicy = TLSCipherPolicy;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor` header is used to retrieve client IP addresses. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedFor(String xForwardedFor) {
                this.xForwardedFor = xForwardedFor;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientCertClientVerify` header is used to retrieve the verification result of the client certificate. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientCertClientVerify(String xForwardedForClientCertClientVerify) {
                this.xForwardedForClientCertClientVerify = xForwardedForClientCertClientVerify;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientCertFingerprint` header is used to retrieve the fingerprint of the client certificate. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientCertFingerprint(String xForwardedForClientCertFingerprint) {
                this.xForwardedForClientCertFingerprint = xForwardedForClientCertFingerprint;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientCertIssuerDN` header is used to retrieve information about the authority that issues the client certificate. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientCertIssuerDN(String xForwardedForClientCertIssuerDN) {
                this.xForwardedForClientCertIssuerDN = xForwardedForClientCertIssuerDN;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientCertSubjectDN` header is used to retrieve information about the owner of the client certificate. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientCertSubjectDN(String xForwardedForClientCertSubjectDN) {
                this.xForwardedForClientCertSubjectDN = xForwardedForClientCertSubjectDN;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_ClientSrcPort` header is used to retrieve the client port. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
                this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
                return this;
            }

            /**
             * Indicates whether the `SLB-ID` header is used to retrieve the ID of the CLB instance. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBID(String xForwardedForSLBID) {
                this.xForwardedForSLBID = xForwardedForSLBID;
                return this;
            }

            /**
             * Indicates whether the `SLB-IP` header is used to retrieve the virtual IP address requested by the client. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
                this.xForwardedForSLBIP = xForwardedForSLBIP;
                return this;
            }

            /**
             * Indicates whether the `XForwardedFor_SLBPORT` header is used to retrieve the listening port. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
                this.xForwardedForSLBPORT = xForwardedForSLBPORT;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listening protocol. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
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
             * Indicates whether connection draining is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * The timeout period of connection draining. Unit: seconds.
             * <p>
             * 
             * Value values: **10 to 900**.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * The timeout period of a connection. Unit: seconds.
             */
            public Builder establishedTimeout(Integer establishedTimeout) {
                this.establishedTimeout = establishedTimeout;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The port that is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The timeout period of health checks. Unit: seconds.
             * <p>
             * 
             * Valid values: **1** to **300**.
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * The domain name that is used for health checks.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * The HTTP status codes that are used to determine whether the backend server passes the health check.
             */
            public Builder healthCheckHttpCode(String healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * The interval between two consecutive health checks. Unit: seconds.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The health check method.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * The protocol that is used for health checks.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The URI that is used for health checks.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The ID of the primary/secondary server group that is associated with the listener.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * Indicates whether session persistence is enabled. Unit: seconds.
             * <p>
             * 
             * Valid values: **0** to **3600**.
             * 
             * **0** indicates that session persistence is disabled.
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder proxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
                this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2** to **10**.
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
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * For more information about how to obtain a tag value, see [DescribeTagKeyList](~~145557~~).
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
             * Indicates whether connection draining is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * The timeout period of connection draining. Unit: seconds.
             * <p>
             * 
             * Value values: **10 to 900**.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The port that is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The timeout period for a health check response.
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * The response string for UDP listener health checks.
             */
            public Builder healthCheckExp(String healthCheckExp) {
                this.healthCheckExp = healthCheckExp;
                return this;
            }

            /**
             * The interval between two consecutive health checks. Unit: seconds.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The request string for UDP listener health checks.
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
                return this;
            }

            /**
             * The number of times that a backend server must consecutively pass health checks before it is declared healthy.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The ID of the primary/secondary server group that is associated with the listener.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder proxyProtocolV2Enabled(String proxyProtocolV2Enabled) {
                this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
                return this;
            }

            /**
             * The number of times that a backend server must consecutively fail health checks before it is declared unhealthy.
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
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

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
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UDPListenerConfig")
        private UDPListenerConfig UDPListenerConfig;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Listeners(Builder builder) {
            this.aclId = builder.aclId;
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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 
            private UDPListenerConfig UDPListenerConfig; 
            private String vServerGroupId; 

            /**
             * The ID of the network ACL.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * Indicates whether access control is enabled. Valid values:
             * <p>
             * 
             * *   **on**: yes
             * *   **off**: no
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The type of the network access control list (ACL). Valid values:
             * <p>
             * 
             * *   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.
             * 
             * If you enable a whitelist but do not add an IP address to the whitelist, the listener forwards all requests.
             * 
             * *   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. A blacklist applies to scenarios in which you want to deny access from specific IP addresses.
             * 
             * If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * The port of the backend server.
             * <p>
             * 
             * >  This parameter takes effect when the `VServerGroupId` parameter and the `MasterSlaveServerGroupId` parameter are empty.
             */
            public Builder backendServerPort(Integer backendServerPort) {
                this.backendServerPort = backendServerPort;
                return this;
            }

            /**
             * The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * *   **-1**: If -1 is returned, it indicates that the bandwidth of the listener is unlimited.
             * *   **1 to 5120**: If a value from 1 to 5120 is returned, the value indicates the maximum bandwidth of the listener. The sum of the maximum bandwidth of all listeners added to a CLB instance does not exceed the maximum bandwidth of the CLB instance.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The description of the listener.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The configuration of the HTTP listener.
             */
            public Builder HTTPListenerConfig(HTTPListenerConfig HTTPListenerConfig) {
                this.HTTPListenerConfig = HTTPListenerConfig;
                return this;
            }

            /**
             * The configuration of the HTTPS listener.
             */
            public Builder HTTPSListenerConfig(HTTPSListenerConfig HTTPSListenerConfig) {
                this.HTTPSListenerConfig = HTTPSListenerConfig;
                return this;
            }

            /**
             * The listening port.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The protocol used by the listener.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The ID of the CLB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The scheduling algorithm. Valid values:
             * <p>
             * 
             * *   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.
             * *   **rr**: Requests are distributed to backend servers in sequence.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * The status of the listener. Valid values:
             * <p>
             * 
             * *   **running**: The listener runs as expected.
             * *   **stopped**: The listener is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The configuration of the TCP listener.
             */
            public Builder TCPListenerConfig(TCPListenerConfig TCPListenerConfig) {
                this.TCPListenerConfig = TCPListenerConfig;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The configuration of the UDP listener.
             */
            public Builder UDPListenerConfig(UDPListenerConfig UDPListenerConfig) {
                this.UDPListenerConfig = UDPListenerConfig;
                return this;
            }

            /**
             * The ID of the vServer group that is associated with the listener.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerListenersResponseBody</p>
 */
public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public DescribeLoadBalancerListenersResponseBody build() {
            return new DescribeLoadBalancerListenersResponseBody(this);
        } 

    } 

    public static class HTTPListenerConfig extends TeaModel {
        @NameInMap("Cookie")
        private String cookie;

        @NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @NameInMap("ForwardPort")
        private Integer forwardPort;

        @NameInMap("Gzip")
        private String gzip;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @NameInMap("ListenerForward")
        private String listenerForward;

        @NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @NameInMap("StickySession")
        private String stickySession;

        @NameInMap("StickySessionType")
        private String stickySessionType;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @NameInMap("XForwardedFor")
        private String XForwardedFor;

        @NameInMap("XForwardedFor_ClientSrcPort")
        private String XForwardedFor_ClientSrcPort;

        @NameInMap("XForwardedFor_SLBID")
        private String XForwardedFor_SLBID;

        @NameInMap("XForwardedFor_SLBIP")
        private String XForwardedFor_SLBIP;

        @NameInMap("XForwardedFor_SLBPORT")
        private String XForwardedFor_SLBPORT;

        @NameInMap("XForwardedFor_proto")
        private String XForwardedFor_proto;

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
            this.XForwardedFor = builder.XForwardedFor;
            this.XForwardedFor_ClientSrcPort = builder.XForwardedFor_ClientSrcPort;
            this.XForwardedFor_SLBID = builder.XForwardedFor_SLBID;
            this.XForwardedFor_SLBIP = builder.XForwardedFor_SLBIP;
            this.XForwardedFor_SLBPORT = builder.XForwardedFor_SLBPORT;
            this.XForwardedFor_proto = builder.XForwardedFor_proto;
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
         * @return XForwardedFor
         */
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        /**
         * @return XForwardedFor_ClientSrcPort
         */
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        /**
         * @return XForwardedFor_SLBID
         */
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        /**
         * @return XForwardedFor_SLBIP
         */
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        /**
         * @return XForwardedFor_SLBPORT
         */
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        /**
         * @return XForwardedFor_proto
         */
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
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
            private String XForwardedFor; 
            private String XForwardedFor_ClientSrcPort; 
            private String XForwardedFor_SLBID; 
            private String XForwardedFor_SLBIP; 
            private String XForwardedFor_SLBPORT; 
            private String XForwardedFor_proto; 

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
             * ForwardPort.
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
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
             * HealthCheckDomain.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
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
             * HealthCheckHttpVersion.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckMethod.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
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
             * HealthCheckType.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * HealthCheckURI.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
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
             * IdleTimeout.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * ListenerForward.
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * RequestTimeout.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
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
             * UnhealthyThreshold.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            /**
             * XForwardedFor.
             */
            public Builder XForwardedFor(String XForwardedFor) {
                this.XForwardedFor = XForwardedFor;
                return this;
            }

            /**
             * XForwardedFor_ClientSrcPort.
             */
            public Builder XForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
                this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
                return this;
            }

            /**
             * XForwardedFor_SLBID.
             */
            public Builder XForwardedFor_SLBID(String XForwardedFor_SLBID) {
                this.XForwardedFor_SLBID = XForwardedFor_SLBID;
                return this;
            }

            /**
             * XForwardedFor_SLBIP.
             */
            public Builder XForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
                this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
                return this;
            }

            /**
             * XForwardedFor_SLBPORT.
             */
            public Builder XForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
                this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
                return this;
            }

            /**
             * XForwardedFor_proto.
             */
            public Builder XForwardedFor_proto(String XForwardedFor_proto) {
                this.XForwardedFor_proto = XForwardedFor_proto;
                return this;
            }

            public HTTPListenerConfig build() {
                return new HTTPListenerConfig(this);
            } 

        } 

    }
    public static class HTTPSListenerConfig extends TeaModel {
        @NameInMap("CACertificateId")
        private String CACertificateId;

        @NameInMap("Cookie")
        private String cookie;

        @NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @NameInMap("EnableHttp2")
        private String enableHttp2;

        @NameInMap("Gzip")
        private String gzip;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @NameInMap("ServerCertificateId")
        private String serverCertificateId;

        @NameInMap("StickySession")
        private String stickySession;

        @NameInMap("StickySessionType")
        private String stickySessionType;

        @NameInMap("TLSCipherPolicy")
        private String TLSCipherPolicy;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        @NameInMap("XForwardedFor")
        private String XForwardedFor;

        @NameInMap("XForwardedFor_ClientCertClientVerify")
        private String XForwardedFor_ClientCertClientVerify;

        @NameInMap("XForwardedFor_ClientCertFingerprint")
        private String XForwardedFor_ClientCertFingerprint;

        @NameInMap("XForwardedFor_ClientCertIssuerDN")
        private String XForwardedFor_ClientCertIssuerDN;

        @NameInMap("XForwardedFor_ClientCertSubjectDN")
        private String XForwardedFor_ClientCertSubjectDN;

        @NameInMap("XForwardedFor_ClientSrcPort")
        private String XForwardedFor_ClientSrcPort;

        @NameInMap("XForwardedFor_SLBID")
        private String XForwardedFor_SLBID;

        @NameInMap("XForwardedFor_SLBIP")
        private String XForwardedFor_SLBIP;

        @NameInMap("XForwardedFor_SLBPORT")
        private String XForwardedFor_SLBPORT;

        @NameInMap("XForwardedFor_proto")
        private String XForwardedFor_proto;

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
            this.XForwardedFor = builder.XForwardedFor;
            this.XForwardedFor_ClientCertClientVerify = builder.XForwardedFor_ClientCertClientVerify;
            this.XForwardedFor_ClientCertFingerprint = builder.XForwardedFor_ClientCertFingerprint;
            this.XForwardedFor_ClientCertIssuerDN = builder.XForwardedFor_ClientCertIssuerDN;
            this.XForwardedFor_ClientCertSubjectDN = builder.XForwardedFor_ClientCertSubjectDN;
            this.XForwardedFor_ClientSrcPort = builder.XForwardedFor_ClientSrcPort;
            this.XForwardedFor_SLBID = builder.XForwardedFor_SLBID;
            this.XForwardedFor_SLBIP = builder.XForwardedFor_SLBIP;
            this.XForwardedFor_SLBPORT = builder.XForwardedFor_SLBPORT;
            this.XForwardedFor_proto = builder.XForwardedFor_proto;
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
         * @return XForwardedFor
         */
        public String getXForwardedFor() {
            return this.XForwardedFor;
        }

        /**
         * @return XForwardedFor_ClientCertClientVerify
         */
        public String getXForwardedFor_ClientCertClientVerify() {
            return this.XForwardedFor_ClientCertClientVerify;
        }

        /**
         * @return XForwardedFor_ClientCertFingerprint
         */
        public String getXForwardedFor_ClientCertFingerprint() {
            return this.XForwardedFor_ClientCertFingerprint;
        }

        /**
         * @return XForwardedFor_ClientCertIssuerDN
         */
        public String getXForwardedFor_ClientCertIssuerDN() {
            return this.XForwardedFor_ClientCertIssuerDN;
        }

        /**
         * @return XForwardedFor_ClientCertSubjectDN
         */
        public String getXForwardedFor_ClientCertSubjectDN() {
            return this.XForwardedFor_ClientCertSubjectDN;
        }

        /**
         * @return XForwardedFor_ClientSrcPort
         */
        public String getXForwardedFor_ClientSrcPort() {
            return this.XForwardedFor_ClientSrcPort;
        }

        /**
         * @return XForwardedFor_SLBID
         */
        public String getXForwardedFor_SLBID() {
            return this.XForwardedFor_SLBID;
        }

        /**
         * @return XForwardedFor_SLBIP
         */
        public String getXForwardedFor_SLBIP() {
            return this.XForwardedFor_SLBIP;
        }

        /**
         * @return XForwardedFor_SLBPORT
         */
        public String getXForwardedFor_SLBPORT() {
            return this.XForwardedFor_SLBPORT;
        }

        /**
         * @return XForwardedFor_proto
         */
        public String getXForwardedFor_proto() {
            return this.XForwardedFor_proto;
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
            private String XForwardedFor; 
            private String XForwardedFor_ClientCertClientVerify; 
            private String XForwardedFor_ClientCertFingerprint; 
            private String XForwardedFor_ClientCertIssuerDN; 
            private String XForwardedFor_ClientCertSubjectDN; 
            private String XForwardedFor_ClientSrcPort; 
            private String XForwardedFor_SLBID; 
            private String XForwardedFor_SLBIP; 
            private String XForwardedFor_SLBPORT; 
            private String XForwardedFor_proto; 

            /**
             * CACertificateId.
             */
            public Builder CACertificateId(String CACertificateId) {
                this.CACertificateId = CACertificateId;
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
             * EnableHttp2.
             */
            public Builder enableHttp2(String enableHttp2) {
                this.enableHttp2 = enableHttp2;
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
             * HealthCheckDomain.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
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
             * HealthCheckHttpVersion.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckMethod.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
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
             * HealthCheckType.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * HealthCheckURI.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
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
             * IdleTimeout.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * RequestTimeout.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * ServerCertificateId.
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
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
             * TLSCipherPolicy.
             */
            public Builder TLSCipherPolicy(String TLSCipherPolicy) {
                this.TLSCipherPolicy = TLSCipherPolicy;
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
             * XForwardedFor.
             */
            public Builder XForwardedFor(String XForwardedFor) {
                this.XForwardedFor = XForwardedFor;
                return this;
            }

            /**
             * XForwardedFor_ClientCertClientVerify.
             */
            public Builder XForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
                this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
                return this;
            }

            /**
             * XForwardedFor_ClientCertFingerprint.
             */
            public Builder XForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
                this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
                return this;
            }

            /**
             * XForwardedFor_ClientCertIssuerDN.
             */
            public Builder XForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
                this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
                return this;
            }

            /**
             * XForwardedFor_ClientCertSubjectDN.
             */
            public Builder XForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
                this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
                return this;
            }

            /**
             * XForwardedFor_ClientSrcPort.
             */
            public Builder XForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
                this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
                return this;
            }

            /**
             * XForwardedFor_SLBID.
             */
            public Builder XForwardedFor_SLBID(String XForwardedFor_SLBID) {
                this.XForwardedFor_SLBID = XForwardedFor_SLBID;
                return this;
            }

            /**
             * XForwardedFor_SLBIP.
             */
            public Builder XForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
                this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
                return this;
            }

            /**
             * XForwardedFor_SLBPORT.
             */
            public Builder XForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
                this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
                return this;
            }

            /**
             * XForwardedFor_proto.
             */
            public Builder XForwardedFor_proto(String XForwardedFor_proto) {
                this.XForwardedFor_proto = XForwardedFor_proto;
                return this;
            }

            public HTTPSListenerConfig build() {
                return new HTTPSListenerConfig(this);
            } 

        } 

    }
    public static class TCPListenerConfig extends TeaModel {
        @NameInMap("ConnectionDrain")
        private String connectionDrain;

        @NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @NameInMap("EstablishedTimeout")
        private Integer establishedTimeout;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        private String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("HealthCheckURI")
        private String healthCheckURI;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @NameInMap("PersistenceTimeout")
        private Integer persistenceTimeout;

        @NameInMap("UnhealthyThreshold")
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
            private Integer unhealthyThreshold; 

            /**
             * ConnectionDrain.
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * ConnectionDrainTimeout.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * EstablishedTimeout.
             */
            public Builder establishedTimeout(Integer establishedTimeout) {
                this.establishedTimeout = establishedTimeout;
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
             * HealthCheckConnectTimeout.
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * HealthCheckDomain.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
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
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckMethod.
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * HealthCheckType.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * HealthCheckURI.
             */
            public Builder healthCheckURI(String healthCheckURI) {
                this.healthCheckURI = healthCheckURI;
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
             * MasterSlaveServerGroupId.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * PersistenceTimeout.
             */
            public Builder persistenceTimeout(Integer persistenceTimeout) {
                this.persistenceTimeout = persistenceTimeout;
                return this;
            }

            /**
             * UnhealthyThreshold.
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
    public static class UDPListenerConfig extends TeaModel {
        @NameInMap("ConnectionDrain")
        private String connectionDrain;

        @NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @NameInMap("HealthCheckExp")
        private String healthCheckExp;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckReq")
        private String healthCheckReq;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("MasterSlaveServerGroupId")
        private String masterSlaveServerGroupId;

        @NameInMap("UnhealthyThreshold")
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
            private Integer unhealthyThreshold; 

            /**
             * ConnectionDrain.
             */
            public Builder connectionDrain(String connectionDrain) {
                this.connectionDrain = connectionDrain;
                return this;
            }

            /**
             * ConnectionDrainTimeout.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
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
             * HealthCheckConnectTimeout.
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * HealthCheckExp.
             */
            public Builder healthCheckExp(String healthCheckExp) {
                this.healthCheckExp = healthCheckExp;
                return this;
            }

            /**
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckReq.
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
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
             * MasterSlaveServerGroupId.
             */
            public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
                this.masterSlaveServerGroupId = masterSlaveServerGroupId;
                return this;
            }

            /**
             * UnhealthyThreshold.
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
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AclType")
        private String aclType;

        @NameInMap("BackendServerPort")
        private Integer backendServerPort;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("Description")
        private String description;

        @NameInMap("HTTPListenerConfig")
        private HTTPListenerConfig HTTPListenerConfig;

        @NameInMap("HTTPSListenerConfig")
        private HTTPSListenerConfig HTTPSListenerConfig;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Scheduler")
        private String scheduler;

        @NameInMap("Status")
        private String status;

        @NameInMap("TCPListenerConfig")
        private TCPListenerConfig TCPListenerConfig;

        @NameInMap("UDPListenerConfig")
        private UDPListenerConfig UDPListenerConfig;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

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
            this.UDPListenerConfig = builder.UDPListenerConfig;
            this.VServerGroupId = builder.VServerGroupId;
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
         * @return UDPListenerConfig
         */
        public UDPListenerConfig getUDPListenerConfig() {
            return this.UDPListenerConfig;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
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
            private UDPListenerConfig UDPListenerConfig; 
            private String VServerGroupId; 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HTTPListenerConfig.
             */
            public Builder HTTPListenerConfig(HTTPListenerConfig HTTPListenerConfig) {
                this.HTTPListenerConfig = HTTPListenerConfig;
                return this;
            }

            /**
             * HTTPSListenerConfig.
             */
            public Builder HTTPSListenerConfig(HTTPSListenerConfig HTTPSListenerConfig) {
                this.HTTPSListenerConfig = HTTPSListenerConfig;
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
             * ListenerProtocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TCPListenerConfig.
             */
            public Builder TCPListenerConfig(TCPListenerConfig TCPListenerConfig) {
                this.TCPListenerConfig = TCPListenerConfig;
                return this;
            }

            /**
             * UDPListenerConfig.
             */
            public Builder UDPListenerConfig(UDPListenerConfig UDPListenerConfig) {
                this.UDPListenerConfig = UDPListenerConfig;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}

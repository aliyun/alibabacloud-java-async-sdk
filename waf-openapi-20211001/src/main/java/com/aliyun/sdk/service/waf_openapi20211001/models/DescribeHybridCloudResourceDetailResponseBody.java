// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudResourceDetailResponseBody</p>
 */
public class DescribeHybridCloudResourceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private Domain domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudResourceDetailResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudResourceDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domain domain; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudResourceDetailResponseBody model) {
            this.domain = model.domain;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The domain name information.</p>
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudResourceDetailResponseBody build() {
            return new DescribeHybridCloudResourceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudResourceDetailResponseBody</p>
     */
    public static class Listen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private Integer cipherSuite;

        @com.aliyun.core.annotation.NameInMap("CustomCiphers")
        private java.util.List<String> customCiphers;

        @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @com.aliyun.core.annotation.NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @com.aliyun.core.annotation.NameInMap("FocusHttps")
        private Boolean focusHttps;

        @com.aliyun.core.annotation.NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private java.util.List<Long> httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private java.util.List<Long> httpsPorts;

        @com.aliyun.core.annotation.NameInMap("IPv6Enabled")
        private Boolean iPv6Enabled;

        @com.aliyun.core.annotation.NameInMap("ProtectionResource")
        private String protectionResource;

        @com.aliyun.core.annotation.NameInMap("TLSVersion")
        private String TLSVersion;

        @com.aliyun.core.annotation.NameInMap("XffHeaderMode")
        private Integer xffHeaderMode;

        @com.aliyun.core.annotation.NameInMap("XffHeaders")
        private java.util.List<String> xffHeaders;

        private Listen(Builder builder) {
            this.certId = builder.certId;
            this.cipherSuite = builder.cipherSuite;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.exclusiveIp = builder.exclusiveIp;
            this.focusHttps = builder.focusHttps;
            this.http2Enabled = builder.http2Enabled;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.iPv6Enabled = builder.iPv6Enabled;
            this.protectionResource = builder.protectionResource;
            this.TLSVersion = builder.TLSVersion;
            this.xffHeaderMode = builder.xffHeaderMode;
            this.xffHeaders = builder.xffHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listen create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return cipherSuite
         */
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        /**
         * @return customCiphers
         */
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        /**
         * @return enableTLSv3
         */
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        /**
         * @return exclusiveIp
         */
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        /**
         * @return focusHttps
         */
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        /**
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        /**
         * @return httpPorts
         */
        public java.util.List<Long> getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List<Long> getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return iPv6Enabled
         */
        public Boolean getIPv6Enabled() {
            return this.iPv6Enabled;
        }

        /**
         * @return protectionResource
         */
        public String getProtectionResource() {
            return this.protectionResource;
        }

        /**
         * @return TLSVersion
         */
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        /**
         * @return xffHeaderMode
         */
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        /**
         * @return xffHeaders
         */
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        public static final class Builder {
            private String certId; 
            private Integer cipherSuite; 
            private java.util.List<String> customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean exclusiveIp; 
            private Boolean focusHttps; 
            private Boolean http2Enabled; 
            private java.util.List<Long> httpPorts; 
            private java.util.List<Long> httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private String TLSVersion; 
            private Integer xffHeaderMode; 
            private java.util.List<String> xffHeaders; 

            private Builder() {
            } 

            private Builder(Listen model) {
                this.certId = model.certId;
                this.cipherSuite = model.cipherSuite;
                this.customCiphers = model.customCiphers;
                this.enableTLSv3 = model.enableTLSv3;
                this.exclusiveIp = model.exclusiveIp;
                this.focusHttps = model.focusHttps;
                this.http2Enabled = model.http2Enabled;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.iPv6Enabled = model.iPv6Enabled;
                this.protectionResource = model.protectionResource;
                this.TLSVersion = model.TLSVersion;
                this.xffHeaderMode = model.xffHeaderMode;
                this.xffHeaders = model.xffHeaders;
            } 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>19312542-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The type of cipher suite. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: all cipher suites are added.</p>
             * </li>
             * <li><p><strong>2</strong>: strong cipher suites are added.</p>
             * </li>
             * <li><p><strong>99</strong>: custom cipher suites are added.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * <p>The custom cipher suites.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
             * </li>
             * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * <p>Indicates whether an exclusive IP address is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Supported.</p>
             * </li>
             * <li><p><strong>false</strong>: Not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS forced redirect is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: HTTPS forced redirect is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: HTTPS forced redirect is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder focusHttps(Boolean focusHttps) {
                this.focusHttps = focusHttps;
                return this;
            }

            /**
             * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: HTTP/2 is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * <p>The list of available ports for the HTTP protocol. The value is a string. When multiple ports are available, they are returned in the format of <strong>port1,port2,port3</strong>.</p>
             */
            public Builder httpPorts(java.util.List<Long> httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The ports for the HTTPS protocol.</p>
             */
            public Builder httpsPorts(java.util.List<Long> httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: IPv6 is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: IPv6 is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder iPv6Enabled(Boolean iPv6Enabled) {
                this.iPv6Enabled = iPv6Enabled;
                return this;
            }

            /**
             * <p>The type of protection resource to use. Valid values:</p>
             * <ul>
             * <li><p><strong>share</strong>: shared cluster.</p>
             * </li>
             * <li><p><strong>gslb</strong>: intelligent load balancing of the shared cluster.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>share</p>
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * <p>The TLS version. Valid values:</p>
             * <ul>
             * <li><p><strong>tlsv1</strong></p>
             * </li>
             * <li><p><strong>tlsv1.1</strong></p>
             * </li>
             * <li><p><strong>tlsv1.2</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tlsv1</p>
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            /**
             * <p>The method that WAF uses to obtain the originating IP address of the client. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: No Layer 7 proxy is deployed before WAF.</p>
             * </li>
             * <li><p><strong>1</strong>: WAF reads the first value in the X-Forwarded-For (XFF) header as the client IP address.</p>
             * </li>
             * <li><p><strong>2</strong>: WAF reads the value of a custom field in the request header as the client IP address.</p>
             * </li>
             * <li><p><strong>3</strong>: WAF reads the Client IP from the Proxy Protocol header as the client IP address.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * <p>The list of custom fields used to obtain the client IP address, in the format of [<strong>&quot;header1&quot;,&quot;header2&quot;,……</strong>].</p>
             * <blockquote>
             * <p>This parameter is required only when <strong>XffHeaderMode</strong> is set to 2, which indicates that WAF reads the custom field value you specified in the request header as the client IP address.</p>
             * </blockquote>
             */
            public Builder xffHeaders(java.util.List<String> xffHeaders) {
                this.xffHeaders = xffHeaders;
                return this;
            }

            public Listen build() {
                return new Listen(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudResourceDetailResponseBody</p>
     */
    public static class BackendPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendPort")
        private Integer backendPort;

        @com.aliyun.core.annotation.NameInMap("ListenPort")
        private Integer listenPort;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private BackendPorts(Builder builder) {
            this.backendPort = builder.backendPort;
            this.listenPort = builder.listenPort;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendPorts create() {
            return builder().build();
        }

        /**
         * @return backendPort
         */
        public Integer getBackendPort() {
            return this.backendPort;
        }

        /**
         * @return listenPort
         */
        public Integer getListenPort() {
            return this.listenPort;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer backendPort; 
            private Integer listenPort; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(BackendPorts model) {
                this.backendPort = model.backendPort;
                this.listenPort = model.listenPort;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The back-to-origin port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * <p>The listening port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenPort(Integer listenPort) {
                this.listenPort = listenPort;
                return this;
            }

            /**
             * <p>The protocol type of the listening port. Valid values:</p>
             * <ul>
             * <li>http: HTTP protocol.</li>
             * <li>https: HTTPS protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public BackendPorts build() {
                return new BackendPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudResourceDetailResponseBody</p>
     */
    public static class RequestHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RequestHeaders(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaders create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(RequestHeaders model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>L2x1ZmZ5L2NvcmUvYXBwcy9tLnl1bmR1bi53YWYuMS9wbHVnaW5z</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>9506360478730</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequestHeaders build() {
                return new RequestHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudResourceDetailResponseBody</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendPorts")
        private java.util.List<BackendPorts> backendPorts;

        @com.aliyun.core.annotation.NameInMap("Backends")
        private java.util.List<String> backends;

        @com.aliyun.core.annotation.NameInMap("CnameEnabled")
        private Boolean cnameEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Long connectTimeout;

        @com.aliyun.core.annotation.NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Long keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Long keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("Loadbalance")
        private String loadbalance;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocol")
        private Boolean proxyProtocol;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        private Long readTimeout;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private java.util.List<RequestHeaders> requestHeaders;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Boolean retry;

        @com.aliyun.core.annotation.NameInMap("RoutingRules")
        private String routingRules;

        @com.aliyun.core.annotation.NameInMap("SniEnabled")
        private Boolean sniEnabled;

        @com.aliyun.core.annotation.NameInMap("SniHost")
        private String sniHost;

        @com.aliyun.core.annotation.NameInMap("WriteTimeout")
        private Long writeTimeout;

        private Redirect(Builder builder) {
            this.backendPorts = builder.backendPorts;
            this.backends = builder.backends;
            this.cnameEnabled = builder.cnameEnabled;
            this.connectTimeout = builder.connectTimeout;
            this.focusHttpBackend = builder.focusHttpBackend;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadbalance = builder.loadbalance;
            this.proxyProtocol = builder.proxyProtocol;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
            this.retry = builder.retry;
            this.routingRules = builder.routingRules;
            this.sniEnabled = builder.sniEnabled;
            this.sniHost = builder.sniHost;
            this.writeTimeout = builder.writeTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
        }

        /**
         * @return backendPorts
         */
        public java.util.List<BackendPorts> getBackendPorts() {
            return this.backendPorts;
        }

        /**
         * @return backends
         */
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        /**
         * @return cnameEnabled
         */
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        /**
         * @return connectTimeout
         */
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return focusHttpBackend
         */
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        /**
         * @return keepalive
         */
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        /**
         * @return keepaliveRequests
         */
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Long getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        /**
         * @return loadbalance
         */
        public String getLoadbalance() {
            return this.loadbalance;
        }

        /**
         * @return proxyProtocol
         */
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
        }

        /**
         * @return readTimeout
         */
        public Long getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return requestHeaders
         */
        public java.util.List<RequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        /**
         * @return retry
         */
        public Boolean getRetry() {
            return this.retry;
        }

        /**
         * @return routingRules
         */
        public String getRoutingRules() {
            return this.routingRules;
        }

        /**
         * @return sniEnabled
         */
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        /**
         * @return sniHost
         */
        public String getSniHost() {
            return this.sniHost;
        }

        /**
         * @return writeTimeout
         */
        public Long getWriteTimeout() {
            return this.writeTimeout;
        }

        public static final class Builder {
            private java.util.List<BackendPorts> backendPorts; 
            private java.util.List<String> backends; 
            private Boolean cnameEnabled; 
            private Long connectTimeout; 
            private Boolean focusHttpBackend; 
            private Boolean keepalive; 
            private Long keepaliveRequests; 
            private Long keepaliveTimeout; 
            private String loadbalance; 
            private Boolean proxyProtocol; 
            private Long readTimeout; 
            private java.util.List<RequestHeaders> requestHeaders; 
            private Boolean retry; 
            private String routingRules; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Long writeTimeout; 

            private Builder() {
            } 

            private Builder(Redirect model) {
                this.backendPorts = model.backendPorts;
                this.backends = model.backends;
                this.cnameEnabled = model.cnameEnabled;
                this.connectTimeout = model.connectTimeout;
                this.focusHttpBackend = model.focusHttpBackend;
                this.keepalive = model.keepalive;
                this.keepaliveRequests = model.keepaliveRequests;
                this.keepaliveTimeout = model.keepaliveTimeout;
                this.loadbalance = model.loadbalance;
                this.proxyProtocol = model.proxyProtocol;
                this.readTimeout = model.readTimeout;
                this.requestHeaders = model.requestHeaders;
                this.retry = model.retry;
                this.routingRules = model.routingRules;
                this.sniEnabled = model.sniEnabled;
                this.sniHost = model.sniHost;
                this.writeTimeout = model.writeTimeout;
            } 

            /**
             * <p>The custom port configuration. By default, the port is the same as the listening port.</p>
             */
            public Builder backendPorts(java.util.List<BackendPorts> backendPorts) {
                this.backendPorts = backendPorts;
                return this;
            }

            /**
             * <p>The IP address of the origin server or the domain name used for back-to-origin.</p>
             */
            public Builder backends(java.util.List<String> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * <p>Specifies whether to enable public cloud disaster recovery. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Public cloud disaster recovery is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Public cloud disaster recovery is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cnameEnabled(Boolean cnameEnabled) {
                this.cnameEnabled = cnameEnabled;
                return this;
            }

            /**
             * <p>The connection timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * <p>Indicates whether forced HTTP back-to-origin is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Forced HTTP back-to-origin is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Forced HTTP back-to-origin is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder focusHttpBackend(Boolean focusHttpBackend) {
                this.focusHttpBackend = focusHttpBackend;
                return this;
            }

            /**
             * <p>Indicates whether keep-alive connections are enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): Keep-alive connections are enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Keep-alive connections are not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepalive(Boolean keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * <p>The number of requests that reuse keep-alive connections. Valid values: 60 to 1000.</p>
             * <blockquote>
             * <p>After keep-alive connections are enabled, this parameter specifies how many keep-alive connections are reused.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder keepaliveRequests(Long keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * <p>The idle timeout period of keep-alive connections.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder keepaliveTimeout(Long keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * <p>The load balancing algorithm used for back-to-origin. Valid values:</p>
             * <ul>
             * <li><p><strong>iphash</strong>: IP Hash algorithm.</p>
             * </li>
             * <li><p><strong>roundRobin</strong>: round-robin algorithm.</p>
             * </li>
             * <li><p><strong>leastTime</strong>: Least Time algorithm.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>iphash</p>
             */
            public Builder loadbalance(String loadbalance) {
                this.loadbalance = loadbalance;
                return this;
            }

            /**
             * <p>Indicates whether the client source IP preservation feature is enabled.</p>
             * <ul>
             * <li>true: The client source IP preservation feature is enabled. After this feature is enabled, the backend service can view the originating IP address of the client.</li>
             * <li>false: The client source IP preservation feature is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder proxyProtocol(Boolean proxyProtocol) {
                this.proxyProtocol = proxyProtocol;
                return this;
            }

            /**
             * <p>The read timeout period of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readTimeout(Long readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The HTTP request headers.</p>
             */
            public Builder requestHeaders(java.util.List<RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>Indicates whether WAF retries when back-to-origin fails. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: WAF retries.</p>
             * </li>
             * <li><p><strong>false</strong>: WAF does not retry.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>The hybrid cloud forwarding rules, expressed as a string converted from a JSON array. Each element in the JSON array is a structure that contains the following fields:</p>
             * <ul>
             * <li><strong>rs</strong>: Array type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;backupRs\&quot;:[],\&quot;location\&quot;:\&quot;v3-test\&quot;,\&quot;locationId\&quot;:1148,\&quot;rs\&quot;:[\&quot;39.98.217.197\&quot;,\&quot;2.2.2.2\&quot;]}]</p>
             */
            public Builder routingRules(String routingRules) {
                this.routingRules = routingRules;
                return this;
            }

            /**
             * <p>Indicates whether back-to-origin Server Name Indication (SNI) is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Back-to-origin SNI is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Back-to-origin SNI is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sniEnabled(Boolean sniEnabled) {
                this.sniEnabled = sniEnabled;
                return this;
            }

            /**
             * <p>The custom value of the SNI extension field. If the value is empty, the SNI value is not customized, and the value of the <strong>Host</strong> field in the request header is used as the SNI extension field value by default.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>SniStatus</strong> is set to <strong>1</strong>, which indicates that back-to-origin SNI is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>eew111</p>
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * <p>The write timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder writeTimeout(Long writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridCloudResourceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudResourceDetailResponseBody</p>
     */
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Listen")
        private Listen listen;

        @com.aliyun.core.annotation.NameInMap("Redirect")
        private Redirect redirect;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private Domain(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.id = builder.id;
            this.listen = builder.listen;
            this.redirect = builder.redirect;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return listen
         */
        public Listen getListen() {
            return this.listen;
        }

        /**
         * @return redirect
         */
        public Redirect getRedirect() {
            return this.redirect;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private Long id; 
            private Listen listen; 
            private Redirect redirect; 
            private String resourceManagerResourceGroupId; 
            private Integer status; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Domain model) {
                this.cname = model.cname;
                this.domain = model.domain;
                this.id = model.id;
                this.listen = model.listen;
                this.redirect = model.redirect;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.status = model.status;
                this.uid = model.uid;
            } 

            /**
             * <p>The CNAME assigned by WAF to the domain name.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>CnameEnabled</strong> is set to true, which indicates that public cloud disaster recovery is enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>kdmqyi3ck7xogegxpiyfpb0fj21mgkxn.****.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>www.*****.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The access ID.</p>
             * 
             * <strong>example:</strong>
             * <p>31323</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The listening information.</p>
             */
            public Builder listen(Listen listen) {
                this.listen = listen;
                return this;
            }

            /**
             * <p>The rules for returning response header values.</p>
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-***aby</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1046011128270720</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
}

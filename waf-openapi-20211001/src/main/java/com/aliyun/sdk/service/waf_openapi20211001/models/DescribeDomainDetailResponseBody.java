// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailResponseBody</p>
 */
public class DescribeDomainDetailResponseBody extends TeaModel {
    @NameInMap("Cname")
    private String cname;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("Listen")
    private Listen listen;

    @NameInMap("Redirect")
    private Redirect redirect;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Long status;

    private DescribeDomainDetailResponseBody(Builder builder) {
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String cname; 
        private String domain; 
        private Listen listen; 
        private Redirect redirect; 
        private String requestId; 
        private Long status; 

        /**
         * Cname.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * 域名
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * 监听配置
         */
        public Builder listen(Listen listen) {
            this.listen = listen;
            return this;
        }

        /**
         * 转发配置
         */
        public Builder redirect(Redirect redirect) {
            this.redirect = redirect;
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
         * 状态
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public DescribeDomainDetailResponseBody build() {
            return new DescribeDomainDetailResponseBody(this);
        } 

    } 

    public static class Listen extends TeaModel {
        @NameInMap("CertId")
        private Long certId;

        @NameInMap("CipherSuite")
        private Long cipherSuite;

        @NameInMap("CustomCiphers")
        private java.util.List < String > customCiphers;

        @NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @NameInMap("FocusHttps")
        private Boolean focusHttps;

        @NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @NameInMap("HttpPorts")
        private java.util.List < Long > httpPorts;

        @NameInMap("HttpsPorts")
        private java.util.List < Long > httpsPorts;

        @NameInMap("IPv6Enabled")
        private Boolean iPv6Enabled;

        @NameInMap("ProtectionResource")
        private String protectionResource;

        @NameInMap("TLSVersion")
        private String TLSVersion;

        @NameInMap("XffHeaderMode")
        private Long xffHeaderMode;

        @NameInMap("XffHeaders")
        private java.util.List < String > xffHeaders;

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
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return cipherSuite
         */
        public Long getCipherSuite() {
            return this.cipherSuite;
        }

        /**
         * @return customCiphers
         */
        public java.util.List < String > getCustomCiphers() {
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
        public java.util.List < Long > getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List < Long > getHttpsPorts() {
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
        public Long getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        /**
         * @return xffHeaders
         */
        public java.util.List < String > getXffHeaders() {
            return this.xffHeaders;
        }

        public static final class Builder {
            private Long certId; 
            private Long cipherSuite; 
            private java.util.List < String > customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean exclusiveIp; 
            private Boolean focusHttps; 
            private Boolean http2Enabled; 
            private java.util.List < Long > httpPorts; 
            private java.util.List < Long > httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private String TLSVersion; 
            private Long xffHeaderMode; 
            private java.util.List < String > xffHeaders; 

            /**
             * 证书ID
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CipherSuite.
             */
            public Builder cipherSuite(Long cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * CustomCiphers.
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * 是否支持TLS1.3
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * 是否开启独享IP
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * FocusHttps.
             */
            public Builder focusHttps(Boolean focusHttps) {
                this.focusHttps = focusHttps;
                return this;
            }

            /**
             * 是否开启HTTP2
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * HTTP端口
             */
            public Builder httpPorts(java.util.List < Long > httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * HTTPS端口
             */
            public Builder httpsPorts(java.util.List < Long > httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * 是否开启IPv6
             */
            public Builder iPv6Enabled(Boolean iPv6Enabled) {
                this.iPv6Enabled = iPv6Enabled;
                return this;
            }

            /**
             * 防护资源
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * TLS版本
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            /**
             * XffHeaderMode.
             */
            public Builder xffHeaderMode(Long xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * XffHeaders.
             */
            public Builder xffHeaders(java.util.List < String > xffHeaders) {
                this.xffHeaders = xffHeaders;
                return this;
            }

            public Listen build() {
                return new Listen(this);
            } 

        } 

    }
    public static class Backends extends TeaModel {
        @NameInMap("Backend")
        private String backend;

        private Backends(Builder builder) {
            this.backend = builder.backend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backends create() {
            return builder().build();
        }

        /**
         * @return backend
         */
        public String getBackend() {
            return this.backend;
        }

        public static final class Builder {
            private String backend; 

            /**
             * Backend.
             */
            public Builder backend(String backend) {
                this.backend = backend;
                return this;
            }

            public Backends build() {
                return new Backends(this);
            } 

        } 

    }
    public static class RequestHeaders extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Redirect extends TeaModel {
        @NameInMap("Backends")
        private java.util.List < Backends> backends;

        @NameInMap("ConnectTimeout")
        private Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @NameInMap("Loadbalance")
        private String loadbalance;

        @NameInMap("ReadTimeout")
        private Integer readTimeout;

        @NameInMap("RequestHeaders")
        private java.util.List < RequestHeaders> requestHeaders;

        @NameInMap("SniEnabled")
        private Boolean sniEnabled;

        @NameInMap("SniHost")
        private String sniHost;

        @NameInMap("WriteTimeout")
        private Integer writeTimeout;

        private Redirect(Builder builder) {
            this.backends = builder.backends;
            this.connectTimeout = builder.connectTimeout;
            this.focusHttpBackend = builder.focusHttpBackend;
            this.loadbalance = builder.loadbalance;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
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
         * @return backends
         */
        public java.util.List < Backends> getBackends() {
            return this.backends;
        }

        /**
         * @return connectTimeout
         */
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return focusHttpBackend
         */
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        /**
         * @return loadbalance
         */
        public String getLoadbalance() {
            return this.loadbalance;
        }

        /**
         * @return readTimeout
         */
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return requestHeaders
         */
        public java.util.List < RequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
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
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public static final class Builder {
            private java.util.List < Backends> backends; 
            private Integer connectTimeout; 
            private Boolean focusHttpBackend; 
            private String loadbalance; 
            private Integer readTimeout; 
            private java.util.List < RequestHeaders> requestHeaders; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Integer writeTimeout; 

            /**
             * Backends.
             */
            public Builder backends(java.util.List < Backends> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * ConnectTimeout.
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * FocusHttpBackend.
             */
            public Builder focusHttpBackend(Boolean focusHttpBackend) {
                this.focusHttpBackend = focusHttpBackend;
                return this;
            }

            /**
             * 负载均衡算法
             */
            public Builder loadbalance(String loadbalance) {
                this.loadbalance = loadbalance;
                return this;
            }

            /**
             * ReadTimeout.
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * RequestHeaders.
             */
            public Builder requestHeaders(java.util.List < RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * SNI
             */
            public Builder sniEnabled(Boolean sniEnabled) {
                this.sniEnabled = sniEnabled;
                return this;
            }

            /**
             * SniHost.
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * WriteTimeout.
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
}

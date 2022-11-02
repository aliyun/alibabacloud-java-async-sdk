// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyDomainRequest</p>
 */
public class ModifyDomainRequest extends Request {
    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Listen")
    @Validation(required = true)
    private Listen listen;

    @Query
    @NameInMap("Redirect")
    @Validation(required = true)
    private Redirect redirect;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDomainRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDomainRequest, Builder> {
        private String accessType; 
        private String domain; 
        private String instanceId; 
        private Listen listen; 
        private Redirect redirect; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDomainRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.listen = request.listen;
            this.redirect = request.redirect;
            this.regionId = request.regionId;
        } 

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Listen.
         */
        public Builder listen(Listen listen) {
            String listenShrink = shrink(listen, "Listen", "json");
            this.putQueryParameter("Listen", listenShrink);
            this.listen = listen;
            return this;
        }

        /**
         * Redirect.
         */
        public Builder redirect(Redirect redirect) {
            String redirectShrink = shrink(redirect, "Redirect", "json");
            this.putQueryParameter("Redirect", redirectShrink);
            this.redirect = redirect;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDomainRequest build() {
            return new ModifyDomainRequest(this);
        } 

    } 

    public static class Listen extends TeaModel {
        @NameInMap("CertId")
        private String certId;

        @NameInMap("CipherSuite")
        private Integer cipherSuite;

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
        private java.util.List < Integer > httpPorts;

        @NameInMap("HttpsPorts")
        private java.util.List < Integer > httpsPorts;

        @NameInMap("IPv6Enabled")
        private Boolean iPv6Enabled;

        @NameInMap("ProtectionResource")
        @Validation(required = true)
        private String protectionResource;

        @NameInMap("TLSVersion")
        private String TLSVersion;

        @NameInMap("XffHeaderMode")
        private Integer xffHeaderMode;

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
        public java.util.List < Integer > getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List < Integer > getHttpsPorts() {
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
        public java.util.List < String > getXffHeaders() {
            return this.xffHeaders;
        }

        public static final class Builder {
            private String certId; 
            private Integer cipherSuite; 
            private java.util.List < String > customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean exclusiveIp; 
            private Boolean focusHttps; 
            private Boolean http2Enabled; 
            private java.util.List < Integer > httpPorts; 
            private java.util.List < Integer > httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private String TLSVersion; 
            private Integer xffHeaderMode; 
            private java.util.List < String > xffHeaders; 

            /**
             * CertId.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * CipherSuite.
             */
            public Builder cipherSuite(Integer cipherSuite) {
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
             * EnableTLSv3.
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * ExclusiveIp.
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
             * Http2Enabled.
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * HttpPorts.
             */
            public Builder httpPorts(java.util.List < Integer > httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * HttpsPorts.
             */
            public Builder httpsPorts(java.util.List < Integer > httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * IPv6Enabled.
             */
            public Builder iPv6Enabled(Boolean iPv6Enabled) {
                this.iPv6Enabled = iPv6Enabled;
                return this;
            }

            /**
             * ProtectionResource.
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * TLSVersion.
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            /**
             * XffHeaderMode.
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
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
        @Validation(required = true)
        private java.util.List < String > backends;

        @NameInMap("ConnectTimeout")
        @Validation(maximum = 120, minimum = 5)
        private Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @NameInMap("Loadbalance")
        @Validation(required = true)
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
        public java.util.List < String > getBackends() {
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
            private java.util.List < String > backends; 
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
            public Builder backends(java.util.List < String > backends) {
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
             * Loadbalance.
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
             * SniEnabled.
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

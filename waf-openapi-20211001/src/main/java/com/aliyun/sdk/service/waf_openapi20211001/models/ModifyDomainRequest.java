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
 * {@link ModifyDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyDomainRequest</p>
 */
public class ModifyDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listen")
    @com.aliyun.core.annotation.Validation(required = true)
    private Listen listen;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Redirect")
    @com.aliyun.core.annotation.Validation(required = true)
    private Redirect redirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The mode in which you want to add the domain name to WAF. Set the value to share.</p>
         * <ul>
         * <li><strong>share:</strong> adds the domain name to WAF in CNAME record mode. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The domain name whose access configurations you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configurations of the listeners.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listen(Listen listen) {
            String listenShrink = shrink(listen, "Listen", "json");
            this.putQueryParameter("Listen", listenShrink);
            this.listen = listen;
            return this;
        }

        /**
         * <p>The configurations of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder redirect(Redirect redirect) {
            String redirectShrink = shrink(redirect, "Redirect", "json");
            this.putQueryParameter("Redirect", redirectShrink);
            this.redirect = redirect;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
         * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link ModifyDomainRequest} extends {@link TeaModel}
     *
     * <p>ModifyDomainRequest</p>
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
        private java.util.List<Integer> httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private java.util.List<Integer> httpsPorts;

        @com.aliyun.core.annotation.NameInMap("IPv6Enabled")
        private Boolean iPv6Enabled;

        @com.aliyun.core.annotation.NameInMap("ProtectionResource")
        private String protectionResource;

        @com.aliyun.core.annotation.NameInMap("SM2AccessOnly")
        private Boolean sM2AccessOnly;

        @com.aliyun.core.annotation.NameInMap("SM2CertId")
        private String sM2CertId;

        @com.aliyun.core.annotation.NameInMap("SM2Enabled")
        private Boolean sM2Enabled;

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
            this.sM2AccessOnly = builder.sM2AccessOnly;
            this.sM2CertId = builder.sM2CertId;
            this.sM2Enabled = builder.sM2Enabled;
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
        public java.util.List<Integer> getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List<Integer> getHttpsPorts() {
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
         * @return sM2AccessOnly
         */
        public Boolean getSM2AccessOnly() {
            return this.sM2AccessOnly;
        }

        /**
         * @return sM2CertId
         */
        public String getSM2CertId() {
            return this.sM2CertId;
        }

        /**
         * @return sM2Enabled
         */
        public Boolean getSM2Enabled() {
            return this.sM2Enabled;
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
            private java.util.List<Integer> httpPorts; 
            private java.util.List<Integer> httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private Boolean sM2AccessOnly; 
            private String sM2CertId; 
            private Boolean sM2Enabled; 
            private String TLSVersion; 
            private Integer xffHeaderMode; 
            private java.util.List<String> xffHeaders; 

            /**
             * <p>The ID of the certificate that you want to add.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The type of cipher suite that you want to add. This parameter is available only when you specify the <strong>HttpsPorts</strong> parameter. Valid values:</p>
             * <ul>
             * <li><strong>1:</strong> all cipher suites.</li>
             * <li><strong>2:</strong> strong cipher suites. You can select this value only when you set the <strong>TLSVersion</strong> parameter to <strong>tlsv1.2</strong>.</li>
             * <li><strong>99:</strong> custom cipher suites.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * <p>The custom cipher suites that you want to add. This parameter is available only when you set the <strong>CipherSuite</strong> parameter to <strong>99</strong>.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Specifies whether to support TLS 1.3. This parameter is available only when you specify the <strong>HttpsPorts</strong> parameter. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> supports TLS 1.3.</li>
             * <li><strong>false:</strong> does not support TLS 1.3.</li>
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
             * <p>Specifies whether to enable an exclusive IP address for the domain name. This parameter is available only when you set the <strong>IPv6Enabled</strong> parameter to false and the <strong>ProtectionResource</strong> parameter to <strong>share</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> enables an exclusive IP address for the domain name.</li>
             * <li><strong>false:</strong> does not enable an exclusive IP address for the domain name. This is the default value.</li>
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
             * <p>Specifies whether to enable HTTP to HTTPS redirection for the domain name. This parameter is available only when you specify the <strong>HttpsPorts</strong> parameter and leave the <strong>HttpPorts</strong> parameter empty. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> enables HTTP to HTTPS redirection.</li>
             * <li><strong>false:</strong> disables HTTP to HTTPS redirection.</li>
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
             * <p>Specifies whether to enable HTTP/2. This parameter is available only when you specify the <strong>HttpsPorts</strong> parameter. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> enables HTTP/2.</li>
             * <li><strong>false:</strong> disables HTTP/2. This is the default value.</li>
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
             * <p>An array of HTTP listener ports. Specify the value of this parameter in the [port1,port2,...] format.</p>
             */
            public Builder httpPorts(java.util.List<Integer> httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>An array of HTTPS listener ports. Specify the value of this parameter in the [port1,port2,...] format.</p>
             */
            public Builder httpsPorts(java.util.List<Integer> httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Specifies whether to enable IPv6. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> enables IPv6.</li>
             * <li><strong>false:</strong> disables IPv6. This is the default value.</li>
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
             * <p>The type of the protection resource that you want to use. Valid values:</p>
             * <ul>
             * <li><strong>share:</strong> shared cluster. This is the default value.</li>
             * <li><strong>gslb:</strong> shared cluster-based intelligent load balancing.</li>
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
             * <p>Specifies whether to allow access only from SM certificate-based clients. This parameter is available only if you set SM2Enabled to true.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2AccessOnly(Boolean sM2AccessOnly) {
                this.sM2AccessOnly = sM2AccessOnly;
                return this;
            }

            /**
             * <p>The ID of the SM certificate that you want to add. This parameter is available only if you set SM2Enabled to true.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder sM2CertId(String sM2CertId) {
                this.sM2CertId = sM2CertId;
                return this;
            }

            /**
             * <p>Indicates whether SM certificate-based verification is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2Enabled(Boolean sM2Enabled) {
                this.sM2Enabled = sM2Enabled;
                return this;
            }

            /**
             * <p>The version of the Transport Layer Security (TLS) protocol. This parameter is available only when you specify the <strong>HttpsPorts</strong> parameter. Valid values:</p>
             * <ul>
             * <li><strong>tlsv1</strong></li>
             * <li><strong>tlsv1.1</strong></li>
             * <li><strong>tlsv1.2</strong></li>
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
             * <p>The method that you want WAF to use to obtain the actual IP address of a client. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> No Layer 7 proxies are deployed in front of WAF. This is the default value.</li>
             * <li><strong>1:</strong> WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.</li>
             * <li><strong>2:</strong> WAF reads the value of a custom header field as the actual IP address of the client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * <p>The custom header fields that you want to use to obtain the actual IP address of a client. Specify the value of this parameter in the [&quot;header1&quot;,&quot;header2&quot;,...] format.</p>
             * <blockquote>
             * <p> If you set the <strong>XffHeaderMode</strong> parameter to 2, this parameter is required.</p>
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
     * {@link ModifyDomainRequest} extends {@link TeaModel}
     *
     * <p>ModifyDomainRequest</p>
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

            /**
             * <p>The key of the custom header field.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom header field.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb</p>
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
     * {@link ModifyDomainRequest} extends {@link TeaModel}
     *
     * <p>ModifyDomainRequest</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backends")
        private java.util.List<String> backends;

        @com.aliyun.core.annotation.NameInMap("BackupBackends")
        private java.util.List<String> backupBackends;

        @com.aliyun.core.annotation.NameInMap("CnameEnabled")
        private Boolean cnameEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
        private Integer connectTimeout;

        @com.aliyun.core.annotation.NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 60)
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 10)
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("Loadbalance")
        @com.aliyun.core.annotation.Validation(required = true)
        private String loadbalance;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
        private Integer readTimeout;

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
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
        private Integer writeTimeout;

        @com.aliyun.core.annotation.NameInMap("XffProto")
        private Boolean xffProto;

        private Redirect(Builder builder) {
            this.backends = builder.backends;
            this.backupBackends = builder.backupBackends;
            this.cnameEnabled = builder.cnameEnabled;
            this.connectTimeout = builder.connectTimeout;
            this.focusHttpBackend = builder.focusHttpBackend;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadbalance = builder.loadbalance;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
            this.retry = builder.retry;
            this.routingRules = builder.routingRules;
            this.sniEnabled = builder.sniEnabled;
            this.sniHost = builder.sniHost;
            this.writeTimeout = builder.writeTimeout;
            this.xffProto = builder.xffProto;
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
        public java.util.List<String> getBackends() {
            return this.backends;
        }

        /**
         * @return backupBackends
         */
        public java.util.List<String> getBackupBackends() {
            return this.backupBackends;
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
         * @return keepalive
         */
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        /**
         * @return keepaliveRequests
         */
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
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
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        /**
         * @return xffProto
         */
        public Boolean getXffProto() {
            return this.xffProto;
        }

        public static final class Builder {
            private java.util.List<String> backends; 
            private java.util.List<String> backupBackends; 
            private Boolean cnameEnabled; 
            private Integer connectTimeout; 
            private Boolean focusHttpBackend; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private String loadbalance; 
            private Integer readTimeout; 
            private java.util.List<RequestHeaders> requestHeaders; 
            private Boolean retry; 
            private String routingRules; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Integer writeTimeout; 
            private Boolean xffProto; 

            /**
             * <p>The IP addresses or domain names of the origin server. You can use only one of the address types. If you use the domain name type, the domain name can be resolved only to an IPv4 address.</p>
             * <ul>
             * <li>If you use the IP address type, specify the value in the [&quot;ip1&quot;,&quot;ip2&quot;,...] format. You can enter up to 20 IP addresses.</li>
             * <li>If you use the domain name type, specify the value in the [&quot;domain&quot;] format. You can enter up to 20 domain names.</li>
             * </ul>
             */
            public Builder backends(java.util.List<String> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * BackupBackends.
             */
            public Builder backupBackends(java.util.List<String> backupBackends) {
                this.backupBackends = backupBackends;
                return this;
            }

            /**
             * <p>Specifies whether to enable the public cloud disaster recovery feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
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
             * <p>The timeout period for connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable HTTPS to HTTP redirection for back-to-origin requests. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Specifies whether to enable the persistent connection feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
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
             * <p>The number of reused persistent connections. Valid values: 60 to 1000.</p>
             * <blockquote>
             * <p> This parameter specifies the number of reused persistent connections after you enable the persistent connection feature.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder keepaliveRequests(Integer keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * <p>The timeout period for idle persistent connections. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter specifies the time for which a reused persistent connection can remain in the Idle state before the persistent connection is released.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder keepaliveTimeout(Integer keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * <p>The load balancing algorithm that you want to use to forward requests to the origin server. Valid values:</p>
             * <ul>
             * <li><strong>ip_hash</strong></li>
             * <li><strong>roundRobin</strong></li>
             * <li><strong>leastTime</strong> You can set the parameter to this value only if you set <strong>ProtectionResource</strong> to <strong>gslb</strong>.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>iphash</p>
             */
            public Builder loadbalance(String loadbalance) {
                this.loadbalance = loadbalance;
                return this;
            }

            /**
             * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
             * <p>When a request passes through WAF, the custom header field is automatically used to label the request. This way, the backend service can identify requests that are processed by WAF.</p>
             */
            public Builder requestHeaders(java.util.List<RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>Specifies whether WAF retries forwarding requests to the origin server when the requests fail to be forwarded to the origin server. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
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
             * <p>The forwarding rules that you want to configure for the domain name that you want to add to WAF in hybrid cloud mode. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
             * <ul>
             * <li><strong>rs</strong>: the back-to-origin IP addresses or CNAMEs. The value must be of the ARRAY type.</li>
             * <li><strong>location</strong>: the name of the protection node. The value must be of the STRING type.</li>
             * <li><strong>locationId</strong>: the ID of the protection node. The value must be of the LONG type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;rs&quot;: [
             *                   &quot;1.1.XX.XX&quot;
             *             ],
             *             &quot;locationId&quot;: 535,
             *             &quot;location&quot;: &quot;test1111&quot;
             *       }
             * ]</p>
             */
            public Builder routingRules(String routingRules) {
                this.routingRules = routingRules;
                return this;
            }

            /**
             * <p>Specifies whether to enable origin Server Name Indication (SNI). This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
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
             * <p>The value of the SNI field. If you do not specify this parameter, the value of the <strong>Host</strong> field is automatically used. This parameter is optional. If you want WAF to use an SNI field value that is different from the Host field value in back-to-origin requests, you can specify a custom value for the SNI field.</p>
             * <blockquote>
             * <p> This parameter is required only if you set <strong>SniEnalbed</strong> to xxx.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * <p>The timeout period for write connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            /**
             * <p>Specifies whether to use the X-Forward-For-Proto header to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xffProto(Boolean xffProto) {
                this.xffProto = xffProto;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
}

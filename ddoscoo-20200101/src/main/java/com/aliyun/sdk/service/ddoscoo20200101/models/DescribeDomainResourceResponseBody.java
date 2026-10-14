// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResourceResponseBody</p>
 */
public class DescribeDomainResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("WebRules")
    private java.util.List<WebRules> webRules;

    private DescribeDomainResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webRules = builder.webRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return webRules
     */
    public java.util.List<WebRules> getWebRules() {
        return this.webRules;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<WebRules> webRules; 

        private Builder() {
        } 

        private Builder(DescribeDomainResourceResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.webRules = model.webRules;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of web rules returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>An array of web rule configurations.</p>
         */
        public Builder webRules(java.util.List<WebRules> webRules) {
            this.webRules = webRules;
            return this;
        }

        public DescribeDomainResourceResponseBody build() {
            return new DescribeDomainResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainResourceResponseBody</p>
     */
    public static class ProxyTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProxyPorts")
        private java.util.List<String> proxyPorts;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        private ProxyTypes(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypes create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List<String> proxyPorts; 
            private String proxyType; 

            private Builder() {
            } 

            private Builder(ProxyTypes model) {
                this.proxyPorts = model.proxyPorts;
                this.proxyType = model.proxyType;
            } 

            /**
             * <p>The array of ports associated with the protocol.</p>
             */
            public Builder proxyPorts(java.util.List<String> proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * <p>The proxy protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>http</strong>: HTTP</p>
             * </li>
             * <li><p><strong>https</strong>: HTTPS</p>
             * </li>
             * <li><p><strong>websocket</strong>: WebSocket</p>
             * </li>
             * <li><p><strong>websockets</strong>: WebSockets</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainResourceResponseBody</p>
     */
    public static class WebRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackList")
        private java.util.List<String> blackList;

        @com.aliyun.core.annotation.NameInMap("CcEnabled")
        private Boolean ccEnabled;

        @com.aliyun.core.annotation.NameInMap("CcRuleEnabled")
        private Boolean ccRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("CcTemplate")
        private String ccTemplate;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("CustomCiphers")
        private java.util.List<String> customCiphers;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Http2Enable")
        private Boolean http2Enable;

        @com.aliyun.core.annotation.NameInMap("Http2HttpsEnable")
        private Boolean http2HttpsEnable;

        @com.aliyun.core.annotation.NameInMap("Https2HttpEnable")
        private Boolean https2HttpEnable;

        @com.aliyun.core.annotation.NameInMap("HttpsExt")
        private String httpsExt;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("OcspEnabled")
        private Boolean ocspEnabled;

        @com.aliyun.core.annotation.NameInMap("PolicyMode")
        private String policyMode;

        @com.aliyun.core.annotation.NameInMap("ProxyEnabled")
        private Boolean proxyEnabled;

        @com.aliyun.core.annotation.NameInMap("ProxyTypes")
        private java.util.List<ProxyTypes> proxyTypes;

        @com.aliyun.core.annotation.NameInMap("PunishReason")
        private Integer punishReason;

        @com.aliyun.core.annotation.NameInMap("PunishStatus")
        private Boolean punishStatus;

        @com.aliyun.core.annotation.NameInMap("RealServers")
        private java.util.List<String> realServers;

        @com.aliyun.core.annotation.NameInMap("RsType")
        private Integer rsType;

        @com.aliyun.core.annotation.NameInMap("Ssl13Enabled")
        private Boolean ssl13Enabled;

        @com.aliyun.core.annotation.NameInMap("SslCiphers")
        private String sslCiphers;

        @com.aliyun.core.annotation.NameInMap("SslProtocols")
        private String sslProtocols;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private java.util.List<String> whiteList;

        private WebRules(Builder builder) {
            this.blackList = builder.blackList;
            this.ccEnabled = builder.ccEnabled;
            this.ccRuleEnabled = builder.ccRuleEnabled;
            this.ccTemplate = builder.ccTemplate;
            this.certName = builder.certName;
            this.cname = builder.cname;
            this.customCiphers = builder.customCiphers;
            this.domain = builder.domain;
            this.http2Enable = builder.http2Enable;
            this.http2HttpsEnable = builder.http2HttpsEnable;
            this.https2HttpEnable = builder.https2HttpEnable;
            this.httpsExt = builder.httpsExt;
            this.instanceIds = builder.instanceIds;
            this.ocspEnabled = builder.ocspEnabled;
            this.policyMode = builder.policyMode;
            this.proxyEnabled = builder.proxyEnabled;
            this.proxyTypes = builder.proxyTypes;
            this.punishReason = builder.punishReason;
            this.punishStatus = builder.punishStatus;
            this.realServers = builder.realServers;
            this.rsType = builder.rsType;
            this.ssl13Enabled = builder.ssl13Enabled;
            this.sslCiphers = builder.sslCiphers;
            this.sslProtocols = builder.sslProtocols;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebRules create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        /**
         * @return ccEnabled
         */
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        /**
         * @return ccRuleEnabled
         */
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        /**
         * @return ccTemplate
         */
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return customCiphers
         */
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return http2Enable
         */
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        /**
         * @return http2HttpsEnable
         */
        public Boolean getHttp2HttpsEnable() {
            return this.http2HttpsEnable;
        }

        /**
         * @return https2HttpEnable
         */
        public Boolean getHttps2HttpEnable() {
            return this.https2HttpEnable;
        }

        /**
         * @return httpsExt
         */
        public String getHttpsExt() {
            return this.httpsExt;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return ocspEnabled
         */
        public Boolean getOcspEnabled() {
            return this.ocspEnabled;
        }

        /**
         * @return policyMode
         */
        public String getPolicyMode() {
            return this.policyMode;
        }

        /**
         * @return proxyEnabled
         */
        public Boolean getProxyEnabled() {
            return this.proxyEnabled;
        }

        /**
         * @return proxyTypes
         */
        public java.util.List<ProxyTypes> getProxyTypes() {
            return this.proxyTypes;
        }

        /**
         * @return punishReason
         */
        public Integer getPunishReason() {
            return this.punishReason;
        }

        /**
         * @return punishStatus
         */
        public Boolean getPunishStatus() {
            return this.punishStatus;
        }

        /**
         * @return realServers
         */
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        /**
         * @return rsType
         */
        public Integer getRsType() {
            return this.rsType;
        }

        /**
         * @return ssl13Enabled
         */
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        /**
         * @return sslCiphers
         */
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        /**
         * @return sslProtocols
         */
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        /**
         * @return whiteList
         */
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.List<String> blackList; 
            private Boolean ccEnabled; 
            private Boolean ccRuleEnabled; 
            private String ccTemplate; 
            private String certName; 
            private String cname; 
            private java.util.List<String> customCiphers; 
            private String domain; 
            private Boolean http2Enable; 
            private Boolean http2HttpsEnable; 
            private Boolean https2HttpEnable; 
            private String httpsExt; 
            private java.util.List<String> instanceIds; 
            private Boolean ocspEnabled; 
            private String policyMode; 
            private Boolean proxyEnabled; 
            private java.util.List<ProxyTypes> proxyTypes; 
            private Integer punishReason; 
            private Boolean punishStatus; 
            private java.util.List<String> realServers; 
            private Integer rsType; 
            private Boolean ssl13Enabled; 
            private String sslCiphers; 
            private String sslProtocols; 
            private java.util.List<String> whiteList; 

            private Builder() {
            } 

            private Builder(WebRules model) {
                this.blackList = model.blackList;
                this.ccEnabled = model.ccEnabled;
                this.ccRuleEnabled = model.ccRuleEnabled;
                this.ccTemplate = model.ccTemplate;
                this.certName = model.certName;
                this.cname = model.cname;
                this.customCiphers = model.customCiphers;
                this.domain = model.domain;
                this.http2Enable = model.http2Enable;
                this.http2HttpsEnable = model.http2HttpsEnable;
                this.https2HttpEnable = model.https2HttpEnable;
                this.httpsExt = model.httpsExt;
                this.instanceIds = model.instanceIds;
                this.ocspEnabled = model.ocspEnabled;
                this.policyMode = model.policyMode;
                this.proxyEnabled = model.proxyEnabled;
                this.proxyTypes = model.proxyTypes;
                this.punishReason = model.punishReason;
                this.punishStatus = model.punishStatus;
                this.realServers = model.realServers;
                this.rsType = model.rsType;
                this.ssl13Enabled = model.ssl13Enabled;
                this.sslCiphers = model.sslCiphers;
                this.sslProtocols = model.sslProtocols;
                this.whiteList = model.whiteList;
            } 

            /**
             * <p>An array of IP addresses on the blocklist for the domain.</p>
             */
            public Builder blackList(java.util.List<String> blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * <p>Whether CC protection is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ccEnabled(Boolean ccEnabled) {
                this.ccEnabled = ccEnabled;
                return this;
            }

            /**
             * <p>Whether custom CC protection rules are enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ccRuleEnabled(Boolean ccRuleEnabled) {
                this.ccRuleEnabled = ccRuleEnabled;
                return this;
            }

            /**
             * <p>The CC protection mode. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: normal mode</p>
             * </li>
             * <li><p><strong>gf_under_attack</strong>: Emergency mode</p>
             * </li>
             * <li><p><strong>gf_sos_verify</strong>: Strict mode</p>
             * </li>
             * <li><p><strong>gf_sos_enhance</strong>: Super Strict mode</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * <p>The name of the SSL certificate used by the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>49944XX.pem</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The CNAME assigned to the domain by Anti-DDoS Pro.</p>
             * 
             * <strong>example:</strong>
             * <p>0ekb69x3j9wvXXXX.aliyunddosXXXX.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>An array of custom cipher suites.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Whether HTTP/2 is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder http2Enable(Boolean http2Enable) {
                this.http2Enable = http2Enable;
                return this;
            }

            /**
             * <p>Whether forced HTTPS redirect is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder http2HttpsEnable(Boolean http2HttpsEnable) {
                this.http2HttpsEnable = http2HttpsEnable;
                return this;
            }

            /**
             * <p>Whether HTTP back-to-source is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder https2HttpEnable(Boolean https2HttpEnable) {
                this.https2HttpEnable = https2HttpEnable;
                return this;
            }

            /**
             * <p>The advanced HTTPS settings, formatted as a JSON string. These settings apply only when the domain uses HTTPS (the <code>ProxyType</code> value includes <code>https</code>). The string contains the following fields:</p>
             * <ul>
             * <li><p><strong>Http2https</strong>: integer. Specifies whether to enable forced HTTPS redirect. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
             * </li>
             * <li><p><strong>Https2http</strong>: integer. Specifies whether to enable HTTP back-to-source. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
             * </li>
             * <li><p><strong>Http2</strong>: integer. Specifies whether to enable HTTP/2. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Https2http&quot;:0,&quot;Http2&quot;:0,&quot;Http2https&quot;:0}</p>
             */
            public Builder httpsExt(String httpsExt) {
                this.httpsExt = httpsExt;
                return this;
            }

            /**
             * <p>An array of IDs for the Anti-DDoS Pro instances associated with the domain.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>Whether Online Certificate Status Protocol (OCSP) is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ocspEnabled(Boolean ocspEnabled) {
                this.ocspEnabled = ocspEnabled;
                return this;
            }

            /**
             * <p>The back-to-source load balancing algorithm. This algorithm determines how traffic is distributed to origin servers. Valid values:</p>
             * <ul>
             * <li><p><strong>ip_hash</strong>: IP Hash. This algorithm hashes the source IP address and routes all requests from the same IP address to the same origin server.</p>
             * </li>
             * <li><p><strong>rr</strong>: Round Robin. This algorithm distributes requests across origin servers in turn.</p>
             * </li>
             * <li><p><strong>least_time</strong>: Least Time. This algorithm uses intelligent DNS resolution to minimize end-to-end latency from the protection node to the origin server.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip_hash</p>
             */
            public Builder policyMode(String policyMode) {
                this.policyMode = policyMode;
                return this;
            }

            /**
             * <p>Whether Anti-DDoS Pro forwards traffic for the domain. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Forwarding is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Forwarding is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder proxyEnabled(Boolean proxyEnabled) {
                this.proxyEnabled = proxyEnabled;
                return this;
            }

            /**
             * <p>An array of proxy configurations for the domain, each specifying a protocol and its associated ports.</p>
             */
            public Builder proxyTypes(java.util.List<ProxyTypes> proxyTypes) {
                this.proxyTypes = proxyTypes;
                return this;
            }

            /**
             * <p>The reason the domain is penalized. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The domain does not have an ICP filing.</p>
             * </li>
             * <li><p><strong>2</strong>: The business hosted on the domain does not meet regulatory requirements.</p>
             * </li>
             * </ul>
             * <p>If both reasons apply, this parameter returns <strong>2</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder punishReason(Integer punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * <p>Whether the domain is penalized. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The domain is penalized. For more information, see the <code>PunishReason</code> parameter.</p>
             * </li>
             * <li><p><strong>false</strong>: The domain is not penalized.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder punishStatus(Boolean punishStatus) {
                this.punishStatus = punishStatus;
                return this;
            }

            /**
             * <p>An array of origin server addresses.</p>
             */
            public Builder realServers(java.util.List<String> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * <p>The address type of the origin server. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: IP address</p>
             * </li>
             * <li><p><strong>1</strong>: domain</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rsType(Integer rsType) {
                this.rsType = rsType;
                return this;
            }

            /**
             * <p>Whether TLS 1.3 is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ssl13Enabled(Boolean ssl13Enabled) {
                this.ssl13Enabled = ssl13Enabled;
                return this;
            }

            /**
             * <p>The cipher suite configuration type. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: Custom</p>
             * </li>
             * <li><p><strong>all</strong>: All</p>
             * </li>
             * <li><p><strong>strong</strong>: Strong</p>
             * </li>
             * <li><p><strong>improved</strong>: Improved</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder sslCiphers(String sslCiphers) {
                this.sslCiphers = sslCiphers;
                return this;
            }

            /**
             * <p>The minimum TLS protocol version. Valid values:</p>
             * <ul>
             * <li><p><strong>tls1.0</strong>: TLS 1.0 and later versions.</p>
             * </li>
             * <li><p><strong>tls1.1</strong>: TLS 1.1 and later versions.</p>
             * </li>
             * <li><p><strong>tls1.2</strong>: TLS 1.2 and later versions.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tls1.0</p>
             */
            public Builder sslProtocols(String sslProtocols) {
                this.sslProtocols = sslProtocols;
                return this;
            }

            /**
             * <p>An array of IP addresses on the allowlist for the domain.</p>
             */
            public Builder whiteList(java.util.List<String> whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public WebRules build() {
                return new WebRules(this);
            } 

        } 

    }
}

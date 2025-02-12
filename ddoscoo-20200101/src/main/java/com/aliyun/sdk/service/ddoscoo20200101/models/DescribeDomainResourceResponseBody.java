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

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of forwarding rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The configurations of the forwarding rule.</p>
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

            /**
             * <p>The port numbers.</p>
             */
            public Builder proxyPorts(java.util.List<String> proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>http</strong></li>
             * <li><strong>https</strong></li>
             * <li><strong>websocket</strong></li>
             * <li><strong>websockets</strong></li>
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

            /**
             * <p>The IP addresses that are included in the blacklist of the domain name.</p>
             */
            public Builder blackList(java.util.List<String> blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * <p>Indicates whether Frequency Control is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether the Custom Rules switch of Frequency Control is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The mode of Frequency Control. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: the Normal mode</li>
             * <li><strong>gf_under_attack</strong>: the Emergency mode</li>
             * <li><strong>gf_sos_verify</strong>: the Strict mode</li>
             * <li><strong>gf_sos_verify</strong>: the Super Strict mode</li>
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
             * <p>The name of the SSL certificate used by the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>49944XX.pem</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The CNAME provided by the instance to which the domain name is added.</p>
             * 
             * <strong>example:</strong>
             * <p>0ekb69x3j9wvXXXX.aliyunddosXXXX.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
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
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether Enable HTTP/2 is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether Enable HTTPS Redirection is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether Enable HTTP Redirection of Back-to-origin Requests is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The advanced HTTPS settings. This parameter takes effect only when the value of the <strong>ProxyType</strong> parameter includes <strong>https</strong>. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
             * <ul>
             * <li><strong>Http2https</strong>: indicates whether Enable HTTPS Redirection is turned on. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTPS Redirection is turned on. The value 1 indicates that Enable HTTPS Redirection is turned off.</li>
             * <li><strong>Https2http</strong>: indicates whether Enable HTTP Redirection of Back-to-origin Requests is turned on. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is turned on. The value 1 indicates that the feature is turned off.</li>
             * <li><strong>Http2</strong>: indicates whether Enable HTTP/2 is turned on. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on.</li>
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
             * <p>The IDs of the instances to which the domain name is added.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>Indicates whether the Online Certificate Status Protocol (OCSP) feature is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The scheduling algorithm for back-to-origin traffic. Valid values:</p>
             * <ul>
             * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</li>
             * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</li>
             * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from the instance to origin servers based on the intelligent DNS resolution feature.</li>
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
             * <p>Indicates whether the instance forwards the traffic that is destined for the website. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The details about the protocol type and port number.</p>
             */
            public Builder proxyTypes(java.util.List<ProxyTypes> proxyTypes) {
                this.proxyTypes = proxyTypes;
                return this;
            }

            /**
             * <p>The reason why the domain name is invalid. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: No Content Provider (ICP) filing is completed for the domain name.</li>
             * <li><strong>2</strong>: The business for which you registered the domain name does not meet regulatory requirements.</li>
             * </ul>
             * <p>If the two reasons are both involved, the value <strong>2</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder punishReason(Integer punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is invalid. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The domain name is invalid. You can view the specific reasons from the <strong>PunishReason</strong> parameter.</li>
             * <li><strong>false</strong>: The domain name is valid.</li>
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
             * <p>The addresses of origin servers.</p>
             */
            public Builder realServers(java.util.List<String> realServers) {
                this.realServers = realServers;
                return this;
            }

            /**
             * <p>The address type of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: IP address</li>
             * <li><strong>1</strong>: domain name</li>
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
             * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The type of the cipher suite. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: custom cipher suite</li>
             * <li><strong>all</strong>: all cipher suites</li>
             * <li><strong>strong</strong>: strong cipher suites</li>
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
             * <p>The version of the TLS protocol. Valid values:</p>
             * <ul>
             * <li><strong>tls1.0</strong>: TLS 1.0 or later</li>
             * <li><strong>tls1.1</strong>: TLS 1.1 or later</li>
             * <li><strong>tls1.2</strong>: TLS 1.2 or later</li>
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
             * <p>The IP addresses that are included in the whitelist of the domain name.</p>
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

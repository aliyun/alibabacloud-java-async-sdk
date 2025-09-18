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
 * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailResponseBody</p>
 */
public class DescribeDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertDetail")
    private CertDetail certDetail;

    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("Listen")
    private Listen listen;

    @com.aliyun.core.annotation.NameInMap("Redirect")
    private Redirect redirect;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SM2CertDetail")
    private SM2CertDetail sM2CertDetail;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeDomainDetailResponseBody(Builder builder) {
        this.certDetail = builder.certDetail;
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.domainId = builder.domainId;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.requestId = builder.requestId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.sM2CertDetail = builder.sM2CertDetail;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certDetail
     */
    public CertDetail getCertDetail() {
        return this.certDetail;
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
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
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return sM2CertDetail
     */
    public SM2CertDetail getSM2CertDetail() {
        return this.sM2CertDetail;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private CertDetail certDetail; 
        private String cname; 
        private String domain; 
        private String domainId; 
        private Listen listen; 
        private Redirect redirect; 
        private String requestId; 
        private String resourceManagerResourceGroupId; 
        private SM2CertDetail sM2CertDetail; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(DescribeDomainDetailResponseBody model) {
            this.certDetail = model.certDetail;
            this.cname = model.cname;
            this.domain = model.domain;
            this.domainId = model.domainId;
            this.listen = model.listen;
            this.redirect = model.redirect;
            this.requestId = model.requestId;
            this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
            this.sM2CertDetail = model.sM2CertDetail;
            this.status = model.status;
        } 

        /**
         * <p>The details of the SSL certificate.</p>
         */
        public Builder certDetail(CertDetail certDetail) {
            this.certDetail = certDetail;
            return this;
        }

        /**
         * <p>The CNAME that is assigned by WAF to the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxcvdaf.****.com</p>
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The configurations of the listeners.</p>
         */
        public Builder listen(Listen listen) {
            this.listen = listen;
            return this;
        }

        /**
         * <p>The configurations of the forwarding rule.</p>
         */
        public Builder redirect(Redirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BAEF9CA9-66A0-533E-BD09-5D5D7AA8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The information about the SM certificate.</p>
         */
        public Builder sM2CertDetail(SM2CertDetail sM2CertDetail) {
            this.sM2CertDetail = sM2CertDetail;
            return this;
        }

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1:</strong> The domain name is in a normal state.</li>
         * <li><strong>2:</strong> The domain name is being created.</li>
         * <li><strong>3:</strong> The domain name is being modified.</li>
         * <li><strong>4:</strong> The domain name is being released.</li>
         * <li><strong>5:</strong> WAF no longer forwards traffic of the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeDomainDetailResponseBody build() {
            return new DescribeDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class CertDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private java.util.List<String> sans;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private CertDetail(Builder builder) {
            this.commonName = builder.commonName;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.sans = builder.sans;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertDetail create() {
            return builder().build();
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sans
         */
        public java.util.List<String> getSans() {
            return this.sans;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String commonName; 
            private Long endTime; 
            private String id; 
            private String name; 
            private java.util.List<String> sans; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(CertDetail model) {
                this.commonName = model.commonName;
                this.endTime = model.endTime;
                this.id = model.id;
                this.name = model.name;
                this.sans = model.sans;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The domain name of your website.</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyundoc.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The end of the validity period of the SSL certificate. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1685590400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cert-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>All domain names that are bound to the certificate.</p>
             */
            public Builder sans(java.util.List<String> sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The beginning of the validity period of the SSL certificate. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1677772800000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public CertDetail build() {
                return new CertDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class Listen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private Long cipherSuite;

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

        @com.aliyun.core.annotation.NameInMap("SM2AccessOnly")
        private Boolean sM2AccessOnly;

        @com.aliyun.core.annotation.NameInMap("SM2CertId")
        private String sM2CertId;

        @com.aliyun.core.annotation.NameInMap("SM2Enabled")
        private Boolean sM2Enabled;

        @com.aliyun.core.annotation.NameInMap("TLSVersion")
        private String TLSVersion;

        @com.aliyun.core.annotation.NameInMap("XffHeaderMode")
        private Long xffHeaderMode;

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
        public Long getCipherSuite() {
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
        public Long getXffHeaderMode() {
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
            private Long cipherSuite; 
            private java.util.List<String> customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean exclusiveIp; 
            private Boolean focusHttps; 
            private Boolean http2Enabled; 
            private java.util.List<Long> httpPorts; 
            private java.util.List<Long> httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private Boolean sM2AccessOnly; 
            private String sM2CertId; 
            private Boolean sM2Enabled; 
            private String TLSVersion; 
            private Long xffHeaderMode; 
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
                this.sM2AccessOnly = model.sM2AccessOnly;
                this.sM2CertId = model.sM2CertId;
                this.sM2Enabled = model.sM2Enabled;
                this.TLSVersion = model.TLSVersion;
                this.xffHeaderMode = model.xffHeaderMode;
                this.xffHeaders = model.xffHeaders;
            } 

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The type of the cipher suites. Valid values:</p>
             * <ul>
             * <li><strong>1:</strong> all cipher suites.</li>
             * <li><strong>2:</strong> strong cipher suites.</li>
             * <li><strong>99:</strong> custom cipher suites.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cipherSuite(Long cipherSuite) {
                this.cipherSuite = cipherSuite;
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
             * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> TLS 1.3 is supported.</li>
             * <li><strong>false:</strong> TLS 1.3 is not supported.</li>
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
             * <p>Indicates whether an exclusive IP address is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> An exclusive IP address is enabled for the domain name.</li>
             * <li><strong>false:</strong> No exclusive IP addresses are enabled for the domain name.</li>
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
             * <p>Indicates whether HTTP to HTTPS redirection is enabled for the domain name. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> HTTP to HTTPS redirection is enabled.</li>
             * <li><strong>false:</strong> HTTP to HTTPS redirection is disabled.</li>
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
             * <li><strong>true:</strong> HTTP/2 is enabled.</li>
             * <li><strong>false:</strong> HTTP/2 is disabled.</li>
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
             * <p>An array of HTTP listener ports.</p>
             */
            public Builder httpPorts(java.util.List<Long> httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>An array of HTTPS listener ports.</p>
             */
            public Builder httpsPorts(java.util.List<Long> httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> IPv6 is enabled.</li>
             * <li><strong>false:</strong> IPv6 is disabled.</li>
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
             * <p>The type of protection resource that is used. Valid values:</p>
             * <ul>
             * <li><strong>share:</strong> shared cluster.</li>
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
             * <p>Indicates whether only SM certificate-based clients can access the domain name. This parameter is returned only if the value of SM2Enabled is true. Valid values:</p>
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
             * <p>The ID of the SM certificate that is added. This parameter is returned only if the value of SM2Enabled is true.</p>
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
             * <p>The version of the Transport Layer Security (TLS) protocol. Valid values:</p>
             * <ul>
             * <li><strong>tlsv1</strong></li>
             * <li><strong>tlsv1.1</strong></li>
             * <li><strong>tlsv1.2</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tlsv1.2</p>
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            /**
             * <p>The method that WAF uses to obtain the actual IP address of a client. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> No Layer 7 proxies are deployed in front of WAF.</li>
             * <li><strong>1:</strong> WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.</li>
             * <li><strong>2:</strong> WAF reads the value of a custom header field as the actual IP address of the client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder xffHeaderMode(Long xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * <p>An array of custom header fields that are used to obtain the actual IP address of a client.</p>
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
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
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
             * BackendPort.
             */
            public Builder backendPort(Integer backendPort) {
                this.backendPort = backendPort;
                return this;
            }

            /**
             * ListenPort.
             */
            public Builder listenPort(Integer listenPort) {
                this.listenPort = listenPort;
                return this;
            }

            /**
             * Protocol.
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
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class Backends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backend")
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

            private Builder() {
            } 

            private Builder(Backends model) {
                this.backend = model.backend;
            } 

            /**
             * <p>The IP address or domain name of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
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
    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class BackupBackends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backend")
        private String backend;

        private BackupBackends(Builder builder) {
            this.backend = builder.backend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupBackends create() {
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

            private Builder() {
            } 

            private Builder(BackupBackends model) {
                this.backend = model.backend;
            } 

            /**
             * <p>The back-to-origin IP address or domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     &quot;1.1.XX.XX&quot;,
             *     &quot;2.2.XX.XX&quot;
             * ]</p>
             */
            public Builder backend(String backend) {
                this.backend = backend;
                return this;
            }

            public BackupBackends build() {
                return new BackupBackends(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
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
             * <p>The custom header field.</p>
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
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackUpBackendList")
        private java.util.List<String> backUpBackendList;

        @com.aliyun.core.annotation.NameInMap("BackendList")
        private java.util.List<String> backendList;

        @com.aliyun.core.annotation.NameInMap("BackendPorts")
        private java.util.List<BackendPorts> backendPorts;

        @com.aliyun.core.annotation.NameInMap("Backends")
        @Deprecated
        private java.util.List<Backends> backends;

        @com.aliyun.core.annotation.NameInMap("BackupBackends")
        @Deprecated
        private java.util.List<BackupBackends> backupBackends;

        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Integer connectTimeout;

        @com.aliyun.core.annotation.NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("Loadbalance")
        private String loadbalance;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        private Integer readTimeout;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private java.util.List<RequestHeaders> requestHeaders;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Boolean retry;

        @com.aliyun.core.annotation.NameInMap("SniEnabled")
        private Boolean sniEnabled;

        @com.aliyun.core.annotation.NameInMap("SniHost")
        private String sniHost;

        @com.aliyun.core.annotation.NameInMap("WLProxyClientIp")
        private Boolean WLProxyClientIp;

        @com.aliyun.core.annotation.NameInMap("WebServerType")
        private Boolean webServerType;

        @com.aliyun.core.annotation.NameInMap("WriteTimeout")
        private Integer writeTimeout;

        @com.aliyun.core.annotation.NameInMap("XClientIp")
        private Boolean xClientIp;

        @com.aliyun.core.annotation.NameInMap("XTrueIp")
        private Boolean xTrueIp;

        @com.aliyun.core.annotation.NameInMap("XffProto")
        private Boolean xffProto;

        private Redirect(Builder builder) {
            this.backUpBackendList = builder.backUpBackendList;
            this.backendList = builder.backendList;
            this.backendPorts = builder.backendPorts;
            this.backends = builder.backends;
            this.backupBackends = builder.backupBackends;
            this.connectTimeout = builder.connectTimeout;
            this.focusHttpBackend = builder.focusHttpBackend;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadbalance = builder.loadbalance;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
            this.retry = builder.retry;
            this.sniEnabled = builder.sniEnabled;
            this.sniHost = builder.sniHost;
            this.WLProxyClientIp = builder.WLProxyClientIp;
            this.webServerType = builder.webServerType;
            this.writeTimeout = builder.writeTimeout;
            this.xClientIp = builder.xClientIp;
            this.xTrueIp = builder.xTrueIp;
            this.xffProto = builder.xffProto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
        }

        /**
         * @return backUpBackendList
         */
        public java.util.List<String> getBackUpBackendList() {
            return this.backUpBackendList;
        }

        /**
         * @return backendList
         */
        public java.util.List<String> getBackendList() {
            return this.backendList;
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
        public java.util.List<Backends> getBackends() {
            return this.backends;
        }

        /**
         * @return backupBackends
         */
        public java.util.List<BackupBackends> getBackupBackends() {
            return this.backupBackends;
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
         * @return WLProxyClientIp
         */
        public Boolean getWLProxyClientIp() {
            return this.WLProxyClientIp;
        }

        /**
         * @return webServerType
         */
        public Boolean getWebServerType() {
            return this.webServerType;
        }

        /**
         * @return writeTimeout
         */
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        /**
         * @return xClientIp
         */
        public Boolean getXClientIp() {
            return this.xClientIp;
        }

        /**
         * @return xTrueIp
         */
        public Boolean getXTrueIp() {
            return this.xTrueIp;
        }

        /**
         * @return xffProto
         */
        public Boolean getXffProto() {
            return this.xffProto;
        }

        public static final class Builder {
            private java.util.List<String> backUpBackendList; 
            private java.util.List<String> backendList; 
            private java.util.List<BackendPorts> backendPorts; 
            private java.util.List<Backends> backends; 
            private java.util.List<BackupBackends> backupBackends; 
            private Integer connectTimeout; 
            private Boolean focusHttpBackend; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private String loadbalance; 
            private Integer readTimeout; 
            private java.util.List<RequestHeaders> requestHeaders; 
            private Boolean retry; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Boolean WLProxyClientIp; 
            private Boolean webServerType; 
            private Integer writeTimeout; 
            private Boolean xClientIp; 
            private Boolean xTrueIp; 
            private Boolean xffProto; 

            private Builder() {
            } 

            private Builder(Redirect model) {
                this.backUpBackendList = model.backUpBackendList;
                this.backendList = model.backendList;
                this.backendPorts = model.backendPorts;
                this.backends = model.backends;
                this.backupBackends = model.backupBackends;
                this.connectTimeout = model.connectTimeout;
                this.focusHttpBackend = model.focusHttpBackend;
                this.keepalive = model.keepalive;
                this.keepaliveRequests = model.keepaliveRequests;
                this.keepaliveTimeout = model.keepaliveTimeout;
                this.loadbalance = model.loadbalance;
                this.readTimeout = model.readTimeout;
                this.requestHeaders = model.requestHeaders;
                this.retry = model.retry;
                this.sniEnabled = model.sniEnabled;
                this.sniHost = model.sniHost;
                this.WLProxyClientIp = model.WLProxyClientIp;
                this.webServerType = model.webServerType;
                this.writeTimeout = model.writeTimeout;
                this.xClientIp = model.xClientIp;
                this.xTrueIp = model.xTrueIp;
                this.xffProto = model.xffProto;
            } 

            /**
             * BackUpBackendList.
             */
            public Builder backUpBackendList(java.util.List<String> backUpBackendList) {
                this.backUpBackendList = backUpBackendList;
                return this;
            }

            /**
             * BackendList.
             */
            public Builder backendList(java.util.List<String> backendList) {
                this.backendList = backendList;
                return this;
            }

            /**
             * BackendPorts.
             */
            public Builder backendPorts(java.util.List<BackendPorts> backendPorts) {
                this.backendPorts = backendPorts;
                return this;
            }

            /**
             * <p>An array of addresses of origin servers.</p>
             */
            public Builder backends(java.util.List<Backends> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * <p>An array of HTTPS listener ports.</p>
             */
            public Builder backupBackends(java.util.List<BackupBackends> backupBackends) {
                this.backupBackends = backupBackends;
                return this;
            }

            /**
             * <p>The timeout period of the connection. Unit: seconds. Valid values: 5 to 120.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS to HTTP redirection is enabled for back-to-origin requests of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> HTTPS to HTTP redirection for back-to-origin requests of the domain name is enabled.</li>
             * <li><strong>false:</strong> HTTPS to HTTP redirection for back-to-origin requests of the domain name is disabled.</li>
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
             * <p>Indicates whether the persistent connection feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The persistent connection feature is enabled. This is the default value.</li>
             * <li><strong>false:</strong> The persistent connection feature is disabled.</li>
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
             * <p> This parameter specifies the number of reused persistent connections when you enable the persistent connection feature.</p>
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
             * <p>The timeout period of persistent connections that are in the Idle state. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter specifies the period of time during which a reused persistent connection is allowed to remain in the Idle state before the persistent connection is released.</p>
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
             * <p>The load balancing algorithm that is used when WAF forwards requests to the origin server. Valid values:</p>
             * <ul>
             * <li><strong>ip_hash:</strong> the IP hash algorithm.</li>
             * <li><strong>roundRobin:</strong> the round-robin algorithm.</li>
             * <li><strong>leastTime:</strong> the least response time algorithm.</li>
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
             * <p>The read timeout period. Unit: seconds. Valid values: 5 to 1800.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>An array of key-value pairs that are used to mark the requests that pass through the WAF instance.</p>
             */
            public Builder requestHeaders(java.util.List<RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>Indicates whether WAF retries when requests fail to be forwarded to the origin server. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> WAF retries. This is the default value.</li>
             * <li><strong>false:</strong> WAF does not retry.</li>
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
             * <p>Indicates whether origin Server Name Indication (SNI) is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> Origin SNI is enabled.</li>
             * <li><strong>false:</strong> Origin SNI is disabled. This is the default value.</li>
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
             * <p>The value of the custom SNI field.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * WLProxyClientIp.
             */
            public Builder WLProxyClientIp(Boolean WLProxyClientIp) {
                this.WLProxyClientIp = WLProxyClientIp;
                return this;
            }

            /**
             * WebServerType.
             */
            public Builder webServerType(Boolean webServerType) {
                this.webServerType = webServerType;
                return this;
            }

            /**
             * <p>The write timeout period. Unit: seconds. Valid values: 5 to 1800.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            /**
             * XClientIp.
             */
            public Builder xClientIp(Boolean xClientIp) {
                this.xClientIp = xClientIp;
                return this;
            }

            /**
             * XTrueIp.
             */
            public Builder xTrueIp(Boolean xTrueIp) {
                this.xTrueIp = xTrueIp;
                return this;
            }

            /**
             * <p>Indicates whether the X-Forward-For-Proto header is used to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
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
    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class SM2CertDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private java.util.List<String> sans;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private SM2CertDetail(Builder builder) {
            this.commonName = builder.commonName;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.sans = builder.sans;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SM2CertDetail create() {
            return builder().build();
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sans
         */
        public java.util.List<String> getSans() {
            return this.sans;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String commonName; 
            private Long endTime; 
            private String id; 
            private String name; 
            private java.util.List<String> sans; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(SM2CertDetail model) {
                this.commonName = model.commonName;
                this.endTime = model.endTime;
                this.id = model.id;
                this.name = model.name;
                this.sans = model.sans;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The domain name of your website.</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyundoc.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The end of the validity period of the SSL certificate. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1665590400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the SSL certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test-sm2-cert-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>All domain names that are bound to the certificate.</p>
             */
            public Builder sans(java.util.List<String> sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The beginning of the validity period of the SSL certificate. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1657551525000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SM2CertDetail build() {
                return new SM2CertDetail(this);
            } 

        } 

    }
}

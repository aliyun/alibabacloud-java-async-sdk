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
         * <p>The SSL certificate details.</p>
         */
        public Builder certDetail(CertDetail certDetail) {
            this.certDetail = certDetail;
            return this;
        }

        /**
         * <p>The CNAME assigned by WAF to the domain name.</p>
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
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com-waf">www.aliyundoc.com-waf</a></p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The listener configuration.</p>
         */
        public Builder listen(Listen listen) {
            this.listen = listen;
            return this;
        }

        /**
         * <p>The forwarding configuration.</p>
         */
        public Builder redirect(Redirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BAEF9CA9-66A0-533E-BD09-5D5D7AA8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The SM2 certificate information.</p>
         */
        public Builder sM2CertDetail(SM2CertDetail sM2CertDetail) {
            this.sM2CertDetail = sM2CertDetail;
            return this;
        }

        /**
         * <p>The domain name status. Valid values:</p>
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
             * <p>The common name (CN).</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyundoc.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the certificate expires. The value is a UNIX timestamp (UTC). Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1685590400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The SSL certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The certificate name.</p>
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
             * <p>The effective period of the certificate. The value is in the format of a UNIX timestamp (UTC). Unit: milliseconds.</p>
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

        @com.aliyun.core.annotation.NameInMap("HstsIncludeSubDomain")
        private Boolean hstsIncludeSubDomain;

        @com.aliyun.core.annotation.NameInMap("HstsMaxAge")
        private Long hstsMaxAge;

        @com.aliyun.core.annotation.NameInMap("HstsPreload")
        private Boolean hstsPreload;

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
            this.hstsIncludeSubDomain = builder.hstsIncludeSubDomain;
            this.hstsMaxAge = builder.hstsMaxAge;
            this.hstsPreload = builder.hstsPreload;
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
         * @return hstsIncludeSubDomain
         */
        public Boolean getHstsIncludeSubDomain() {
            return this.hstsIncludeSubDomain;
        }

        /**
         * @return hstsMaxAge
         */
        public Long getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        /**
         * @return hstsPreload
         */
        public Boolean getHstsPreload() {
            return this.hstsPreload;
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
            private Boolean hstsIncludeSubDomain; 
            private Long hstsMaxAge; 
            private Boolean hstsPreload; 
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
                this.hstsIncludeSubDomain = model.hstsIncludeSubDomain;
                this.hstsMaxAge = model.hstsMaxAge;
                this.hstsPreload = model.hstsPreload;
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
             * <p>The type of the cipher suite. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cipherSuite(Long cipherSuite) {
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
             * <li><p><strong>true</strong>: An exclusive IP address is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: An exclusive IP address is not enabled.</p>
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
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder focusHttps(Boolean focusHttps) {
                this.focusHttps = focusHttps;
                return this;
            }

            /**
             * <p>Indicates whether HSTS includes subdomains. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Not enabled.</p>
             * </li>
             * </ul>
             */
            public Builder hstsIncludeSubDomain(Boolean hstsIncludeSubDomain) {
                this.hstsIncludeSubDomain = hstsIncludeSubDomain;
                return this;
            }

            /**
             * <p>The HSTS expiration time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>365000</p>
             */
            public Builder hstsMaxAge(Long hstsMaxAge) {
                this.hstsMaxAge = hstsMaxAge;
                return this;
            }

            /**
             * <p>Indicates whether HSTS preloading is enabled. This feature is disabled by default. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hstsPreload(Boolean hstsPreload) {
                this.hstsPreload = hstsPreload;
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
             * <p>The listening port for the HTTP protocol.</p>
             */
            public Builder httpPorts(java.util.List<Long> httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The listening port for the HTTPS protocol.</p>
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
             * 
             * <strong>example:</strong>
             * <p>share</p>
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * <p>Indicates whether only SM client access is allowed. This parameter is used only when SM2Enable is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2AccessOnly(Boolean sM2AccessOnly) {
                this.sM2AccessOnly = sM2AccessOnly;
                return this;
            }

            /**
             * <p>The ID of the China Encryption Standard (SM) certificate to add. This parameter is used only when SM2Enable is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder sM2CertId(String sM2CertId) {
                this.sM2CertId = sM2CertId;
                return this;
            }

            /**
             * <p>Indicates whether the China Encryption Standard (SM) certificate is enabled. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2Enabled(Boolean sM2Enabled) {
                this.sM2Enabled = sM2Enabled;
                return this;
            }

            /**
             * <p>The TLS version. Valid values:</p>
             * <ul>
             * <li><p><strong>tlsv1</strong>: Supports TLS 1.0 and later. Provides the highest compatibility and the lowest security.</p>
             * </li>
             * <li><p><strong>tlsv1.1</strong>: Supports TLS 1.1 and later. Provides good compatibility and good security.</p>
             * </li>
             * <li><p><strong>tlsv1.2</strong>: Supports TLS 1.2 and later. Provides good compatibility and the highest security.</p>
             * </li>
             * <li><p><strong>tlsv1.3</strong>: Supports only TLS 1.3. Provides the highest security and the lowest compatibility.</p>
             * </li>
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
             * <p>The method that WAF uses to obtain the originating IP address of the client. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The client access traffic is not forwarded by other Layer 7 proxies before reaching WAF.</p>
             * </li>
             * <li><p><strong>1</strong>: WAF reads the first value in the X-Forwarded-For (XFF) header field of the request as the client IP address.</p>
             * </li>
             * <li><p><strong>2</strong>: WAF reads the value of a custom header field that you specify in the request as the client IP address.</p>
             * </li>
             * <li><p><strong>3</strong>: WAF reads the Client IP from the Proxy Protocol header as the client IP address.</p>
             * </li>
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
             * <p>The custom header fields used to obtain the client IP address.</p>
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
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenPort(Integer listenPort) {
                this.listenPort = listenPort;
                return this;
            }

            /**
             * <p>The protocol type of the listener port. Valid values:</p>
             * <ul>
             * <li><strong>http</strong>: HTTP protocol.</li>
             * <li><strong>https</strong>: HTTPS protocol.</li>
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
             * <p>The IP address or domain name of the origin server for the domain name.</p>
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
             * <p>The IP address or domain name of the secondary origin server for the domain name.</p>
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
             * <p>The custom request header field.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom request header field.</p>
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

        @com.aliyun.core.annotation.NameInMap("Http2Origin")
        private Boolean http2Origin;

        @com.aliyun.core.annotation.NameInMap("Http2OriginMaxConcurrency")
        private Integer http2OriginMaxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("Loadbalance")
        private String loadbalance;

        @com.aliyun.core.annotation.NameInMap("MaxBodySize")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
        private Integer maxBodySize;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocol")
        private Boolean proxyProtocol;

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
            this.http2Origin = builder.http2Origin;
            this.http2OriginMaxConcurrency = builder.http2OriginMaxConcurrency;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadbalance = builder.loadbalance;
            this.maxBodySize = builder.maxBodySize;
            this.proxyProtocol = builder.proxyProtocol;
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
         * @return http2Origin
         */
        public Boolean getHttp2Origin() {
            return this.http2Origin;
        }

        /**
         * @return http2OriginMaxConcurrency
         */
        public Integer getHttp2OriginMaxConcurrency() {
            return this.http2OriginMaxConcurrency;
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
         * @return maxBodySize
         */
        public Integer getMaxBodySize() {
            return this.maxBodySize;
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
            private Boolean http2Origin; 
            private Integer http2OriginMaxConcurrency; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private String loadbalance; 
            private Integer maxBodySize; 
            private Boolean proxyProtocol; 
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
                this.http2Origin = model.http2Origin;
                this.http2OriginMaxConcurrency = model.http2OriginMaxConcurrency;
                this.keepalive = model.keepalive;
                this.keepaliveRequests = model.keepaliveRequests;
                this.keepaliveTimeout = model.keepaliveTimeout;
                this.loadbalance = model.loadbalance;
                this.maxBodySize = model.maxBodySize;
                this.proxyProtocol = model.proxyProtocol;
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
             * <p>The list of backup origin server IP addresses or back-to-origin domain names for the domain name.</p>
             */
            public Builder backUpBackendList(java.util.List<String> backUpBackendList) {
                this.backUpBackendList = backUpBackendList;
                return this;
            }

            /**
             * <p>The list of origin server IP addresses or back-to-origin domain names for the domain name.</p>
             */
            public Builder backendList(java.util.List<String> backendList) {
                this.backendList = backendList;
                return this;
            }

            /**
             * <p>The custom port configuration. By default, the port is the same as the listener port.</p>
             */
            public Builder backendPorts(java.util.List<BackendPorts> backendPorts) {
                this.backendPorts = backendPorts;
                return this;
            }

            /**
             * <p>The back-to-origin addresses of the domain name.</p>
             */
            public Builder backends(java.util.List<Backends> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * <p>The secondary origin addresses of the domain name.</p>
             * <blockquote>
             * <p>This parameter is about to be deprecated. Use <strong>BackUpBackendList</strong> to obtain the related information.</p>
             * </blockquote>
             */
            public Builder backupBackends(java.util.List<BackupBackends> backupBackends) {
                this.backupBackends = backupBackends;
                return this;
            }

            /**
             * <p>The connection timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder connectTimeout(Integer connectTimeout) {
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
             * <p>Indicates whether HTTP/2 back-to-origin is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder http2Origin(Boolean http2Origin) {
                this.http2Origin = http2Origin;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections for HTTP/2 back-to-origin.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder http2OriginMaxConcurrency(Integer http2OriginMaxConcurrency) {
                this.http2OriginMaxConcurrency = http2OriginMaxConcurrency;
                return this;
            }

            /**
             * <p>Specifies whether to keep the connection alive. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): The connection is kept alive.</p>
             * </li>
             * <li><p><strong>false</strong>: The connection is not kept alive.</p>
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
             * <p>The number of requests that reuse a persistent connection. Valid values: 60 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder keepaliveRequests(Integer keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * <p>The idle timeout period for persistent connections. Valid values: 1 to 60. Default value: 15. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder keepaliveTimeout(Integer keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * <p>The load balancing algorithm used for back-to-origin requests. Valid values:</p>
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
             * <p>The maximum request body size. Valid values: 2 to 10. Default value: 2. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxBodySize(Integer maxBodySize) {
                this.maxBodySize = maxBodySize;
                return this;
            }

            /**
             * <p>Indicates whether the client source IP address preservation feature is enabled.</p>
             * <ul>
             * <li><strong>true</strong>: The client source IP address preservation feature is enabled. After this feature is enabled, backend services can view the original IP address of the client.</li>
             * <li><strong>false</strong>: The client source IP address preservation feature is not enabled.</li>
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
             * <p>The read timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The traffic tag fields and values of the domain name, which are used to tag traffic processed by WAF.</p>
             */
            public Builder requestHeaders(java.util.List<RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>Specifies whether to retry when WAF fails to forward requests to the origin server. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): Retry.</p>
             * </li>
             * <li><p><strong>false</strong>: Do not retry.</p>
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
             * <p>Indicates whether Server Name Indication (SNI) is enabled for back-to-origin requests. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: SNI is enabled for back-to-origin requests.</p>
             * </li>
             * <li><p><strong>false</strong> (default): SNI is not enabled for back-to-origin requests.</p>
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
             * <p>The value of the custom SNI extension field.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * <p>Specifies whether WAF is allowed to overwrite the WL-Proxy-Client-IP header. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
             * </li>
             * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder WLProxyClientIp(Boolean WLProxyClientIp) {
                this.WLProxyClientIp = WLProxyClientIp;
                return this;
            }

            /**
             * <p>Specifies whether WAF is allowed to overwrite the Web-Server-Type header. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
             * </li>
             * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder webServerType(Boolean webServerType) {
                this.webServerType = webServerType;
                return this;
            }

            /**
             * <p>The write timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            /**
             * <p>Specifies whether WAF is allowed to overwrite X-Client-IP. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
             * </li>
             * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xClientIp(Boolean xClientIp) {
                this.xClientIp = xClientIp;
                return this;
            }

            /**
             * <p>Specifies whether WAF is allowed to overwrite the X-True-IP header. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): WAF is allowed to overwrite the header.</p>
             * </li>
             * <li><p><strong>false</strong>: WAF is not allowed to overwrite the header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xTrueIp(Boolean xTrueIp) {
                this.xTrueIp = xTrueIp;
                return this;
            }

            /**
             * <p>Indicates whether X-Forward-For-Proto is used to pass the protocol used by WAF. Valid values:</p>
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
             * <p>The common name (CN).</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyundoc.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the certificate expires. The value is a UNIX timestamp (UTC). Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665590400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The SSL certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The certificate name.</p>
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
             * <p>The effective period of the certificate. The value is in the format of a UNIX timestamp (UTC). Unit: milliseconds.</p>
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

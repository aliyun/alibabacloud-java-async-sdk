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
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
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

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String accessType; 
        private String domain; 
        private String instanceId; 
        private Listen listen; 
        private Redirect redirect; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.listen = request.listen;
            this.redirect = request.redirect;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The access type of the WAF instance. Valid values:</p>
         * <ul>
         * <li><p><strong>share</strong> (default): CNAME access.</p>
         * </li>
         * <li><p><strong>hybrid_cloud_cname</strong>: hybrid cloud CNAME access.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the value is <strong>share</strong>, or if the value is <strong>hybrid_cloud_cname</strong> and public cloud disaster recovery is enabled, call the <a href="https://help.aliyun.com/document_detail/2985193.html">DescribeVerifyContent</a> and <a href="https://help.aliyun.com/document_detail/2985192.html">VerifyDomainOwner</a> operations to verify domain name ownership first. If the domain name is connected to a region in the Chinese mainland, ICP filing must also be completed.</p>
         * </blockquote>
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
         * <p>The domain name to query.</p>
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
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
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
         * <p>The listening configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listen(Listen listen) {
            String listenShrink = shrink(listen, "Listen", "json");
            this.putQueryParameter("Listen", listenShrink);
            this.listen = listen;
            return this;
        }

        /**
         * <p>The forwarding configuration.</p>
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

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateDomainRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("HstsIncludeSubDomain")
        private Boolean hstsIncludeSubDomain;

        @com.aliyun.core.annotation.NameInMap("HstsMaxAge")
        private Long hstsMaxAge;

        @com.aliyun.core.annotation.NameInMap("HstsPreload")
        private Boolean hstsPreload;

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
            private Boolean hstsIncludeSubDomain; 
            private Long hstsMaxAge; 
            private Boolean hstsPreload; 
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
             * <p>The ID of the certificate to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The type of cipher suite to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * <p>The custom cipher suites to add.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Specifies whether to support TLS 1.3. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * <p>Specifies whether to enable an exclusive IP address. This parameter is used only when <strong>IPv6Enabled</strong> is set to <strong>false</strong> (which indicates that IPv6 is disabled) and <strong>ProtectionResource</strong> is set to <strong>share</strong> (which indicates that a shared cluster is used). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * <p>Specifies whether to enable forced HTTPS redirect. This parameter is used only when HttpsPorts is not empty (which indicates that the domain name uses HTTPS) and HttpPorts is empty (which indicates that the domain name does not use HTTP). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder focusHttps(Boolean focusHttps) {
                this.focusHttps = focusHttps;
                return this;
            }

            /**
             * <p>Specifies whether HSTS includes subdomains. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>Specifies whether to enable HSTS preloading. This feature is disabled by default. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hstsPreload(Boolean hstsPreload) {
                this.hstsPreload = hstsPreload;
                return this;
            }

            /**
             * <p>Specifies whether to enable HTTP/2. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * <p>The listening ports for HTTP.</p>
             */
            public Builder httpPorts(java.util.List<Integer> httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The listening ports for HTTPS.</p>
             */
            public Builder httpsPorts(java.util.List<Integer> httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Specifies whether to enable IPv6. Valid values:</p>
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
             * <p>Specifies whether to allow only SM2 client access. This parameter is used only when SM2Enabled is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2AccessOnly(Boolean sM2AccessOnly) {
                this.sM2AccessOnly = sM2AccessOnly;
                return this;
            }

            /**
             * <p>The ID of the SM2 certificate to add. This parameter is used only when SM2Enabled is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder sM2CertId(String sM2CertId) {
                this.sM2CertId = sM2CertId;
                return this;
            }

            /**
             * <p>Specifies whether to enable SM2 certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sM2Enabled(Boolean sM2Enabled) {
                this.sM2Enabled = sM2Enabled;
                return this;
            }

            /**
             * <p>The TLS version to add. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses the HTTPS protocol. Valid values:</p>
             * <ul>
             * <li><strong>tlsv1</strong>: Supports TLS 1.0 and later. Highest compatibility and lowest security.</li>
             * <li><strong>tlsv1.1</strong>: Supports TLS 1.1 and later. Good compatibility and good security.</li>
             * <li><strong>tlsv1.2</strong>: Supports TLS 1.2 and later. Good compatibility and highest security.</li>
             * <li><strong>tlsv1.3</strong>: Supports only TLS 1.3. Highest security and lowest compatibility.</li>
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
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
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
     * {@link CreateDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateDomainRequest</p>
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
             * <p>The protocol of the listening port. Valid values:</p>
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
     * {@link CreateDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateDomainRequest</p>
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
             * <p>The value set for the custom request header field.</p>
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
     * {@link CreateDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateDomainRequest</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendPorts")
        private java.util.List<BackendPorts> backendPorts;

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

        @com.aliyun.core.annotation.NameInMap("Http2Origin")
        private Boolean http2Origin;

        @com.aliyun.core.annotation.NameInMap("Http2OriginMaxConcurrency")
        @com.aliyun.core.annotation.Validation(maximum = 512, minimum = 1)
        private Integer http2OriginMaxConcurrency;

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

        @com.aliyun.core.annotation.NameInMap("RoutingRules")
        private String routingRules;

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
            this.backendPorts = builder.backendPorts;
            this.backends = builder.backends;
            this.backupBackends = builder.backupBackends;
            this.cnameEnabled = builder.cnameEnabled;
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
            this.routingRules = builder.routingRules;
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
            private java.util.List<BackendPorts> backendPorts; 
            private java.util.List<String> backends; 
            private java.util.List<String> backupBackends; 
            private Boolean cnameEnabled; 
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
            private String routingRules; 
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
                this.backendPorts = model.backendPorts;
                this.backends = model.backends;
                this.backupBackends = model.backupBackends;
                this.cnameEnabled = model.cnameEnabled;
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
                this.routingRules = model.routingRules;
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
             * <p>The custom port configuration.</p>
             */
            public Builder backendPorts(java.util.List<BackendPorts> backendPorts) {
                this.backendPorts = backendPorts;
                return this;
            }

            /**
             * <p>The IP addresses or domain names of the origin servers that correspond to the domain name.</p>
             */
            public Builder backends(java.util.List<String> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * <p>The IP addresses or domain names of the secondary origin servers that correspond to the domain name.</p>
             */
            public Builder backupBackends(java.util.List<String> backupBackends) {
                this.backupBackends = backupBackends;
                return this;
            }

            /**
             * <p>Specifies whether to enable public cloud disaster recovery. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Public cloud disaster recovery is enabled.</p>
             * </li>
             * <li><p><strong>false</strong> (default): Public cloud disaster recovery is not enabled.</p>
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
             * <p>Specifies whether to enable forced HTTP back-to-origin. This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder focusHttpBackend(Boolean focusHttpBackend) {
                this.focusHttpBackend = focusHttpBackend;
                return this;
            }

            /**
             * <p>Specifies whether to enable HTTP/2 back-to-origin. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder http2Origin(Boolean http2Origin) {
                this.http2Origin = http2Origin;
                return this;
            }

            /**
             * <p>The maximum number of concurrent HTTP/2 back-to-origin connections. Valid values: 1 to 512. Default value: 128.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder http2OriginMaxConcurrency(Integer http2OriginMaxConcurrency) {
                this.http2OriginMaxConcurrency = http2OriginMaxConcurrency;
                return this;
            }

            /**
             * <p>Specifies whether to enable persistent connections. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepalive(Boolean keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * <p>The number of requests that reuse a persistent connection. Valid values: 60 to 1000. Default value: 1000.</p>
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
             * <li><p><strong>iphash</strong>: IP hash algorithm.</p>
             * </li>
             * <li><p><strong>roundRobin</strong>: round-robin algorithm.</p>
             * </li>
             * <li><p><strong>leastTime</strong>: Least Time algorithm. This value is available only when <strong>ProtectionResource</strong> is set to <strong>gslb</strong> (indicating that the protection resource type uses intelligent load balancing of the shared cluster).</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>roundRobin</p>
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
             * <p>Indicates whether the client source IP preservation feature is enabled.</p>
             * <ul>
             * <li><strong>true</strong>: The client source IP preservation feature is enabled. After this feature is enabled, backend services can view the originating IP address of the client.</li>
             * <li><strong>false</strong>: The client source IP preservation feature is not enabled.</li>
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
             * <p>The traffic mark header fields and values for the domain name, used to mark traffic processed by WAF.</p>
             */
            public Builder requestHeaders(java.util.List<RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>Specifies whether to retry when WAF fails to forward requests to the origin server. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>The hybrid cloud forwarding rules. The value is a string converted from a JSON array. Each element in the JSON array is a struct that contains the following fields:</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;rs&quot;:
             *         [
             *             &quot;1.1.XX.XX&quot;
             *         ],
             *         &quot;backupRs&quot;:
             *         [
             *             &quot;2.2.XX.XX&quot;
             *         ],
             *         &quot;locationId&quot;: 535,
             *         &quot;location&quot;: &quot;test1111&quot;
             *     }
             * ]</p>
             */
            public Builder routingRules(String routingRules) {
                this.routingRules = routingRules;
                return this;
            }

            /**
             * <p>Specifies whether to enable back-to-origin Server Name Indication (SNI). This parameter is used only when <strong>HttpsPorts</strong> is not empty, which indicates that the domain name uses HTTPS. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sniEnabled(Boolean sniEnabled) {
                this.sniEnabled = sniEnabled;
                return this;
            }

            /**
             * <p>The value of the custom SNI extension field. If you do not set this parameter, the value of the <strong>Host</strong> field in the request header is used as the value of the SNI extension field by default.
             * In most cases, you do not need to customize SNI unless your business has special configuration requirements and you want WAF to use an SNI that is different from the actual request Host in back-to-origin requests (that is, the custom SNI set here).</p>
             * <blockquote>
             * <p>This parameter is required only when <strong>SniEnabled</strong> is set to <strong>true</strong> (indicating that back-to-origin SNI is enabled).</p>
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
             * <p>Specifies whether to allow WAF to overwrite WL-Proxy-Client-IP. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder WLProxyClientIp(Boolean WLProxyClientIp) {
                this.WLProxyClientIp = WLProxyClientIp;
                return this;
            }

            /**
             * <p>Specifies whether to allow WAF to overwrite Web-Server-Type. Valid values:</p>
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
             * <p>Specifies whether to allow WAF to overwrite X-Client-IP. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xClientIp(Boolean xClientIp) {
                this.xClientIp = xClientIp;
                return this;
            }

            /**
             * <p>Specifies whether to allow WAF to overwrite X-True-IP. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xTrueIp(Boolean xTrueIp) {
                this.xTrueIp = xTrueIp;
                return this;
            }

            /**
             * <p>Specifies whether to use X-Forward-For-Proto to pass the protocol used by WAF. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link CreateDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateDomainRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Tagkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCloudResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudResourceRequest</p>
 */
public class ModifyCloudResourceRequest extends Request {
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
    private Redirect redirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyCloudResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModifyCloudResourceRequest, Builder> {
        private String instanceId; 
        private Listen listen; 
        private Redirect redirect; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.listen = request.listen;
            this.redirect = request.redirect;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-***</p>
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
         */
        public Builder redirect(Redirect redirect) {
            String redirectShrink = shrink(redirect, "Redirect", "json");
            this.putQueryParameter("Redirect", redirectShrink);
            this.redirect = redirect;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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

        @Override
        public ModifyCloudResourceRequest build() {
            return new ModifyCloudResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCloudResourceRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudResourceRequest</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedType")
        private String appliedType;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        private Certificates(Builder builder) {
            this.appliedType = builder.appliedType;
            this.certificateId = builder.certificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return appliedType
         */
        public String getAppliedType() {
            return this.appliedType;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        public static final class Builder {
            private String appliedType; 
            private String certificateId; 

            /**
             * <p>The type of the HTTPS certificate. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: default certificate.</li>
             * <li><strong>extension</strong>: additional certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder appliedType(String appliedType) {
                this.appliedType = appliedType;
                return this;
            }

            /**
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCloudResourceRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudResourceRequest</p>
     */
    public static class Listen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List < Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private Integer cipherSuite;

        @com.aliyun.core.annotation.NameInMap("CustomCiphers")
        private java.util.List < String > customCiphers;

        @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @com.aliyun.core.annotation.NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceProduct")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceProduct;

        @com.aliyun.core.annotation.NameInMap("TLSVersion")
        private String TLSVersion;

        private Listen(Builder builder) {
            this.certificates = builder.certificates;
            this.cipherSuite = builder.cipherSuite;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.http2Enabled = builder.http2Enabled;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceProduct = builder.resourceProduct;
            this.TLSVersion = builder.TLSVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listen create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List < Certificates> getCertificates() {
            return this.certificates;
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
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceProduct
         */
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        /**
         * @return TLSVersion
         */
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        public static final class Builder {
            private java.util.List < Certificates> certificates; 
            private Integer cipherSuite; 
            private java.util.List < String > customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean http2Enabled; 
            private Integer port; 
            private String protocol; 
            private String resourceInstanceId; 
            private String resourceProduct; 
            private String TLSVersion; 

            /**
             * <p>An array of certificates.</p>
             */
            public Builder certificates(java.util.List < Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The type of the cipher suites that you want to add. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: all cipher suites.</li>
             * <li><strong>2</strong>: strong cipher suites. You can set the parameter to this value only if you set <strong>TLSVersion</strong> to <strong>tlsv1.2</strong>.</li>
             * <li><strong>99</strong>: custom cipher suites.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * <p>An array of custom cipher suites.</p>
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Specifies whether to support TLS 1.3. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Specifies whether to enable HTTP/2. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
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
             * <p>The port of the resource that you want to add to WAF.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>http</strong></li>
             * <li><strong>https</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-***</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The cloud service. Valid values:</p>
             * <ul>
             * <li><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</li>
             * <li><strong>clb7</strong>: Layer 7 CLB.</li>
             * <li><strong>ecs</strong>: Elastic Compute Service (ECS).</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>clb7</p>
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * <p>The Transport Layer Security (TLS) version. This parameter is available only if you specify <strong>HttpsPorts</strong>. Valid values:</p>
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

            public Listen build() {
                return new Listen(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCloudResourceRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudResourceRequest</p>
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
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom header field.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
     * {@link ModifyCloudResourceRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudResourceRequest</p>
     */
    public static class Redirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 60)
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 10)
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
        private Integer readTimeout;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private java.util.List < RequestHeaders> requestHeaders;

        @com.aliyun.core.annotation.NameInMap("WriteTimeout")
        @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
        private Integer writeTimeout;

        @com.aliyun.core.annotation.NameInMap("XffHeaderMode")
        private Integer xffHeaderMode;

        @com.aliyun.core.annotation.NameInMap("XffHeaders")
        private java.util.List < String > xffHeaders;

        @com.aliyun.core.annotation.NameInMap("XffProto")
        private Boolean xffProto;

        private Redirect(Builder builder) {
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
            this.writeTimeout = builder.writeTimeout;
            this.xffHeaderMode = builder.xffHeaderMode;
            this.xffHeaders = builder.xffHeaders;
            this.xffProto = builder.xffProto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
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
         * @return writeTimeout
         */
        public Integer getWriteTimeout() {
            return this.writeTimeout;
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

        /**
         * @return xffProto
         */
        public Boolean getXffProto() {
            return this.xffProto;
        }

        public static final class Builder {
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private Integer readTimeout; 
            private java.util.List < RequestHeaders> requestHeaders; 
            private Integer writeTimeout; 
            private Integer xffHeaderMode; 
            private java.util.List < String > xffHeaders; 
            private Boolean xffProto; 

            /**
             * <p>Specifies whether to enable the persistent connection feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false:</strong></li>
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
             * <p>The number of requests that reuse persistent connections. Valid values: 60 to 1000.</p>
             * <blockquote>
             * <p> This parameter specifies the number of requests that can reuse persistent connections after you enable the persistent connection feature.</p>
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
             * <p>The timeout period for idle persistent connections. Valid values: 10 to 3600. Default value: 3600. Unit: seconds.</p>
             * <blockquote>
             * <p> If no new requests are initiated over the idle persistent connection within the specified timeout period, the connection is closed.</p>
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
             * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
             */
            public Builder requestHeaders(java.util.List < RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>The timeout period for write connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            /**
             * <p>The method that WAF uses to obtain the originating IP address of a client. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No Layer 7 proxies are deployed in front of WAF.</li>
             * <li><strong>1</strong>: WAF reads the first value of the X-Forwarded-For (XFF) header field as the originating IP address of the client.</li>
             * <li><strong>2</strong>: WAF reads the value of a custom header field as the originating IP address of the client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * <p>The custom header field that is used to obtain the originating IP address of a client. Specify the value in the [&quot;header1&quot;,&quot;header2&quot;,...] format.</p>
             * <blockquote>
             * <p> This parameter is required only if you set <strong>XffHeaderMode</strong> to 2.</p>
             * </blockquote>
             */
            public Builder xffHeaders(java.util.List < String > xffHeaders) {
                this.xffHeaders = xffHeaders;
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

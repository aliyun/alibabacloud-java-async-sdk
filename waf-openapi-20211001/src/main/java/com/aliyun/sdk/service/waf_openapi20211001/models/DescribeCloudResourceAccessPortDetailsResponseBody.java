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
 * {@link DescribeCloudResourceAccessPortDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudResourceAccessPortDetailsResponseBody</p>
 */
public class DescribeCloudResourceAccessPortDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPortDetails")
    private java.util.List<AccessPortDetails> accessPortDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudResourceAccessPortDetailsResponseBody(Builder builder) {
        this.accessPortDetails = builder.accessPortDetails;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceAccessPortDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPortDetails
     */
    public java.util.List<AccessPortDetails> getAccessPortDetails() {
        return this.accessPortDetails;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AccessPortDetails> accessPortDetails; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details of the ports of cloud services that are added to WAF.</p>
         */
        public Builder accessPortDetails(java.util.List<AccessPortDetails> accessPortDetails) {
            this.accessPortDetails = accessPortDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudResourceAccessPortDetailsResponseBody build() {
            return new DescribeCloudResourceAccessPortDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudResourceAccessPortDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudResourceAccessPortDetailsResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedType")
        private String appliedType;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        private Certificates(Builder builder) {
            this.appliedType = builder.appliedType;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
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

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        public static final class Builder {
            private String appliedType; 
            private String certificateId; 
            private String certificateName; 

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

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-name1</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudResourceAccessPortDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudResourceAccessPortDetailsResponseBody</p>
     */
    public static class LogHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LogHeaders(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHeaders create() {
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

            public LogHeaders build() {
                return new LogHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudResourceAccessPortDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudResourceAccessPortDetailsResponseBody</p>
     */
    public static class AccessPortDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("CipherSuite")
        private Integer cipherSuite;

        @com.aliyun.core.annotation.NameInMap("CustomCiphers")
        private java.util.List<String> customCiphers;

        @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @com.aliyun.core.annotation.NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("LogHeaders")
        private java.util.List<LogHeaders> logHeaders;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        private Integer readTimeout;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TLSVersion")
        private String TLSVersion;

        @com.aliyun.core.annotation.NameInMap("WriteTimeout")
        private Integer writeTimeout;

        @com.aliyun.core.annotation.NameInMap("XffHeaderMode")
        private Integer xffHeaderMode;

        @com.aliyun.core.annotation.NameInMap("XffHeaders")
        private java.util.List<String> xffHeaders;

        @com.aliyun.core.annotation.NameInMap("XffProto")
        private Boolean xffProto;

        private AccessPortDetails(Builder builder) {
            this.certificates = builder.certificates;
            this.cipherSuite = builder.cipherSuite;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.http2Enabled = builder.http2Enabled;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.logHeaders = builder.logHeaders;
            this.ownerUserId = builder.ownerUserId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.readTimeout = builder.readTimeout;
            this.status = builder.status;
            this.TLSVersion = builder.TLSVersion;
            this.writeTimeout = builder.writeTimeout;
            this.xffHeaderMode = builder.xffHeaderMode;
            this.xffHeaders = builder.xffHeaders;
            this.xffProto = builder.xffProto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPortDetails create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List<Certificates> getCertificates() {
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
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
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
         * @return logHeaders
         */
        public java.util.List<LogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
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
         * @return readTimeout
         */
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return TLSVersion
         */
        public String getTLSVersion() {
            return this.TLSVersion;
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
        public java.util.List<String> getXffHeaders() {
            return this.xffHeaders;
        }

        /**
         * @return xffProto
         */
        public Boolean getXffProto() {
            return this.xffProto;
        }

        public static final class Builder {
            private java.util.List<Certificates> certificates; 
            private Integer cipherSuite; 
            private java.util.List<String> customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean http2Enabled; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private java.util.List<LogHeaders> logHeaders; 
            private String ownerUserId; 
            private Integer port; 
            private String protocol; 
            private Integer readTimeout; 
            private Integer status; 
            private String TLSVersion; 
            private Integer writeTimeout; 
            private Integer xffHeaderMode; 
            private java.util.List<String> xffHeaders; 
            private Boolean xffProto; 

            /**
             * <p>The certificates that are associated with the ports of cloud services.</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The type of the cipher suites. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: all cipher suites.</li>
             * <li><strong>2</strong>: strong cipher suites.</li>
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
             * <p>The custom cipher suites that you want to add. This parameter is available only if you set <strong>CipherSuite</strong> to <strong>99</strong>.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Indicates whether to support TLS 1.3. Valid values:</p>
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
             * <p>Indicates whether to enable HTTP/2. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * <p>Indicates whether to enable the persistent connection feature. Valid values:</p>
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
             * <p>The number of reused persistent connections. Valid values: 60 to 1000.</p>
             * <blockquote>
             * <p> This parameter specifies the number of requests that reuse persistent connections after you enable the persistent connection feature.</p>
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
             * <p>The timeout period for idle persistent connections. Valid values: 10 to 3600. Default value: 15. Unit: seconds.</p>
             * <blockquote>
             * <p> If no new requests are initiated over the idle persistent connection within the specified timeout period, the connection is closed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder keepaliveTimeout(Integer keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * <p>The custom header field that you want to use to label requests that are processed by WAF.</p>
             * <blockquote>
             * <p> This parameter is returned only when the traffic marking feature is enabled for the domain name.</p>
             * </blockquote>
             */
            public Builder logHeaders(java.util.List<LogHeaders> logHeaders) {
                this.logHeaders = logHeaders;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The port of the cloud service that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
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
             * 
             * <strong>example:</strong>
             * <p>https</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The timeout period for read connections. Unit: seconds. Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: indicates that the port is available.</li>
             * <li><strong>2</strong>: indicates that the port is being created.</li>
             * <li><strong>3</strong>: indicates that the port is being modified.</li>
             * <li><strong>4</strong>: indicates that the port is being released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * <p>tlsv1</p>
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
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
            public Builder xffHeaders(java.util.List<String> xffHeaders) {
                this.xffHeaders = xffHeaders;
                return this;
            }

            /**
             * <p>Indicates whether to use the X-Forward-For-Proto header to identify the protocol used by WAF to forward requests to the origin server. Valid values:</p>
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

            public AccessPortDetails build() {
                return new AccessPortDetails(this);
            } 

        } 

    }
}

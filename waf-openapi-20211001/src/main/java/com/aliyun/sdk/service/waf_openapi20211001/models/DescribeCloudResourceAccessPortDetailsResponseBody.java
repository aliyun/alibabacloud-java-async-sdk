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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCloudResourceAccessPortDetailsResponseBody model) {
            this.accessPortDetails = model.accessPortDetails;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The port details of cloud service instances connected to WAF.</p>
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

            private Builder() {
            } 

            private Builder(Certificates model) {
                this.appliedType = model.appliedType;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
            } 

            /**
             * <p>The certificate type for the HTTPS protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: default certificate.</p>
             * </li>
             * <li><p><strong>extension</strong>: extension certificate.</p>
             * </li>
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
             * <p>The ID of the added certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The certificate name.</p>
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

            private Builder() {
            } 

            private Builder(LogHeaders model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The specified custom request header field.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value set for the specified custom request header field.</p>
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
    public static class SubStatusDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedType")
        private String appliedType;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ProductCertId")
        private String productCertId;

        @com.aliyun.core.annotation.NameInMap("ProductCertName")
        private String productCertName;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        private SubStatusDetails(Builder builder) {
            this.appliedType = builder.appliedType;
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.expireTime = builder.expireTime;
            this.productCertId = builder.productCertId;
            this.productCertName = builder.productCertName;
            this.reasonCode = builder.reasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubStatusDetails create() {
            return builder().build();
        }

        /**
         * @return appliedType
         */
        public String getAppliedType() {
            return this.appliedType;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return productCertId
         */
        public String getProductCertId() {
            return this.productCertId;
        }

        /**
         * @return productCertName
         */
        public String getProductCertName() {
            return this.productCertName;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        public static final class Builder {
            private String appliedType; 
            private String certId; 
            private String certName; 
            private String commonName; 
            private String domain; 
            private Long expireTime; 
            private String productCertId; 
            private String productCertName; 
            private String reasonCode; 

            private Builder() {
            } 

            private Builder(SubStatusDetails model) {
                this.appliedType = model.appliedType;
                this.certId = model.certId;
                this.certName = model.certName;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.expireTime = model.expireTime;
                this.productCertId = model.productCertId;
                this.productCertName = model.productCertName;
                this.reasonCode = model.reasonCode;
            } 

            /**
             * <p>The certificate type for the HTTPS protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: default certificate.</p>
             * </li>
             * <li><p><strong>extension</strong>: extension certificate.</p>
             * </li>
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
             * <p>The certificate ID in SSL Certificates Service.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The certificate name in SSL Certificates Service.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The common name (CN).</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyun.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The domain name bound to the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test.aliyun.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The expiration time of the certificate, in UNIX timestamp format. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1746328456000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The certificate ID stored in the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder productCertId(String productCertId) {
                this.productCertId = productCertId;
                return this;
            }

            /**
             * <p>The certificate name stored in the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder productCertName(String productCertName) {
                this.productCertName = productCertName;
                return this;
            }

            /**
             * <p>The specific reason for the protection exception status. Valid values:</p>
             * <ul>
             * <li><p><strong>UserUploadCert</strong>: The certificate was manually uploaded.</p>
             * </li>
             * <li><p><strong>CertNotExistInCertCenter</strong>: The certificate does not exist in SSL Certificates Service.</p>
             * </li>
             * <li><p><strong>CertExpired</strong>: The cloud certificate has expired.</p>
             * </li>
             * <li><p><strong>EmptyCertCN</strong>: The CN of the certificate is empty.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CertNotExistInCertCenter</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            public SubStatusDetails build() {
                return new SubStatusDetails(this);
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

        @com.aliyun.core.annotation.NameInMap("CloudResourceId")
        private String cloudResourceId;

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

        @com.aliyun.core.annotation.NameInMap("MaxBodySize")
        private Integer maxBodySize;

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

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private String subStatus;

        @com.aliyun.core.annotation.NameInMap("SubStatusDetails")
        private java.util.List<SubStatusDetails> subStatusDetails;

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
            this.cloudResourceId = builder.cloudResourceId;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.http2Enabled = builder.http2Enabled;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.logHeaders = builder.logHeaders;
            this.maxBodySize = builder.maxBodySize;
            this.ownerUserId = builder.ownerUserId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.readTimeout = builder.readTimeout;
            this.status = builder.status;
            this.subStatus = builder.subStatus;
            this.subStatusDetails = builder.subStatusDetails;
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
         * @return cloudResourceId
         */
        public String getCloudResourceId() {
            return this.cloudResourceId;
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
         * @return maxBodySize
         */
        public Integer getMaxBodySize() {
            return this.maxBodySize;
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
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return subStatusDetails
         */
        public java.util.List<SubStatusDetails> getSubStatusDetails() {
            return this.subStatusDetails;
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
            private String cloudResourceId; 
            private java.util.List<String> customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean http2Enabled; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private java.util.List<LogHeaders> logHeaders; 
            private Integer maxBodySize; 
            private String ownerUserId; 
            private Integer port; 
            private String protocol; 
            private Integer readTimeout; 
            private Integer status; 
            private String subStatus; 
            private java.util.List<SubStatusDetails> subStatusDetails; 
            private String TLSVersion; 
            private Integer writeTimeout; 
            private Integer xffHeaderMode; 
            private java.util.List<String> xffHeaders; 
            private Boolean xffProto; 

            private Builder() {
            } 

            private Builder(AccessPortDetails model) {
                this.certificates = model.certificates;
                this.cipherSuite = model.cipherSuite;
                this.cloudResourceId = model.cloudResourceId;
                this.customCiphers = model.customCiphers;
                this.enableTLSv3 = model.enableTLSv3;
                this.http2Enabled = model.http2Enabled;
                this.keepalive = model.keepalive;
                this.keepaliveRequests = model.keepaliveRequests;
                this.keepaliveTimeout = model.keepaliveTimeout;
                this.logHeaders = model.logHeaders;
                this.maxBodySize = model.maxBodySize;
                this.ownerUserId = model.ownerUserId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.readTimeout = model.readTimeout;
                this.status = model.status;
                this.subStatus = model.subStatus;
                this.subStatusDetails = model.subStatusDetails;
                this.TLSVersion = model.TLSVersion;
                this.writeTimeout = model.writeTimeout;
                this.xffHeaderMode = model.xffHeaderMode;
                this.xffHeaders = model.xffHeaders;
                this.xffProto = model.xffProto;
            } 

            /**
             * <p>The list of certificates for the cloud service port connected to WAF.</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The cipher suite type. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: all cipher suites are added.</p>
             * </li>
             * <li><p><strong>2</strong>: strong cipher suites are added. This value is available only when TLSVersion is set to tlsv1.2.</p>
             * </li>
             * <li><p><strong>99</strong>: custom cipher suites are added. This value is available only when TLSVersion is not set to tlsv1.3.</p>
             * </li>
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
             * <p>The ID of the connected resource, automatically generated by WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1**************7ey-80-ecs</p>
             */
            public Builder cloudResourceId(String cloudResourceId) {
                this.cloudResourceId = cloudResourceId;
                return this;
            }

            /**
             * <p>The specific custom cipher suites to add. This parameter is used only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
             */
            public Builder customCiphers(java.util.List<String> customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
             * </li>
             * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is used only when HttpsPorts is not empty (the domain name uses the HTTPS protocol). When TLSVersion is set to tlsv1.3, this value must be true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: HTTP/2 is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: HTTP/2 is disabled.</p>
             * </li>
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
             * <p>Indicates whether keep-alive connections are enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): Keep-alive connections are enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: Keep-alive connections are disabled.</p>
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
             * <p>The number of requests that can reuse a keep-alive connection. Valid values: 60 to 1000.</p>
             * <blockquote>
             * <p>Specifies how many requests can reuse a keep-alive connection after keep-alive is enabled.</p>
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
             * <p>The idle timeout period for keep-alive connections. Valid values: 10 to 3600. Default value: 15. Unit: seconds.</p>
             * <blockquote>
             * <p>Specifies how long an idle keep-alive connection remains open before it is released.</p>
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
             * <p>The traffic tag fields and values of the domain name, used to mark traffic processed by WAF.</p>
             * <blockquote>
             * <p>This parameter is returned only when the traffic tag feature is enabled for the domain name.</p>
             * </blockquote>
             */
            public Builder logHeaders(java.util.List<LogHeaders> logHeaders) {
                this.logHeaders = logHeaders;
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
             * <p>The UID of the cloud service resource ownership.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The port of the cloud service that is connected to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>http</strong>: HTTP protocol.</li>
             * <li><strong>https</strong>: HTTPS protocol.</li>
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
             * <p>The read timeout period, in seconds.
             * Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The domain name status. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The port is in a normal state.</p>
             * </li>
             * <li><p><strong>2</strong>: The port is being created.</p>
             * </li>
             * <li><p><strong>3</strong>: The port is being modified.</p>
             * </li>
             * <li><p><strong>4</strong>: The port is being released.</p>
             * </li>
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
             * <p>The protection exception status. Valid values:</p>
             * <ul>
             * <li><p><strong>InvalidCert</strong>: invalid certificate.</p>
             * </li>
             * <li><p><strong>ClientCertOpend</strong>: mutual authentication is enabled.</p>
             * </li>
             * <li><p><strong>NetworkConfigLost</strong>: cloud service network configuration exception.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InvalidCert</p>
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The specific reasons for the protection exception status. This parameter has a value only when SubStatus is set to InvalidCert.</p>
             */
            public Builder subStatusDetails(java.util.List<SubStatusDetails> subStatusDetails) {
                this.subStatusDetails = subStatusDetails;
                return this;
            }

            /**
             * <p>The TLS version. Valid values:</p>
             * <ul>
             * <li><p><strong>tlsv1</strong>: Supports TLS 1.0 and later. Highest compatibility, lower security.</p>
             * </li>
             * <li><p><strong>tlsv1.1</strong>: Supports TLS 1.1 and later. Good compatibility, good security.</p>
             * </li>
             * <li><p><strong>tlsv1.2</strong>: Supports TLS 1.2 and later. Good compatibility, highest security.</p>
             * </li>
             * <li><p><strong>tlsv1.3</strong>: Supports only TLS 1.3. Highest security, lower compatibility.</p>
             * </li>
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
             * <p>The write timeout period, in seconds.
             * Valid values: 1 to 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            /**
             * <p>The method that WAF uses to obtain the originating IP address of the client. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The client traffic does not pass through any Layer 7 proxy before reaching WAF.</p>
             * </li>
             * <li><p><strong>1</strong>: WAF reads the first value in the X-Forwarded-For (XFF) header as the client IP address.</p>
             * </li>
             * <li><p><strong>2</strong>: WAF reads the value of a custom header field that you specify as the client IP address.</p>
             * </li>
             * <li><p><strong>3</strong>: WAF reads the Client IP from the Proxy Protocol header as the client IP address.</p>
             * </li>
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
             * <p>The list of custom header fields used to obtain the client IP address, in the format <strong>[&quot;header1&quot;,&quot;header2&quot;,……]</strong>.</p>
             * <blockquote>
             * <p>This parameter is required only when <strong>XffHeaderMode</strong> is set to 2 (WAF reads the value of a custom header field that you specify as the client IP address).</p>
             * </blockquote>
             */
            public Builder xffHeaders(java.util.List<String> xffHeaders) {
                this.xffHeaders = xffHeaders;
                return this;
            }

            /**
             * <p>Specifies whether the X-Forward-For-Proto header passes the WAF protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): The WAF protocol is passed.</p>
             * </li>
             * <li><p><strong>false</strong>: The WAF protocol is not passed.</p>
             * </li>
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

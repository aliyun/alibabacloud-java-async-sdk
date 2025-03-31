// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainResponseBody</p>
 */
public class GetDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDomainResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDomainResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to trace the API call link.</p>
         * 
         * <strong>example:</strong>
         * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDomainResponseBody build() {
            return new GetDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDomainResponseBody} extends {@link TeaModel}
     *
     * <p>GetDomainResponseBody</p>
     */
    public static class StatisticsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceStatistics")
        private java.util.List<ResourceStatistic> resourceStatistics;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private String totalCount;

        private StatisticsInfo(Builder builder) {
            this.resourceStatistics = builder.resourceStatistics;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsInfo create() {
            return builder().build();
        }

        /**
         * @return resourceStatistics
         */
        public java.util.List<ResourceStatistic> getResourceStatistics() {
            return this.resourceStatistics;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ResourceStatistic> resourceStatistics; 
            private String totalCount; 

            private Builder() {
            } 

            private Builder(StatisticsInfo model) {
                this.resourceStatistics = model.resourceStatistics;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The resource statistics.</p>
             */
            public Builder resourceStatistics(java.util.List<ResourceStatistic> resourceStatistics) {
                this.resourceStatistics = resourceStatistics;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public StatisticsInfo build() {
                return new StatisticsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDomainResponseBody} extends {@link TeaModel}
     *
     * <p>GetDomainResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("caCertIdentifier")
        private String caCertIdentifier;

        @com.aliyun.core.annotation.NameInMap("certIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("certName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("clientCACert")
        private String clientCACert;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("forceHttps")
        private Boolean forceHttps;

        @com.aliyun.core.annotation.NameInMap("http2Option")
        private String http2Option;

        @com.aliyun.core.annotation.NameInMap("issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("mTLSEnabled")
        private Boolean mTLSEnabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("notAfterTimstamp")
        private Long notAfterTimstamp;

        @com.aliyun.core.annotation.NameInMap("notBeforeTimestamp")
        private Long notBeforeTimestamp;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("statisticsInfo")
        private StatisticsInfo statisticsInfo;

        @com.aliyun.core.annotation.NameInMap("tlsCipherSuitesConfig")
        private TlsCipherSuitesConfig tlsCipherSuitesConfig;

        @com.aliyun.core.annotation.NameInMap("tlsMax")
        private String tlsMax;

        @com.aliyun.core.annotation.NameInMap("tlsMin")
        private String tlsMin;

        @com.aliyun.core.annotation.NameInMap("updatetimestamp")
        private Long updatetimestamp;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.caCertIdentifier = builder.caCertIdentifier;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.clientCACert = builder.clientCACert;
            this.createFrom = builder.createFrom;
            this.createTimestamp = builder.createTimestamp;
            this._default = builder._default;
            this.domainId = builder.domainId;
            this.forceHttps = builder.forceHttps;
            this.http2Option = builder.http2Option;
            this.issuer = builder.issuer;
            this.mTLSEnabled = builder.mTLSEnabled;
            this.name = builder.name;
            this.notAfterTimstamp = builder.notAfterTimstamp;
            this.notBeforeTimestamp = builder.notBeforeTimestamp;
            this.protocol = builder.protocol;
            this.resourceGroupId = builder.resourceGroupId;
            this.sans = builder.sans;
            this.statisticsInfo = builder.statisticsInfo;
            this.tlsCipherSuitesConfig = builder.tlsCipherSuitesConfig;
            this.tlsMax = builder.tlsMax;
            this.tlsMin = builder.tlsMin;
            this.updatetimestamp = builder.updatetimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return caCertIdentifier
         */
        public String getCaCertIdentifier() {
            return this.caCertIdentifier;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return clientCACert
         */
        public String getClientCACert() {
            return this.clientCACert;
        }

        /**
         * @return createFrom
         */
        public String getCreateFrom() {
            return this.createFrom;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return forceHttps
         */
        public Boolean getForceHttps() {
            return this.forceHttps;
        }

        /**
         * @return http2Option
         */
        public String getHttp2Option() {
            return this.http2Option;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return mTLSEnabled
         */
        public Boolean getMTLSEnabled() {
            return this.mTLSEnabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notAfterTimstamp
         */
        public Long getNotAfterTimstamp() {
            return this.notAfterTimstamp;
        }

        /**
         * @return notBeforeTimestamp
         */
        public Long getNotBeforeTimestamp() {
            return this.notBeforeTimestamp;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return statisticsInfo
         */
        public StatisticsInfo getStatisticsInfo() {
            return this.statisticsInfo;
        }

        /**
         * @return tlsCipherSuitesConfig
         */
        public TlsCipherSuitesConfig getTlsCipherSuitesConfig() {
            return this.tlsCipherSuitesConfig;
        }

        /**
         * @return tlsMax
         */
        public String getTlsMax() {
            return this.tlsMax;
        }

        /**
         * @return tlsMin
         */
        public String getTlsMin() {
            return this.tlsMin;
        }

        /**
         * @return updatetimestamp
         */
        public Long getUpdatetimestamp() {
            return this.updatetimestamp;
        }

        public static final class Builder {
            private String algorithm; 
            private String caCertIdentifier; 
            private String certIdentifier; 
            private String certName; 
            private String clientCACert; 
            private String createFrom; 
            private Long createTimestamp; 
            private Boolean _default; 
            private String domainId; 
            private Boolean forceHttps; 
            private String http2Option; 
            private String issuer; 
            private Boolean mTLSEnabled; 
            private String name; 
            private Long notAfterTimstamp; 
            private Long notBeforeTimestamp; 
            private String protocol; 
            private String resourceGroupId; 
            private String sans; 
            private StatisticsInfo statisticsInfo; 
            private TlsCipherSuitesConfig tlsCipherSuitesConfig; 
            private String tlsMax; 
            private String tlsMin; 
            private Long updatetimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.algorithm = model.algorithm;
                this.caCertIdentifier = model.caCertIdentifier;
                this.certIdentifier = model.certIdentifier;
                this.certName = model.certName;
                this.clientCACert = model.clientCACert;
                this.createFrom = model.createFrom;
                this.createTimestamp = model.createTimestamp;
                this._default = model._default;
                this.domainId = model.domainId;
                this.forceHttps = model.forceHttps;
                this.http2Option = model.http2Option;
                this.issuer = model.issuer;
                this.mTLSEnabled = model.mTLSEnabled;
                this.name = model.name;
                this.notAfterTimstamp = model.notAfterTimstamp;
                this.notBeforeTimestamp = model.notBeforeTimestamp;
                this.protocol = model.protocol;
                this.resourceGroupId = model.resourceGroupId;
                this.sans = model.sans;
                this.statisticsInfo = model.statisticsInfo;
                this.tlsCipherSuitesConfig = model.tlsCipherSuitesConfig;
                this.tlsMax = model.tlsMax;
                this.tlsMin = model.tlsMin;
                this.updatetimestamp = model.updatetimestamp;
            } 

            /**
             * <p>The encryption algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The CA certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>876****-cn-hangzhou</p>
             */
            public Builder caCertIdentifier(String caCertIdentifier) {
                this.caCertIdentifier = caCertIdentifier;
                return this;
            }

            /**
             * <p>The certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>645****-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cert</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The client CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----
             * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx/mpTQwDQYJKoZIhvcNAQEL
             * BxSbrGeJ8i0576Gn7Qezyho9abZOUhGaPeoB
             * AIHWWl428uUSG/xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
             * yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy+ZMJ8r4swA4swHwYDVR0jBBgwFoAU
             * qroVyYKk7ylhcSn+ZMJ8r4swA4swDwYDVR0TAQH/BAUwAwEB/zANBgkqhkiG9w0B
             * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx=
             * -----END CERTIFICATE-----</p>
             */
            public Builder clientCACert(String clientCACert) {
                this.clientCACert = clientCACert;
                return this;
            }

            /**
             * <p>The creation source.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Console</li>
             * <li>Ingress</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Console</p>
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
                return this;
            }

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is the default domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>The ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cq1m3utlhtgvgkv7sitg</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>Indicates whether forcible HTTPS redirection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceHttps(Boolean forceHttps) {
                this.forceHttps = forceHttps;
                return this;
            }

            /**
             * <p>The HTTP/2 configuration.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>GlobalConfig</li>
             * <li>Close</li>
             * <li>Open</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder http2Option(String http2Option) {
                this.http2Option = http2Option;
                return this;
            }

            /**
             * <p>The certificate issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Indicates whether mutual authentication is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mTLSEnabled(Boolean mTLSEnabled) {
                this.mTLSEnabled = mTLSEnabled;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The expiration time of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder notAfterTimstamp(Long notAfterTimstamp) {
                this.notAfterTimstamp = notAfterTimstamp;
                return this;
            }

            /**
             * <p>The time when the certificate started to take effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder notBeforeTimestamp(Long notBeforeTimestamp) {
                this.notBeforeTimestamp = notBeforeTimestamp;
                return this;
            }

            /**
             * <p>The supported protocol. Valid values:</p>
             * <ul>
             * <li>HTTP: Only HTTP is supported.</li>
             * <li>HTTPS: Only HTTPS is supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzvlxzgo5b4si</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>All domain names that are bound to the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The information about online resources.</p>
             */
            public Builder statisticsInfo(StatisticsInfo statisticsInfo) {
                this.statisticsInfo = statisticsInfo;
                return this;
            }

            /**
             * <p>The cipher suite configuration.</p>
             */
            public Builder tlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
                this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
                return this;
            }

            /**
             * <p>The maximum version of the TLS protocol. Up to TLS 1.3 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.3</p>
             */
            public Builder tlsMax(String tlsMax) {
                this.tlsMax = tlsMax;
                return this;
            }

            /**
             * <p>The minimum version of the TLS protocol. Down to TLS 1.0 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS 1.0</p>
             */
            public Builder tlsMin(String tlsMin) {
                this.tlsMin = tlsMin;
                return this;
            }

            /**
             * <p>The update timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updatetimestamp(Long updatetimestamp) {
                this.updatetimestamp = updatetimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

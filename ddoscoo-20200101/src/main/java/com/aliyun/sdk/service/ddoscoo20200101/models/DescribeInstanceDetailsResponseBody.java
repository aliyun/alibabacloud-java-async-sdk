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
 * {@link DescribeInstanceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDetailsResponseBody</p>
 */
public class DescribeInstanceDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceDetails")
    private java.util.List<InstanceDetails> instanceDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceDetailsResponseBody(Builder builder) {
        this.instanceDetails = builder.instanceDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDetails
     */
    public java.util.List<InstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceDetails> instanceDetails; 
        private String requestId; 

        /**
         * <p>The IP address and ISP line information about the Anti-DDoS Proxy instance.</p>
         */
        public Builder instanceDetails(java.util.List<InstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C814429-21A5-4673-827E-FDD19DC75681</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceDetailsResponseBody build() {
            return new DescribeInstanceDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceDetailsResponseBody</p>
     */
    public static class EipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertConfigured")
        private Boolean certConfigured;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Ssl13Enabled")
        private Boolean ssl13Enabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TlsVersion")
        private String tlsVersion;

        private EipInfos(Builder builder) {
            this.certConfigured = builder.certConfigured;
            this.eip = builder.eip;
            this.functionVersion = builder.functionVersion;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.ssl13Enabled = builder.ssl13Enabled;
            this.status = builder.status;
            this.tlsVersion = builder.tlsVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfos create() {
            return builder().build();
        }

        /**
         * @return certConfigured
         */
        public Boolean getCertConfigured() {
            return this.certConfigured;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return ssl13Enabled
         */
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tlsVersion
         */
        public String getTlsVersion() {
            return this.tlsVersion;
        }

        public static final class Builder {
            private Boolean certConfigured; 
            private String eip; 
            private String functionVersion; 
            private String ipMode; 
            private String ipVersion; 
            private Boolean ssl13Enabled; 
            private String status; 
            private String tlsVersion; 

            /**
             * <p>Indicates whether a custom certificate is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder certConfigured(Boolean certConfigured) {
                this.certConfigured = certConfigured;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.117.XX.XX</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>fnat</strong>: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</li>
             * <li><strong>v6tov4</strong>: All requests are forwarded to origin servers that use IPv4 addresses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fnat</p>
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * <p>The IP version of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>Ipv4</strong>: IPv4</li>
             * <li><strong>Ipv6</strong>: IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ipv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>Indicates whether the TLS 1.3 version is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ssl13Enabled(Boolean ssl13Enabled) {
                this.ssl13Enabled = ssl13Enabled;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: indicates that the instance is normal.</li>
             * <li><strong>expired</strong>: indicates that the instance expired.</li>
             * <li><strong>defense</strong>: indicates that traffic scrubbing is performed on the asset that is protected by the instance.</li>
             * <li><strong>blackhole</strong>: indicates that blackhole filtering is triggered for the asset that is protected by the instance.</li>
             * <li><strong>punished</strong>: indicates that the instance is in penalty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The Transport Layer Security (TLS) version that is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>tls1.2</p>
             */
            public Builder tlsVersion(String tlsVersion) {
                this.tlsVersion = tlsVersion;
                return this;
            }

            public EipInfos build() {
                return new EipInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceDetailsResponseBody</p>
     */
    public static class InstanceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipInfos")
        private java.util.List<EipInfos> eipInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        private InstanceDetails(Builder builder) {
            this.eipInfos = builder.eipInfos;
            this.instanceId = builder.instanceId;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetails create() {
            return builder().build();
        }

        /**
         * @return eipInfos
         */
        public java.util.List<EipInfos> getEipInfos() {
            return this.eipInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List<EipInfos> eipInfos; 
            private String instanceId; 
            private String line; 

            /**
             * <p>The IP address information about the Anti-DDoS Proxy instance.</p>
             */
            public Builder eipInfos(java.util.List<EipInfos> eipInfos) {
                this.eipInfos = eipInfos;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zvp2eibz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The protection line of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>coop-line-001</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
}

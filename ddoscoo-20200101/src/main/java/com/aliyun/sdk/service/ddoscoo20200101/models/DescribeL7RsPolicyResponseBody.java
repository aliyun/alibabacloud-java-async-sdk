// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeL7RsPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL7RsPolicyResponseBody</p>
 */
public class DescribeL7RsPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List < Attributes> attributes;

    @com.aliyun.core.annotation.NameInMap("ProxyMode")
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RsAttrRwTimeoutMax")
    private Long rsAttrRwTimeoutMax;

    @com.aliyun.core.annotation.NameInMap("UpstreamRetry")
    private Integer upstreamRetry;

    private DescribeL7RsPolicyResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.proxyMode = builder.proxyMode;
        this.requestId = builder.requestId;
        this.rsAttrRwTimeoutMax = builder.rsAttrRwTimeoutMax;
        this.upstreamRetry = builder.upstreamRetry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7RsPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.List < Attributes> getAttributes() {
        return this.attributes;
    }

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rsAttrRwTimeoutMax
     */
    public Long getRsAttrRwTimeoutMax() {
        return this.rsAttrRwTimeoutMax;
    }

    /**
     * @return upstreamRetry
     */
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

    public static final class Builder {
        private java.util.List < Attributes> attributes; 
        private String proxyMode; 
        private String requestId; 
        private Long rsAttrRwTimeoutMax; 
        private Integer upstreamRetry; 

        /**
         * <p>The details about the parameters for back-to-origin processing.</p>
         */
        public Builder attributes(java.util.List < Attributes> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The scheduling algorithm for back-to-origin traffic. Valid values:</p>
         * <ul>
         * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</li>
         * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</li>
         * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rr</p>
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9E7F6B2C-03F2-462F-9076-B782CF0DD502</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RsAttrRwTimeoutMax.
         */
        public Builder rsAttrRwTimeoutMax(Long rsAttrRwTimeoutMax) {
            this.rsAttrRwTimeoutMax = rsAttrRwTimeoutMax;
            return this;
        }

        /**
         * <p>The back-to-origin retry switch. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: on</li>
         * <li><strong>0</strong>: off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder upstreamRetry(Integer upstreamRetry) {
            this.upstreamRetry = upstreamRetry;
            return this;
        }

        public DescribeL7RsPolicyResponseBody build() {
            return new DescribeL7RsPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeL7RsPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeL7RsPolicyResponseBody</p>
     */
    public static class Attribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Integer connectTimeout;

        @com.aliyun.core.annotation.NameInMap("FailTimeout")
        private Integer failTimeout;

        @com.aliyun.core.annotation.NameInMap("MaxFails")
        private Integer maxFails;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReadTimeout")
        private Integer readTimeout;

        @com.aliyun.core.annotation.NameInMap("SendTimeout")
        private Integer sendTimeout;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Attribute(Builder builder) {
            this.connectTimeout = builder.connectTimeout;
            this.failTimeout = builder.failTimeout;
            this.maxFails = builder.maxFails;
            this.mode = builder.mode;
            this.readTimeout = builder.readTimeout;
            this.sendTimeout = builder.sendTimeout;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return connectTimeout
         */
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return failTimeout
         */
        public Integer getFailTimeout() {
            return this.failTimeout;
        }

        /**
         * @return maxFails
         */
        public Integer getMaxFails() {
            return this.maxFails;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return readTimeout
         */
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return sendTimeout
         */
        public Integer getSendTimeout() {
            return this.sendTimeout;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer connectTimeout; 
            private Integer failTimeout; 
            private Integer maxFails; 
            private String mode; 
            private Integer readTimeout; 
            private Integer sendTimeout; 
            private Integer weight; 

            /**
             * <p>The timeout period for a new connection. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * <p>The expiration time of a connection, in seconds. If the number of failures at the origin server exceeds the <strong>MaxFails</strong> value, the address of the origin server is set to down and the expiration time is <strong>FailTimeout</strong>. The final value is the maximum value of <strong>ConnectTimeout</strong> and <strong>FailTimeout</strong>. Valid values: <strong>1</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder failTimeout(Integer failTimeout) {
                this.failTimeout = failTimeout;
                return this;
            }

            /**
             * <p>The maximum number of failures. This parameter is related to health check. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxFails(Integer maxFails) {
                this.maxFails = maxFails;
                return this;
            }

            /**
             * <p>The primary/secondary flag. Valid values:</p>
             * <ul>
             * <li><strong>active</strong>: primary</li>
             * <li><strong>backup</strong>: secondary</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The timeout period for a read connection. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * <p>The timeout period for a write connection. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder sendTimeout(Integer sendTimeout) {
                this.sendTimeout = sendTimeout;
                return this;
            }

            /**
             * <p>The weight of the origin server. This parameter takes effect only when <strong>ProxyMode</strong> is set to <strong>rr</strong>.</p>
             * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. A server with a higher weight receives more requests.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeL7RsPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeL7RsPolicyResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private Attribute attribute;

        @com.aliyun.core.annotation.NameInMap("RealServer")
        private String realServer;

        @com.aliyun.core.annotation.NameInMap("RsType")
        private Integer rsType;

        private Attributes(Builder builder) {
            this.attribute = builder.attribute;
            this.realServer = builder.realServer;
            this.rsType = builder.rsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public Attribute getAttribute() {
            return this.attribute;
        }

        /**
         * @return realServer
         */
        public String getRealServer() {
            return this.realServer;
        }

        /**
         * @return rsType
         */
        public Integer getRsType() {
            return this.rsType;
        }

        public static final class Builder {
            private Attribute attribute; 
            private String realServer; 
            private Integer rsType; 

            /**
             * <p>The parameter for back-to-origin processing.</p>
             */
            public Builder attribute(Attribute attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The address of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.<em><strong>.</strong></em>.1</p>
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
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

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
}

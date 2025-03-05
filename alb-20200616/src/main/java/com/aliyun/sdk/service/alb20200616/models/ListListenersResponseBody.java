// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List<Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List<Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The listeners.</p>
         */
        public Builder listeners(java.util.List<Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position where the query stopped. If this parameter is not returned, all data is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class ServerGroupTuples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private String serverGroupId; 

            /**
             * <p>The ID of the server group to which requests are forwarded.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-cige6j****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class ForwardGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServerGroupTuples")
        private java.util.List<ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List<ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List<ServerGroupTuples> serverGroupTuples; 

            /**
             * <p>The server groups to which requests are forwarded.</p>
             */
            public Builder serverGroupTuples(java.util.List<ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class DefaultActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DefaultActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultActions create() {
            return builder().build();
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private String type; 

            /**
             * <p>The configuration of the forwarding rule action. This parameter takes effect only when the action is <strong>ForwardGroup</strong>.</p>
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * <p>The action. <strong>ForwardGroup</strong>: forwards requests to multiple server groups.</p>
             * 
             * <strong>example:</strong>
             * <p>ForwardGroup</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultActions build() {
                return new DefaultActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class AccessLogTracingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TracingEnabled")
        private Boolean tracingEnabled;

        @com.aliyun.core.annotation.NameInMap("TracingSample")
        private Integer tracingSample;

        @com.aliyun.core.annotation.NameInMap("TracingType")
        private String tracingType;

        private AccessLogTracingConfig(Builder builder) {
            this.tracingEnabled = builder.tracingEnabled;
            this.tracingSample = builder.tracingSample;
            this.tracingType = builder.tracingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogTracingConfig create() {
            return builder().build();
        }

        /**
         * @return tracingEnabled
         */
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        /**
         * @return tracingSample
         */
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        /**
         * @return tracingType
         */
        public String getTracingType() {
            return this.tracingType;
        }

        public static final class Builder {
            private Boolean tracingEnabled; 
            private Integer tracingSample; 
            private String tracingType; 

            /**
             * <p>Indicates whether xtrace is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter can be set to <strong>true</strong> only when the access log feature of ALB is enabled by setting <strong>AccessLogEnabled</strong> to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * <p>The sampling rate of xtrace. Valid values: <strong>1 to 10000</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * <p>The type of xtrace. The value is set to <strong>Zipkin</strong>.</p>
             * <blockquote>
             * <p> This parameter takes effect when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Zipkin</p>
             */
            public Builder tracingType(String tracingType) {
                this.tracingType = tracingType;
                return this;
            }

            public AccessLogTracingConfig build() {
                return new AccessLogTracingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class LogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        private Boolean accessLogRecordCustomizedHeadersEnabled;

        @com.aliyun.core.annotation.NameInMap("AccessLogTracingConfig")
        private AccessLogTracingConfig accessLogTracingConfig;

        private LogConfig(Builder builder) {
            this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogTracingConfig = builder.accessLogTracingConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return accessLogRecordCustomizedHeadersEnabled
         */
        public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
            return this.accessLogRecordCustomizedHeadersEnabled;
        }

        /**
         * @return accessLogTracingConfig
         */
        public AccessLogTracingConfig getAccessLogTracingConfig() {
            return this.accessLogTracingConfig;
        }

        public static final class Builder {
            private Boolean accessLogRecordCustomizedHeadersEnabled; 
            private AccessLogTracingConfig accessLogTracingConfig; 

            /**
             * <p>Indicates whether custom headers are carried in the access log. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
                this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
                return this;
            }

            /**
             * <p>The configurations of xtrace.</p>
             */
            public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
                this.accessLogTracingConfig = accessLogTracingConfig;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class QuicConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuicListenerId")
        private String quicListenerId;

        @com.aliyun.core.annotation.NameInMap("QuicUpgradeEnabled")
        private Boolean quicUpgradeEnabled;

        private QuicConfig(Builder builder) {
            this.quicListenerId = builder.quicListenerId;
            this.quicUpgradeEnabled = builder.quicUpgradeEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuicConfig create() {
            return builder().build();
        }

        /**
         * @return quicListenerId
         */
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        /**
         * @return quicUpgradeEnabled
         */
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

        public static final class Builder {
            private String quicListenerId; 
            private Boolean quicUpgradeEnabled; 

            /**
             * <p>The ID of the QUIC listener associated with the ALB instance. This parameter is required if the <strong>QuicUpgradeEnabled</strong> parameter is set to <strong>true</strong>. Only HTTPS listeners support this parameter.</p>
             * <blockquote>
             * <p> The existing listener and QUIC listener must be to the same ALB instance, and the QUIC listener has not been associated with an ALB instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn908w4nbw****</p>
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * <p>Indicates whether QUIC upgrade is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder quicUpgradeEnabled(Boolean quicUpgradeEnabled) {
                this.quicUpgradeEnabled = quicUpgradeEnabled;
                return this;
            }

            public QuicConfig build() {
                return new QuicConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class XForwardedForConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertClientVerifyAlias")
        private String xForwardedForClientCertClientVerifyAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertClientVerifyEnabled")
        private Boolean xForwardedForClientCertClientVerifyEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertFingerprintAlias")
        private String xForwardedForClientCertFingerprintAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertFingerprintEnabled")
        private Boolean xForwardedForClientCertFingerprintEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertIssuerDNAlias")
        private String xForwardedForClientCertIssuerDNAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertIssuerDNEnabled")
        private Boolean xForwardedForClientCertIssuerDNEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertSubjectDNAlias")
        private String xForwardedForClientCertSubjectDNAlias;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientCertSubjectDNEnabled")
        private Boolean xForwardedForClientCertSubjectDNEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSourceIpsEnabled")
        private Boolean xForwardedForClientSourceIpsEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSourceIpsTrusted")
        private String xForwardedForClientSourceIpsTrusted;

        @com.aliyun.core.annotation.NameInMap("XForwardedForClientSrcPortEnabled")
        private Boolean xForwardedForClientSrcPortEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForEnabled")
        private Boolean xForwardedForEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForHostEnabled")
        private Boolean xForwardedForHostEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProcessingMode")
        private String xForwardedForProcessingMode;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForSLBIdEnabled")
        private Boolean xForwardedForSLBIdEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForSLBPortEnabled")
        private Boolean xForwardedForSLBPortEnabled;

        private XForwardedForConfig(Builder builder) {
            this.xForwardedForClientCertClientVerifyAlias = builder.xForwardedForClientCertClientVerifyAlias;
            this.xForwardedForClientCertClientVerifyEnabled = builder.xForwardedForClientCertClientVerifyEnabled;
            this.xForwardedForClientCertFingerprintAlias = builder.xForwardedForClientCertFingerprintAlias;
            this.xForwardedForClientCertFingerprintEnabled = builder.xForwardedForClientCertFingerprintEnabled;
            this.xForwardedForClientCertIssuerDNAlias = builder.xForwardedForClientCertIssuerDNAlias;
            this.xForwardedForClientCertIssuerDNEnabled = builder.xForwardedForClientCertIssuerDNEnabled;
            this.xForwardedForClientCertSubjectDNAlias = builder.xForwardedForClientCertSubjectDNAlias;
            this.xForwardedForClientCertSubjectDNEnabled = builder.xForwardedForClientCertSubjectDNEnabled;
            this.xForwardedForClientSourceIpsEnabled = builder.xForwardedForClientSourceIpsEnabled;
            this.xForwardedForClientSourceIpsTrusted = builder.xForwardedForClientSourceIpsTrusted;
            this.xForwardedForClientSrcPortEnabled = builder.xForwardedForClientSrcPortEnabled;
            this.xForwardedForEnabled = builder.xForwardedForEnabled;
            this.xForwardedForHostEnabled = builder.xForwardedForHostEnabled;
            this.xForwardedForProcessingMode = builder.xForwardedForProcessingMode;
            this.xForwardedForProtoEnabled = builder.xForwardedForProtoEnabled;
            this.xForwardedForSLBIdEnabled = builder.xForwardedForSLBIdEnabled;
            this.xForwardedForSLBPortEnabled = builder.xForwardedForSLBPortEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return xForwardedForClientCertClientVerifyAlias
         */
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.xForwardedForClientCertClientVerifyAlias;
        }

        /**
         * @return xForwardedForClientCertClientVerifyEnabled
         */
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.xForwardedForClientCertClientVerifyEnabled;
        }

        /**
         * @return xForwardedForClientCertFingerprintAlias
         */
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.xForwardedForClientCertFingerprintAlias;
        }

        /**
         * @return xForwardedForClientCertFingerprintEnabled
         */
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.xForwardedForClientCertFingerprintEnabled;
        }

        /**
         * @return xForwardedForClientCertIssuerDNAlias
         */
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.xForwardedForClientCertIssuerDNAlias;
        }

        /**
         * @return xForwardedForClientCertIssuerDNEnabled
         */
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.xForwardedForClientCertIssuerDNEnabled;
        }

        /**
         * @return xForwardedForClientCertSubjectDNAlias
         */
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.xForwardedForClientCertSubjectDNAlias;
        }

        /**
         * @return xForwardedForClientCertSubjectDNEnabled
         */
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.xForwardedForClientCertSubjectDNEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsEnabled
         */
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.xForwardedForClientSourceIpsEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsTrusted
         */
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.xForwardedForClientSourceIpsTrusted;
        }

        /**
         * @return xForwardedForClientSrcPortEnabled
         */
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.xForwardedForClientSrcPortEnabled;
        }

        /**
         * @return xForwardedForEnabled
         */
        public Boolean getXForwardedForEnabled() {
            return this.xForwardedForEnabled;
        }

        /**
         * @return xForwardedForHostEnabled
         */
        public Boolean getXForwardedForHostEnabled() {
            return this.xForwardedForHostEnabled;
        }

        /**
         * @return xForwardedForProcessingMode
         */
        public String getXForwardedForProcessingMode() {
            return this.xForwardedForProcessingMode;
        }

        /**
         * @return xForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.xForwardedForProtoEnabled;
        }

        /**
         * @return xForwardedForSLBIdEnabled
         */
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.xForwardedForSLBIdEnabled;
        }

        /**
         * @return xForwardedForSLBPortEnabled
         */
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.xForwardedForSLBPortEnabled;
        }

        public static final class Builder {
            private String xForwardedForClientCertClientVerifyAlias; 
            private Boolean xForwardedForClientCertClientVerifyEnabled; 
            private String xForwardedForClientCertFingerprintAlias; 
            private Boolean xForwardedForClientCertFingerprintEnabled; 
            private String xForwardedForClientCertIssuerDNAlias; 
            private Boolean xForwardedForClientCertIssuerDNEnabled; 
            private String xForwardedForClientCertSubjectDNAlias; 
            private Boolean xForwardedForClientCertSubjectDNEnabled; 
            private Boolean xForwardedForClientSourceIpsEnabled; 
            private String xForwardedForClientSourceIpsTrusted; 
            private Boolean xForwardedForClientSrcPortEnabled; 
            private Boolean xForwardedForEnabled; 
            private Boolean xForwardedForHostEnabled; 
            private String xForwardedForProcessingMode; 
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xForwardedForSLBIdEnabled; 
            private Boolean xForwardedForSLBPortEnabled; 

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_client-verify-alias_123456</p>
             */
            public Builder xForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
                this.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-clientverify</code> header is used to obtain the verification result of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
                this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_finger-print-alias_123456</p>
             */
            public Builder xForwardedForClientCertFingerprintAlias(String xForwardedForClientCertFingerprintAlias) {
                this.xForwardedForClientCertFingerprintAlias = xForwardedForClientCertFingerprintAlias;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-fingerprint</code> header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
                this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_issue-dn-alias_123456</p>
             */
            public Builder xForwardedForClientCertIssuerDNAlias(String xForwardedForClientCertIssuerDNAlias) {
                this.xForwardedForClientCertIssuerDNAlias = xForwardedForClientCertIssuerDNAlias;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-issuerdn</code> header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
                this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * <p>The name of the custom header. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
             * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_subject-dn-alias_123456</p>
             */
            public Builder xForwardedForClientCertSubjectDNAlias(String xForwardedForClientCertSubjectDNAlias) {
                this.xForwardedForClientCertSubjectDNAlias = xForwardedForClientCertSubjectDNAlias;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Clientcert-subjectdn</code> header is used to retrieve information about the owner of the client certificate. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
                this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the X-Forwarded-For header is used to preserver client IP addresses for the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForClientSourceIpsEnabled(Boolean xForwardedForClientSourceIpsEnabled) {
                this.xForwardedForClientSourceIpsEnabled = xForwardedForClientSourceIpsEnabled;
                return this;
            }

            /**
             * <p>The trusted proxy IP address.</p>
             * <p>ALB instances traverse the IP addresses in the <code>X-Forwarded-For</code> header from the rightmost IP address to the leftmost IP address. The first IP address that is not on the trusted IP address list is considered the client IP address. Requests from the client IP address are throttled.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.0/24</p>
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Client-Port</code> header is used to retrieve the client port. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
                this.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is set to <strong>true</strong>, the default value of the <strong>XForwardedForProcessingMode</strong> parameter is <strong>append</strong>. You can change it to <strong>remove</strong>.</li>
             * <li>If this parameter is set to <strong>false</strong>, the <code>X-Forwarded-For</code> header in the request is not modified in any way before the request is sent to backend servers.</li>
             * <li>Both HTTP and HTTPS listeners support this parameter.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForEnabled(Boolean xForwardedForEnabled) {
                this.xForwardedForEnabled = xForwardedForEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>X-Forwarded-Host</code> header to retrieve client domain names. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> HTTP, HTTPS, and QUIC listeners all support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder xForwardedForHostEnabled(Boolean xForwardedForHostEnabled) {
                this.xForwardedForHostEnabled = xForwardedForHostEnabled;
                return this;
            }

            /**
             * <p>Specifies how the <code>X-Forwarded-For</code> header is processed. This parameter takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
             * <ul>
             * <li><strong>append</strong> (default)</li>
             * <li><strong>remove</strong></li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If this parameter is set to <strong>append</strong>, ALB appends the IP address of the last hop to the existing <code>X-Forwarded-For</code> header in the request before the request is sent to backend servers.</li>
             * <li>If this parameter is set to <strong>remove</strong>, ALB removes the <code>X-Forwarded-For</code> header in the request before the request is sent to backend servers, no matter whether the request carries the <code>X-Forwarded-For</code> header.</li>
             * <li>Both HTTP and HTTPS listeners support this parameter.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>append</p>
             */
            public Builder xForwardedForProcessingMode(String xForwardedForProcessingMode) {
                this.xForwardedForProcessingMode = xForwardedForProcessingMode;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to retrieve the listener protocol. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
                this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the <code>X-Forwarded-Port</code> header is used to retrieve the listener port of the ALB instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder xForwardedForSLBPortEnabled(Boolean xForwardedForSLBPortEnabled) {
                this.xForwardedForSLBPortEnabled = xForwardedForSLBPortEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultActions")
        private java.util.List<DefaultActions> defaultActions;

        @com.aliyun.core.annotation.NameInMap("GzipEnabled")
        private Boolean gzipEnabled;

        @com.aliyun.core.annotation.NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("ListenerDescription")
        private String listenerDescription;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("ListenerStatus")
        private String listenerStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LogConfig")
        private LogConfig logConfig;

        @com.aliyun.core.annotation.NameInMap("QuicConfig")
        private QuicConfig quicConfig;

        @com.aliyun.core.annotation.NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
        private XForwardedForConfig xForwardedForConfig;

        private Listeners(Builder builder) {
            this.defaultActions = builder.defaultActions;
            this.gzipEnabled = builder.gzipEnabled;
            this.http2Enabled = builder.http2Enabled;
            this.idleTimeout = builder.idleTimeout;
            this.listenerDescription = builder.listenerDescription;
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.listenerStatus = builder.listenerStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.logConfig = builder.logConfig;
            this.quicConfig = builder.quicConfig;
            this.requestTimeout = builder.requestTimeout;
            this.securityPolicyId = builder.securityPolicyId;
            this.tags = builder.tags;
            this.xForwardedForConfig = builder.xForwardedForConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return defaultActions
         */
        public java.util.List<DefaultActions> getDefaultActions() {
            return this.defaultActions;
        }

        /**
         * @return gzipEnabled
         */
        public Boolean getGzipEnabled() {
            return this.gzipEnabled;
        }

        /**
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerDescription
         */
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return listenerStatus
         */
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return logConfig
         */
        public LogConfig getLogConfig() {
            return this.logConfig;
        }

        /**
         * @return quicConfig
         */
        public QuicConfig getQuicConfig() {
            return this.quicConfig;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return xForwardedForConfig
         */
        public XForwardedForConfig getXForwardedForConfig() {
            return this.xForwardedForConfig;
        }

        public static final class Builder {
            private java.util.List<DefaultActions> defaultActions; 
            private Boolean gzipEnabled; 
            private Boolean http2Enabled; 
            private Integer idleTimeout; 
            private String listenerDescription; 
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String listenerStatus; 
            private String loadBalancerId; 
            private LogConfig logConfig; 
            private QuicConfig quicConfig; 
            private Integer requestTimeout; 
            private String securityPolicyId; 
            private java.util.List<Tags> tags; 
            private XForwardedForConfig xForwardedForConfig; 

            /**
             * <p>The default actions in the forwarding rules.</p>
             */
            public Builder defaultActions(java.util.List<DefaultActions> defaultActions) {
                this.defaultActions = defaultActions;
                return this;
            }

            /**
             * <p>Indicates whether GZIP compression is enabled to compress specific types of files. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gzipEnabled(Boolean gzipEnabled) {
                this.gzipEnabled = gzipEnabled;
                return this;
            }

            /**
             * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1 to 60</strong>.</p>
             * <p>If no request is received within the specified timeout period, ALB closes the connection. ALB establishes the connection again when a new connection request is received.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>The name of the listener.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The frontend port that is used by the ALB instance. Valid values: <strong>1 to 65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol of the instance. Valid values:</p>
             * <ul>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong></li>
             * <li><strong>QUIC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The status of the listener. Valid values:</p>
             * <ul>
             * <li><strong>Provisioning</strong>: The listener is being created.</li>
             * <li><strong>Running</strong>: The listener is running.</li>
             * <li><strong>Configuring</strong>: The listener is being configured.</li>
             * <li><strong>Stopped</strong>: The listener is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
                return this;
            }

            /**
             * <p>The ALB instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa08ex*****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The logging configurations.</p>
             */
            public Builder logConfig(LogConfig logConfig) {
                this.logConfig = logConfig;
                return this;
            }

            /**
             * <p>The configurations of the QUIC listener associated with the ALB instance.</p>
             */
            public Builder quicConfig(QuicConfig quicConfig) {
                this.quicConfig = quicConfig;
                return this;
            }

            /**
             * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1 to 180</strong>.</p>
             * <p>If no responses are received from the backend server within the specified timeout period, ALB returns an <code>HTTP 504</code> error code to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * <p>The security policy.</p>
             * <blockquote>
             * <p> Only HTTPS listeners support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tls_cipher_policy_1_1</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The configuration of the <code>XForward</code> header.</p>
             */
            public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
                this.xForwardedForConfig = xForwardedForConfig;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}

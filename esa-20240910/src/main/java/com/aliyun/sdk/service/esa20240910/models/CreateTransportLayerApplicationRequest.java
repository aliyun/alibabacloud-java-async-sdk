// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateTransportLayerApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateTransportLayerApplicationRequest</p>
 */
public class CreateTransportLayerApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
    private String crossBorderOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAccessRule")
    private String ipAccessRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6")
    private String ipv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepAliveProtection")
    private String keepAliveProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StaticIp")
    private String staticIp;

    private CreateTransportLayerApplicationRequest(Builder builder) {
        super(builder);
        this.crossBorderOptimization = builder.crossBorderOptimization;
        this.ipAccessRule = builder.ipAccessRule;
        this.ipv6 = builder.ipv6;
        this.keepAliveProtection = builder.keepAliveProtection;
        this.recordName = builder.recordName;
        this.rules = builder.rules;
        this.siteId = builder.siteId;
        this.staticIp = builder.staticIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransportLayerApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossBorderOptimization
     */
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    /**
     * @return ipAccessRule
     */
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    /**
     * @return ipv6
     */
    public String getIpv6() {
        return this.ipv6;
    }

    /**
     * @return keepAliveProtection
     */
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return staticIp
     */
    public String getStaticIp() {
        return this.staticIp;
    }

    public static final class Builder extends Request.Builder<CreateTransportLayerApplicationRequest, Builder> {
        private String crossBorderOptimization; 
        private String ipAccessRule; 
        private String ipv6; 
        private String keepAliveProtection; 
        private String recordName; 
        private java.util.List<Rules> rules; 
        private Long siteId; 
        private String staticIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransportLayerApplicationRequest request) {
            super(request);
            this.crossBorderOptimization = request.crossBorderOptimization;
            this.ipAccessRule = request.ipAccessRule;
            this.ipv6 = request.ipv6;
            this.keepAliveProtection = request.keepAliveProtection;
            this.recordName = request.recordName;
            this.rules = request.rules;
            this.siteId = request.siteId;
            this.staticIp = request.staticIp;
        } 

        /**
         * <p>Specifies whether to enable network access optimization for the Chinese mainland. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder crossBorderOptimization(String crossBorderOptimization) {
            this.putQueryParameter("CrossBorderOptimization", crossBorderOptimization);
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }

        /**
         * <p>The IP access rule switch. When enabled, IP access rules in WAF take effect for the Layer 4 application. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ipAccessRule(String ipAccessRule) {
            this.putQueryParameter("IpAccessRule", ipAccessRule);
            this.ipAccessRule = ipAccessRule;
            return this;
        }

        /**
         * <p>Specifies whether to enable IPv6. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder ipv6(String ipv6) {
            this.putQueryParameter("Ipv6", ipv6);
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * <p>Specifies whether to enable keep-alive protection. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder keepAliveProtection(String keepAliveProtection) {
            this.putQueryParameter("KeepAliveProtection", keepAliveProtection);
            this.keepAliveProtection = keepAliveProtection;
            return this;
        }

        /**
         * <p>The domain name of the Layer 4 application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa.example.com</p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The list of forwarding rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID. The site must be activated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Specifies whether to enable static IP. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder staticIp(String staticIp) {
            this.putQueryParameter("StaticIp", staticIp);
            this.staticIp = staticIp;
            return this;
        }

        @Override
        public CreateTransportLayerApplicationRequest build() {
            return new CreateTransportLayerApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTransportLayerApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateTransportLayerApplicationRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIPPassThroughMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientIPPassThroughMode;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("EdgePort")
        @com.aliyun.core.annotation.Validation(required = true)
        private String edgePort;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourcePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceType;

        private Rules(Builder builder) {
            this.clientIPPassThroughMode = builder.clientIPPassThroughMode;
            this.comment = builder.comment;
            this.edgePort = builder.edgePort;
            this.protocol = builder.protocol;
            this.source = builder.source;
            this.sourcePort = builder.sourcePort;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return clientIPPassThroughMode
         */
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return edgePort
         */
        public String getEdgePort() {
            return this.edgePort;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePort
         */
        public String getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String clientIPPassThroughMode; 
            private String comment; 
            private String edgePort; 
            private String protocol; 
            private String source; 
            private String sourcePort; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.clientIPPassThroughMode = model.clientIPPassThroughMode;
                this.comment = model.comment;
                this.edgePort = model.edgePort;
                this.protocol = model.protocol;
                this.source = model.source;
                this.sourcePort = model.sourcePort;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The client IP pass-through protocol. Valid values:</p>
             * <ul>
             * <li><strong>off</strong>: disabled.</li>
             * <li><strong>PPv1</strong>: PROXY Protocol v1. Supports client IP pass-through for TCP.</li>
             * <li><strong>PPv2</strong>: PROXY Protocol v2. Supports client IP pass-through for TCP and UDP.</li>
             * <li><strong>SPP</strong>: Simple Proxy Protocol. Supports client IP pass-through for UDP.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SPP</p>
             */
            public Builder clientIPPassThroughMode(String clientIPPassThroughMode) {
                this.clientIPPassThroughMode = clientIPPassThroughMode;
                return this;
            }

            /**
             * <p>The comment for the rule (optional).</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The edge port. The following formats are supported:</p>
             * <ul>
             * <li>A single port, such as 80.</li>
             * <li>A port range, such as 81-85, which represents ports 81, 82, 83, 84, and 85.</li>
             * <li>A combination of ports and port ranges separated by commas, such as 80,81-85,90, which represents ports 80, 81, 82, 83, 84, 85, and 90.</li>
             * </ul>
             * <p>Edge ports within a single rule and across multiple rules must not overlap.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder edgePort(String edgePort) {
                this.edgePort = edgePort;
                return this;
            }

            /**
             * <p>The forwarding rule protocol. Valid values:</p>
             * <ul>
             * <li>TCP: TCP protocol.</li>
             * <li>UDP: UDP protocol.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The specific value of the origin, which must match the origin type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Origin Server Port. The following formats are supported:</p>
             * <ul>
             * <li>A single port. When Origin Server Port is a single port, any valid edge port combination is supported.</li>
             * <li>A port range. Origin Server Port can be set to a port range only when the edge port is also a port range, and the range size must match the edge port range. For example, if the edge port is 90-93, you cannot set Origin Server Port to 81-85 because Origin Server Port range size is 5 while the edge port range size is 4, which is inconsistent.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * <p>The origin type. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address.</li>
             * <li><strong>domain</strong>: domain name.</li>
             * <li><strong>OP</strong>: origin IPAM pool.</li>
             * <li><strong>LB</strong>: load balancing.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}

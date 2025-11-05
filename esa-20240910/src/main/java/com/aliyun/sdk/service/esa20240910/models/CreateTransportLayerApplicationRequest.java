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
            this.recordName = request.recordName;
            this.rules = request.rules;
            this.siteId = request.siteId;
            this.staticIp = request.staticIp;
        } 

        /**
         * <p>Whether to enable China mainland network access optimization, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>IP access rule switch. When enabled, the WAF&quot;s IP access rules apply to the transport layer application.</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>IPv6 switch.</p>
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
         * <p>Domain name of the transport layer application.</p>
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
         * <p>List of forwarding rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
         * StaticIp.
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
             * <p>Client IP pass-through protocol, supporting:</p>
             * <ul>
             * <li><strong>off</strong>: No pass-through.</li>
             * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
             * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
             * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
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
             * <p>Comment information for the rule (optional).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Edge port. Supports:</p>
             * <ul>
             * <li>A single port, such as 80.</li>
             * <li>Port range, such as 81-85, representing ports 81, 82, 83, 84, and 85.</li>
             * <li>Combination of ports and port ranges, separated by commas, such as 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, and 90.</li>
             * </ul>
             * <p>Edge ports within a single rule and between multiple rules must not overlap.</p>
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
             * <p>Forwarding rule protocol, with values:</p>
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
             * <p>Specific value of the origin, which needs to match the origin type.</p>
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
             * <p>Origin port. Supports:</p>
             * <ul>
             * <li>A single port, when the origin port is a single port, any valid combination of edge ports is supported.</li>
             * <li>Port range, only when the edge port is a port range, the origin port can be set to a port range, and the size of the range must match that of the edge port. For example, if the edge port is 90-93, the origin port cannot be set to 81-85 because the origin port range is 5 and the edge port range is 3, which do not match.</li>
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
             * <p>Origin type, supporting:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address.</li>
             * <li><strong>domain</strong>: Domain name.</li>
             * <li><strong>OP</strong>: Origin pool.</li>
             * <li><strong>LB</strong>: Load balancer.</li>
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

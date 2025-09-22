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
 * {@link UpdateTransportLayerApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransportLayerApplicationRequest</p>
 */
public class UpdateTransportLayerApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applicationId;

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
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StaticIp")
    private String staticIp;

    private UpdateTransportLayerApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.crossBorderOptimization = builder.crossBorderOptimization;
        this.ipAccessRule = builder.ipAccessRule;
        this.ipv6 = builder.ipv6;
        this.rules = builder.rules;
        this.siteId = builder.siteId;
        this.staticIp = builder.staticIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransportLayerApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public Long getApplicationId() {
        return this.applicationId;
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

    public static final class Builder extends Request.Builder<UpdateTransportLayerApplicationRequest, Builder> {
        private Long applicationId; 
        private String crossBorderOptimization; 
        private String ipAccessRule; 
        private String ipv6; 
        private java.util.List<Rules> rules; 
        private Long siteId; 
        private String staticIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransportLayerApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.crossBorderOptimization = request.crossBorderOptimization;
            this.ipAccessRule = request.ipAccessRule;
            this.ipv6 = request.ipv6;
            this.rules = request.rules;
            this.siteId = request.siteId;
            this.staticIp = request.staticIp;
        } 

        /**
         * <p>Transport layer application ID, which can be obtained by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>165503967****</p>
         */
        public Builder applicationId(Long applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
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
         * <p>IP access rule switch. When enabled, the IP access rules in WAF will take effect on the transport layer application.</p>
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
         * <p>on</p>
         */
        public Builder ipv6(String ipv6) {
            this.putQueryParameter("Ipv6", ipv6);
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * <p>Forwarding rule list. Details of each rule. Except for the comment, all other parameters are required.</p>
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
        public UpdateTransportLayerApplicationRequest build() {
            return new UpdateTransportLayerApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTransportLayerApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateTransportLayerApplicationRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIPPassThroughMode")
        private String clientIPPassThroughMode;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("EdgePort")
        private String edgePort;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourcePort")
        private String sourcePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
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
             * <p>Client IP pass-through protocol, supports:</p>
             * <ul>
             * <li><strong>off</strong>: No pass-through.</li>
             * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
             * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
             * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SPP</p>
             */
            public Builder clientIPPassThroughMode(String clientIPPassThroughMode) {
                this.clientIPPassThroughMode = clientIPPassThroughMode;
                return this;
            }

            /**
             * <p>Comment information for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Edge port. Supports:</p>
             * <ul>
             * <li>A single port, e.g., 80.</li>
             * <li>Port range, e.g., 81-85, representing ports 81, 82, 83, 84, 85.</li>
             * <li>Combination of ports and port ranges, separated by commas, e.g., 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, 90.</li>
             * <li>Edge ports within a single rule and between multiple rules must not overlap.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder edgePort(String edgePort) {
                this.edgePort = edgePort;
                return this;
            }

            /**
             * <p>Forwarding rule protocol, supports:</p>
             * <ul>
             * <li>TCP: TCP protocol.</li>
             * <li>UDP: UDP protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Specific value of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Source port. Supports:</p>
             * <ul>
             * <li>A single port, when the source port is a single port, any valid edge port combination is supported.</li>
             * <li>Port range, only when the edge port is a port range, the source port can be set as a port range, and the size of the range must match that of the edge port. For example, if the edge port is 90-93, the source port cannot be set to 81-85 because the source port range is 5 and the edge port range is 3, which do not match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder sourcePort(String sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * <p>Source type, supports:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address.</li>
             * <li><strong>domain</strong>: Domain name.</li>
             * <li><strong>OP</strong>: Origin pool.</li>
             * <li><strong>LB</strong>: Load balancer.</li>
             * </ul>
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

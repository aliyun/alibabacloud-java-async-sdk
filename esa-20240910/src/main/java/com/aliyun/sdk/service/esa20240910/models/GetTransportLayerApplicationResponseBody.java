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
 * {@link GetTransportLayerApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTransportLayerApplicationResponseBody</p>
 */
public class GetTransportLayerApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private Long applicationId;

    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
    private String crossBorderOptimization;

    @com.aliyun.core.annotation.NameInMap("IpAccessRule")
    private String ipAccessRule;

    @com.aliyun.core.annotation.NameInMap("Ipv6")
    private String ipv6;

    @com.aliyun.core.annotation.NameInMap("KeepAliveProtection")
    private String keepAliveProtection;

    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("RulesCount")
    private Integer rulesCount;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("StaticIp")
    private String staticIp;

    @com.aliyun.core.annotation.NameInMap("StaticIpV4List")
    private java.util.List<StaticIpV4List> staticIpV4List;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetTransportLayerApplicationResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.cname = builder.cname;
        this.crossBorderOptimization = builder.crossBorderOptimization;
        this.ipAccessRule = builder.ipAccessRule;
        this.ipv6 = builder.ipv6;
        this.keepAliveProtection = builder.keepAliveProtection;
        this.recordName = builder.recordName;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.rulesCount = builder.rulesCount;
        this.siteId = builder.siteId;
        this.staticIp = builder.staticIp;
        this.staticIpV4List = builder.staticIpV4List;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransportLayerApplicationResponseBody create() {
        return builder().build();
    }

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
     * @return cname
     */
    public String getCname() {
        return this.cname;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return rulesCount
     */
    public Integer getRulesCount() {
        return this.rulesCount;
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

    /**
     * @return staticIpV4List
     */
    public java.util.List<StaticIpV4List> getStaticIpV4List() {
        return this.staticIpV4List;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long applicationId; 
        private String cname; 
        private String crossBorderOptimization; 
        private String ipAccessRule; 
        private String ipv6; 
        private String keepAliveProtection; 
        private String recordName; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Integer rulesCount; 
        private Long siteId; 
        private String staticIp; 
        private java.util.List<StaticIpV4List> staticIpV4List; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetTransportLayerApplicationResponseBody model) {
            this.applicationId = model.applicationId;
            this.cname = model.cname;
            this.crossBorderOptimization = model.crossBorderOptimization;
            this.ipAccessRule = model.ipAccessRule;
            this.ipv6 = model.ipv6;
            this.keepAliveProtection = model.keepAliveProtection;
            this.recordName = model.recordName;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.rulesCount = model.rulesCount;
            this.siteId = model.siteId;
            this.staticIp = model.staticIp;
            this.staticIpV4List = model.staticIpV4List;
            this.status = model.status;
        } 

        /**
         * <p>The Layer 4 application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17099311410****</p>
         */
        public Builder applicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The CNAME domain name of the Layer 4 acceleration application. This field is non-empty only when the site is connected by using the CNAME method.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.ialicdn.com</p>
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * <p>Specifies whether to enable network access optimization for the Chinese mainland. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder crossBorderOptimization(String crossBorderOptimization) {
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }

        /**
         * <p>The IP access rule switch. When enabled, IP access rules in WAF take effect for the Layer 4 application. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ipAccessRule(String ipAccessRule) {
            this.ipAccessRule = ipAccessRule;
            return this;
        }

        /**
         * <p>The IPv6 switch. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ipv6(String ipv6) {
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * <p>Specifies whether to enable keep-alive protection. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder keepAliveProtection(String keepAliveProtection) {
            this.keepAliveProtection = keepAliveProtection;
            return this;
        }

        /**
         * <p>The domain name of the Layer 4 application.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        public Builder recordName(String recordName) {
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB635996-1FD6-5DFD-BA57-27A849599940</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of forwarding rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The number of forwarding rules in the Layer 4 acceleration application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rulesCount(Integer rulesCount) {
            this.rulesCount = rulesCount;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Specifies whether to enable static IP. This feature is disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder staticIp(String staticIp) {
            this.staticIp = staticIp;
            return this;
        }

        /**
         * <p>The list of static IPv4 addresses assigned to this Layer 4 application after the static IP feature is enabled.</p>
         */
        public Builder staticIpV4List(java.util.List<StaticIpV4List> staticIpV4List) {
            this.staticIpV4List = staticIpV4List;
            return this;
        }

        /**
         * <p>The Layer 4 application status. Valid values:</p>
         * <ul>
         * <li><strong>deploying</strong>: Being deployed. Modifications and deletions are not allowed in this state.</li>
         * <li><strong>active</strong>: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetTransportLayerApplicationResponseBody build() {
            return new GetTransportLayerApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTransportLayerApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransportLayerApplicationResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

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
            this.ruleId = builder.ruleId;
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
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
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
            private Long ruleId; 
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
                this.ruleId = model.ruleId;
                this.source = model.source;
                this.sourcePort = model.sourcePort;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The client IP pass-through protocol. Valid values:</p>
             * <ul>
             * <li><strong>off</strong>: disabled.</li>
             * <li><strong>PPv1</strong>: PROXY Protocol v1, which supports client IP pass-through for TCP.</li>
             * <li><strong>PPv2</strong>: PROXY Protocol v2, which supports client IP pass-through for TCP and UDP.</li>
             * <li><strong>SPP</strong>: Simple Proxy Protocol, which supports client IP pass-through for UDP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder clientIPPassThroughMode(String clientIPPassThroughMode) {
                this.clientIPPassThroughMode = clientIPPassThroughMode;
                return this;
            }

            /**
             * <p>The comment for the rule.</p>
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
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder edgePort(String edgePort) {
                this.edgePort = edgePort;
                return this;
            }

            /**
             * <p>The protocol of the forwarding rule. Valid values:</p>
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
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234323***</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The specific value of the origin server, which must match the origin server type.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The origin server port. The following formats are supported:</p>
             * <ul>
             * <li>A single port. When the origin server port is a single port, any valid edge port combination is supported.</li>
             * <li>A port range. The origin server port can be set to a port range only when the edge port is a port range, and the range size must be the same as the edge port range. For example, if the edge port is 90-93, you cannot set the origin server port to 81-85 because the origin server port range is 5 while the edge port range is 4, which are inconsistent.</li>
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
             * <p>The origin server type. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address.</li>
             * <li><strong>domain</strong>: domain name.</li>
             * <li><strong>OP</strong>: IPAM pool.</li>
             * <li><strong>LB</strong>: load balancing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
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
    /**
     * 
     * {@link GetTransportLayerApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransportLayerApplicationResponseBody</p>
     */
    public static class StaticIpV4List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StaticIpV4List(Builder builder) {
            this.address = builder.address;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticIpV4List create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String address; 
            private String status; 

            private Builder() {
            } 

            private Builder(StaticIpV4List model) {
                this.address = model.address;
                this.status = model.status;
            } 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.2</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The status of the IP address. Valid values:</p>
             * <ul>
             * <li>healthy: Healthy.</li>
             * <li>unhealthy: Unhealthy.</li>
             * <li>unknown: The IP address is being prepared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StaticIpV4List build() {
                return new StaticIpV4List(this);
            } 

        } 

    }
}

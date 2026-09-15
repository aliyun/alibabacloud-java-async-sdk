// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeExpressConnectTrafficQosRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosRuleResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List<RuleList> ruleList;

    private DescribeExpressConnectTrafficQosRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectTrafficQosRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List<RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleList> ruleList; 

        private Builder() {
        } 

        private Builder(DescribeExpressConnectTrafficQosRuleResponseBody model) {
            this.requestId = model.requestId;
            this.ruleList = model.ruleList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C7FA9D6-72E0-48A9-A9C3-2DA8569CD5EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of QoS rules.</p>
         */
        public Builder ruleList(java.util.List<RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBody build() {
            return new DescribeExpressConnectTrafficQosRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectTrafficQosRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosRuleResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidr")
        private String dstCidr;

        @com.aliyun.core.annotation.NameInMap("DstIPv6Cidr")
        private String dstIPv6Cidr;

        @com.aliyun.core.annotation.NameInMap("DstPortRange")
        private String dstPortRange;

        @com.aliyun.core.annotation.NameInMap("MatchDscp")
        private Integer matchDscp;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        @com.aliyun.core.annotation.NameInMap("RemarkingDscp")
        private Integer remarkingDscp;

        @com.aliyun.core.annotation.NameInMap("RuleDescription")
        private String ruleDescription;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SrcCidr")
        private String srcCidr;

        @com.aliyun.core.annotation.NameInMap("SrcIPv6Cidr")
        private String srcIPv6Cidr;

        @com.aliyun.core.annotation.NameInMap("SrcPortRange")
        private String srcPortRange;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RuleList(Builder builder) {
            this.dstCidr = builder.dstCidr;
            this.dstIPv6Cidr = builder.dstIPv6Cidr;
            this.dstPortRange = builder.dstPortRange;
            this.matchDscp = builder.matchDscp;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.qosId = builder.qosId;
            this.queueId = builder.queueId;
            this.remarkingDscp = builder.remarkingDscp;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.srcCidr = builder.srcCidr;
            this.srcIPv6Cidr = builder.srcIPv6Cidr;
            this.srcPortRange = builder.srcPortRange;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstIPv6Cidr
         */
        public String getDstIPv6Cidr() {
            return this.dstIPv6Cidr;
        }

        /**
         * @return dstPortRange
         */
        public String getDstPortRange() {
            return this.dstPortRange;
        }

        /**
         * @return matchDscp
         */
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return remarkingDscp
         */
        public Integer getRemarkingDscp() {
            return this.remarkingDscp;
        }

        /**
         * @return ruleDescription
         */
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return srcCidr
         */
        public String getSrcCidr() {
            return this.srcCidr;
        }

        /**
         * @return srcIPv6Cidr
         */
        public String getSrcIPv6Cidr() {
            return this.srcIPv6Cidr;
        }

        /**
         * @return srcPortRange
         */
        public String getSrcPortRange() {
            return this.srcPortRange;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dstCidr; 
            private String dstIPv6Cidr; 
            private String dstPortRange; 
            private Integer matchDscp; 
            private Integer priority; 
            private String protocol; 
            private String qosId; 
            private String queueId; 
            private Integer remarkingDscp; 
            private String ruleDescription; 
            private String ruleId; 
            private String ruleName; 
            private String srcCidr; 
            private String srcIPv6Cidr; 
            private String srcPortRange; 
            private String status; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.dstCidr = model.dstCidr;
                this.dstIPv6Cidr = model.dstIPv6Cidr;
                this.dstPortRange = model.dstPortRange;
                this.matchDscp = model.matchDscp;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.qosId = model.qosId;
                this.queueId = model.queueId;
                this.remarkingDscp = model.remarkingDscp;
                this.ruleDescription = model.ruleDescription;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.srcCidr = model.srcCidr;
                this.srcIPv6Cidr = model.srcIPv6Cidr;
                this.srcPortRange = model.srcPortRange;
                this.status = model.status;
            } 

            /**
             * <p>The destination IP address IPv4 CIDR block for traffic matching of the QoS rule.</p>
             * <blockquote>
             * <p>This parameter cannot be specified together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><code>1.1.**.**</code>/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination IP address IPv6 CIDR block for traffic matching of the QoS rule.</p>
             * <blockquote>
             * <p>This parameter cannot be specified together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:0db8:1234:****::/64</p>
             */
            public Builder dstIPv6Cidr(String dstIPv6Cidr) {
                this.dstIPv6Cidr = dstIPv6Cidr;
                return this;
            }

            /**
             * <p>The destination port range for traffic matching of the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates no match. Currently, only a single port number can be specified, and the start and end port numbers must be the same. The destination port range is fixed for different protocol types. Valid values:</p>
             * <ul>
             * <li><p><strong>ALL</strong>: -1/-1. Not editable.</p>
             * </li>
             * <li><p><strong>ICMP(IPv4)</strong>: -1/-1. Not editable.</p>
             * </li>
             * <li><p><strong>ICMPv6(IPv6)</strong>: -1/-1. Not editable.</p>
             * </li>
             * <li><p><strong>TCP</strong>: -1/-1. Editable.</p>
             * </li>
             * <li><p><strong>UDP</strong>: -1/-1. Editable.</p>
             * </li>
             * <li><p><strong>GRE</strong>: -1/-1. Not editable.</p>
             * </li>
             * <li><p><strong>SSH</strong>: 22/22. Not editable.</p>
             * </li>
             * <li><p><strong>Telnet</strong>: 23/23. Not editable.</p>
             * </li>
             * <li><p><strong>HTTP</strong>: 80/80. Not editable.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: 443/443. Not editable.</p>
             * </li>
             * <li><p><strong>MS SQL</strong>: 1443/1443. Not editable.</p>
             * </li>
             * <li><p><strong>Oracle</strong>: 1521/1521. Not editable.</p>
             * </li>
             * <li><p><strong>MySql</strong>: 3306/3306. Not editable.</p>
             * </li>
             * <li><p><strong>RDP</strong>: 3389/3389. Not editable.</p>
             * </li>
             * <li><p><strong>PostgreSQL</strong>: 5432/5432. Not editable.</p>
             * </li>
             * <li><p><strong>Redis</strong>: 6379/6379. Not editable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder dstPortRange(String dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The DSCP value for traffic matching of the QoS rule. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates no match.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority must be unique within the same QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type of the QoS rule. Valid values:</p>
             * <ul>
             * <li><p><strong>ALL</strong></p>
             * </li>
             * <li><p><strong>ICMP(IPv4)</strong></p>
             * </li>
             * <li><p><strong>ICMPv6(IPv6)</strong></p>
             * </li>
             * <li><p><strong>TCP</strong></p>
             * </li>
             * <li><p><strong>UDP</strong></p>
             * </li>
             * <li><p><strong>GRE</strong></p>
             * </li>
             * <li><p><strong>SSH</strong></p>
             * </li>
             * <li><p><strong>Telnet</strong></p>
             * </li>
             * <li><p><strong>HTTP</strong></p>
             * </li>
             * <li><p><strong>HTTPS</strong></p>
             * </li>
             * <li><p><strong>MS SQL</strong></p>
             * </li>
             * <li><p><strong>Oracle</strong></p>
             * </li>
             * <li><p><strong>MySql</strong></p>
             * </li>
             * <li><p><strong>RDP</strong></p>
             * </li>
             * <li><p><strong>PostgreSQL</strong></p>
             * </li>
             * <li><p><strong>Redis</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The QoS policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-pksbqfmotl5hzq****</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The QoS queue ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-9nyx2u7n71s2rc****</p>
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>The DSCP value to remark in the traffic. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates no remarking.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remarkingDscp(Integer remarkingDscp) {
                this.remarkingDscp = remarkingDscp;
                return this;
            }

            /**
             * <p>The description of the QoS rule.</p>
             * <p>The description is 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-test</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>The QoS rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-iugg0l9x27f2noc****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the QoS rule.</p>
             * <p>The name is 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The source IPv4 CIDR block for traffic matching of the QoS rule.</p>
             * <blockquote>
             * <p>This parameter cannot be specified together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><code>1.1.**.**</code>/24</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source IPv6 CIDR block for traffic matching of the QoS rule.</p>
             * <blockquote>
             * <p>This parameter cannot be specified together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:0db8:1234:****::/64</p>
             */
            public Builder srcIPv6Cidr(String srcIPv6Cidr) {
                this.srcIPv6Cidr = srcIPv6Cidr;
                return this;
            }

            /**
             * <p>The source port range for traffic matching of the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates no match. Currently, only a single port number can be specified, and the start and end port numbers must be the same.</p>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder srcPortRange(String srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The status of the QoS rule. Valid values:</p>
             * <ul>
             * <li><p><strong>Normal</strong>: active.</p>
             * </li>
             * <li><p><strong>Configuring</strong>: being configured.</p>
             * </li>
             * <li><p><strong>Deleting</strong>: being deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}

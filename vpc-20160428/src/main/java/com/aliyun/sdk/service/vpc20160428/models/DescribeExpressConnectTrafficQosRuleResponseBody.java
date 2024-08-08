// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectTrafficQosRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosRuleResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List < RuleList> ruleList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List < RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleList> ruleList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of QoS rules.
         */
        public Builder ruleList(java.util.List < RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBody build() {
            return new DescribeExpressConnectTrafficQosRuleResponseBody(this);
        } 

    } 

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

            /**
             * The destination IPv4 CIDR block that matches the QoS rule traffic.
             * <p>
             * 
             * > When this parameter is unavailable, specify **SrcIPv6Cidr** or **DstIPv6Cidr**.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * The destination IPv6 CIDR block that matches the QoS rule traffic.
             * <p>
             * 
             * > When this parameter is unavailable, specify **SrcCidr** or **DstCidr**.
             */
            public Builder dstIPv6Cidr(String dstIPv6Cidr) {
                this.dstIPv6Cidr = dstIPv6Cidr;
                return this;
            }

            /**
             * The range of destination ports that match the QoS rule traffic. Valid values: **0** to **65535**. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number. Different protocols correspond to different ports. Valid values:
             * <p>
             * 
             * *   **ALL** (uneditable): -1/-1.
             * *   **ICMP(IPv4)** (uneditable): -1/-1.
             * *   **ICMPv6(IPv6)** (uneditable): -1/-1.
             * *   **TCP** (editable): -1/-1.
             * *   **UDP** (editable): -1/-1.
             * *   **GRE** (uneditable): -1/-1.
             * *   **SSH** (uneditable): 22/22.
             * *   **Telnet** (uneditable): 23/23.
             * *   **HTTP** (uneditable): 80/80.
             * *   **HTTPS** (uneditable): 443/443.
             * *   **MS SQL** (uneditable): 1443/1443.
             * *   **Oracle** (uneditable): 1521/1521.
             * *   **MySql** (uneditable): 3306/3306.
             * *   **RDP** (uneditable): 3389/3389.
             * *   **PostgreSQL** (uneditable): 5432/5432.
             * *   **Redis** (uneditable): 6379/6379.
             */
            public Builder dstPortRange(String dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * The DSCP value that matches the QoS rule traffic. Valid values: **0** to **63**. If no value is matched, the value is -1.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * The priority of the QoS rule. Valid values: **1** to **9000**. A larger value indicates a higher priority. The priority of each QoS rule must be unique in the same QoS policy.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol of the QoS rule. Valid values:
             * <p>
             * 
             * *   **ALL**
             * *   **ICMP(IPv4)**
             * *   **ICMPv6(IPv6)**
             * *   **TCP**
             * *   **UDP**
             * *   **GRE**
             * *   **SSH**
             * *   **Telnet**
             * *   **HTTP**
             * *   **HTTPS**
             * *   **MS SQL**
             * *   **Oracle**
             * *   **MySql**
             * *   **RDP**
             * *   **PostgreSQL**
             * *   **Redis**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The ID of the QoS policy.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * The ID of the QoS queue.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * The new DSCP value. Valid values: **0** to **63**. If you do not change the value, set the value to -1.
             */
            public Builder remarkingDscp(Integer remarkingDscp) {
                this.remarkingDscp = remarkingDscp;
                return this;
            }

            /**
             * The description of the QoS rule.
             * <p>
             * 
             * The description must be 0 to 256 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * The ID of the QoS rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the QoS rule.
             * <p>
             * 
             * The name must be 0 to 128 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The source IPv4 CIDR block that matches the QoS rule traffic.
             * <p>
             * 
             * > When this parameter is unavailable, specify **SrcIPv6Cidr** or **DstIPv6Cidr**.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * The source IPv6 CIDR block that matches the QoS rule traffic.
             * <p>
             * 
             * > When this parameter is unavailable, specify **SrcCidr** or **DstCidr**.
             */
            public Builder srcIPv6Cidr(String srcIPv6Cidr) {
                this.srcIPv6Cidr = srcIPv6Cidr;
                return this;
            }

            /**
             * The range of source ports that match the QoS rule traffic. Valid values: **0** to **65535**. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number.
             */
            public Builder srcPortRange(String srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * The status of the QoS rule. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Configuring**
             * *   **Deleting**
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

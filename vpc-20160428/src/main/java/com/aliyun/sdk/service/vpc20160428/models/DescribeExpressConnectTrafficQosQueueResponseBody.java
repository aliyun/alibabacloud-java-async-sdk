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
 * {@link DescribeExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosQueueResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueueList")
    private java.util.List<QueueList> queueList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExpressConnectTrafficQosQueueResponseBody(Builder builder) {
        this.queueList = builder.queueList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectTrafficQosQueueResponseBody create() {
        return builder().build();
    }

    /**
     * @return queueList
     */
    public java.util.List<QueueList> getQueueList() {
        return this.queueList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QueueList> queueList; 
        private String requestId; 

        /**
         * <p>The information about the QoS queues.</p>
         */
        public Builder queueList(java.util.List<QueueList> queueList) {
            this.queueList = queueList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBody build() {
            return new DescribeExpressConnectTrafficQosQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosQueueResponseBody</p>
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

            /**
             * <p>The destination IPv4 CIDR block that matches the QoS rule traffic.</p>
             * <blockquote>
             * <p>If the parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.0/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination IPv6 CIDR block that matches the QoS rule traffic.</p>
             * <blockquote>
             * <p>If the parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:0db8:1234:5678::/64</p>
             */
            public Builder dstIPv6Cidr(String dstIPv6Cidr) {
                this.dstIPv6Cidr = dstIPv6Cidr;
                return this;
            }

            /**
             * <p>The range of destination ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number. Different protocols correspond to different ports. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong> (uneditable): -1/-1.</li>
             * <li><strong>ICMP(IPv4)</strong> (uneditable): -1/-1.</li>
             * <li><strong>ICMPv6(IPv6)</strong> (uneditable): -1/-1.</li>
             * <li><strong>TCP</strong> (editable): -1/-1.</li>
             * <li><strong>UDP</strong> (editable): -1/-1.</li>
             * <li><strong>GRE</strong> (uneditable): -1/-1.</li>
             * <li><strong>SSH</strong> (uneditable): 22/22.</li>
             * <li><strong>Telnet</strong> (uneditable): 23/23.</li>
             * <li><strong>HTTP</strong> (uneditable): 80/80.</li>
             * <li><strong>HTTPS</strong> (uneditable): 443/443.</li>
             * <li><strong>MS SQL</strong> (uneditable): 1443/1443.</li>
             * <li><strong>Oracle</strong> (uneditable): 1521/1521.</li>
             * <li><strong>MySql</strong> (uneditable): 3306/3306.</li>
             * <li><strong>RDP</strong> (uneditable): 3389/3389.</li>
             * <li><strong>PostgreSQL</strong> (uneditable): 5432/5432.</li>
             * <li><strong>Redis</strong> (uneditable): 6379/6379.</li>
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
             * <p>The DSCP value that matches the QoS rule traffic. Valid values: <strong>0</strong> to <strong>63</strong>. If no value is matched, the value is -1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority of each QoS rule must be unique in the same QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol of the QoS rule. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong></li>
             * <li><strong>ICMP(IPv4)</strong></li>
             * <li><strong>ICMPv6(IPv6)</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>GRE</strong></li>
             * <li><strong>SSH</strong></li>
             * <li><strong>Telnet</strong></li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong></li>
             * <li><strong>MS SQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>MySql</strong></li>
             * <li><strong>RDP</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>Redis</strong></li>
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
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-91xz9f8zd7yj8xwknz</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The ID of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-iugg0l9x27f2nocouj</p>
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>The new DSCP value. Valid values: <strong>0</strong> to <strong>63</strong>. If you do not change the value, the value is -1.</p>
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
             * <p>The name must be <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-test</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS rule.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-iugg0l9x27f2nocouj</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the QoS rule.</p>
             * <p>The name must be <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rule-test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The source IPv4 CIDR block that matches the QoS rule traffic.</p>
             * <blockquote>
             * <p>If the parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.0/24</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source IPv6 CIDR block that matches the QoS rule traffic.</p>
             * <blockquote>
             * <p>If the parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2001:0db8:1234:5678::/64</p>
             */
            public Builder srcIPv6Cidr(String srcIPv6Cidr) {
                this.srcIPv6Cidr = srcIPv6Cidr;
                return this;
            }

            /**
             * <p>The range of source ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number.</p>
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
             * <li><strong>Normal</strong>: The QoS queue is available.</li>
             * <li><strong>Configuring</strong>: The QoS queue is being configured.</li>
             * <li><strong>Deleting</strong>: The QoS queue is being deleted.</li>
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
    /**
     * 
     * {@link DescribeExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectTrafficQosQueueResponseBody</p>
     */
    public static class QueueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPercent")
        private String bandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("QueueDescription")
        private String queueDescription;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("QueueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QueueList(Builder builder) {
            this.bandwidthPercent = builder.bandwidthPercent;
            this.qosId = builder.qosId;
            this.queueDescription = builder.queueDescription;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.queueType = builder.queueType;
            this.ruleList = builder.ruleList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueList create() {
            return builder().build();
        }

        /**
         * @return bandwidthPercent
         */
        public String getBandwidthPercent() {
            return this.bandwidthPercent;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        /**
         * @return queueDescription
         */
        public String getQueueDescription() {
            return this.queueDescription;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bandwidthPercent; 
            private String qosId; 
            private String queueDescription; 
            private String queueId; 
            private String queueName; 
            private String queueType; 
            private java.util.List<RuleList> ruleList; 
            private String status; 

            /**
             * <p>The percentage of bandwidth allocated to a QoS queue.</p>
             * <ul>
             * <li>If QueueType is set to <strong>Medium</strong>, this parameter is returned. Valid values: <strong>1</strong> to <strong>100</strong>.</li>
             * <li>If QueueType is set to <strong>Default</strong>, a value of - is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidthPercent(String bandwidthPercent) {
                this.bandwidthPercent = bandwidthPercent;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-ncfgzxg40zks5n0qze</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The description of the QoS queue.</p>
             * <p>The name must be <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-test</p>
             */
            public Builder queueDescription(String queueDescription) {
                this.queueDescription = queueDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>The name of the QoS queue.</p>
             * <p>The name must be <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-test</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The priority of the QoS queue. Valid values:</p>
             * <ul>
             * <li><strong>High</strong></li>
             * <li><strong>Medium</strong></li>
             * <li><strong>Default</strong></li>
             * </ul>
             * <blockquote>
             * <p> You cannot create a QoS queue of the default priority.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * <p>The information about the QoS rules.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>The state of the QoS queue. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The QoS queue is available.</li>
             * <li><strong>Configuring</strong>: The QoS queue is being configured.</li>
             * <li><strong>Deleting</strong>: The QoS queue is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueueList build() {
                return new QueueList(this);
            } 

        } 

    }
}

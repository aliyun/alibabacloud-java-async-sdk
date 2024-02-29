// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectTrafficQosQueueResponseBody</p>
 */
public class DescribeExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QueueList")
    private java.util.List < QueueList> queueList;

    @NameInMap("RequestId")
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
    public java.util.List < QueueList> getQueueList() {
        return this.queueList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < QueueList> queueList; 
        private String requestId; 

        /**
         * QueueList.
         */
        public Builder queueList(java.util.List < QueueList> queueList) {
            this.queueList = queueList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBody build() {
            return new DescribeExpressConnectTrafficQosQueueResponseBody(this);
        } 

    } 

    public static class RuleList extends TeaModel {
        @NameInMap("DstCidr")
        private String dstCidr;

        @NameInMap("DstIPv6Cidr")
        private String dstIPv6Cidr;

        @NameInMap("DstPortRange")
        private String dstPortRange;

        @NameInMap("MatchDscp")
        private Integer matchDscp;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("QosId")
        private String qosId;

        @NameInMap("QueueId")
        private String queueId;

        @NameInMap("RemarkingDscp")
        private Integer remarkingDscp;

        @NameInMap("RuleDescription")
        private String ruleDescription;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SrcCidr")
        private String srcCidr;

        @NameInMap("SrcIPv6Cidr")
        private String srcIPv6Cidr;

        @NameInMap("SrcPortRange")
        private String srcPortRange;

        @NameInMap("Status")
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
             * DstCidr.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * DstIPv6Cidr.
             */
            public Builder dstIPv6Cidr(String dstIPv6Cidr) {
                this.dstIPv6Cidr = dstIPv6Cidr;
                return this;
            }

            /**
             * DstPortRange.
             */
            public Builder dstPortRange(String dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * MatchDscp.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * RemarkingDscp.
             */
            public Builder remarkingDscp(Integer remarkingDscp) {
                this.remarkingDscp = remarkingDscp;
                return this;
            }

            /**
             * RuleDescription.
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SrcCidr.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * SrcIPv6Cidr.
             */
            public Builder srcIPv6Cidr(String srcIPv6Cidr) {
                this.srcIPv6Cidr = srcIPv6Cidr;
                return this;
            }

            /**
             * SrcPortRange.
             */
            public Builder srcPortRange(String srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * Status.
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
    public static class QueueList extends TeaModel {
        @NameInMap("BandwidthPercent")
        private String bandwidthPercent;

        @NameInMap("QosId")
        private String qosId;

        @NameInMap("QueueDescription")
        private String queueDescription;

        @NameInMap("QueueId")
        private String queueId;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("QueueType")
        private String queueType;

        @NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @NameInMap("Status")
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
        public java.util.List < RuleList> getRuleList() {
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
            private java.util.List < RuleList> ruleList; 
            private String status; 

            /**
             * BandwidthPercent.
             */
            public Builder bandwidthPercent(String bandwidthPercent) {
                this.bandwidthPercent = bandwidthPercent;
                return this;
            }

            /**
             * QosId.
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * QueueDescription.
             */
            public Builder queueDescription(String queueDescription) {
                this.queueDescription = queueDescription;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * QueueType.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * Status.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyResponseBody</p>
 */
public class ListPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyList")
    private java.util.List < PolicyList> policyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListPolicyResponseBody(Builder builder) {
        this.policyList = builder.policyList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyList
     */
    public java.util.List < PolicyList> getPolicyList() {
        return this.policyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < PolicyList> policyList; 
        private String requestId; 
        private Long total; 

        /**
         * PolicyList.
         */
        public Builder policyList(java.util.List < PolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListPolicyResponseBody build() {
            return new ListPolicyResponseBody(this);
        } 

    } 

    public static class FingerPrintRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstPortEnd")
        private Integer dstPortEnd;

        @com.aliyun.core.annotation.NameInMap("DstPortStart")
        private Integer dstPortStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchAction")
        private String matchAction;

        @com.aliyun.core.annotation.NameInMap("MaxPktLen")
        private Integer maxPktLen;

        @com.aliyun.core.annotation.NameInMap("MinPktLen")
        private Integer minPktLen;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("PayloadBytes")
        private String payloadBytes;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RateValue")
        private Integer rateValue;

        @com.aliyun.core.annotation.NameInMap("SeqNo")
        private Integer seqNo;

        @com.aliyun.core.annotation.NameInMap("SrcPortEnd")
        private Integer srcPortEnd;

        @com.aliyun.core.annotation.NameInMap("SrcPortStart")
        private Integer srcPortStart;

        private FingerPrintRuleList(Builder builder) {
            this.dstPortEnd = builder.dstPortEnd;
            this.dstPortStart = builder.dstPortStart;
            this.id = builder.id;
            this.matchAction = builder.matchAction;
            this.maxPktLen = builder.maxPktLen;
            this.minPktLen = builder.minPktLen;
            this.offset = builder.offset;
            this.payloadBytes = builder.payloadBytes;
            this.protocol = builder.protocol;
            this.rateValue = builder.rateValue;
            this.seqNo = builder.seqNo;
            this.srcPortEnd = builder.srcPortEnd;
            this.srcPortStart = builder.srcPortStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FingerPrintRuleList create() {
            return builder().build();
        }

        /**
         * @return dstPortEnd
         */
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        /**
         * @return dstPortStart
         */
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchAction
         */
        public String getMatchAction() {
            return this.matchAction;
        }

        /**
         * @return maxPktLen
         */
        public Integer getMaxPktLen() {
            return this.maxPktLen;
        }

        /**
         * @return minPktLen
         */
        public Integer getMinPktLen() {
            return this.minPktLen;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return payloadBytes
         */
        public String getPayloadBytes() {
            return this.payloadBytes;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return rateValue
         */
        public Integer getRateValue() {
            return this.rateValue;
        }

        /**
         * @return seqNo
         */
        public Integer getSeqNo() {
            return this.seqNo;
        }

        /**
         * @return srcPortEnd
         */
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        /**
         * @return srcPortStart
         */
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

        public static final class Builder {
            private Integer dstPortEnd; 
            private Integer dstPortStart; 
            private String id; 
            private String matchAction; 
            private Integer maxPktLen; 
            private Integer minPktLen; 
            private Integer offset; 
            private String payloadBytes; 
            private String protocol; 
            private Integer rateValue; 
            private Integer seqNo; 
            private Integer srcPortEnd; 
            private Integer srcPortStart; 

            /**
             * DstPortEnd.
             */
            public Builder dstPortEnd(Integer dstPortEnd) {
                this.dstPortEnd = dstPortEnd;
                return this;
            }

            /**
             * DstPortStart.
             */
            public Builder dstPortStart(Integer dstPortStart) {
                this.dstPortStart = dstPortStart;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MatchAction.
             */
            public Builder matchAction(String matchAction) {
                this.matchAction = matchAction;
                return this;
            }

            /**
             * MaxPktLen.
             */
            public Builder maxPktLen(Integer maxPktLen) {
                this.maxPktLen = maxPktLen;
                return this;
            }

            /**
             * MinPktLen.
             */
            public Builder minPktLen(Integer minPktLen) {
                this.minPktLen = minPktLen;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * PayloadBytes.
             */
            public Builder payloadBytes(String payloadBytes) {
                this.payloadBytes = payloadBytes;
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
             * RateValue.
             */
            public Builder rateValue(Integer rateValue) {
                this.rateValue = rateValue;
                return this;
            }

            /**
             * SeqNo.
             */
            public Builder seqNo(Integer seqNo) {
                this.seqNo = seqNo;
                return this;
            }

            /**
             * SrcPortEnd.
             */
            public Builder srcPortEnd(Integer srcPortEnd) {
                this.srcPortEnd = srcPortEnd;
                return this;
            }

            /**
             * SrcPortStart.
             */
            public Builder srcPortStart(Integer srcPortStart) {
                this.srcPortStart = srcPortStart;
                return this;
            }

            public FingerPrintRuleList build() {
                return new FingerPrintRuleList(this);
            } 

        } 

    }
    public static class ConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arg")
        private String arg;

        @com.aliyun.core.annotation.NameInMap("Depth")
        private Integer depth;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        private ConditionList(Builder builder) {
            this.arg = builder.arg;
            this.depth = builder.depth;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionList create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return depth
         */
        public Integer getDepth() {
            return this.depth;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        public static final class Builder {
            private String arg; 
            private Integer depth; 
            private Integer position; 

            /**
             * Arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * Depth.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            public ConditionList build() {
                return new ConditionList(this);
            } 

        } 

    }
    public static class L4RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ConditionList")
        private java.util.List < ConditionList> conditionList;

        @com.aliyun.core.annotation.NameInMap("Limited")
        private Integer limited;

        @com.aliyun.core.annotation.NameInMap("Match")
        private String match;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private L4RuleList(Builder builder) {
            this.action = builder.action;
            this.conditionList = builder.conditionList;
            this.limited = builder.limited;
            this.match = builder.match;
            this.method = builder.method;
            this.name = builder.name;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static L4RuleList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return conditionList
         */
        public java.util.List < ConditionList> getConditionList() {
            return this.conditionList;
        }

        /**
         * @return limited
         */
        public Integer getLimited() {
            return this.limited;
        }

        /**
         * @return match
         */
        public String getMatch() {
            return this.match;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String action; 
            private java.util.List < ConditionList> conditionList; 
            private Integer limited; 
            private String match; 
            private String method; 
            private String name; 
            private Integer priority; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ConditionList.
             */
            public Builder conditionList(java.util.List < ConditionList> conditionList) {
                this.conditionList = conditionList;
                return this;
            }

            /**
             * Limited.
             */
            public Builder limited(Integer limited) {
                this.limited = limited;
                return this;
            }

            /**
             * Match.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public L4RuleList build() {
                return new L4RuleList(this);
            } 

        } 

    }
    public static class PortRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstPortEnd")
        private Integer dstPortEnd;

        @com.aliyun.core.annotation.NameInMap("DstPortStart")
        private Integer dstPortStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchAction")
        private String matchAction;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SeqNo")
        private Integer seqNo;

        @com.aliyun.core.annotation.NameInMap("SrcPortEnd")
        private Integer srcPortEnd;

        @com.aliyun.core.annotation.NameInMap("SrcPortStart")
        private Integer srcPortStart;

        private PortRuleList(Builder builder) {
            this.dstPortEnd = builder.dstPortEnd;
            this.dstPortStart = builder.dstPortStart;
            this.id = builder.id;
            this.matchAction = builder.matchAction;
            this.protocol = builder.protocol;
            this.seqNo = builder.seqNo;
            this.srcPortEnd = builder.srcPortEnd;
            this.srcPortStart = builder.srcPortStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRuleList create() {
            return builder().build();
        }

        /**
         * @return dstPortEnd
         */
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        /**
         * @return dstPortStart
         */
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchAction
         */
        public String getMatchAction() {
            return this.matchAction;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return seqNo
         */
        public Integer getSeqNo() {
            return this.seqNo;
        }

        /**
         * @return srcPortEnd
         */
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        /**
         * @return srcPortStart
         */
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

        public static final class Builder {
            private Integer dstPortEnd; 
            private Integer dstPortStart; 
            private String id; 
            private String matchAction; 
            private String protocol; 
            private Integer seqNo; 
            private Integer srcPortEnd; 
            private Integer srcPortStart; 

            /**
             * DstPortEnd.
             */
            public Builder dstPortEnd(Integer dstPortEnd) {
                this.dstPortEnd = dstPortEnd;
                return this;
            }

            /**
             * DstPortStart.
             */
            public Builder dstPortStart(Integer dstPortStart) {
                this.dstPortStart = dstPortStart;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MatchAction.
             */
            public Builder matchAction(String matchAction) {
                this.matchAction = matchAction;
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
             * SeqNo.
             */
            public Builder seqNo(Integer seqNo) {
                this.seqNo = seqNo;
                return this;
            }

            /**
             * SrcPortEnd.
             */
            public Builder srcPortEnd(Integer srcPortEnd) {
                this.srcPortEnd = srcPortEnd;
                return this;
            }

            /**
             * SrcPortStart.
             */
            public Builder srcPortStart(Integer srcPortStart) {
                this.srcPortStart = srcPortStart;
                return this;
            }

            public PortRuleList build() {
                return new PortRuleList(this);
            } 

        } 

    }
    public static class SourceBlockList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockExpireSeconds")
        private Integer blockExpireSeconds;

        @com.aliyun.core.annotation.NameInMap("EverySeconds")
        private Integer everySeconds;

        @com.aliyun.core.annotation.NameInMap("ExceedLimitTimes")
        private Integer exceedLimitTimes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private SourceBlockList(Builder builder) {
            this.blockExpireSeconds = builder.blockExpireSeconds;
            this.everySeconds = builder.everySeconds;
            this.exceedLimitTimes = builder.exceedLimitTimes;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceBlockList create() {
            return builder().build();
        }

        /**
         * @return blockExpireSeconds
         */
        public Integer getBlockExpireSeconds() {
            return this.blockExpireSeconds;
        }

        /**
         * @return everySeconds
         */
        public Integer getEverySeconds() {
            return this.everySeconds;
        }

        /**
         * @return exceedLimitTimes
         */
        public Integer getExceedLimitTimes() {
            return this.exceedLimitTimes;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer blockExpireSeconds; 
            private Integer everySeconds; 
            private Integer exceedLimitTimes; 
            private Integer type; 

            /**
             * BlockExpireSeconds.
             */
            public Builder blockExpireSeconds(Integer blockExpireSeconds) {
                this.blockExpireSeconds = blockExpireSeconds;
                return this;
            }

            /**
             * EverySeconds.
             */
            public Builder everySeconds(Integer everySeconds) {
                this.everySeconds = everySeconds;
                return this;
            }

            /**
             * ExceedLimitTimes.
             */
            public Builder exceedLimitTimes(Integer exceedLimitTimes) {
                this.exceedLimitTimes = exceedLimitTimes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public SourceBlockList build() {
                return new SourceBlockList(this);
            } 

        } 

    }
    public static class SourceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Integer bps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("SynBps")
        private Integer synBps;

        @com.aliyun.core.annotation.NameInMap("SynPps")
        private Integer synPps;

        private SourceLimit(Builder builder) {
            this.bps = builder.bps;
            this.pps = builder.pps;
            this.synBps = builder.synBps;
            this.synPps = builder.synPps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceLimit create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Integer getBps() {
            return this.bps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return synBps
         */
        public Integer getSynBps() {
            return this.synBps;
        }

        /**
         * @return synPps
         */
        public Integer getSynPps() {
            return this.synPps;
        }

        public static final class Builder {
            private Integer bps; 
            private Integer pps; 
            private Integer synBps; 
            private Integer synPps; 

            /**
             * Bps.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Pps.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * SynBps.
             */
            public Builder synBps(Integer synBps) {
                this.synBps = synBps;
                return this;
            }

            /**
             * SynPps.
             */
            public Builder synPps(Integer synPps) {
                this.synPps = synPps;
                return this;
            }

            public SourceLimit build() {
                return new SourceLimit(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackIpListExpireAt")
        private Long blackIpListExpireAt;

        @com.aliyun.core.annotation.NameInMap("EnableDropIcmp")
        private Boolean enableDropIcmp;

        @com.aliyun.core.annotation.NameInMap("EnableIntelligence")
        private Boolean enableIntelligence;

        @com.aliyun.core.annotation.NameInMap("EnableL4Defense")
        private Boolean enableL4Defense;

        @com.aliyun.core.annotation.NameInMap("FingerPrintRuleList")
        private java.util.List < FingerPrintRuleList> fingerPrintRuleList;

        @com.aliyun.core.annotation.NameInMap("IntelligenceLevel")
        private String intelligenceLevel;

        @com.aliyun.core.annotation.NameInMap("L4RuleList")
        private java.util.List < L4RuleList> l4RuleList;

        @com.aliyun.core.annotation.NameInMap("PortRuleList")
        private java.util.List < PortRuleList> portRuleList;

        @com.aliyun.core.annotation.NameInMap("ReflectBlockUdpPortList")
        private java.util.List < Integer > reflectBlockUdpPortList;

        @com.aliyun.core.annotation.NameInMap("RegionBlockCountryList")
        private java.util.List < Integer > regionBlockCountryList;

        @com.aliyun.core.annotation.NameInMap("RegionBlockProvinceList")
        private java.util.List < Integer > regionBlockProvinceList;

        @com.aliyun.core.annotation.NameInMap("SourceBlockList")
        private java.util.List < SourceBlockList> sourceBlockList;

        @com.aliyun.core.annotation.NameInMap("SourceLimit")
        private SourceLimit sourceLimit;

        @com.aliyun.core.annotation.NameInMap("WhitenGfbrNets")
        private Boolean whitenGfbrNets;

        private Content(Builder builder) {
            this.blackIpListExpireAt = builder.blackIpListExpireAt;
            this.enableDropIcmp = builder.enableDropIcmp;
            this.enableIntelligence = builder.enableIntelligence;
            this.enableL4Defense = builder.enableL4Defense;
            this.fingerPrintRuleList = builder.fingerPrintRuleList;
            this.intelligenceLevel = builder.intelligenceLevel;
            this.l4RuleList = builder.l4RuleList;
            this.portRuleList = builder.portRuleList;
            this.reflectBlockUdpPortList = builder.reflectBlockUdpPortList;
            this.regionBlockCountryList = builder.regionBlockCountryList;
            this.regionBlockProvinceList = builder.regionBlockProvinceList;
            this.sourceBlockList = builder.sourceBlockList;
            this.sourceLimit = builder.sourceLimit;
            this.whitenGfbrNets = builder.whitenGfbrNets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return blackIpListExpireAt
         */
        public Long getBlackIpListExpireAt() {
            return this.blackIpListExpireAt;
        }

        /**
         * @return enableDropIcmp
         */
        public Boolean getEnableDropIcmp() {
            return this.enableDropIcmp;
        }

        /**
         * @return enableIntelligence
         */
        public Boolean getEnableIntelligence() {
            return this.enableIntelligence;
        }

        /**
         * @return enableL4Defense
         */
        public Boolean getEnableL4Defense() {
            return this.enableL4Defense;
        }

        /**
         * @return fingerPrintRuleList
         */
        public java.util.List < FingerPrintRuleList> getFingerPrintRuleList() {
            return this.fingerPrintRuleList;
        }

        /**
         * @return intelligenceLevel
         */
        public String getIntelligenceLevel() {
            return this.intelligenceLevel;
        }

        /**
         * @return l4RuleList
         */
        public java.util.List < L4RuleList> getL4RuleList() {
            return this.l4RuleList;
        }

        /**
         * @return portRuleList
         */
        public java.util.List < PortRuleList> getPortRuleList() {
            return this.portRuleList;
        }

        /**
         * @return reflectBlockUdpPortList
         */
        public java.util.List < Integer > getReflectBlockUdpPortList() {
            return this.reflectBlockUdpPortList;
        }

        /**
         * @return regionBlockCountryList
         */
        public java.util.List < Integer > getRegionBlockCountryList() {
            return this.regionBlockCountryList;
        }

        /**
         * @return regionBlockProvinceList
         */
        public java.util.List < Integer > getRegionBlockProvinceList() {
            return this.regionBlockProvinceList;
        }

        /**
         * @return sourceBlockList
         */
        public java.util.List < SourceBlockList> getSourceBlockList() {
            return this.sourceBlockList;
        }

        /**
         * @return sourceLimit
         */
        public SourceLimit getSourceLimit() {
            return this.sourceLimit;
        }

        /**
         * @return whitenGfbrNets
         */
        public Boolean getWhitenGfbrNets() {
            return this.whitenGfbrNets;
        }

        public static final class Builder {
            private Long blackIpListExpireAt; 
            private Boolean enableDropIcmp; 
            private Boolean enableIntelligence; 
            private Boolean enableL4Defense; 
            private java.util.List < FingerPrintRuleList> fingerPrintRuleList; 
            private String intelligenceLevel; 
            private java.util.List < L4RuleList> l4RuleList; 
            private java.util.List < PortRuleList> portRuleList; 
            private java.util.List < Integer > reflectBlockUdpPortList; 
            private java.util.List < Integer > regionBlockCountryList; 
            private java.util.List < Integer > regionBlockProvinceList; 
            private java.util.List < SourceBlockList> sourceBlockList; 
            private SourceLimit sourceLimit; 
            private Boolean whitenGfbrNets; 

            /**
             * BlackIpListExpireAt.
             */
            public Builder blackIpListExpireAt(Long blackIpListExpireAt) {
                this.blackIpListExpireAt = blackIpListExpireAt;
                return this;
            }

            /**
             * EnableDropIcmp.
             */
            public Builder enableDropIcmp(Boolean enableDropIcmp) {
                this.enableDropIcmp = enableDropIcmp;
                return this;
            }

            /**
             * EnableIntelligence.
             */
            public Builder enableIntelligence(Boolean enableIntelligence) {
                this.enableIntelligence = enableIntelligence;
                return this;
            }

            /**
             * EnableL4Defense.
             */
            public Builder enableL4Defense(Boolean enableL4Defense) {
                this.enableL4Defense = enableL4Defense;
                return this;
            }

            /**
             * FingerPrintRuleList.
             */
            public Builder fingerPrintRuleList(java.util.List < FingerPrintRuleList> fingerPrintRuleList) {
                this.fingerPrintRuleList = fingerPrintRuleList;
                return this;
            }

            /**
             * IntelligenceLevel.
             */
            public Builder intelligenceLevel(String intelligenceLevel) {
                this.intelligenceLevel = intelligenceLevel;
                return this;
            }

            /**
             * L4RuleList.
             */
            public Builder l4RuleList(java.util.List < L4RuleList> l4RuleList) {
                this.l4RuleList = l4RuleList;
                return this;
            }

            /**
             * PortRuleList.
             */
            public Builder portRuleList(java.util.List < PortRuleList> portRuleList) {
                this.portRuleList = portRuleList;
                return this;
            }

            /**
             * ReflectBlockUdpPortList.
             */
            public Builder reflectBlockUdpPortList(java.util.List < Integer > reflectBlockUdpPortList) {
                this.reflectBlockUdpPortList = reflectBlockUdpPortList;
                return this;
            }

            /**
             * RegionBlockCountryList.
             */
            public Builder regionBlockCountryList(java.util.List < Integer > regionBlockCountryList) {
                this.regionBlockCountryList = regionBlockCountryList;
                return this;
            }

            /**
             * RegionBlockProvinceList.
             */
            public Builder regionBlockProvinceList(java.util.List < Integer > regionBlockProvinceList) {
                this.regionBlockProvinceList = regionBlockProvinceList;
                return this;
            }

            /**
             * SourceBlockList.
             */
            public Builder sourceBlockList(java.util.List < SourceBlockList> sourceBlockList) {
                this.sourceBlockList = sourceBlockList;
                return this;
            }

            /**
             * SourceLimit.
             */
            public Builder sourceLimit(SourceLimit sourceLimit) {
                this.sourceLimit = sourceLimit;
                return this;
            }

            /**
             * WhitenGfbrNets.
             */
            public Builder whitenGfbrNets(Boolean whitenGfbrNets) {
                this.whitenGfbrNets = whitenGfbrNets;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedCount")
        private Integer attachedCount;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PolicyList(Builder builder) {
            this.attachedCount = builder.attachedCount;
            this.content = builder.content;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return attachedCount
         */
        public Integer getAttachedCount() {
            return this.attachedCount;
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer attachedCount; 
            private Content content; 
            private String id; 
            private String name; 
            private String type; 

            /**
             * AttachedCount.
             */
            public Builder attachedCount(Integer attachedCount) {
                this.attachedCount = attachedCount;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
}

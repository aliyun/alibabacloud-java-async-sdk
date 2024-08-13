// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyRequest</p>
 */
public class ModifyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ModifyPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actionType = builder.actionType;
        this.content = builder.content;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
        return this.actionType;
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

    public static final class Builder extends Request.Builder<ModifyPolicyRequest, Builder> {
        private String regionId; 
        private Integer actionType; 
        private Content content; 
        private String id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actionType = request.actionType;
            this.content = request.content;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the action. Valid values:
         * <p>
         * 
         * *   **10**: modifies the name. If you specify this value, `Name` is required.
         * *   **11**: modifies the blacklist validity period. If you specify this value, `BlackIpListExpireAt` is required. Only IP-specific mitigation policies support this value.
         * *   **12**: changes the status of the feature of adding back-to-origin CIDR blocks of Anti-DDoS Proxy to the whitelist. If you specify this value, `WhitenGfbrNets` is required. Only IP-specific mitigation policies support this value.
         * *   **13**: changes the status of the ICMP blocking feature. If you specify this value, `EnableDropIcmp` is required. Only IP-specific mitigation policies support this value.
         * *   **20**: adds IP addresses to the blacklist or the whitelist. If you specify this value, you must specify at least one of `WhiteIpList` and `BlackIpList`. Only IP-specific mitigation policies support this value.
         * *   **21**: removes IP addresses from the blacklist or the whitelist. If you specify this value, at least one of `WhiteIpList` and `BlackIpList` is required. Only IP-specific mitigation policies support this value.
         * *   **22**: clears the whitelist. Only IP-specific mitigation policies support this value.
         * *   **23**: clears the blacklist. Only IP-specific mitigation policies support this value.
         * *   **30**: modifies the status and level of intelligent protection. If you specify this value, `EnableIntelligence` and `IntelligenceLevel` are required. Only IP-specific mitigation policies support this value.
         * *   **31**: modifies the location blacklist settings. If you specify this value, one of `RegionBlockCountryList` and `RegionBlockProvinceList` is required. Only IP-specific mitigation policies support this value.
         * *   **32**: modifies the settings for source rate limiting. If you specify this value, `SourceLimit` and `SourceBlockList` are required. Only IP-specific mitigation policies support this value.
         * *   **33**: modifies the settings for reflection attack filtering. If you specify this value, `ReflectBlockUdpPortList` is required. Only IP-specific mitigation policies support this value.
         * *   **40**: creates a port blocking rule. If you specify this value, `PortRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **41**: modifies the port blocking rule. If you specify this value, `PortRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **42**: deletes the port blocking rule. If you specify this value, `PortRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **50**: creates a byte-match filter rule. If you specify this value, `FingerPrintRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **51**: modifies the byte-match filter rule. If you specify this value, `FingerPrintRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **52**: deletes the byte-match filter rule. If you specify this value, `FingerPrintRuleList` is required. Only IP-specific mitigation policies support this value.
         * *   **60**: changes the status of the port-specific mitigation feature. If you specify this value, `EnableL4Defense` is required. Only port-specific mitigation policies support this value.
         * *   **61**: creates a port-specific mitigation rule. If you specify this value, `L4RuleList` is required. Only port-specific mitigation policies support this value.
         * *   **62**: modifies the port-specific mitigation rule. If you specify this value, `L4RuleList` is required. Only port-specific mitigation policies support this value.
         * *   **63**: deletes the port-specific mitigation rule. If you specify this value, `L4RuleList` is required. Only port-specific mitigation policies support this value.
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * The content of the policy.
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyPolicyRequest build() {
            return new ModifyPolicyRequest(this);
        } 

    } 

    public static class FingerPrintRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstPortEnd")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer dstPortEnd;

        @com.aliyun.core.annotation.NameInMap("DstPortStart")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer dstPortStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchAction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String matchAction;

        @com.aliyun.core.annotation.NameInMap("MaxPktLen")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1500)
        private Integer maxPktLen;

        @com.aliyun.core.annotation.NameInMap("MinPktLen")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1500)
        private Integer minPktLen;

        @com.aliyun.core.annotation.NameInMap("Offset")
        @com.aliyun.core.annotation.Validation(maximum = 1500)
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("PayloadBytes")
        @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 2)
        private String payloadBytes;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RateValue")
        @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
        private Integer rateValue;

        @com.aliyun.core.annotation.NameInMap("SeqNo")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
        private Integer seqNo;

        @com.aliyun.core.annotation.NameInMap("SrcPortEnd")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer srcPortEnd;

        @com.aliyun.core.annotation.NameInMap("SrcPortStart")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
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
             * The end of the destination port range. Valid values: **0** to **65535**.
             */
            public Builder dstPortEnd(Integer dstPortEnd) {
                this.dstPortEnd = dstPortEnd;
                return this;
            }

            /**
             * The start of the destination port range. Valid values: **0** to **65535**.
             */
            public Builder dstPortStart(Integer dstPortStart) {
                this.dstPortStart = dstPortStart;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The action triggered if the rule is matched. Valid values:
             * <p>
             * 
             * *   **accept**: allows the traffic that matches the conditions in the byte-match filter rule.
             * *   **drop**: discards the traffic that matches the conditions in the byte-match filter rule.
             * *   **ip_rate**: limits rates on the source IP address whose traffic matches the conditions in the byte-match filter rule. The rate limit is specified by **RateValue**.
             * *   **session_rate**: limits the number of sessions from the source IP address whose traffic matches the conditions in the byte-match filter rule. The rate limit is specified by **RateValue**.
             */
            public Builder matchAction(String matchAction) {
                this.matchAction = matchAction;
                return this;
            }

            /**
             * The maximum packet length. Valid values: **1** to **1500**.
             */
            public Builder maxPktLen(Integer maxPktLen) {
                this.maxPktLen = maxPktLen;
                return this;
            }

            /**
             * The minimum packet length. Valid values: **1** to **1500**.
             */
            public Builder minPktLen(Integer minPktLen) {
                this.minPktLen = minPktLen;
                return this;
            }

            /**
             * The offset. Valid values: **0** to **1500**.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * The payload. The value is a hexadecimal string.
             */
            public Builder payloadBytes(String payloadBytes) {
                this.payloadBytes = payloadBytes;
                return this;
            }

            /**
             * The type of the protocol. Valid value:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The rate limit. Valid values: **1** to **100000**.
             * <p>
             * 
             * >  This parameter is required when **MatchAction** is set to **ip_rate** or **session_rate**.
             */
            public Builder rateValue(Integer rateValue) {
                this.rateValue = rateValue;
                return this;
            }

            /**
             * The sequence number that indicates the order for the rule to take effect. The value is an integer.
             * <p>
             * 
             * >  A smaller number indicates a higher priority.
             */
            public Builder seqNo(Integer seqNo) {
                this.seqNo = seqNo;
                return this;
            }

            /**
             * The end of the source port range. Valid values: **0** to **65535**.
             */
            public Builder srcPortEnd(Integer srcPortEnd) {
                this.srcPortEnd = srcPortEnd;
                return this;
            }

            /**
             * The start of the source port range. Valid values: **0** to **65535**.
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
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 4096, minLength = 1)
        private String arg;

        @com.aliyun.core.annotation.NameInMap("Depth")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 2048, minimum = 1)
        private Integer depth;

        @com.aliyun.core.annotation.NameInMap("Position")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 2047)
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
             * The term that is used for matching.
             * <p>
             * 
             * >  If Method is set to **char**, the value of this parameter must be ASCII strings. If Method is set to **hex**, the value of this parameter must be hexadecimal strings. Maximum length: 2,048.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The number of bytes from the start position for matching. Valid values: **1** to **2048**.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * The start position for matching. Valid values: **0** to **2047**.
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("ConditionList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < ConditionList> conditionList;

        @com.aliyun.core.annotation.NameInMap("Limited")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 2048)
        private Integer limited;

        @com.aliyun.core.annotation.NameInMap("Match")
        @com.aliyun.core.annotation.Validation(required = true)
        private String match;

        @com.aliyun.core.annotation.NameInMap("Method")
        @com.aliyun.core.annotation.Validation(required = true)
        private String method;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
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
             * The action that is specified in the rule. Valid value:
             * <p>
             * 
             * *   **2**: The traffic is discarded.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The match conditions.
             */
            public Builder conditionList(java.util.List < ConditionList> conditionList) {
                this.conditionList = conditionList;
                return this;
            }

            /**
             * The minimum number of bytes in a session to trigger matching. Valid values: **0** to **2048**.
             */
            public Builder limited(Integer limited) {
                this.limited = limited;
                return this;
            }

            /**
             * The condition based on which an action is performed. Valid values:
             * <p>
             * 
             * *   **0**: If the rule is matched, the action specified in the rule is performed.
             * *   **1**: If the rule is not matched, the action specified in the rule is performed.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **char**: string match.
             * *   **hex**: hexadecimal string match.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The priority of the rule. Valid values: **1** to **100**.
             * <p>
             * 
             * >  A smaller value indicates a higher priority.
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
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer dstPortEnd;

        @com.aliyun.core.annotation.NameInMap("DstPortStart")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer dstPortStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchAction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String matchAction;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SeqNo")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
        private Integer seqNo;

        @com.aliyun.core.annotation.NameInMap("SrcPortEnd")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
        private Integer srcPortEnd;

        @com.aliyun.core.annotation.NameInMap("SrcPortStart")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
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
             * The end of the destination port range. Valid values: **0** to **65535**.
             */
            public Builder dstPortEnd(Integer dstPortEnd) {
                this.dstPortEnd = dstPortEnd;
                return this;
            }

            /**
             * The start of the destination port range. Valid values: **0** to **65535**.
             */
            public Builder dstPortStart(Integer dstPortStart) {
                this.dstPortStart = dstPortStart;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The action triggered if the rule is matched. Valid value:
             * <p>
             * 
             * *   **drop**: The traffic is discarded.
             */
            public Builder matchAction(String matchAction) {
                this.matchAction = matchAction;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The sequence number that indicates the order for the rule to take effect. The value is an integer.
             * <p>
             * 
             * >  A smaller number indicates a higher priority.
             */
            public Builder seqNo(Integer seqNo) {
                this.seqNo = seqNo;
                return this;
            }

            /**
             * The end of the source port range. Valid values: **0** to **65535**.
             */
            public Builder srcPortEnd(Integer srcPortEnd) {
                this.srcPortEnd = srcPortEnd;
                return this;
            }

            /**
             * The start of the source port range. Valid values: **0** to **65535**.
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
        @com.aliyun.core.annotation.Validation(required = true, maximum = 2592000, minimum = 60)
        private Integer blockExpireSeconds;

        @com.aliyun.core.annotation.NameInMap("EverySeconds")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1200, minimum = 60)
        private Integer everySeconds;

        @com.aliyun.core.annotation.NameInMap("ExceedLimitTimes")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 1200, minimum = 1)
        private Integer exceedLimitTimes;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The validity period of the blacklist to which the source IP address is added. Unit: seconds.
             */
            public Builder blockExpireSeconds(Integer blockExpireSeconds) {
                this.blockExpireSeconds = blockExpireSeconds;
                return this;
            }

            /**
             * The statistical period during which the system collects data on source IP addresses to determine whether to add the source IP addresses to the blacklist. Unit: seconds.
             */
            public Builder everySeconds(Integer everySeconds) {
                this.everySeconds = everySeconds;
                return this;
            }

            /**
             * The number of times that the source IP address exceeds a limit in a statistical period.
             */
            public Builder exceedLimitTimes(Integer exceedLimitTimes) {
                this.exceedLimitTimes = exceedLimitTimes;
                return this;
            }

            /**
             * The type of the source rate limit. Valid values:
             * <p>
             * 
             * *   **3**: the PPS limit on source IP addresses.
             * *   **4**: the bandwidth limit on source IP addresses.
             * *   **5**: the PPS limit on source SYN packets.
             * *   **6**: the bandwidth limit on source SYN packets.
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
        @com.aliyun.core.annotation.Validation(maximum = 268435456, minimum = 1024)
        private Integer bps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        @com.aliyun.core.annotation.Validation(maximum = 500000, minimum = 32)
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("SynBps")
        @com.aliyun.core.annotation.Validation(maximum = 268435456, minimum = 1024)
        private Integer synBps;

        @com.aliyun.core.annotation.NameInMap("SynPps")
        @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
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
             * The bandwidth limit on source IP addresses. Unit: bytes per second.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The packets per second (PPS) limit on source IP addresses.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The bandwidth limit on source SYN packets. Unit: bytes per second.
             */
            public Builder synBps(Integer synBps) {
                this.synBps = synBps;
                return this;
            }

            /**
             * The PPS limit on source SYN packets.
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
        @com.aliyun.core.annotation.NameInMap("BlackIpList")
        private java.util.List < String > blackIpList;

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

        @com.aliyun.core.annotation.NameInMap("WhiteIpList")
        private java.util.List < String > whiteIpList;

        @com.aliyun.core.annotation.NameInMap("WhitenGfbrNets")
        private Boolean whitenGfbrNets;

        private Content(Builder builder) {
            this.blackIpList = builder.blackIpList;
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
            this.whiteIpList = builder.whiteIpList;
            this.whitenGfbrNets = builder.whitenGfbrNets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return blackIpList
         */
        public java.util.List < String > getBlackIpList() {
            return this.blackIpList;
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
         * @return whiteIpList
         */
        public java.util.List < String > getWhiteIpList() {
            return this.whiteIpList;
        }

        /**
         * @return whitenGfbrNets
         */
        public Boolean getWhitenGfbrNets() {
            return this.whitenGfbrNets;
        }

        public static final class Builder {
            private java.util.List < String > blackIpList; 
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
            private java.util.List < String > whiteIpList; 
            private Boolean whitenGfbrNets; 

            /**
             * The IP addresses in the blacklist.
             */
            public Builder blackIpList(java.util.List < String > blackIpList) {
                this.blackIpList = blackIpList;
                return this;
            }

            /**
             * The validity period of the IP address blacklist. The value is a UNIX timestamp.
             */
            public Builder blackIpListExpireAt(Long blackIpListExpireAt) {
                this.blackIpListExpireAt = blackIpListExpireAt;
                return this;
            }

            /**
             * Specifies whether to enable ICMP blocking.
             */
            public Builder enableDropIcmp(Boolean enableDropIcmp) {
                this.enableDropIcmp = enableDropIcmp;
                return this;
            }

            /**
             * Specifies whether to enable intelligent protection.
             */
            public Builder enableIntelligence(Boolean enableIntelligence) {
                this.enableIntelligence = enableIntelligence;
                return this;
            }

            /**
             * Specifies whether to enable port-specific mitigation.
             */
            public Builder enableL4Defense(Boolean enableL4Defense) {
                this.enableL4Defense = enableL4Defense;
                return this;
            }

            /**
             * The byte-match filter rules.
             */
            public Builder fingerPrintRuleList(java.util.List < FingerPrintRuleList> fingerPrintRuleList) {
                this.fingerPrintRuleList = fingerPrintRuleList;
                return this;
            }

            /**
             * The level of intelligent protection. Valid values:
             * <p>
             * 
             * *   **default**: normal.
             * *   **hard**: strict.
             * *   **weak**: loose.
             */
            public Builder intelligenceLevel(String intelligenceLevel) {
                this.intelligenceLevel = intelligenceLevel;
                return this;
            }

            /**
             * The port-specific mitigation rules.
             */
            public Builder l4RuleList(java.util.List < L4RuleList> l4RuleList) {
                this.l4RuleList = l4RuleList;
                return this;
            }

            /**
             * The port blocking rules.
             */
            public Builder portRuleList(java.util.List < PortRuleList> portRuleList) {
                this.portRuleList = portRuleList;
                return this;
            }

            /**
             * The ports whose traffic is filtered out by the filtering policies for UDP reflection attacks.
             */
            public Builder reflectBlockUdpPortList(java.util.List < Integer > reflectBlockUdpPortList) {
                this.reflectBlockUdpPortList = reflectBlockUdpPortList;
                return this;
            }

            /**
             * The countries in the location blacklist.
             */
            public Builder regionBlockCountryList(java.util.List < Integer > regionBlockCountryList) {
                this.regionBlockCountryList = regionBlockCountryList;
                return this;
            }

            /**
             * The provinces in the location blacklist.
             */
            public Builder regionBlockProvinceList(java.util.List < Integer > regionBlockProvinceList) {
                this.regionBlockProvinceList = regionBlockProvinceList;
                return this;
            }

            /**
             * The source IP addresses that are added to the blacklist.
             */
            public Builder sourceBlockList(java.util.List < SourceBlockList> sourceBlockList) {
                this.sourceBlockList = sourceBlockList;
                return this;
            }

            /**
             * The settings for source rate limiting.
             */
            public Builder sourceLimit(SourceLimit sourceLimit) {
                this.sourceLimit = sourceLimit;
                return this;
            }

            /**
             * The IP addresses in the whitelist.
             */
            public Builder whiteIpList(java.util.List < String > whiteIpList) {
                this.whiteIpList = whiteIpList;
                return this;
            }

            /**
             * Specifies whether to add back-to-origin CIDR blocks of Anti-DDoS Proxy to the whitelist.
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
}

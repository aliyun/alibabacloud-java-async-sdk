// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallControlPolicyResponseBody</p>
 */
public class DescribeNatFirewallControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policys")
    private java.util.List<Policys> policys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeNatFirewallControlPolicyResponseBody(Builder builder) {
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallControlPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policys
     */
    public java.util.List<Policys> getPolicys() {
        return this.policys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Policys> policys; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallControlPolicyResponseBody model) {
            this.policys = model.policys;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the access control policies.</p>
         */
        public Builder policys(java.util.List<Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F183567D-8A52-5BAE-9472-F1C427378C28</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatFirewallControlPolicyResponseBody build() {
            return new DescribeNatFirewallControlPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallControlPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallControlPolicyResponseBody</p>
     */
    public static class Policys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclAction")
        private String aclAction;

        @com.aliyun.core.annotation.NameInMap("AclUuid")
        private String aclUuid;

        @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
        private java.util.List<String> applicationNameList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestPort")
        private String destPort;

        @com.aliyun.core.annotation.NameInMap("DestPortGroup")
        private String destPortGroup;

        @com.aliyun.core.annotation.NameInMap("DestPortGroupPorts")
        private java.util.List<String> destPortGroupPorts;

        @com.aliyun.core.annotation.NameInMap("DestPortType")
        private String destPortType;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationGroupCidrs")
        private java.util.List<String> destinationGroupCidrs;

        @com.aliyun.core.annotation.NameInMap("DestinationGroupType")
        private String destinationGroupType;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("DnsResult")
        private String dnsResult;

        @com.aliyun.core.annotation.NameInMap("DnsResultTime")
        private Long dnsResultTime;

        @com.aliyun.core.annotation.NameInMap("DomainResolveType")
        private Integer domainResolveType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HitLastTime")
        private Long hitLastTime;

        @com.aliyun.core.annotation.NameInMap("HitTimes")
        private Integer hitTimes;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("Release")
        private String release;

        @com.aliyun.core.annotation.NameInMap("RepeatDays")
        private java.util.List<Long> repeatDays;

        @com.aliyun.core.annotation.NameInMap("RepeatEndTime")
        private String repeatEndTime;

        @com.aliyun.core.annotation.NameInMap("RepeatStartTime")
        private String repeatStartTime;

        @com.aliyun.core.annotation.NameInMap("RepeatType")
        private String repeatType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceGroupCidrs")
        private java.util.List<String> sourceGroupCidrs;

        @com.aliyun.core.annotation.NameInMap("SourceGroupType")
        private String sourceGroupType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SpreadCnt")
        private String spreadCnt;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Policys(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
            this.applicationNameList = builder.applicationNameList;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destPort = builder.destPort;
            this.destPortGroup = builder.destPortGroup;
            this.destPortGroupPorts = builder.destPortGroupPorts;
            this.destPortType = builder.destPortType;
            this.destination = builder.destination;
            this.destinationGroupCidrs = builder.destinationGroupCidrs;
            this.destinationGroupType = builder.destinationGroupType;
            this.destinationType = builder.destinationType;
            this.dnsResult = builder.dnsResult;
            this.dnsResultTime = builder.dnsResultTime;
            this.domainResolveType = builder.domainResolveType;
            this.endTime = builder.endTime;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.modifyTime = builder.modifyTime;
            this.natGatewayId = builder.natGatewayId;
            this.order = builder.order;
            this.proto = builder.proto;
            this.release = builder.release;
            this.repeatDays = builder.repeatDays;
            this.repeatEndTime = builder.repeatEndTime;
            this.repeatStartTime = builder.repeatStartTime;
            this.repeatType = builder.repeatType;
            this.source = builder.source;
            this.sourceGroupCidrs = builder.sourceGroupCidrs;
            this.sourceGroupType = builder.sourceGroupType;
            this.sourceType = builder.sourceType;
            this.spreadCnt = builder.spreadCnt;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policys create() {
            return builder().build();
        }

        /**
         * @return aclAction
         */
        public String getAclAction() {
            return this.aclAction;
        }

        /**
         * @return aclUuid
         */
        public String getAclUuid() {
            return this.aclUuid;
        }

        /**
         * @return applicationNameList
         */
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destPort
         */
        public String getDestPort() {
            return this.destPort;
        }

        /**
         * @return destPortGroup
         */
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        /**
         * @return destPortGroupPorts
         */
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        /**
         * @return destPortType
         */
        public String getDestPortType() {
            return this.destPortType;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationGroupCidrs
         */
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        /**
         * @return destinationGroupType
         */
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return dnsResult
         */
        public String getDnsResult() {
            return this.dnsResult;
        }

        /**
         * @return dnsResultTime
         */
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        /**
         * @return domainResolveType
         */
        public Integer getDomainResolveType() {
            return this.domainResolveType;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hitLastTime
         */
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        /**
         * @return hitTimes
         */
        public Integer getHitTimes() {
            return this.hitTimes;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return release
         */
        public String getRelease() {
            return this.release;
        }

        /**
         * @return repeatDays
         */
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        /**
         * @return repeatEndTime
         */
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        /**
         * @return repeatStartTime
         */
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        /**
         * @return repeatType
         */
        public String getRepeatType() {
            return this.repeatType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceGroupCidrs
         */
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        /**
         * @return sourceGroupType
         */
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return spreadCnt
         */
        public String getSpreadCnt() {
            return this.spreadCnt;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String aclAction; 
            private String aclUuid; 
            private java.util.List<String> applicationNameList; 
            private Long createTime; 
            private String description; 
            private String destPort; 
            private String destPortGroup; 
            private java.util.List<String> destPortGroupPorts; 
            private String destPortType; 
            private String destination; 
            private java.util.List<String> destinationGroupCidrs; 
            private String destinationGroupType; 
            private String destinationType; 
            private String dnsResult; 
            private Long dnsResultTime; 
            private Integer domainResolveType; 
            private Long endTime; 
            private Long hitLastTime; 
            private Integer hitTimes; 
            private Long modifyTime; 
            private String natGatewayId; 
            private Integer order; 
            private String proto; 
            private String release; 
            private java.util.List<Long> repeatDays; 
            private String repeatEndTime; 
            private String repeatStartTime; 
            private String repeatType; 
            private String source; 
            private java.util.List<String> sourceGroupCidrs; 
            private String sourceGroupType; 
            private String sourceType; 
            private String spreadCnt; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Policys model) {
                this.aclAction = model.aclAction;
                this.aclUuid = model.aclUuid;
                this.applicationNameList = model.applicationNameList;
                this.createTime = model.createTime;
                this.description = model.description;
                this.destPort = model.destPort;
                this.destPortGroup = model.destPortGroup;
                this.destPortGroupPorts = model.destPortGroupPorts;
                this.destPortType = model.destPortType;
                this.destination = model.destination;
                this.destinationGroupCidrs = model.destinationGroupCidrs;
                this.destinationGroupType = model.destinationGroupType;
                this.destinationType = model.destinationType;
                this.dnsResult = model.dnsResult;
                this.dnsResultTime = model.dnsResultTime;
                this.domainResolveType = model.domainResolveType;
                this.endTime = model.endTime;
                this.hitLastTime = model.hitLastTime;
                this.hitTimes = model.hitTimes;
                this.modifyTime = model.modifyTime;
                this.natGatewayId = model.natGatewayId;
                this.order = model.order;
                this.proto = model.proto;
                this.release = model.release;
                this.repeatDays = model.repeatDays;
                this.repeatEndTime = model.repeatEndTime;
                this.repeatStartTime = model.repeatStartTime;
                this.repeatType = model.repeatType;
                this.source = model.source;
                this.sourceGroupCidrs = model.sourceGroupCidrs;
                this.sourceGroupType = model.sourceGroupType;
                this.sourceType = model.sourceType;
                this.spreadCnt = model.spreadCnt;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: allows the traffic.</li>
             * <li><strong>drop</strong>: denies the traffic.</li>
             * <li><strong>log</strong>: monitors the traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * <p>The UUID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * <p>The application names.</p>
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * <p>The time when the access control policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1761062400</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination port in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * <p>The name of the destination port address book in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>my_port_group</p>
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * <p>The ports in the destination port address book.</p>
             */
            public Builder destPortGroupPorts(java.util.List<String> destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * <p>The type of the destination port in the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>port</strong>: port</li>
             * <li><strong>group</strong>: port address book</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>port</p>
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
                return this;
            }

            /**
             * <p>The destination address in the access control policy. The value of this parameter varies based on the value of DestinationType. Valid values:</p>
             * <ul>
             * <li>If the value of <strong>DestinationType</strong> is <strong>net</strong>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</li>
             * <li>If the value of <strong>DestinationType</strong> is <strong>domain</strong>, the value of this parameter is a domain name. Example: aliyuncs.com.</li>
             * <li>If the value of <strong>DestinationType</strong> is <strong>group</strong>, the value of this parameter is the name of an address book. Example: db_group.</li>
             * <li>If the value of <strong>DestinationType</strong> is <strong>location</strong>, the value of this parameter is a location. For more information about location codes, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x.x.x.x/32</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>The CIDR blocks in the destination address book.</p>
             */
            public Builder destinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
                return this;
            }

            /**
             * <p>The type of the destination address book in the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong>: an address book that includes one or more CIDR blocks</li>
             * <li><strong>domain</strong>: an address book that includes one or more domain names</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * <p>The type of the destination address in the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>net</strong>: CIDR block</li>
             * <li><strong>group</strong>: address book</li>
             * <li><strong>domain</strong>: domain name</li>
             * <li><strong>location</strong>: location</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The DNS resolution result.</p>
             * 
             * <strong>example:</strong>
             * <p>111.0.XX.XX,112.0.XX.XX</p>
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * <p>The time when the Domain Name System (DNS) resolution was performed. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * <p>The domain name resolution method of the access control policy. By default, an access control policy is enabled after the policy is created. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: fully qualified domain name (FQDN)-based resolution</li>
             * <li><strong>1</strong>: DNS-based dynamic resolution</li>
             * <li><strong>2</strong>: FQDN and DNS-based dynamic resolution</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder domainResolveType(Integer domainResolveType) {
                this.domainResolveType = domainResolveType;
                return this;
            }

            /**
             * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
             * <blockquote>
             * <p> If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1694764800</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * <p>The number of hits for the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder hitTimes(Integer hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * <p>The time when the access control policy was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1761062400</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-xxxxxx</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The priority of the access control policy.</p>
             * <p>The priority value starts from 1. A smaller priority value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The protocol type in the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>ANY</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>ICMP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The status of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * <p>The days of a week or of a month on which the access control policy takes effect.</p>
             * <ul>
             * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, the value of this parameter is an empty array. Example: [].</li>
             * <li>If RepeatType is set to Weekly, this parameter must be specified. Example: [0, 6].</li>
             * </ul>
             * <blockquote>
             * <p> If RepeatType is set to Weekly, the fields in the value of this parameter cannot be repeated.</p>
             * </blockquote>
             * <ul>
             * <li>If RepeatType is set to <code>Monthly</code>, this parameter must be specified. Example: [1, 31].</li>
             * </ul>
             * <blockquote>
             * <p> If RepeatType is set to Monthly, the fields in the value of this parameter cannot be repeated.</p>
             * </blockquote>
             */
            public Builder repeatDays(java.util.List<Long> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The point in time when the recurrence ends. Example: 23:30. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
             * <blockquote>
             * <p> If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>23:30</p>
             */
            public Builder repeatEndTime(String repeatEndTime) {
                this.repeatEndTime = repeatEndTime;
                return this;
            }

            /**
             * <p>The point in time when the recurrence starts. Example: 08:00. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
             * <blockquote>
             * <p> If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder repeatStartTime(String repeatStartTime) {
                this.repeatStartTime = repeatStartTime;
                return this;
            }

            /**
             * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
             * <ul>
             * <li><strong>Permanent</strong> (default): The policy always takes effect.</li>
             * <li><strong>None</strong>: The policy takes effect for only once.</li>
             * <li><strong>Daily</strong>: The policy takes effect on a daily basis.</li>
             * <li><strong>Weekly</strong>: The policy takes effect on a weekly basis.</li>
             * <li><strong>Monthly</strong>: The policy takes effect on a monthly basis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Permanent</p>
             */
            public Builder repeatType(String repeatType) {
                this.repeatType = repeatType;
                return this;
            }

            /**
             * <p>The source address in the access control policy. Valid values:</p>
             * <ul>
             * <li>If the value of <strong>SourceType</strong> is <code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</li>
             * <li>If the value of <strong>SourceType</strong> is <code>group</code>, the value of this parameter is the name of an address book. Example: db_group.</li>
             * <li>If the value of <strong>SourceType</strong> is <code>location</code>, the value of this parameter is a location. For more information about location codes, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX/24</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The CIDR blocks in the source address book.</p>
             */
            public Builder sourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * <p>The type of the source address book in the access control policy. The value is fixed as <strong>ip</strong>. The value indicates an address book that includes one or more CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * <p>The type of the source address in the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>net</strong>: CIDR block</li>
             * <li><strong>group</strong>: address book</li>
             * <li><strong>location</strong>: location</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy. The quota that is consumed by an access control policy is calculated by using the following formula: Quota that is consumed by an access control policy = Number of source addresses (number of CIDR blocks or regions) × Number of destination addresses (number of CIDR blocks, regions, or domain names) × Number of port ranges × Number of applications.</p>
             * 
             * <strong>example:</strong>
             * <p>10,000</p>
             */
            public Builder spreadCnt(String spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
             * <blockquote>
             * <p> If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1694761200</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Policys build() {
                return new Policys(this);
            } 

        } 

    }
}

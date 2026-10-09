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
         * <p>The information about the access control policies for the NAT firewall.</p>
         */
        public Builder policys(java.util.List<Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F283567D-8A52-5BAE-9472-*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
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
        private Long hitTimes;

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
        public Long getHitTimes() {
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
            private Long hitTimes; 
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
             * <li><p><strong>accept</strong>: Allow</p>
             * </li>
             * <li><p><strong>drop</strong>: Deny</p>
             * </li>
             * <li><p><strong>log</strong>: Monitor</p>
             * </li>
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
             * <p>The unique ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>01281255-d220-4db1-8f4f-c4df221a****</p>
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * <p>The application names. Multiple applications are supported.</p>
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * <p>The time when the policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
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
             * <p>test-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination port for the traffic in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * <p>The name of the destination port address book for the traffic in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>my_port_group</p>
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * <p>The list of ports in the destination port address book.</p>
             */
            public Builder destPortGroupPorts(java.util.List<String> destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * <p>The destination port type for the traffic in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>port</strong>: port</p>
             * </li>
             * <li><p><strong>group</strong>: port address book</p>
             * </li>
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
             * <p>The destination address in the access control policy. The value of this parameter varies based on the value of the DestinationType parameter. Valid values:</p>
             * <ul>
             * <li><p>If <strong>DestinationType</strong> is <strong>net</strong>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
             * </li>
             * <li><p>If <strong>DestinationType</strong> is <strong>domain</strong>, the value of this parameter is a domain name. Example: aliyuncs.com.</p>
             * </li>
             * <li><p>If <strong>DestinationType</strong> is <strong>group</strong>, the value of this parameter is the name of an address book. Example: db_group.</p>
             * </li>
             * <li><p>If <strong>DestinationType</strong> is <strong>location</strong>, the value of this parameter is a region name. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
             * </li>
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
             * <p>The list of CIDR blocks in the destination address book of the access control policy.</p>
             */
            public Builder destinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
                return this;
            }

            /**
             * <p>The type of the destination address book in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ip</strong>: an IP address book that contains one or more IP address CIDR blocks.</p>
             * </li>
             * <li><p><strong>domain</strong>: a domain name address book that contains one or more domain names.</p>
             * </li>
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
             * <p>The destination address type in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>net</strong>: destination CIDR block</p>
             * </li>
             * <li><p><strong>group</strong>: destination address book</p>
             * </li>
             * <li><p><strong>domain</strong>: destination domain name</p>
             * </li>
             * <li><p><strong>location</strong>: destination region</p>
             * </li>
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
             * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * <p>The domain name resolution method of the access control policy. By default, this feature is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: FQDN-based</p>
             * </li>
             * <li><p><strong>1</strong>: DNS-based dynamic resolution</p>
             * </li>
             * <li><p><strong>2</strong>: FQDN- and DNS-based dynamic resolution</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder domainResolveType(Integer domainResolveType) {
                this.domainResolveType = domainResolveType;
                return this;
            }

            /**
             * <p>The end time of the policy validity period. The value is a UNIX timestamp. Unit: seconds. The time must be on the hour or half hour, and at least 30 minutes later than the start time.</p>
             * <blockquote>
             * <p>If RepeatType is set to Permanent, this parameter is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must set this parameter.</p>
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
             * <p>The timestamp of the last hit. The value is a UNIX timestamp. Unit: seconds.</p>
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
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * <p>The time when the policy was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761062400</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the NAT Gateway.</p>
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
             * <p>The priority starts from 1. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ANY</strong></p>
             * </li>
             * <li><p><strong>TCP</strong></p>
             * </li>
             * <li><p><strong>UDP</strong></p>
             * </li>
             * <li><p><strong>ICMP</strong></p>
             * </li>
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
             * <li><p><strong>true</strong>: enabled</p>
             * </li>
             * <li><p><strong>false</strong>: disabled</p>
             * </li>
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
             * <p>The days of the week or month for the policy to repeat.</p>
             * <ul>
             * <li><p>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, this parameter is an empty set.
             * Example: []</p>
             * </li>
             * <li><p>If RepeatType is set to Weekly, this parameter cannot be empty.
             * Example: [0, 6]</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If RepeatType is set to Weekly, the days in RepeatDays cannot be repeated.</p>
             * </blockquote>
             * <ul>
             * <li>If RepeatType is set to <code>Monthly</code>, this parameter cannot be empty.
             * Example: [1, 31]</li>
             * </ul>
             * <blockquote>
             * <p>If RepeatType is set to Monthly, the days in RepeatDays cannot be repeated.</p>
             * </blockquote>
             */
            public Builder repeatDays(java.util.List<Long> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The end time of the recurrence. The time is in the HH:mm format, based on a 24-hour clock. Example: 23:00.</p>
             * <blockquote>
             * <p>If RepeatType is set to Permanent or None, this parameter is empty. If RepeatType is set to Daily, Weekly, or Monthly, you must set this parameter.
             * The time is in the HH:mm format, based on a 24-hour clock. Examples: 08:00 and 23:30.</p>
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
             * <p>The start time of the recurrence. The time is in the HH:mm format, based on a 24-hour clock. Example: 08:00.</p>
             * <blockquote>
             * <p>If RepeatType is set to Permanent or None, this parameter is empty. If RepeatType is set to Daily, Weekly, or Monthly, you must set this parameter.
             * The time is in the HH:mm format, based on a 24-hour clock. Examples: 08:00 and 23:30.</p>
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
             * <p>The recurrence type for the policy validity period. Valid values:</p>
             * <ul>
             * <li><p><strong>Permanent</strong> (default): always</p>
             * </li>
             * <li><p><strong>None</strong>: one-time</p>
             * </li>
             * <li><p><strong>Daily</strong>: daily</p>
             * </li>
             * <li><p><strong>Weekly</strong>: weekly</p>
             * </li>
             * <li><p><strong>Monthly</strong>: monthly</p>
             * </li>
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
             * <li><p>If <strong>SourceType</strong> is <code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is <code>group</code>, the value of this parameter is the name of a source address book. Example: db_group.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is <code>location</code>, the value of this parameter is a region. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
             * </li>
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
             * <p>The list of CIDR blocks in the source address book of the access control policy.</p>
             */
            public Builder sourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * <p>The type of the source address book in the access control policy. The value is fixed at <strong>ip</strong>. This indicates an IP address book that contains one or more IP address CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * <p>The source address type in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>net</strong>: CIDR block</p>
             * </li>
             * <li><p><strong>group</strong>: source address book</p>
             * </li>
             * <li><p><strong>location</strong>: source region</p>
             * </li>
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
             * <p>The number of policy specifications that are occupied. This is the cumulative value of the number of specifications occupied by each policy.
             * The number of specifications occupied by a single policy = Number of source CIDR blocks × Number of destination addresses (IP address CIDR blocks, regions, or domain names) × Number of applications × Number of port ranges.</p>
             * 
             * <strong>example:</strong>
             * <p>10,000</p>
             */
            public Builder spreadCnt(String spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * <p>The start time of the policy validity period. The value is a UNIX timestamp. Unit: seconds. The time must be on the hour or half hour, and at least 30 minutes earlier than the end time.</p>
             * <blockquote>
             * <p>If RepeatType is set to Permanent, this parameter is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must set this parameter.</p>
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

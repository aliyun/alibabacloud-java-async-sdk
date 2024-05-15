// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallControlPolicyResponseBody</p>
 */
public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policys")
    private java.util.List < Policys> policys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeVpcFirewallControlPolicyResponseBody(Builder builder) {
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policys
     */
    public java.util.List < Policys> getPolicys() {
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
        private java.util.List < Policys> policys; 
        private String requestId; 
        private String totalCount; 

        /**
         * The access control policies.
         */
        public Builder policys(java.util.List < Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of access control policies returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallControlPolicyResponseBody build() {
            return new DescribeVpcFirewallControlPolicyResponseBody(this);
        } 

    } 

    public static class Policys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclAction")
        private String aclAction;

        @com.aliyun.core.annotation.NameInMap("AclUuid")
        private String aclUuid;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
        private java.util.List < String > applicationNameList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestPort")
        private String destPort;

        @com.aliyun.core.annotation.NameInMap("DestPortGroup")
        private String destPortGroup;

        @com.aliyun.core.annotation.NameInMap("DestPortGroupPorts")
        private java.util.List < String > destPortGroupPorts;

        @com.aliyun.core.annotation.NameInMap("DestPortType")
        private String destPortType;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationGroupCidrs")
        private java.util.List < String > destinationGroupCidrs;

        @com.aliyun.core.annotation.NameInMap("DestinationGroupType")
        private String destinationGroupType;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HitLastTime")
        private Long hitLastTime;

        @com.aliyun.core.annotation.NameInMap("HitTimes")
        private Long hitTimes;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("Release")
        private String release;

        @com.aliyun.core.annotation.NameInMap("RepeatDays")
        private java.util.List < Long > repeatDays;

        @com.aliyun.core.annotation.NameInMap("RepeatEndTime")
        private String repeatEndTime;

        @com.aliyun.core.annotation.NameInMap("RepeatStartTime")
        private String repeatStartTime;

        @com.aliyun.core.annotation.NameInMap("RepeatType")
        private String repeatType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceGroupCidrs")
        private java.util.List < String > sourceGroupCidrs;

        @com.aliyun.core.annotation.NameInMap("SourceGroupType")
        private String sourceGroupType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SpreadCnt")
        private Long spreadCnt;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Policys(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
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
            this.endTime = builder.endTime;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.memberUid = builder.memberUid;
            this.modifyTime = builder.modifyTime;
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
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationNameList
         */
        public java.util.List < String > getApplicationNameList() {
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
        public java.util.List < String > getDestPortGroupPorts() {
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
        public java.util.List < String > getDestinationGroupCidrs() {
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
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
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
        public java.util.List < Long > getRepeatDays() {
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
        public java.util.List < String > getSourceGroupCidrs() {
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
        public Long getSpreadCnt() {
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
            private String applicationId; 
            private String applicationName; 
            private java.util.List < String > applicationNameList; 
            private Long createTime; 
            private String description; 
            private String destPort; 
            private String destPortGroup; 
            private java.util.List < String > destPortGroupPorts; 
            private String destPortType; 
            private String destination; 
            private java.util.List < String > destinationGroupCidrs; 
            private String destinationGroupType; 
            private String destinationType; 
            private Long endTime; 
            private Long hitLastTime; 
            private Long hitTimes; 
            private String memberUid; 
            private Long modifyTime; 
            private Integer order; 
            private String proto; 
            private String release; 
            private java.util.List < Long > repeatDays; 
            private String repeatEndTime; 
            private String repeatStartTime; 
            private String repeatType; 
            private String source; 
            private java.util.List < String > sourceGroupCidrs; 
            private String sourceGroupType; 
            private String sourceType; 
            private Long spreadCnt; 
            private Long startTime; 

            /**
             * The action that Cloud Firewall performs on the traffic. Valid values:
             * <p>
             * 
             * *   **accept**: allows the traffic.
             * *   **drop**: denies the traffic.
             * *   **log**: monitors the traffic.
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * The UUID of the access control policy.
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * The application ID in the access control policy.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The application types supported by the access control policy. We recommend that you specify ApplicationNameList. Valid values:
             * <p>
             * 
             * *   **HTTP**
             * *   **HTTPS**
             * *   **MySQL**
             * *   **SMTP**
             * *   **SMTPS**
             * *   **RDP**
             * *   **VNC**
             * *   **SSH**
             * *   **Redis**
             * *   **MQTT**
             * *   **MongoDB**
             * *   **Memcache**
             * *   **SSL**
             * *   **ANY**: all application types
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The application types supported by the access control policy.
             */
            public Builder applicationNameList(java.util.List < String > applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * The time when the access control policy was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the access control policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination port in the access control policy.
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * The name of the destination port address book in the access control policy.
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * The ports in the destination port address book of the access control policy.
             */
            public Builder destPortGroupPorts(java.util.List < String > destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * The type of the destination port in the access control policy. Valid values:
             * <p>
             * 
             * *   **port**: port
             * *   **group**: port address book
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
                return this;
            }

            /**
             * The destination address in the access control policy. Valid values:
             * <p>
             * 
             * *   If **DestinationType** is set to `net`, the value of this parameter is a CIDR block.
             * *   If **DestinationType** is set to `domain`, the value of this parameter is a domain name.
             * *   If **DestinationType** is set to `group`, the value of this parameter is an address book name.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * The CIDR blocks in the destination address book of the access control policy.
             */
            public Builder destinationGroupCidrs(java.util.List < String > destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
                return this;
            }

            /**
             * The type of the destination address book in the access control policy. Valid values:
             * <p>
             * 
             * *   **ip**: an address book that includes one or more CIDR blocks
             * *   **domain**: an address book that includes one or more domain names
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * The type of the destination address in the access control policy. Valid values:
             * <p>
             * 
             * *   **net**: CIDR block
             * *   **group**: address book
             * *   **domain**: domain name
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of StartTime.
             * <p>
             * 
             * >  If RepeatType is set to Permanent, EndTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must be specified.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * The number of hits for the access control policy.
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * The UID of the member that is managed by your Alibaba Cloud account.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The time when the access control policy was modified. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The priority of the access control policy.
             * <p>
             * 
             * The priority value starts from 1. A smaller priority value indicates a higher priority.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The protocol type in the access control policy. Valid values:
             * <p>
             * 
             * *   **TCP**
             * *   **UDP**
             * *   **ICMP**
             * *   **ANY**: all protocol types
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * The days of a week or of a month on which the access control policy takes effect.
             * <p>
             * 
             * *   If RepeatType is set to `Permanent`, `None`, or `Daily`, RepeatDays is left empty. Example: \[].
             * *   If RepeatType is set to Weekly, RepeatDays must be specified. Example: \[0, 6].
             * 
             * >  If RepeatType is set to Weekly, the fields in the value of RepeatDays cannot be repeated.
             * 
             * *   If RepeatType is set to `Monthly`, RepeatDays must be specified. Example: \[1, 31].
             * 
             * >  If RepeatType is set to Monthly, the fields in the value of RepeatDays cannot be repeated.
             */
            public Builder repeatDays(java.util.List < Long > repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of RepeatStartTime.
             * <p>
             * 
             * >  If RepeatType is set to Permanent or None, RepeatEndTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must be specified.
             */
            public Builder repeatEndTime(String repeatEndTime) {
                this.repeatEndTime = repeatEndTime;
                return this;
            }

            /**
             * The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of RepeatEndTime.
             * <p>
             * 
             * >  If RepeatType is set to Permanent or None, RepeatStartTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.
             */
            public Builder repeatStartTime(String repeatStartTime) {
                this.repeatStartTime = repeatStartTime;
                return this;
            }

            /**
             * The recurrence type for the access control policy to take effect. Valid values:
             * <p>
             * 
             * *   **Permanent** (default): The policy always takes effect.
             * *   **None**: The policy takes effect for only once.
             * *   **Daily**: The policy takes effect on a daily basis.
             * *   **Weekly**: The policy takes effect on a weekly basis.
             * *   **Monthly**: The policy takes effect on a monthly basis.
             */
            public Builder repeatType(String repeatType) {
                this.repeatType = repeatType;
                return this;
            }

            /**
             * The source address in the access control policy. Valid values:
             * <p>
             * 
             * *   If **SourceType** is set to `net`, the value of this parameter is a CIDR block.
             * *   If **SourceType** is set to `group`, the value of this parameter is an address book name.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The CIDR blocks in the source address book of the access control policy.
             */
            public Builder sourceGroupCidrs(java.util.List < String > sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * The type of the source address book in the access control policy. The value is fixed as **ip**. The value indicates an address book that includes one or more CIDR blocks.
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * The type of the source address in the access control policy. Valid values:
             * <p>
             * 
             * *   **net**: CIDR block
             * *   **group**: address book
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy. The quota that is consumed by an access control policy is calculated by using the following formula: Quota that is consumed by an access control policy = Number of source addresses × Number of destination addresses (number of CIDR blocks or domain names) × Number of applications × Number of port ranges.
             */
            public Builder spreadCnt(Long spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of EndTime.
             * <p>
             * 
             * >  If RepeatType is set to Permanent, StartTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must be specified.
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

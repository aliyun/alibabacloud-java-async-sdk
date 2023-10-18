// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallControlPolicyResponseBody</p>
 */
public class DescribeVpcFirewallControlPolicyResponseBody extends TeaModel {
    @NameInMap("Policys")
    private java.util.List < Policys> policys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The information about the access control policies.
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
        @NameInMap("AclAction")
        private String aclAction;

        @NameInMap("AclUuid")
        private String aclUuid;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ApplicationNameList")
        private java.util.List < String > applicationNameList;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestPort")
        private String destPort;

        @NameInMap("DestPortGroup")
        private String destPortGroup;

        @NameInMap("DestPortGroupPorts")
        private java.util.List < String > destPortGroupPorts;

        @NameInMap("DestPortType")
        private String destPortType;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationGroupCidrs")
        private java.util.List < String > destinationGroupCidrs;

        @NameInMap("DestinationGroupType")
        private String destinationGroupType;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HitLastTime")
        private Long hitLastTime;

        @NameInMap("HitTimes")
        private Long hitTimes;

        @NameInMap("MemberUid")
        private String memberUid;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("Release")
        private String release;

        @NameInMap("RepeatDays")
        private java.util.List < Long > repeatDays;

        @NameInMap("RepeatEndTime")
        private String repeatEndTime;

        @NameInMap("RepeatStartTime")
        private String repeatStartTime;

        @NameInMap("RepeatType")
        private String repeatType;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceGroupCidrs")
        private java.util.List < String > sourceGroupCidrs;

        @NameInMap("SourceGroupType")
        private String sourceGroupType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SpreadCnt")
        private Long spreadCnt;

        @NameInMap("StartTime")
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
             * *   **drop**: blocks the traffic.
             * *   **log**: monitors the traffic.
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * The unique ID of the access control policy.
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
             * The application type in the access control policy. Valid values:
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
             * ApplicationNameList.
             */
            public Builder applicationNameList(java.util.List < String > applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * CreateTime.
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
             * An array that consists of the ports in the destination port address book of the access control policy.
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
             * An array that consists of the CIDR blocks in the destination address book of the access control policy.
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HitLastTime.
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
             * ModifyTime.
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
             * Indicates whether the access control policy is enabled. By default, an access control policy is enabled after the policy is created. Valid values:
             * <p>
             * 
             * *   **true**: The access control policy is enabled.
             * *   **false**: The access control policy is disabled.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * RepeatDays.
             */
            public Builder repeatDays(java.util.List < Long > repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * RepeatEndTime.
             */
            public Builder repeatEndTime(String repeatEndTime) {
                this.repeatEndTime = repeatEndTime;
                return this;
            }

            /**
             * RepeatStartTime.
             */
            public Builder repeatStartTime(String repeatStartTime) {
                this.repeatStartTime = repeatStartTime;
                return this;
            }

            /**
             * RepeatType.
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
             * An array that consists of the CIDR blocks in the source address book of the access control policy.
             */
            public Builder sourceGroupCidrs(java.util.List < String > sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * The type of the source address in the access control policy. The value is fixed as **ip**. The value indicates an address book that includes one or more CIDR blocks.
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
             * SpreadCnt.
             */
            public Builder spreadCnt(Long spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * StartTime.
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

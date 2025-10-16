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
 * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclCheckResponseBody</p>
 */
public class DescribeAclCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckRecord")
    private CheckRecord checkRecord;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAclCheckResponseBody(Builder builder) {
        this.checkRecord = builder.checkRecord;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRecord
     */
    public CheckRecord getCheckRecord() {
        return this.checkRecord;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckRecord checkRecord; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAclCheckResponseBody model) {
            this.checkRecord = model.checkRecord;
            this.requestId = model.requestId;
        } 

        /**
         * CheckRecord.
         */
        public Builder checkRecord(CheckRecord checkRecord) {
            this.checkRecord = checkRecord;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAclCheckResponseBody build() {
            return new DescribeAclCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckResponseBody</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        private Addresses(Builder builder) {
            this.address = builder.address;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String address; 
            private String note; 

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.address = model.address;
                this.note = model.note;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckResponseBody</p>
     */
    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclAction")
        private String aclAction;

        @com.aliyun.core.annotation.NameInMap("AclUuid")
        private String aclUuid;

        @com.aliyun.core.annotation.NameInMap("AddressList")
        private java.util.List<String> addressList;

        @com.aliyun.core.annotation.NameInMap("AddressListCount")
        private Integer addressListCount;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<Addresses> addresses;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
        private java.util.List<String> applicationNameList;

        @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
        private Integer autoAddTagEcs;

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

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DnsResult")
        private String dnsResult;

        @com.aliyun.core.annotation.NameInMap("DnsResultTime")
        private Long dnsResultTime;

        @com.aliyun.core.annotation.NameInMap("DomainResolveType")
        private Integer domainResolveType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUuid")
        private String groupUuid;

        @com.aliyun.core.annotation.NameInMap("HitLastTime")
        private Long hitLastTime;

        @com.aliyun.core.annotation.NameInMap("HitTimes")
        private Long hitTimes;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

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
        private Integer spreadCnt;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TagRelation")
        private String tagRelation;

        @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
        private String vpcFirewallId;

        private Acl(Builder builder) {
            this.aclAction = builder.aclAction;
            this.aclUuid = builder.aclUuid;
            this.addressList = builder.addressList;
            this.addressListCount = builder.addressListCount;
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.applicationNameList = builder.applicationNameList;
            this.autoAddTagEcs = builder.autoAddTagEcs;
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
            this.direction = builder.direction;
            this.dnsResult = builder.dnsResult;
            this.dnsResultTime = builder.dnsResultTime;
            this.domainResolveType = builder.domainResolveType;
            this.endTime = builder.endTime;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUuid = builder.groupUuid;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.ipVersion = builder.ipVersion;
            this.modifyTime = builder.modifyTime;
            this.natGatewayId = builder.natGatewayId;
            this.order = builder.order;
            this.proto = builder.proto;
            this.referenceCount = builder.referenceCount;
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
            this.tagList = builder.tagList;
            this.tagRelation = builder.tagRelation;
            this.vpcFirewallId = builder.vpcFirewallId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acl create() {
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
         * @return addressList
         */
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        /**
         * @return addressListCount
         */
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        /**
         * @return addresses
         */
        public java.util.List<Addresses> getAddresses() {
            return this.addresses;
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
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        /**
         * @return autoAddTagEcs
         */
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
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
         * @return direction
         */
        public String getDirection() {
            return this.direction;
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
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return groupUuid
         */
        public String getGroupUuid() {
            return this.groupUuid;
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
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
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
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
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
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return tagRelation
         */
        public String getTagRelation() {
            return this.tagRelation;
        }

        /**
         * @return vpcFirewallId
         */
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public static final class Builder {
            private String aclAction; 
            private String aclUuid; 
            private java.util.List<String> addressList; 
            private Integer addressListCount; 
            private java.util.List<Addresses> addresses; 
            private String applicationId; 
            private String applicationName; 
            private java.util.List<String> applicationNameList; 
            private Integer autoAddTagEcs; 
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
            private String direction; 
            private String dnsResult; 
            private Long dnsResultTime; 
            private Integer domainResolveType; 
            private Long endTime; 
            private String groupName; 
            private String groupType; 
            private String groupUuid; 
            private Long hitLastTime; 
            private Long hitTimes; 
            private Integer ipVersion; 
            private Long modifyTime; 
            private String natGatewayId; 
            private Integer order; 
            private String proto; 
            private Integer referenceCount; 
            private String release; 
            private java.util.List<Long> repeatDays; 
            private String repeatEndTime; 
            private String repeatStartTime; 
            private String repeatType; 
            private String source; 
            private java.util.List<String> sourceGroupCidrs; 
            private String sourceGroupType; 
            private String sourceType; 
            private Integer spreadCnt; 
            private Long startTime; 
            private java.util.List<TagList> tagList; 
            private String tagRelation; 
            private String vpcFirewallId; 

            private Builder() {
            } 

            private Builder(Acl model) {
                this.aclAction = model.aclAction;
                this.aclUuid = model.aclUuid;
                this.addressList = model.addressList;
                this.addressListCount = model.addressListCount;
                this.addresses = model.addresses;
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
                this.applicationNameList = model.applicationNameList;
                this.autoAddTagEcs = model.autoAddTagEcs;
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
                this.direction = model.direction;
                this.dnsResult = model.dnsResult;
                this.dnsResultTime = model.dnsResultTime;
                this.domainResolveType = model.domainResolveType;
                this.endTime = model.endTime;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.groupUuid = model.groupUuid;
                this.hitLastTime = model.hitLastTime;
                this.hitTimes = model.hitTimes;
                this.ipVersion = model.ipVersion;
                this.modifyTime = model.modifyTime;
                this.natGatewayId = model.natGatewayId;
                this.order = model.order;
                this.proto = model.proto;
                this.referenceCount = model.referenceCount;
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
                this.tagList = model.tagList;
                this.tagRelation = model.tagRelation;
                this.vpcFirewallId = model.vpcFirewallId;
            } 

            /**
             * AclAction.
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * AclUuid.
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * AddressList.
             */
            public Builder addressList(java.util.List<String> addressList) {
                this.addressList = addressList;
                return this;
            }

            /**
             * AddressListCount.
             */
            public Builder addressListCount(Integer addressListCount) {
                this.addressListCount = addressListCount;
                return this;
            }

            /**
             * Addresses.
             */
            public Builder addresses(java.util.List<Addresses> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * ApplicationNameList.
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * AutoAddTagEcs.
             */
            public Builder autoAddTagEcs(Integer autoAddTagEcs) {
                this.autoAddTagEcs = autoAddTagEcs;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestPort.
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * DestPortGroup.
             */
            public Builder destPortGroup(String destPortGroup) {
                this.destPortGroup = destPortGroup;
                return this;
            }

            /**
             * DestPortGroupPorts.
             */
            public Builder destPortGroupPorts(java.util.List<String> destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * DestPortType.
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationGroupCidrs.
             */
            public Builder destinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
                this.destinationGroupCidrs = destinationGroupCidrs;
                return this;
            }

            /**
             * DestinationGroupType.
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * DnsResult.
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * DnsResultTime.
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * DomainResolveType.
             */
            public Builder domainResolveType(Integer domainResolveType) {
                this.domainResolveType = domainResolveType;
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
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * GroupUuid.
             */
            public Builder groupUuid(String groupUuid) {
                this.groupUuid = groupUuid;
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
             * HitTimes.
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
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
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Proto.
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * ReferenceCount.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * Release.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * RepeatDays.
             */
            public Builder repeatDays(java.util.List<Long> repeatDays) {
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceGroupCidrs.
             */
            public Builder sourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
                this.sourceGroupCidrs = sourceGroupCidrs;
                return this;
            }

            /**
             * SourceGroupType.
             */
            public Builder sourceGroupType(String sourceGroupType) {
                this.sourceGroupType = sourceGroupType;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SpreadCnt.
             */
            public Builder spreadCnt(Integer spreadCnt) {
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

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TagRelation.
             */
            public Builder tagRelation(String tagRelation) {
                this.tagRelation = tagRelation;
                return this;
            }

            /**
             * VpcFirewallId.
             */
            public Builder vpcFirewallId(String vpcFirewallId) {
                this.vpcFirewallId = vpcFirewallId;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckResponseBody</p>
     */
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acl")
        private Acl acl;

        @com.aliyun.core.annotation.NameInMap("AclAssessmentDetail")
        private String aclAssessmentDetail;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        private Acls(Builder builder) {
            this.acl = builder.acl;
            this.aclAssessmentDetail = builder.aclAssessmentDetail;
            this.aclStatus = builder.aclStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acls create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public Acl getAcl() {
            return this.acl;
        }

        /**
         * @return aclAssessmentDetail
         */
        public String getAclAssessmentDetail() {
            return this.aclAssessmentDetail;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        public static final class Builder {
            private Acl acl; 
            private String aclAssessmentDetail; 
            private String aclStatus; 

            private Builder() {
            } 

            private Builder(Acls model) {
                this.acl = model.acl;
                this.aclAssessmentDetail = model.aclAssessmentDetail;
                this.aclStatus = model.aclStatus;
            } 

            /**
             * Acl.
             */
            public Builder acl(Acl acl) {
                this.acl = acl;
                return this;
            }

            /**
             * AclAssessmentDetail.
             */
            public Builder aclAssessmentDetail(String aclAssessmentDetail) {
                this.aclAssessmentDetail = aclAssessmentDetail;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAclCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckResponseBody</p>
     */
    public static class CheckRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclTotalCount")
        private Long aclTotalCount;

        @com.aliyun.core.annotation.NameInMap("Acls")
        private java.util.List<Acls> acls;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private String lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("RecordAssessmentDetail")
        private String recordAssessmentDetail;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private CheckRecord(Builder builder) {
            this.aclTotalCount = builder.aclTotalCount;
            this.acls = builder.acls;
            this.checkName = builder.checkName;
            this.description = builder.description;
            this.lastCheckTime = builder.lastCheckTime;
            this.level = builder.level;
            this.recordAssessmentDetail = builder.recordAssessmentDetail;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRecord create() {
            return builder().build();
        }

        /**
         * @return aclTotalCount
         */
        public Long getAclTotalCount() {
            return this.aclTotalCount;
        }

        /**
         * @return acls
         */
        public java.util.List<Acls> getAcls() {
            return this.acls;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastCheckTime
         */
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return recordAssessmentDetail
         */
        public String getRecordAssessmentDetail() {
            return this.recordAssessmentDetail;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long aclTotalCount; 
            private java.util.List<Acls> acls; 
            private String checkName; 
            private String description; 
            private String lastCheckTime; 
            private String level; 
            private String recordAssessmentDetail; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(CheckRecord model) {
                this.aclTotalCount = model.aclTotalCount;
                this.acls = model.acls;
                this.checkName = model.checkName;
                this.description = model.description;
                this.lastCheckTime = model.lastCheckTime;
                this.level = model.level;
                this.recordAssessmentDetail = model.recordAssessmentDetail;
                this.taskId = model.taskId;
            } 

            /**
             * AclTotalCount.
             */
            public Builder aclTotalCount(Long aclTotalCount) {
                this.aclTotalCount = aclTotalCount;
                return this;
            }

            /**
             * Acls.
             */
            public Builder acls(java.util.List<Acls> acls) {
                this.acls = acls;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LastCheckTime.
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * RecordAssessmentDetail.
             */
            public Builder recordAssessmentDetail(String recordAssessmentDetail) {
                this.recordAssessmentDetail = recordAssessmentDetail;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public CheckRecord build() {
                return new CheckRecord(this);
            } 

        } 

    }
}

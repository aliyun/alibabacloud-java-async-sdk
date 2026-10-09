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
         * <p>The check record.</p>
         */
        public Builder checkRecord(CheckRecord checkRecord) {
            this.checkRecord = checkRecord;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25E655B0-CAED-53D4-8054-F983126****</p>
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
             * <p>The address in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX/32</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Reviewed</p>
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
             * <p>The key of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ss</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>tfTestAcc0</p>
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
             * <p>The action performed on traffic that matches the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>accept</strong>: allow</p>
             * </li>
             * <li><p><strong>drop</strong>: deny</p>
             * </li>
             * <li><p><strong>log</strong>: monitor</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>log</p>
             */
            public Builder aclAction(String aclAction) {
                this.aclAction = aclAction;
                return this;
            }

            /**
             * <p>The unique ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>997b38e0-01fa-4db7-8d30-02ebf6fdb747</p>
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * <p>The addresses in the address book.</p>
             */
            public Builder addressList(java.util.List<String> addressList) {
                this.addressList = addressList;
                return this;
            }

            /**
             * <p>The number of addresses in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder addressListCount(Integer addressListCount) {
                this.addressListCount = addressListCount;
                return this;
            }

            /**
             * <p>The addresses and their remarks.</p>
             */
            public Builder addresses(java.util.List<Addresses> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The ID of the application that is used in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>plugin_idp4_ciam</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The application type supported by the access control policy for the VPC firewall. We recommend that you use the ApplicationNameList parameter instead. Valid values:</p>
             * <ul>
             * <li><p><strong>HTTP</strong></p>
             * </li>
             * <li><p><strong>HTTPS</strong></p>
             * </li>
             * <li><p><strong>MySQL</strong></p>
             * </li>
             * <li><p><strong>SMTP</strong></p>
             * </li>
             * <li><p><strong>SMTPS</strong></p>
             * </li>
             * <li><p><strong>RDP</strong></p>
             * </li>
             * <li><p><strong>VNC</strong></p>
             * </li>
             * <li><p><strong>SSH</strong></p>
             * </li>
             * <li><p><strong>Redis</strong></p>
             * </li>
             * <li><p><strong>MQTT</strong></p>
             * </li>
             * <li><p><strong>MongoDB</strong></p>
             * </li>
             * <li><p><strong>Memcache</strong></p>
             * </li>
             * <li><p><strong>SSL</strong></p>
             * </li>
             * <li><p><strong>ANY</strong>: All application types.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANY</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application types that are supported by the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>FTP</strong></p>
             * </li>
             * <li><p><strong>HTTP</strong></p>
             * </li>
             * <li><p><strong>HTTPS</strong></p>
             * </li>
             * <li><p><strong>Memcache</strong></p>
             * </li>
             * <li><p><strong>MongoDB</strong></p>
             * </li>
             * <li><p><strong>MQTT</strong></p>
             * </li>
             * <li><p><strong>MySQL</strong></p>
             * </li>
             * <li><p><strong>RDP</strong></p>
             * </li>
             * <li><p><strong>Redis</strong></p>
             * </li>
             * <li><p><strong>SMTP</strong></p>
             * </li>
             * <li><p><strong>SMTPS</strong></p>
             * </li>
             * <li><p><strong>SSH</strong></p>
             * </li>
             * <li><p><strong>SSL</strong></p>
             * </li>
             * <li><p><strong>VNC</strong></p>
             * </li>
             * <li><p><strong>ANY</strong> (indicates all application types)</p>
             * </li>
             * </ul>
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * <p>Indicates whether to automatically add the public IP addresses of new ECS instances that match the tags to the address book. New ECS instances include newly purchased instances with the specified tags and existing instances whose tags are modified to match.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoAddTagEcs(Integer autoAddTagEcs) {
                this.autoAddTagEcs = autoAddTagEcs;
                return this;
            }

            /**
             * <p>The time when the policy was created, provided as a UNIX timestamp in seconds.</p>
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
             * <p>test_policy</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination port that is used in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder destPort(String destPort) {
                this.destPort = destPort;
                return this;
            }

            /**
             * <p>The name of the destination port address book.</p>
             * <ul>
             * <li><p><strong>port</strong>: Port</p>
             * </li>
             * <li><p><strong>group</strong>: Port address book</p>
             * </li>
             * </ul>
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
             * <p>The destination address in the access control policy. The value of this parameter varies based on the value of DestinationType.</p>
             * <ul>
             * <li><p>If the value of DestinationType is<code>net</code>, the value of this parameter is a CIDR block. Example: 10.0.3.0/24.</p>
             * </li>
             * <li><p>If the value of DestinationType is<code>domain</code>, the value of this parameter is a domain name. Example: aliyun.</p>
             * </li>
             * <li><p>If the value of DestinationType is<code>group</code>, the value of this parameter is the name of an address book. Example: db_group.</p>
             * </li>
             * <li><p>If the value of DestinationType is<code>location</code>, the value of this parameter is a location. For more information about the location codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If this parameter is omitted, all types of destination addresses are retrieved.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>kms.cn-shanghai.aliyuncs.com</p>
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
             * <li><p><strong>ip</strong>: an IP address book, which contains one or more CIDR blocks.</p>
             * </li>
             * <li><p><strong>tag</strong>: an ECS tag-based address book, which contains the public IP addresses of ECS instances that have specific tags.</p>
             * </li>
             * <li><p><strong>domain</strong>: a domain name address book, which contains one or more domain names.</p>
             * </li>
             * <li><p><strong>threat</strong>: a threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
             * </li>
             * <li><p><strong>backsrc</strong>: a back-to-source address book, which contains the back-to-source IP addresses of one or more Anti-DDoS or WAF instances.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder destinationGroupType(String destinationGroupType) {
                this.destinationGroupType = destinationGroupType;
                return this;
            }

            /**
             * <p>The type of the destination address in the access control policy. Valid values:</p>
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
             * <p>domain</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The direction of internet traffic. Valid values:</p>
             * <ul>
             * <li><p><strong>in</strong>: inbound traffic</p>
             * </li>
             * <li><p><strong>out</strong>: outbound traffic</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>out</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The result of the DNS resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * <p>The time of the DNS resolution, provided as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * <p>The DNS resolution method of the domain name in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: FQDN-based resolution</p>
             * </li>
             * <li><p><strong>1</strong>: DNS-based dynamic resolution</p>
             * </li>
             * <li><p><strong>2</strong>: FQDN-based and DNS-based dynamic resolution</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FQDN</p>
             */
            public Builder domainResolveType(Integer domainResolveType) {
                this.domainResolveType = domainResolveType;
                return this;
            }

            /**
             * <p>The end time of the policy validity period. This is a UNIX timestamp, accurate to the second. The time must be on the hour or half-hour and must be at least 30 minutes later than the start time.</p>
             * <blockquote>
             * <p>This parameter is empty if RepeatType is set to Permanent. It is required if RepeatType is set to None, Daily, Weekly, or Monthly.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1758334822</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhong Kui Open White List</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the address book. Valid values:</p>
             * <ul>
             * <li><p><strong>ip</strong>: IP address book</p>
             * </li>
             * <li><p><strong>domain</strong>: domain address book</p>
             * </li>
             * <li><p><strong>port</strong>: port address book</p>
             * </li>
             * <li><p><strong>tag</strong>: ECS tag-based address book</p>
             * </li>
             * <li><p><strong>allCloud</strong>: cloud service address book</p>
             * </li>
             * <li><p><strong>threat</strong>: threat intelligence address book</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The unique ID of the address book.</p>
             * <p>This ID is required for other operations, such as deleting the address book. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/138869.html">DescribeAddressBook</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>b91d86c3-2b52-4534-aae9-8d0339b12a48</p>
             */
            public Builder groupUuid(String groupUuid) {
                this.groupUuid = groupUuid;
                return this;
            }

            /**
             * <p>The time when the policy was last hit, provided as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder hitLastTime(Long hitLastTime) {
                this.hitLastTime = hitLastTime;
                return this;
            }

            /**
             * <p>The hit count of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitTimes(Long hitTimes) {
                this.hitTimes = hitTimes;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><p><strong>4</strong>: IPv4</p>
             * </li>
             * <li><p><strong>6</strong>: IPv6</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The time when the policy was last modified, provided as a UNIX timestamp in seconds.</p>
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
             * <p>ngw-2ze4w62zbdkwjmoqeokgl</p>
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
             * <li><p><strong>TCP</strong></p>
             * </li>
             * <li><p><strong>UDP</strong></p>
             * </li>
             * <li><p><strong>ICMP</strong></p>
             * </li>
             * <li><p><strong>ANY</strong>: All protocol types</p>
             * </li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The number of policies that reference this address book.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * <p>The status of the access control policy. Valid values:</p>
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
             * <p>The days of a week or month on which the policy recurs.</p>
             * <blockquote>
             * <p>If RepeatType is set to Weekly, the valid values are 0 to 6. The week starts on Sunday.
             * If RepeatType is set to Monthly, the valid values are 1 to 31.</p>
             * </blockquote>
             */
            public Builder repeatDays(java.util.List<Long> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The time when the policy stops to take effect. Example: 23:30. The time must be on the hour or half-hour and must be at least 30 minutes later than the recurrence start time.</p>
             * <blockquote>
             * <p>This parameter is returned empty if RepeatType is set to Permanent or None. This parameter is required if RepeatType is set to Daily, Weekly, or Monthly. The time is in the HH:mm format. Examples: 08:00 and 23:30.</p>
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
             * <p>The time when the policy starts to take effect. Example: 08:00. The time must be on the hour or half-hour and must be at least 30 minutes earlier than the recurrence end time.</p>
             * <blockquote>
             * <p>This parameter is returned empty if RepeatType is set to Permanent or None. This parameter is required if RepeatType is set to Daily, Weekly, or Monthly. The time is in the HH:mm format. Examples: 08:00 and 23:30.</p>
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
             * <p>The recurrence type of the policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Permanent</strong> (default): The policy is always valid.</p>
             * </li>
             * <li><p><strong>None</strong>: The policy is valid only once.</p>
             * </li>
             * <li><p><strong>Daily</strong>: The policy recurs daily.</p>
             * </li>
             * <li><p><strong>Weekly</strong>: The policy recurs weekly.</p>
             * </li>
             * <li><p><strong>Monthly</strong>: The policy recurs monthly.</p>
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
             * <p>The source address in the access control policy. The value of this parameter varies based on the value of SourceType.</p>
             * <ul>
             * <li><p>If <strong>SourceType</strong> is set to<code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is set to<code>group</code>, the value of this parameter is the name of a source address book. Example: db_group.</p>
             * </li>
             * <li><p>If <strong>SourceType</strong> is set to<code>location</code>, the value of this parameter is a location. For more information, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172.28.7.167</p>
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
             * <p>The type of the source address book in the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>ip</strong>: An address book that contains one or more IP addresses or CIDR blocks.</p>
             * </li>
             * <li><p><strong>tag</strong>: An address book that contains the public IP addresses of ECS instances with specific tags.</p>
             * </li>
             * <li><p><strong>domain</strong>: A domain name address book, which contains one or more domain names.</p>
             * </li>
             * <li><p><strong>threat</strong>: a threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
             * </li>
             * <li><p><strong>backsrc</strong>: a back-to-source address book, which contains the back-to-source IP addresses of one or more Anti-DDoS or WAF instances.</p>
             * </li>
             * </ul>
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
             * <li><p><strong>net</strong>: a source CIDR block</p>
             * </li>
             * <li><p><strong>group</strong>: a source address book</p>
             * </li>
             * <li><p><strong>location</strong>: a source region</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The number of specification units that the policy consumes. The value is calculated by using the following formula: Number of source addresses × Number of destination addresses × Number of port ranges × Number of applications.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder spreadCnt(Integer spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * <p>The start of the policy\&quot;s validity period, provided as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1730318400</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ECS tags.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The logical relationship among multiple ECS tags. Valid values:</p>
             * <ul>
             * <li><p><strong>and</strong>: An ECS instance must have all the specified tags.</p>
             * </li>
             * <li><p><strong>or</strong>: An ECS instance must have one of the specified tags.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>or</p>
             */
            public Builder tagRelation(String tagRelation) {
                this.tagRelation = tagRelation;
                return this;
            }

            /**
             * <p>The instance ID of the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-925514970c2c4bcab222</p>
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
             * <p>The ACL check result.</p>
             */
            public Builder acl(Acl acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The assessment details of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>No traffic hit policy.</p>
             */
            public Builder aclAssessmentDetail(String aclAssessmentDetail) {
                this.aclAssessmentDetail = aclAssessmentDetail;
                return this;
            }

            /**
             * <p>The status of the ACL check.</p>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
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
             * <p>The total number of access control policies at the time of the check.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder aclTotalCount(Long aclTotalCount) {
                this.aclTotalCount = aclTotalCount;
                return this;
            }

            /**
             * <p>The ACL check results.</p>
             */
            public Builder acls(java.util.List<Acls> acls) {
                this.acls = acls;
                return this;
            }

            /**
             * <p>The name of the ACL check.</p>
             * 
             * <strong>example:</strong>
             * <p>PolicyHitCountZero</p>
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * <p>The description of the ACL check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Due to business offline or other reasons, the number of hits of the object policy in a period of time is 0.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time of the last check, provided as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1724982259</p>
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The assessment details of the ACL check.</p>
             * 
             * <strong>example:</strong>
             * <p>It is recommended to remove the invalid policy, while helping to save the specification.</p>
             */
            public Builder recordAssessmentDetail(String recordAssessmentDetail) {
                this.recordAssessmentDetail = recordAssessmentDetail;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-c92d4544ef7b6a42</p>
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

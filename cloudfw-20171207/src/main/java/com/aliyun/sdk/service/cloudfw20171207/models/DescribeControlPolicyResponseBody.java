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
 * {@link DescribeControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeControlPolicyResponseBody</p>
 */
public class DescribeControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Policys")
    private java.util.List<Policys> policys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeControlPolicyResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.policys = builder.policys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
        private String pageNo; 
        private String pageSize; 
        private java.util.List<Policys> policys; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeControlPolicyResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.policys = model.policys;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the current page displayed in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The maximum number of entries per page displayed in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
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
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the access control policies.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeControlPolicyResponseBody build() {
            return new DescribeControlPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeControlPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeControlPolicyResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DnsResult")
        @Deprecated
        private String dnsResult;

        @com.aliyun.core.annotation.NameInMap("DnsResultTime")
        private Long dnsResultTime;

        @com.aliyun.core.annotation.NameInMap("DomainResolveType")
        private String domainResolveType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HitLastTime")
        private Long hitLastTime;

        @com.aliyun.core.annotation.NameInMap("HitTimes")
        private Long hitTimes;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

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
        private Integer spreadCnt;

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
            this.direction = builder.direction;
            this.dnsResult = builder.dnsResult;
            this.dnsResultTime = builder.dnsResultTime;
            this.domainResolveType = builder.domainResolveType;
            this.endTime = builder.endTime;
            this.hitLastTime = builder.hitLastTime;
            this.hitTimes = builder.hitTimes;
            this.ipVersion = builder.ipVersion;
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
        public String getDomainResolveType() {
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
        public Integer getSpreadCnt() {
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
            private String direction; 
            private String dnsResult; 
            private Long dnsResultTime; 
            private String domainResolveType; 
            private Long endTime; 
            private Long hitLastTime; 
            private Long hitTimes; 
            private Integer ipVersion; 
            private Long modifyTime; 
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
            private Integer spreadCnt; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Policys model) {
                this.aclAction = model.aclAction;
                this.aclUuid = model.aclUuid;
                this.applicationId = model.applicationId;
                this.applicationName = model.applicationName;
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
                this.direction = model.direction;
                this.dnsResult = model.dnsResult;
                this.dnsResultTime = model.dnsResultTime;
                this.domainResolveType = model.domainResolveType;
                this.endTime = model.endTime;
                this.hitLastTime = model.hitLastTime;
                this.hitTimes = model.hitTimes;
                this.ipVersion = model.ipVersion;
                this.modifyTime = model.modifyTime;
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
             * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
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
             * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
             */
            public Builder aclUuid(String aclUuid) {
                this.aclUuid = aclUuid;
                return this;
            }

            /**
             * <p>The application ID of the traffic in the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10***</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The application type supported by the access control policy. We recommend that you use ApplicationNameList. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The list of application names.</p>
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * <p>The time when the policy was created. The value is a UNIX timestamp in seconds, which is the number of seconds that have elapsed since January 1, 1970 (UTC).</p>
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
             * <p>Allow access to office network segment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination port of the traffic in the access control policy.</p>
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
             * <p>The list of ports in the destination port address book.</p>
             */
            public Builder destPortGroupPorts(java.util.List<String> destPortGroupPorts) {
                this.destPortGroupPorts = destPortGroupPorts;
                return this;
            }

            /**
             * <p>The type of the destination port in the access control policy. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>port</p>
             */
            public Builder destPortType(String destPortType) {
                this.destPortType = destPortType;
                return this;
            }

            /**
             * <p>The destination address in the access control policy. The value varies depending on the DestinationType (destination type). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX/24</p>
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
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The traffic direction of the access control policy. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The DNS resolution result.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX,192.0.XX.XX</p>
             */
            public Builder dnsResult(String dnsResult) {
                this.dnsResult = dnsResult;
                return this;
            }

            /**
             * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579261141</p>
             */
            public Builder dnsResultTime(Long dnsResultTime) {
                this.dnsResultTime = dnsResultTime;
                return this;
            }

            /**
             * <p>The domain name resolution method of the access control policy. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>FQDN</p>
             */
            public Builder domainResolveType(String domainResolveType) {
                this.domainResolveType = domainResolveType;
                return this;
            }

            /**
             * <p>The end time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or half hour and must be at least 30 minutes later than the start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1694764800</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The most recent time of hits. The value is in the format of a UNIX timestamp in seconds.</p>
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
             * <p>The supported IP address version. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The time when the policy was last modified. The value is a UNIX timestamp in seconds, which is the number of seconds that have elapsed since January 1, 1970 (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>1761062400</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The priority of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The security protocol type of the traffic in the access control policy. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The enabled status of the access control policy. The policy is enabled by default after creation. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * <p>The collection of recurrence days for the policy validity period of the access control policy.</p>
             */
            public Builder repeatDays(java.util.List<Long> repeatDays) {
                this.repeatDays = repeatDays;
                return this;
            }

            /**
             * <p>The recurrence end time of the policy validity period for the access control policy. Example: 23:30. The value must be on the hour or half hour and must be at least 30 minutes later than the recurrence start time.</p>
             * 
             * <strong>example:</strong>
             * <p>23:30</p>
             */
            public Builder repeatEndTime(String repeatEndTime) {
                this.repeatEndTime = repeatEndTime;
                return this;
            }

            /**
             * <p>The recurrence start time of the policy validity period for the access control policy. Example: 08:00. The value must be on the hour or half hour and must be at least 30 minutes earlier than the recurrence end time.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder repeatStartTime(String repeatStartTime) {
                this.repeatStartTime = repeatStartTime;
                return this;
            }

            /**
             * <p>The recurrence type of the policy validity period for the access control policy. Valid values:</p>
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
             * <p>The type of the source address book in the access control policy. Valid values:</p>
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
             * 
             * <strong>example:</strong>
             * <p>net</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The number of quota units consumed by the access control policy, which is the cumulative number of quota units consumed by each policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder spreadCnt(Integer spreadCnt) {
                this.spreadCnt = spreadCnt;
                return this;
            }

            /**
             * <p>The start time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or half hour and must be at least 30 minutes earlier than the end time.</p>
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

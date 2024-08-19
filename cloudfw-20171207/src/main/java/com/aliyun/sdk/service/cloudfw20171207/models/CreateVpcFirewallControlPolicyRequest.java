// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallControlPolicyRequest</p>
 */
public class CreateVpcFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
    private java.util.List < String > applicationNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPort")
    private String destPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortGroup")
    private String destPortGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortType")
    private String destPortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Destination")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveType")
    private String domainResolveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewOrder")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proto")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Release")
    private String release;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatDays")
    private java.util.List < Long > repeatDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatEndTime")
    private String repeatEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatStartTime")
    private String repeatStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatType")
    private String repeatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private CreateVpcFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.applicationName = builder.applicationName;
        this.applicationNameList = builder.applicationNameList;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.domainResolveType = builder.domainResolveType;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.newOrder = builder.newOrder;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatDays = builder.repeatDays;
        this.repeatEndTime = builder.repeatEndTime;
        this.repeatStartTime = builder.repeatStartTime;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclAction
     */
    public String getAclAction() {
        return this.aclAction;
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
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return newOrder
     */
    public String getNewOrder() {
        return this.newOrder;
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private String applicationName; 
        private java.util.List < String > applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String domainResolveType; 
        private Long endTime; 
        private String lang; 
        private String memberUid; 
        private String newOrder; 
        private String proto; 
        private String release; 
        private java.util.List < Long > repeatDays; 
        private String repeatEndTime; 
        private String repeatStartTime; 
        private String repeatType; 
        private String source; 
        private String sourceType; 
        private Long startTime; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.applicationName = request.applicationName;
            this.applicationNameList = request.applicationNameList;
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.domainResolveType = request.domainResolveType;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.newOrder = request.newOrder;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatDays = request.repeatDays;
            this.repeatEndTime = request.repeatEndTime;
            this.repeatStartTime = request.repeatStartTime;
            this.repeatType = request.repeatType;
            this.source = request.source;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * - **accept**: allows the traffic.
         * - **drop**: blocks the traffic.
         * - **log**: monitors the traffic.
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * The type of the applications that the access control policy supports. Valid values:
         * <p>
         * 
         * - **FTP**
         * - **HTTP**
         * - **HTTPS**
         * - **MySQL**
         * - **SMTP**
         * - **SMTPS**
         * - **RDP**
         * - **VNC**
         * - **SSH**
         * - **Redis**
         * - **MQTT**
         * - **MongoDB**
         * - **Memcache**
         * - **SSL**
         * - **ANY**: all types of applications
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The application types supported by the access control policy.
         */
        public Builder applicationNameList(java.util.List < String > applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * The description of the access control policy.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination port in the access control policy. 
         * <p>
         * 
         * >  If **DestPortType** is set to `port`, you must specify this parameter.
         */
        public Builder destPort(String destPort) {
            this.putQueryParameter("DestPort", destPort);
            this.destPort = destPort;
            return this;
        }

        /**
         * The name of the destination port address book in the access control policy. 
         * <p>
         * 
         * >  If **DestPortType** is set to `group`, you must specify this parameter.
         */
        public Builder destPortGroup(String destPortGroup) {
            this.putQueryParameter("DestPortGroup", destPortGroup);
            this.destPortGroup = destPortGroup;
            return this;
        }

        /**
         * The type of the destination port in the access control policy. Valid values:
         * <p>
         * 
         * - **port**: port
         * - **group**: port address book
         */
        public Builder destPortType(String destPortType) {
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * The destination address in the access control policy. Valid values:
         * <p>
         * 
         * - If **DestinationType** is set to `net`, the value of **Destination** must be a CIDR block.
         * - If **DestinationType** is set to `group`, the value of **Destination** must be an address book.
         * - If **DestinationType** is set to `domain`, the value of **Destination** must be a domain name.
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * The type of the destination address in the access control policy. Valid values:
         * <p>
         * 
         * - **net**: CIDR block
         * - **group**: address book
         * - **domain**: domain name
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * DomainResolveType.
         */
        public Builder domainResolveType(String domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
         * <p>
         * 
         * >  If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * - **zh**: Chinese (default)
         * - **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The priority of the access control policy. 
         * <p>
         * 
         * The priority value starts from 1. A smaller priority value indicates a higher priority.
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * The type of the protocol in the access control policy. Valid values:
         * <p>
         * 
         * - **ANY** (If you are not sure about the protocol type, you can set this parameter to ANY.)
         * - **TCP**
         * - **UDP**
         * - **ICMP**
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values: 
         * <p>
         * 
         * - **true**: enables the access control policy.
         * - **false**: disables the access control policy.
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * The days of a week or of a month on which the access control policy takes effect.
         * <p>
         * 
         * *   If you set RepeatType to `Permanent`, `None`, or `Daily`, leave this parameter empty. Example: \[].
         * *   If you set RepeatType to Weekly, you must specify this parameter. Example: \[0, 6].
         * 
         * >  If you set RepeatType to Weekly, the fields in the value of this parameter cannot be repeated.
         * 
         * *   If you set RepeatType to `Monthly`, you must specify this parameter. Example: \[1, 31].
         * 
         * >  If you set RepeatType to Monthly, the fields in the value of this parameter cannot be repeated.
         */
        public Builder repeatDays(java.util.List < Long > repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
         * <p>
         * 
         * >  If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.
         */
        public Builder repeatEndTime(String repeatEndTime) {
            this.putQueryParameter("RepeatEndTime", repeatEndTime);
            this.repeatEndTime = repeatEndTime;
            return this;
        }

        /**
         * The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
         * <p>
         * 
         * >  If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.
         */
        public Builder repeatStartTime(String repeatStartTime) {
            this.putQueryParameter("RepeatStartTime", repeatStartTime);
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
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * The source address in the access control policy. 
         * <p>
         * 
         * - If SourceType is set to `net`, the value of Source must be a CIDR block.
         * - If SourceType is set to `group`, the value of Source must be an address book.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The type of the source address in the access control policy. Valid values:
         * <p>
         * 
         * - **net**: CIDR block
         * - **group**: address book
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
         * <p>
         * 
         * >  If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the policy group in which you want to create the access control policy. 
         * <p>
         * 
         * - If a VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.
         * - If a VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.
         * 
         * >  You can call the [DescribeVpcFirewallAclGroupList](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallaclgrouplist) operation to query the IDs.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public CreateVpcFirewallControlPolicyRequest build() {
            return new CreateVpcFirewallControlPolicyRequest(this);
        } 

    } 

}

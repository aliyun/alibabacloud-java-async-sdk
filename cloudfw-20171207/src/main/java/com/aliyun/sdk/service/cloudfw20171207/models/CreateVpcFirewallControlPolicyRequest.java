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
    @Deprecated
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
    private java.util.List<String> applicationNameList;

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
    private java.util.List<Long> repeatDays;

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
    public java.util.List<String> getApplicationNameList() {
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
        private java.util.List<String> applicationNameList; 
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
        private java.util.List<Long> repeatDays; 
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
         * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: blocks the traffic.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * <p>The type of the applications that the access control policy supports. Valid values:</p>
         * <ul>
         * <li><strong>FTP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>ANY</strong>: all types of applications</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The application types supported by the access control policy.</p>
         */
        public Builder applicationNameList(java.util.List<String> applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * <p>The description of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination port in the access control policy. </p>
         * <blockquote>
         * <p> If <strong>DestPortType</strong> is set to <code>port</code>, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder destPort(String destPort) {
            this.putQueryParameter("DestPort", destPort);
            this.destPort = destPort;
            return this;
        }

        /**
         * <p>The name of the destination port address book in the access control policy. </p>
         * <blockquote>
         * <p> If <strong>DestPortType</strong> is set to <code>group</code>, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        public Builder destPortGroup(String destPortGroup) {
            this.putQueryParameter("DestPortGroup", destPortGroup);
            this.destPortGroup = destPortGroup;
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
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * <p>The destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li>If <strong>DestinationType</strong> is set to <code>net</code>, the value of <strong>Destination</strong> must be a CIDR block.</li>
         * <li>If <strong>DestinationType</strong> is set to <code>group</code>, the value of <strong>Destination</strong> must be an address book.</li>
         * <li>If <strong>DestinationType</strong> is set to <code>domain</code>, the value of <strong>Destination</strong> must be a domain name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.2.XX.XX/24</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: CIDR block</li>
         * <li><strong>group</strong>: address book</li>
         * <li><strong>domain</strong>: domain name</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The domain name resolution method of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: fully qualified domain name (FQDN)-based resolution</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN and DNS-based dynamic resolution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder domainResolveType(String domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p> If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The priority of the access control policy. </p>
         * <p>The priority value starts from 1. A smaller priority value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * <p>The type of the protocol in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ANY</strong> (If you are not sure about the protocol type, you can set this parameter to ANY.)</li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values: </p>
         * <ul>
         * <li><strong>true</strong>: enables the access control policy.</li>
         * <li><strong>false</strong>: disables the access control policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * <p>The days of a week or of a month on which the access control policy takes effect.</p>
         * <ul>
         * <li>If you set RepeatType to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: [].</li>
         * <li>If you set RepeatType to Weekly, you must specify this parameter. Example: [0, 6].</li>
         * </ul>
         * <blockquote>
         * <p> If you set RepeatType to Weekly, the fields in the value of this parameter cannot be repeated.</p>
         * </blockquote>
         * <ul>
         * <li>If you set RepeatType to <code>Monthly</code>, you must specify this parameter. Example: [1, 31].</li>
         * </ul>
         * <blockquote>
         * <p> If you set RepeatType to Monthly, the fields in the value of this parameter cannot be repeated.</p>
         * </blockquote>
         */
        public Builder repeatDays(java.util.List<Long> repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * <p>The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p> If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        public Builder repeatEndTime(String repeatEndTime) {
            this.putQueryParameter("RepeatEndTime", repeatEndTime);
            this.repeatEndTime = repeatEndTime;
            return this;
        }

        /**
         * <p>The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p> If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        public Builder repeatStartTime(String repeatStartTime) {
            this.putQueryParameter("RepeatStartTime", repeatStartTime);
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
            this.putQueryParameter("RepeatType", repeatType);
            this.repeatType = repeatType;
            return this;
        }

        /**
         * <p>The source address in the access control policy. </p>
         * <ul>
         * <li>If SourceType is set to <code>net</code>, the value of Source must be a CIDR block.</li>
         * <li>If SourceType is set to <code>group</code>, the value of Source must be an address book.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.2.XX.XX/24</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: CIDR block</li>
         * <li><strong>group</strong>: address book</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p> If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694761200</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the policy group in which you want to create the access control policy. </p>
         * <ul>
         * <li>If a VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.</li>
         * <li>If a VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallaclgrouplist">DescribeVpcFirewallAclGroupList</a> operation to query the IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-a42bbb7b887148c9****</p>
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

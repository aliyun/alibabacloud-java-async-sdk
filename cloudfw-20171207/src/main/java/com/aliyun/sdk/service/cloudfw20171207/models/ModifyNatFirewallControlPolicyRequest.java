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
 * {@link ModifyNatFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyNatFirewallControlPolicyRequest</p>
 */
public class ModifyNatFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
    private java.util.List<String> applicationNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
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
    private String destination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

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
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proto")
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
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ModifyNatFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.applicationNameList = builder.applicationNameList;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.direction = builder.direction;
        this.domainResolveType = builder.domainResolveType;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatDays = builder.repeatDays;
        this.repeatEndTime = builder.repeatEndTime;
        this.repeatStartTime = builder.repeatStartTime;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatFirewallControlPolicyRequest create() {
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public static final class Builder extends Request.Builder<ModifyNatFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private java.util.List<String> applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String direction; 
        private String domainResolveType; 
        private Long endTime; 
        private String lang; 
        private String natGatewayId; 
        private String proto; 
        private String release; 
        private java.util.List<Long> repeatDays; 
        private String repeatEndTime; 
        private String repeatStartTime; 
        private String repeatType; 
        private String source; 
        private String sourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNatFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
            this.applicationNameList = request.applicationNameList;
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.direction = request.direction;
            this.domainResolveType = request.domainResolveType;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatDays = request.repeatDays;
            this.repeatEndTime = request.repeatEndTime;
            this.repeatStartTime = request.repeatStartTime;
            this.repeatType = request.repeatType;
            this.source = request.source;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The action that you want to perform on traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: allows the traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: denies the traffic.</p>
         * </li>
         * <li><p><strong>log</strong>: monitors the traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * <p>The UUID of the access control policy.</p>
         * <p>To modify an access control policy, you must provide the UUID of the policy. You can call the DescribeNatFirewallControlPolicy operation to query the UUIDs of access control policies.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>63ab1c02-926a-4d1b-9ef7-*****</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The application names.</p>
         */
        public Builder applicationNameList(java.util.List<String> applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * <p>The description of the access control policy. Fuzzy match is supported.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the descriptions of all policies are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination port in the access control policy.</p>
         * <blockquote>
         * <p>This parameter is required when you set <strong>DestPortType</strong> to <code>port</code>.</p>
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
         * <p>The name of the destination port address book in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>my_dest_port_group</p>
         */
        public Builder destPortGroup(String destPortGroup) {
            this.putQueryParameter("DestPortGroup", destPortGroup);
            this.destPortGroup = destPortGroup;
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
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * <p>The destination address in the access control policy.</p>
         * <ul>
         * <li><p>If <strong>DestinationType</strong> is <code>net</code>, specify a destination CIDR block. Example: <code>1.2.3.4/24</code>.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <code>group</code>, specify a destination address book. Example: <code>db_group</code>.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <code>domain</code>, specify a destination domain name. Example: <code>*.aliyuncs.com</code>.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <code>location</code>, specify a destination location. For more information about location codes, see AddIpamPoolCidr. Example: <code>[&quot;BJ11&quot;, &quot;ZB&quot;]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x/32</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
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
         * <li><p><strong>location</strong>: destination location</p>
         * </li>
         * </ul>
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
         * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The DNS resolution method of the domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: FQDN</p>
         * </li>
         * <li><p><strong>1</strong>: dynamic DNS</p>
         * </li>
         * <li><p><strong>2</strong>: FQDN and dynamic DNS</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the domain name is resolved in FQDN mode, you can select only the TCP protocol. The supported applications are HTTP, HTTPS, SMTP, SMTPS, SSL, IMAPS, and POPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder domainResolveType(String domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * <p>The end time of the effective period for the access control policy. The time is a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes after the start time.</p>
         * <blockquote>
         * <p>If <code>RepeatType</code> is Permanent, <code>EndTime</code> is empty. If <code>RepeatType</code> is None, Daily, Weekly, or Monthly, <code>EndTime</code> is required.</p>
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
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
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
         * <p>The ID of the NAT gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxxxxx</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The protocol type in the access control policy. Valid values:</p>
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
         * <blockquote>
         * <p><strong>ANY</strong> indicates that the policy applies to all protocol types.</p>
         * </blockquote>
         * <blockquote>
         * <p>If the destination is a domain name-based address book that contains a threat intelligence address book or a cloud service address book, you can select TCP. If you select TCP, you can select HTTP, HTTPS, SMTP, SMTPS, or SSL.</p>
         * </blockquote>
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
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * <p>The days of a week or a month on which the policy recurs.</p>
         * <ul>
         * <li><p>If you set <strong>RepeatType</strong> to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: [].</p>
         * </li>
         * <li><p>If you set <strong>RepeatType</strong> to <code>Weekly</code>, this parameter is required. Example: [0, 6].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When RepeatType is set to Weekly, RepeatDays does not allow duplicates.</p>
         * </blockquote>
         * <ul>
         * <li>When RepeatType is <code>Monthly</code>, RepeatDays cannot be empty. For example: [1, 31]</li>
         * </ul>
         * <blockquote>
         * <p>When RepeatType is set to Monthly, RepeatDays cannot contain duplicate values.</p>
         * </blockquote>
         */
        public Builder repeatDays(java.util.List<Long> repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * <p>The end time of the policy\&quot;s recurrence period. The time must be in the 24-hour HH:mm format, such as 23:30, be on the hour or half-hour, and be at least half an hour later than the recurrence start time.</p>
         * <blockquote>
         * <p>When RepeatType is Permanent or None, RepeatEndTime is empty. When RepeatType is Daily, Weekly, or Monthly, you must set RepeatEndTime to specify the end time for the repetition.</p>
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
         * <p>The start time of the repeat cycle. Use the 24-hour HH:mm format, such as 08:00. The time must be on the hour or half-hour and at least 30 minutes before the repeat end time.</p>
         * <blockquote>
         * <p>This parameter is not used if <code>RepeatType</code> is set to <code>Permanent</code> or <code>None</code>. This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>.</p>
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
         * <p>The recurrence type for the policy to take effect. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): The policy is always in effect.</p>
         * </li>
         * <li><p><strong>None</strong>: The policy takes effect for a specified period of time.</p>
         * </li>
         * <li><p><strong>Daily</strong>: The policy takes effect daily.</p>
         * </li>
         * <li><p><strong>Weekly</strong>: The policy takes effect weekly.</p>
         * </li>
         * <li><p><strong>Monthly</strong>: The policy takes effect monthly.</p>
         * </li>
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
         * <p>The source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><p>When <strong>SourceType</strong> is <code>net</code>, Source is the source CIDR address, for example, 10.2.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>group</code>, specify a source address book. Example: <code>db_group</code>.</p>
         * </li>
         * </ul>
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
         * <li><p><strong>net</strong>: source CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: source address book</p>
         * </li>
         * </ul>
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
         * <p>The start time of the effective period for the access control policy is specified in the Unix timestamp format. It must be on the hour or half-hour and at least half an hour earlier than the end time.</p>
         * <blockquote>
         * <p>When RepeatType is Permanent, StartTime is empty. When RepeatType is None, Daily, Weekly, or Monthly, StartTime is required.</p>
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

        @Override
        public ModifyNatFirewallControlPolicyRequest build() {
            return new ModifyNatFirewallControlPolicyRequest(this);
        } 

    } 

}

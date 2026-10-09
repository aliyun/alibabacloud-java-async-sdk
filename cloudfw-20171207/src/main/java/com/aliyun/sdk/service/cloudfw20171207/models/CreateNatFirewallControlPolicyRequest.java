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
 * {@link CreateNatFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateNatFirewallControlPolicyRequest</p>
 */
public class CreateNatFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveType")
    private Integer domainResolveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

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

    private CreateNatFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
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
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatFirewallControlPolicyRequest create() {
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
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

    public static final class Builder extends Request.Builder<CreateNatFirewallControlPolicyRequest, Builder> {
        private String aclAction; 
        private java.util.List<String> applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String direction; 
        private Integer domainResolveType; 
        private Long endTime; 
        private String ipVersion; 
        private String lang; 
        private String natGatewayId; 
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

        private Builder() {
            super();
        } 

        private Builder(CreateNatFirewallControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
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
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
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
        } 

        /**
         * <p>The action that Cloud Firewall performs on traffic that matches the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allows the traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: Drops the traffic.</p>
         * </li>
         * <li><p><strong>log</strong>: Logs the traffic.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The list of applications to which the access control policy applies.</p>
         * <p>This parameter is required.</p>
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
         * <p>放行流量</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination port for the traffic. The value of this parameter depends on the <code>Proto</code> and <code>DestPortType</code> parameters.</p>
         * <ul>
         * <li>If <code>Proto</code> is <code>ICMP</code>, leave this parameter empty.</li>
         * </ul>
         * <blockquote>
         * <p>Access control cannot be configured based on the destination port for ICMP traffic.</p>
         * </blockquote>
         * <ul>
         * <li>If the destination port type (<code>DestPortType</code>) is <code>group</code>, leave this parameter empty.</li>
         * </ul>
         * <blockquote>
         * <p>If <code>DestPortType</code> is set to <code>group</code>, you do not need to specify a destination port because the required ports are defined in the selected port address book.</p>
         * </blockquote>
         * <ul>
         * <li>If the protocol is TCP, UDP, or ANY and the destination port type (<code>DestPortType</code>) is <code>port</code>, specify the destination port number.</li>
         * </ul>
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
         * <p>The name of the destination port address book.</p>
         * <blockquote>
         * <p>This parameter is required if <code>DestPortType</code> is set to <code>group</code>.</p>
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
         * <p>The type of the destination port.</p>
         * <ul>
         * <li><p><strong>port</strong>: Port or port range</p>
         * </li>
         * <li><p><strong>group</strong>: Port address book</p>
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
         * <p>The value of this parameter varies based on the value of <code>DestinationType</code>:</p>
         * <ul>
         * <li><p>If <code>DestinationType</code> is <code>net</code>, set this parameter to the destination CIDR.</p>
         * <p>Example: <code>1.2.XX.XX/24</code></p>
         * </li>
         * <li><p>If <code>DestinationType</code> is <code>group</code>, set this parameter to the name of the destination address book.</p>
         * <p>Example: <code>db_group</code></p>
         * </li>
         * <li><p>If <code>DestinationType</code> is <code>domain</code>, set this parameter to the destination domain.</p>
         * <p>Example: \*.aliyuncs.com</p>
         * </li>
         * <li><p>If <code>DestinationType</code> is <code>location</code>, set this parameter to the destination location.</p>
         * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XX.XX.XX.XX/24</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The type of the destination address in the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: Destination CIDR</p>
         * </li>
         * <li><p><strong>group</strong>: Destination address book</p>
         * </li>
         * <li><p><strong>domain</strong>: Destination domain</p>
         * </li>
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
         * <p>The traffic direction for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The domain name resolution method. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: FQDN-based resolution</p>
         * </li>
         * <li><p><strong>1</strong>: Dynamic DNS-based resolution</p>
         * </li>
         * <li><p><strong>2</strong>: FQDN-based and dynamic DNS-based resolution</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the resolution method includes FQDN, you can set the protocol only to TCP. The supported applications are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder domainResolveType(Integer domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * <p>The end time of the policy\&quot;s validity period, specified as a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes after the start time.</p>
         * <blockquote>
         * <p>This parameter is required if <code>RepeatType</code> is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code>, leave this parameter empty.</p>
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
         * <p>The IP version for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>4</strong> (default): IPv4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The language of the response messages.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese (default)</p>
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
         * <p>The instance ID of the NAT Gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-2vc2ustolqn6sr0******</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The priority of the access control policy. Values start from 1. A smaller value indicates a higher priority.</p>
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
         * <p>The protocol for the traffic in the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ANY: all protocols</p>
         * </li>
         * <li><p>TCP</p>
         * </li>
         * <li><p>UDP</p>
         * </li>
         * <li><p>ICMP</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the destination is a domain, a threat intelligence address book, or a cloud service address book, you can only set this parameter to <code>TCP</code>. The supported application types are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>Specifies whether the access control policy is enabled. By default, policies are enabled upon creation. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables the policy.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables the policy.</p>
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
         * <p>The days of the week or month on which the policy recurs.</p>
         * <ul>
         * <li><p>If <code>RepeatType</code> is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: <code>[]</code></p>
         * </li>
         * <li><p>If <code>RepeatType</code> is <code>Weekly</code>, this parameter is required. Example: <code>[0, 6]</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is <code>Weekly</code>, the values in <code>RepeatDays</code> must be unique.</p>
         * </blockquote>
         * <ul>
         * <li>If <code>RepeatType</code> is <code>Monthly</code>, this parameter is required. Example: <code>[1, 31]</code></li>
         * </ul>
         * <blockquote>
         * <p>If <code>RepeatType</code> is <code>Monthly</code>, the values in <code>RepeatDays</code> must be unique.</p>
         * </blockquote>
         */
        public Builder repeatDays(java.util.List<Long> repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * <p>The end time of the recurrence. The time must be on the hour or half-hour, and must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>, leave this parameter empty.
         * The time is in the HH:mm format (24-hour). For example, <code>08:00</code> or <code>23:30</code>.</p>
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
         * <p>The start time of the recurrence. The time must be on the hour or half-hour, and must be at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>, leave this parameter empty.
         * The time is in the HH:mm format (24-hour). For example, <code>08:00</code> or <code>23:30</code>.</p>
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
         * <p>The recurrence type for the policy validity period. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): The policy is always active.</p>
         * </li>
         * <li><p><strong>None</strong>: The policy runs once for a specified duration.</p>
         * </li>
         * <li><p><strong>Daily</strong>: The policy recurs daily.</p>
         * </li>
         * <li><p><strong>Weekly</strong>: The policy recurs weekly within a specified time range.</p>
         * </li>
         * <li><p><strong>Monthly</strong>: The policy recurs monthly within a specified time range.</p>
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
         * <p>The source address in the access control policy.</p>
         * <p>The value of this parameter varies based on the value of <code>SourceType</code>:</p>
         * <ul>
         * <li><p>If <strong>SourceType</strong> is <code>net</code>, set this parameter to the source CIDR.</p>
         * <p>Example: 10.2.4.0/24</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>group</code>, set this parameter to the name of the source address book.</p>
         * <p>Example: db_group</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.25/32</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the source address in the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: Source CIDR</p>
         * </li>
         * <li><p><strong>group</strong>: Source address book</p>
         * </li>
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
         * <p>The start time of the policy\&quot;s validity period, specified as a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes before the end time.</p>
         * <blockquote>
         * <p>This parameter is required if <code>RepeatType</code> is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code>, leave this parameter empty.</p>
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
        public CreateNatFirewallControlPolicyRequest build() {
            return new CreateNatFirewallControlPolicyRequest(this);
        } 

    } 

}

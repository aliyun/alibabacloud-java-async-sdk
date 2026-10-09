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
 * {@link AddControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>AddControlPolicyRequest</p>
 */
public class AddControlPolicyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

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
    private String domainResolveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private AddControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.applicationName = builder.applicationName;
        this.applicationNameList = builder.applicationNameList;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.direction = builder.direction;
        this.domainResolveType = builder.domainResolveType;
        this.dryRun = builder.dryRun;
        this.endTime = builder.endTime;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.newOrder = builder.newOrder;
        this.proto = builder.proto;
        this.release = builder.release;
        this.repeatDays = builder.repeatDays;
        this.repeatEndTime = builder.repeatEndTime;
        this.repeatStartTime = builder.repeatStartTime;
        this.repeatType = builder.repeatType;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddControlPolicyRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
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

    public static final class Builder extends Request.Builder<AddControlPolicyRequest, Builder> {
        private String aclAction; 
        private String applicationName; 
        private java.util.List<String> applicationNameList; 
        private String clientToken; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String direction; 
        private String domainResolveType; 
        private Boolean dryRun; 
        private Long endTime; 
        private String ipVersion; 
        private String lang; 
        private String newOrder; 
        private String proto; 
        private String release; 
        private java.util.List<Long> repeatDays; 
        private String repeatEndTime; 
        private String repeatStartTime; 
        private String repeatType; 
        private String source; 
        private String sourceIp; 
        private String sourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(AddControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.applicationName = request.applicationName;
            this.applicationNameList = request.applicationNameList;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.direction = request.direction;
            this.domainResolveType = request.domainResolveType;
            this.dryRun = request.dryRun;
            this.endTime = request.endTime;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.newOrder = request.newOrder;
            this.proto = request.proto;
            this.release = request.release;
            this.repeatDays = request.repeatDays;
            this.repeatEndTime = request.repeatEndTime;
            this.repeatStartTime = request.repeatStartTime;
            this.repeatType = request.repeatType;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The action configured in the access control policy for the traffic that passes through Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic.</li>
         * <li><strong>drop</strong>: denies the traffic.</li>
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
         * <p>The application type supported by the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FTP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>SSL_No_Cert</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>ANY</strong> (all application types)</li>
         * </ul>
         * <blockquote>
         * <p>The supported application types depend on the value of the protocol type (Proto). If Proto is set to TCP, ApplicationName can be set to any of the preceding application types. If Proto is set to UDP, ICMP, or ANY, ApplicationName can be set only to ANY. You must specify either ApplicationNameList or ApplicationName. You cannot leave both of them empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The list of application types supported by the access control policy.</p>
         */
        public Builder applicationNameList(java.util.List<String> applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * <p>The idempotence token.</p>
         * 
         * <strong>example:</strong>
         * <p>ddadxefexxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Release flow</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination port in the access control policy. Valid values:</p>
         * <ul>
         * <li>If the protocol type is ICMP, the value of DestPort is empty.</li>
         * </ul>
         * <blockquote>
         * <p>If the protocol type is ICMP, access control on the destination port is not supported.</p>
         * </blockquote>
         * <ul>
         * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is group, the value of DestPort is empty.</li>
         * </ul>
         * <blockquote>
         * <p>If the destination port type of the access control policy is set to group (port address book), you do not need to specify a destination port number. All ports that the access control policy manages are included in the port address book.</p>
         * </blockquote>
         * <ul>
         * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is port, the value of DestPort is the destination port number.</li>
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
         * <p>The name of the destination port address book in the access control policy.</p>
         * <blockquote>
         * <p>If DestPortType is set to group, you must specify the destination port address book name.</p>
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
         * <p>The type of the destination port in the access control policy.</p>
         * <p>Valid values:</p>
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
         * <p>The destination address in the access control policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>If DestinationType is set to net, the value of Destination is a destination CIDR block.</p>
         * <p>Example: 1.2.XX.XX/24</p>
         * </li>
         * <li><p>If DestinationType is set to group, the value of Destination is a destination address book name.</p>
         * <p>Example: db_group</p>
         * </li>
         * <li><p>If DestinationType is set to domain, the value of Destination is a destination domain name.</p>
         * <p>Example: *.aliyuncs.com</p>
         * </li>
         * <li><p>If DestinationType is set to location, the value of Destination is a destination region.</p>
         * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;\]</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If Destination is set to a destination region, for more information, see <a href="https://help.aliyun.com/document_detail/2854161.html">Region codes</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: destination CIDR block</li>
         * <li><strong>group</strong>: destination address book</li>
         * <li><strong>domain</strong>: destination domain name</li>
         * <li><strong>location</strong>: destination region</li>
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
         * <p>The traffic direction of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound traffic access control</li>
         * <li><strong>out</strong>: outbound traffic access control</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The domain name resolution method of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: FQDN-based</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN and DNS-based dynamic resolution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        public Builder domainResolveType(String domainResolveType) {
            this.putQueryParameter("DomainResolveType", domainResolveType);
            this.domainResolveType = domainResolveType;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The end time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or half hour and must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, EndTime is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must have a value.</p>
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
         * <p>The IP address version supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: IPv4</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.</p>
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
         * <p>The protocol type in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ANY</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * </ul>
         * <blockquote>
         * <p>If the traffic direction is outbound and the destination address is a threat intelligence address book or cloud service address book of the domain type, only TCP is supported. The application type can be set to HTTP, HTTPS, SMTP, SMTPS, or SSL.</p>
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
         * <p>Specifies whether to enable the access control policy. The policy is enabled by default after it is created. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the access control policy.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the access control policy.</p>
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
         * <p>The days of the recurrence for the policy validity period of the access control policy.</p>
         * <ul>
         * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty collection.
         * Example: []</li>
         * <li>If RepeatType is set to Weekly, RepeatDays cannot be empty.
         * Example: [0, 6]<blockquote>
         * <p>If RepeatType is set to Weekly, values in RepeatDays cannot be repeated.</p>
         * </blockquote>
         * </li>
         * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty.
         * Example: [1, 31]<blockquote>
         * <p>If RepeatType is set to Monthly, values in RepeatDays cannot be repeated.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        public Builder repeatDays(java.util.List<Long> repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * <p>The recurrence end time of the policy validity period for the access control policy. Example: 23:30. The value must be on the hour or half hour and must be at least 30 minutes later than the recurrence start time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, RepeatEndTime is empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must have a value.
         * The time is in the HH:mm format (24-hour clock). Example: 08:00 or 23:30.</p>
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
         * <p>The recurrence start time of the policy validity period for the access control policy. Example: 08:00. The value must be on the hour or half hour and must be at least 30 minutes earlier than the recurrence end time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, RepeatStartTime is empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatStartTime must have a value.
         * The time is in the HH:mm format (24-hour clock). Example: 08:00 or 23:30.</p>
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
         * <p>The recurrence type of the policy validity period for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong> (default): The policy is always valid.</li>
         * <li><strong>None</strong>: The policy is valid for a specified single time period.</li>
         * <li><strong>Daily</strong>: The policy is valid on a daily basis.</li>
         * <li><strong>Weekly</strong>: The policy is valid on a weekly basis.</li>
         * <li><strong>Monthly</strong>: The policy is valid on a monthly basis.</li>
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
         * <li><p>If SourceType is set to net, the value of Source is a source CIDR block.</p>
         * <p>Example: 1.1.XX.XX/24</p>
         * </li>
         * <li><p>If SourceType is set to group, the value of Source is a source address book name.</p>
         * <p>Example: db_group</p>
         * </li>
         * <li><p>If SourceType is set to location, the value of Source is a source region.</p>
         * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;\]</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If Source is set to a source region, for more information, see <a href="https://help.aliyun.com/document_detail/2854161.html">Region codes</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: source CIDR block</li>
         * <li><strong>group</strong>: source address book</li>
         * <li><strong>location</strong>: source region</li>
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
         * <p>The start time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or half hour and must be at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, StartTime is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must have a value.</p>
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
        public AddControlPolicyRequest build() {
            return new AddControlPolicyRequest(this);
        } 

    } 

}

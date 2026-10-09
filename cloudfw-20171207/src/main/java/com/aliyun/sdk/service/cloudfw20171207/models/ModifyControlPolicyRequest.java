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
 * {@link ModifyControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlPolicyRequest</p>
 */
public class ModifyControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclAction")
    private String aclAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

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
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

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

    private ModifyControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
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
        this.lang = builder.lang;
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

    public static ModifyControlPolicyRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<ModifyControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
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
        private String lang; 
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

        private Builder(ModifyControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.aclUuid = request.aclUuid;
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
            this.lang = request.lang;
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
         * <p>The action that the access control policy performs on the traffic that passes through the firewall. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows access.</li>
         * <li><strong>drop</strong>: deny.</li>
         * <li><strong>log</strong>: monitors the traffic.</li>
         * </ul>
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
         * <p>The unique ID of the access control policy.</p>
         * <blockquote>
         * <p>To modify an access control policy, you must provide the unique ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/138866.html">DescribeControlPolicy</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The application type supported by the access control policy. The following application types are supported:</p>
         * <ul>
         * <li><strong>ANY</strong></li>
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
         * </ul>
         * <blockquote>
         * <p><strong>ANY</strong> indicates that the policy applies to all types of applications.</p>
         * </blockquote>
         * <blockquote>
         * <p>You must specify either ApplicationNameList or ApplicationName. You cannot leave both parameters empty. If you specify both parameters, the value of ApplicationNameList takes precedence.</p>
         * </blockquote>
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
         * <p>The application name list.</p>
         * <blockquote>
         * <p>You must specify either ApplicationNameList or ApplicationName. You cannot leave both parameters empty. If you specify both parameters, the value of ApplicationNameList takes precedence.</p>
         * </blockquote>
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
         * <p>The destination port in the access control policy.</p>
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
         * <p>The destination address in the access control policy.</p>
         * <ul>
         * <li>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> is a destination CIDR block. Example: 1.2.XX.XX/24.</li>
         * <li>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> is a destination address book name. Example: db_group.</li>
         * <li>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> is a destination domain name. Example: *.aliyuncs.com.</li>
         * <li>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> is a destination area. For more information about area positional encoding, see the following sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
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
         * <li><strong>in</strong>: inbound traffic</li>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
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
         * <p>The end time of the Policy Validity Period of the access control policy. The value is a UNIX timestamp in seconds format. The time must be on the hour or half hour and must be at least 30 minutes later than the start time. Settings for the end time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter is required.</p>
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
         * <p>The security protocol type in the access control policy. The following protocol types are supported:</p>
         * <ul>
         * <li><strong>ANY</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * </ul>
         * <blockquote>
         * <p><strong>ANY</strong> indicates that the policy applies to all protocol types.</p>
         * </blockquote>
         * <blockquote>
         * <p>If the traffic direction is outbound and the destination address is a threat intelligence address book or cloud service address book of the domain type, you can set the protocol to TCP or ANY. If you select TCP, the application can be set to HTTP, HTTPS, SMTP, SMTPS, or SSL. If you select ANY, the application can only be set to ANY.</p>
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
         * <p>The enabling status of the access control policy. Valid values:</p>
         * <ul>
         * <li>true: The policy is enabled.</li>
         * <li>false: The policy is disabled.</li>
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
         * <p>The days of a week or of a month on which the access control policy takes effect. Settings for the Policy Validity Period.</p>
         * <ul>
         * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty array.
         * Example: []</li>
         * <li>If RepeatType is set to Weekly, RepeatDays must not be empty.
         * Example: [0, 6]<blockquote>
         * <p>If RepeatType is set to Weekly, the values in RepeatDays cannot be repeated.</p>
         * </blockquote>
         * </li>
         * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays must not be empty.
         * Example: [1, 31]<blockquote>
         * <p>If RepeatType is set to Monthly, the values in RepeatDays cannot be repeated.</p>
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
         * <p>The recurrence end time of the policy validity period. The time is in the HH:mm format and uses a 24-hour clock. Example: 23:00.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter is required.</p>
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
         * <p>The recurrence start time of the policy validity period. The time is in the HH:mm format and uses a 24-hour clock. Example: 08:00.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter is required.</p>
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
         * <p>The recurrence type for the policy validity period of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong> (default): always</li>
         * <li><strong>None</strong>: one-time</li>
         * <li><strong>Daily</strong>: daily</li>
         * <li><strong>Weekly</strong>: weekly</li>
         * <li><strong>Monthly</strong>: monthly</li>
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
         * <ul>
         * <li>If <strong>SourceType</strong> is set to net, <strong>Source</strong> is a source CIDR block. Example: 1.2.XX.XX/24.</li>
         * <li>If <strong>SourceType</strong> is set to group, <strong>Source</strong> is a source address book name. Example: db_group.</li>
         * <li>If <strong>SourceType</strong> is set to location, <strong>Source</strong> is a source area. For more information about area positional encoding, see the following sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
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
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: source CIDR block</li>
         * <li><strong>group</strong>: source address book</li>
         * <li><strong>location</strong>: source region</li>
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
         * <p>The start time of the Policy Validity Period of the access control policy. The value is a UNIX timestamp in seconds format. The time must be on the hour or half hour and must be at least 30 minutes earlier than the end time. Settings for the start time.</p>
         * <blockquote>
         * <p>If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter is required.</p>
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
        public ModifyControlPolicyRequest build() {
            return new ModifyControlPolicyRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlPolicyRequest</p>
 */
public class ModifyControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclAction")
    @Validation(required = true)
    private String aclAction;

    @Query
    @NameInMap("AclUuid")
    @Validation(required = true)
    private String aclUuid;

    @Query
    @NameInMap("ApplicationName")
    private String applicationName;

    @Query
    @NameInMap("ApplicationNameList")
    private java.util.List < String > applicationNameList;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DestPort")
    private String destPort;

    @Query
    @NameInMap("DestPortGroup")
    private String destPortGroup;

    @Query
    @NameInMap("DestPortType")
    private String destPortType;

    @Query
    @NameInMap("Destination")
    @Validation(required = true)
    private String destination;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Proto")
    @Validation(required = true)
    private String proto;

    @Query
    @NameInMap("Release")
    private String release;

    @Query
    @NameInMap("RepeatDays")
    private java.util.List < Long > repeatDays;

    @Query
    @NameInMap("RepeatEndTime")
    private String repeatEndTime;

    @Query
    @NameInMap("RepeatStartTime")
    private String repeatStartTime;

    @Query
    @NameInMap("RepeatType")
    private String repeatType;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ModifyControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.aclUuid = builder.aclUuid;
        this.applicationName = builder.applicationName;
        this.applicationNameList = builder.applicationNameList;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.direction = builder.direction;
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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

    public static final class Builder extends Request.Builder<ModifyControlPolicyRequest, Builder> {
        private String aclAction; 
        private String aclUuid; 
        private String applicationName; 
        private java.util.List < String > applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String direction; 
        private Long endTime; 
        private String lang; 
        private String proto; 
        private String release; 
        private java.util.List < Long > repeatDays; 
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
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.direction = request.direction;
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
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * *   **accept**: allows the traffic.
         * *   **drop**: denies the traffic.
         * *   **log**: monitors the traffic.
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * The UUID of the access control policy.
         * <p>
         * 
         * >  To modify an access control policy, you must specify the UUID of the policy. You can call the [DescribeControlPolicy](~~138866~~) interface to query the UUID.
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * The type of the application that the access control policy supports. Valid values:
         * <p>
         * 
         * *   **ANY**
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
         * 
         * >  The value ANY** indicates all types of applications.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The application names.
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
         */
        public Builder destPort(String destPort) {
            this.putQueryParameter("DestPort", destPort);
            this.destPort = destPort;
            return this;
        }

        /**
         * The name of the destination port address book in the access control policy.
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
         * *   **port**: port
         * *   **group**: port address book
         */
        public Builder destPortType(String destPortType) {
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * The destination address in the access control policy.
         * <p>
         * 
         * *   If **DestinationType** is set to net, the value of **Destination** is a CIDR block. Example: 1.2.XX.XX/24.
         * *   If **DestinationType** is set to group, the value of **Destination** is an address book. Example: db_group.
         * *   If **DestinationType** is set to domain, the value of **Destination** is a domain name. Example: \*.aliyuncs.com.
         * *   If **DestinationType** is set to location, the value of **Destination** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"].
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
         * *   **net**: CIDR block
         * *   **group**: address book
         * *   **domain**: domain name
         * *   **location**: location
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The direction of the traffic to which the access control policy applies. Valid values:
         * <p>
         * 
         * *   **in**: inbound traffic
         * *   **out**: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of StartTime.
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
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The protocol type supported by the access control policy. Valid values:
         * <p>
         * 
         * *   **ANY**
         * *   **TCP**
         * *   **UDP**
         * *   **ICMP**
         * 
         * >  The value ANY** indicates all types of applications.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * The status of the access control policy. Valid values:
         * <p>
         * 
         * *   true: enabled
         * *   false: disabled
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
         * *   If you set RepeatType to `Permanent`, `None`, or `Daily`, the value of this parameter is an empty array. Example: \[]
         * *   If you set RepeatType to Weekly, you must specify this parameter. Example: \[0, 6]
         * 
         * >  If you set RepeatType to Weekly, the fields in the value of this parameter cannot be repeated.
         * 
         * *   If you set RepeatType to `Monthly`, you must specify this parameter. Example: \[1, 31]
         * 
         * >  If you set RepeatType to Monthly, the fields in the value of this parameter cannot be repeated.
         */
        public Builder repeatDays(java.util.List < Long > repeatDays) {
            this.putQueryParameter("RepeatDays", repeatDays);
            this.repeatDays = repeatDays;
            return this;
        }

        /**
         * The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of RepeatStartTime.
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
         * The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of RepeatEndTime.
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
         * *   If **SourceType** is set to net, the value of **Source** is a CIDR block. Example: 1.2.XX.XX/24.
         * *   If **SourceType** is set to group, the value of **Source** is an address book. Example: db_group.
         * *   If **SourceType** is set to location, the value of **Source** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]
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
         * *   **net**: CIDR block
         * *   **group**: address book
         * *   **location**: location
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of EndTime.
         * <p>
         * 
         * >  If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.
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

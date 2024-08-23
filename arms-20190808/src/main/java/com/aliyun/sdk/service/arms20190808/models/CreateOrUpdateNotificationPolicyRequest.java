// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateNotificationPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateNotificationPolicyRequest</p>
 */
public class CreateOrUpdateNotificationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirectedMode")
    private Boolean directedMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EscalationPolicyId")
    private Long escalationPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupRule")
    private String groupRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationId")
    private Long integrationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchingRules")
    private String matchingRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyTemplate")
    private String notifyTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Repeat")
    private Boolean repeat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RepeatInterval")
    private Long repeatInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SendRecoverMessage")
    private Boolean sendRecoverMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private CreateOrUpdateNotificationPolicyRequest(Builder builder) {
        super(builder);
        this.directedMode = builder.directedMode;
        this.escalationPolicyId = builder.escalationPolicyId;
        this.groupRule = builder.groupRule;
        this.id = builder.id;
        this.integrationId = builder.integrationId;
        this.matchingRules = builder.matchingRules;
        this.name = builder.name;
        this.notifyRule = builder.notifyRule;
        this.notifyTemplate = builder.notifyTemplate;
        this.regionId = builder.regionId;
        this.repeat = builder.repeat;
        this.repeatInterval = builder.repeatInterval;
        this.sendRecoverMessage = builder.sendRecoverMessage;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateNotificationPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directedMode
     */
    public Boolean getDirectedMode() {
        return this.directedMode;
    }

    /**
     * @return escalationPolicyId
     */
    public Long getEscalationPolicyId() {
        return this.escalationPolicyId;
    }

    /**
     * @return groupRule
     */
    public String getGroupRule() {
        return this.groupRule;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return integrationId
     */
    public Long getIntegrationId() {
        return this.integrationId;
    }

    /**
     * @return matchingRules
     */
    public String getMatchingRules() {
        return this.matchingRules;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyRule
     */
    public String getNotifyRule() {
        return this.notifyRule;
    }

    /**
     * @return notifyTemplate
     */
    public String getNotifyTemplate() {
        return this.notifyTemplate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeat
     */
    public Boolean getRepeat() {
        return this.repeat;
    }

    /**
     * @return repeatInterval
     */
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    /**
     * @return sendRecoverMessage
     */
    public Boolean getSendRecoverMessage() {
        return this.sendRecoverMessage;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateNotificationPolicyRequest, Builder> {
        private Boolean directedMode; 
        private Long escalationPolicyId; 
        private String groupRule; 
        private Long id; 
        private Long integrationId; 
        private String matchingRules; 
        private String name; 
        private String notifyRule; 
        private String notifyTemplate; 
        private String regionId; 
        private Boolean repeat; 
        private Long repeatInterval; 
        private Boolean sendRecoverMessage; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateNotificationPolicyRequest request) {
            super(request);
            this.directedMode = request.directedMode;
            this.escalationPolicyId = request.escalationPolicyId;
            this.groupRule = request.groupRule;
            this.id = request.id;
            this.integrationId = request.integrationId;
            this.matchingRules = request.matchingRules;
            this.name = request.name;
            this.notifyRule = request.notifyRule;
            this.notifyTemplate = request.notifyTemplate;
            this.regionId = request.regionId;
            this.repeat = request.repeat;
            this.repeatInterval = request.repeatInterval;
            this.sendRecoverMessage = request.sendRecoverMessage;
            this.state = request.state;
        } 

        /**
         * Specifies whether to enable simple mode.
         */
        public Builder directedMode(Boolean directedMode) {
            this.putBodyParameter("DirectedMode", directedMode);
            this.directedMode = directedMode;
            return this;
        }

        /**
         * The ID of the escalation policy.
         */
        public Builder escalationPolicyId(Long escalationPolicyId) {
            this.putBodyParameter("EscalationPolicyId", escalationPolicyId);
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }

        /**
         * An array of alert event group objects.
         * <p>
         * 
         * *   If you do not specify the groupingFields field, all alerts will be sent to contacts based on `alertname`.
         * *   If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.
         * 
         * Sample statement:
         * 
         *     { 
         *     "groupWait":5,    // The waiting time for grouping. 
         *     "groupInterval":30,     // The time interval of grouping. 
         *     "groupingFields":["alertname"]       // The field that is used to group alert events. 
         *     }
         */
        public Builder groupRule(String groupRule) {
            this.putBodyParameter("GroupRule", groupRule);
            this.groupRule = groupRule;
            return this;
        }

        /**
         * The ID of the notification policy.
         * <p>
         * 
         * *   If you do not specify this parameter, a new notification policy is created.
         * *   If you specify this parameter, the specified notification policy is modified.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The integration ID of the ticket system to which alerts are pushed.
         */
        public Builder integrationId(Long integrationId) {
            this.putBodyParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        /**
         * The matching rules. Format:
         * <p>
         * 
         *     [
         *      {
         *      "matchingConditions": [
         *      { 
         *      "value": "test",    // The value of the matching condition. 
         *      "key": "alertname",     // The key of the matching condition. 
         *      "operator": "eq"   // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
         *      }
         *      ]
         *      } 
         *      ]
         */
        public Builder matchingRules(String matchingRules) {
            this.putBodyParameter("MatchingRules", matchingRules);
            this.matchingRules = matchingRules;
            return this;
        }

        /**
         * The name of the notification policy.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * An array of notification rule objects. Format:
         * <p>
         * 
         *     { 
         *      "notifyStartTime":"00:00",      // The start time of the notification window. 
         *      "notifyEndTime":"23:59",       // The end time of the notification window. 
         *      "notifyChannels":["dingTalk", "email", "sms", "tts", "webhook"],       // The notification methods. Valid values: dingTalk, email, sms, tts, and webhook. 
         *      "notifyObjects":[{       // An array of notification objects. 
         *      "notifyObjectType":"CONTACT",       // The type of the notification object. Valid values: CONTACT (contact), CONTACT_GROUP (contact group), ARMS_CONTACT (ARMS contact), ARMS_CONTACT_GROUP (ARMS contact group), DING_ROBOT_GROUP (DingTalk, Lark, WeCom, or IM robot), and CONTACT_SCHEDULE (user on duty defined by a schedule). 
         *      "notifyObjectId":123,       // The ID of the notification object. 
         *      "notifyObjectName":"test"       // The name of the notification object. 
         *      }]
         */
        public Builder notifyRule(String notifyRule) {
            this.putBodyParameter("NotifyRule", notifyRule);
            this.notifyRule = notifyRule;
            return this;
        }

        /**
         * The notification template. The default notification template is provided below the table.
         */
        public Builder notifyTemplate(String notifyTemplate) {
            this.putBodyParameter("NotifyTemplate", notifyTemplate);
            this.notifyTemplate = notifyTemplate;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to resend a notification for a long-lasting unresolved alert. Default value: true. Valid values:
         * <p>
         * 
         * *   `true`: If you set this parameter to `true`, you must set **RepeatInterval**.
         * *   `false`: If you set this parameter to `false`, you must set **EscalationPolicyId**.
         */
        public Builder repeat(Boolean repeat) {
            this.putBodyParameter("Repeat", repeat);
            this.repeat = repeat;
            return this;
        }

        /**
         * The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.
         */
        public Builder repeatInterval(Long repeatInterval) {
            this.putBodyParameter("RepeatInterval", repeatInterval);
            this.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * Specifies whether the status of an alert automatically changes to Resolved when all events related to the alert change to the Restored state. ARMS notifies contacts when the alert status changes to Resolved.
         * <p>
         * 
         * *   `true`: The system sends a notification.
         * *   `false`: The system does not send a notification.
         */
        public Builder sendRecoverMessage(Boolean sendRecoverMessage) {
            this.putBodyParameter("SendRecoverMessage", sendRecoverMessage);
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }

        /**
         * Specifies whether to enable the notification policy. Valid values: enable and disable.
         */
        public Builder state(String state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public CreateOrUpdateNotificationPolicyRequest build() {
            return new CreateOrUpdateNotificationPolicyRequest(this);
        } 

    } 

}

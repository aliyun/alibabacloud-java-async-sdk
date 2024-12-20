// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>Specifies whether to enable simple mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder directedMode(Boolean directedMode) {
            this.putBodyParameter("DirectedMode", directedMode);
            this.directedMode = directedMode;
            return this;
        }

        /**
         * <p>The ID of the escalation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder escalationPolicyId(Long escalationPolicyId) {
            this.putBodyParameter("EscalationPolicyId", escalationPolicyId);
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }

        /**
         * <p>An array of alert event group objects.</p>
         * <ul>
         * <li>If you do not specify the groupingFields field, all alerts will be sent to contacts based on <code>alertname</code>.</li>
         * <li>If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.</li>
         * </ul>
         * <p>Sample statement:</p>
         * <pre><code>{ 
         * &quot;groupWait&quot;:5,    // The waiting time for grouping. 
         * &quot;groupInterval&quot;:30,     // The time interval of grouping. 
         * &quot;groupingFields&quot;:[&quot;alertname&quot;]       // The field that is used to group alert events. 
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{ 	&quot;groupWait&quot;:5, 	&quot;groupInterval&quot;:30, 	&quot;groupingFields&quot;:[&quot;alertname&quot;] }</p>
         */
        public Builder groupRule(String groupRule) {
            this.putBodyParameter("GroupRule", groupRule);
            this.groupRule = groupRule;
            return this;
        }

        /**
         * <p>The ID of the notification policy.</p>
         * <ul>
         * <li>If you do not specify this parameter, a new notification policy is created.</li>
         * <li>If you specify this parameter, the specified notification policy is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The integration ID of the ticket system to which alerts are pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        public Builder integrationId(Long integrationId) {
            this.putBodyParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        /**
         * <p>The matching rules. Format:</p>
         * <pre><code>[
         *  {
         *  &quot;matchingConditions&quot;: [
         *  { 
         *  &quot;value&quot;: &quot;test&quot;,    // The value of the matching condition. 
         *  &quot;key&quot;: &quot;alertname&quot;,     // The key of the matching condition. 
         *  &quot;operator&quot;: &quot;eq&quot;   // The logical operator of the matching condition, including eq (equal to), neq (not equal to), in (contains), nin (does not contain), re (regular expression match), and nre (regular expression mismatch).   
         *  }
         *  ]
         *  } 
         *  ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[ 		 { 		 &quot;matchingConditions&quot;: [          { 		 &quot;value&quot;: &quot;test&quot;, 		 &quot;key&quot;: &quot;alertname&quot;, 		 &quot;operator&quot;: &quot;eq&quot;         }       ]     }   ]</p>
         */
        public Builder matchingRules(String matchingRules) {
            this.putBodyParameter("MatchingRules", matchingRules);
            this.matchingRules = matchingRules;
            return this;
        }

        /**
         * <p>The name of the notification policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notificationpolicy_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>An array of notification rule objects. Format:</p>
         * <pre><code>{ 
         *  &quot;notifyStartTime&quot;:&quot;00:00&quot;,      // The start time of the notification window. 
         *  &quot;notifyEndTime&quot;:&quot;23:59&quot;,       // The end time of the notification window. 
         *  &quot;notifyChannels&quot;:[&quot;dingTalk&quot;, &quot;email&quot;, &quot;sms&quot;, &quot;tts&quot;, &quot;webhook&quot;],       // The notification methods. Valid values: dingTalk, email, sms, tts, and webhook. 
         *  &quot;notifyObjects&quot;:[{       // An array of notification objects. 
         *  &quot;notifyObjectType&quot;:&quot;CONTACT&quot;,       // The type of the notification object. Valid values: CONTACT (contact), CONTACT_GROUP (contact group), ARMS_CONTACT (ARMS contact), ARMS_CONTACT_GROUP (ARMS contact group), DING_ROBOT_GROUP (DingTalk, Lark, WeCom, or IM robot), and CONTACT_SCHEDULE (user on duty defined by a schedule). 
         *  &quot;notifyObjectId&quot;:123,       // The ID of the notification object. 
         *  &quot;notifyObjectName&quot;:&quot;test&quot;       // The name of the notification object. 
         *  }]
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;notifyStartTime&quot;:&quot;00:00&quot;,     &quot;notifyEndTime&quot;:&quot;23:59&quot;,     &quot;notifyChannels&quot;:[         &quot;dingTalk&quot;,         &quot;email&quot;,         &quot;sms&quot;,         &quot;tts&quot;,         &quot;webhook&quot;     ],     &quot;notifyObjects&quot;:[         {             &quot;notifyObjectType&quot;:&quot;CONTACT&quot;,             &quot;notifyObjectId&quot;:123,             &quot;notifyObjectName&quot;:&quot;test&quot;         }     ] }</p>
         */
        public Builder notifyRule(String notifyRule) {
            this.putBodyParameter("NotifyRule", notifyRule);
            this.notifyRule = notifyRule;
            return this;
        }

        /**
         * <p>The notification template. The default notification template is provided below the table.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;robotContent&quot;:&quot;{{if .commonLabels.clustername }} &gt; Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} &gt; Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}{{ for .alerts }} &gt; {{.annotations.message}} {{if .generatorURL }} [Link]({{.generatorURL}}) {{ end }} {{if eq &quot;true&quot; .labels._aliyun_arms_is_denoise_filtered }} (Suspected noise) {{end}} {{end}}&quot;</p>
         */
        public Builder notifyTemplate(String notifyTemplate) {
            this.putBodyParameter("NotifyTemplate", notifyTemplate);
            this.notifyTemplate = notifyTemplate;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to resend a notification for a long-lasting unresolved alert. Default value: true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: If you set this parameter to <code>true</code>, you must set <strong>RepeatInterval</strong>.</li>
         * <li><code>false</code>: If you set this parameter to <code>false</code>, you must set <strong>EscalationPolicyId</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder repeat(Boolean repeat) {
            this.putBodyParameter("Repeat", repeat);
            this.repeat = repeat;
            return this;
        }

        /**
         * <p>The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder repeatInterval(Long repeatInterval) {
            this.putBodyParameter("RepeatInterval", repeatInterval);
            this.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * <p>Specifies whether the status of an alert automatically changes to Resolved when all events related to the alert change to the Restored state. ARMS notifies contacts when the alert status changes to Resolved.</p>
         * <ul>
         * <li><code>true</code>: The system sends a notification.</li>
         * <li><code>false</code>: The system does not send a notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sendRecoverMessage(Boolean sendRecoverMessage) {
            this.putBodyParameter("SendRecoverMessage", sendRecoverMessage);
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }

        /**
         * <p>Specifies whether to enable the notification policy. Valid values: enable and disable.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
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

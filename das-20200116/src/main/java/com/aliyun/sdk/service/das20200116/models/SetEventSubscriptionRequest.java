// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEventSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>SetEventSubscriptionRequest</p>
 */
public class SetEventSubscriptionRequest extends Request {
    @Query
    @NameInMap("Active")
    private String active;

    @Query
    @NameInMap("ChannelType")
    private String channelType;

    @Query
    @NameInMap("ContactGroupName")
    private String contactGroupName;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("DispatchRule")
    private String dispatchRule;

    @Query
    @NameInMap("EventContext")
    private String eventContext;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("MinInterval")
    private String minInterval;

    @Query
    @NameInMap("Severity")
    private String severity;

    private SetEventSubscriptionRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.channelType = builder.channelType;
        this.contactGroupName = builder.contactGroupName;
        this.contactName = builder.contactName;
        this.dispatchRule = builder.dispatchRule;
        this.eventContext = builder.eventContext;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.level = builder.level;
        this.minInterval = builder.minInterval;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEventSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public String getActive() {
        return this.active;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return dispatchRule
     */
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    /**
     * @return eventContext
     */
    public String getEventContext() {
        return this.eventContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return minInterval
     */
    public String getMinInterval() {
        return this.minInterval;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<SetEventSubscriptionRequest, Builder> {
        private String active; 
        private String channelType; 
        private String contactGroupName; 
        private String contactName; 
        private String dispatchRule; 
        private String eventContext; 
        private String instanceId; 
        private String lang; 
        private String level; 
        private String minInterval; 
        private String severity; 

        private Builder() {
            super();
        } 

        private Builder(SetEventSubscriptionRequest request) {
            super(request);
            this.active = request.active;
            this.channelType = request.channelType;
            this.contactGroupName = request.contactGroupName;
            this.contactName = request.contactName;
            this.dispatchRule = request.dispatchRule;
            this.eventContext = request.eventContext;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.level = request.level;
            this.minInterval = request.minInterval;
            this.severity = request.severity;
        } 

        /**
         * Specifies whether to enable the event subscription feature. Valid values:
         * <p>
         * 
         * *   **0**: disables the event subscription feature.
         * *   **1**: enables the event subscription feature.
         */
        public Builder active(String active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * The notification method. Valid values:
         * <p>
         * 
         * *   **hdm_alarm_sms**: text message.
         * *   **dingtalk**: DingTalk chatbot.
         * *   **hdm_alarm_sms_and_email**: text message and email.
         * *   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * The name of the contact group that receives alert notifications. Separate multiple names with commas (,).
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * The name of the contact who receives alert notifications. Separate multiple names with commas (,).
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The notification rules based on the event type. If you leave this parameter empty, the values of **MinInterval** and **ChannelType** prevail.
         * <p>
         * 
         * Specify this parameter in the following format: `{"silenced": {"Event type 1":Specifies whether to enable adaptive silence, "Event type 2":Specify whether to enable adaptive silence},"min_interval": {"Event type 1":Minimum interval between event notifications, "Event type 2":Minimum interval between event notifications},"alert_type": {"Event type 1":"Notification method", "Event type 2":"Notification method"}}`.
         * 
         * *   **silenced**: specifies whether to enable adaptive silence. After you enable adaptive silence, the interval between consecutive alert notifications for an event is the greater one of the minimum interval specified by **min_interval** and one third of the event duration. Valid values:
         * 
         *     *   1: enables adaptive silence.
         *     *   2: disables adaptive silence.
         * 
         * *   **min_interval**: the minimum interval between event notifications. Unit: seconds.
         * 
         * *   **alert_type**: the notification method. Valid values:
         * 
         *     *   **hdm_alarm_sms**: text message.
         *     *   **dingtalk**: DingTalk chatbot.
         *     *   **hdm_alarm_sms_and_email**: text message and email.
         *     *   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.
         */
        public Builder dispatchRule(String dispatchRule) {
            this.putQueryParameter("DispatchRule", dispatchRule);
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * The supported event scenarios. You can set the value to **AllContext**, which indicates that all scenarios are supported.
         */
        public Builder eventContext(String eventContext) {
            this.putQueryParameter("EventContext", eventContext);
            this.eventContext = eventContext;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of event notifications. You can set the value to **zh-CN**, which indicates that event notifications are sent in Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The risk level of the events. Valid values:
         * <p>
         * 
         * *   **Notice**: events that trigger notifications, including events at the **Notice**, **Optimization**, **Warn**, and **Critical** levels.
         * *   **Optimization**: events that trigger optimizations, including events at the **Optimization**, **Warn**, and **Critical** levels.
         * *   **Warn**: events that trigger warnings, including events at the **Warn** and **Critical** levels.
         * *   **Critical**: events that trigger critical warnings.****
         * 
         * The following content describes the events at each level in detail:
         * 
         * *   Notice: events that are related to database exceptions for which no suggestions are generated.
         * *   Optimization: events for which optimization suggestions are generated based on the status of the database.
         * *   Warn: events that may affect the running of the database.
         * *   Critical: events that affect the running of the database.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The minimum interval between consecutive event notifications. Unit: seconds.
         */
        public Builder minInterval(String minInterval) {
            this.putQueryParameter("MinInterval", minInterval);
            this.minInterval = minInterval;
            return this;
        }

        /**
         * The alert severity based on the event type.
         * <p>
         * 
         * Specify this parameter in the following format: `{"Event type 1":"Alert severity", "Event type 2":"Alert severity"}`.
         * 
         * Valid values of event types:
         * 
         * *   **AutoScale**: auto scaling event.
         * *   **SQLThrottle**: throttling event.
         * *   **TimeSeriesAbnormal**: event for detecting time series anomalies.
         * *   **SQLOptimize**: SQL optimization event.
         * *   **ResourceOptimize**: storage optimization event.
         * 
         * Valid values of alert severities:
         * 
         * *   **info**
         * *   **noticed**
         * *   **warning**
         * *   **critical**
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public SetEventSubscriptionRequest build() {
            return new SetEventSubscriptionRequest(this);
        } 

    } 

}

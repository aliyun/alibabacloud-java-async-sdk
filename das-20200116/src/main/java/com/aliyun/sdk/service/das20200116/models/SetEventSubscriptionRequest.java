// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link SetEventSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>SetEventSubscriptionRequest</p>
 */
public class SetEventSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private String active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    private String contactGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchRule")
    private String dispatchRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventContext")
    private String eventContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinInterval")
    private String minInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
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
         * <p>Specifies whether to enable the event subscription feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables the event subscription feature.</li>
         * <li><strong>1</strong>: enables the event subscription feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(String active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li><strong>hdm_alarm_sms</strong>: text message.</li>
         * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
         * <li><strong>hdm_alarm_sms_and_email</strong>: text message and email.</li>
         * <li><strong>hdm_alarm_sms,dingtalk</strong>: text message and DingTalk chatbot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hdm_alarm_sms,dingtalk</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The name of the contact group that receives alert notifications. Separate multiple names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Default contact group</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The name of the contact who receives alert notifications. Separate multiple names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Default contact</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The notification rules based on the event type. If you leave this parameter empty, the values of <strong>MinInterval</strong> and <strong>ChannelType</strong> prevail.</p>
         * <p>Specify this parameter in the following format: <code>{&quot;silenced&quot;: {&quot;Event type 1&quot;:Specifies whether to enable adaptive silence, &quot;Event type 2&quot;:Specify whether to enable adaptive silence},&quot;min_interval&quot;: {&quot;Event type 1&quot;:Minimum interval between event notifications, &quot;Event type 2&quot;:Minimum interval between event notifications},&quot;alert_type&quot;: {&quot;Event type 1&quot;:&quot;Notification method&quot;, &quot;Event type 2&quot;:&quot;Notification method&quot;}}</code>.</p>
         * <ul>
         * <li><p><strong>silenced</strong>: specifies whether to enable adaptive silence. After you enable adaptive silence, the interval between consecutive alert notifications for an event is the greater one of the minimum interval specified by <strong>min_interval</strong> and one third of the event duration. Valid values:</p>
         * <ul>
         * <li>1: enables adaptive silence.</li>
         * <li>2: disables adaptive silence.</li>
         * </ul>
         * </li>
         * <li><p><strong>min_interval</strong>: the minimum interval between event notifications. Unit: seconds.</p>
         * </li>
         * <li><p><strong>alert_type</strong>: the notification method. Valid values:</p>
         * <ul>
         * <li><strong>hdm_alarm_sms</strong>: text message.</li>
         * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
         * <li><strong>hdm_alarm_sms_and_email</strong>: text message and email.</li>
         * <li><strong>hdm_alarm_sms,dingtalk</strong>: text message and DingTalk chatbot.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;silenced&quot;: {&quot;AutoScale&quot;:1, &quot;SQLThrottle&quot;:0, &quot;TimeSeriesAbnormal&quot;: 1}, &quot;min_interval&quot;: {&quot;AutoScale&quot;:300, &quot;SQLThrottle&quot;:360, &quot;TimeSeriesAbnormal&quot;: 120}, &quot;alert_type&quot;: {&quot;AutoScale&quot;:&quot;hdm_alarm_sms&quot;, &quot;SQLThrottle&quot;:&quot;hdm_alarm_sms_and_email&quot;, &quot;TimeSeriesAbnormal&quot;: &quot;hdm_alarm_sms,dingtalk&quot;}}</p>
         */
        public Builder dispatchRule(String dispatchRule) {
            this.putQueryParameter("DispatchRule", dispatchRule);
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * <p>The supported event scenarios. You can set the value to <strong>AllContext</strong>, which indicates that all scenarios are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AllContext</p>
         */
        public Builder eventContext(String eventContext) {
            this.putQueryParameter("EventContext", eventContext);
            this.eventContext = eventContext;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of event notifications. You can set the value to <strong>zh-CN</strong>, which indicates that event notifications are sent in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The risk level of the events. Valid values:</p>
         * <ul>
         * <li><strong>Notice</strong>: events that trigger notifications, including events at the <strong>Notice</strong>, <strong>Optimization</strong>, <strong>Warn</strong>, and <strong>Critical</strong> levels.</li>
         * <li><strong>Optimization</strong>: events that trigger optimizations, including events at the <strong>Optimization</strong>, <strong>Warn</strong>, and <strong>Critical</strong> levels.</li>
         * <li><strong>Warn</strong>: events that trigger warnings, including events at the <strong>Warn</strong> and <strong>Critical</strong> levels.</li>
         * <li><strong>Critical</strong>: events that trigger critical warnings.</li>
         * </ul>
         * <p>The following content describes the events at each level in detail:</p>
         * <ul>
         * <li>Notice: events that are related to database exceptions for which no suggestions are generated.</li>
         * <li>Optimization: events for which optimization suggestions are generated based on the status of the database.</li>
         * <li>Warn: events that may affect the running of the database.</li>
         * <li>Critical: events that affect the running of the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Optimization</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The minimum interval between consecutive event notifications. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder minInterval(String minInterval) {
            this.putQueryParameter("MinInterval", minInterval);
            this.minInterval = minInterval;
            return this;
        }

        /**
         * <p>The alert severity based on the event type.</p>
         * <p>Specify this parameter in the following format: <code>{&quot;Event type 1&quot;:&quot;Alert severity&quot;, &quot;Event type 2&quot;:&quot;Alert severity&quot;}</code>.</p>
         * <p>Valid values of event types:</p>
         * <ul>
         * <li><strong>AutoScale</strong>: auto scaling event.</li>
         * <li><strong>SQLThrottle</strong>: throttling event.</li>
         * <li><strong>TimeSeriesAbnormal</strong>: event for detecting time series anomalies.</li>
         * <li><strong>SQLOptimize</strong>: SQL optimization event.</li>
         * <li><strong>ResourceOptimize</strong>: storage optimization event.</li>
         * </ul>
         * <p>Valid values of alert severities:</p>
         * <ul>
         * <li><strong>info</strong></li>
         * <li><strong>noticed</strong></li>
         * <li><strong>warning</strong></li>
         * <li><strong>critical</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AutoScale&quot;:&quot;critical&quot;,&quot;SQLThrottle&quot;:&quot;info&quot;,&quot;TimeSeriesAbnormal&quot;:&quot;warning&quot;}</p>
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

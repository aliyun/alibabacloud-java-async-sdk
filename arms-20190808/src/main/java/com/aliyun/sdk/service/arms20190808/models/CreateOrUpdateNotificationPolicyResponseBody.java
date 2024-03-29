// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
 */
public class CreateOrUpdateNotificationPolicyResponseBody extends TeaModel {
    @NameInMap("NotificationPolicy")
    private NotificationPolicy notificationPolicy;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateNotificationPolicyResponseBody(Builder builder) {
        this.notificationPolicy = builder.notificationPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateNotificationPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return notificationPolicy
     */
    public NotificationPolicy getNotificationPolicy() {
        return this.notificationPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NotificationPolicy notificationPolicy; 
        private String requestId; 

        /**
         * An array of notification policy objects.
         */
        public Builder notificationPolicy(NotificationPolicy notificationPolicy) {
            this.notificationPolicy = notificationPolicy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateNotificationPolicyResponseBody build() {
            return new CreateOrUpdateNotificationPolicyResponseBody(this);
        } 

    } 

    public static class GroupRule extends TeaModel {
        @NameInMap("GroupInterval")
        private Long groupInterval;

        @NameInMap("GroupWait")
        private Long groupWait;

        @NameInMap("GroupingFields")
        private java.util.List < String > groupingFields;

        private GroupRule(Builder builder) {
            this.groupInterval = builder.groupInterval;
            this.groupWait = builder.groupWait;
            this.groupingFields = builder.groupingFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupRule create() {
            return builder().build();
        }

        /**
         * @return groupInterval
         */
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        /**
         * @return groupWait
         */
        public Long getGroupWait() {
            return this.groupWait;
        }

        /**
         * @return groupingFields
         */
        public java.util.List < String > getGroupingFields() {
            return this.groupingFields;
        }

        public static final class Builder {
            private Long groupInterval; 
            private Long groupWait; 
            private java.util.List < String > groupingFields; 

            /**
             * The time interval of grouping. Unit: seconds. Default value: 30.
             */
            public Builder groupInterval(Long groupInterval) {
                this.groupInterval = groupInterval;
                return this;
            }

            /**
             * The waiting time for grouping. Unit: seconds. Default value: 5.
             */
            public Builder groupWait(Long groupWait) {
                this.groupWait = groupWait;
                return this;
            }

            /**
             * The field that is used for grouping.
             */
            public Builder groupingFields(java.util.List < String > groupingFields) {
                this.groupingFields = groupingFields;
                return this;
            }

            public GroupRule build() {
                return new GroupRule(this);
            } 

        } 

    }
    public static class MatchingConditions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private MatchingConditions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingConditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * The key of the matching condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The logical operator of the matching condition. Valid values:
             * <p>
             * 
             * *   `eq`: equal to
             * *   `neq`: not equal to
             * *   `in`: contains
             * *   `nin`: does not contain
             * *   `re`: regular expression match
             * *   `nre`: regular expression mismatch
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The value of the matching condition.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchingConditions build() {
                return new MatchingConditions(this);
            } 

        } 

    }
    public static class MatchingRules extends TeaModel {
        @NameInMap("MatchingConditions")
        private java.util.List < MatchingConditions> matchingConditions;

        private MatchingRules(Builder builder) {
            this.matchingConditions = builder.matchingConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingRules create() {
            return builder().build();
        }

        /**
         * @return matchingConditions
         */
        public java.util.List < MatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

        public static final class Builder {
            private java.util.List < MatchingConditions> matchingConditions; 

            /**
             * An array of alert event matching condition objects.
             */
            public Builder matchingConditions(java.util.List < MatchingConditions> matchingConditions) {
                this.matchingConditions = matchingConditions;
                return this;
            }

            public MatchingRules build() {
                return new MatchingRules(this);
            } 

        } 

    }
    public static class NotifyObjects extends TeaModel {
        @NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("NotifyObjectId")
        private Long notifyObjectId;

        @NameInMap("NotifyObjectName")
        private String notifyObjectName;

        @NameInMap("NotifyObjectType")
        private String notifyObjectType;

        private NotifyObjects(Builder builder) {
            this.notifyChannels = builder.notifyChannels;
            this.notifyObjectId = builder.notifyObjectId;
            this.notifyObjectName = builder.notifyObjectName;
            this.notifyObjectType = builder.notifyObjectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyObjects create() {
            return builder().build();
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return notifyObjectId
         */
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        /**
         * @return notifyObjectName
         */
        public String getNotifyObjectName() {
            return this.notifyObjectName;
        }

        /**
         * @return notifyObjectType
         */
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

        public static final class Builder {
            private java.util.List < String > notifyChannels; 
            private Long notifyObjectId; 
            private String notifyObjectName; 
            private String notifyObjectType; 

            /**
             * 通知对象为联系人时的单独的联系方式
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The ID of the notification contact.
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * The name of the notification contact.
             */
            public Builder notifyObjectName(String notifyObjectName) {
                this.notifyObjectName = notifyObjectName;
                return this;
            }

            /**
             * The type of the notification contact. Valid values: 
             * <p>
             * 
             * - CONTACT: an individual contact
             * - CONTACT_GROUP: a contact group
             * - DING_ROBOT: an instant messaging (IM) robot
             * - CONTACT_SCHEDULE: a person on duty based on an established schedule
             */
            public Builder notifyObjectType(String notifyObjectType) {
                this.notifyObjectType = notifyObjectType;
                return this;
            }

            public NotifyObjects build() {
                return new NotifyObjects(this);
            } 

        } 

    }
    public static class NotifyRule extends TeaModel {
        @NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("NotifyEndTime")
        private String notifyEndTime;

        @NameInMap("NotifyObjects")
        private java.util.List < NotifyObjects> notifyObjects;

        @NameInMap("NotifyStartTime")
        private String notifyStartTime;

        private NotifyRule(Builder builder) {
            this.notifyChannels = builder.notifyChannels;
            this.notifyEndTime = builder.notifyEndTime;
            this.notifyObjects = builder.notifyObjects;
            this.notifyStartTime = builder.notifyStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyRule create() {
            return builder().build();
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return notifyEndTime
         */
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        /**
         * @return notifyObjects
         */
        public java.util.List < NotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        /**
         * @return notifyStartTime
         */
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

        public static final class Builder {
            private java.util.List < String > notifyChannels; 
            private String notifyEndTime; 
            private java.util.List < NotifyObjects> notifyObjects; 
            private String notifyStartTime; 

            /**
             * The notification methods. Valid values: 
             * <p>
             * 
             * - `dingTalk`: DingTalk
             * - `email`: email
             * - `sms`: text message
             * - `tts`: phone call
             * - `webhook`: webhook
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The end time of the notification window.
             */
            public Builder notifyEndTime(String notifyEndTime) {
                this.notifyEndTime = notifyEndTime;
                return this;
            }

            /**
             * An array of notification contact objects.
             */
            public Builder notifyObjects(java.util.List < NotifyObjects> notifyObjects) {
                this.notifyObjects = notifyObjects;
                return this;
            }

            /**
             * The start time of the notification window.
             */
            public Builder notifyStartTime(String notifyStartTime) {
                this.notifyStartTime = notifyStartTime;
                return this;
            }

            public NotifyRule build() {
                return new NotifyRule(this);
            } 

        } 

    }
    public static class NotifyTemplate extends TeaModel {
        @NameInMap("EmailContent")
        private String emailContent;

        @NameInMap("EmailRecoverContent")
        private String emailRecoverContent;

        @NameInMap("EmailRecoverTitle")
        private String emailRecoverTitle;

        @NameInMap("EmailTitle")
        private String emailTitle;

        @NameInMap("RobotContent")
        private String robotContent;

        @NameInMap("SmsContent")
        private String smsContent;

        @NameInMap("SmsRecoverContent")
        private String smsRecoverContent;

        @NameInMap("TtsContent")
        private String ttsContent;

        @NameInMap("TtsRecoverContent")
        private String ttsRecoverContent;

        private NotifyTemplate(Builder builder) {
            this.emailContent = builder.emailContent;
            this.emailRecoverContent = builder.emailRecoverContent;
            this.emailRecoverTitle = builder.emailRecoverTitle;
            this.emailTitle = builder.emailTitle;
            this.robotContent = builder.robotContent;
            this.smsContent = builder.smsContent;
            this.smsRecoverContent = builder.smsRecoverContent;
            this.ttsContent = builder.ttsContent;
            this.ttsRecoverContent = builder.ttsRecoverContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyTemplate create() {
            return builder().build();
        }

        /**
         * @return emailContent
         */
        public String getEmailContent() {
            return this.emailContent;
        }

        /**
         * @return emailRecoverContent
         */
        public String getEmailRecoverContent() {
            return this.emailRecoverContent;
        }

        /**
         * @return emailRecoverTitle
         */
        public String getEmailRecoverTitle() {
            return this.emailRecoverTitle;
        }

        /**
         * @return emailTitle
         */
        public String getEmailTitle() {
            return this.emailTitle;
        }

        /**
         * @return robotContent
         */
        public String getRobotContent() {
            return this.robotContent;
        }

        /**
         * @return smsContent
         */
        public String getSmsContent() {
            return this.smsContent;
        }

        /**
         * @return smsRecoverContent
         */
        public String getSmsRecoverContent() {
            return this.smsRecoverContent;
        }

        /**
         * @return ttsContent
         */
        public String getTtsContent() {
            return this.ttsContent;
        }

        /**
         * @return ttsRecoverContent
         */
        public String getTtsRecoverContent() {
            return this.ttsRecoverContent;
        }

        public static final class Builder {
            private String emailContent; 
            private String emailRecoverContent; 
            private String emailRecoverTitle; 
            private String emailTitle; 
            private String robotContent; 
            private String smsContent; 
            private String smsRecoverContent; 
            private String ttsContent; 
            private String ttsRecoverContent; 

            /**
             * The content of the alert notification sent through email.
             */
            public Builder emailContent(String emailContent) {
                this.emailContent = emailContent;
                return this;
            }

            /**
             * The content of the alert resolution notification sent through email.
             */
            public Builder emailRecoverContent(String emailRecoverContent) {
                this.emailRecoverContent = emailRecoverContent;
                return this;
            }

            /**
             * The title of the alert resolution notification sent through email.
             */
            public Builder emailRecoverTitle(String emailRecoverTitle) {
                this.emailRecoverTitle = emailRecoverTitle;
                return this;
            }

            /**
             * The title of the alert notification sent through email.
             */
            public Builder emailTitle(String emailTitle) {
                this.emailTitle = emailTitle;
                return this;
            }

            /**
             * The content of the alert notification sent by the IM robot.
             */
            public Builder robotContent(String robotContent) {
                this.robotContent = robotContent;
                return this;
            }

            /**
             * The content of the alert notification sent through text message.
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * The content of the alert resolution notification sent through text message.
             */
            public Builder smsRecoverContent(String smsRecoverContent) {
                this.smsRecoverContent = smsRecoverContent;
                return this;
            }

            /**
             * The content of the alert notification by phone.
             */
            public Builder ttsContent(String ttsContent) {
                this.ttsContent = ttsContent;
                return this;
            }

            /**
             * The content of the alert resolution notification by phone.
             */
            public Builder ttsRecoverContent(String ttsRecoverContent) {
                this.ttsRecoverContent = ttsRecoverContent;
                return this;
            }

            public NotifyTemplate build() {
                return new NotifyTemplate(this);
            } 

        } 

    }
    public static class NotificationPolicy extends TeaModel {
        @NameInMap("DirectedMode")
        private Boolean directedMode;

        @NameInMap("EscalationPolicyId")
        private Long escalationPolicyId;

        @NameInMap("GroupRule")
        private GroupRule groupRule;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IntegrationId")
        private Long integrationId;

        @NameInMap("MatchingRules")
        private java.util.List < MatchingRules> matchingRules;

        @NameInMap("Name")
        private String name;

        @NameInMap("NotifyRule")
        private NotifyRule notifyRule;

        @NameInMap("NotifyTemplate")
        private NotifyTemplate notifyTemplate;

        @NameInMap("Repeat")
        private Boolean repeat;

        @NameInMap("RepeatInterval")
        private Long repeatInterval;

        @NameInMap("SendRecoverMessage")
        private Boolean sendRecoverMessage;

        private NotificationPolicy(Builder builder) {
            this.directedMode = builder.directedMode;
            this.escalationPolicyId = builder.escalationPolicyId;
            this.groupRule = builder.groupRule;
            this.id = builder.id;
            this.integrationId = builder.integrationId;
            this.matchingRules = builder.matchingRules;
            this.name = builder.name;
            this.notifyRule = builder.notifyRule;
            this.notifyTemplate = builder.notifyTemplate;
            this.repeat = builder.repeat;
            this.repeatInterval = builder.repeatInterval;
            this.sendRecoverMessage = builder.sendRecoverMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationPolicy create() {
            return builder().build();
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
        public GroupRule getGroupRule() {
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
        public java.util.List < MatchingRules> getMatchingRules() {
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
        public NotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        /**
         * @return notifyTemplate
         */
        public NotifyTemplate getNotifyTemplate() {
            return this.notifyTemplate;
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

        public static final class Builder {
            private Boolean directedMode; 
            private Long escalationPolicyId; 
            private GroupRule groupRule; 
            private Long id; 
            private Long integrationId; 
            private java.util.List < MatchingRules> matchingRules; 
            private String name; 
            private NotifyRule notifyRule; 
            private NotifyTemplate notifyTemplate; 
            private Boolean repeat; 
            private Long repeatInterval; 
            private Boolean sendRecoverMessage; 

            /**
             * 极简模式
             */
            public Builder directedMode(Boolean directedMode) {
                this.directedMode = directedMode;
                return this;
            }

            /**
             * The ID of the escalation policy.
             */
            public Builder escalationPolicyId(Long escalationPolicyId) {
                this.escalationPolicyId = escalationPolicyId;
                return this;
            }

            /**
             * An array of alert event group objects.
             */
            public Builder groupRule(GroupRule groupRule) {
                this.groupRule = groupRule;
                return this;
            }

            /**
             * The ID of the notification policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The integration ID of the ticket system to which alerts are pushed.
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * An array of alert event matching rule objects.
             */
            public Builder matchingRules(java.util.List < MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * The name of the notification policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * An array of notification rule objects.
             */
            public Builder notifyRule(NotifyRule notifyRule) {
                this.notifyRule = notifyRule;
                return this;
            }

            /**
             * An array of notification template objects.
             */
            public Builder notifyTemplate(NotifyTemplate notifyTemplate) {
                this.notifyTemplate = notifyTemplate;
                return this;
            }

            /**
             * Indicates whether a notification is resent for a long-lasting unresolved alert. Default value: true. Valid values:  
             * <p>
             * 
             * - `true`: The system resends a notification for a long-lasting unresolved alert at a specified time interval.
             * - `false`: The system sends a notification for a long-lasting unresolved alert based on an escalation policy.
             */
            public Builder repeat(Boolean repeat) {
                this.repeat = repeat;
                return this;
            }

            /**
             * The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * Indicates whether the system sends a notification to the contacts when the status of an alert changes to Resolved. Default value: true. Valid values:   
             * <p>
             * 
             * - `true`: The system sends a notification.
             * - `false`: The system does not send a notification.
             */
            public Builder sendRecoverMessage(Boolean sendRecoverMessage) {
                this.sendRecoverMessage = sendRecoverMessage;
                return this;
            }

            public NotificationPolicy build() {
                return new NotificationPolicy(this);
            } 

        } 

    }
}

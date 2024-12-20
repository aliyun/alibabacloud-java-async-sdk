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
 * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
 */
public class CreateOrUpdateNotificationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotificationPolicy")
    private NotificationPolicy notificationPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array of notification policy objects.</p>
         */
        public Builder notificationPolicy(NotificationPolicy notificationPolicy) {
            this.notificationPolicy = notificationPolicy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateNotificationPolicyResponseBody build() {
            return new CreateOrUpdateNotificationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class GroupRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupInterval")
        private Long groupInterval;

        @com.aliyun.core.annotation.NameInMap("GroupWait")
        private Long groupWait;

        @com.aliyun.core.annotation.NameInMap("GroupingFields")
        private java.util.List<String> groupingFields;

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
        public java.util.List<String> getGroupingFields() {
            return this.groupingFields;
        }

        public static final class Builder {
            private Long groupInterval; 
            private Long groupWait; 
            private java.util.List<String> groupingFields; 

            /**
             * <p>The time interval of grouping. Unit: seconds. Default value: 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder groupInterval(Long groupInterval) {
                this.groupInterval = groupInterval;
                return this;
            }

            /**
             * <p>The waiting time for grouping. Unit: seconds. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder groupWait(Long groupWait) {
                this.groupWait = groupWait;
                return this;
            }

            /**
             * <p>An array of alert event group objects.</p>
             * <ul>
             * <li>If you do not specify the groupingFields field, all alerts will be sent to contacts based on <code>alertname</code>.</li>
             * <li>If you specify the groupingFields field, alerts with the same field will be sent to contacts in one notification.</li>
             * </ul>
             */
            public Builder groupingFields(java.util.List<String> groupingFields) {
                this.groupingFields = groupingFields;
                return this;
            }

            public GroupRule build() {
                return new GroupRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class MatchingConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the matching condition.</p>
             * 
             * <strong>example:</strong>
             * <p>altertname</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The logical operator of the matching condition. Valid values:</p>
             * <ul>
             * <li><code>eq</code>: equal to</li>
             * <li><code>neq</code>: not equal to</li>
             * <li><code>in</code>: contains</li>
             * <li><code>nin</code>: does not contain</li>
             * <li><code>re</code>: regular expression match</li>
             * <li><code>nre</code>: regular expression mismatch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value of the matching condition.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class MatchingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchingConditions")
        private java.util.List<MatchingConditions> matchingConditions;

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
        public java.util.List<MatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

        public static final class Builder {
            private java.util.List<MatchingConditions> matchingConditions; 

            /**
             * <p>The matching conditions.</p>
             */
            public Builder matchingConditions(java.util.List<MatchingConditions> matchingConditions) {
                this.matchingConditions = matchingConditions;
                return this;
            }

            public MatchingRules build() {
                return new MatchingRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class NotifyObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List<String> notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyObjectId")
        private Long notifyObjectId;

        @com.aliyun.core.annotation.NameInMap("NotifyObjectName")
        private String notifyObjectName;

        @com.aliyun.core.annotation.NameInMap("NotifyObjectType")
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
        public java.util.List<String> getNotifyChannels() {
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
            private java.util.List<String> notifyChannels; 
            private Long notifyObjectId; 
            private String notifyObjectName; 
            private String notifyObjectType; 

            /**
             * <p>The notification methods specified for a contact.</p>
             */
            public Builder notifyChannels(java.util.List<String> notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * <p>The ID of the notification object.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * <p>The name of the notification object.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder notifyObjectName(String notifyObjectName) {
                this.notifyObjectName = notifyObjectName;
                return this;
            }

            /**
             * <p>The type of the notification object. Valid values:</p>
             * <ul>
             * <li>CONTACT: contact</li>
             * <li>CONTACT_GROUP: contact group</li>
             * <li>ARMS_CONTACT: ARMS contact</li>
             * <li>ARMS_CONTACT_GROUP: ARMS contact group</li>
             * <li>DING_ROBOT_GROUP: DingTalk, Lark, WeCom, or IM robot</li>
             * <li>CONTACT_SCHEDULE: user on duty defined by a schedule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONTACT</p>
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
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class NotifyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List<String> notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyEndTime")
        private String notifyEndTime;

        @com.aliyun.core.annotation.NameInMap("NotifyObjects")
        private java.util.List<NotifyObjects> notifyObjects;

        @com.aliyun.core.annotation.NameInMap("NotifyStartTime")
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
        public java.util.List<String> getNotifyChannels() {
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
        public java.util.List<NotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        /**
         * @return notifyStartTime
         */
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

        public static final class Builder {
            private java.util.List<String> notifyChannels; 
            private String notifyEndTime; 
            private java.util.List<NotifyObjects> notifyObjects; 
            private String notifyStartTime; 

            /**
             * <p>The notification method.</p>
             */
            public Builder notifyChannels(java.util.List<String> notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * <p>The end time of the notification window.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59</p>
             */
            public Builder notifyEndTime(String notifyEndTime) {
                this.notifyEndTime = notifyEndTime;
                return this;
            }

            /**
             * <p>An array of notification objects.</p>
             */
            public Builder notifyObjects(java.util.List<NotifyObjects> notifyObjects) {
                this.notifyObjects = notifyObjects;
                return this;
            }

            /**
             * <p>The start time of the notification window.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
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
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class NotifyTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmailContent")
        private String emailContent;

        @com.aliyun.core.annotation.NameInMap("EmailRecoverContent")
        private String emailRecoverContent;

        @com.aliyun.core.annotation.NameInMap("EmailRecoverTitle")
        private String emailRecoverTitle;

        @com.aliyun.core.annotation.NameInMap("EmailTitle")
        private String emailTitle;

        @com.aliyun.core.annotation.NameInMap("RobotContent")
        private String robotContent;

        @com.aliyun.core.annotation.NameInMap("SmsContent")
        private String smsContent;

        @com.aliyun.core.annotation.NameInMap("SmsRecoverContent")
        private String smsRecoverContent;

        @com.aliyun.core.annotation.NameInMap("TtsContent")
        private String ttsContent;

        @com.aliyun.core.annotation.NameInMap("TtsRecoverContent")
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
             * <p>The content of the alert notification sent through email.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert time: {{ .startTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{if .generatorURL }} &lt;a href=&quot;{{.generatorURL}}&quot; &gt;Link&lt;/a&gt; {{end}} {{end}}</p>
             */
            public Builder emailContent(String emailContent) {
                this.emailContent = emailContent;
                return this;
            }

            /**
             * <p>The content of the alert resolution notification sent through email.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert resolution time: {{ .endTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{if .generatorURL }} &lt;a href=&quot;{{.generatorURL}}&quot; &gt;Link&lt;/a&gt; {{end}} {{end}}</p>
             */
            public Builder emailRecoverContent(String emailRecoverContent) {
                this.emailRecoverContent = emailRecoverContent;
                return this;
            }

            /**
             * <p>The title of the alert resolution notification sent through email.</p>
             * 
             * <strong>example:</strong>
             * <p>{{ .commonLabels.alertname }}</p>
             */
            public Builder emailRecoverTitle(String emailRecoverTitle) {
                this.emailRecoverTitle = emailRecoverTitle;
                return this;
            }

            /**
             * <p>The title of the alert notification sent through email.</p>
             * 
             * <strong>example:</strong>
             * <p>{{ .commonLabels.alertname }}</p>
             */
            public Builder emailTitle(String emailTitle) {
                this.emailTitle = emailTitle;
                return this;
            }

            /**
             * <p>The content of the alert notification sent by the IM robot.</p>
             * 
             * <strong>example:</strong>
             * <p>{{if .commonLabels.clustername }} &gt; Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} &gt; Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}{{ for .alerts }}&gt; {{.annotations.message}} {{if .generatorURL }} [Link]({{.generatorURL}}) {{ end }} {{if eq &quot;true&quot; .labels._aliyun_arms_is_denoise_filtered }} (Suspected noise) {{end}} {{end}}</p>
             */
            public Builder robotContent(String robotContent) {
                this.robotContent = robotContent;
                return this;
            }

            /**
             * <p>The content of the alert notification sent through text message.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;SmsContent&gt;Notification on the occurrence of a {{ .level }} alert. Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert time: {{ .startTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{ end }}&lt;/SmsContent&gt;</p>
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * <p>The content of the alert resolution notification sent through text message.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;SmsRecoverContent&gt;Alert resolution notification. Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert resolution time: {{ .endTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{ end }}&lt;/SmsRecoverContent&gt;</p>
             */
            public Builder smsRecoverContent(String smsRecoverContent) {
                this.smsRecoverContent = smsRecoverContent;
                return this;
            }

            /**
             * <p>The content of the alert notification by phone.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;TtsContent&gt;Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert time: {{ .startTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{ end }}&lt;/TtsContent&gt;</p>
             */
            public Builder ttsContent(String ttsContent) {
                this.ttsContent = ttsContent;
                return this;
            }

            /**
             * <p>The content of the alert resolution notification by phone.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;TtsRecoverContent&gt;Alert name: {{ .commonLabels.alertname }}{{if .commonLabels.clustername }} Cluster name: {{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }} Application name: {{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }} Notification policy: {{ .dispatchRuleName }} Alert resolution time: {{ .endTime }} Alert content: {{ for .alerts }} {{.annotations.message}} {{ end }}&lt;/TtsRecoverContent&gt;</p>
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
    /**
     * 
     * {@link CreateOrUpdateNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateNotificationPolicyResponseBody</p>
     */
    public static class NotificationPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectedMode")
        private Boolean directedMode;

        @com.aliyun.core.annotation.NameInMap("EscalationPolicyId")
        private Long escalationPolicyId;

        @com.aliyun.core.annotation.NameInMap("GroupRule")
        private GroupRule groupRule;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IntegrationId")
        private Long integrationId;

        @com.aliyun.core.annotation.NameInMap("MatchingRules")
        private java.util.List<MatchingRules> matchingRules;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyRule")
        private NotifyRule notifyRule;

        @com.aliyun.core.annotation.NameInMap("NotifyTemplate")
        private NotifyTemplate notifyTemplate;

        @com.aliyun.core.annotation.NameInMap("Repeat")
        private Boolean repeat;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Long repeatInterval;

        @com.aliyun.core.annotation.NameInMap("SendRecoverMessage")
        private Boolean sendRecoverMessage;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

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
            this.state = builder.state;
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
        public java.util.List<MatchingRules> getMatchingRules() {
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

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Boolean directedMode; 
            private Long escalationPolicyId; 
            private GroupRule groupRule; 
            private Long id; 
            private Long integrationId; 
            private java.util.List<MatchingRules> matchingRules; 
            private String name; 
            private NotifyRule notifyRule; 
            private NotifyTemplate notifyTemplate; 
            private Boolean repeat; 
            private Long repeatInterval; 
            private Boolean sendRecoverMessage; 
            private String state; 

            /**
             * <p>Specifies whether to enable simple mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder directedMode(Boolean directedMode) {
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
                this.escalationPolicyId = escalationPolicyId;
                return this;
            }

            /**
             * <p>An array of alert event group objects.</p>
             */
            public Builder groupRule(GroupRule groupRule) {
                this.groupRule = groupRule;
                return this;
            }

            /**
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
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
                this.integrationId = integrationId;
                return this;
            }

            /**
             * <p>The matching rules.</p>
             */
            public Builder matchingRules(java.util.List<MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>notificationpolicy_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>An array of notification rule objects.</p>
             */
            public Builder notifyRule(NotifyRule notifyRule) {
                this.notifyRule = notifyRule;
                return this;
            }

            /**
             * <p>The notification template.</p>
             */
            public Builder notifyTemplate(NotifyTemplate notifyTemplate) {
                this.notifyTemplate = notifyTemplate;
                return this;
            }

            /**
             * <p>Indicates whether a notification is resent for a long-lasting unresolved alert. Default value: true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The system resends a notification for a long-lasting unresolved alert at a specified time interval.</li>
             * <li><code>false</code>: The system sends a notification for a long-lasting unresolved alert based on an escalation policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder repeat(Boolean repeat) {
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
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * <p>Indicates whether the status of an alert automatically changes to Resolved when all events related to the alert change to the Restored state. ARMS notifies contacts when the alert status changes to Resolved.</p>
             * <ul>
             * <li><code>true</code>: The system sends a notification.</li>
             * <li><code>false</code>: The system does not send a notification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sendRecoverMessage(Boolean sendRecoverMessage) {
                this.sendRecoverMessage = sendRecoverMessage;
                return this;
            }

            /**
             * <p>Indicates whether the notification policy is enabled. Valid values: enable and disable.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public NotificationPolicy build() {
                return new NotificationPolicy(this);
            } 

        } 

    }
}

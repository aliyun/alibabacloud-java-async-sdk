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
         * 通知策略对象
         */
        public Builder notificationPolicy(NotificationPolicy notificationPolicy) {
            this.notificationPolicy = notificationPolicy;
            return this;
        }

        /**
         * Id of the request
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
             * 分组间隔时间，选填，默认是30s
             */
            public Builder groupInterval(Long groupInterval) {
                this.groupInterval = groupInterval;
                return this;
            }

            /**
             * 分组等待时间，选填，默认是5秒
             */
            public Builder groupWait(Long groupWait) {
                this.groupWait = groupWait;
                return this;
            }

            /**
             * 分组字段,为空则不分组，默认按照alertname分组
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
             * 条件字段
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 对应关系
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 条件字段值
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
             * MatchingConditions.
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
        @NameInMap("NotifyObjectId")
        private Long notifyObjectId;

        @NameInMap("NotifyObjectName")
        private String notifyObjectName;

        @NameInMap("NotifyObjectType")
        private String notifyObjectType;

        private NotifyObjects(Builder builder) {
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
            private Long notifyObjectId; 
            private String notifyObjectName; 
            private String notifyObjectType; 

            /**
             * 通知对象ID
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * 通知对象名称
             */
            public Builder notifyObjectName(String notifyObjectName) {
                this.notifyObjectName = notifyObjectName;
                return this;
            }

            /**
             * 通知对象类型，CONTACT, CONTACT_GROUP, ARMS_CONTACT, DING_ROBOT
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
             * 通知渠道
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * 通知时间段结束时间
             */
            public Builder notifyEndTime(String notifyEndTime) {
                this.notifyEndTime = notifyEndTime;
                return this;
            }

            /**
             * 通知对象
             */
            public Builder notifyObjects(java.util.List < NotifyObjects> notifyObjects) {
                this.notifyObjects = notifyObjects;
                return this;
            }

            /**
             * 通知时间段开始时间
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
             * 邮件内容
             */
            public Builder emailContent(String emailContent) {
                this.emailContent = emailContent;
                return this;
            }

            /**
             * 恢复告警邮件内容
             */
            public Builder emailRecoverContent(String emailRecoverContent) {
                this.emailRecoverContent = emailRecoverContent;
                return this;
            }

            /**
             * 恢复告警邮件标题
             */
            public Builder emailRecoverTitle(String emailRecoverTitle) {
                this.emailRecoverTitle = emailRecoverTitle;
                return this;
            }

            /**
             * 邮件标题
             */
            public Builder emailTitle(String emailTitle) {
                this.emailTitle = emailTitle;
                return this;
            }

            /**
             * 机器人告警内容
             */
            public Builder robotContent(String robotContent) {
                this.robotContent = robotContent;
                return this;
            }

            /**
             * 短信内容
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * 恢复告警短信内容
             */
            public Builder smsRecoverContent(String smsRecoverContent) {
                this.smsRecoverContent = smsRecoverContent;
                return this;
            }

            /**
             * 智能语音告警内容
             */
            public Builder ttsContent(String ttsContent) {
                this.ttsContent = ttsContent;
                return this;
            }

            /**
             * 智能语音恢复告警内容
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
             * 升级规则ID
             */
            public Builder escalationPolicyId(Long escalationPolicyId) {
                this.escalationPolicyId = escalationPolicyId;
                return this;
            }

            /**
             * 分组规则
             */
            public Builder groupRule(GroupRule groupRule) {
                this.groupRule = groupRule;
                return this;
            }

            /**
             * 通知策略ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 集成ID
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * 事件匹配规则列表
             */
            public Builder matchingRules(java.util.List < MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * 通知策略名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 通知规则
             */
            public Builder notifyRule(NotifyRule notifyRule) {
                this.notifyRule = notifyRule;
                return this;
            }

            /**
             * 通知模板
             */
            public Builder notifyTemplate(NotifyTemplate notifyTemplate) {
                this.notifyTemplate = notifyTemplate;
                return this;
            }

            /**
             * 是否重复通知
             */
            public Builder repeat(Boolean repeat) {
                this.repeat = repeat;
                return this;
            }

            /**
             * 重复通知时间间隔
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * 是否发送恢复通知
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

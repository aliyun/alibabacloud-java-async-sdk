// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDispatchRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDispatchRuleResponseBody</p>
 */
public class DescribeDispatchRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DispatchRule")
    private DispatchRule dispatchRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDispatchRuleResponseBody(Builder builder) {
        this.dispatchRule = builder.dispatchRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDispatchRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return dispatchRule
     */
    public DispatchRule getDispatchRule() {
        return this.dispatchRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DispatchRule dispatchRule; 
        private String requestId; 

        /**
         * The struct returned.
         */
        public Builder dispatchRule(DispatchRule dispatchRule) {
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDispatchRuleResponseBody build() {
            return new DescribeDispatchRuleResponseBody(this);
        } 

    } 

    public static class GroupRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupInterval")
        private Long groupInterval;

        @com.aliyun.core.annotation.NameInMap("GroupWaitTime")
        private Long groupWaitTime;

        @com.aliyun.core.annotation.NameInMap("GroupingFields")
        private java.util.List < String > groupingFields;

        @com.aliyun.core.annotation.NameInMap("RepeatInterval")
        private Long repeatInterval;

        private GroupRules(Builder builder) {
            this.groupId = builder.groupId;
            this.groupInterval = builder.groupInterval;
            this.groupWaitTime = builder.groupWaitTime;
            this.groupingFields = builder.groupingFields;
            this.repeatInterval = builder.repeatInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupRules create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupInterval
         */
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        /**
         * @return groupWaitTime
         */
        public Long getGroupWaitTime() {
            return this.groupWaitTime;
        }

        /**
         * @return groupingFields
         */
        public java.util.List < String > getGroupingFields() {
            return this.groupingFields;
        }

        /**
         * @return repeatInterval
         */
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public static final class Builder {
            private Long groupId; 
            private Long groupInterval; 
            private Long groupWaitTime; 
            private java.util.List < String > groupingFields; 
            private Long repeatInterval; 

            /**
             * The ID of the group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The grouping interval.
             */
            public Builder groupInterval(Long groupInterval) {
                this.groupInterval = groupInterval;
                return this;
            }

            /**
             * The waiting time for grouping.
             */
            public Builder groupWaitTime(Long groupWaitTime) {
                this.groupWaitTime = groupWaitTime;
                return this;
            }

            /**
             * The grouping fields.
             */
            public Builder groupingFields(java.util.List < String > groupingFields) {
                this.groupingFields = groupingFields;
                return this;
            }

            /**
             * The time interval at which a notification is resent for a long-lasting unresolved alert. Unit: seconds.
             */
            public Builder repeatInterval(Long repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            public GroupRules build() {
                return new GroupRules(this);
            } 

        } 

    }
    public static class LabelMatchExpressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LabelMatchExpressions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressions create() {
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
             * The key of the tag of the dispatch rule. Valid values:
             * <p>
             * 
             * *   `_aliyun_arms_userid`: user ID
             * *   `_aliyun_arms_involvedObject_kind`: type of the associated object
             * *   `_aliyun_arms_involvedObject_id`: ID of the associated object
             * *   `_aliyun_arms_involvedObject_name`: name of the associated object
             * *   `_aliyun_arms_alert_name`: alert name
             * *   `_aliyun_arms_alert_rule_id`: alert rule ID
             * *   `_aliyun_arms_alert_type`: alert type
             * *   `_aliyun_arms_alert_level`: alert severity
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The operator used in the dispatch rule. Valid values:
             * <p>
             * 
             * *   `eq`: equals to.
             * *   `re`: matches a regular expression.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LabelMatchExpressions build() {
                return new LabelMatchExpressions(this);
            } 

        } 

    }
    public static class LabelMatchExpressionGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelMatchExpressions")
        private java.util.List < LabelMatchExpressions> labelMatchExpressions;

        private LabelMatchExpressionGroups(Builder builder) {
            this.labelMatchExpressions = builder.labelMatchExpressions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressionGroups create() {
            return builder().build();
        }

        /**
         * @return labelMatchExpressions
         */
        public java.util.List < LabelMatchExpressions> getLabelMatchExpressions() {
            return this.labelMatchExpressions;
        }

        public static final class Builder {
            private java.util.List < LabelMatchExpressions> labelMatchExpressions; 

            /**
             * The collection of conditions of the dispatch rule.
             */
            public Builder labelMatchExpressions(java.util.List < LabelMatchExpressions> labelMatchExpressions) {
                this.labelMatchExpressions = labelMatchExpressions;
                return this;
            }

            public LabelMatchExpressionGroups build() {
                return new LabelMatchExpressionGroups(this);
            } 

        } 

    }
    public static class LabelMatchExpressionGrid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelMatchExpressionGroups")
        private java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups;

        private LabelMatchExpressionGrid(Builder builder) {
            this.labelMatchExpressionGroups = builder.labelMatchExpressionGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressionGrid create() {
            return builder().build();
        }

        /**
         * @return labelMatchExpressionGroups
         */
        public java.util.List < LabelMatchExpressionGroups> getLabelMatchExpressionGroups() {
            return this.labelMatchExpressionGroups;
        }

        public static final class Builder {
            private java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups; 

            /**
             * The collection of dispatch rules.
             */
            public Builder labelMatchExpressionGroups(java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups) {
                this.labelMatchExpressionGroups = labelMatchExpressionGroups;
                return this;
            }

            public LabelMatchExpressionGrid build() {
                return new LabelMatchExpressionGrid(this);
            } 

        } 

    }
    public static class NotifyObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyObjectId")
        private String notifyObjectId;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        private NotifyObjects(Builder builder) {
            this.name = builder.name;
            this.notifyObjectId = builder.notifyObjectId;
            this.notifyType = builder.notifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyObjects create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyObjectId
         */
        public String getNotifyObjectId() {
            return this.notifyObjectId;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        public static final class Builder {
            private String name; 
            private String notifyObjectId; 
            private String notifyType; 

            /**
             * The name of the contact or contact group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the contact or contact group.
             */
            public Builder notifyObjectId(String notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * The type of the alert contact. Valid values:
             * <p>
             * 
             * - `CONTACT`: contact
             * - `CONTACT_GROUP`: contact group
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            public NotifyObjects build() {
                return new NotifyObjects(this);
            } 

        } 

    }
    public static class NotifyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @com.aliyun.core.annotation.NameInMap("NotifyObjects")
        private java.util.List < NotifyObjects> notifyObjects;

        private NotifyRules(Builder builder) {
            this.notifyChannels = builder.notifyChannels;
            this.notifyObjects = builder.notifyObjects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyRules create() {
            return builder().build();
        }

        /**
         * @return notifyChannels
         */
        public java.util.List < String > getNotifyChannels() {
            return this.notifyChannels;
        }

        /**
         * @return notifyObjects
         */
        public java.util.List < NotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        public static final class Builder {
            private java.util.List < String > notifyChannels; 
            private java.util.List < NotifyObjects> notifyObjects; 

            /**
             * The notification method Array.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * The collection of alert contacts.
             */
            public Builder notifyObjects(java.util.List < NotifyObjects> notifyObjects) {
                this.notifyObjects = notifyObjects;
                return this;
            }

            public NotifyRules build() {
                return new NotifyRules(this);
            } 

        } 

    }
    public static class DispatchRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DispatchType")
        private String dispatchType;

        @com.aliyun.core.annotation.NameInMap("GroupRules")
        private java.util.List < GroupRules> groupRules;

        @com.aliyun.core.annotation.NameInMap("IsRecover")
        private Boolean isRecover;

        @com.aliyun.core.annotation.NameInMap("LabelMatchExpressionGrid")
        private LabelMatchExpressionGrid labelMatchExpressionGrid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyRules")
        private java.util.List < NotifyRules> notifyRules;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private DispatchRule(Builder builder) {
            this.dispatchType = builder.dispatchType;
            this.groupRules = builder.groupRules;
            this.isRecover = builder.isRecover;
            this.labelMatchExpressionGrid = builder.labelMatchExpressionGrid;
            this.name = builder.name;
            this.notifyRules = builder.notifyRules;
            this.ruleId = builder.ruleId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DispatchRule create() {
            return builder().build();
        }

        /**
         * @return dispatchType
         */
        public String getDispatchType() {
            return this.dispatchType;
        }

        /**
         * @return groupRules
         */
        public java.util.List < GroupRules> getGroupRules() {
            return this.groupRules;
        }

        /**
         * @return isRecover
         */
        public Boolean getIsRecover() {
            return this.isRecover;
        }

        /**
         * @return labelMatchExpressionGrid
         */
        public LabelMatchExpressionGrid getLabelMatchExpressionGrid() {
            return this.labelMatchExpressionGrid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyRules
         */
        public java.util.List < NotifyRules> getNotifyRules() {
            return this.notifyRules;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String dispatchType; 
            private java.util.List < GroupRules> groupRules; 
            private Boolean isRecover; 
            private LabelMatchExpressionGrid labelMatchExpressionGrid; 
            private String name; 
            private java.util.List < NotifyRules> notifyRules; 
            private Long ruleId; 
            private String state; 

            /**
             * Alarm handling method.
             * <p>
             * 
             * CREATE_ALERT: Generate an alert.
             * 
             * DISCARD_ALERT: Discard the alarm event, that is, no alarm.
             */
            public Builder dispatchType(String dispatchType) {
                this.dispatchType = dispatchType;
                return this;
            }

            /**
             * The information about groups.
             */
            public Builder groupRules(java.util.List < GroupRules> groupRules) {
                this.groupRules = groupRules;
                return this;
            }

            /**
             * Whether to send recovered alerts.
             * <p>
             * true: send.
             * false: do not send.
             */
            public Builder isRecover(Boolean isRecover) {
                this.isRecover = isRecover;
                return this;
            }

            /**
             * The information about the dispatch rule.
             */
            public Builder labelMatchExpressionGrid(LabelMatchExpressionGrid labelMatchExpressionGrid) {
                this.labelMatchExpressionGrid = labelMatchExpressionGrid;
                return this;
            }

            /**
             * The name of the dispatch policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The collection of notification methods.
             */
            public Builder notifyRules(java.util.List < NotifyRules> notifyRules) {
                this.notifyRules = notifyRules;
                return this;
            }

            /**
             * The ID of the dispatch rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Indicates whether the dispatch policy is enabled. Valid values: 
             * <p>
             * 
             * - `true`: enabled
             * - `false`: disabled
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public DispatchRule build() {
                return new DispatchRule(this);
            } 

        } 

    }
}

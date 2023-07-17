// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDispatchRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDispatchRuleResponseBody</p>
 */
public class DescribeDispatchRuleResponseBody extends TeaModel {
    @NameInMap("DispatchRule")
    private DispatchRule dispatchRule;

    @NameInMap("RequestId")
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
         * DispatchRule.
         */
        public Builder dispatchRule(DispatchRule dispatchRule) {
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupInterval")
        private Long groupInterval;

        @NameInMap("GroupWaitTime")
        private Long groupWaitTime;

        @NameInMap("GroupingFields")
        private java.util.List < String > groupingFields;

        private GroupRules(Builder builder) {
            this.groupId = builder.groupId;
            this.groupInterval = builder.groupInterval;
            this.groupWaitTime = builder.groupWaitTime;
            this.groupingFields = builder.groupingFields;
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

        public static final class Builder {
            private Long groupId; 
            private Long groupInterval; 
            private Long groupWaitTime; 
            private java.util.List < String > groupingFields; 

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupInterval.
             */
            public Builder groupInterval(Long groupInterval) {
                this.groupInterval = groupInterval;
                return this;
            }

            /**
             * GroupWaitTime.
             */
            public Builder groupWaitTime(Long groupWaitTime) {
                this.groupWaitTime = groupWaitTime;
                return this;
            }

            /**
             * GroupingFields.
             */
            public Builder groupingFields(java.util.List < String > groupingFields) {
                this.groupingFields = groupingFields;
                return this;
            }

            public GroupRules build() {
                return new GroupRules(this);
            } 

        } 

    }
    public static class LabelMatchExpressions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("LabelMatchExpressions")
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
             * LabelMatchExpressions.
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
        @NameInMap("LabelMatchExpressionGroups")
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
             * LabelMatchExpressionGroups.
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
        @NameInMap("Name")
        private String name;

        @NameInMap("NotifyObjectId")
        private String notifyObjectId;

        @NameInMap("NotifyType")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NotifyObjectId.
             */
            public Builder notifyObjectId(String notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            /**
             * NotifyType.
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
        @NameInMap("NotifyChannels")
        private java.util.List < String > notifyChannels;

        @NameInMap("NotifyObjects")
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
             * NotifyChannels.
             */
            public Builder notifyChannels(java.util.List < String > notifyChannels) {
                this.notifyChannels = notifyChannels;
                return this;
            }

            /**
             * NotifyObjects.
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
        @NameInMap("GroupRules")
        private java.util.List < GroupRules> groupRules;

        @NameInMap("LabelMatchExpressionGrid")
        private LabelMatchExpressionGrid labelMatchExpressionGrid;

        @NameInMap("Name")
        private String name;

        @NameInMap("NotifyRules")
        private java.util.List < NotifyRules> notifyRules;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("State")
        private String state;

        private DispatchRule(Builder builder) {
            this.groupRules = builder.groupRules;
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
         * @return groupRules
         */
        public java.util.List < GroupRules> getGroupRules() {
            return this.groupRules;
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
            private java.util.List < GroupRules> groupRules; 
            private LabelMatchExpressionGrid labelMatchExpressionGrid; 
            private String name; 
            private java.util.List < NotifyRules> notifyRules; 
            private Long ruleId; 
            private String state; 

            /**
             * GroupRules.
             */
            public Builder groupRules(java.util.List < GroupRules> groupRules) {
                this.groupRules = groupRules;
                return this;
            }

            /**
             * LabelMatchExpressionGrid.
             */
            public Builder labelMatchExpressionGrid(LabelMatchExpressionGrid labelMatchExpressionGrid) {
                this.labelMatchExpressionGrid = labelMatchExpressionGrid;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NotifyRules.
             */
            public Builder notifyRules(java.util.List < NotifyRules> notifyRules) {
                this.notifyRules = notifyRules;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * State.
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

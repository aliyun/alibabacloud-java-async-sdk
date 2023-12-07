// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleListResponseBody</p>
 */
public class DescribeEventRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EventRules")
    private EventRules eventRules;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeEventRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.eventRules = builder.eventRules;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return eventRules
     */
    public EventRules getEventRules() {
        return this.eventRules;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private EventRules eventRules; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The event-triggered alert rule.
         */
        public Builder eventRules(EventRules eventRules) {
            this.eventRules = eventRules;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeEventRuleListResponseBody build() {
            return new DescribeEventRuleListResponseBody(this);
        } 

    } 

    public static class EventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        private java.util.List < String > eventTypeList;

        private EventTypeList(Builder builder) {
            this.eventTypeList = builder.eventTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTypeList create() {
            return builder().build();
        }

        /**
         * @return eventTypeList
         */
        public java.util.List < String > getEventTypeList() {
            return this.eventTypeList;
        }

        public static final class Builder {
            private java.util.List < String > eventTypeList; 

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(java.util.List < String > eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            public EventTypeList build() {
                return new EventTypeList(this);
            } 

        } 

    }
    public static class Keywords extends TeaModel {
        @NameInMap("Keywords")
        private java.util.List < String > keywords;

        private Keywords(Builder builder) {
            this.keywords = builder.keywords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keywords create() {
            return builder().build();
        }

        /**
         * @return keywords
         */
        public java.util.List < String > getKeywords() {
            return this.keywords;
        }

        public static final class Builder {
            private java.util.List < String > keywords; 

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List < String > keywords) {
                this.keywords = keywords;
                return this;
            }

            public Keywords build() {
                return new Keywords(this);
            } 

        } 

    }
    public static class KeywordFilter extends TeaModel {
        @NameInMap("Keywords")
        private Keywords keywords;

        @NameInMap("Relation")
        private String relation;

        private KeywordFilter(Builder builder) {
            this.keywords = builder.keywords;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordFilter create() {
            return builder().build();
        }

        /**
         * @return keywords
         */
        public Keywords getKeywords() {
            return this.keywords;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private Keywords keywords; 
            private String relation; 

            /**
             * The keywords that are used to match events.
             */
            public Builder keywords(Keywords keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * The relationship between multiple keywords in a condition. Valid values:
             * <p>
             * 
             * *   OR: The relationship between keywords is OR.
             * *   NOT: The keyword is excluded. The value NOT indicates that all events that do not contain the keywords are matched.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public KeywordFilter build() {
                return new KeywordFilter(this);
            } 

        } 

    }
    public static class LevelList extends TeaModel {
        @NameInMap("LevelList")
        private java.util.List < String > levelList;

        private LevelList(Builder builder) {
            this.levelList = builder.levelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelList create() {
            return builder().build();
        }

        /**
         * @return levelList
         */
        public java.util.List < String > getLevelList() {
            return this.levelList;
        }

        public static final class Builder {
            private java.util.List < String > levelList; 

            /**
             * LevelList.
             */
            public Builder levelList(java.util.List < String > levelList) {
                this.levelList = levelList;
                return this;
            }

            public LevelList build() {
                return new LevelList(this);
            } 

        } 

    }
    public static class NameList extends TeaModel {
        @NameInMap("NameList")
        private java.util.List < String > nameList;

        private NameList(Builder builder) {
            this.nameList = builder.nameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameList create() {
            return builder().build();
        }

        /**
         * @return nameList
         */
        public java.util.List < String > getNameList() {
            return this.nameList;
        }

        public static final class Builder {
            private java.util.List < String > nameList; 

            /**
             * NameList.
             */
            public Builder nameList(java.util.List < String > nameList) {
                this.nameList = nameList;
                return this;
            }

            public NameList build() {
                return new NameList(this);
            } 

        } 

    }
    public static class EventPattern extends TeaModel {
        @NameInMap("CustomFilters")
        private String customFilters;

        @NameInMap("EventTypeList")
        private EventTypeList eventTypeList;

        @NameInMap("KeywordFilter")
        private KeywordFilter keywordFilter;

        @NameInMap("LevelList")
        private LevelList levelList;

        @NameInMap("NameList")
        private NameList nameList;

        @NameInMap("Product")
        private String product;

        @NameInMap("SQLFilter")
        private String SQLFilter;

        private EventPattern(Builder builder) {
            this.customFilters = builder.customFilters;
            this.eventTypeList = builder.eventTypeList;
            this.keywordFilter = builder.keywordFilter;
            this.levelList = builder.levelList;
            this.nameList = builder.nameList;
            this.product = builder.product;
            this.SQLFilter = builder.SQLFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventPattern create() {
            return builder().build();
        }

        /**
         * @return customFilters
         */
        public String getCustomFilters() {
            return this.customFilters;
        }

        /**
         * @return eventTypeList
         */
        public EventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        /**
         * @return keywordFilter
         */
        public KeywordFilter getKeywordFilter() {
            return this.keywordFilter;
        }

        /**
         * @return levelList
         */
        public LevelList getLevelList() {
            return this.levelList;
        }

        /**
         * @return nameList
         */
        public NameList getNameList() {
            return this.nameList;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return SQLFilter
         */
        public String getSQLFilter() {
            return this.SQLFilter;
        }

        public static final class Builder {
            private String customFilters; 
            private EventTypeList eventTypeList; 
            private KeywordFilter keywordFilter; 
            private LevelList levelList; 
            private NameList nameList; 
            private String product; 
            private String SQLFilter; 

            /**
             * The custom filter conditions.
             */
            public Builder customFilters(String customFilters) {
                this.customFilters = customFilters;
                return this;
            }

            /**
             * The types of the event-triggered alert rules.
             */
            public Builder eventTypeList(EventTypeList eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * The keyword for filtering.
             */
            public Builder keywordFilter(KeywordFilter keywordFilter) {
                this.keywordFilter = keywordFilter;
                return this;
            }

            /**
             * The levels of the event-triggered alerts.
             */
            public Builder levelList(LevelList levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * The event names.
             */
            public Builder nameList(NameList nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * The abbreviation of the Alibaba Cloud service name.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Indicates that logs are filtered based on the specified SQL statement. If the specified conditions are met, an alert is triggered.
             */
            public Builder SQLFilter(String SQLFilter) {
                this.SQLFilter = SQLFilter;
                return this;
            }

            public EventPattern build() {
                return new EventPattern(this);
            } 

        } 

    }
    public static class EventRuleEventPattern extends TeaModel {
        @NameInMap("EventPattern")
        private java.util.List < EventPattern> eventPattern;

        private EventRuleEventPattern(Builder builder) {
            this.eventPattern = builder.eventPattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventRuleEventPattern create() {
            return builder().build();
        }

        /**
         * @return eventPattern
         */
        public java.util.List < EventPattern> getEventPattern() {
            return this.eventPattern;
        }

        public static final class Builder {
            private java.util.List < EventPattern> eventPattern; 

            /**
             * EventPattern.
             */
            public Builder eventPattern(java.util.List < EventPattern> eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            public EventRuleEventPattern build() {
                return new EventRuleEventPattern(this);
            } 

        } 

    }
    public static class EventRule extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("EventPattern")
        private EventRuleEventPattern eventPattern;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        @NameInMap("SilenceTime")
        private Long silenceTime;

        @NameInMap("State")
        private String state;

        private EventRule(Builder builder) {
            this.description = builder.description;
            this.eventPattern = builder.eventPattern;
            this.eventType = builder.eventType;
            this.groupId = builder.groupId;
            this.name = builder.name;
            this.silenceTime = builder.silenceTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventPattern
         */
        public EventRuleEventPattern getEventPattern() {
            return this.eventPattern;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return silenceTime
         */
        public Long getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String description; 
            private EventRuleEventPattern eventPattern; 
            private String eventType; 
            private String groupId; 
            private String name; 
            private Long silenceTime; 
            private String state; 

            /**
             * The description of the event-triggered alert rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mode of the event-triggered alert rule.
             */
            public Builder eventPattern(EventRuleEventPattern eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            /**
             * The type of the event-triggered alert rule. Valid values:
             * <p>
             * 
             * *   SYSTEM: system event-triggered alert rule
             * *   CUSTOM: custom event-triggered alert rule
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the event-triggered alert rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The mute period during which new alert notifications are not sent even if the trigger conditions are met.
             */
            public Builder silenceTime(Long silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The status of the event-triggered alert rule. Valid values:
             * <p>
             * 
             * *   ENABLED
             * *   DISABLED
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public EventRule build() {
                return new EventRule(this);
            } 

        } 

    }
    public static class EventRules extends TeaModel {
        @NameInMap("EventRule")
        private java.util.List < EventRule> eventRule;

        private EventRules(Builder builder) {
            this.eventRule = builder.eventRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventRules create() {
            return builder().build();
        }

        /**
         * @return eventRule
         */
        public java.util.List < EventRule> getEventRule() {
            return this.eventRule;
        }

        public static final class Builder {
            private java.util.List < EventRule> eventRule; 

            /**
             * EventRule.
             */
            public Builder eventRule(java.util.List < EventRule> eventRule) {
                this.eventRule = eventRule;
                return this;
            }

            public EventRules build() {
                return new EventRules(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleListResponseBody</p>
 */
public class DescribeEventRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EventRules")
    private EventRules eventRules;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The event-triggered alert rule.</p>
         */
        public Builder eventRules(EventRules eventRules) {
            this.eventRules = eventRules;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0E6D82B-16B5-422A-8136-EE5BDC01E415</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeEventRuleListResponseBody build() {
            return new DescribeEventRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class EventTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventTypeList")
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class Keywords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keywords")
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class KeywordFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keywords")
        private Keywords keywords;

        @com.aliyun.core.annotation.NameInMap("Relation")
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
             * <p>The keywords that are used to match events.</p>
             */
            public Builder keywords(Keywords keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>The relationship between multiple keywords in a condition. Valid values:</p>
             * <ul>
             * <li>OR: The relationship between keywords is OR.</li>
             * <li>NOT: The keyword is excluded. The value NOT indicates that all events that do not contain the keywords are matched.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class LevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LevelList")
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class NameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameList")
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class EventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomFilters")
        private String customFilters;

        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private EventTypeList eventTypeList;

        @com.aliyun.core.annotation.NameInMap("KeywordFilter")
        private KeywordFilter keywordFilter;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private LevelList levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private NameList nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("SQLFilter")
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
             * <p>The custom filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS123</p>
             */
            public Builder customFilters(String customFilters) {
                this.customFilters = customFilters;
                return this;
            }

            /**
             * <p>The types of the event-triggered alert rules.</p>
             */
            public Builder eventTypeList(EventTypeList eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * <p>The keyword for filtering.</p>
             */
            public Builder keywordFilter(KeywordFilter keywordFilter) {
                this.keywordFilter = keywordFilter;
                return this;
            }

            /**
             * <p>The levels of the event-triggered alerts.</p>
             */
            public Builder levelList(LevelList levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * <p>The event names.</p>
             */
            public Builder nameList(NameList nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudMonitor</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>Indicates that logs are filtered based on the specified SQL statement. If the specified conditions are met, an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>ycccluster1 and (i-23ij0o82612 or Executed1) or Asimulated not 222</p>
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class EventRuleEventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventPattern")
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class EventRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventPattern")
        private EventRuleEventPattern eventPattern;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Long silenceTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The description of the event-triggered alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Default group event rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The mode of the event-triggered alert rule.</p>
             */
            public Builder eventPattern(EventRuleEventPattern eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            /**
             * <p>The type of the event-triggered alert rule. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system event-triggered alert rule</li>
             * <li>CUSTOM: custom event-triggered alert rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>7378****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the event-triggered alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test_DefaultEventRule_7378****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder silenceTime(Long silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The status of the event-triggered alert rule. Valid values:</p>
             * <ul>
             * <li>ENABLED</li>
             * <li>DISABLED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
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
    /**
     * 
     * {@link DescribeEventRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleListResponseBody</p>
     */
    public static class EventRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventRule")
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

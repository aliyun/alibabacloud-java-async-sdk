// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleAttributeResponseBody</p>
 */
public class DescribeEventRuleAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEventRuleAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The alert does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AA3F210-C03D-4C86-8DB6-21C84FF692A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the event-triggered alert rule.</p>
         */
        public Builder result(Result result) {
            this.result = result;
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

        public DescribeEventRuleAttributeResponseBody build() {
            return new DescribeEventRuleAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
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
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
     */
    public static class Keywords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyword")
        private java.util.List < String > keyword;

        private Keywords(Builder builder) {
            this.keyword = builder.keyword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keywords create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public java.util.List < String > getKeyword() {
            return this.keyword;
        }

        public static final class Builder {
            private java.util.List < String > keyword; 

            /**
             * keyword.
             */
            public Builder keyword(java.util.List < String > keyword) {
                this.keyword = keyword;
                return this;
            }

            public Keywords build() {
                return new Keywords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
     */
    public static class KeywordFilterObj extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keywords")
        private Keywords keywords;

        @com.aliyun.core.annotation.NameInMap("Relation")
        private String relation;

        private KeywordFilterObj(Builder builder) {
            this.keywords = builder.keywords;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordFilterObj create() {
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

            public KeywordFilterObj build() {
                return new KeywordFilterObj(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
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
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
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
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
     */
    public static class StatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List < String > statusList;

        private StatusList(Builder builder) {
            this.statusList = builder.statusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusList create() {
            return builder().build();
        }

        /**
         * @return statusList
         */
        public java.util.List < String > getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private java.util.List < String > statusList; 

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List < String > statusList) {
                this.statusList = statusList;
                return this;
            }

            public StatusList build() {
                return new StatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
     */
    public static class EventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private EventTypeList eventTypeList;

        @com.aliyun.core.annotation.NameInMap("KeywordFilterObj")
        private KeywordFilterObj keywordFilterObj;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private LevelList levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private NameList nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("SQLFilter")
        private String SQLFilter;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private StatusList statusList;

        private EventPattern(Builder builder) {
            this.eventTypeList = builder.eventTypeList;
            this.keywordFilterObj = builder.keywordFilterObj;
            this.levelList = builder.levelList;
            this.nameList = builder.nameList;
            this.product = builder.product;
            this.SQLFilter = builder.SQLFilter;
            this.statusList = builder.statusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventPattern create() {
            return builder().build();
        }

        /**
         * @return eventTypeList
         */
        public EventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        /**
         * @return keywordFilterObj
         */
        public KeywordFilterObj getKeywordFilterObj() {
            return this.keywordFilterObj;
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

        /**
         * @return statusList
         */
        public StatusList getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private EventTypeList eventTypeList; 
            private KeywordFilterObj keywordFilterObj; 
            private LevelList levelList; 
            private NameList nameList; 
            private String product; 
            private String SQLFilter; 
            private StatusList statusList; 

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
            public Builder keywordFilterObj(KeywordFilterObj keywordFilterObj) {
                this.keywordFilterObj = keywordFilterObj;
                return this;
            }

            /**
             * LevelList.
             */
            public Builder levelList(LevelList levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * NameList.
             */
            public Builder nameList(NameList nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * <p>The name of the cloud service.</p>
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

            /**
             * StatusList.
             */
            public Builder statusList(StatusList statusList) {
                this.statusList = statusList;
                return this;
            }

            public EventPattern build() {
                return new EventPattern(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventRuleAttributeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventPattern")
        private EventPattern eventPattern;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Result(Builder builder) {
            this.description = builder.description;
            this.eventPattern = builder.eventPattern;
            this.eventType = builder.eventType;
            this.groupId = builder.groupId;
            this.name = builder.name;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
        public EventPattern getEventPattern() {
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String description; 
            private EventPattern eventPattern; 
            private String eventType; 
            private String groupId; 
            private String name; 
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
             * <p>The event pattern. This parameter describes the trigger conditions of an event.</p>
             */
            public Builder eventPattern(EventPattern eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system event</li>
             * <li>CUSTOM: custom event</li>
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
             * <p>3607****</p>
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

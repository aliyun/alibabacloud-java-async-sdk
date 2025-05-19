// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link ListEventRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventRulesResponseBody</p>
 */
public class ListEventRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private Datapoints datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListEventRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return datapoints
     */
    public Datapoints getDatapoints() {
        return this.datapoints;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer currentPage; 
        private Datapoints datapoints; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListEventRulesResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.datapoints = model.datapoints;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Datapoints.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEventRulesResponseBody build() {
            return new ListEventRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class EventTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private java.util.List<String> eventTypeList;

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
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

        public static final class Builder {
            private java.util.List<String> eventTypeList; 

            private Builder() {
            } 

            private Builder(EventTypeList model) {
                this.eventTypeList = model.eventTypeList;
            } 

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(java.util.List<String> eventTypeList) {
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class LevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LevelList")
        private java.util.List<String> levelList;

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
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

        public static final class Builder {
            private java.util.List<String> levelList; 

            private Builder() {
            } 

            private Builder(LevelList model) {
                this.levelList = model.levelList;
            } 

            /**
             * LevelList.
             */
            public Builder levelList(java.util.List<String> levelList) {
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class NameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List<String> nameList;

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
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public static final class Builder {
            private java.util.List<String> nameList; 

            private Builder() {
            } 

            private Builder(NameList model) {
                this.nameList = model.nameList;
            } 

            /**
             * NameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class StatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

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
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private java.util.List<String> statusList; 

            private Builder() {
            } 

            private Builder(StatusList model) {
                this.statusList = model.statusList;
            } 

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List<String> statusList) {
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class EventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private EventTypeList eventTypeList;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private LevelList levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private NameList nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private StatusList statusList;

        private EventPattern(Builder builder) {
            this.eventTypeList = builder.eventTypeList;
            this.levelList = builder.levelList;
            this.nameList = builder.nameList;
            this.product = builder.product;
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
         * @return statusList
         */
        public StatusList getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private EventTypeList eventTypeList; 
            private LevelList levelList; 
            private NameList nameList; 
            private String product; 
            private StatusList statusList; 

            private Builder() {
            } 

            private Builder(EventPattern model) {
                this.eventTypeList = model.eventTypeList;
                this.levelList = model.levelList;
                this.nameList = model.nameList;
                this.product = model.product;
                this.statusList = model.statusList;
            } 

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(EventTypeList eventTypeList) {
                this.eventTypeList = eventTypeList;
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
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class EventRuleEventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventPattern")
        private java.util.List<EventPattern> eventPattern;

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
        public java.util.List<EventPattern> getEventPattern() {
            return this.eventPattern;
        }

        public static final class Builder {
            private java.util.List<EventPattern> eventPattern; 

            private Builder() {
            } 

            private Builder(EventRuleEventPattern model) {
                this.eventPattern = model.eventPattern;
            } 

            /**
             * EventPattern.
             */
            public Builder eventPattern(java.util.List<EventPattern> eventPattern) {
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private EventRule(Builder builder) {
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
            private String state; 

            private Builder() {
            } 

            private Builder(EventRule model) {
                this.description = model.description;
                this.eventPattern = model.eventPattern;
                this.eventType = model.eventType;
                this.groupId = model.groupId;
                this.name = model.name;
                this.state = model.state;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EventPattern.
             */
            public Builder eventPattern(EventRuleEventPattern eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * State.
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
     * {@link ListEventRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRulesResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventRule")
        private java.util.List<EventRule> eventRule;

        private Datapoints(Builder builder) {
            this.eventRule = builder.eventRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
            return builder().build();
        }

        /**
         * @return eventRule
         */
        public java.util.List<EventRule> getEventRule() {
            return this.eventRule;
        }

        public static final class Builder {
            private java.util.List<EventRule> eventRule; 

            private Builder() {
            } 

            private Builder(Datapoints model) {
                this.eventRule = model.eventRule;
            } 

            /**
             * EventRule.
             */
            public Builder eventRule(java.util.List<EventRule> eventRule) {
                this.eventRule = eventRule;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}

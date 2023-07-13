// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleAttributeResponseBody</p>
 */
public class DescribeEventRuleAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the event-triggered alert rule.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The type of the event. Valid values:
         * <p>
         * 
         * *   SYSTEM: system event
         * *   CUSTOM: custom event
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the event-triggered alert rule.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * The description of the event-triggered alert rule.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventRuleAttributeResponseBody build() {
            return new DescribeEventRuleAttributeResponseBody(this);
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
    public static class StatusList extends TeaModel {
        @NameInMap("StatusList")
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
    public static class EventPattern extends TeaModel {
        @NameInMap("EventTypeList")
        private EventTypeList eventTypeList;

        @NameInMap("LevelList")
        private LevelList levelList;

        @NameInMap("NameList")
        private NameList nameList;

        @NameInMap("Product")
        private String product;

        @NameInMap("StatusList")
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

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(EventTypeList eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * This topic provides an example on how to query the details of an event-triggered alert rule named `testRule`.
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
             * The name of the event.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
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
    public static class Result extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("EventPattern")
        private EventPattern eventPattern;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
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
             * The status of the event-triggered alert rule. Valid values:
             * <p>
             * 
             * *   ENABLED: enabled
             * *   DISABLED: disabled
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The status of the event.
             */
            public Builder eventPattern(EventPattern eventPattern) {
                this.eventPattern = eventPattern;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The name of the cloud service.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The event pattern. This parameter specifies the trigger conditions of an event.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The level of the event-triggered alert rule. Valid values:
             * <p>
             * 
             * *   CRITICAL: critical
             * *   WARN: warning
             * *   INFO: information
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

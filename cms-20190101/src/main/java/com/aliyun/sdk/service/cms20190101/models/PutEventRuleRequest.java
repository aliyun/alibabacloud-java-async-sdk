// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEventRuleRequest} extends {@link RequestModel}
 *
 * <p>PutEventRuleRequest</p>
 */
public class PutEventRuleRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EventPattern")
    @Validation(required = true)
    private java.util.List < EventPattern> eventPattern;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("SilenceTime")
    private Long silenceTime;

    @Query
    @NameInMap("State")
    private String state;

    private PutEventRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventPattern = builder.eventPattern;
        this.eventType = builder.eventType;
        this.groupId = builder.groupId;
        this.ruleName = builder.ruleName;
        this.silenceTime = builder.silenceTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < EventPattern> getEventPattern() {
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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
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

    public static final class Builder extends Request.Builder<PutEventRuleRequest, Builder> {
        private String description; 
        private java.util.List < EventPattern> eventPattern; 
        private String eventType; 
        private String groupId; 
        private String ruleName; 
        private Long silenceTime; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(PutEventRuleRequest request) {
            super(request);
            this.description = request.description;
            this.eventPattern = request.eventPattern;
            this.eventType = request.eventType;
            this.groupId = request.groupId;
            this.ruleName = request.ruleName;
            this.silenceTime = request.silenceTime;
            this.state = request.state;
        } 

        /**
         * The description of the event-triggered alert rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EventPattern.
         */
        public Builder eventPattern(java.util.List < EventPattern> eventPattern) {
            this.putQueryParameter("EventPattern", eventPattern);
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
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The ID of the application group to which the event-triggered alert rule belongs.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the event-triggered alert rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds.
         */
        public Builder silenceTime(Long silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * The status of the event-triggered alert rule. Valid values:
         * <p>
         * 
         * *   ENABLED: enabled
         * *   DISABLED: disabled
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public PutEventRuleRequest build() {
            return new PutEventRuleRequest(this);
        } 

    } 

    public static class EventPattern extends TeaModel {
        @NameInMap("CustomFilters")
        private String customFilters;

        @NameInMap("EventTypeList")
        private java.util.List < String > eventTypeList;

        @NameInMap("LevelList")
        private java.util.List < String > levelList;

        @NameInMap("NameList")
        private java.util.List < String > nameList;

        @NameInMap("Product")
        @Validation(required = true)
        private String product;

        @NameInMap("SQLFilter")
        private String SQLFilter;

        @NameInMap("StatusList")
        private java.util.List < String > statusList;

        private EventPattern(Builder builder) {
            this.customFilters = builder.customFilters;
            this.eventTypeList = builder.eventTypeList;
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
         * @return customFilters
         */
        public String getCustomFilters() {
            return this.customFilters;
        }

        /**
         * @return eventTypeList
         */
        public java.util.List < String > getEventTypeList() {
            return this.eventTypeList;
        }

        /**
         * @return levelList
         */
        public java.util.List < String > getLevelList() {
            return this.levelList;
        }

        /**
         * @return nameList
         */
        public java.util.List < String > getNameList() {
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
        public java.util.List < String > getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private String customFilters; 
            private java.util.List < String > eventTypeList; 
            private java.util.List < String > levelList; 
            private java.util.List < String > nameList; 
            private String product; 
            private String SQLFilter; 
            private java.util.List < String > statusList; 

            /**
             * The keyword that is used to filter events. If the content of an event contains the specified keyword, an alert is automatically triggered.
             */
            public Builder customFilters(String customFilters) {
                this.customFilters = customFilters;
                return this;
            }

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(java.util.List < String > eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * LevelList.
             */
            public Builder levelList(java.util.List < String > levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * NameList.
             */
            public Builder nameList(java.util.List < String > nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * The type of the cloud service. Valid values of N: 1 to 50.
             * <p>
             * 
             * >  You can call the DescribeSystemEventMetaList operation to query the cloud services that support event-triggered alerts. For more information, see [DescribeSystemEventMetaList](~~114972~~).
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.
             * <p>
             * 
             * >  The syntax of SQL event filtering is consistent with the query syntax of Log Service.
             */
            public Builder SQLFilter(String SQLFilter) {
                this.SQLFilter = SQLFilter;
                return this;
            }

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List < String > statusList) {
                this.statusList = statusList;
                return this;
            }

            public EventPattern build() {
                return new EventPattern(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutEventRuleRequest} extends {@link RequestModel}
 *
 * <p>PutEventRuleRequest</p>
 */
public class PutEventRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < EventPattern> eventPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Long silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
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
         * <p>The description of the event-triggered alert rule.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventPattern(java.util.List < EventPattern> eventPattern) {
            this.putQueryParameter("EventPattern", eventPattern);
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
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The ID of the application group to which the event-triggered alert rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>7378****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the event-triggered alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myRuleName</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder silenceTime(Long silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * <p>The status of the event-triggered alert rule. Valid values:</p>
         * <ul>
         * <li>ENABLED: enabled</li>
         * <li>DISABLED: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
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

    /**
     * 
     * {@link PutEventRuleRequest} extends {@link TeaModel}
     *
     * <p>PutEventRuleRequest</p>
     */
    public static class EventPattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomFilters")
        private String customFilters;

        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private java.util.List < String > eventTypeList;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private java.util.List < String > levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List < String > nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        @com.aliyun.core.annotation.Validation(required = true)
        private String product;

        @com.aliyun.core.annotation.NameInMap("SQLFilter")
        private String SQLFilter;

        @com.aliyun.core.annotation.NameInMap("StatusList")
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
             * <p>The keyword that is used to filter events. If the content of an event contains the specified keyword, an alert is automatically triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>Stopping</p>
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
             * <p>The type of the cloud service. Valid values of N: 1 to 50.</p>
             * <blockquote>
             * <p> You can call the DescribeSystemEventMetaList operation to query the cloud services that support event-triggered alerts. For more information, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The SQL condition that is used to filter events. If the content of an event meets the specified SQL condition, an alert is automatically triggered.</p>
             * <blockquote>
             * <p> The syntax of SQL event filtering is consistent with the query syntax of Log Service.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX and Executed</p>
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

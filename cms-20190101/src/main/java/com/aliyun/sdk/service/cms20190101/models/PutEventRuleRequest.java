// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
    private java.util.List<EventPattern> eventPattern;

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
    public java.util.List<EventPattern> getEventPattern() {
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
        private java.util.List<EventPattern> eventPattern; 
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
         * 
         * <strong>example:</strong>
         * <p>Event alert test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The pattern of the event-triggered alert rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder eventPattern(java.util.List<EventPattern> eventPattern) {
            this.putQueryParameter("EventPattern", eventPattern);
            this.eventPattern = eventPattern;
            return this;
        }

        /**
         * <p>The type of the event-triggered alert rule. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system event.</li>
         * <li>CUSTOM: custom event.</li>
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
         * <p>The mute period. Unit: seconds.</p>
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
         * <li>ENABLED: Enabled.</li>
         * <li>DISABLED: Disabled.</li>
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
        private java.util.List<String> eventTypeList;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private java.util.List<String> levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        @com.aliyun.core.annotation.Validation(required = true)
        private String product;

        @com.aliyun.core.annotation.NameInMap("SQLFilter")
        private String SQLFilter;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

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
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

        /**
         * @return levelList
         */
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
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
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private String customFilters; 
            private java.util.List<String> eventTypeList; 
            private java.util.List<String> levelList; 
            private java.util.List<String> nameList; 
            private String product; 
            private String SQLFilter; 
            private java.util.List<String> statusList; 

            private Builder() {
            } 

            private Builder(EventPattern model) {
                this.customFilters = model.customFilters;
                this.eventTypeList = model.eventTypeList;
                this.levelList = model.levelList;
                this.nameList = model.nameList;
                this.product = model.product;
                this.SQLFilter = model.SQLFilter;
                this.statusList = model.statusList;
            } 

            /**
             * <p>The keyword for event filtering. When the event content contains this keyword, an alert is automatically triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>Stopping</p>
             */
            public Builder customFilters(String customFilters) {
                this.customFilters = customFilters;
                return this;
            }

            /**
             * <p>The type of the event-triggered alert rule. Valid values of N: 1 to 50. Valid values:</p>
             * <ul>
             * <li><p>StatusNotification: fault notification.</p>
             * </li>
             * <li><p>Exception: exception.</p>
             * </li>
             * <li><p>Maintenance: O&amp;M.</p>
             * </li>
             * <li><p>\*: unlimited.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exception</p>
             */
            public Builder eventTypeList(java.util.List<String> eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * <p>The level of the event-triggered alert rule. Valid values of N: 1 to 50. Valid values:</p>
             * <ul>
             * <li><p>CRITICAL: critical.</p>
             * </li>
             * <li><p>WARN: warning.</p>
             * </li>
             * <li><p>INFO: information.</p>
             * </li>
             * <li><p>\*: all levels.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder levelList(java.util.List<String> levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * <p>The name of the event-triggered alert rule. Valid values of N: 1 to 50.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent_Status_Stopped</p>
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service type. Valid values of N: 1 to 50.</p>
             * <blockquote>
             * <p>For information about the Alibaba Cloud services supported by event-triggered alert rules, see <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a>.</p>
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
             * <p>The SQL filter for events. When the event content meets the SQL condition, an alert is automatically triggered.</p>
             * <blockquote>
             * <p>The syntax of the SQL event filter is consistent with the query syntax of Simple Log Service (SLS).</p>
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
             * <p>The status of the event-triggered alert rule. Valid values of N: 1 to 50.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            public EventPattern build() {
                return new EventPattern(this);
            } 

        } 

    }
}

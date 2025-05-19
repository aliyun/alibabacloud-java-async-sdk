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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private PutEventRuleRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder<PutEventRuleRequest, Builder> {
        private String description; 
        private java.util.List<EventPattern> eventPattern; 
        private String eventType; 
        private String groupId; 
        private String name; 
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
            this.name = request.name;
            this.state = request.state;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder eventPattern(java.util.List<EventPattern> eventPattern) {
            this.putQueryParameter("EventPattern", eventPattern);
            this.eventPattern = eventPattern;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * State.
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
        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private java.util.List<String> eventTypeList;

        @com.aliyun.core.annotation.NameInMap("LevelList")
        private java.util.List<String> levelList;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

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
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private java.util.List<String> eventTypeList; 
            private java.util.List<String> levelList; 
            private java.util.List<String> nameList; 
            private String product; 
            private java.util.List<String> statusList; 

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
            public Builder eventTypeList(java.util.List<String> eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * LevelList.
             */
            public Builder levelList(java.util.List<String> levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * NameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
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

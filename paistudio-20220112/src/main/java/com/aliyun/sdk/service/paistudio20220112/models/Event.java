// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link Event} extends {@link TeaModel}
 *
 * <p>Event</p>
 */
public class Event extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.NameInMap("Function")
    private String function;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("TriggerTenantId")
    private String triggerTenantId;

    @com.aliyun.core.annotation.NameInMap("TriggerTime")
    private String triggerTime;

    @com.aliyun.core.annotation.NameInMap("TriggerUserId")
    private String triggerUserId;

    @com.aliyun.core.annotation.NameInMap("TriggeredBy")
    private String triggeredBy;

    private Event(Builder builder) {
        this.content = builder.content;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.function = builder.function;
        this.isTruncated = builder.isTruncated;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.triggerTenantId = builder.triggerTenantId;
        this.triggerTime = builder.triggerTime;
        this.triggerUserId = builder.triggerUserId;
        this.triggeredBy = builder.triggeredBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Event create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return triggerTenantId
     */
    public String getTriggerTenantId() {
        return this.triggerTenantId;
    }

    /**
     * @return triggerTime
     */
    public String getTriggerTime() {
        return this.triggerTime;
    }

    /**
     * @return triggerUserId
     */
    public String getTriggerUserId() {
        return this.triggerUserId;
    }

    /**
     * @return triggeredBy
     */
    public String getTriggeredBy() {
        return this.triggeredBy;
    }

    public static final class Builder {
        private String content; 
        private String eventId; 
        private String eventType; 
        private String function; 
        private Boolean isTruncated; 
        private String objectId; 
        private String objectType; 
        private String triggerTenantId; 
        private String triggerTime; 
        private String triggerUserId; 
        private String triggeredBy; 

        private Builder() {
        } 

        private Builder(Event model) {
            this.content = model.content;
            this.eventId = model.eventId;
            this.eventType = model.eventType;
            this.function = model.function;
            this.isTruncated = model.isTruncated;
            this.objectId = model.objectId;
            this.objectType = model.objectType;
            this.triggerTenantId = model.triggerTenantId;
            this.triggerTime = model.triggerTime;
            this.triggerUserId = model.triggerUserId;
            this.triggeredBy = model.triggeredBy;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
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
         * Function.
         */
        public Builder function(String function) {
            this.function = function;
            return this;
        }

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * TriggerTenantId.
         */
        public Builder triggerTenantId(String triggerTenantId) {
            this.triggerTenantId = triggerTenantId;
            return this;
        }

        /**
         * TriggerTime.
         */
        public Builder triggerTime(String triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }

        /**
         * TriggerUserId.
         */
        public Builder triggerUserId(String triggerUserId) {
            this.triggerUserId = triggerUserId;
            return this;
        }

        /**
         * TriggeredBy.
         */
        public Builder triggeredBy(String triggeredBy) {
            this.triggeredBy = triggeredBy;
            return this;
        }

        public Event build() {
            return new Event(this);
        } 

    } 

}

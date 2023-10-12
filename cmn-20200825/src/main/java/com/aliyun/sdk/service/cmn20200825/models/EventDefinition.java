// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventDefinition} extends {@link TeaModel}
 *
 * <p>EventDefinition</p>
 */
public class EventDefinition extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EventId")
    private String eventId;

    @NameInMap("EventName")
    private String eventName;

    @NameInMap("EventType")
    private String eventType;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private EventDefinition(Builder builder) {
        this.createTime = builder.createTime;
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.eventType = builder.eventType;
        this.templateId = builder.templateId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventDefinition create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String eventId; 
        private String eventName; 
        private String eventType; 
        private String templateId; 
        private String updateTime; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public EventDefinition build() {
            return new EventDefinition(this);
        } 

    } 

}

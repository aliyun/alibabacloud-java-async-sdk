// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link SandboxLifecycleEvent} extends {@link TeaModel}
 *
 * <p>SandboxLifecycleEvent</p>
 */
public class SandboxLifecycleEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("buildID")
    private String buildID;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("eventData")
    private java.util.Map<String, ?> eventData;

    @com.aliyun.core.annotation.NameInMap("eventID")
    private String eventID;

    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("occurredAt")
    private String occurredAt;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("sandboxID")
    private String sandboxID;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private SandboxLifecycleEvent(Builder builder) {
        this.action = builder.action;
        this.buildID = builder.buildID;
        this.description = builder.description;
        this.eventData = builder.eventData;
        this.eventID = builder.eventID;
        this.eventType = builder.eventType;
        this.level = builder.level;
        this.occurredAt = builder.occurredAt;
        this.reason = builder.reason;
        this.sandboxID = builder.sandboxID;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SandboxLifecycleEvent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return buildID
     */
    public String getBuildID() {
        return this.buildID;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventData
     */
    public java.util.Map<String, ?> getEventData() {
        return this.eventData;
    }

    /**
     * @return eventID
     */
    public String getEventID() {
        return this.eventID;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return occurredAt
     */
    public String getOccurredAt() {
        return this.occurredAt;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sandboxID
     */
    public String getSandboxID() {
        return this.sandboxID;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder {
        private String action; 
        private String buildID; 
        private String description; 
        private java.util.Map<String, ?> eventData; 
        private String eventID; 
        private String eventType; 
        private String level; 
        private String occurredAt; 
        private String reason; 
        private String sandboxID; 
        private String teamID; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(SandboxLifecycleEvent model) {
            this.action = model.action;
            this.buildID = model.buildID;
            this.description = model.description;
            this.eventData = model.eventData;
            this.eventID = model.eventID;
            this.eventType = model.eventType;
            this.level = model.level;
            this.occurredAt = model.occurredAt;
            this.reason = model.reason;
            this.sandboxID = model.sandboxID;
            this.teamID = model.teamID;
            this.templateID = model.templateID;
        } 

        /**
         * <p>The action that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>delete</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The template build ID. This field is not returned if there is no associated build.</p>
         * 
         * <strong>example:</strong>
         * <p>bld-example-001</p>
         */
        public Builder buildID(String buildID) {
            this.buildID = buildID;
            return this;
        }

        /**
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sandbox deleted</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The event data as a JSON object. The specific fields vary depending on the event type.</p>
         */
        public Builder eventData(java.util.Map<String, ?> eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>df3c6750-2c5e-50d1-8b81-7a2248f6ca3b</p>
         */
        public Builder eventID(String eventID) {
            this.eventID = eventID;
            return this;
        }

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>terminated</p>
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The event category. Valid values: INFO and WARNING.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The time when the event occurred. The time is in UTC RFC3339 format and supports fractional seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08T06:18:38.123Z</p>
         */
        public Builder occurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }

        /**
         * <p>The reason for the event. This field is not returned if there is no reason.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sbx-62105527-699e-48df-ad3b-7425001ae4f2</p>
         */
        public Builder sandboxID(String sandboxID) {
            this.sandboxID = sandboxID;
            return this;
        }

        /**
         * <p>The ID of the team to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0333-58d8-97ac-5336eb9179eb</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4hrtmghh2nzrsdh6yr65</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public SandboxLifecycleEvent build() {
            return new SandboxLifecycleEvent(this);
        } 

    } 

}

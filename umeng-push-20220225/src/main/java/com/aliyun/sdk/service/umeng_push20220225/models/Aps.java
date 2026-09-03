// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

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
 * {@link Aps} extends {@link TeaModel}
 *
 * <p>Aps</p>
 */
public class Aps extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alert")
    private Alert alert;

    @com.aliyun.core.annotation.NameInMap("attributes")
    private String attributes;

    @com.aliyun.core.annotation.NameInMap("attributesType")
    private String attributesType;

    @com.aliyun.core.annotation.NameInMap("badge")
    private String badge;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("contentAvailable")
    private Integer contentAvailable;

    @com.aliyun.core.annotation.NameInMap("contentState")
    private String contentState;

    @com.aliyun.core.annotation.NameInMap("dismissalDate")
    private Integer dismissalDate;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("interruptionLevel")
    private String interruptionLevel;

    @com.aliyun.core.annotation.NameInMap("mutableContent")
    private Integer mutableContent;

    @com.aliyun.core.annotation.NameInMap("sound")
    private String sound;

    @com.aliyun.core.annotation.NameInMap("threadID")
    private String threadID;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Integer timestamp;

    private Aps(Builder builder) {
        this.alert = builder.alert;
        this.attributes = builder.attributes;
        this.attributesType = builder.attributesType;
        this.badge = builder.badge;
        this.category = builder.category;
        this.contentAvailable = builder.contentAvailable;
        this.contentState = builder.contentState;
        this.dismissalDate = builder.dismissalDate;
        this.event = builder.event;
        this.interruptionLevel = builder.interruptionLevel;
        this.mutableContent = builder.mutableContent;
        this.sound = builder.sound;
        this.threadID = builder.threadID;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Aps create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alert
     */
    public Alert getAlert() {
        return this.alert;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return attributesType
     */
    public String getAttributesType() {
        return this.attributesType;
    }

    /**
     * @return badge
     */
    public String getBadge() {
        return this.badge;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return contentAvailable
     */
    public Integer getContentAvailable() {
        return this.contentAvailable;
    }

    /**
     * @return contentState
     */
    public String getContentState() {
        return this.contentState;
    }

    /**
     * @return dismissalDate
     */
    public Integer getDismissalDate() {
        return this.dismissalDate;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return interruptionLevel
     */
    public String getInterruptionLevel() {
        return this.interruptionLevel;
    }

    /**
     * @return mutableContent
     */
    public Integer getMutableContent() {
        return this.mutableContent;
    }

    /**
     * @return sound
     */
    public String getSound() {
        return this.sound;
    }

    /**
     * @return threadID
     */
    public String getThreadID() {
        return this.threadID;
    }

    /**
     * @return timestamp
     */
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Alert alert; 
        private String attributes; 
        private String attributesType; 
        private String badge; 
        private String category; 
        private Integer contentAvailable; 
        private String contentState; 
        private Integer dismissalDate; 
        private String event; 
        private String interruptionLevel; 
        private Integer mutableContent; 
        private String sound; 
        private String threadID; 
        private Integer timestamp; 

        private Builder() {
        } 

        private Builder(Aps model) {
            this.alert = model.alert;
            this.attributes = model.attributes;
            this.attributesType = model.attributesType;
            this.badge = model.badge;
            this.category = model.category;
            this.contentAvailable = model.contentAvailable;
            this.contentState = model.contentState;
            this.dismissalDate = model.dismissalDate;
            this.event = model.event;
            this.interruptionLevel = model.interruptionLevel;
            this.mutableContent = model.mutableContent;
            this.sound = model.sound;
            this.threadID = model.threadID;
            this.timestamp = model.timestamp;
        } 

        /**
         * alert.
         */
        public Builder alert(Alert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * attributes.
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * attributesType.
         */
        public Builder attributesType(String attributesType) {
            this.attributesType = attributesType;
            return this;
        }

        /**
         * badge.
         */
        public Builder badge(String badge) {
            this.badge = badge;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * contentAvailable.
         */
        public Builder contentAvailable(Integer contentAvailable) {
            this.contentAvailable = contentAvailable;
            return this;
        }

        /**
         * contentState.
         */
        public Builder contentState(String contentState) {
            this.contentState = contentState;
            return this;
        }

        /**
         * dismissalDate.
         */
        public Builder dismissalDate(Integer dismissalDate) {
            this.dismissalDate = dismissalDate;
            return this;
        }

        /**
         * event.
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * interruptionLevel.
         */
        public Builder interruptionLevel(String interruptionLevel) {
            this.interruptionLevel = interruptionLevel;
            return this;
        }

        /**
         * mutableContent.
         */
        public Builder mutableContent(Integer mutableContent) {
            this.mutableContent = mutableContent;
            return this;
        }

        /**
         * sound.
         */
        public Builder sound(String sound) {
            this.sound = sound;
            return this;
        }

        /**
         * threadID.
         */
        public Builder threadID(String threadID) {
            this.threadID = threadID;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Aps build() {
            return new Aps(this);
        } 

    } 

}

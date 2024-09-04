// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Aps} extends {@link TeaModel}
 *
 * <p>Aps</p>
 */
public class Aps extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alert")
    private Alert alert;

    @com.aliyun.core.annotation.NameInMap("badge")
    private String badge;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("contentAvailable")
    private Integer contentAvailable;

    @com.aliyun.core.annotation.NameInMap("interruptionLevel")
    private String interruptionLevel;

    @com.aliyun.core.annotation.NameInMap("sound")
    private String sound;

    @com.aliyun.core.annotation.NameInMap("threadID")
    private String threadID;

    private Aps(Builder builder) {
        this.alert = builder.alert;
        this.badge = builder.badge;
        this.category = builder.category;
        this.contentAvailable = builder.contentAvailable;
        this.interruptionLevel = builder.interruptionLevel;
        this.sound = builder.sound;
        this.threadID = builder.threadID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Aps create() {
        return builder().build();
    }

    /**
     * @return alert
     */
    public Alert getAlert() {
        return this.alert;
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
     * @return interruptionLevel
     */
    public String getInterruptionLevel() {
        return this.interruptionLevel;
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

    public static final class Builder {
        private Alert alert; 
        private String badge; 
        private String category; 
        private Integer contentAvailable; 
        private String interruptionLevel; 
        private String sound; 
        private String threadID; 

        /**
         * alert.
         */
        public Builder alert(Alert alert) {
            this.alert = alert;
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
         * interruptionLevel.
         */
        public Builder interruptionLevel(String interruptionLevel) {
            this.interruptionLevel = interruptionLevel;
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

        public Aps build() {
            return new Aps(this);
        } 

    } 

}

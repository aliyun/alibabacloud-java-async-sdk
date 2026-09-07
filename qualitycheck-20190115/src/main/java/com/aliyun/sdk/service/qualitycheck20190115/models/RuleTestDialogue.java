// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link RuleTestDialogue} extends {@link TeaModel}
 *
 * <p>RuleTestDialogue</p>
 */
public class RuleTestDialogue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("UserGroup")
    private String userGroup;

    private RuleTestDialogue(Builder builder) {
        this.content = builder.content;
        this.id = builder.id;
        this.name = builder.name;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuleTestDialogue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return userGroup
     */
    public String getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private Long id; 
        private String name; 
        private String userGroup; 

        private Builder() {
        } 

        private Builder(RuleTestDialogue model) {
            this.content = model.content;
            this.id = model.id;
            this.name = model.name;
            this.userGroup = model.userGroup;
        } 

        /**
         * <p>Content</p>
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Conversation ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Conversation Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>group</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public RuleTestDialogue build() {
            return new RuleTestDialogue(this);
        } 

    } 

    /**
     * 
     * {@link RuleTestDialogue} extends {@link TeaModel}
     *
     * <p>RuleTestDialogue</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("HourMinSec")
        private String hourMinSec;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Long silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Long speechRate;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Content(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.hourMinSec = builder.hourMinSec;
            this.identity = builder.identity;
            this.role = builder.role;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return hourMinSec
         */
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return silenceDuration
         */
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Long getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Long beginTime; 
            private Integer emotionValue; 
            private Long end; 
            private String hourMinSec; 
            private String identity; 
            private String role; 
            private Long silenceDuration; 
            private Long speechRate; 
            private String words; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.begin = model.begin;
                this.beginTime = model.beginTime;
                this.emotionValue = model.emotionValue;
                this.end = model.end;
                this.hourMinSec = model.hourMinSec;
                this.identity = model.identity;
                this.role = model.role;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * <p>Start Time in long</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Start Time in long</p>
             * 
             * <strong>example:</strong>
             * <p>350</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>Emotion energy value</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>End time in long</p>
             * 
             * <strong>example:</strong>
             * <p>1360</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Hour, minute, second</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
                return this;
            }

            /**
             * <p>Identity</p>
             * 
             * <strong>example:</strong>
             * <p>客户</p>
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * <p>Role</p>
             * 
             * <strong>example:</strong>
             * <p>客户</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Silence duration</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>Speech rate</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder speechRate(Long speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>Dialogue</p>
             * 
             * <strong>example:</strong>
             * <p>方便</p>
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RuleTestDialogue} extends {@link TeaModel}
 *
 * <p>RuleTestDialogue</p>
 */
public class RuleTestDialogue extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Name")
    private String name;

    @NameInMap("UserGroup")
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

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
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
        private java.util.List < Content> content; 
        private Long id; 
        private String name; 
        private String userGroup; 

        /**
         * 对话内容
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * 对话ID
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 对话名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 用户组
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public RuleTestDialogue build() {
            return new RuleTestDialogue(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Long end;

        @NameInMap("HourMinSec")
        private String hourMinSec;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("Role")
        private String role;

        @NameInMap("SilenceDuration")
        private Long silenceDuration;

        @NameInMap("SpeechRate")
        private Long speechRate;

        @NameInMap("Words")
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

            /**
             * 开始时间InLong
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * 开始时间InLong
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * 情绪能量值
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * 结束时间inLong
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * 时分秒
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
                return this;
            }

            /**
             * 身份标识
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * 角色
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 静音时长
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * 语速
             */
            public Builder speechRate(Long speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * 对话
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

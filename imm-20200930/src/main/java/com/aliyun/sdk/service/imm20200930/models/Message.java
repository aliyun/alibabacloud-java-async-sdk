// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Message} extends {@link TeaModel}
 *
 * <p>Message</p>
 */
public class Message extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssistantType")
    private String assistantType;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Regenerate")
    private Boolean regenerate;

    @com.aliyun.core.annotation.NameInMap("Reply")
    private String reply;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("SourceURI")
    private String sourceURI;

    @com.aliyun.core.annotation.NameInMap("Suggestion")
    private String suggestion;

    @com.aliyun.core.annotation.NameInMap("Tone")
    private String tone;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private Message(Builder builder) {
        this.assistantType = builder.assistantType;
        this.content = builder.content;
        this.createTime = builder.createTime;
        this.datasetName = builder.datasetName;
        this.language = builder.language;
        this.regenerate = builder.regenerate;
        this.reply = builder.reply;
        this.score = builder.score;
        this.sourceURI = builder.sourceURI;
        this.suggestion = builder.suggestion;
        this.tone = builder.tone;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Message create() {
        return builder().build();
    }

    /**
     * @return assistantType
     */
    public String getAssistantType() {
        return this.assistantType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return regenerate
     */
    public Boolean getRegenerate() {
        return this.regenerate;
    }

    /**
     * @return reply
     */
    public String getReply() {
        return this.reply;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return tone
     */
    public String getTone() {
        return this.tone;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder {
        private String assistantType; 
        private String content; 
        private String createTime; 
        private String datasetName; 
        private String language; 
        private Boolean regenerate; 
        private String reply; 
        private Double score; 
        private String sourceURI; 
        private String suggestion; 
        private String tone; 
        private String topic; 

        /**
         * AssistantType.
         */
        public Builder assistantType(String assistantType) {
            this.assistantType = assistantType;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Regenerate.
         */
        public Builder regenerate(Boolean regenerate) {
            this.regenerate = regenerate;
            return this;
        }

        /**
         * Reply.
         */
        public Builder reply(String reply) {
            this.reply = reply;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * Suggestion.
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        /**
         * Tone.
         */
        public Builder tone(String tone) {
            this.tone = tone;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public Message build() {
            return new Message(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link AITeacherExpansionPracticeTaskGenerateRequest} extends {@link RequestModel}
 *
 * <p>AITeacherExpansionPracticeTaskGenerateRequest</p>
 */
public class AITeacherExpansionPracticeTaskGenerateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grade")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keySentences")
    private java.util.List<String> keySentences;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyWords")
    private java.util.List<String> keyWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("learningObject")
    private String learningObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textbook")
    private String textbook;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private AITeacherExpansionPracticeTaskGenerateRequest(Builder builder) {
        super(builder);
        this.grade = builder.grade;
        this.keySentences = builder.keySentences;
        this.keyWords = builder.keyWords;
        this.learningObject = builder.learningObject;
        this.textContent = builder.textContent;
        this.textbook = builder.textbook;
        this.topic = builder.topic;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AITeacherExpansionPracticeTaskGenerateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * @return keySentences
     */
    public java.util.List<String> getKeySentences() {
        return this.keySentences;
    }

    /**
     * @return keyWords
     */
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    /**
     * @return learningObject
     */
    public String getLearningObject() {
        return this.learningObject;
    }

    /**
     * @return textContent
     */
    public String getTextContent() {
        return this.textContent;
    }

    /**
     * @return textbook
     */
    public String getTextbook() {
        return this.textbook;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AITeacherExpansionPracticeTaskGenerateRequest, Builder> {
        private String grade; 
        private java.util.List<String> keySentences; 
        private java.util.List<String> keyWords; 
        private String learningObject; 
        private String textContent; 
        private String textbook; 
        private String topic; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AITeacherExpansionPracticeTaskGenerateRequest request) {
            super(request);
            this.grade = request.grade;
            this.keySentences = request.keySentences;
            this.keyWords = request.keyWords;
            this.learningObject = request.learningObject;
            this.textContent = request.textContent;
            this.textbook = request.textbook;
            this.topic = request.topic;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder grade(String grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * keySentences.
         */
        public Builder keySentences(java.util.List<String> keySentences) {
            this.putBodyParameter("keySentences", keySentences);
            this.keySentences = keySentences;
            return this;
        }

        /**
         * keyWords.
         */
        public Builder keyWords(java.util.List<String> keyWords) {
            this.putBodyParameter("keyWords", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * learningObject.
         */
        public Builder learningObject(String learningObject) {
            this.putBodyParameter("learningObject", learningObject);
            this.learningObject = learningObject;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dog walker Dog walking, as a profession, originated in the US. Some may think that it&quot;s a perfect job, because dog walkers won&quot;t be imprisoned in an office. But it&quot;s actually manual labour. At their busiest, dog walkers may have more than ten dogs to take care of in a day. Hotel test sleeper A hotel test sleeper, as the name suggests, has to write expert reviews about the facilities, locations, prices, dining and other services of hotels, in order to provide evaluations and guides for travelers. Hotel test sleepers don&quot;t need to punch in for work and they get about ten thousand yuan as income every month. What a comfortable job! Food taster In ancient times, a food taster was a person who tasted foods (or drinks) to be served to someone else, to confirm that it was safe to eat. But now, those working as food tasters just get to taste various new foods and drinks aimed at specific regions across the world. They then give their opinions on these products to the companies and suggest improvements.</p>
         */
        public Builder textContent(String textContent) {
            this.putBodyParameter("textContent", textContent);
            this.textContent = textContent;
            return this;
        }

        /**
         * textbook.
         */
        public Builder textbook(String textbook) {
            this.putBodyParameter("textbook", textbook);
            this.textbook = textbook;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>talk about your dream job.</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6440xxxxxxxxxx5fafc98c421</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AITeacherExpansionPracticeTaskGenerateRequest build() {
            return new AITeacherExpansionPracticeTaskGenerateRequest(this);
        } 

    } 

}

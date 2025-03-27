// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link AddCustomQARequest} extends {@link RequestModel}
 *
 * <p>AddCustomQARequest</p>
 */
public class AddCustomQARequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Answers")
    private java.util.List<String> answers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWords")
    private java.util.List<String> keyWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MajorQuestion")
    private String majorQuestion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SupplementaryQuestions")
    private java.util.List<String> supplementaryQuestions;

    private AddCustomQARequest(Builder builder) {
        super(builder);
        this.answers = builder.answers;
        this.hotelId = builder.hotelId;
        this.keyWords = builder.keyWords;
        this.majorQuestion = builder.majorQuestion;
        this.supplementaryQuestions = builder.supplementaryQuestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomQARequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answers
     */
    public java.util.List<String> getAnswers() {
        return this.answers;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return keyWords
     */
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    /**
     * @return majorQuestion
     */
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    /**
     * @return supplementaryQuestions
     */
    public java.util.List<String> getSupplementaryQuestions() {
        return this.supplementaryQuestions;
    }

    public static final class Builder extends Request.Builder<AddCustomQARequest, Builder> {
        private java.util.List<String> answers; 
        private String hotelId; 
        private java.util.List<String> keyWords; 
        private String majorQuestion; 
        private java.util.List<String> supplementaryQuestions; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomQARequest request) {
            super(request);
            this.answers = request.answers;
            this.hotelId = request.hotelId;
            this.keyWords = request.keyWords;
            this.majorQuestion = request.majorQuestion;
            this.supplementaryQuestions = request.supplementaryQuestions;
        } 

        /**
         * Answers.
         */
        public Builder answers(java.util.List<String> answers) {
            String answersShrink = shrink(answers, "Answers", "json");
            this.putBodyParameter("Answers", answersShrink);
            this.answers = answers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7a3***013</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * KeyWords.
         */
        public Builder keyWords(java.util.List<String> keyWords) {
            String keyWordsShrink = shrink(keyWords, "KeyWords", "json");
            this.putBodyParameter("KeyWords", keyWordsShrink);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * MajorQuestion.
         */
        public Builder majorQuestion(String majorQuestion) {
            this.putBodyParameter("MajorQuestion", majorQuestion);
            this.majorQuestion = majorQuestion;
            return this;
        }

        /**
         * SupplementaryQuestions.
         */
        public Builder supplementaryQuestions(java.util.List<String> supplementaryQuestions) {
            String supplementaryQuestionsShrink = shrink(supplementaryQuestions, "SupplementaryQuestions", "json");
            this.putBodyParameter("SupplementaryQuestions", supplementaryQuestionsShrink);
            this.supplementaryQuestions = supplementaryQuestions;
            return this;
        }

        @Override
        public AddCustomQARequest build() {
            return new AddCustomQARequest(this);
        } 

    } 

}

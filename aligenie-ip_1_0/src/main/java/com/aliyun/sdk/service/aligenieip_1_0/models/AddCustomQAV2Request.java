// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomQAV2Request} extends {@link RequestModel}
 *
 * <p>AddCustomQAV2Request</p>
 */
public class AddCustomQAV2Request extends Request {
    @Body
    @NameInMap("Answers")
    @Validation(required = true)
    private java.util.List < String > answers;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("KeyWords")
    private java.util.List < String > keyWords;

    @Body
    @NameInMap("MajorQuestion")
    private String majorQuestion;

    @Body
    @NameInMap("SupplementaryQuestions")
    private java.util.List < String > supplementaryQuestions;

    private AddCustomQAV2Request(Builder builder) {
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

    public static AddCustomQAV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answers
     */
    public java.util.List < String > getAnswers() {
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
    public java.util.List < String > getKeyWords() {
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
    public java.util.List < String > getSupplementaryQuestions() {
        return this.supplementaryQuestions;
    }

    public static final class Builder extends Request.Builder<AddCustomQAV2Request, Builder> {
        private java.util.List < String > answers; 
        private String hotelId; 
        private java.util.List < String > keyWords; 
        private String majorQuestion; 
        private java.util.List < String > supplementaryQuestions; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomQAV2Request request) {
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
        public Builder answers(java.util.List < String > answers) {
            String answersShrink = shrink(answers, "Answers", "json");
            this.putBodyParameter("Answers", answersShrink);
            this.answers = answers;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * KeyWords.
         */
        public Builder keyWords(java.util.List < String > keyWords) {
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
        public Builder supplementaryQuestions(java.util.List < String > supplementaryQuestions) {
            String supplementaryQuestionsShrink = shrink(supplementaryQuestions, "SupplementaryQuestions", "json");
            this.putBodyParameter("SupplementaryQuestions", supplementaryQuestionsShrink);
            this.supplementaryQuestions = supplementaryQuestions;
            return this;
        }

        @Override
        public AddCustomQAV2Request build() {
            return new AddCustomQAV2Request(this);
        } 

    } 

}

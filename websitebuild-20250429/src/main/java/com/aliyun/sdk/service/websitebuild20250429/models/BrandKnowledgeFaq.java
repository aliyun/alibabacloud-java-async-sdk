// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeFaq} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeFaq</p>
 */
public class BrandKnowledgeFaq extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("Question")
    private String question;

    private BrandKnowledgeFaq(Builder builder) {
        this.answer = builder.answer;
        this.question = builder.question;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeFaq create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    public static final class Builder {
        private String answer; 
        private String question; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeFaq model) {
            this.answer = model.answer;
            this.question = model.question;
        } 

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(String question) {
            this.question = question;
            return this;
        }

        public BrandKnowledgeFaq build() {
            return new BrandKnowledgeFaq(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GuidingQuestion} extends {@link TeaModel}
 *
 * <p>GuidingQuestion</p>
 */
public class GuidingQuestion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("Question")
    private String question;

    private GuidingQuestion(Builder builder) {
        this.answer = builder.answer;
        this.question = builder.question;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GuidingQuestion create() {
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

        private Builder(GuidingQuestion model) {
            this.answer = model.answer;
            this.question = model.question;
        } 

        /**
         * <p>The answer.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;将场景文本检测和布局分析统一起来是重要的，因为这两个任务虽然在文献中通常被独立研究，但实际上是紧密相关的。&quot;</p>
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * <p>The question.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;为什么将场景文本检测和布局分析统一起来是重要的？&quot;</p>
         */
        public Builder question(String question) {
            this.question = question;
            return this;
        }

        public GuidingQuestion build() {
            return new GuidingQuestion(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SubmitTodoRequest} extends {@link RequestModel}
 *
 * <p>SubmitTodoRequest</p>
 */
public class SubmitTodoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("answers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Answers> answers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String todoId;

    private SubmitTodoRequest(Builder builder) {
        super(builder);
        this.answers = builder.answers;
        this.tenantId = builder.tenantId;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTodoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answers
     */
    public java.util.List<Answers> getAnswers() {
        return this.answers;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return todoId
     */
    public String getTodoId() {
        return this.todoId;
    }

    public static final class Builder extends Request.Builder<SubmitTodoRequest, Builder> {
        private java.util.List<Answers> answers; 
        private String tenantId; 
        private String todoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTodoRequest request) {
            super(request);
            this.answers = request.answers;
            this.tenantId = request.tenantId;
            this.todoId = request.todoId;
        } 

        /**
         * <p>The array of answers. The original text of the question must match the to-do question.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder answers(java.util.List<Answers> answers) {
            String answersShrink = shrink(answers, "answers", "json");
            this.putBodyParameter("answers", answersShrink);
            this.answers = answers;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the to-do item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.putBodyParameter("todoId", todoId);
            this.todoId = todoId;
            return this;
        }

        @Override
        public SubmitTodoRequest build() {
            return new SubmitTodoRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTodoRequest} extends {@link TeaModel}
     *
     * <p>SubmitTodoRequest</p>
     */
    public static class Answers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> answer;

        @com.aliyun.core.annotation.NameInMap("question")
        @com.aliyun.core.annotation.Validation(required = true)
        private String question;

        private Answers(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Answers create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public java.util.List<String> getAnswer() {
            return this.answer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        public static final class Builder {
            private java.util.List<String> answer; 
            private String question; 

            private Builder() {
            } 

            private Builder(Answers model) {
                this.answer = model.answer;
                this.question = model.question;
            } 

            /**
             * <p>The array of answer values.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder answer(java.util.List<String> answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The original text that corresponds to questions[].question.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Whether to approve</p>
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            public Answers build() {
                return new Answers(this);
            } 

        } 

    }
}

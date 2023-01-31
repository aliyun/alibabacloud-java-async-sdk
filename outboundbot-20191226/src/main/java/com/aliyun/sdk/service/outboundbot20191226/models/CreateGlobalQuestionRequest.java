// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>CreateGlobalQuestionRequest</p>
 */
public class CreateGlobalQuestionRequest extends Request {
    @Query
    @NameInMap("Answers")
    @Validation(required = true)
    private String answers;

    @Query
    @NameInMap("GlobalQuestionName")
    @Validation(required = true)
    private String globalQuestionName;

    @Query
    @NameInMap("GlobalQuestionType")
    @Validation(required = true)
    private String globalQuestionType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Questions")
    @Validation(required = true)
    private String questions;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private CreateGlobalQuestionRequest(Builder builder) {
        super(builder);
        this.answers = builder.answers;
        this.globalQuestionName = builder.globalQuestionName;
        this.globalQuestionType = builder.globalQuestionType;
        this.instanceId = builder.instanceId;
        this.questions = builder.questions;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalQuestionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answers
     */
    public String getAnswers() {
        return this.answers;
    }

    /**
     * @return globalQuestionName
     */
    public String getGlobalQuestionName() {
        return this.globalQuestionName;
    }

    /**
     * @return globalQuestionType
     */
    public String getGlobalQuestionType() {
        return this.globalQuestionType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return questions
     */
    public String getQuestions() {
        return this.questions;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<CreateGlobalQuestionRequest, Builder> {
        private String answers; 
        private String globalQuestionName; 
        private String globalQuestionType; 
        private String instanceId; 
        private String questions; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGlobalQuestionRequest request) {
            super(request);
            this.answers = request.answers;
            this.globalQuestionName = request.globalQuestionName;
            this.globalQuestionType = request.globalQuestionType;
            this.instanceId = request.instanceId;
            this.questions = request.questions;
            this.scriptId = request.scriptId;
        } 

        /**
         * Answers.
         */
        public Builder answers(String answers) {
            this.putQueryParameter("Answers", answers);
            this.answers = answers;
            return this;
        }

        /**
         * GlobalQuestionName.
         */
        public Builder globalQuestionName(String globalQuestionName) {
            this.putQueryParameter("GlobalQuestionName", globalQuestionName);
            this.globalQuestionName = globalQuestionName;
            return this;
        }

        /**
         * GlobalQuestionType.
         */
        public Builder globalQuestionType(String globalQuestionType) {
            this.putQueryParameter("GlobalQuestionType", globalQuestionType);
            this.globalQuestionType = globalQuestionType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Questions.
         */
        public Builder questions(String questions) {
            this.putQueryParameter("Questions", questions);
            this.questions = questions;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public CreateGlobalQuestionRequest build() {
            return new CreateGlobalQuestionRequest(this);
        } 

    } 

}

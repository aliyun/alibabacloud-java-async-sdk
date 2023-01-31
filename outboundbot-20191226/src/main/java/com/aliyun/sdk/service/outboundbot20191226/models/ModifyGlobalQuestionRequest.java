// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>ModifyGlobalQuestionRequest</p>
 */
public class ModifyGlobalQuestionRequest extends Request {
    @Query
    @NameInMap("Answers")
    @Validation(required = true)
    private String answers;

    @Query
    @NameInMap("GlobalQuestionId")
    @Validation(required = true)
    private String globalQuestionId;

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

    private ModifyGlobalQuestionRequest(Builder builder) {
        super(builder);
        this.answers = builder.answers;
        this.globalQuestionId = builder.globalQuestionId;
        this.globalQuestionName = builder.globalQuestionName;
        this.globalQuestionType = builder.globalQuestionType;
        this.instanceId = builder.instanceId;
        this.questions = builder.questions;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalQuestionRequest create() {
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
     * @return globalQuestionId
     */
    public String getGlobalQuestionId() {
        return this.globalQuestionId;
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

    public static final class Builder extends Request.Builder<ModifyGlobalQuestionRequest, Builder> {
        private String answers; 
        private String globalQuestionId; 
        private String globalQuestionName; 
        private String globalQuestionType; 
        private String instanceId; 
        private String questions; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGlobalQuestionRequest request) {
            super(request);
            this.answers = request.answers;
            this.globalQuestionId = request.globalQuestionId;
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
         * GlobalQuestionId.
         */
        public Builder globalQuestionId(String globalQuestionId) {
            this.putQueryParameter("GlobalQuestionId", globalQuestionId);
            this.globalQuestionId = globalQuestionId;
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
        public ModifyGlobalQuestionRequest build() {
            return new ModifyGlobalQuestionRequest(this);
        } 

    } 

}

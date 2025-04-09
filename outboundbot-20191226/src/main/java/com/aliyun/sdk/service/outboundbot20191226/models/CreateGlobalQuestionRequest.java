// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>CreateGlobalQuestionRequest</p>
 */
public class CreateGlobalQuestionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Answers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String answers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalQuestionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalQuestionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalQuestionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalQuestionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Questions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String questions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder answers(String answers) {
            this.putQueryParameter("Answers", answers);
            this.answers = answers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder globalQuestionName(String globalQuestionName) {
            this.putQueryParameter("GlobalQuestionName", globalQuestionName);
            this.globalQuestionName = globalQuestionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        public Builder globalQuestionType(String globalQuestionType) {
            this.putQueryParameter("GlobalQuestionType", globalQuestionType);
            this.globalQuestionType = globalQuestionType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder questions(String questions) {
            this.putQueryParameter("Questions", questions);
            this.questions = questions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36fea72b-d6fa-4974-ace7-19ffe3f622fb</p>
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

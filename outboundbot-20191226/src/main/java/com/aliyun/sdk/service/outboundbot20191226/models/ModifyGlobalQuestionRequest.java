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
 * {@link ModifyGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>ModifyGlobalQuestionRequest</p>
 */
public class ModifyGlobalQuestionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Answers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String answers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalQuestionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalQuestionId;

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
         * <p>This parameter is required.</p>
         */
        public Builder answers(String answers) {
            this.putQueryParameter("Answers", answers);
            this.answers = answers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ad80de88-1661-445a-92ec-bf88dc45d581</p>
         */
        public Builder globalQuestionId(String globalQuestionId) {
            this.putQueryParameter("GlobalQuestionId", globalQuestionId);
            this.globalQuestionId = globalQuestionId;
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
         * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
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
         * <p>19ac2375-53e3-477f-abe9-6cd334227981</p>
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

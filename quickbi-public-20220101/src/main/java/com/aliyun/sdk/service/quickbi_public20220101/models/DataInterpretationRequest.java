// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link DataInterpretationRequest} extends {@link RequestModel}
 *
 * <p>DataInterpretationRequest</p>
 */
public class DataInterpretationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptForceOverride")
    private Boolean promptForceOverride;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    private String userPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserQuestion")
    private String userQuestion;

    private DataInterpretationRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.modelCode = builder.modelCode;
        this.promptForceOverride = builder.promptForceOverride;
        this.userPrompt = builder.userPrompt;
        this.userQuestion = builder.userQuestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataInterpretationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return promptForceOverride
     */
    public Boolean getPromptForceOverride() {
        return this.promptForceOverride;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    /**
     * @return userQuestion
     */
    public String getUserQuestion() {
        return this.userQuestion;
    }

    public static final class Builder extends Request.Builder<DataInterpretationRequest, Builder> {
        private String data; 
        private String modelCode; 
        private Boolean promptForceOverride; 
        private String userPrompt; 
        private String userQuestion; 

        private Builder() {
            super();
        } 

        private Builder(DataInterpretationRequest request) {
            super(request);
            this.data = request.data;
            this.modelCode = request.modelCode;
            this.promptForceOverride = request.promptForceOverride;
            this.userPrompt = request.userPrompt;
            this.userQuestion = request.userQuestion;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * ModelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putQueryParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * PromptForceOverride.
         */
        public Builder promptForceOverride(Boolean promptForceOverride) {
            this.putQueryParameter("PromptForceOverride", promptForceOverride);
            this.promptForceOverride = promptForceOverride;
            return this;
        }

        /**
         * UserPrompt.
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        /**
         * UserQuestion.
         */
        public Builder userQuestion(String userQuestion) {
            this.putQueryParameter("UserQuestion", userQuestion);
            this.userQuestion = userQuestion;
            return this;
        }

        @Override
        public DataInterpretationRequest build() {
            return new DataInterpretationRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest} extends {@link RequestModel}
 *
 * <p>ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest</p>
 */
public class ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essayOutline")
    private String essayOutline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essayRequirements")
    @com.aliyun.core.annotation.Validation(required = true)
    private String essayRequirements;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essayTopic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String essayTopic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String essayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("essayWordCount")
    private Long essayWordCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grade")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long grade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String responseMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest(Builder builder) {
        super(builder);
        this.essayOutline = builder.essayOutline;
        this.essayRequirements = builder.essayRequirements;
        this.essayTopic = builder.essayTopic;
        this.essayType = builder.essayType;
        this.essayWordCount = builder.essayWordCount;
        this.grade = builder.grade;
        this.responseMode = builder.responseMode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return essayOutline
     */
    public String getEssayOutline() {
        return this.essayOutline;
    }

    /**
     * @return essayRequirements
     */
    public String getEssayRequirements() {
        return this.essayRequirements;
    }

    /**
     * @return essayTopic
     */
    public String getEssayTopic() {
        return this.essayTopic;
    }

    /**
     * @return essayType
     */
    public String getEssayType() {
        return this.essayType;
    }

    /**
     * @return essayWordCount
     */
    public Long getEssayWordCount() {
        return this.essayWordCount;
    }

    /**
     * @return grade
     */
    public Long getGrade() {
        return this.grade;
    }

    /**
     * @return responseMode
     */
    public String getResponseMode() {
        return this.responseMode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest, Builder> {
        private String essayOutline; 
        private String essayRequirements; 
        private String essayTopic; 
        private String essayType; 
        private Long essayWordCount; 
        private Long grade; 
        private String responseMode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request) {
            super(request);
            this.essayOutline = request.essayOutline;
            this.essayRequirements = request.essayRequirements;
            this.essayTopic = request.essayTopic;
            this.essayType = request.essayType;
            this.essayWordCount = request.essayWordCount;
            this.grade = request.grade;
            this.responseMode = request.responseMode;
            this.userId = request.userId;
        } 

        /**
         * essayOutline.
         */
        public Builder essayOutline(String essayOutline) {
            this.putBodyParameter("essayOutline", essayOutline);
            this.essayOutline = essayOutline;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>No less than 100 words</p>
         */
        public Builder essayRequirements(String essayRequirements) {
            this.putBodyParameter("essayRequirements", essayRequirements);
            this.essayRequirements = essayRequirements;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Discuss what to eat</p>
         */
        public Builder essayTopic(String essayTopic) {
            this.putBodyParameter("essayTopic", essayTopic);
            this.essayTopic = essayTopic;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>essay</p>
         */
        public Builder essayType(String essayType) {
            this.putBodyParameter("essayType", essayType);
            this.essayType = essayType;
            return this;
        }

        /**
         * essayWordCount.
         */
        public Builder essayWordCount(Long essayWordCount) {
            this.putBodyParameter("essayWordCount", essayWordCount);
            this.essayWordCount = essayWordCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder grade(Long grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>streaming</p>
         */
        public Builder responseMode(String responseMode) {
            this.putBodyParameter("responseMode", responseMode);
            this.responseMode = responseMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest build() {
            return new ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest(this);
        } 

    } 

}

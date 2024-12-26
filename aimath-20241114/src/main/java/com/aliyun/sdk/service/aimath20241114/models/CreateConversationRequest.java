// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

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
 * {@link CreateConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateConversationRequest</p>
 */
public class CreateConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseAnalysis")
    private String exerciseAnalysis;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseAnswer")
    private String exerciseAnswer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exerciseContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExerciseType")
    private String exerciseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateConversationRequest(Builder builder) {
        super(builder);
        this.exerciseAnalysis = builder.exerciseAnalysis;
        this.exerciseAnswer = builder.exerciseAnswer;
        this.exerciseContent = builder.exerciseContent;
        this.exerciseType = builder.exerciseType;
        this.outerBizId = builder.outerBizId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConversationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exerciseAnalysis
     */
    public String getExerciseAnalysis() {
        return this.exerciseAnalysis;
    }

    /**
     * @return exerciseAnswer
     */
    public String getExerciseAnswer() {
        return this.exerciseAnswer;
    }

    /**
     * @return exerciseContent
     */
    public String getExerciseContent() {
        return this.exerciseContent;
    }

    /**
     * @return exerciseType
     */
    public String getExerciseType() {
        return this.exerciseType;
    }

    /**
     * @return outerBizId
     */
    public String getOuterBizId() {
        return this.outerBizId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateConversationRequest, Builder> {
        private String exerciseAnalysis; 
        private String exerciseAnswer; 
        private String exerciseContent; 
        private String exerciseType; 
        private String outerBizId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConversationRequest request) {
            super(request);
            this.exerciseAnalysis = request.exerciseAnalysis;
            this.exerciseAnswer = request.exerciseAnswer;
            this.exerciseContent = request.exerciseContent;
            this.exerciseType = request.exerciseType;
            this.outerBizId = request.outerBizId;
            this.userId = request.userId;
        } 

        /**
         * ExerciseAnalysis.
         */
        public Builder exerciseAnalysis(String exerciseAnalysis) {
            this.putBodyParameter("ExerciseAnalysis", exerciseAnalysis);
            this.exerciseAnalysis = exerciseAnalysis;
            return this;
        }

        /**
         * ExerciseAnswer.
         */
        public Builder exerciseAnswer(String exerciseAnswer) {
            this.putBodyParameter("ExerciseAnswer", exerciseAnswer);
            this.exerciseAnswer = exerciseAnswer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exerciseContent(String exerciseContent) {
            this.putBodyParameter("ExerciseContent", exerciseContent);
            this.exerciseContent = exerciseContent;
            return this;
        }

        /**
         * ExerciseType.
         */
        public Builder exerciseType(String exerciseType) {
            this.putBodyParameter("ExerciseType", exerciseType);
            this.exerciseType = exerciseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2r560eHAbsknrfHXVZO4L</p>
         */
        public Builder outerBizId(String outerBizId) {
            this.putBodyParameter("OuterBizId", outerBizId);
            this.outerBizId = outerBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wx-xx-yy</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateConversationRequest build() {
            return new CreateConversationRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunEssayCorrectionRequest} extends {@link RequestModel}
 *
 * <p>RunEssayCorrectionRequest</p>
 */
public class RunEssayCorrectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("answer")
    private String answer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grade")
    private String grade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("otherReviewPoints")
    private String otherReviewPoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("question")
    private String question;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subject")
    private String subject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("totalScore")
    private Integer totalScore;

    private RunEssayCorrectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.answer = builder.answer;
        this.dimensions = builder.dimensions;
        this.grade = builder.grade;
        this.modelId = builder.modelId;
        this.otherReviewPoints = builder.otherReviewPoints;
        this.question = builder.question;
        this.subject = builder.subject;
        this.totalScore = builder.totalScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEssayCorrectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return dimensions
     */
    public java.util.List<Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return otherReviewPoints
     */
    public String getOtherReviewPoints() {
        return this.otherReviewPoints;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return totalScore
     */
    public Integer getTotalScore() {
        return this.totalScore;
    }

    public static final class Builder extends Request.Builder<RunEssayCorrectionRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String answer; 
        private java.util.List<Dimensions> dimensions; 
        private String grade; 
        private String modelId; 
        private String otherReviewPoints; 
        private String question; 
        private String subject; 
        private Integer totalScore; 

        private Builder() {
            super();
        } 

        private Builder(RunEssayCorrectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.answer = request.answer;
            this.dimensions = request.dimensions;
            this.grade = request.grade;
            this.modelId = request.modelId;
            this.otherReviewPoints = request.otherReviewPoints;
            this.question = request.question;
            this.subject = request.subject;
            this.totalScore = request.totalScore;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * answer.
         */
        public Builder answer(String answer) {
            this.putBodyParameter("answer", answer);
            this.answer = answer;
            return this;
        }

        /**
         * dimensions.
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            String dimensionsShrink = shrink(dimensions, "dimensions", "json");
            this.putBodyParameter("dimensions", dimensionsShrink);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * grade.
         */
        public Builder grade(String grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * otherReviewPoints.
         */
        public Builder otherReviewPoints(String otherReviewPoints) {
            this.putBodyParameter("otherReviewPoints", otherReviewPoints);
            this.otherReviewPoints = otherReviewPoints;
            return this;
        }

        /**
         * question.
         */
        public Builder question(String question) {
            this.putBodyParameter("question", question);
            this.question = question;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * totalScore.
         */
        public Builder totalScore(Integer totalScore) {
            this.putBodyParameter("totalScore", totalScore);
            this.totalScore = totalScore;
            return this;
        }

        @Override
        public RunEssayCorrectionRequest build() {
            return new RunEssayCorrectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunEssayCorrectionRequest} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxScore")
        private Integer maxScore;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("rubric")
        private String rubric;

        private Dimensions(Builder builder) {
            this.maxScore = builder.maxScore;
            this.name = builder.name;
            this.rubric = builder.rubric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return maxScore
         */
        public Integer getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rubric
         */
        public String getRubric() {
            return this.rubric;
        }

        public static final class Builder {
            private Integer maxScore; 
            private String name; 
            private String rubric; 

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.maxScore = model.maxScore;
                this.name = model.name;
                this.rubric = model.rubric;
            } 

            /**
             * maxScore.
             */
            public Builder maxScore(Integer maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * rubric.
             */
            public Builder rubric(String rubric) {
                this.rubric = rubric;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
}

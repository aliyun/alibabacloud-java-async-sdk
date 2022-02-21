// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeRequest</p>
 */
public class UpdateKnowledgeRequest extends Request {
    @Body
    @NameInMap("Knowledge")
    @Validation(required = true)
    private Knowledge knowledge;

    private UpdateKnowledgeRequest(Builder builder) {
        super(builder);
        this.knowledge = builder.knowledge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledge
     */
    public Knowledge getKnowledge() {
        return this.knowledge;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeRequest, Builder> {
        private Knowledge knowledge; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeRequest response) {
            super(response);
            this.knowledge = response.knowledge;
        } 

        /**
         * Knowledge.
         */
        public Builder knowledge(Knowledge knowledge) {
            this.putBodyParameter("Knowledge", knowledge);
            this.knowledge = knowledge;
            return this;
        }

        @Override
        public UpdateKnowledgeRequest build() {
            return new UpdateKnowledgeRequest(this);
        } 

    } 

    public static class Outlines extends TeaModel {
        @NameInMap("Action")
        @Validation(required = true)
        private String action;

        @NameInMap("KnowledgeId")
        @Validation(required = true)
        private Long knowledgeId;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("Title")
        @Validation(required = true)
        private String title;

        private Outlines(Builder builder) {
            this.action = builder.action;
            this.knowledgeId = builder.knowledgeId;
            this.outlineId = builder.outlineId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String action; 
            private Long knowledgeId; 
            private Long outlineId; 
            private String title; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * OutlineId.
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
    public static class SimQuestions extends TeaModel {
        @NameInMap("Action")
        @Validation(required = true)
        private String action;

        @NameInMap("SimQuestionId")
        private Long simQuestionId;

        @NameInMap("Title")
        @Validation(required = true)
        private String title;

        private SimQuestions(Builder builder) {
            this.action = builder.action;
            this.simQuestionId = builder.simQuestionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimQuestions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return simQuestionId
         */
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String action; 
            private Long simQuestionId; 
            private String title; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * SimQuestionId.
             */
            public Builder simQuestionId(Long simQuestionId) {
                this.simQuestionId = simQuestionId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SimQuestions build() {
                return new SimQuestions(this);
            } 

        } 

    }
    public static class Solutions extends TeaModel {
        @NameInMap("Action")
        @Validation(required = true)
        private String action;

        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("PerspectiveIds")
        @Validation(required = true)
        private java.util.List < String > perspectiveIds;

        @NameInMap("PlainText")
        @Validation(required = true)
        private String plainText;

        @NameInMap("SolutionId")
        private Long solutionId;

        private Solutions(Builder builder) {
            this.action = builder.action;
            this.content = builder.content;
            this.perspectiveIds = builder.perspectiveIds;
            this.plainText = builder.plainText;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solutions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return perspectiveIds
         */
        public java.util.List < String > getPerspectiveIds() {
            return this.perspectiveIds;
        }

        /**
         * @return plainText
         */
        public String getPlainText() {
            return this.plainText;
        }

        /**
         * @return solutionId
         */
        public Long getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private String action; 
            private String content; 
            private java.util.List < String > perspectiveIds; 
            private String plainText; 
            private Long solutionId; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * PerspectiveIds.
             */
            public Builder perspectiveIds(java.util.List < String > perspectiveIds) {
                this.perspectiveIds = perspectiveIds;
                return this;
            }

            /**
             * PlainText.
             */
            public Builder plainText(String plainText) {
                this.plainText = plainText;
                return this;
            }

            /**
             * SolutionId.
             */
            public Builder solutionId(Long solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
    public static class Knowledge extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("KnowledgeId")
        @Validation(required = true)
        private Long knowledgeId;

        @NameInMap("KnowledgeTitle")
        @Validation(required = true)
        private String knowledgeTitle;

        @NameInMap("KnowledgeType")
        private Integer knowledgeType;

        @NameInMap("Outlines")
        private java.util.List < Outlines> outlines;

        @NameInMap("SimQuestions")
        private java.util.List < SimQuestions> simQuestions;

        @NameInMap("Solutions")
        @Validation(required = true)
        private java.util.List < Solutions> solutions;

        @NameInMap("StartDate")
        private String startDate;

        private Knowledge(Builder builder) {
            this.categoryId = builder.categoryId;
            this.endDate = builder.endDate;
            this.knowledgeId = builder.knowledgeId;
            this.knowledgeTitle = builder.knowledgeTitle;
            this.knowledgeType = builder.knowledgeType;
            this.outlines = builder.outlines;
            this.simQuestions = builder.simQuestions;
            this.solutions = builder.solutions;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Knowledge create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return knowledgeTitle
         */
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        /**
         * @return knowledgeType
         */
        public Integer getKnowledgeType() {
            return this.knowledgeType;
        }

        /**
         * @return outlines
         */
        public java.util.List < Outlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return simQuestions
         */
        public java.util.List < SimQuestions> getSimQuestions() {
            return this.simQuestions;
        }

        /**
         * @return solutions
         */
        public java.util.List < Solutions> getSolutions() {
            return this.solutions;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long categoryId; 
            private String endDate; 
            private Long knowledgeId; 
            private String knowledgeTitle; 
            private Integer knowledgeType; 
            private java.util.List < Outlines> outlines; 
            private java.util.List < SimQuestions> simQuestions; 
            private java.util.List < Solutions> solutions; 
            private String startDate; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * KnowledgeTitle.
             */
            public Builder knowledgeTitle(String knowledgeTitle) {
                this.knowledgeTitle = knowledgeTitle;
                return this;
            }

            /**
             * KnowledgeType.
             */
            public Builder knowledgeType(Integer knowledgeType) {
                this.knowledgeType = knowledgeType;
                return this;
            }

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < Outlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * SimQuestions.
             */
            public Builder simQuestions(java.util.List < SimQuestions> simQuestions) {
                this.simQuestions = simQuestions;
                return this;
            }

            /**
             * Solutions.
             */
            public Builder solutions(java.util.List < Solutions> solutions) {
                this.solutions = solutions;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public Knowledge build() {
                return new Knowledge(this);
            } 

        } 

    }
}

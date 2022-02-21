// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeRequest</p>
 */
public class CreateKnowledgeRequest extends Request {
    @Body
    @NameInMap("Knowledge")
    @Validation(required = true)
    private Knowledge knowledge;

    private CreateKnowledgeRequest(Builder builder) {
        super(builder);
        this.knowledge = builder.knowledge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeRequest create() {
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

    public static final class Builder extends Request.Builder<CreateKnowledgeRequest, Builder> {
        private Knowledge knowledge; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeRequest response) {
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
        public CreateKnowledgeRequest build() {
            return new CreateKnowledgeRequest(this);
        } 

    } 

    public static class Outlines extends TeaModel {
        @NameInMap("KnowledgeId")
        private Long knowledgeId;

        @NameInMap("Title")
        private String title;

        private Outlines(Builder builder) {
            this.knowledgeId = builder.knowledgeId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long knowledgeId; 
            private String title; 

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
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
        @NameInMap("Title")
        @Validation(required = true)
        private String title;

        private SimQuestions(Builder builder) {
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimQuestions create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String title; 

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
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("PerspectiveIds")
        private java.util.List < String > perspectiveIds;

        @NameInMap("PlainText")
        @Validation(required = true)
        private String plainText;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.perspectiveIds = builder.perspectiveIds;
            this.plainText = builder.plainText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solutions create() {
            return builder().build();
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

        public static final class Builder {
            private String content; 
            private java.util.List < String > perspectiveIds; 
            private String plainText; 

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

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
    public static class Knowledge extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        private Long categoryId;

        @NameInMap("EndDate")
        private String endDate;

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

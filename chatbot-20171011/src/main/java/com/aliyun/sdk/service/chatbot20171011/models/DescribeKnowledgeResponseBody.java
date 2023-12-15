// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeResponseBody</p>
 */
public class DescribeKnowledgeResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    private Long categoryId;

    @NameInMap("CoreWords")
    private java.util.List < String > coreWords;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateUserName")
    private String createUserName;

    @NameInMap("EndDate")
    private String endDate;

    @NameInMap("KeyWords")
    private java.util.List < String > keyWords;

    @NameInMap("KnowledgeId")
    private Long knowledgeId;

    @NameInMap("KnowledgeStatus")
    private Integer knowledgeStatus;

    @NameInMap("KnowledgeTitle")
    private String knowledgeTitle;

    @NameInMap("KnowledgeType")
    private Integer knowledgeType;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @NameInMap("Outlines")
    private java.util.List < Outlines> outlines;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SimQuestions")
    private java.util.List < SimQuestions> simQuestions;

    @NameInMap("Solutions")
    private java.util.List < Solutions> solutions;

    @NameInMap("StartDate")
    private String startDate;

    @NameInMap("Version")
    private Integer version;

    private DescribeKnowledgeResponseBody(Builder builder) {
        this.categoryId = builder.categoryId;
        this.coreWords = builder.coreWords;
        this.createTime = builder.createTime;
        this.createUserName = builder.createUserName;
        this.endDate = builder.endDate;
        this.keyWords = builder.keyWords;
        this.knowledgeId = builder.knowledgeId;
        this.knowledgeStatus = builder.knowledgeStatus;
        this.knowledgeTitle = builder.knowledgeTitle;
        this.knowledgeType = builder.knowledgeType;
        this.modifyTime = builder.modifyTime;
        this.modifyUserName = builder.modifyUserName;
        this.outlines = builder.outlines;
        this.requestId = builder.requestId;
        this.simQuestions = builder.simQuestions;
        this.solutions = builder.solutions;
        this.startDate = builder.startDate;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return coreWords
     */
    public java.util.List < String > getCoreWords() {
        return this.coreWords;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyWords
     */
    public java.util.List < String > getKeyWords() {
        return this.keyWords;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return knowledgeStatus
     */
    public Integer getKnowledgeStatus() {
        return this.knowledgeStatus;
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return outlines
     */
    public java.util.List < Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long categoryId; 
        private java.util.List < String > coreWords; 
        private String createTime; 
        private String createUserName; 
        private String endDate; 
        private java.util.List < String > keyWords; 
        private Long knowledgeId; 
        private Integer knowledgeStatus; 
        private String knowledgeTitle; 
        private Integer knowledgeType; 
        private String modifyTime; 
        private String modifyUserName; 
        private java.util.List < Outlines> outlines; 
        private String requestId; 
        private java.util.List < SimQuestions> simQuestions; 
        private java.util.List < Solutions> solutions; 
        private String startDate; 
        private Integer version; 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CoreWords.
         */
        public Builder coreWords(java.util.List < String > coreWords) {
            this.coreWords = coreWords;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
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
         * KeyWords.
         */
        public Builder keyWords(java.util.List < String > keyWords) {
            this.keyWords = keyWords;
            return this;
        }

        /**
         * FAQ ID
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * KnowledgeStatus.
         */
        public Builder knowledgeStatus(Integer knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
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
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * Version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public DescribeKnowledgeResponseBody build() {
            return new DescribeKnowledgeResponseBody(this);
        } 

    } 

    public static class Outlines extends TeaModel {
        @NameInMap("KnowledgeId")
        private Long knowledgeId;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("Title")
        private String title;

        private Outlines(Builder builder) {
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
            private Long knowledgeId; 
            private Long outlineId; 
            private String title; 

            /**
             * FAQ ID
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("SimQuestionId")
        private Long simQuestionId;

        @NameInMap("Title")
        private String title;

        private SimQuestions(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
            private String createTime; 
            private String modifyTime; 
            private Long simQuestionId; 
            private String title; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
        @NameInMap("Content")
        private String content;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("PerspectiveIds")
        private java.util.List < String > perspectiveIds;

        @NameInMap("PlainText")
        private String plainText;

        @NameInMap("SolutionId")
        private Long solutionId;

        @NameInMap("Summary")
        private String summary;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.perspectiveIds = builder.perspectiveIds;
            this.plainText = builder.plainText;
            this.solutionId = builder.solutionId;
            this.summary = builder.summary;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String modifyTime; 
            private java.util.List < String > perspectiveIds; 
            private String plainText; 
            private Long solutionId; 
            private String summary; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
}

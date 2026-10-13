// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link DescribeFaqResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaqResponseBody</p>
 */
public class DescribeFaqResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("EffectStatus")
    private Integer effectStatus;

    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private Long knowledgeId;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("Outlines")
    private java.util.List<Outlines> outlines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimQuestions")
    private java.util.List<SimQuestions> simQuestions;

    @com.aliyun.core.annotation.NameInMap("Solutions")
    private java.util.List<Solutions> solutions;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TagIdList")
    private java.util.List<Long> tagIdList;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private DescribeFaqResponseBody(Builder builder) {
        this.categoryId = builder.categoryId;
        this.createTime = builder.createTime;
        this.createUserName = builder.createUserName;
        this.effectStatus = builder.effectStatus;
        this.endDate = builder.endDate;
        this.knowledgeId = builder.knowledgeId;
        this.modifyTime = builder.modifyTime;
        this.modifyUserName = builder.modifyUserName;
        this.outlines = builder.outlines;
        this.requestId = builder.requestId;
        this.simQuestions = builder.simQuestions;
        this.solutions = builder.solutions;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.tagIdList = builder.tagIdList;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaqResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
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
     * @return effectStatus
     */
    public Integer getEffectStatus() {
        return this.effectStatus;
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
    public java.util.List<Outlines> getOutlines() {
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
    public java.util.List<SimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    /**
     * @return solutions
     */
    public java.util.List<Solutions> getSolutions() {
        return this.solutions;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tagIdList
     */
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Long categoryId; 
        private String createTime; 
        private String createUserName; 
        private Integer effectStatus; 
        private String endDate; 
        private Long knowledgeId; 
        private String modifyTime; 
        private String modifyUserName; 
        private java.util.List<Outlines> outlines; 
        private String requestId; 
        private java.util.List<SimQuestions> simQuestions; 
        private java.util.List<Solutions> solutions; 
        private String startDate; 
        private Integer status; 
        private java.util.List<Long> tagIdList; 
        private String title; 

        private Builder() {
        } 

        private Builder(DescribeFaqResponseBody model) {
            this.categoryId = model.categoryId;
            this.createTime = model.createTime;
            this.createUserName = model.createUserName;
            this.effectStatus = model.effectStatus;
            this.endDate = model.endDate;
            this.knowledgeId = model.knowledgeId;
            this.modifyTime = model.modifyTime;
            this.modifyUserName = model.modifyUserName;
            this.outlines = model.outlines;
            this.requestId = model.requestId;
            this.simQuestions = model.simQuestions;
            this.solutions = model.solutions;
            this.startDate = model.startDate;
            this.status = model.status;
            this.tagIdList = model.tagIdList;
            this.title = model.title;
        } 

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000055617</p>
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30T03:03:37Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The user who created the knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The knowledge effective status, calculated based on StartDate and EndDate. Valid values:</p>
         * <ul>
         * <li>20: effective.</li>
         * <li>21: expired.</li>
         * <li>22: pending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder effectStatus(Integer effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }

        /**
         * <p>The expiration time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-27T06:08:54Z</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The knowledge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001979424</p>
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-02T06:35:50Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The user who last modified the knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * <p>The list of related questions.</p>
         */
        public Builder outlines(java.util.List<Outlines> outlines) {
            this.outlines = outlines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8AD9FA10-7780-5E12-B701-13C928524F32</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of similar questions.</p>
         */
        public Builder simQuestions(java.util.List<SimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }

        /**
         * <p>The list of solutions.</p>
         */
        public Builder solutions(java.util.List<Solutions> solutions) {
            this.solutions = solutions;
            return this;
        }

        /**
         * <p>The effective period in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-27T07:04:39Z</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The knowledge status. Valid values:</p>
         * <ul>
         * <li>-1: deleted but not published.</li>
         * <li>1: not published.</li>
         * <li>2: published.</li>
         * <li>3: updated but not published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of label IDs.</p>
         */
        public Builder tagIdList(java.util.List<Long> tagIdList) {
            this.tagIdList = tagIdList;
            return this;
        }

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Test title</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public DescribeFaqResponseBody build() {
            return new DescribeFaqResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaqResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaqResponseBody</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnQuestionId")
        private Long connQuestionId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("OutlineId")
        private Long outlineId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Outlines(Builder builder) {
            this.connQuestionId = builder.connQuestionId;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
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
         * @return connQuestionId
         */
        public Long getConnQuestionId() {
            return this.connQuestionId;
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
            private Long connQuestionId; 
            private String createTime; 
            private String modifyTime; 
            private Long outlineId; 
            private String title; 

            private Builder() {
            } 

            private Builder(Outlines model) {
                this.connQuestionId = model.connQuestionId;
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.outlineId = model.outlineId;
                this.title = model.title;
            } 

            /**
             * <p>The related knowledge ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000098002</p>
             */
            public Builder connQuestionId(Long connQuestionId) {
                this.connQuestionId = connQuestionId;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T10:24:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T18:12:02Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The relation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>797</p>
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * <p>The related knowledge title.</p>
             * 
             * <strong>example:</strong>
             * <p>Test related question title</p>
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
    /**
     * 
     * {@link DescribeFaqResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaqResponseBody</p>
     */
    public static class SimQuestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("SimQuestionId")
        private Long simQuestionId;

        @com.aliyun.core.annotation.NameInMap("Title")
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

            private Builder() {
            } 

            private Builder(SimQuestions model) {
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.simQuestionId = model.simQuestionId;
                this.title = model.title;
            } 

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T10:24:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-29T03:55:07Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The similar question ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000000581</p>
             */
            public Builder simQuestionId(Long simQuestionId) {
                this.simQuestionId = simQuestionId;
                return this;
            }

            /**
             * <p>The similar question title.</p>
             * 
             * <strong>example:</strong>
             * <p>Test similar question title</p>
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
    /**
     * 
     * {@link DescribeFaqResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaqResponseBody</p>
     */
    public static class Solutions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private Integer contentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("PerspectiveCodes")
        private java.util.List<String> perspectiveCodes;

        @com.aliyun.core.annotation.NameInMap("PlainText")
        private String plainText;

        @com.aliyun.core.annotation.NameInMap("SolutionId")
        private Long solutionId;

        @com.aliyun.core.annotation.NameInMap("TagIdList")
        private java.util.List<Long> tagIdList;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.perspectiveCodes = builder.perspectiveCodes;
            this.plainText = builder.plainText;
            this.solutionId = builder.solutionId;
            this.tagIdList = builder.tagIdList;
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
         * @return contentType
         */
        public Integer getContentType() {
            return this.contentType;
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
         * @return perspectiveCodes
         */
        public java.util.List<String> getPerspectiveCodes() {
            return this.perspectiveCodes;
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
         * @return tagIdList
         */
        public java.util.List<Long> getTagIdList() {
            return this.tagIdList;
        }

        public static final class Builder {
            private String content; 
            private Integer contentType; 
            private String createTime; 
            private String modifyTime; 
            private java.util.List<String> perspectiveCodes; 
            private String plainText; 
            private Long solutionId; 
            private java.util.List<Long> tagIdList; 

            private Builder() {
            } 

            private Builder(Solutions model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.perspectiveCodes = model.perspectiveCodes;
                this.plainText = model.plainText;
                this.solutionId = model.solutionId;
                this.tagIdList = model.tagIdList;
            } 

            /**
             * <p>The solution content.</p>
             * 
             * <strong>example:</strong>
             * <p>Test solution content</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The solution type. Valid values:</p>
             * <ul>
             * <li>0: plain text.</li>
             * <li>1: rich text.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contentType(Integer contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T10:24:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-29T07:07:13Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The list of perspective codes.</p>
             */
            public Builder perspectiveCodes(java.util.List<String> perspectiveCodes) {
                this.perspectiveCodes = perspectiveCodes;
                return this;
            }

            /**
             * <p>The plain text content of the solution.</p>
             * 
             * <strong>example:</strong>
             * <p>Test solution content</p>
             */
            public Builder plainText(String plainText) {
                this.plainText = plainText;
                return this;
            }

            /**
             * <p>The solution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000003071</p>
             */
            public Builder solutionId(Long solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            /**
             * <p>The list of label IDs.</p>
             */
            public Builder tagIdList(java.util.List<Long> tagIdList) {
                this.tagIdList = tagIdList;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
}

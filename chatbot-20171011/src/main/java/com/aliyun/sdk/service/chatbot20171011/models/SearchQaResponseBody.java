// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchQaResponseBody} extends {@link TeaModel}
 *
 * <p>SearchQaResponseBody</p>
 */
public class SearchQaResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("QuestionList")
    private java.util.List < QuestionList> questionList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private SearchQaResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.questionList = builder.questionList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchQaResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return questionList
     */
    public java.util.List < QuestionList> getQuestionList() {
        return this.questionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < QuestionList> questionList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QuestionList.
         */
        public Builder questionList(java.util.List < QuestionList> questionList) {
            this.questionList = questionList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchQaResponseBody build() {
            return new SearchQaResponseBody(this);
        } 

    } 

    public static class QuestionList extends TeaModel {
        @NameInMap("CategoryPath")
        private String categoryPath;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("ModifiedUserName")
        private String modifiedUserName;

        @NameInMap("QuestionId")
        private Long questionId;

        @NameInMap("QuestionType")
        private Integer questionType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        private QuestionList(Builder builder) {
            this.categoryPath = builder.categoryPath;
            this.createUserName = builder.createUserName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifiedUserName = builder.modifiedUserName;
            this.questionId = builder.questionId;
            this.questionType = builder.questionType;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionList create() {
            return builder().build();
        }

        /**
         * @return categoryPath
         */
        public String getCategoryPath() {
            return this.categoryPath;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifiedUserName
         */
        public String getModifiedUserName() {
            return this.modifiedUserName;
        }

        /**
         * @return questionId
         */
        public Long getQuestionId() {
            return this.questionId;
        }

        /**
         * @return questionType
         */
        public Integer getQuestionType() {
            return this.questionType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryPath; 
            private String createUserName; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifiedUserName; 
            private Long questionId; 
            private Integer questionType; 
            private Integer status; 
            private String title; 

            /**
             * CategoryPath.
             */
            public Builder categoryPath(String categoryPath) {
                this.categoryPath = categoryPath;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ModifiedUserName.
             */
            public Builder modifiedUserName(String modifiedUserName) {
                this.modifiedUserName = modifiedUserName;
                return this;
            }

            /**
             * QuestionId.
             */
            public Builder questionId(Long questionId) {
                this.questionId = questionId;
                return this;
            }

            /**
             * QuestionType.
             */
            public Builder questionType(Integer questionType) {
                this.questionType = questionType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public QuestionList build() {
                return new QuestionList(this);
            } 

        } 

    }
}

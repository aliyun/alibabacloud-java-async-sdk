// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGlobalQuestionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGlobalQuestionsResponseBody</p>
 */
public class ListGlobalQuestionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GlobalQuestions")
    private GlobalQuestions globalQuestions;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListGlobalQuestionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.globalQuestions = builder.globalQuestions;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalQuestionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return globalQuestions
     */
    public GlobalQuestions getGlobalQuestions() {
        return this.globalQuestions;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private GlobalQuestions globalQuestions; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GlobalQuestions.
         */
        public Builder globalQuestions(GlobalQuestions globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGlobalQuestionsResponseBody build() {
            return new ListGlobalQuestionsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Answers")
        private String answers;

        @NameInMap("GlobalQuestionId")
        private String globalQuestionId;

        @NameInMap("GlobalQuestionName")
        private String globalQuestionName;

        @NameInMap("GlobalQuestionType")
        private String globalQuestionType;

        @NameInMap("Questions")
        private String questions;

        @NameInMap("ScriptId")
        private String scriptId;

        private List(Builder builder) {
            this.answers = builder.answers;
            this.globalQuestionId = builder.globalQuestionId;
            this.globalQuestionName = builder.globalQuestionName;
            this.globalQuestionType = builder.globalQuestionType;
            this.questions = builder.questions;
            this.scriptId = builder.scriptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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

        public static final class Builder {
            private String answers; 
            private String globalQuestionId; 
            private String globalQuestionName; 
            private String globalQuestionType; 
            private String questions; 
            private String scriptId; 

            /**
             * Answers.
             */
            public Builder answers(String answers) {
                this.answers = answers;
                return this;
            }

            /**
             * GlobalQuestionId.
             */
            public Builder globalQuestionId(String globalQuestionId) {
                this.globalQuestionId = globalQuestionId;
                return this;
            }

            /**
             * GlobalQuestionName.
             */
            public Builder globalQuestionName(String globalQuestionName) {
                this.globalQuestionName = globalQuestionName;
                return this;
            }

            /**
             * GlobalQuestionType.
             */
            public Builder globalQuestionType(String globalQuestionType) {
                this.globalQuestionType = globalQuestionType;
                return this;
            }

            /**
             * Questions.
             */
            public Builder questions(String questions) {
                this.questions = questions;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class GlobalQuestions extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private GlobalQuestions(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalQuestions create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public GlobalQuestions build() {
                return new GlobalQuestions(this);
            } 

        } 

    }
}

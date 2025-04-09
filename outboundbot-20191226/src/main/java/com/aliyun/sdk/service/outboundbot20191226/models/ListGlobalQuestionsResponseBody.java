// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListGlobalQuestionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGlobalQuestionsResponseBody</p>
 */
public class ListGlobalQuestionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GlobalQuestions")
    private GlobalQuestions globalQuestions;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListGlobalQuestionsResponseBody model) {
            this.code = model.code;
            this.globalQuestions = model.globalQuestions;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link ListGlobalQuestionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGlobalQuestionsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answers")
        private String answers;

        @com.aliyun.core.annotation.NameInMap("GlobalQuestionId")
        private String globalQuestionId;

        @com.aliyun.core.annotation.NameInMap("GlobalQuestionName")
        private String globalQuestionName;

        @com.aliyun.core.annotation.NameInMap("GlobalQuestionType")
        private String globalQuestionType;

        @com.aliyun.core.annotation.NameInMap("Questions")
        private String questions;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
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

            private Builder() {
            } 

            private Builder(List model) {
                this.answers = model.answers;
                this.globalQuestionId = model.globalQuestionId;
                this.globalQuestionName = model.globalQuestionName;
                this.globalQuestionType = model.globalQuestionType;
                this.questions = model.questions;
                this.scriptId = model.scriptId;
            } 

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
    /**
     * 
     * {@link ListGlobalQuestionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGlobalQuestionsResponseBody</p>
     */
    public static class GlobalQuestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(GlobalQuestions model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
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

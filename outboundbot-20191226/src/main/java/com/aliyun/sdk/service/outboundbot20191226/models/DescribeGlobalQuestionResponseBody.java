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
 * {@link DescribeGlobalQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalQuestionResponseBody</p>
 */
public class DescribeGlobalQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GlobalQuestion")
    private GlobalQuestion globalQuestion;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeGlobalQuestionResponseBody(Builder builder) {
        this.code = builder.code;
        this.globalQuestion = builder.globalQuestion;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalQuestionResponseBody create() {
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
     * @return globalQuestion
     */
    public GlobalQuestion getGlobalQuestion() {
        return this.globalQuestion;
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
        private GlobalQuestion globalQuestion; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeGlobalQuestionResponseBody model) {
            this.code = model.code;
            this.globalQuestion = model.globalQuestion;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the global question.</p>
         */
        public Builder globalQuestion(GlobalQuestion globalQuestion) {
            this.globalQuestion = globalQuestion;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGlobalQuestionResponseBody build() {
            return new DescribeGlobalQuestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalQuestionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalQuestionResponseBody</p>
     */
    public static class GlobalQuestion extends TeaModel {
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

        private GlobalQuestion(Builder builder) {
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

        public static GlobalQuestion create() {
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

            private Builder(GlobalQuestion model) {
                this.answers = model.answers;
                this.globalQuestionId = model.globalQuestionId;
                this.globalQuestionName = model.globalQuestionName;
                this.globalQuestionType = model.globalQuestionType;
                this.questions = model.questions;
                this.scriptId = model.scriptId;
            } 

            /**
             * <p>The answers to the global question.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;你好,我是你的专属客服顾问.&quot;]</p>
             */
            public Builder answers(String answers) {
                this.answers = answers;
                return this;
            }

            /**
             * <p>The ID of the global question.</p>
             * 
             * <strong>example:</strong>
             * <p>f160ec2e-94f2-4c03-87be-ece5b52d5dd9</p>
             */
            public Builder globalQuestionId(String globalQuestionId) {
                this.globalQuestionId = globalQuestionId;
                return this;
            }

            /**
             * <p>The name of the global question.</p>
             * 
             * <strong>example:</strong>
             * <p>你是谁-全局问题</p>
             */
            public Builder globalQuestionName(String globalQuestionName) {
                this.globalQuestionName = globalQuestionName;
                return this;
            }

            /**
             * <p>The type of the global question.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMON</p>
             */
            public Builder globalQuestionType(String globalQuestionType) {
                this.globalQuestionType = globalQuestionType;
                return this;
            }

            /**
             * <p>The questions mapped to this global question.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;你是谁&quot;,&quot;你叫什么&quot;]</p>
             */
            public Builder questions(String questions) {
                this.questions = questions;
                return this;
            }

            /**
             * <p>The ID of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>290e06a5-6de2-4cc8-8a9c-72b7c152256c</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            public GlobalQuestion build() {
                return new GlobalQuestion(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteTextbookAssistantGrammarCheckResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTextbookAssistantGrammarCheckResponseBody</p>
 */
public class ExecuteTextbookAssistantGrammarCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ExecuteTextbookAssistantGrammarCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantGrammarCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteTextbookAssistantGrammarCheckResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1e96d17091734639835114e12c8</p>
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

        public ExecuteTextbookAssistantGrammarCheckResponseBody build() {
            return new ExecuteTextbookAssistantGrammarCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteTextbookAssistantGrammarCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantGrammarCheckResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysis")
        private String analysis;

        @com.aliyun.core.annotation.NameInMap("correction")
        private String correction;

        @com.aliyun.core.annotation.NameInMap("correctionStatus")
        private String correctionStatus;

        private Result(Builder builder) {
            this.analysis = builder.analysis;
            this.correction = builder.correction;
            this.correctionStatus = builder.correctionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public String getAnalysis() {
            return this.analysis;
        }

        /**
         * @return correction
         */
        public String getCorrection() {
            return this.correction;
        }

        /**
         * @return correctionStatus
         */
        public String getCorrectionStatus() {
            return this.correctionStatus;
        }

        public static final class Builder {
            private String analysis; 
            private String correction; 
            private String correctionStatus; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.analysis = model.analysis;
                this.correction = model.correction;
                this.correctionStatus = model.correctionStatus;
            } 

            /**
             * <p>The error analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>主语 \&quot;I\&quot; 后应跟动词 \&quot;am\&quot; 而不是 \&quot;are\&quot;。</p>
             */
            public Builder analysis(String analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The corrected sentence.</p>
             * 
             * <strong>example:</strong>
             * <p>I am you.</p>
             */
            public Builder correction(String correction) {
                this.correction = correction;
                return this;
            }

            /**
             * <p>The grammar check result. Valid values: <code>Has_Error</code> (an error was found), <code>No_Error</code> (no errors were found), and <code>Invalid_Sentence</code> (the sentence could not be parsed).</p>
             * 
             * <strong>example:</strong>
             * <p>Has_Error</p>
             */
            public Builder correctionStatus(String correctionStatus) {
                this.correctionStatus = correctionStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteTextbookAssistantGrammarCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantGrammarCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private Result result;

        private Data(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        public static final class Builder {
            private Result result; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
            } 

            /**
             * <p>The result data.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

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
 * {@link ExecuteTextbookAssistantSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteTextbookAssistantSuggestionResponseBody</p>
 */
public class ExecuteTextbookAssistantSuggestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpstatusCode")
    private Integer httpstatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ExecuteTextbookAssistantSuggestionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpstatusCode = builder.httpstatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteTextbookAssistantSuggestionResponseBody create() {
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
     * @return httpstatusCode
     */
    public Integer getHttpstatusCode() {
        return this.httpstatusCode;
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
        private Integer httpstatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteTextbookAssistantSuggestionResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpstatusCode = model.httpstatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data object.</p>
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
        public Builder httpstatusCode(Integer httpstatusCode) {
            this.httpstatusCode = httpstatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D7D382F-9475-572E-BE83-DDFBF5C5EB24</p>
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

        public ExecuteTextbookAssistantSuggestionResponseBody build() {
            return new ExecuteTextbookAssistantSuggestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteTextbookAssistantSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantSuggestionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chineseResult")
        private String chineseResult;

        @com.aliyun.core.annotation.NameInMap("englishResult")
        private String englishResult;

        private Result(Builder builder) {
            this.chineseResult = builder.chineseResult;
            this.englishResult = builder.englishResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chineseResult
         */
        public String getChineseResult() {
            return this.chineseResult;
        }

        /**
         * @return englishResult
         */
        public String getEnglishResult() {
            return this.englishResult;
        }

        public static final class Builder {
            private String chineseResult; 
            private String englishResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.chineseResult = model.chineseResult;
                this.englishResult = model.englishResult;
            } 

            /**
             * <p>The response from the AI teacher in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>根据文章，迈克·布莱克是如何介绍自己的？</p>
             */
            public Builder chineseResult(String chineseResult) {
                this.chineseResult = chineseResult;
                return this;
            }

            /**
             * <p>The response from the AI teacher in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Good evening! From the book, how does Mike Black introduce himself?</p>
             */
            public Builder englishResult(String englishResult) {
                this.englishResult = englishResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteTextbookAssistantSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteTextbookAssistantSuggestionResponseBody</p>
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

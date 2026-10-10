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
 * {@link GetAITeacherExpansionDialogueSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAITeacherExpansionDialogueSuggestionResponseBody</p>
 */
public class GetAITeacherExpansionDialogueSuggestionResponseBody extends TeaModel {
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

    private GetAITeacherExpansionDialogueSuggestionResponseBody(Builder builder) {
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

    public static GetAITeacherExpansionDialogueSuggestionResponseBody create() {
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

        private Builder(GetAITeacherExpansionDialogueSuggestionResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>A container for the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
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
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
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

        public GetAITeacherExpansionDialogueSuggestionResponseBody build() {
            return new GetAITeacherExpansionDialogueSuggestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAITeacherExpansionDialogueSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAITeacherExpansionDialogueSuggestionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chineseResult")
        private String chineseResult;

        @com.aliyun.core.annotation.NameInMap("englishResult")
        private String englishResult;

        private Data(Builder builder) {
            this.chineseResult = builder.chineseResult;
            this.englishResult = builder.englishResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            private Builder(Data model) {
                this.chineseResult = model.chineseResult;
                this.englishResult = model.englishResult;
            } 

            /**
             * <p>The Chinese translation of the suggested response.</p>
             * 
             * <strong>example:</strong>
             * <p>谢谢莉莉.你喜欢吃肉吗，莉莉？</p>
             */
            public Builder chineseResult(String chineseResult) {
                this.chineseResult = chineseResult;
                return this;
            }

            /**
             * <p>The suggested response in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Thanks, Lily. Do you like meat, Lily?</p>
             */
            public Builder englishResult(String englishResult) {
                this.englishResult = englishResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

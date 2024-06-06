// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTranslateResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncTranslateResponseBody</p>
 */
public class GetAsyncTranslateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAsyncTranslateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTranslateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetAsyncTranslateResponseBody build() {
            return new GetAsyncTranslateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectedLanguage")
        private String detectedLanguage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TranslatedText")
        private String translatedText;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private String wordCount;

        private Data(Builder builder) {
            this.detectedLanguage = builder.detectedLanguage;
            this.status = builder.status;
            this.translatedText = builder.translatedText;
            this.wordCount = builder.wordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detectedLanguage
         */
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return translatedText
         */
        public String getTranslatedText() {
            return this.translatedText;
        }

        /**
         * @return wordCount
         */
        public String getWordCount() {
            return this.wordCount;
        }

        public static final class Builder {
            private String detectedLanguage; 
            private String status; 
            private String translatedText; 
            private String wordCount; 

            /**
             * DetectedLanguage.
             */
            public Builder detectedLanguage(String detectedLanguage) {
                this.detectedLanguage = detectedLanguage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TranslatedText.
             */
            public Builder translatedText(String translatedText) {
                this.translatedText = translatedText;
                return this;
            }

            /**
             * WordCount.
             */
            public Builder wordCount(String wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

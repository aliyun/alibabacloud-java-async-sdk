// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateGeneralResponseBody} extends {@link TeaModel}
 *
 * <p>TranslateGeneralResponseBody</p>
 */
public class TranslateGeneralResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TranslateGeneralResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateGeneralResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
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

        public TranslateGeneralResponseBody build() {
            return new TranslateGeneralResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Translated")
        private String translated;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private String wordCount;

        private Data(Builder builder) {
            this.translated = builder.translated;
            this.wordCount = builder.wordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return translated
         */
        public String getTranslated() {
            return this.translated;
        }

        /**
         * @return wordCount
         */
        public String getWordCount() {
            return this.wordCount;
        }

        public static final class Builder {
            private String translated; 
            private String wordCount; 

            /**
             * Translated.
             */
            public Builder translated(String translated) {
                this.translated = translated;
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

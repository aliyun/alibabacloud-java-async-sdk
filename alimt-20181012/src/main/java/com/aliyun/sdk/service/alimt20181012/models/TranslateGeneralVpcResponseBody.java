// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link TranslateGeneralVpcResponseBody} extends {@link TeaModel}
 *
 * <p>TranslateGeneralVpcResponseBody</p>
 */
public class TranslateGeneralVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TranslateGeneralVpcResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateGeneralVpcResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TranslateGeneralVpcResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DC2DCCC9-C3DF-4F59-8D8E-78185729F16D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TranslateGeneralVpcResponseBody build() {
            return new TranslateGeneralVpcResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TranslateGeneralVpcResponseBody} extends {@link TeaModel}
     *
     * <p>TranslateGeneralVpcResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectedLanguage")
        private String detectedLanguage;

        @com.aliyun.core.annotation.NameInMap("Translated")
        private String translated;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private String wordCount;

        private Data(Builder builder) {
            this.detectedLanguage = builder.detectedLanguage;
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
         * @return detectedLanguage
         */
        public String getDetectedLanguage() {
            return this.detectedLanguage;
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
            private String detectedLanguage; 
            private String translated; 
            private String wordCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detectedLanguage = model.detectedLanguage;
                this.translated = model.translated;
                this.wordCount = model.wordCount;
            } 

            /**
             * DetectedLanguage.
             */
            public Builder detectedLanguage(String detectedLanguage) {
                this.detectedLanguage = detectedLanguage;
                return this;
            }

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

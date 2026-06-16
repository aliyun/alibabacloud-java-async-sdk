// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link TextTranslateResponseBody} extends {@link TeaModel}
 *
 * <p>TextTranslateResponseBody</p>
 */
public class TextTranslateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TextTranslateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTranslateResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TextTranslateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TextTranslateResponseBody build() {
            return new TextTranslateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TextTranslateResponseBody} extends {@link TeaModel}
     *
     * <p>TextTranslateResponseBody</p>
     */
    public static class Translations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Characters")
        private Long characters;

        @com.aliyun.core.annotation.NameInMap("DetectedLanguage")
        private String detectedLanguage;

        @com.aliyun.core.annotation.NameInMap("TranslatedText")
        private String translatedText;

        private Translations(Builder builder) {
            this.characters = builder.characters;
            this.detectedLanguage = builder.detectedLanguage;
            this.translatedText = builder.translatedText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Translations create() {
            return builder().build();
        }

        /**
         * @return characters
         */
        public Long getCharacters() {
            return this.characters;
        }

        /**
         * @return detectedLanguage
         */
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        /**
         * @return translatedText
         */
        public String getTranslatedText() {
            return this.translatedText;
        }

        public static final class Builder {
            private Long characters; 
            private String detectedLanguage; 
            private String translatedText; 

            private Builder() {
            } 

            private Builder(Translations model) {
                this.characters = model.characters;
                this.detectedLanguage = model.detectedLanguage;
                this.translatedText = model.translatedText;
            } 

            /**
             * Characters.
             */
            public Builder characters(Long characters) {
                this.characters = characters;
                return this;
            }

            /**
             * DetectedLanguage.
             */
            public Builder detectedLanguage(String detectedLanguage) {
                this.detectedLanguage = detectedLanguage;
                return this;
            }

            /**
             * TranslatedText.
             */
            public Builder translatedText(String translatedText) {
                this.translatedText = translatedText;
                return this;
            }

            public Translations build() {
                return new Translations(this);
            } 

        } 

    }
    /**
     * 
     * {@link TextTranslateResponseBody} extends {@link TeaModel}
     *
     * <p>TextTranslateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Translations")
        private java.util.List<Translations> translations;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.translations = builder.translations;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return translations
         */
        public java.util.List<Translations> getTranslations() {
            return this.translations;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private java.util.List<Translations> translations; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.translations = model.translations;
                this.usageMap = model.usageMap;
            } 

            /**
             * Translations.
             */
            public Builder translations(java.util.List<Translations> translations) {
                this.translations = translations;
                return this;
            }

            /**
             * UsageMap.
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

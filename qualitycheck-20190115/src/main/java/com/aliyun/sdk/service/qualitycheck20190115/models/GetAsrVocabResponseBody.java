// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetAsrVocabResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsrVocabResponseBody</p>
 */
public class GetAsrVocabResponseBody extends TeaModel {
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

    private GetAsrVocabResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsrVocabResponseBody create() {
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

        private Builder(GetAsrVocabResponseBody model) {
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

        public GetAsrVocabResponseBody build() {
            return new GetAsrVocabResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAsrVocabResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsrVocabResponseBody</p>
     */
    public static class Word extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private Word(Builder builder) {
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Word create() {
            return builder().build();
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private Integer weight; 
            private String word; 

            private Builder() {
            } 

            private Builder(Word model) {
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public Word build() {
                return new Word(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAsrVocabResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsrVocabResponseBody</p>
     */
    public static class Words extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Word")
        private java.util.List<Word> word;

        private Words(Builder builder) {
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Words create() {
            return builder().build();
        }

        /**
         * @return word
         */
        public java.util.List<Word> getWord() {
            return this.word;
        }

        public static final class Builder {
            private java.util.List<Word> word; 

            private Builder() {
            } 

            private Builder(Words model) {
                this.word = model.word;
            } 

            /**
             * Word.
             */
            public Builder word(java.util.List<Word> word) {
                this.word = word;
                return this;
            }

            public Words build() {
                return new Words(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAsrVocabResponseBody} extends {@link TeaModel}
     *
     * <p>GetAsrVocabResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrVersion")
        private Integer asrVersion;

        @com.aliyun.core.annotation.NameInMap("ModelCustomizationId")
        private String modelCustomizationId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Words")
        private Words words;

        private Data(Builder builder) {
            this.asrVersion = builder.asrVersion;
            this.modelCustomizationId = builder.modelCustomizationId;
            this.name = builder.name;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asrVersion
         */
        public Integer getAsrVersion() {
            return this.asrVersion;
        }

        /**
         * @return modelCustomizationId
         */
        public String getModelCustomizationId() {
            return this.modelCustomizationId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return words
         */
        public Words getWords() {
            return this.words;
        }

        public static final class Builder {
            private Integer asrVersion; 
            private String modelCustomizationId; 
            private String name; 
            private Words words; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asrVersion = model.asrVersion;
                this.modelCustomizationId = model.modelCustomizationId;
                this.name = model.name;
                this.words = model.words;
            } 

            /**
             * AsrVersion.
             */
            public Builder asrVersion(Integer asrVersion) {
                this.asrVersion = asrVersion;
                return this;
            }

            /**
             * ModelCustomizationId.
             */
            public Builder modelCustomizationId(String modelCustomizationId) {
                this.modelCustomizationId = modelCustomizationId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(Words words) {
                this.words = words;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

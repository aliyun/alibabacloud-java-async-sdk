// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsrVocabResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsrVocabResponseBody</p>
 */
public class GetAsrVocabResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class Word extends TeaModel {
        @NameInMap("Weight")
        private Integer weight;

        @NameInMap("Word")
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
    public static class Words extends TeaModel {
        @NameInMap("Word")
        private java.util.List < Word> word;

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
        public java.util.List < Word> getWord() {
            return this.word;
        }

        public static final class Builder {
            private java.util.List < Word> word; 

            /**
             * Word.
             */
            public Builder word(java.util.List < Word> word) {
                this.word = word;
                return this;
            }

            public Words build() {
                return new Words(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Words")
        private Words words;

        private Data(Builder builder) {
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
            private String name; 
            private Words words; 

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

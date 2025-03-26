// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link ListVocabResponseBody} extends {@link TeaModel}
 *
 * <p>ListVocabResponseBody</p>
 */
public class ListVocabResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ListVocabResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVocabResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ListVocabResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListVocabResponseBody build() {
            return new ListVocabResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVocabResponseBody} extends {@link TeaModel}
     *
     * <p>ListVocabResponseBody</p>
     */
    public static class WordWeightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("word")
        private String word;

        private WordWeightList(Builder builder) {
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordWeightList create() {
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

            private Builder(WordWeightList model) {
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordWeightList build() {
                return new WordWeightList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVocabResponseBody} extends {@link TeaModel}
     *
     * <p>ListVocabResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audioModelCode")
        private String audioModelCode;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vocabularyId")
        private String vocabularyId;

        @com.aliyun.core.annotation.NameInMap("wordWeightList")
        private java.util.List<WordWeightList> wordWeightList;

        private Data(Builder builder) {
            this.audioModelCode = builder.audioModelCode;
            this.description = builder.description;
            this.name = builder.name;
            this.vocabularyId = builder.vocabularyId;
            this.wordWeightList = builder.wordWeightList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioModelCode
         */
        public String getAudioModelCode() {
            return this.audioModelCode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        /**
         * @return wordWeightList
         */
        public java.util.List<WordWeightList> getWordWeightList() {
            return this.wordWeightList;
        }

        public static final class Builder {
            private String audioModelCode; 
            private String description; 
            private String name; 
            private String vocabularyId; 
            private java.util.List<WordWeightList> wordWeightList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioModelCode = model.audioModelCode;
                this.description = model.description;
                this.name = model.name;
                this.vocabularyId = model.vocabularyId;
                this.wordWeightList = model.wordWeightList;
            } 

            /**
             * audioModelCode.
             */
            public Builder audioModelCode(String audioModelCode) {
                this.audioModelCode = audioModelCode;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vocabularyId.
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * wordWeightList.
             */
            public Builder wordWeightList(java.util.List<WordWeightList> wordWeightList) {
                this.wordWeightList = wordWeightList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

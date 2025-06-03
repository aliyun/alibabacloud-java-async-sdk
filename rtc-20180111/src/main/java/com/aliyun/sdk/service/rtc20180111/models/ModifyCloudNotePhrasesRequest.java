// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link ModifyCloudNotePhrasesRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudNotePhrasesRequest</p>
 */
public class ModifyCloudNotePhrasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phrase")
    @com.aliyun.core.annotation.Validation(required = true)
    private Phrase phrase;

    private ModifyCloudNotePhrasesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.phrase = builder.phrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudNotePhrasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return phrase
     */
    public Phrase getPhrase() {
        return this.phrase;
    }

    public static final class Builder extends Request.Builder<ModifyCloudNotePhrasesRequest, Builder> {
        private String appId; 
        private Phrase phrase; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudNotePhrasesRequest request) {
            super(request);
            this.appId = request.appId;
            this.phrase = request.phrase;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder phrase(Phrase phrase) {
            String phraseShrink = shrink(phrase, "Phrase", "json");
            this.putQueryParameter("Phrase", phraseShrink);
            this.phrase = phrase;
            return this;
        }

        @Override
        public ModifyCloudNotePhrasesRequest build() {
            return new ModifyCloudNotePhrasesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCloudNotePhrasesRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudNotePhrasesRequest</p>
     */
    public static class WordWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 5)
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String word;

        private WordWeights(Builder builder) {
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordWeights create() {
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

            private Builder(WordWeights model) {
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>苹果</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordWeights build() {
                return new WordWeights(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCloudNotePhrasesRequest} extends {@link TeaModel}
     *
     * <p>ModifyCloudNotePhrasesRequest</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 200, minLength = 1)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("WordWeights")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<WordWeights> wordWeights;

        private Phrase(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.wordWeights = builder.wordWeights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrase create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return wordWeights
         */
        public java.util.List<WordWeights> getWordWeights() {
            return this.wordWeights;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String name; 
            private java.util.List<WordWeights> wordWeights; 

            private Builder() {
            } 

            private Builder(Phrase model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.wordWeights = model.wordWeights;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1qasw23ezcsrfsawq</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>水果</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder wordWeights(java.util.List<WordWeights> wordWeights) {
                this.wordWeights = wordWeights;
                return this;
            }

            public Phrase build() {
                return new Phrase(this);
            } 

        } 

    }
}

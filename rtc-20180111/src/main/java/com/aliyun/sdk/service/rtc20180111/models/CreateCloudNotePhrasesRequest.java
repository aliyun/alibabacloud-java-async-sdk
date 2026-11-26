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
 * {@link CreateCloudNotePhrasesRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudNotePhrasesRequest</p>
 */
public class CreateCloudNotePhrasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phrase")
    @com.aliyun.core.annotation.Validation(required = true)
    private Phrase phrase;

    private CreateCloudNotePhrasesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.phrase = builder.phrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudNotePhrasesRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCloudNotePhrasesRequest, Builder> {
        private String appId; 
        private Phrase phrase; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudNotePhrasesRequest request) {
            super(request);
            this.appId = request.appId;
            this.phrase = request.phrase;
        } 

        /**
         * <p>The application ID. You can create and query application IDs in the console. Only a single ID is supported.</p>
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
         * <p>The hotword parameter.</p>
         * <p>This parameter is required.</p>
         */
        public Builder phrase(Phrase phrase) {
            String phraseShrink = shrink(phrase, "Phrase", "json");
            this.putQueryParameter("Phrase", phraseShrink);
            this.phrase = phrase;
            return this;
        }

        @Override
        public CreateCloudNotePhrasesRequest build() {
            return new CreateCloudNotePhrasesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloudNotePhrasesRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudNotePhrasesRequest</p>
     */
    public static class WordWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("Word")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The weight must be an integer in the range of [-6, 5].</p>
             * <ul>
             * <li>A value greater than 0 increases the probability of the word being recognized, and a value less than 0 decreases the probability.</li>
             * <li>A value of -6 indicates that the word should not be recognized if possible.</li>
             * <li>A value of 2 is a common value.
             * If the effect is not obvious, you can increase the weight. However, a large weight may cause negative effects and lead to inaccurate recognition of other words.</li>
             * </ul>
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
             * <p>The hotword.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Apple</p>
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
     * {@link CreateCloudNotePhrasesRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudNotePhrasesRequest</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 200, minLength = 1)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 30, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("WordWeights")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<WordWeights> wordWeights;

        private Phrase(Builder builder) {
            this.description = builder.description;
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
            private String name; 
            private java.util.List<WordWeights> wordWeights; 

            private Builder() {
            } 

            private Builder(Phrase model) {
                this.description = model.description;
                this.name = model.name;
                this.wordWeights = model.wordWeights;
            } 

            /**
             * <p>The description. The description must be encoded in UTF-8 and be 1 to 200 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Fruit description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the hotword table. The name must be encoded in UTF-8 and be 1 to 30 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Fruits</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Each hotword table can contain up to 300 hotwords, and each hotword can be up to 10 Chinese characters in length.</p>
             * <p>Hotwords must be encoded in UTF-8 and cannot contain punctuation marks or special characters. Otherwise, the hotwords do not take effect.</p>
             * <p>The weight of a hotword must be an integer in the range of [-6, 5].</p>
             * <p>Numbers in the text must be replaced with the corresponding Chinese characters based on their pronunciation. For example, &quot;59.9元&quot; must be replaced with &quot;五十九点九元&quot;.</p>
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

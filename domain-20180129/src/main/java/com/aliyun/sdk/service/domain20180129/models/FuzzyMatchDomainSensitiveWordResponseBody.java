// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link FuzzyMatchDomainSensitiveWordResponseBody} extends {@link TeaModel}
 *
 * <p>FuzzyMatchDomainSensitiveWordResponseBody</p>
 */
public class FuzzyMatchDomainSensitiveWordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Exist")
    private Boolean exist;

    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.NameInMap("MatchedSentiveWords")
    private MatchedSentiveWords matchedSentiveWords;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FuzzyMatchDomainSensitiveWordResponseBody(Builder builder) {
        this.exist = builder.exist;
        this.keyword = builder.keyword;
        this.matchedSentiveWords = builder.matchedSentiveWords;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FuzzyMatchDomainSensitiveWordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exist
     */
    public Boolean getExist() {
        return this.exist;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return matchedSentiveWords
     */
    public MatchedSentiveWords getMatchedSentiveWords() {
        return this.matchedSentiveWords;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean exist; 
        private String keyword; 
        private MatchedSentiveWords matchedSentiveWords; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(FuzzyMatchDomainSensitiveWordResponseBody model) {
            this.exist = model.exist;
            this.keyword = model.keyword;
            this.matchedSentiveWords = model.matchedSentiveWords;
            this.requestId = model.requestId;
        } 

        /**
         * Exist.
         */
        public Builder exist(Boolean exist) {
            this.exist = exist;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * MatchedSentiveWords.
         */
        public Builder matchedSentiveWords(MatchedSentiveWords matchedSentiveWords) {
            this.matchedSentiveWords = matchedSentiveWords;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FuzzyMatchDomainSensitiveWordResponseBody build() {
            return new FuzzyMatchDomainSensitiveWordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FuzzyMatchDomainSensitiveWordResponseBody} extends {@link TeaModel}
     *
     * <p>FuzzyMatchDomainSensitiveWordResponseBody</p>
     */
    public static class MatchedSensitiveWord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private MatchedSensitiveWord(Builder builder) {
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchedSensitiveWord create() {
            return builder().build();
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String word; 

            private Builder() {
            } 

            private Builder(MatchedSensitiveWord model) {
                this.word = model.word;
            } 

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public MatchedSensitiveWord build() {
                return new MatchedSensitiveWord(this);
            } 

        } 

    }
    /**
     * 
     * {@link FuzzyMatchDomainSensitiveWordResponseBody} extends {@link TeaModel}
     *
     * <p>FuzzyMatchDomainSensitiveWordResponseBody</p>
     */
    public static class MatchedSentiveWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchedSensitiveWord")
        private java.util.List<MatchedSensitiveWord> matchedSensitiveWord;

        private MatchedSentiveWords(Builder builder) {
            this.matchedSensitiveWord = builder.matchedSensitiveWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchedSentiveWords create() {
            return builder().build();
        }

        /**
         * @return matchedSensitiveWord
         */
        public java.util.List<MatchedSensitiveWord> getMatchedSensitiveWord() {
            return this.matchedSensitiveWord;
        }

        public static final class Builder {
            private java.util.List<MatchedSensitiveWord> matchedSensitiveWord; 

            private Builder() {
            } 

            private Builder(MatchedSentiveWords model) {
                this.matchedSensitiveWord = model.matchedSensitiveWord;
            } 

            /**
             * MatchedSensitiveWord.
             */
            public Builder matchedSensitiveWord(java.util.List<MatchedSensitiveWord> matchedSensitiveWord) {
                this.matchedSensitiveWord = matchedSensitiveWord;
                return this;
            }

            public MatchedSentiveWords build() {
                return new MatchedSentiveWords(this);
            } 

        } 

    }
}

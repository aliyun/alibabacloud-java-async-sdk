// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchFuzzyMatchDomainSensitiveWordResponseBody} extends {@link TeaModel}
 *
 * <p>BatchFuzzyMatchDomainSensitiveWordResponseBody</p>
 */
public class BatchFuzzyMatchDomainSensitiveWordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveWordMatchResultList")
    private SensitiveWordMatchResultList sensitiveWordMatchResultList;

    private BatchFuzzyMatchDomainSensitiveWordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sensitiveWordMatchResultList = builder.sensitiveWordMatchResultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchFuzzyMatchDomainSensitiveWordResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveWordMatchResultList
     */
    public SensitiveWordMatchResultList getSensitiveWordMatchResultList() {
        return this.sensitiveWordMatchResultList;
    }

    public static final class Builder {
        private String requestId; 
        private SensitiveWordMatchResultList sensitiveWordMatchResultList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SensitiveWordMatchResultList.
         */
        public Builder sensitiveWordMatchResultList(SensitiveWordMatchResultList sensitiveWordMatchResultList) {
            this.sensitiveWordMatchResultList = sensitiveWordMatchResultList;
            return this;
        }

        public BatchFuzzyMatchDomainSensitiveWordResponseBody build() {
            return new BatchFuzzyMatchDomainSensitiveWordResponseBody(this);
        } 

    } 

    public static class MatchedSensitiveWord extends TeaModel {
        @NameInMap("Word")
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
    public static class MatchedSentiveWords extends TeaModel {
        @NameInMap("MatchedSensitiveWord")
        private java.util.List < MatchedSensitiveWord> matchedSensitiveWord;

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
        public java.util.List < MatchedSensitiveWord> getMatchedSensitiveWord() {
            return this.matchedSensitiveWord;
        }

        public static final class Builder {
            private java.util.List < MatchedSensitiveWord> matchedSensitiveWord; 

            /**
             * MatchedSensitiveWord.
             */
            public Builder matchedSensitiveWord(java.util.List < MatchedSensitiveWord> matchedSensitiveWord) {
                this.matchedSensitiveWord = matchedSensitiveWord;
                return this;
            }

            public MatchedSentiveWords build() {
                return new MatchedSentiveWords(this);
            } 

        } 

    }
    public static class SensitiveWordMatchResult extends TeaModel {
        @NameInMap("Exist")
        private Boolean exist;

        @NameInMap("Keyword")
        private String keyword;

        @NameInMap("MatchedSentiveWords")
        private MatchedSentiveWords matchedSentiveWords;

        private SensitiveWordMatchResult(Builder builder) {
            this.exist = builder.exist;
            this.keyword = builder.keyword;
            this.matchedSentiveWords = builder.matchedSentiveWords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveWordMatchResult create() {
            return builder().build();
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

        public static final class Builder {
            private Boolean exist; 
            private String keyword; 
            private MatchedSentiveWords matchedSentiveWords; 

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

            public SensitiveWordMatchResult build() {
                return new SensitiveWordMatchResult(this);
            } 

        } 

    }
    public static class SensitiveWordMatchResultList extends TeaModel {
        @NameInMap("SensitiveWordMatchResult")
        private java.util.List < SensitiveWordMatchResult> sensitiveWordMatchResult;

        private SensitiveWordMatchResultList(Builder builder) {
            this.sensitiveWordMatchResult = builder.sensitiveWordMatchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveWordMatchResultList create() {
            return builder().build();
        }

        /**
         * @return sensitiveWordMatchResult
         */
        public java.util.List < SensitiveWordMatchResult> getSensitiveWordMatchResult() {
            return this.sensitiveWordMatchResult;
        }

        public static final class Builder {
            private java.util.List < SensitiveWordMatchResult> sensitiveWordMatchResult; 

            /**
             * SensitiveWordMatchResult.
             */
            public Builder sensitiveWordMatchResult(java.util.List < SensitiveWordMatchResult> sensitiveWordMatchResult) {
                this.sensitiveWordMatchResult = sensitiveWordMatchResult;
                return this;
            }

            public SensitiveWordMatchResultList build() {
                return new SensitiveWordMatchResultList(this);
            } 

        } 

    }
}

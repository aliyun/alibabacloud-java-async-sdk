// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryMinutesTextResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMinutesTextResponseBody</p>
 */
public class QueryMinutesTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("paragraphList")
    private java.util.List<ParagraphList> paragraphList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryMinutesTextResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.paragraphList = builder.paragraphList;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMinutesTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return paragraphList
     */
    public java.util.List<ParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Boolean hasMore; 
        private String nextToken; 
        private java.util.List<ParagraphList> paragraphList; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(QueryMinutesTextResponseBody model) {
            this.hasMore = model.hasMore;
            this.nextToken = model.nextToken;
            this.paragraphList = model.paragraphList;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * paragraphList.
         */
        public Builder paragraphList(java.util.List<ParagraphList> paragraphList) {
            this.paragraphList = paragraphList;
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
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public QueryMinutesTextResponseBody build() {
            return new QueryMinutesTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesTextResponseBody</p>
     */
    public static class WordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        @com.aliyun.core.annotation.NameInMap("WordId")
        private String wordId;

        private WordList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.word = builder.word;
            this.wordId = builder.wordId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        /**
         * @return wordId
         */
        public String getWordId() {
            return this.wordId;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String word; 
            private String wordId; 

            private Builder() {
            } 

            private Builder(WordList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.word = model.word;
                this.wordId = model.wordId;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            /**
             * WordId.
             */
            public Builder wordId(String wordId) {
                this.wordId = wordId;
                return this;
            }

            public WordList build() {
                return new WordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesTextResponseBody</p>
     */
    public static class SentenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Sentence")
        private String sentence;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WordList")
        private java.util.List<WordList> wordList;

        private SentenceList(Builder builder) {
            this.endTime = builder.endTime;
            this.sentence = builder.sentence;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
            this.wordList = builder.wordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SentenceList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return sentence
         */
        public String getSentence() {
            return this.sentence;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return wordList
         */
        public java.util.List<WordList> getWordList() {
            return this.wordList;
        }

        public static final class Builder {
            private Long endTime; 
            private String sentence; 
            private Long startTime; 
            private String userId; 
            private java.util.List<WordList> wordList; 

            private Builder() {
            } 

            private Builder(SentenceList model) {
                this.endTime = model.endTime;
                this.sentence = model.sentence;
                this.startTime = model.startTime;
                this.userId = model.userId;
                this.wordList = model.wordList;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Sentence.
             */
            public Builder sentence(String sentence) {
                this.sentence = sentence;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WordList.
             */
            public Builder wordList(java.util.List<WordList> wordList) {
                this.wordList = wordList;
                return this;
            }

            public SentenceList build() {
                return new SentenceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesTextResponseBody</p>
     */
    public static class ParagraphList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Paragraph")
        private String paragraph;

        @com.aliyun.core.annotation.NameInMap("ParagraphId")
        private Long paragraphId;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("SentenceList")
        private java.util.List<SentenceList> sentenceList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ParagraphList(Builder builder) {
            this.endTime = builder.endTime;
            this.nickName = builder.nickName;
            this.paragraph = builder.paragraph;
            this.paragraphId = builder.paragraphId;
            this.recordId = builder.recordId;
            this.sentenceList = builder.sentenceList;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return paragraph
         */
        public String getParagraph() {
            return this.paragraph;
        }

        /**
         * @return paragraphId
         */
        public Long getParagraphId() {
            return this.paragraphId;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return sentenceList
         */
        public java.util.List<SentenceList> getSentenceList() {
            return this.sentenceList;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long endTime; 
            private String nickName; 
            private String paragraph; 
            private Long paragraphId; 
            private Long recordId; 
            private java.util.List<SentenceList> sentenceList; 
            private Long startTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ParagraphList model) {
                this.endTime = model.endTime;
                this.nickName = model.nickName;
                this.paragraph = model.paragraph;
                this.paragraphId = model.paragraphId;
                this.recordId = model.recordId;
                this.sentenceList = model.sentenceList;
                this.startTime = model.startTime;
                this.userId = model.userId;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * Paragraph.
             */
            public Builder paragraph(String paragraph) {
                this.paragraph = paragraph;
                return this;
            }

            /**
             * ParagraphId.
             */
            public Builder paragraphId(Long paragraphId) {
                this.paragraphId = paragraphId;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * SentenceList.
             */
            public Builder sentenceList(java.util.List<SentenceList> sentenceList) {
                this.sentenceList = sentenceList;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ParagraphList build() {
                return new ParagraphList(this);
            } 

        } 

    }
}

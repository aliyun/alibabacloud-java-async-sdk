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
 * {@link MeetingFlashMinutesTextResponseBody} extends {@link TeaModel}
 *
 * <p>MeetingFlashMinutesTextResponseBody</p>
 */
public class MeetingFlashMinutesTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hasNext")
    private Boolean hasNext;

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

    private MeetingFlashMinutesTextResponseBody(Builder builder) {
        this.hasNext = builder.hasNext;
        this.nextToken = builder.nextToken;
        this.paragraphList = builder.paragraphList;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MeetingFlashMinutesTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
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
        private Boolean hasNext; 
        private String nextToken; 
        private java.util.List<ParagraphList> paragraphList; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(MeetingFlashMinutesTextResponseBody model) {
            this.hasNext = model.hasNext;
            this.nextToken = model.nextToken;
            this.paragraphList = model.paragraphList;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * hasNext.
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
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

        public MeetingFlashMinutesTextResponseBody build() {
            return new MeetingFlashMinutesTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MeetingFlashMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesTextResponseBody</p>
     */
    public static class WordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("word")
        private String word;

        private WordList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.word = builder.word;
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

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.word = model.word;
            } 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordList build() {
                return new WordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link MeetingFlashMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesTextResponseBody</p>
     */
    public static class SentenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("sentence")
        private String sentence;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("wordList")
        private java.util.List<WordList> wordList;

        private SentenceList(Builder builder) {
            this.endTime = builder.endTime;
            this.sentence = builder.sentence;
            this.startTime = builder.startTime;
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
         * @return wordList
         */
        public java.util.List<WordList> getWordList() {
            return this.wordList;
        }

        public static final class Builder {
            private Long endTime; 
            private String sentence; 
            private Long startTime; 
            private java.util.List<WordList> wordList; 

            private Builder() {
            } 

            private Builder(SentenceList model) {
                this.endTime = model.endTime;
                this.sentence = model.sentence;
                this.startTime = model.startTime;
                this.wordList = model.wordList;
            } 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * sentence.
             */
            public Builder sentence(String sentence) {
                this.sentence = sentence;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * wordList.
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
     * {@link MeetingFlashMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesTextResponseBody</p>
     */
    public static class SpeakerDisplay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        private SpeakerDisplay(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpeakerDisplay create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(SpeakerDisplay model) {
                this.avatarUrl = model.avatarUrl;
                this.nickName = model.nickName;
            } 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public SpeakerDisplay build() {
                return new SpeakerDisplay(this);
            } 

        } 

    }
    /**
     * 
     * {@link MeetingFlashMinutesTextResponseBody} extends {@link TeaModel}
     *
     * <p>MeetingFlashMinutesTextResponseBody</p>
     */
    public static class ParagraphList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("paragraph")
        private String paragraph;

        @com.aliyun.core.annotation.NameInMap("sentenceList")
        private java.util.List<SentenceList> sentenceList;

        @com.aliyun.core.annotation.NameInMap("speakerDisplay")
        private SpeakerDisplay speakerDisplay;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ParagraphList(Builder builder) {
            this.endTime = builder.endTime;
            this.nickName = builder.nickName;
            this.paragraph = builder.paragraph;
            this.sentenceList = builder.sentenceList;
            this.speakerDisplay = builder.speakerDisplay;
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
         * @return sentenceList
         */
        public java.util.List<SentenceList> getSentenceList() {
            return this.sentenceList;
        }

        /**
         * @return speakerDisplay
         */
        public SpeakerDisplay getSpeakerDisplay() {
            return this.speakerDisplay;
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
            private java.util.List<SentenceList> sentenceList; 
            private SpeakerDisplay speakerDisplay; 
            private Long startTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ParagraphList model) {
                this.endTime = model.endTime;
                this.nickName = model.nickName;
                this.paragraph = model.paragraph;
                this.sentenceList = model.sentenceList;
                this.speakerDisplay = model.speakerDisplay;
                this.startTime = model.startTime;
                this.userId = model.userId;
            } 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * paragraph.
             */
            public Builder paragraph(String paragraph) {
                this.paragraph = paragraph;
                return this;
            }

            /**
             * sentenceList.
             */
            public Builder sentenceList(java.util.List<SentenceList> sentenceList) {
                this.sentenceList = sentenceList;
                return this;
            }

            /**
             * speakerDisplay.
             */
            public Builder speakerDisplay(SpeakerDisplay speakerDisplay) {
                this.speakerDisplay = speakerDisplay;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * userId.
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

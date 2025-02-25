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
 * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMinutesSummaryResponseBody</p>
 */
public class QueryMinutesSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Summary summary;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryMinutesSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.summary = builder.summary;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMinutesSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
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
        private String requestId; 
        private Summary summary; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
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

        public QueryMinutesSummaryResponseBody build() {
            return new QueryMinutesSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SentenceId")
        private Long sentenceId;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Actions(Builder builder) {
            this.end = builder.end;
            this.id = builder.id;
            this.sentenceId = builder.sentenceId;
            this.start = builder.start;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sentenceId
         */
        public Long getSentenceId() {
            return this.sentenceId;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long end; 
            private Long id; 
            private Long sentenceId; 
            private Long start; 
            private String text; 

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SentenceId.
             */
            public Builder sentenceId(Long sentenceId) {
                this.sentenceId = sentenceId;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class AutoChapters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Headline")
        private String headline;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private AutoChapters(Builder builder) {
            this.end = builder.end;
            this.headline = builder.headline;
            this.id = builder.id;
            this.start = builder.start;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoChapters create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return headline
         */
        public String getHeadline() {
            return this.headline;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private Long end; 
            private String headline; 
            private Long id; 
            private Long start; 
            private String summary; 

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Headline.
             */
            public Builder headline(String headline) {
                this.headline = headline;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public AutoChapters build() {
                return new AutoChapters(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class ConversationalSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpeakerId")
        private String speakerId;

        @com.aliyun.core.annotation.NameInMap("SpeakerName")
        private String speakerName;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private ConversationalSummary(Builder builder) {
            this.speakerId = builder.speakerId;
            this.speakerName = builder.speakerName;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationalSummary create() {
            return builder().build();
        }

        /**
         * @return speakerId
         */
        public String getSpeakerId() {
            return this.speakerId;
        }

        /**
         * @return speakerName
         */
        public String getSpeakerName() {
            return this.speakerName;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String speakerId; 
            private String speakerName; 
            private String summary; 

            /**
             * SpeakerId.
             */
            public Builder speakerId(String speakerId) {
                this.speakerId = speakerId;
                return this;
            }

            /**
             * SpeakerName.
             */
            public Builder speakerName(String speakerName) {
                this.speakerName = speakerName;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public ConversationalSummary build() {
                return new ConversationalSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class KeySentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SentenceId")
        private Long sentenceId;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private KeySentences(Builder builder) {
            this.end = builder.end;
            this.id = builder.id;
            this.sentenceId = builder.sentenceId;
            this.start = builder.start;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeySentences create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sentenceId
         */
        public Long getSentenceId() {
            return this.sentenceId;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long end; 
            private Long id; 
            private Long sentenceId; 
            private Long start; 
            private String text; 

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SentenceId.
             */
            public Builder sentenceId(Long sentenceId) {
                this.sentenceId = sentenceId;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public KeySentences build() {
                return new KeySentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class QuestionsAnsweringSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("Question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("SentenceIdsOfAnswer")
        private java.util.List<Long> sentenceIdsOfAnswer;

        @com.aliyun.core.annotation.NameInMap("SentenceIdsOfQuestion")
        private java.util.List<Long> sentenceIdsOfQuestion;

        private QuestionsAnsweringSummary(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
            this.sentenceIdsOfAnswer = builder.sentenceIdsOfAnswer;
            this.sentenceIdsOfQuestion = builder.sentenceIdsOfQuestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionsAnsweringSummary create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return sentenceIdsOfAnswer
         */
        public java.util.List<Long> getSentenceIdsOfAnswer() {
            return this.sentenceIdsOfAnswer;
        }

        /**
         * @return sentenceIdsOfQuestion
         */
        public java.util.List<Long> getSentenceIdsOfQuestion() {
            return this.sentenceIdsOfQuestion;
        }

        public static final class Builder {
            private String answer; 
            private String question; 
            private java.util.List<Long> sentenceIdsOfAnswer; 
            private java.util.List<Long> sentenceIdsOfQuestion; 

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * SentenceIdsOfAnswer.
             */
            public Builder sentenceIdsOfAnswer(java.util.List<Long> sentenceIdsOfAnswer) {
                this.sentenceIdsOfAnswer = sentenceIdsOfAnswer;
                return this;
            }

            /**
             * SentenceIdsOfQuestion.
             */
            public Builder sentenceIdsOfQuestion(java.util.List<Long> sentenceIdsOfQuestion) {
                this.sentenceIdsOfQuestion = sentenceIdsOfQuestion;
                return this;
            }

            public QuestionsAnsweringSummary build() {
                return new QuestionsAnsweringSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMinutesSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesSummaryResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private Actions actions;

        @com.aliyun.core.annotation.NameInMap("AutoChapters")
        private java.util.List<AutoChapters> autoChapters;

        @com.aliyun.core.annotation.NameInMap("ConversationalSummary")
        private java.util.List<ConversationalSummary> conversationalSummary;

        @com.aliyun.core.annotation.NameInMap("KeySentences")
        private KeySentences keySentences;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("ParagraphSummary")
        private String paragraphSummary;

        @com.aliyun.core.annotation.NameInMap("QuestionsAnsweringSummary")
        private java.util.List<QuestionsAnsweringSummary> questionsAnsweringSummary;

        private Summary(Builder builder) {
            this.actions = builder.actions;
            this.autoChapters = builder.autoChapters;
            this.conversationalSummary = builder.conversationalSummary;
            this.keySentences = builder.keySentences;
            this.keywords = builder.keywords;
            this.paragraphSummary = builder.paragraphSummary;
            this.questionsAnsweringSummary = builder.questionsAnsweringSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public Actions getActions() {
            return this.actions;
        }

        /**
         * @return autoChapters
         */
        public java.util.List<AutoChapters> getAutoChapters() {
            return this.autoChapters;
        }

        /**
         * @return conversationalSummary
         */
        public java.util.List<ConversationalSummary> getConversationalSummary() {
            return this.conversationalSummary;
        }

        /**
         * @return keySentences
         */
        public KeySentences getKeySentences() {
            return this.keySentences;
        }

        /**
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        /**
         * @return paragraphSummary
         */
        public String getParagraphSummary() {
            return this.paragraphSummary;
        }

        /**
         * @return questionsAnsweringSummary
         */
        public java.util.List<QuestionsAnsweringSummary> getQuestionsAnsweringSummary() {
            return this.questionsAnsweringSummary;
        }

        public static final class Builder {
            private Actions actions; 
            private java.util.List<AutoChapters> autoChapters; 
            private java.util.List<ConversationalSummary> conversationalSummary; 
            private KeySentences keySentences; 
            private java.util.List<String> keywords; 
            private String paragraphSummary; 
            private java.util.List<QuestionsAnsweringSummary> questionsAnsweringSummary; 

            /**
             * Actions.
             */
            public Builder actions(Actions actions) {
                this.actions = actions;
                return this;
            }

            /**
             * AutoChapters.
             */
            public Builder autoChapters(java.util.List<AutoChapters> autoChapters) {
                this.autoChapters = autoChapters;
                return this;
            }

            /**
             * ConversationalSummary.
             */
            public Builder conversationalSummary(java.util.List<ConversationalSummary> conversationalSummary) {
                this.conversationalSummary = conversationalSummary;
                return this;
            }

            /**
             * KeySentences.
             */
            public Builder keySentences(KeySentences keySentences) {
                this.keySentences = keySentences;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * ParagraphSummary.
             */
            public Builder paragraphSummary(String paragraphSummary) {
                this.paragraphSummary = paragraphSummary;
                return this;
            }

            /**
             * QuestionsAnsweringSummary.
             */
            public Builder questionsAnsweringSummary(java.util.List<QuestionsAnsweringSummary> questionsAnsweringSummary) {
                this.questionsAnsweringSummary = questionsAnsweringSummary;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}

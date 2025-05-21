// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
 */
public class ListTextbookAssistantArticleDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListTextbookAssistantArticleDetailsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantArticleDetailsResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTextbookAssistantArticleDetailsResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
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
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTextbookAssistantArticleDetailsResponseBody build() {
            return new ListTextbookAssistantArticleDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class QuestionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("questionTranslate")
        private String questionTranslate;

        private QuestionList(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
            this.questionTranslate = builder.questionTranslate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionList create() {
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
         * @return questionTranslate
         */
        public String getQuestionTranslate() {
            return this.questionTranslate;
        }

        public static final class Builder {
            private String answer; 
            private String question; 
            private String questionTranslate; 

            private Builder() {
            } 

            private Builder(QuestionList model) {
                this.answer = model.answer;
                this.question = model.question;
                this.questionTranslate = model.questionTranslate;
            } 

            /**
             * answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * questionTranslate.
             */
            public Builder questionTranslate(String questionTranslate) {
                this.questionTranslate = questionTranslate;
                return this;
            }

            public QuestionList build() {
                return new QuestionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class SceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("sceneImageList")
        private java.util.List<String> sceneImageList;

        @com.aliyun.core.annotation.NameInMap("sceneTranslate")
        private String sceneTranslate;

        private SceneList(Builder builder) {
            this.scene = builder.scene;
            this.sceneId = builder.sceneId;
            this.sceneImageList = builder.sceneImageList;
            this.sceneTranslate = builder.sceneTranslate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneImageList
         */
        public java.util.List<String> getSceneImageList() {
            return this.sceneImageList;
        }

        /**
         * @return sceneTranslate
         */
        public String getSceneTranslate() {
            return this.sceneTranslate;
        }

        public static final class Builder {
            private String scene; 
            private String sceneId; 
            private java.util.List<String> sceneImageList; 
            private String sceneTranslate; 

            private Builder() {
            } 

            private Builder(SceneList model) {
                this.scene = model.scene;
                this.sceneId = model.sceneId;
                this.sceneImageList = model.sceneImageList;
                this.sceneTranslate = model.sceneTranslate;
            } 

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * sceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * sceneImageList.
             */
            public Builder sceneImageList(java.util.List<String> sceneImageList) {
                this.sceneImageList = sceneImageList;
                return this;
            }

            /**
             * sceneTranslate.
             */
            public Builder sceneTranslate(String sceneTranslate) {
                this.sceneTranslate = sceneTranslate;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class SentenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sentenceAnalysis")
        private String sentenceAnalysis;

        @com.aliyun.core.annotation.NameInMap("sentenceId")
        private String sentenceId;

        @com.aliyun.core.annotation.NameInMap("sentenceText")
        private String sentenceText;

        private SentenceList(Builder builder) {
            this.sentenceAnalysis = builder.sentenceAnalysis;
            this.sentenceId = builder.sentenceId;
            this.sentenceText = builder.sentenceText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SentenceList create() {
            return builder().build();
        }

        /**
         * @return sentenceAnalysis
         */
        public String getSentenceAnalysis() {
            return this.sentenceAnalysis;
        }

        /**
         * @return sentenceId
         */
        public String getSentenceId() {
            return this.sentenceId;
        }

        /**
         * @return sentenceText
         */
        public String getSentenceText() {
            return this.sentenceText;
        }

        public static final class Builder {
            private String sentenceAnalysis; 
            private String sentenceId; 
            private String sentenceText; 

            private Builder() {
            } 

            private Builder(SentenceList model) {
                this.sentenceAnalysis = model.sentenceAnalysis;
                this.sentenceId = model.sentenceId;
                this.sentenceText = model.sentenceText;
            } 

            /**
             * sentenceAnalysis.
             */
            public Builder sentenceAnalysis(String sentenceAnalysis) {
                this.sentenceAnalysis = sentenceAnalysis;
                return this;
            }

            /**
             * sentenceId.
             */
            public Builder sentenceId(String sentenceId) {
                this.sentenceId = sentenceId;
                return this;
            }

            /**
             * sentenceText.
             */
            public Builder sentenceText(String sentenceText) {
                this.sentenceText = sentenceText;
                return this;
            }

            public SentenceList build() {
                return new SentenceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class Theme extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("themeImageList")
        private java.util.List<String> themeImageList;

        @com.aliyun.core.annotation.NameInMap("themeName")
        private String themeName;

        @com.aliyun.core.annotation.NameInMap("themeTranslate")
        private String themeTranslate;

        private Theme(Builder builder) {
            this.themeImageList = builder.themeImageList;
            this.themeName = builder.themeName;
            this.themeTranslate = builder.themeTranslate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Theme create() {
            return builder().build();
        }

        /**
         * @return themeImageList
         */
        public java.util.List<String> getThemeImageList() {
            return this.themeImageList;
        }

        /**
         * @return themeName
         */
        public String getThemeName() {
            return this.themeName;
        }

        /**
         * @return themeTranslate
         */
        public String getThemeTranslate() {
            return this.themeTranslate;
        }

        public static final class Builder {
            private java.util.List<String> themeImageList; 
            private String themeName; 
            private String themeTranslate; 

            private Builder() {
            } 

            private Builder(Theme model) {
                this.themeImageList = model.themeImageList;
                this.themeName = model.themeName;
                this.themeTranslate = model.themeTranslate;
            } 

            /**
             * themeImageList.
             */
            public Builder themeImageList(java.util.List<String> themeImageList) {
                this.themeImageList = themeImageList;
                return this;
            }

            /**
             * themeName.
             */
            public Builder themeName(String themeName) {
                this.themeName = themeName;
                return this;
            }

            /**
             * themeTranslate.
             */
            public Builder themeTranslate(String themeTranslate) {
                this.themeTranslate = themeTranslate;
                return this;
            }

            public Theme build() {
                return new Theme(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class Topic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("topicImageList")
        private java.util.List<String> topicImageList;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("topicTranslate")
        private String topicTranslate;

        private Topic(Builder builder) {
            this.topicImageList = builder.topicImageList;
            this.topicName = builder.topicName;
            this.topicTranslate = builder.topicTranslate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topic create() {
            return builder().build();
        }

        /**
         * @return topicImageList
         */
        public java.util.List<String> getTopicImageList() {
            return this.topicImageList;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicTranslate
         */
        public String getTopicTranslate() {
            return this.topicTranslate;
        }

        public static final class Builder {
            private java.util.List<String> topicImageList; 
            private String topicName; 
            private String topicTranslate; 

            private Builder() {
            } 

            private Builder(Topic model) {
                this.topicImageList = model.topicImageList;
                this.topicName = model.topicName;
                this.topicTranslate = model.topicTranslate;
            } 

            /**
             * topicImageList.
             */
            public Builder topicImageList(java.util.List<String> topicImageList) {
                this.topicImageList = topicImageList;
                return this;
            }

            /**
             * topicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * topicTranslate.
             */
            public Builder topicTranslate(String topicTranslate) {
                this.topicTranslate = topicTranslate;
                return this;
            }

            public Topic build() {
                return new Topic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class WordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("wordAnalysis")
        private String wordAnalysis;

        @com.aliyun.core.annotation.NameInMap("wordId")
        private String wordId;

        @com.aliyun.core.annotation.NameInMap("wordText")
        private String wordText;

        private WordList(Builder builder) {
            this.wordAnalysis = builder.wordAnalysis;
            this.wordId = builder.wordId;
            this.wordText = builder.wordText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordList create() {
            return builder().build();
        }

        /**
         * @return wordAnalysis
         */
        public String getWordAnalysis() {
            return this.wordAnalysis;
        }

        /**
         * @return wordId
         */
        public String getWordId() {
            return this.wordId;
        }

        /**
         * @return wordText
         */
        public String getWordText() {
            return this.wordText;
        }

        public static final class Builder {
            private String wordAnalysis; 
            private String wordId; 
            private String wordText; 

            private Builder() {
            } 

            private Builder(WordList model) {
                this.wordAnalysis = model.wordAnalysis;
                this.wordId = model.wordId;
                this.wordText = model.wordText;
            } 

            /**
             * wordAnalysis.
             */
            public Builder wordAnalysis(String wordAnalysis) {
                this.wordAnalysis = wordAnalysis;
                return this;
            }

            /**
             * wordId.
             */
            public Builder wordId(String wordId) {
                this.wordId = wordId;
                return this;
            }

            /**
             * wordText.
             */
            public Builder wordText(String wordText) {
                this.wordText = wordText;
                return this;
            }

            public WordList build() {
                return new WordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantArticleDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantArticleDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("articleId")
        private String articleId;

        @com.aliyun.core.annotation.NameInMap("questionList")
        private java.util.List<QuestionList> questionList;

        @com.aliyun.core.annotation.NameInMap("sceneList")
        private java.util.List<SceneList> sceneList;

        @com.aliyun.core.annotation.NameInMap("sentenceList")
        private java.util.List<SentenceList> sentenceList;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("theme")
        private Theme theme;

        @com.aliyun.core.annotation.NameInMap("topic")
        private Topic topic;

        @com.aliyun.core.annotation.NameInMap("wordList")
        private java.util.List<WordList> wordList;

        private Data(Builder builder) {
            this.articleId = builder.articleId;
            this.questionList = builder.questionList;
            this.sceneList = builder.sceneList;
            this.sentenceList = builder.sentenceList;
            this.target = builder.target;
            this.theme = builder.theme;
            this.topic = builder.topic;
            this.wordList = builder.wordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return articleId
         */
        public String getArticleId() {
            return this.articleId;
        }

        /**
         * @return questionList
         */
        public java.util.List<QuestionList> getQuestionList() {
            return this.questionList;
        }

        /**
         * @return sceneList
         */
        public java.util.List<SceneList> getSceneList() {
            return this.sceneList;
        }

        /**
         * @return sentenceList
         */
        public java.util.List<SentenceList> getSentenceList() {
            return this.sentenceList;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return theme
         */
        public Theme getTheme() {
            return this.theme;
        }

        /**
         * @return topic
         */
        public Topic getTopic() {
            return this.topic;
        }

        /**
         * @return wordList
         */
        public java.util.List<WordList> getWordList() {
            return this.wordList;
        }

        public static final class Builder {
            private String articleId; 
            private java.util.List<QuestionList> questionList; 
            private java.util.List<SceneList> sceneList; 
            private java.util.List<SentenceList> sentenceList; 
            private String target; 
            private Theme theme; 
            private Topic topic; 
            private java.util.List<WordList> wordList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.articleId = model.articleId;
                this.questionList = model.questionList;
                this.sceneList = model.sceneList;
                this.sentenceList = model.sentenceList;
                this.target = model.target;
                this.theme = model.theme;
                this.topic = model.topic;
                this.wordList = model.wordList;
            } 

            /**
             * articleId.
             */
            public Builder articleId(String articleId) {
                this.articleId = articleId;
                return this;
            }

            /**
             * questionList.
             */
            public Builder questionList(java.util.List<QuestionList> questionList) {
                this.questionList = questionList;
                return this;
            }

            /**
             * sceneList.
             */
            public Builder sceneList(java.util.List<SceneList> sceneList) {
                this.sceneList = sceneList;
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
             * target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * theme.
             */
            public Builder theme(Theme theme) {
                this.theme = theme;
                return this;
            }

            /**
             * topic.
             */
            public Builder topic(Topic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * wordList.
             */
            public Builder wordList(java.util.List<WordList> wordList) {
                this.wordList = wordList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

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
 * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
 */
public class ListTextbookAssistantSceneDetailsResponseBody extends TeaModel {
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

    private ListTextbookAssistantSceneDetailsResponseBody(Builder builder) {
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

    public static ListTextbookAssistantSceneDetailsResponseBody create() {
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

        private Builder(ListTextbookAssistantSceneDetailsResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN_ERROR</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>未知错误</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call succeeded.</p>
         * <ul>
         * <li><p><strong>true</strong>: The call succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTextbookAssistantSceneDetailsResponseBody build() {
            return new ListTextbookAssistantSceneDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("introductionTranslate")
        private String introductionTranslate;

        @com.aliyun.core.annotation.NameInMap("promoting")
        private String promoting;

        @com.aliyun.core.annotation.NameInMap("promotingTranslate")
        private String promotingTranslate;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("roleNameTranslate")
        private String roleNameTranslate;

        @com.aliyun.core.annotation.NameInMap("roleType")
        private String roleType;

        private RoleList(Builder builder) {
            this.introduction = builder.introduction;
            this.introductionTranslate = builder.introductionTranslate;
            this.promoting = builder.promoting;
            this.promotingTranslate = builder.promotingTranslate;
            this.roleName = builder.roleName;
            this.roleNameTranslate = builder.roleNameTranslate;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return introductionTranslate
         */
        public String getIntroductionTranslate() {
            return this.introductionTranslate;
        }

        /**
         * @return promoting
         */
        public String getPromoting() {
            return this.promoting;
        }

        /**
         * @return promotingTranslate
         */
        public String getPromotingTranslate() {
            return this.promotingTranslate;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return roleNameTranslate
         */
        public String getRoleNameTranslate() {
            return this.roleNameTranslate;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String introduction; 
            private String introductionTranslate; 
            private String promoting; 
            private String promotingTranslate; 
            private String roleName; 
            private String roleNameTranslate; 
            private String roleType; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.introduction = model.introduction;
                this.introductionTranslate = model.introductionTranslate;
                this.promoting = model.promoting;
                this.promotingTranslate = model.promotingTranslate;
                this.roleName = model.roleName;
                this.roleNameTranslate = model.roleNameTranslate;
                this.roleType = model.roleType;
            } 

            /**
             * <p>The role introduction.</p>
             * 
             * <strong>example:</strong>
             * <p>Carl, a curious boy</p>
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * <p>The translation of the role introduction.</p>
             * 
             * <strong>example:</strong>
             * <p>Carl，一个好奇的男孩</p>
             */
            public Builder introductionTranslate(String introductionTranslate) {
                this.introductionTranslate = introductionTranslate;
                return this;
            }

            /**
             * <p>The role guidance text.</p>
             * 
             * <strong>example:</strong>
             * <p>Hi Noah, who is that in the photo?</p>
             */
            public Builder promoting(String promoting) {
                this.promoting = promoting;
                return this;
            }

            /**
             * <p>The translation of the role guidance text.</p>
             * 
             * <strong>example:</strong>
             * <p>嗨 Noah，照片里的人是谁？</p>
             */
            public Builder promotingTranslate(String promotingTranslate) {
                this.promotingTranslate = promotingTranslate;
                return this;
            }

            /**
             * <p>The role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Carl</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The translation of the role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Carl</p>
             */
            public Builder roleNameTranslate(String roleNameTranslate) {
                this.roleNameTranslate = roleNameTranslate;
                return this;
            }

            /**
             * <p>The role type:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
     */
    public static class SceneTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sceneTask")
        private String sceneTask;

        @com.aliyun.core.annotation.NameInMap("sceneTaskTranslate")
        private String sceneTaskTranslate;

        private SceneTaskList(Builder builder) {
            this.sceneTask = builder.sceneTask;
            this.sceneTaskTranslate = builder.sceneTaskTranslate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneTaskList create() {
            return builder().build();
        }

        /**
         * @return sceneTask
         */
        public String getSceneTask() {
            return this.sceneTask;
        }

        /**
         * @return sceneTaskTranslate
         */
        public String getSceneTaskTranslate() {
            return this.sceneTaskTranslate;
        }

        public static final class Builder {
            private String sceneTask; 
            private String sceneTaskTranslate; 

            private Builder() {
            } 

            private Builder(SceneTaskList model) {
                this.sceneTask = model.sceneTask;
                this.sceneTaskTranslate = model.sceneTaskTranslate;
            } 

            /**
             * <p>The scene task description.</p>
             * 
             * <strong>example:</strong>
             * <p>Say that this is your dad\&quot;s brother.</p>
             */
            public Builder sceneTask(String sceneTask) {
                this.sceneTask = sceneTask;
                return this;
            }

            /**
             * <p>The translation of the scene task description.</p>
             * 
             * <strong>example:</strong>
             * <p>说这是你爸爸的兄弟。</p>
             */
            public Builder sceneTaskTranslate(String sceneTaskTranslate) {
                this.sceneTaskTranslate = sceneTaskTranslate;
                return this;
            }

            public SceneTaskList build() {
                return new SceneTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
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
             * <p>The sentence analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>Is + this + your + 家庭成员?</p>
             */
            public Builder sentenceAnalysis(String sentenceAnalysis) {
                this.sentenceAnalysis = sentenceAnalysis;
                return this;
            }

            /**
             * <p>The sentence ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a774c6d09c4511eebe6e0c42a106bb02</p>
             */
            public Builder sentenceId(String sentenceId) {
                this.sentenceId = sentenceId;
                return this;
            }

            /**
             * <p>The sentence text.</p>
             * 
             * <strong>example:</strong>
             * <p>Is this your sister?</p>
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
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
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
             * <p>A list of image URLs related to the theme.</p>
             */
            public Builder themeImageList(java.util.List<String> themeImageList) {
                this.themeImageList = themeImageList;
                return this;
            }

            /**
             * <p>The theme name.</p>
             * 
             * <strong>example:</strong>
             * <p>家庭生活</p>
             */
            public Builder themeName(String themeName) {
                this.themeName = themeName;
                return this;
            }

            /**
             * <p>The translation of the theme name.</p>
             * 
             * <strong>example:</strong>
             * <p>Family and family life</p>
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
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
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
             * <p>A list of image URLs related to the topic.</p>
             */
            public Builder topicImageList(java.util.List<String> topicImageList) {
                this.topicImageList = topicImageList;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>介绍家人</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The translation of the topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>Introducing family members</p>
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
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
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
             * <p>The word definition.</p>
             * 
             * <strong>example:</strong>
             * <p>家；家庭</p>
             */
            public Builder wordAnalysis(String wordAnalysis) {
                this.wordAnalysis = wordAnalysis;
                return this;
            }

            /**
             * <p>The word ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a94c3337ed8c11eebe6e0c42a106bb02</p>
             */
            public Builder wordId(String wordId) {
                this.wordId = wordId;
                return this;
            }

            /**
             * <p>The word text.</p>
             * 
             * <strong>example:</strong>
             * <p>family</p>
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
     * {@link ListTextbookAssistantSceneDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTextbookAssistantSceneDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("roleList")
        private java.util.List<RoleList> roleList;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("sceneImageList")
        private java.util.List<String> sceneImageList;

        @com.aliyun.core.annotation.NameInMap("sceneTaskList")
        private java.util.List<SceneTaskList> sceneTaskList;

        @com.aliyun.core.annotation.NameInMap("sceneTranslate")
        private String sceneTranslate;

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
            this.roleList = builder.roleList;
            this.scene = builder.scene;
            this.sceneId = builder.sceneId;
            this.sceneImageList = builder.sceneImageList;
            this.sceneTaskList = builder.sceneTaskList;
            this.sceneTranslate = builder.sceneTranslate;
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
         * @return roleList
         */
        public java.util.List<RoleList> getRoleList() {
            return this.roleList;
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
         * @return sceneTaskList
         */
        public java.util.List<SceneTaskList> getSceneTaskList() {
            return this.sceneTaskList;
        }

        /**
         * @return sceneTranslate
         */
        public String getSceneTranslate() {
            return this.sceneTranslate;
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
            private java.util.List<RoleList> roleList; 
            private String scene; 
            private String sceneId; 
            private java.util.List<String> sceneImageList; 
            private java.util.List<SceneTaskList> sceneTaskList; 
            private String sceneTranslate; 
            private java.util.List<SentenceList> sentenceList; 
            private String target; 
            private Theme theme; 
            private Topic topic; 
            private java.util.List<WordList> wordList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.roleList = model.roleList;
                this.scene = model.scene;
                this.sceneId = model.sceneId;
                this.sceneImageList = model.sceneImageList;
                this.sceneTaskList = model.sceneTaskList;
                this.sceneTranslate = model.sceneTranslate;
                this.sentenceList = model.sentenceList;
                this.target = model.target;
                this.theme = model.theme;
                this.topic = model.topic;
                this.wordList = model.wordList;
            } 

            /**
             * <p>A list of roles in the scene.</p>
             */
            public Builder roleList(java.util.List<RoleList> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * <p>The scene description.</p>
             * 
             * <strong>example:</strong>
             * <p>At school, Carl sees a photo and asks you about your family.</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>38c41b7b509911efbe6e0c42a106bb02</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>A list of image URLs related to the current scene.</p>
             */
            public Builder sceneImageList(java.util.List<String> sceneImageList) {
                this.sceneImageList = sceneImageList;
                return this;
            }

            /**
             * <p>The scene task list.</p>
             */
            public Builder sceneTaskList(java.util.List<SceneTaskList> sceneTaskList) {
                this.sceneTaskList = sceneTaskList;
                return this;
            }

            /**
             * <p>The translation of the scene description.</p>
             */
            public Builder sceneTranslate(String sceneTranslate) {
                this.sceneTranslate = sceneTranslate;
                return this;
            }

            /**
             * <p>The sentence list.</p>
             */
            public Builder sentenceList(java.util.List<SentenceList> sentenceList) {
                this.sentenceList = sentenceList;
                return this;
            }

            /**
             * <p>The practice target.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The theme details.</p>
             */
            public Builder theme(Theme theme) {
                this.theme = theme;
                return this;
            }

            /**
             * <p>The topic details.</p>
             */
            public Builder topic(Topic topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The word list.</p>
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

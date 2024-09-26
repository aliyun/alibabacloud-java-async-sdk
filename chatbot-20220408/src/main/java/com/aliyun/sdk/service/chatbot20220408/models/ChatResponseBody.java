// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChatResponseBody} extends {@link TeaModel}
 *
 * <p>ChatResponseBody</p>
 */
public class ChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List < Messages> messages;

    @com.aliyun.core.annotation.NameInMap("QuerySegList")
    private java.util.List < String > querySegList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private ChatResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.messages = builder.messages;
        this.querySegList = builder.querySegList;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return messages
     */
    public java.util.List < Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return querySegList
     */
    public java.util.List < String > getQuerySegList() {
        return this.querySegList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private String messageId; 
        private java.util.List < Messages> messages; 
        private java.util.List < String > querySegList; 
        private String requestId; 
        private String sessionId; 

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List < Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * QuerySegList.
         */
        public Builder querySegList(java.util.List < String > querySegList) {
            this.querySegList = querySegList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public ChatResponseBody build() {
            return new ChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class RelatedKnowledges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private String knowledgeId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private RelatedKnowledges(Builder builder) {
            this.knowledgeId = builder.knowledgeId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedKnowledges create() {
            return builder().build();
        }

        /**
         * @return knowledgeId
         */
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String knowledgeId; 
            private String title; 

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RelatedKnowledges build() {
                return new RelatedKnowledges(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Knowledge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerSource")
        private String answerSource;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("HitStatement")
        private String hitStatement;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("RelatedKnowledges")
        private java.util.List < RelatedKnowledges> relatedKnowledges;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Knowledge(Builder builder) {
            this.answerSource = builder.answerSource;
            this.category = builder.category;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.hitStatement = builder.hitStatement;
            this.id = builder.id;
            this.relatedKnowledges = builder.relatedKnowledges;
            this.score = builder.score;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Knowledge create() {
            return builder().build();
        }

        /**
         * @return answerSource
         */
        public String getAnswerSource() {
            return this.answerSource;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return hitStatement
         */
        public String getHitStatement() {
            return this.hitStatement;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return relatedKnowledges
         */
        public java.util.List < RelatedKnowledges> getRelatedKnowledges() {
            return this.relatedKnowledges;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String answerSource; 
            private String category; 
            private String content; 
            private String contentType; 
            private String hitStatement; 
            private String id; 
            private java.util.List < RelatedKnowledges> relatedKnowledges; 
            private Double score; 
            private String summary; 
            private String title; 

            /**
             * AnswerSource.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * HitStatement.
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * RelatedKnowledges.
             */
            public Builder relatedKnowledges(java.util.List < RelatedKnowledges> relatedKnowledges) {
                this.relatedKnowledges = relatedKnowledges;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Knowledge build() {
                return new Knowledge(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Recommends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerSource")
        private String answerSource;

        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private String knowledgeId;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Recommends(Builder builder) {
            this.answerSource = builder.answerSource;
            this.knowledgeId = builder.knowledgeId;
            this.score = builder.score;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recommends create() {
            return builder().build();
        }

        /**
         * @return answerSource
         */
        public String getAnswerSource() {
            return this.answerSource;
        }

        /**
         * @return knowledgeId
         */
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String answerSource; 
            private String knowledgeId; 
            private Double score; 
            private String title; 

            /**
             * AnswerSource.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Recommends build() {
                return new Recommends(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Slots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hit")
        private Boolean hit;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Slots(Builder builder) {
            this.hit = builder.hit;
            this.name = builder.name;
            this.origin = builder.origin;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slots create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public Boolean getHit() {
            return this.hit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean hit; 
            private String name; 
            private String origin; 
            private String value; 

            /**
             * Hit.
             */
            public Builder hit(Boolean hit) {
                this.hit = hit;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Slots build() {
                return new Slots(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Text extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerSource")
        private String answerSource;

        @com.aliyun.core.annotation.NameInMap("ArticleTitle")
        private String articleTitle;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.Map < String, ? > commands;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DialogName")
        private String dialogName;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map < String, ? > ext;

        @com.aliyun.core.annotation.NameInMap("ExternalFlags")
        private java.util.Map < String, ? > externalFlags;

        @com.aliyun.core.annotation.NameInMap("HitStatement")
        private String hitStatement;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private String metaData;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ResponseType")
        private String responseType;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Slots")
        private java.util.List < Slots> slots;

        @com.aliyun.core.annotation.NameInMap("UserDefinedChatTitle")
        private String userDefinedChatTitle;

        private Text(Builder builder) {
            this.answerSource = builder.answerSource;
            this.articleTitle = builder.articleTitle;
            this.commands = builder.commands;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.dialogName = builder.dialogName;
            this.ext = builder.ext;
            this.externalFlags = builder.externalFlags;
            this.hitStatement = builder.hitStatement;
            this.intentName = builder.intentName;
            this.metaData = builder.metaData;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.responseType = builder.responseType;
            this.score = builder.score;
            this.slots = builder.slots;
            this.userDefinedChatTitle = builder.userDefinedChatTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Text create() {
            return builder().build();
        }

        /**
         * @return answerSource
         */
        public String getAnswerSource() {
            return this.answerSource;
        }

        /**
         * @return articleTitle
         */
        public String getArticleTitle() {
            return this.articleTitle;
        }

        /**
         * @return commands
         */
        public java.util.Map < String, ? > getCommands() {
            return this.commands;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return dialogName
         */
        public String getDialogName() {
            return this.dialogName;
        }

        /**
         * @return ext
         */
        public java.util.Map < String, ? > getExt() {
            return this.ext;
        }

        /**
         * @return externalFlags
         */
        public java.util.Map < String, ? > getExternalFlags() {
            return this.externalFlags;
        }

        /**
         * @return hitStatement
         */
        public String getHitStatement() {
            return this.hitStatement;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return metaData
         */
        public String getMetaData() {
            return this.metaData;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return responseType
         */
        public String getResponseType() {
            return this.responseType;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return slots
         */
        public java.util.List < Slots> getSlots() {
            return this.slots;
        }

        /**
         * @return userDefinedChatTitle
         */
        public String getUserDefinedChatTitle() {
            return this.userDefinedChatTitle;
        }

        public static final class Builder {
            private String answerSource; 
            private String articleTitle; 
            private java.util.Map < String, ? > commands; 
            private String content; 
            private String contentType; 
            private String dialogName; 
            private java.util.Map < String, ? > ext; 
            private java.util.Map < String, ? > externalFlags; 
            private String hitStatement; 
            private String intentName; 
            private String metaData; 
            private String nodeId; 
            private String nodeName; 
            private String responseType; 
            private Double score; 
            private java.util.List < Slots> slots; 
            private String userDefinedChatTitle; 

            /**
             * AnswerSource.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * ArticleTitle.
             */
            public Builder articleTitle(String articleTitle) {
                this.articleTitle = articleTitle;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.Map < String, ? > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * DialogName.
             */
            public Builder dialogName(String dialogName) {
                this.dialogName = dialogName;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
            }

            /**
             * ExternalFlags.
             */
            public Builder externalFlags(java.util.Map < String, ? > externalFlags) {
                this.externalFlags = externalFlags;
                return this;
            }

            /**
             * HitStatement.
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * MetaData.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * ResponseType.
             */
            public Builder responseType(String responseType) {
                this.responseType = responseType;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * Slots.
             */
            public Builder slots(java.util.List < Slots> slots) {
                this.slots = slots;
                return this;
            }

            /**
             * UserDefinedChatTitle.
             */
            public Builder userDefinedChatTitle(String userDefinedChatTitle) {
                this.userDefinedChatTitle = userDefinedChatTitle;
                return this;
            }

            public Text build() {
                return new Text(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChatResponseBody} extends {@link TeaModel}
     *
     * <p>ChatResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerSource")
        private String answerSource;

        @com.aliyun.core.annotation.NameInMap("AnswerType")
        private String answerType;

        @com.aliyun.core.annotation.NameInMap("Knowledge")
        private Knowledge knowledge;

        @com.aliyun.core.annotation.NameInMap("Recommends")
        private java.util.List < Recommends> recommends;

        @com.aliyun.core.annotation.NameInMap("Text")
        private Text text;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VoiceTitle")
        private String voiceTitle;

        private Messages(Builder builder) {
            this.answerSource = builder.answerSource;
            this.answerType = builder.answerType;
            this.knowledge = builder.knowledge;
            this.recommends = builder.recommends;
            this.text = builder.text;
            this.title = builder.title;
            this.voiceTitle = builder.voiceTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return answerSource
         */
        public String getAnswerSource() {
            return this.answerSource;
        }

        /**
         * @return answerType
         */
        public String getAnswerType() {
            return this.answerType;
        }

        /**
         * @return knowledge
         */
        public Knowledge getKnowledge() {
            return this.knowledge;
        }

        /**
         * @return recommends
         */
        public java.util.List < Recommends> getRecommends() {
            return this.recommends;
        }

        /**
         * @return text
         */
        public Text getText() {
            return this.text;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return voiceTitle
         */
        public String getVoiceTitle() {
            return this.voiceTitle;
        }

        public static final class Builder {
            private String answerSource; 
            private String answerType; 
            private Knowledge knowledge; 
            private java.util.List < Recommends> recommends; 
            private Text text; 
            private String title; 
            private String voiceTitle; 

            /**
             * AnswerSource.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * AnswerType.
             */
            public Builder answerType(String answerType) {
                this.answerType = answerType;
                return this;
            }

            /**
             * Knowledge.
             */
            public Builder knowledge(Knowledge knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * Recommends.
             */
            public Builder recommends(java.util.List < Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(Text text) {
                this.text = text;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * VoiceTitle.
             */
            public Builder voiceTitle(String voiceTitle) {
                this.voiceTitle = voiceTitle;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}

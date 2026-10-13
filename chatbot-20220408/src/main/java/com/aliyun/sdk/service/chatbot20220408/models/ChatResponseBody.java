// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ChatResponseBody} extends {@link TeaModel}
 *
 * <p>ChatResponseBody</p>
 */
public class ChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.NameInMap("QuerySegList")
    private java.util.List<String> querySegList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return querySegList
     */
    public java.util.List<String> getQuerySegList() {
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
        private java.util.List<Messages> messages; 
        private java.util.List<String> querySegList; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(ChatResponseBody model) {
            this.messageId = model.messageId;
            this.messages = model.messages;
            this.querySegList = model.querySegList;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
        } 

        /**
         * <p>The ID of the response message in the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>A2315C4B-A872-5DEE-9DAD-D73B194A4AEC</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The list of messages.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * <p>The tokenization results of the query, which may be empty.</p>
         */
        public Builder querySegList(java.util.List<String> querySegList) {
            this.querySegList = querySegList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A2315C4B-A872-5DEE-9DAD-D73B194A4AEC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>a6f216a0685c4c8baa0e8beb6d5ec6db</p>
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

            private Builder() {
            } 

            private Builder(RelatedKnowledges model) {
                this.knowledgeId = model.knowledgeId;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the related knowledge entry.</p>
             * 
             * <strong>example:</strong>
             * <p>735899</p>
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The title of the related knowledge entry.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金查询</p>
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
        private java.util.List<RelatedKnowledges> relatedKnowledges;

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
        public java.util.List<RelatedKnowledges> getRelatedKnowledges() {
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
            private java.util.List<RelatedKnowledges> relatedKnowledges; 
            private Double score; 
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Knowledge model) {
                this.answerSource = model.answerSource;
                this.category = model.category;
                this.content = model.content;
                this.contentType = model.contentType;
                this.hitStatement = model.hitStatement;
                this.id = model.id;
                this.relatedKnowledges = model.relatedKnowledges;
                this.score = model.score;
                this.summary = model.summary;
                this.title = model.title;
            } 

            /**
             * <p>Distinguishes the answer type.
             * KnowledgeBase: knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>KnowledgeBase</p>
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * <p>The knowledge category.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The content of the hit question.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金提取，请在首页搜索公积金提取，提交办事的表单</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The indicator of whether the answer is plain text or rich text.</p>
             * 
             * <strong>example:</strong>
             * <p>PLAIN_TEXT</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The hit statement.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金</p>
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * <p>The ID of the hit question in the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>735898</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list of related knowledge entries.</p>
             */
            public Builder relatedKnowledges(java.util.List<RelatedKnowledges> relatedKnowledges) {
                this.relatedKnowledges = relatedKnowledges;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.998</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The summary of the hit question.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金提取</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The title of the hit question.</p>
             * 
             * <strong>example:</strong>
             * <p>公积金提取</p>
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

            private Builder() {
            } 

            private Builder(Recommends model) {
                this.answerSource = model.answerSource;
                this.knowledgeId = model.knowledgeId;
                this.score = model.score;
                this.title = model.title;
            } 

            /**
             * <p>The identifier of the clarification source.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOWLEDGE</p>
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * <p>The knowledge ID for clarification.</p>
             * 
             * <strong>example:</strong>
             * <p>4548</p>
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The score of the recommended content. This field has a value when AnswerSource is KNOWLEDGE.</p>
             * 
             * <strong>example:</strong>
             * <p>0.46</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The clarification content, which can be an entity from knowledge graph Q&amp;A, a knowledge title from knowledge-based Q&amp;A, or a column value from table-based Q&amp;A.</p>
             * 
             * <strong>example:</strong>
             * <p>Test plain text</p>
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

            private Builder() {
            } 

            private Builder(Slots model) {
                this.hit = model.hit;
                this.name = model.name;
                this.origin = model.origin;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the slot is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hit(Boolean hit) {
                this.hit = hit;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>CheckWeatherIntent.city</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The original value.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The specific value.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
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
        private java.util.Map<String, ?> commands;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DialogName")
        private String dialogName;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map<String, ?> ext;

        @com.aliyun.core.annotation.NameInMap("ExternalFlags")
        private java.util.Map<String, ?> externalFlags;

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
        private java.util.List<Slots> slots;

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
        public java.util.Map<String, ?> getCommands() {
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
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        /**
         * @return externalFlags
         */
        public java.util.Map<String, ?> getExternalFlags() {
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
        public java.util.List<Slots> getSlots() {
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
            private java.util.Map<String, ?> commands; 
            private String content; 
            private String contentType; 
            private String dialogName; 
            private java.util.Map<String, ?> ext; 
            private java.util.Map<String, ?> externalFlags; 
            private String hitStatement; 
            private String intentName; 
            private String metaData; 
            private String nodeId; 
            private String nodeName; 
            private String responseType; 
            private Double score; 
            private java.util.List<Slots> slots; 
            private String userDefinedChatTitle; 

            private Builder() {
            } 

            private Builder(Text model) {
                this.answerSource = model.answerSource;
                this.articleTitle = model.articleTitle;
                this.commands = model.commands;
                this.content = model.content;
                this.contentType = model.contentType;
                this.dialogName = model.dialogName;
                this.ext = model.ext;
                this.externalFlags = model.externalFlags;
                this.hitStatement = model.hitStatement;
                this.intentName = model.intentName;
                this.metaData = model.metaData;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.responseType = model.responseType;
                this.score = model.score;
                this.slots = model.slots;
                this.userDefinedChatTitle = model.userDefinedChatTitle;
            } 

            /**
             * <p>Distinguishes the answer type.</p>
             * 
             * <strong>example:</strong>
             * <p>BotFramework</p>
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * <p>When AnswerSource is MACHINE_READ, this field returns the title of the hit article.</p>
             * 
             * <strong>example:</strong>
             * <p>ICP Filing 11
             * [responses.200.schema.properties.Messages.items.properties.AnswerSource.enumValueTitles. INTENT_FAQ_CLARIFY]FAQ and dialog flow mixed clarification</p>
             */
            public Builder articleTitle(String articleTitle) {
                this.articleTitle = articleTitle;
                return this;
            }

            /**
             * <p>The instruction parameters, such as the skill group for a transfer-to-agent instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;sysToAgent&quot;: &quot;{\&quot;skillGroup\&quot;:\&quot;12\&quot;}&quot;
             * }</p>
             */
            public Builder commands(java.util.Map<String, ?> commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The content of the text message.</p>
             * 
             * <strong>example:</strong>
             * <p>Which location do you want to check the weather for?</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The indicator of whether the answer is plain text or rich text.</p>
             * 
             * <strong>example:</strong>
             * <p>PLAIN_TEXT</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>When AnswerSource is BotFramework, this field returns the dialog flow unit name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample_CheckWeather</p>
             */
            public Builder dialogName(String dialogName) {
                this.dialogName = dialogName;
                return this;
            }

            /**
             * <p>The pass-through parameters returned in this field.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;MATCHED_INTENT_SOURCE&quot;: &quot;&quot;,
             *     &quot;INTENT_ID&quot;: 724414,
             *     &quot;IntentName&quot;: &quot;CheckWeatherIntent&quot;,
             *     &quot;INTENT_DETAIL&quot;: &quot;[I want|I need to] check the weather&quot;,
             *     &quot;LGF_EXPRESSION&quot;: &quot;[I want|I need to] check the weather&quot;,
             *     &quot;IS_SESSION_FINISHED&quot;: false,
             *     &quot;DsScore&quot;: 100.0,
             *     &quot;DIALOG_ID&quot;: &quot;299034&quot;,
             *     &quot;FINISH_LABEL&quot;: false,
             *     &quot;MODULE_START&quot;: false,
             *     &quot;INTENT_NAME&quot;: &quot;CheckWeatherIntent&quot;,
             *     &quot;INTENT_SOURCE&quot;: &quot;Lgf&quot;,
             *     &quot;DIALOG_NAME&quot;: &quot;Sample_CheckWeather&quot;
             * }</p>
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The pass-through parameters returned when AnswerSource is BotFramework.</p>
             */
            public Builder externalFlags(java.util.Map<String, ?> externalFlags) {
                this.externalFlags = externalFlags;
                return this;
            }

            /**
             * <p>The hit statement.</p>
             * 
             * <strong>example:</strong>
             * <p>CheckWeather</p>
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * <p>When AnswerSource is BotFramework, this field returns the intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>CheckWeatherIntent</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>[[{&quot;columnName&quot;:&quot;Name&quot;,&quot;stringValue&quot;:&quot;Wang Shanshan&quot;}]]</p>
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The node ID returned when AnswerSource is BotFramework.</p>
             * 
             * <strong>example:</strong>
             * <p>1410-c7a72a78.__city</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>When AnswerSource is BotFramework, this field returns the node name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample_CheckWeather.CheckWeatherSlotFilling.__city</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>When AnswerSource is BotFramework and ResponseType is SSML, this field indicates that a dialog flow interactive slot filling is hit. Otherwise, this field does not exist.</p>
             * 
             * <strong>example:</strong>
             * <p>SSML</p>
             */
            public Builder responseType(String responseType) {
                this.responseType = responseType;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>When AnswerSource is BotFramework, this field returns the list of named entities.</p>
             */
            public Builder slots(java.util.List<Slots> slots) {
                this.slots = slots;
                return this;
            }

            /**
             * <p>The title of the custom chitchat topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Greeting</p>
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
        private java.util.List<Recommends> recommends;

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
        public java.util.List<Recommends> getRecommends() {
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
            private java.util.List<Recommends> recommends; 
            private Text text; 
            private String title; 
            private String voiceTitle; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.answerSource = model.answerSource;
                this.answerType = model.answerType;
                this.knowledge = model.knowledge;
                this.recommends = model.recommends;
                this.text = model.text;
                this.title = model.title;
                this.voiceTitle = model.voiceTitle;
            } 

            /**
             * <p>The source of the recommended answer when AnswerType is Recommend.
             * [_single.resp.200.props.Messages.items.AnswerSource.enum. INTENT_FAQ_CLARIFY]mixed clarification from FAQ and dialog flow</p>
             * 
             * <strong>example:</strong>
             * <p>KNOWLEDGE</p>
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * <p>The type of this message.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder answerType(String answerType) {
                this.answerType = answerType;
                return this;
            }

            /**
             * <p>When AnswerType is Knowledge, this field contains the Knowledge object returned by the chatbot.</p>
             */
            public Builder knowledge(Knowledge knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * <p>The list of recommendations returned by the bot when AnswerType is Recommend.</p>
             */
            public Builder recommends(java.util.List<Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            /**
             * <p>When AnswerType is Text, this field contains the Text object returned by the chatbot.</p>
             */
            public Builder text(Text text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The counter-question title in online scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>Which insurance age range are you inquiring about?</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The clarification content in voice scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>Are you asking about provident fund inquiry or provident fund withdrawal?</p>
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

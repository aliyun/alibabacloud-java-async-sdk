// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeeBotChatResponseBody} extends {@link TeaModel}
 *
 * <p>BeeBotChatResponseBody</p>
 */
public class BeeBotChatResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BeeBotChatResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeeBotChatResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * If OK is returned, the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BeeBotChatResponseBody build() {
            return new BeeBotChatResponseBody(this);
        } 

    } 

    public static class RelatedKnowledges extends TeaModel {
        @NameInMap("KnowledgeId")
        private String knowledgeId;

        @NameInMap("Title")
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
             * The ID of the related knowledge.
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * The title of the related knowledge.
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
    public static class Knowledge extends TeaModel {
        @NameInMap("AnswerSource")
        private String answerSource;

        @NameInMap("Category")
        private String category;

        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("HitStatement")
        private String hitStatement;

        @NameInMap("Id")
        private String id;

        @NameInMap("RelatedKnowledges")
        private java.util.List < RelatedKnowledges> relatedKnowledges;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Title")
        private String title;

        private Knowledge(Builder builder) {
            this.answerSource = builder.answerSource;
            this.category = builder.category;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.hitStatement = builder.hitStatement;
            this.id = builder.id;
            this.relatedKnowledges = builder.relatedKnowledges;
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
            private String summary; 
            private String title; 

            /**
             * The source of the answer.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * The category of the knowledge.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The content of the hit question.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Indicates whether the answer is in plain text or rich text.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The hit text.
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * The ID of the hit question in the knowledge base.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The list of the related knowledge.
             */
            public Builder relatedKnowledges(java.util.List < RelatedKnowledges> relatedKnowledges) {
                this.relatedKnowledges = relatedKnowledges;
                return this;
            }

            /**
             * The summary to the hit question.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * The title of the hit question.
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
    public static class Recommends extends TeaModel {
        @NameInMap("AnswerSource")
        private String answerSource;

        @NameInMap("KnowledgeId")
        private String knowledgeId;

        @NameInMap("Title")
        private String title;

        private Recommends(Builder builder) {
            this.answerSource = builder.answerSource;
            this.knowledgeId = builder.knowledgeId;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String answerSource; 
            private String knowledgeId; 
            private String title; 

            /**
             * The source of the recommended answer.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * The ID of the recommended knowledge.
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * The title of the recommended knowledge. Valid values: the entity in graph-based question answering, the knowledge title in knowledge-based question answering, or the column value in table-based question answering.
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
    public static class Slots extends TeaModel {
        @NameInMap("Hit")
        private Boolean hit;

        @NameInMap("Name")
        private String name;

        @NameInMap("Origin")
        private String origin;

        @NameInMap("Value")
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
             * Indicates whether the slot is hit.
             */
            public Builder hit(Boolean hit) {
                this.hit = hit;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The original value.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * The specific value.
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
    public static class Text extends TeaModel {
        @NameInMap("AnswerSource")
        private String answerSource;

        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("DialogName")
        private String dialogName;

        @NameInMap("Ext")
        private java.util.Map < String, ? > ext;

        @NameInMap("ExternalFlags")
        private java.util.Map < String, ? > externalFlags;

        @NameInMap("HitStatement")
        private String hitStatement;

        @NameInMap("IntentName")
        private String intentName;

        @NameInMap("MetaData")
        private String metaData;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Slots")
        private java.util.List < Slots> slots;

        @NameInMap("UserDefinedChatTitle")
        private String userDefinedChatTitle;

        private Text(Builder builder) {
            this.answerSource = builder.answerSource;
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
            private java.util.List < Slots> slots; 
            private String userDefinedChatTitle; 

            /**
             * The source of the answer.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * The content of the text message.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Indicates whether the answer is in plain text or rich text.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The name of the dialog. When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
             */
            public Builder dialogName(String dialogName) {
                this.dialogName = dialogName;
                return this;
            }

            /**
             * The passthrough parameters are returned.
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
            }

            /**
             * When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
             */
            public Builder externalFlags(java.util.Map < String, ? > externalFlags) {
                this.externalFlags = externalFlags;
                return this;
            }

            /**
             * The hit text.
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * The name of the intent. When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * The metadata.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * The ID of the node. When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node. When the AnswerSource parameter is set to BotFramework, the value of this parameter is returned.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The list of slots.
             */
            public Builder slots(java.util.List < Slots> slots) {
                this.slots = slots;
                return this;
            }

            /**
             * The title of the chitchat.
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
    public static class Messages extends TeaModel {
        @NameInMap("AnswerSource")
        private String answerSource;

        @NameInMap("AnswerType")
        private String answerType;

        @NameInMap("Knowledge")
        private Knowledge knowledge;

        @NameInMap("Recommends")
        private java.util.List < Recommends> recommends;

        @NameInMap("Text")
        private Text text;

        private Messages(Builder builder) {
            this.answerSource = builder.answerSource;
            this.answerType = builder.answerType;
            this.knowledge = builder.knowledge;
            this.recommends = builder.recommends;
            this.text = builder.text;
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

        public static final class Builder {
            private String answerSource; 
            private String answerType; 
            private Knowledge knowledge; 
            private java.util.List < Recommends> recommends; 
            private Text text; 

            /**
             * When the AnswerType parameter is set to Recommend, this parameter indicates the source of the recommended answer.
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * The type of the answer.
             */
            public Builder answerType(String answerType) {
                this.answerType = answerType;
                return this;
            }

            /**
             * When the AnswerType parameter is set to Knowledge, this parameter contains the Knowledge object returned by the bot.
             */
            public Builder knowledge(Knowledge knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * The list of recommended knowledge. When the AnswerType parameter is set to Recommend, this parameter is returned.
             */
            public Builder recommends(java.util.List < Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            /**
             * When the AnswerType parameter is set to Text, this parameter contains the Text object returned by the bot.
             */
            public Builder text(Text text) {
                this.text = text;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MessageId")
        private String messageId;

        @NameInMap("Messages")
        private java.util.List < Messages> messages;

        @NameInMap("SessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.messageId = builder.messageId;
            this.messages = builder.messages;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String messageId; 
            private java.util.List < Messages> messages; 
            private String sessionId; 

            /**
             * The ID of the response message.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * The list of messages.
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * The ID of the session.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

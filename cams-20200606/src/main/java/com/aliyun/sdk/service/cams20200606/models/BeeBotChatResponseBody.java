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
         * 返回结果 OK 为正常
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 提示信息，当返回异常时有值
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
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
             * 知识关联知识的ID
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * 知识的关联知识的标题
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
             * 区分答案类型。
             * <p>
             * KnowledgeBase:知识库条；
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * 知识类目
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 命中问题的内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 纯文本/富文本答案的标示
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * 命中语句
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * 命中问题在知识库中的ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 关联知识列表
             */
            public Builder relatedKnowledges(java.util.List < RelatedKnowledges> relatedKnowledges) {
                this.relatedKnowledges = relatedKnowledges;
                return this;
            }

            /**
             * 命中问题的简介
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * 命中问题的标题
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
             * 澄清来源的标识
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * 澄清的知识id
             */
            public Builder knowledgeId(String knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * 澄清内容，可能是
             * <p>
             * 图谱问答的实体、
             * 知识问答的知识标题、
             * 表格问答的列值
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
             * 区分答案类型
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * 文本消息的内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 纯文本/富文本答案的标示
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * 当AnswerSource为BotFramework时，此字段返回对话单元名称
             */
            public Builder dialogName(String dialogName) {
                this.dialogName = dialogName;
                return this;
            }

            /**
             * 此字段返回透传参数
             */
            public Builder ext(java.util.Map < String, ? > ext) {
                this.ext = ext;
                return this;
            }

            /**
             * 当AnswerSource为BotFramework时，此字段返回透传参数
             */
            public Builder externalFlags(java.util.Map < String, ? > externalFlags) {
                this.externalFlags = externalFlags;
                return this;
            }

            /**
             * 命中语句
             */
            public Builder hitStatement(String hitStatement) {
                this.hitStatement = hitStatement;
                return this;
            }

            /**
             * 当AnswerSource为BotFramework时，此字段返回意图名称
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
             * 当AnswerSource为BotFramework时，此字段返回节点Id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 当AnswerSource为BotFramework时，此字段返回节点名称
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * 当AnswerSource为BotFramework时，此字段返回专有名词列表
             */
            public Builder slots(java.util.List < Slots> slots) {
                this.slots = slots;
                return this;
            }

            /**
             * 自定义闲聊主题title
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
             * 当AnswerType为Recommend时，此字段表示推荐的答案来源
             */
            public Builder answerSource(String answerSource) {
                this.answerSource = answerSource;
                return this;
            }

            /**
             * 本条消息的类型
             */
            public Builder answerType(String answerType) {
                this.answerType = answerType;
                return this;
            }

            /**
             * 当AnswerType为Knowledge时，此字段包含机器人返回的Knowledge对象
             */
            public Builder knowledge(Knowledge knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * 当AnswerType为Recommend时，此字段包含机器人返回的Recommend的列表
             */
            public Builder recommends(java.util.List < Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            /**
             * 当AnswerType为Text时，此字段包含机器人返回的Text对象
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
             * 本条会话应答消息的ID
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * 消息的列表
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * 本次会话的ID
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

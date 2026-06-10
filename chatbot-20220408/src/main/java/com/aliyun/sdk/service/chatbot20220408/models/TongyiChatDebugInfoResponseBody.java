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
 * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
 *
 * <p>TongyiChatDebugInfoResponseBody</p>
 */
public class TongyiChatDebugInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnswerInfo")
    private AnswerInfo answerInfo;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private java.util.List<Pipeline> pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TongyiChatDebugInfoResponseBody(Builder builder) {
        this.answerInfo = builder.answerInfo;
        this.messageId = builder.messageId;
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TongyiChatDebugInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answerInfo
     */
    public AnswerInfo getAnswerInfo() {
        return this.answerInfo;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return pipeline
     */
    public java.util.List<Pipeline> getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AnswerInfo answerInfo; 
        private String messageId; 
        private java.util.List<Pipeline> pipeline; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TongyiChatDebugInfoResponseBody model) {
            this.answerInfo = model.answerInfo;
            this.messageId = model.messageId;
            this.pipeline = model.pipeline;
            this.requestId = model.requestId;
        } 

        /**
         * AnswerInfo.
         */
        public Builder answerInfo(AnswerInfo answerInfo) {
            this.answerInfo = answerInfo;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Pipeline.
         */
        public Builder pipeline(java.util.List<Pipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TongyiChatDebugInfoResponseBody build() {
            return new TongyiChatDebugInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("ReferenceExt")
        private Object referenceExt;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ItemList(Builder builder) {
            this.contentType = builder.contentType;
            this.dataSource = builder.dataSource;
            this.id = builder.id;
            this.number = builder.number;
            this.referenceExt = builder.referenceExt;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return referenceExt
         */
        public Object getReferenceExt() {
            return this.referenceExt;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String contentType; 
            private String dataSource; 
            private String id; 
            private Integer number; 
            private Object referenceExt; 
            private String title; 

            private Builder() {
            } 

            private Builder(ItemList model) {
                this.contentType = model.contentType;
                this.dataSource = model.dataSource;
                this.id = model.id;
                this.number = model.number;
                this.referenceExt = model.referenceExt;
                this.title = model.title;
            } 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
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
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * ReferenceExt.
             */
            public Builder referenceExt(Object referenceExt) {
                this.referenceExt = referenceExt;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class AnswerReferenceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemList")
        private java.util.List<ItemList> itemList;

        private AnswerReferenceInfo(Builder builder) {
            this.itemList = builder.itemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerReferenceInfo create() {
            return builder().build();
        }

        /**
         * @return itemList
         */
        public java.util.List<ItemList> getItemList() {
            return this.itemList;
        }

        public static final class Builder {
            private java.util.List<ItemList> itemList; 

            private Builder() {
            } 

            private Builder(AnswerReferenceInfo model) {
                this.itemList = model.itemList;
            } 

            /**
             * ItemList.
             */
            public Builder itemList(java.util.List<ItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

            public AnswerReferenceInfo build() {
                return new AnswerReferenceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class SentenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ReferNumber")
        private Integer referNumber;

        private SentenceList(Builder builder) {
            this.content = builder.content;
            this.referNumber = builder.referNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SentenceList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return referNumber
         */
        public Integer getReferNumber() {
            return this.referNumber;
        }

        public static final class Builder {
            private String content; 
            private Integer referNumber; 

            private Builder() {
            } 

            private Builder(SentenceList model) {
                this.content = model.content;
                this.referNumber = model.referNumber;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ReferNumber.
             */
            public Builder referNumber(Integer referNumber) {
                this.referNumber = referNumber;
                return this;
            }

            public SentenceList build() {
                return new SentenceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class DirectMessageBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("TransitionList")
        private java.util.List<String> transitionList;

        @com.aliyun.core.annotation.NameInMap("relatedQuestionList")
        private java.util.List<String> relatedQuestionList;

        @com.aliyun.core.annotation.NameInMap("sentenceList")
        private java.util.List<SentenceList> sentenceList;

        private DirectMessageBody(Builder builder) {
            this.contentType = builder.contentType;
            this.transitionList = builder.transitionList;
            this.relatedQuestionList = builder.relatedQuestionList;
            this.sentenceList = builder.sentenceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectMessageBody create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return transitionList
         */
        public java.util.List<String> getTransitionList() {
            return this.transitionList;
        }

        /**
         * @return relatedQuestionList
         */
        public java.util.List<String> getRelatedQuestionList() {
            return this.relatedQuestionList;
        }

        /**
         * @return sentenceList
         */
        public java.util.List<SentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public static final class Builder {
            private String contentType; 
            private java.util.List<String> transitionList; 
            private java.util.List<String> relatedQuestionList; 
            private java.util.List<SentenceList> sentenceList; 

            private Builder() {
            } 

            private Builder(DirectMessageBody model) {
                this.contentType = model.contentType;
                this.transitionList = model.transitionList;
                this.relatedQuestionList = model.relatedQuestionList;
                this.sentenceList = model.sentenceList;
            } 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * TransitionList.
             */
            public Builder transitionList(java.util.List<String> transitionList) {
                this.transitionList = transitionList;
                return this;
            }

            /**
             * relatedQuestionList.
             */
            public Builder relatedQuestionList(java.util.List<String> relatedQuestionList) {
                this.relatedQuestionList = relatedQuestionList;
                return this;
            }

            /**
             * sentenceList.
             */
            public Builder sentenceList(java.util.List<SentenceList> sentenceList) {
                this.sentenceList = sentenceList;
                return this;
            }

            public DirectMessageBody build() {
                return new DirectMessageBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class MessageBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private Object commands;

        @com.aliyun.core.annotation.NameInMap("DirectMessageBody")
        private DirectMessageBody directMessageBody;

        private MessageBody(Builder builder) {
            this.commands = builder.commands;
            this.directMessageBody = builder.directMessageBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageBody create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public Object getCommands() {
            return this.commands;
        }

        /**
         * @return directMessageBody
         */
        public DirectMessageBody getDirectMessageBody() {
            return this.directMessageBody;
        }

        public static final class Builder {
            private Object commands; 
            private DirectMessageBody directMessageBody; 

            private Builder() {
            } 

            private Builder(MessageBody model) {
                this.commands = model.commands;
                this.directMessageBody = model.directMessageBody;
            } 

            /**
             * Commands.
             */
            public Builder commands(Object commands) {
                this.commands = commands;
                return this;
            }

            /**
             * DirectMessageBody.
             */
            public Builder directMessageBody(DirectMessageBody directMessageBody) {
                this.directMessageBody = directMessageBody;
                return this;
            }

            public MessageBody build() {
                return new MessageBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class AnswerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerReferenceInfo")
        private AnswerReferenceInfo answerReferenceInfo;

        @com.aliyun.core.annotation.NameInMap("MessageBody")
        private MessageBody messageBody;

        private AnswerInfo(Builder builder) {
            this.answerReferenceInfo = builder.answerReferenceInfo;
            this.messageBody = builder.messageBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerInfo create() {
            return builder().build();
        }

        /**
         * @return answerReferenceInfo
         */
        public AnswerReferenceInfo getAnswerReferenceInfo() {
            return this.answerReferenceInfo;
        }

        /**
         * @return messageBody
         */
        public MessageBody getMessageBody() {
            return this.messageBody;
        }

        public static final class Builder {
            private AnswerReferenceInfo answerReferenceInfo; 
            private MessageBody messageBody; 

            private Builder() {
            } 

            private Builder(AnswerInfo model) {
                this.answerReferenceInfo = model.answerReferenceInfo;
                this.messageBody = model.messageBody;
            } 

            /**
             * AnswerReferenceInfo.
             */
            public Builder answerReferenceInfo(AnswerReferenceInfo answerReferenceInfo) {
                this.answerReferenceInfo = answerReferenceInfo;
                return this;
            }

            /**
             * MessageBody.
             */
            public Builder messageBody(MessageBody messageBody) {
                this.messageBody = messageBody;
                return this;
            }

            public AnswerInfo build() {
                return new AnswerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private Object input;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Object output;

        private Pipeline(Builder builder) {
            this.input = builder.input;
            this.name = builder.name;
            this.nodeType = builder.nodeType;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public Object getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return output
         */
        public Object getOutput() {
            return this.output;
        }

        public static final class Builder {
            private Object input; 
            private String name; 
            private String nodeType; 
            private Object output; 

            private Builder() {
            } 

            private Builder(Pipeline model) {
                this.input = model.input;
                this.name = model.name;
                this.nodeType = model.nodeType;
                this.output = model.output;
            } 

            /**
             * Input.
             */
            public Builder input(Object input) {
                this.input = input;
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
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(Object output) {
                this.output = output;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}

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

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private TongyiChatDebugInfoResponseBody(Builder builder) {
        this.answerInfo = builder.answerInfo;
        this.messageId = builder.messageId;
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
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

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private AnswerInfo answerInfo; 
        private String messageId; 
        private java.util.List<Pipeline> pipeline; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(TongyiChatDebugInfoResponseBody model) {
            this.answerInfo = model.answerInfo;
            this.messageId = model.messageId;
            this.pipeline = model.pipeline;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
        } 

        /**
         * <p>The answer information corresponding to the conversation.</p>
         */
        public Builder answerInfo(AnswerInfo answerInfo) {
            this.answerInfo = answerInfo;
            return this;
        }

        /**
         * <p>The ID of the response message for the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>2828708A-2C7A-1BAE-B810-87DB9DA9C661</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The information about the entire Q&amp;A process.</p>
         * 
         * <strong>example:</strong>
         * <p>For examples, see the child elements</p>
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

        /**
         * <p>The ID of the session to which the current response message belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>19856284-0ba1-4da3-9a5a-05db2bdf296e</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
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
             * <p>The type of the referenced text.</p>
             * 
             * <strong>example:</strong>
             * <p>PLAIN_TEXT/RICH_TEXT</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The source of the referenced knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>FLOW/DOC/FAQ/FAQ_DIRECT</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The ID of the referenced knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>611926</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number that corresponds one-to-one with the ReferNumber in AnswerInfo.MessageBody.DirectMessageBody.SentenceList.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The extension information specific to the knowledge type.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *             &quot;CollectedParams&quot;: {
             *               &quot;ReturnMaster&quot;: &quot;true&quot;
             *             },
             *             &quot;Edges&quot;: [],
             *             &quot;Nodes&quot;: [
             *               {
             *                 &quot;InvokedApis&quot;: [
             *                   {
             *                     &quot;ApiName&quot;: &quot;intentionRepeatCallQry&quot;
             *                   }
             *                 ],
             *                 &quot;OptionalParams&quot;: [
             *                   &quot;mobile&quot;,
             *                   &quot;intention&quot;
             *                 ],
             *                 &quot;Id&quot;: &quot;22874cb7-c253-4832-a38d-7113b15ef7fc&quot;,
             *                 &quot;RequiredParams&quot;: [],
             *                 &quot;Name&quot;: &quot;Check for repeated contacts&quot;
             *               },
             *               {
             *                 &quot;InvokedApis&quot;: [
             *                   {
             *                     &quot;ApiName&quot;: &quot;complaintAllChannelLatest&quot;
             *                   }
             *                 ],
             *                 &quot;OptionalParams&quot;: [
             *                   &quot;mobile&quot;,
             *                   &quot;billCode&quot;
             *                 ],
             *                 &quot;Id&quot;: &quot;071b082e-ce76-47f9-8b8d-f29e0dd1015c&quot;,
             *                 &quot;RequiredParams&quot;: [],
             *                 &quot;Name&quot;: &quot;Query ticket information&quot;
             *               },
             *               {
             *                 &quot;Id&quot;: &quot;db02f361-61ee-4e30-bda0-2fd62cf4ca46&quot;,
             *                 &quot;Name&quot;: &quot;Logical judgment_35a6&quot;
             *               },
             *               {
             *                 &quot;OptionalParams&quot;: [],
             *                 &quot;Id&quot;: &quot;97f68b60-2973-4d10-8e42-1cbfcbb15cf6&quot;,
             *                 &quot;RequiredParams&quot;: [
             *                   &quot;returnMaster&quot;
             *                 ],
             *                 &quot;Name&quot;: &quot;Whether to return to the main flow&quot;
             *               },
             *               {
             *                 &quot;Id&quot;: &quot;8167e4ec-a589-42de-97c2-271672b26ffe&quot;,
             *                 &quot;Name&quot;: &quot;Return to the main flow&quot;
             *               }
             *             ]
             *           }</p>
             */
            public Builder referenceExt(Object referenceExt) {
                this.referenceExt = referenceExt;
                return this;
            }

            /**
             * <p>The title of the referenced knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>Is it possible to make the payment when the contract entity and the paying entity are different?</p>
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
             * <p>The list of referenced knowledge entries.</p>
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
    public static class RtDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SentenceRtList")
        private Object sentenceRtList;

        @com.aliyun.core.annotation.NameInMap("TransitionRtList")
        private Object transitionRtList;

        private RtDetail(Builder builder) {
            this.sentenceRtList = builder.sentenceRtList;
            this.transitionRtList = builder.transitionRtList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtDetail create() {
            return builder().build();
        }

        /**
         * @return sentenceRtList
         */
        public Object getSentenceRtList() {
            return this.sentenceRtList;
        }

        /**
         * @return transitionRtList
         */
        public Object getTransitionRtList() {
            return this.transitionRtList;
        }

        public static final class Builder {
            private Object sentenceRtList; 
            private Object transitionRtList; 

            private Builder() {
            } 

            private Builder(RtDetail model) {
                this.sentenceRtList = model.sentenceRtList;
                this.transitionRtList = model.transitionRtList;
            } 

            /**
             * <p>The list of RTs for each segment from the time the user question is received on the text side to the sequential generation of the formal answer.</p>
             * 
             * <strong>example:</strong>
             * <p>[200, 256, 300, 430]</p>
             */
            public Builder sentenceRtList(Object sentenceRtList) {
                this.sentenceRtList = sentenceRtList;
                return this;
            }

            /**
             * <p>The list of RTs for each segment from the time the user question is received on the text side to the sequential generation of the transition phrases.</p>
             * 
             * <strong>example:</strong>
             * <p>[130]</p>
             */
            public Builder transitionRtList(Object transitionRtList) {
                this.transitionRtList = transitionRtList;
                return this;
            }

            public RtDetail build() {
                return new RtDetail(this);
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
             * <p>The formal answer entry.</p>
             * 
             * <strong>example:</strong>
             * <p>The weather is sunny today</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The number that corresponds one-to-one with the Number in AnswerReferenceInfo.ItemList for generating this answer.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

        @com.aliyun.core.annotation.NameInMap("HitSystemAskConfig")
        private String hitSystemAskConfig;

        @com.aliyun.core.annotation.NameInMap("RtDetail")
        private RtDetail rtDetail;

        @com.aliyun.core.annotation.NameInMap("TransitionList")
        private java.util.List<String> transitionList;

        @com.aliyun.core.annotation.NameInMap("relatedQuestionList")
        private java.util.List<String> relatedQuestionList;

        @com.aliyun.core.annotation.NameInMap("sentenceList")
        private java.util.List<SentenceList> sentenceList;

        private DirectMessageBody(Builder builder) {
            this.contentType = builder.contentType;
            this.hitSystemAskConfig = builder.hitSystemAskConfig;
            this.rtDetail = builder.rtDetail;
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
         * @return hitSystemAskConfig
         */
        public String getHitSystemAskConfig() {
            return this.hitSystemAskConfig;
        }

        /**
         * @return rtDetail
         */
        public RtDetail getRtDetail() {
            return this.rtDetail;
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
            private String hitSystemAskConfig; 
            private RtDetail rtDetail; 
            private java.util.List<String> transitionList; 
            private java.util.List<String> relatedQuestionList; 
            private java.util.List<SentenceList> sentenceList; 

            private Builder() {
            } 

            private Builder(DirectMessageBody model) {
                this.contentType = model.contentType;
                this.hitSystemAskConfig = model.hitSystemAskConfig;
                this.rtDetail = model.rtDetail;
                this.transitionList = model.transitionList;
                this.relatedQuestionList = model.relatedQuestionList;
                this.sentenceList = model.sentenceList;
            } 

            /**
             * <p>The answer type.</p>
             * 
             * <strong>example:</strong>
             * <p>RICH_TEXT/PLAIN_TEXT</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The matched system Q&amp;A policy.</p>
             * 
             * <strong>example:</strong>
             * <p>SENSITIVE_WORD/NO_ANSWER/COMMANDS</p>
             */
            public Builder hitSystemAskConfig(String hitSystemAskConfig) {
                this.hitSystemAskConfig = hitSystemAskConfig;
                return this;
            }

            /**
             * <p>The response time (RT) debugging information for the current Q&amp;A.</p>
             */
            public Builder rtDetail(RtDetail rtDetail) {
                this.rtDetail = rtDetail;
                return this;
            }

            /**
             * <p>The list of transition phrases.</p>
             */
            public Builder transitionList(java.util.List<String> transitionList) {
                this.transitionList = transitionList;
                return this;
            }

            /**
             * <p>The list of similar questions.</p>
             */
            public Builder relatedQuestionList(java.util.List<String> relatedQuestionList) {
                this.relatedQuestionList = relatedQuestionList;
                return this;
            }

            /**
             * <p>The list of formal answers.</p>
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
             * <p>The command parameters, such as the skill group for the transfer-to-agent command.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;SysToAgent&quot;: &quot;{\&quot;skillGroup\&quot;:\&quot;\&quot;,\&quot;ext\&quot;:\&quot;\&quot;,\&quot;toAgentReason\&quot;:\&quot;HitKeywords\&quot;}&quot;
             *       }</p>
             */
            public Builder commands(Object commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The message body that contains the Q&amp;A results, including the answer, text type, recommended questions, and matched system type.</p>
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
             * <p>The referenced knowledge information of the matched answer.</p>
             */
            public Builder answerReferenceInfo(AnswerReferenceInfo answerReferenceInfo) {
                this.answerReferenceInfo = answerReferenceInfo;
                return this;
            }

            /**
             * <p>The message body.</p>
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
             * <p>The debugging input information.</p>
             * 
             * <strong>example:</strong>
             * <p>User question: Transfer to agent
             * Rule hits: [transfer] agent [customer service|service|representative]</p>
             */
            public Builder input(Object input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The policy name. Valid values:</p>
             * <ul>
             * <li>High-frequency Q&amp;A direct output</li>
             * <li>Keyword-based transfer to agent</li>
             * <li>Global sensitive words</li>
             * </ul>
             * <p>This field is available only when NodeType is system_strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>Keyword-based transfer to agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>system_strategy</strong>: system policy.</li>
             * <li><strong>rewrite_query</strong>: retrieved question.</li>
             * <li><strong>invoke_llm</strong>: LLM invocation.</li>
             * <li><strong>invoke_tools</strong>: tool calling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system_strategy</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The output information.</p>
             * 
             * <strong>example:</strong>
             * <p>commands:{&quot;sysToAgent&quot;:&quot;{\&quot;skillGroup\&quot;:\&quot;\&quot;,\&quot;ext\&quot;:\&quot;\&quot;,\&quot;toAgentReason\&quot;:\&quot;HitKeywords\&quot;}&quot;}
             * response:Transferring you to a human agent</p>
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

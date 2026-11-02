// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListAIAgentDialoguesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIAgentDialoguesResponseBody</p>
 */
public class ListAIAgentDialoguesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dialogues")
    private java.util.List<Dialogues> dialogues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIAgentDialoguesResponseBody(Builder builder) {
        this.dialogues = builder.dialogues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentDialoguesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogues
     */
    public java.util.List<Dialogues> getDialogues() {
        return this.dialogues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Dialogues> dialogues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIAgentDialoguesResponseBody model) {
            this.dialogues = model.dialogues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of dialogue records.</p>
         */
        public Builder dialogues(java.util.List<Dialogues> dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B117AF5-***************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIAgentDialoguesResponseBody build() {
            return new ListAIAgentDialoguesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIAgentDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentDialoguesResponseBody</p>
     */
    public static class AttachedFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private AttachedFileList(Builder builder) {
            this.format = builder.format;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedFileList create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String format; 
            private String id; 
            private String name; 
            private Integer type; 
            private String url; 

            private Builder() {
            } 

            private Builder(AttachedFileList model) {
                this.format = model.format;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The format of the attachment, such as mp3, wav, or pdf.</p>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The unique identifier of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>7B117AF5-***************</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The file name of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>MusicDemix</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The attachment type. This is a numeric value whose specific meaning is defined by the business.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://media.w3.org/2010/05/sintel/trailer.mp3">https://media.w3.org/2010/05/sintel/trailer.mp3</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AttachedFileList build() {
                return new AttachedFileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIAgentDialoguesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentDialoguesResponseBody</p>
     */
    public static class Dialogues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedFileList")
        private java.util.List<AttachedFileList> attachedFileList;

        @com.aliyun.core.annotation.NameInMap("DialogueId")
        private String dialogueId;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Producer")
        private String producer;

        @com.aliyun.core.annotation.NameInMap("ReasoningText")
        private String reasoningText;

        @com.aliyun.core.annotation.NameInMap("RoundId")
        private String roundId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Dialogues(Builder builder) {
            this.attachedFileList = builder.attachedFileList;
            this.dialogueId = builder.dialogueId;
            this.extend = builder.extend;
            this.nodeId = builder.nodeId;
            this.producer = builder.producer;
            this.reasoningText = builder.reasoningText;
            this.roundId = builder.roundId;
            this.source = builder.source;
            this.text = builder.text;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogues create() {
            return builder().build();
        }

        /**
         * @return attachedFileList
         */
        public java.util.List<AttachedFileList> getAttachedFileList() {
            return this.attachedFileList;
        }

        /**
         * @return dialogueId
         */
        public String getDialogueId() {
            return this.dialogueId;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return producer
         */
        public String getProducer() {
            return this.producer;
        }

        /**
         * @return reasoningText
         */
        public String getReasoningText() {
            return this.reasoningText;
        }

        /**
         * @return roundId
         */
        public String getRoundId() {
            return this.roundId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<AttachedFileList> attachedFileList; 
            private String dialogueId; 
            private String extend; 
            private String nodeId; 
            private String producer; 
            private String reasoningText; 
            private String roundId; 
            private String source; 
            private String text; 
            private Long time; 
            private String type; 

            private Builder() {
            } 

            private Builder(Dialogues model) {
                this.attachedFileList = model.attachedFileList;
                this.dialogueId = model.dialogueId;
                this.extend = model.extend;
                this.nodeId = model.nodeId;
                this.producer = model.producer;
                this.reasoningText = model.reasoningText;
                this.roundId = model.roundId;
                this.source = model.source;
                this.text = model.text;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * <p>The list of attached files. The information about file attachments referenced in the dialogue.</p>
             */
            public Builder attachedFileList(java.util.List<AttachedFileList> attachedFileList) {
                this.attachedFileList = attachedFileList;
                return this;
            }

            /**
             * <p>The unique ID of the dialogue.</p>
             * 
             * <strong>example:</strong>
             * <p>19de81b3b3d94abda22****</p>
             */
            public Builder dialogueId(String dialogueId) {
                this.dialogueId = dialogueId;
                return this;
            }

            /**
             * <p>The extended information. A JSON-formatted extension field used to store additional custom data, such as sentiment tags and intent recognition results.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;addTransferLock\&quot;:true}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The node ID. Identifies the flow node that generated the dialogue and is used to trace the processing node that produced the dialogue.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-to345ikn62o</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The producer of the message. Valid values:</p>
             * <ul>
             * <li><p>user: The message is generated by the user.</p>
             * </li>
             * <li><p>agent: The message is generated by the agent.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder producer(String producer) {
                this.producer = producer;
                return this;
            }

            /**
             * <p>The deep thinking text.</p>
             * 
             * <strong>example:</strong>
             * <p>I am thinking</p>
             */
            public Builder reasoningText(String reasoningText) {
                this.reasoningText = reasoningText;
                return this;
            }

            /**
             * <p>The dialogue round ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f27f9b9be28642a88e18****</p>
             */
            public Builder roundId(String roundId) {
                this.roundId = roundId;
                return this;
            }

            /**
             * <p>The source of the message. Valid values:</p>
             * <ul>
             * <li><p>chat: Text dialogue.</p>
             * </li>
             * <li><p>call: Voice call.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>chat</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The text content of the dialogue.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the dialogue was generated, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1734511087000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the message. Valid values:</p>
             * <p>Voice call:</p>
             * <ol>
             * <li>greeting: Welcome message.</li>
             * <li>normal: Voice reply.</li>
             * <li>speech: Proactive broadcast.</li>
             * </ol>
             * <p>Text dialogue:</p>
             * <ol>
             * <li>normal: Text reply.</li>
             * <li>announcement: Proactive text push.</li>
             * <li>custom: Custom message.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>announcement</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Dialogues build() {
                return new Dialogues(this);
            } 

        } 

    }
}

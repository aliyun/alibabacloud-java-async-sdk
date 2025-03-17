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
         * Dialogues.
         */
        public Builder dialogues(java.util.List<Dialogues> dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * RequestId.
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
    public static class Dialogues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialogueId")
        private String dialogueId;

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
            this.dialogueId = builder.dialogueId;
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
         * @return dialogueId
         */
        public String getDialogueId() {
            return this.dialogueId;
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
            private String dialogueId; 
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
                this.dialogueId = model.dialogueId;
                this.producer = model.producer;
                this.reasoningText = model.reasoningText;
                this.roundId = model.roundId;
                this.source = model.source;
                this.text = model.text;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * DialogueId.
             */
            public Builder dialogueId(String dialogueId) {
                this.dialogueId = dialogueId;
                return this;
            }

            /**
             * Producer.
             */
            public Builder producer(String producer) {
                this.producer = producer;
                return this;
            }

            /**
             * ReasoningText.
             */
            public Builder reasoningText(String reasoningText) {
                this.reasoningText = reasoningText;
                return this;
            }

            /**
             * RoundId.
             */
            public Builder roundId(String roundId) {
                this.roundId = roundId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
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

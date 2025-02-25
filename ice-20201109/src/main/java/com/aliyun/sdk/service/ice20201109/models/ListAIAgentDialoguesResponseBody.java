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

        @com.aliyun.core.annotation.NameInMap("RoundId")
        private String roundId;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private Dialogues(Builder builder) {
            this.dialogueId = builder.dialogueId;
            this.producer = builder.producer;
            this.roundId = builder.roundId;
            this.text = builder.text;
            this.time = builder.time;
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
         * @return roundId
         */
        public String getRoundId() {
            return this.roundId;
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

        public static final class Builder {
            private String dialogueId; 
            private String producer; 
            private String roundId; 
            private String text; 
            private Long time; 

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
             * RoundId.
             */
            public Builder roundId(String roundId) {
                this.roundId = roundId;
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

            public Dialogues build() {
                return new Dialogues(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConversationDetailsResponseBody</p>
 */
public class ListConversationDetailsResponseBody extends TeaModel {
    @NameInMap("ConversationDetails")
    private java.util.List < ConversationDetails> conversationDetails;

    @NameInMap("RequestId")
    private String requestId;

    private ListConversationDetailsResponseBody(Builder builder) {
        this.conversationDetails = builder.conversationDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConversationDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return conversationDetails
     */
    public java.util.List < ConversationDetails> getConversationDetails() {
        return this.conversationDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConversationDetails> conversationDetails; 
        private String requestId; 

        /**
         * ConversationDetails.
         */
        public Builder conversationDetails(java.util.List < ConversationDetails> conversationDetails) {
            this.conversationDetails = conversationDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConversationDetailsResponseBody build() {
            return new ListConversationDetailsResponseBody(this);
        } 

    } 

    public static class ConversationDetails extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionParams")
        private String actionParams;

        @NameInMap("ConversationId")
        private String conversationId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("SequenceId")
        private String sequenceId;

        @NameInMap("Speaker")
        private String speaker;

        @NameInMap("Utterance")
        private String utterance;

        private ConversationDetails(Builder builder) {
            this.action = builder.action;
            this.actionParams = builder.actionParams;
            this.conversationId = builder.conversationId;
            this.createTime = builder.createTime;
            this.sequenceId = builder.sequenceId;
            this.speaker = builder.speaker;
            this.utterance = builder.utterance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationDetails create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionParams
         */
        public String getActionParams() {
            return this.actionParams;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        /**
         * @return utterance
         */
        public String getUtterance() {
            return this.utterance;
        }

        public static final class Builder {
            private String action; 
            private String actionParams; 
            private String conversationId; 
            private Long createTime; 
            private String sequenceId; 
            private String speaker; 
            private String utterance; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionParams.
             */
            public Builder actionParams(String actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * ConversationId.
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * SequenceId.
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * Speaker.
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * Utterance.
             */
            public Builder utterance(String utterance) {
                this.utterance = utterance;
                return this;
            }

            public ConversationDetails build() {
                return new ConversationDetails(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ListConversationDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConversationDetailsResponseBody</p>
 */
public class ListConversationDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConversationDetails")
    private java.util.List<ConversationDetails> conversationDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationDetails
     */
    public java.util.List<ConversationDetails> getConversationDetails() {
        return this.conversationDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConversationDetails> conversationDetails; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConversationDetailsResponseBody model) {
            this.conversationDetails = model.conversationDetails;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of conversation details.</p>
         */
        public Builder conversationDetails(java.util.List<ConversationDetails> conversationDetails) {
            this.conversationDetails = conversationDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConversationDetailsResponseBody build() {
            return new ListConversationDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConversationDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConversationDetailsResponseBody</p>
     */
    public static class ConversationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionParams")
        private String actionParams;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("Utterance")
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

            private Builder() {
            } 

            private Builder(ConversationDetails model) {
                this.action = model.action;
                this.actionParams = model.actionParams;
                this.conversationId = model.conversationId;
                this.createTime = model.createTime;
                this.sequenceId = model.sequenceId;
                this.speaker = model.speaker;
                this.utterance = model.utterance;
            } 

            /**
             * <p>The action performed during the turn.</p>
             * 
             * <strong>example:</strong>
             * <p>Dialogue</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The action parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder actionParams(String actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * <p>The conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1582266750353</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The sequence ID of the conversational turn.</p>
             * 
             * <strong>example:</strong>
             * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * <p>The speaker. Valid values: <code>customer</code> and <code>chatbot</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Chatbot</p>
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            /**
             * <p>The speaker\&quot;s utterance.</p>
             * 
             * <strong>example:</strong>
             * <p>你好</p>
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

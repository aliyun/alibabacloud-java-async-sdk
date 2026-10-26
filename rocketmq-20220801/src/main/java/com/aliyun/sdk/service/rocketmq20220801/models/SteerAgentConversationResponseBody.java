// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link SteerAgentConversationResponseBody} extends {@link TeaModel}
 *
 * <p>SteerAgentConversationResponseBody</p>
 */
public class SteerAgentConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accepted")
    private Boolean accepted;

    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    private SteerAgentConversationResponseBody(Builder builder) {
        this.accepted = builder.accepted;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SteerAgentConversationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accepted
     */
    public Boolean getAccepted() {
        return this.accepted;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder {
        private Boolean accepted; 
        private String messageId; 

        private Builder() {
        } 

        private Builder(SteerAgentConversationResponseBody model) {
            this.accepted = model.accepted;
            this.messageId = model.messageId;
        } 

        /**
         * accepted.
         */
        public Builder accepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }

        /**
         * messageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public SteerAgentConversationResponseBody build() {
            return new SteerAgentConversationResponseBody(this);
        } 

    } 

}

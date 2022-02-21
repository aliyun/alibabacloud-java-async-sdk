// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConversationLogsResponseBody</p>
 */
public class ListConversationLogsResponseBody extends TeaModel {
    @NameInMap("ChatLogs")
    private java.util.List < java.util.Map<String, ?>> chatLogs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rounds")
    private Long rounds;

    private ListConversationLogsResponseBody(Builder builder) {
        this.chatLogs = builder.chatLogs;
        this.requestId = builder.requestId;
        this.rounds = builder.rounds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConversationLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return chatLogs
     */
    public java.util.List < java.util.Map<String, ?>> getChatLogs() {
        return this.chatLogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rounds
     */
    public Long getRounds() {
        return this.rounds;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, ?>> chatLogs; 
        private String requestId; 
        private Long rounds; 

        /**
         * ChatLogs.
         */
        public Builder chatLogs(java.util.List < java.util.Map<String, ?>> chatLogs) {
            this.chatLogs = chatLogs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rounds.
         */
        public Builder rounds(Long rounds) {
            this.rounds = rounds;
            return this;
        }

        public ListConversationLogsResponseBody build() {
            return new ListConversationLogsResponseBody(this);
        } 

    } 

}

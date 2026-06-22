// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>KopilotListConversationChatMessagesResponseBody</p>
 */
public class KopilotListConversationChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private KopilotListConversationChatMessagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationChatMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(KopilotListConversationChatMessagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public KopilotListConversationChatMessagesResponseBody build() {
            return new KopilotListConversationChatMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TurnId")
        private String turnId;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.feedback = builder.feedback;
            this.role = builder.role;
            this.turnId = builder.turnId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return turnId
         */
        public String getTurnId() {
            return this.turnId;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String feedback; 
            private String role; 
            private String turnId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.feedback = model.feedback;
                this.role = model.role;
                this.turnId = model.turnId;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * TurnId.
             */
            public Builder turnId(String turnId) {
                this.turnId = turnId;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationChatMessagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("NextBeforeTurnId")
        private Long nextBeforeTurnId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TotalTurns")
        private Long totalTurns;

        private Data(Builder builder) {
            this.hasMore = builder.hasMore;
            this.messages = builder.messages;
            this.nextBeforeTurnId = builder.nextBeforeTurnId;
            this.sessionId = builder.sessionId;
            this.totalTurns = builder.totalTurns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return nextBeforeTurnId
         */
        public Long getNextBeforeTurnId() {
            return this.nextBeforeTurnId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return totalTurns
         */
        public Long getTotalTurns() {
            return this.totalTurns;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<Messages> messages; 
            private Long nextBeforeTurnId; 
            private String sessionId; 
            private Long totalTurns; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hasMore = model.hasMore;
                this.messages = model.messages;
                this.nextBeforeTurnId = model.nextBeforeTurnId;
                this.sessionId = model.sessionId;
                this.totalTurns = model.totalTurns;
            } 

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * NextBeforeTurnId.
             */
            public Builder nextBeforeTurnId(Long nextBeforeTurnId) {
                this.nextBeforeTurnId = nextBeforeTurnId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * TotalTurns.
             */
            public Builder totalTurns(Long totalTurns) {
                this.totalTurns = totalTurns;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DigitalHumanLiveBroadcastQACmd} extends {@link TeaModel}
 *
 * <p>DigitalHumanLiveBroadcastQACmd</p>
 */
public class DigitalHumanLiveBroadcastQACmd extends TeaModel {
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @NameInMap("history")
    private java.util.List < History> history;

    @NameInMap("question")
    @Validation(required = true)
    private String question;

    @NameInMap("sessionId")
    private String sessionId;

    @NameInMap("stream")
    private Boolean stream;

    @NameInMap("subAccountId")
    private String subAccountId;

    private DigitalHumanLiveBroadcastQACmd(Builder builder) {
        this.accountId = builder.accountId;
        this.history = builder.history;
        this.question = builder.question;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DigitalHumanLiveBroadcastQACmd create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return history
     */
    public java.util.List < History> getHistory() {
        return this.history;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder {
        private String accountId; 
        private java.util.List < History> history; 
        private String question; 
        private String sessionId; 
        private Boolean stream; 
        private String subAccountId; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * history.
         */
        public Builder history(java.util.List < History> history) {
            this.history = history;
            return this;
        }

        /**
         * question.
         */
        public Builder question(String question) {
            this.question = question;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.stream = stream;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }

        public DigitalHumanLiveBroadcastQACmd build() {
            return new DigitalHumanLiveBroadcastQACmd(this);
        } 

    } 

    public static class History extends TeaModel {
        @NameInMap("bot")
        @Validation(required = true)
        private String bot;

        @NameInMap("user")
        @Validation(required = true)
        private String user;

        private History(Builder builder) {
            this.bot = builder.bot;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return bot
         */
        public String getBot() {
            return this.bot;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String bot; 
            private String user; 

            /**
             * bot.
             */
            public Builder bot(String bot) {
                this.bot = bot;
                return this;
            }

            /**
             * user.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
}

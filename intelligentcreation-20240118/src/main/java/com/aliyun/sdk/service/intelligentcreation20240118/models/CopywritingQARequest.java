// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopywritingQARequest} extends {@link RequestModel}
 *
 * <p>CopywritingQARequest</p>
 */
public class CopywritingQARequest extends Request {
    @Query
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("histories")
    private java.util.List < Histories> histories;

    @Query
    @NameInMap("history")
    @Deprecated
    private History history;

    @Query
    @NameInMap("question")
    @Validation(required = true)
    private String question;

    @Query
    @NameInMap("sessionId")
    private String sessionId;

    @Query
    @NameInMap("stream")
    private Boolean stream;

    @Query
    @NameInMap("subAccountId")
    private String subAccountId;

    private CopywritingQARequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.histories = builder.histories;
        this.history = builder.history;
        this.question = builder.question;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopywritingQARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return histories
     */
    public java.util.List < Histories> getHistories() {
        return this.histories;
    }

    /**
     * @return history
     */
    public History getHistory() {
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

    public static final class Builder extends Request.Builder<CopywritingQARequest, Builder> {
        private String accountId; 
        private java.util.List < Histories> histories; 
        private History history; 
        private String question; 
        private String sessionId; 
        private Boolean stream; 
        private String subAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CopywritingQARequest request) {
            super(request);
            this.accountId = request.accountId;
            this.histories = request.histories;
            this.history = request.history;
            this.question = request.question;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.subAccountId = request.subAccountId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * histories.
         */
        public Builder histories(java.util.List < Histories> histories) {
            String historiesShrink = shrink(histories, "histories", "json");
            this.putQueryParameter("histories", historiesShrink);
            this.histories = histories;
            return this;
        }

        /**
         * history.
         */
        public Builder history(History history) {
            String historyShrink = shrink(history, "history", "json");
            this.putQueryParameter("history", historyShrink);
            this.history = history;
            return this;
        }

        /**
         * question.
         */
        public Builder question(String question) {
            this.putQueryParameter("question", question);
            this.question = question;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putQueryParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.putQueryParameter("subAccountId", subAccountId);
            this.subAccountId = subAccountId;
            return this;
        }

        @Override
        public CopywritingQARequest build() {
            return new CopywritingQARequest(this);
        } 

    } 

    public static class Histories extends TeaModel {
        @NameInMap("bot")
        @Validation(required = true)
        private String bot;

        @NameInMap("user")
        @Validation(required = true)
        private String user;

        private Histories(Builder builder) {
            this.bot = builder.bot;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
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

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
    public static class History extends TeaModel {
        @NameInMap("bot")
        private String bot;

        @NameInMap("user")
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

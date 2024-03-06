// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBulletQuestionsRequest} extends {@link RequestModel}
 *
 * <p>SubmitBulletQuestionsRequest</p>
 */
public class SubmitBulletQuestionsRequest extends Request {
    @Query
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("questions")
    @Validation(required = true)
    private java.util.List < Questions> questions;

    @Query
    @NameInMap("roomId")
    private String roomId;

    @Query
    @NameInMap("subAccountId")
    private String subAccountId;

    private SubmitBulletQuestionsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.questions = builder.questions;
        this.roomId = builder.roomId;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBulletQuestionsRequest create() {
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
     * @return questions
     */
    public java.util.List < Questions> getQuestions() {
        return this.questions;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder extends Request.Builder<SubmitBulletQuestionsRequest, Builder> {
        private String accountId; 
        private java.util.List < Questions> questions; 
        private String roomId; 
        private String subAccountId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitBulletQuestionsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.questions = request.questions;
            this.roomId = request.roomId;
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
         * questions
         */
        public Builder questions(java.util.List < Questions> questions) {
            String questionsShrink = shrink(questions, "questions", "json");
            this.putQueryParameter("questions", questionsShrink);
            this.questions = questions;
            return this;
        }

        /**
         * roomId.
         */
        public Builder roomId(String roomId) {
            this.putQueryParameter("roomId", roomId);
            this.roomId = roomId;
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
        public SubmitBulletQuestionsRequest build() {
            return new SubmitBulletQuestionsRequest(this);
        } 

    } 

    public static class Questions extends TeaModel {
        @NameInMap("content")
        @Validation(required = true)
        private String content;

        @NameInMap("id")
        @Validation(required = true)
        private String id;

        @NameInMap("username")
        private String username;

        private Questions(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Questions create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String content; 
            private String id; 
            private String username; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Questions build() {
                return new Questions(this);
            } 

        } 

    }
}

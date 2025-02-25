// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBulletQuestionsCmd} extends {@link TeaModel}
 *
 * <p>SubmitBulletQuestionsCmd</p>
 */
public class SubmitBulletQuestionsCmd extends TeaModel {
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @NameInMap("questions")
    @Validation(required = true)
    private java.util.List < Questions> questions;

    @NameInMap("roomId")
    private String roomId;

    @NameInMap("subAccountId")
    private String subAccountId;

    private SubmitBulletQuestionsCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.questions = builder.questions;
        this.roomId = builder.roomId;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBulletQuestionsCmd create() {
        return builder().build();
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

    public static final class Builder {
        private String accountId; 
        private java.util.List < Questions> questions; 
        private String roomId; 
        private String subAccountId; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * questions.
         */
        public Builder questions(java.util.List < Questions> questions) {
            this.questions = questions;
            return this;
        }

        /**
         * roomId.
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.subAccountId = subAccountId;
            return this;
        }

        public SubmitBulletQuestionsCmd build() {
            return new SubmitBulletQuestionsCmd(this);
        } 

    } 

    public static class Questions extends TeaModel {
        @NameInMap("content")
        @Validation(required = true)
        private String content;

        @NameInMap("id")
        @Validation(required = true)
        private String id;

        @NameInMap("time")
        @Validation(required = true)
        private Long time;

        @NameInMap("username")
        private String username;

        private Questions(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.time = builder.time;
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
         * @return time
         */
        public Long getTime() {
            return this.time;
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
            private Long time; 
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
             * time.
             */
            public Builder time(Long time) {
                this.time = time;
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

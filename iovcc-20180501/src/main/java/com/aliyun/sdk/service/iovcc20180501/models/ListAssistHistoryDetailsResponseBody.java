// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistHistoryDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssistHistoryDetailsResponseBody</p>
 */
public class ListAssistHistoryDetailsResponseBody extends TeaModel {
    @NameInMap("Actions")
    private java.util.List < Actions> actions;

    @NameInMap("RequestId")
    private String requestId;

    private ListAssistHistoryDetailsResponseBody(Builder builder) {
        this.actions = builder.actions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistHistoryDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return actions
     */
    public java.util.List < Actions> getActions() {
        return this.actions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Actions> actions; 
        private String requestId; 

        /**
         * Actions.
         */
        public Builder actions(java.util.List < Actions> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssistHistoryDetailsResponseBody build() {
            return new ListAssistHistoryDetailsResponseBody(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("AssistId")
        private String assistId;

        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("ID")
        private String ID;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("UpdatedAt")
        private Long updatedAt;

        private Actions(Builder builder) {
            this.action = builder.action;
            this.assistId = builder.assistId;
            this.createdAt = builder.createdAt;
            this.ID = builder.ID;
            this.timestamp = builder.timestamp;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return assistId
         */
        public String getAssistId() {
            return this.assistId;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return ID
         */
        public String getID() {
            return this.ID;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String action; 
            private String assistId; 
            private Long createdAt; 
            private String ID; 
            private String timestamp; 
            private Long updatedAt; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AssistId.
             */
            public Builder assistId(String assistId) {
                this.assistId = assistId;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * ID.
             */
            public Builder ID(String ID) {
                this.ID = ID;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}

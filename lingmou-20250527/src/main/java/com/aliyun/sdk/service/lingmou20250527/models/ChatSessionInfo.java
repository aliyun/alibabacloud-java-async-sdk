// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link ChatSessionInfo} extends {@link TeaModel}
 *
 * <p>ChatSessionInfo</p>
 */
public class ChatSessionInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("mainAccountId")
    private Long mainAccountId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private ChatSessionInfo(Builder builder) {
        this.createdAt = builder.createdAt;
        this.mainAccountId = builder.mainAccountId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatSessionInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return mainAccountId
     */
    public Long getMainAccountId() {
        return this.mainAccountId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private Long createdAt; 
        private Long mainAccountId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(ChatSessionInfo model) {
            this.createdAt = model.createdAt;
            this.mainAccountId = model.mainAccountId;
            this.sessionId = model.sessionId;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * mainAccountId.
         */
        public Builder mainAccountId(Long mainAccountId) {
            this.mainAccountId = mainAccountId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public ChatSessionInfo build() {
            return new ChatSessionInfo(this);
        } 

    } 

}

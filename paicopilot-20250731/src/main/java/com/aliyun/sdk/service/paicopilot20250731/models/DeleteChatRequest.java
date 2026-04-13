// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link DeleteChatRequest} extends {@link RequestModel}
 *
 * <p>DeleteChatRequest</p>
 */
public class DeleteChatRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    private DeleteChatRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.chatId = builder.chatId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    public static final class Builder extends Request.Builder<DeleteChatRequest, Builder> {
        private String sessionId; 
        private String chatId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChatRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.chatId = request.chatId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>se-dss******</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.putPathParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        @Override
        public DeleteChatRequest build() {
            return new DeleteChatRequest(this);
        } 

    } 

}

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
 * {@link GetChatRequest} extends {@link RequestModel}
 *
 * <p>GetChatRequest</p>
 */
public class GetChatRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ChatId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private String verbose;

    private GetChatRequest(Builder builder) {
        super(builder);
        this.chatId = builder.chatId;
        this.sessionId = builder.sessionId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return verbose
     */
    public String getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetChatRequest, Builder> {
        private String chatId; 
        private String sessionId; 
        private String verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetChatRequest request) {
            super(request);
            this.chatId = request.chatId;
            this.sessionId = request.sessionId;
            this.verbose = request.verbose;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-jkd******</p>
         */
        public Builder chatId(String chatId) {
            this.putPathParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
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
         * Verbose.
         */
        public Builder verbose(String verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetChatRequest build() {
            return new GetChatRequest(this);
        } 

    } 

}

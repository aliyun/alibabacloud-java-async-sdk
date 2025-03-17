// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteAIAgentDialogueRequest} extends {@link RequestModel}
 *
 * <p>DeleteAIAgentDialogueRequest</p>
 */
public class DeleteAIAgentDialogueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private DeleteAIAgentDialogueRequest(Builder builder) {
        super(builder);
        this.dialogueId = builder.dialogueId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIAgentDialogueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogueId
     */
    public String getDialogueId() {
        return this.dialogueId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DeleteAIAgentDialogueRequest, Builder> {
        private String dialogueId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAIAgentDialogueRequest request) {
            super(request);
            this.dialogueId = request.dialogueId;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18*******</p>
         */
        public Builder dialogueId(String dialogueId) {
            this.putQueryParameter("DialogueId", dialogueId);
            this.dialogueId = dialogueId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6d594e7f55624c47a48789******</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DeleteAIAgentDialogueRequest build() {
            return new DeleteAIAgentDialogueRequest(this);
        } 

    } 

}

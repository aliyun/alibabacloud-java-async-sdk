// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>DeleteDialogueFlowRequest</p>
 */
public class DeleteDialogueFlowRequest extends Request {
    @Query
    @NameInMap("DialogueFlowId")
    @Validation(required = true)
    private String dialogueFlowId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private DeleteDialogueFlowRequest(Builder builder) {
        super(builder);
        this.dialogueFlowId = builder.dialogueFlowId;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDialogueFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogueFlowId
     */
    public String getDialogueFlowId() {
        return this.dialogueFlowId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<DeleteDialogueFlowRequest, Builder> {
        private String dialogueFlowId; 
        private String instanceId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDialogueFlowRequest request) {
            super(request);
            this.dialogueFlowId = request.dialogueFlowId;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
        } 

        /**
         * DialogueFlowId.
         */
        public Builder dialogueFlowId(String dialogueFlowId) {
            this.putQueryParameter("DialogueFlowId", dialogueFlowId);
            this.dialogueFlowId = dialogueFlowId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public DeleteDialogueFlowRequest build() {
            return new DeleteDialogueFlowRequest(this);
        } 

    } 

}

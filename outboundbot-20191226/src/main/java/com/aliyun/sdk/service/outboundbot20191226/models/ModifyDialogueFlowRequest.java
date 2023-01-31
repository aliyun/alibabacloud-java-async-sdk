// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>ModifyDialogueFlowRequest</p>
 */
public class ModifyDialogueFlowRequest extends Request {
    @Query
    @NameInMap("DialogueFlowDefinition")
    @Validation(required = true)
    private String dialogueFlowDefinition;

    @Query
    @NameInMap("DialogueFlowId")
    @Validation(required = true)
    private String dialogueFlowId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsDrafted")
    private Boolean isDrafted;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private ModifyDialogueFlowRequest(Builder builder) {
        super(builder);
        this.dialogueFlowDefinition = builder.dialogueFlowDefinition;
        this.dialogueFlowId = builder.dialogueFlowId;
        this.instanceId = builder.instanceId;
        this.isDrafted = builder.isDrafted;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDialogueFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogueFlowDefinition
     */
    public String getDialogueFlowDefinition() {
        return this.dialogueFlowDefinition;
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
     * @return isDrafted
     */
    public Boolean getIsDrafted() {
        return this.isDrafted;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<ModifyDialogueFlowRequest, Builder> {
        private String dialogueFlowDefinition; 
        private String dialogueFlowId; 
        private String instanceId; 
        private Boolean isDrafted; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDialogueFlowRequest request) {
            super(request);
            this.dialogueFlowDefinition = request.dialogueFlowDefinition;
            this.dialogueFlowId = request.dialogueFlowId;
            this.instanceId = request.instanceId;
            this.isDrafted = request.isDrafted;
            this.scriptId = request.scriptId;
        } 

        /**
         * DialogueFlowDefinition.
         */
        public Builder dialogueFlowDefinition(String dialogueFlowDefinition) {
            this.putQueryParameter("DialogueFlowDefinition", dialogueFlowDefinition);
            this.dialogueFlowDefinition = dialogueFlowDefinition;
            return this;
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
         * IsDrafted.
         */
        public Builder isDrafted(Boolean isDrafted) {
            this.putQueryParameter("IsDrafted", isDrafted);
            this.isDrafted = isDrafted;
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
        public ModifyDialogueFlowRequest build() {
            return new ModifyDialogueFlowRequest(this);
        } 

    } 

}

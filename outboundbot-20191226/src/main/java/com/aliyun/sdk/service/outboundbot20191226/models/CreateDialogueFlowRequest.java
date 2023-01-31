// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateDialogueFlowRequest</p>
 */
public class CreateDialogueFlowRequest extends Request {
    @Query
    @NameInMap("DialogueFlowType")
    @Validation(required = true)
    private String dialogueFlowType;

    @Query
    @NameInMap("DialogueName")
    @Validation(required = true)
    private String dialogueName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private CreateDialogueFlowRequest(Builder builder) {
        super(builder);
        this.dialogueFlowType = builder.dialogueFlowType;
        this.dialogueName = builder.dialogueName;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDialogueFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogueFlowType
     */
    public String getDialogueFlowType() {
        return this.dialogueFlowType;
    }

    /**
     * @return dialogueName
     */
    public String getDialogueName() {
        return this.dialogueName;
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

    public static final class Builder extends Request.Builder<CreateDialogueFlowRequest, Builder> {
        private String dialogueFlowType; 
        private String dialogueName; 
        private String instanceId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDialogueFlowRequest request) {
            super(request);
            this.dialogueFlowType = request.dialogueFlowType;
            this.dialogueName = request.dialogueName;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
        } 

        /**
         * DialogueFlowType.
         */
        public Builder dialogueFlowType(String dialogueFlowType) {
            this.putQueryParameter("DialogueFlowType", dialogueFlowType);
            this.dialogueFlowType = dialogueFlowType;
            return this;
        }

        /**
         * DialogueName.
         */
        public Builder dialogueName(String dialogueName) {
            this.putQueryParameter("DialogueName", dialogueName);
            this.dialogueName = dialogueName;
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
        public CreateDialogueFlowRequest build() {
            return new CreateDialogueFlowRequest(this);
        } 

    } 

}

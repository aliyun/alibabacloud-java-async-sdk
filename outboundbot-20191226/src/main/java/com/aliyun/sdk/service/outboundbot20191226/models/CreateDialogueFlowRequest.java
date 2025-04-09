// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateDialogueFlowRequest</p>
 */
public class CreateDialogueFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueFlowType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueFlowType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MainFlow</p>
         */
        public Builder dialogueFlowType(String dialogueFlowType) {
            this.putQueryParameter("DialogueFlowType", dialogueFlowType);
            this.dialogueFlowType = dialogueFlowType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dialogueName(String dialogueName) {
            this.putQueryParameter("DialogueName", dialogueName);
            this.dialogueName = dialogueName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d0bf93dd-1a54-4f00-819e-c75502d38681</p>
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

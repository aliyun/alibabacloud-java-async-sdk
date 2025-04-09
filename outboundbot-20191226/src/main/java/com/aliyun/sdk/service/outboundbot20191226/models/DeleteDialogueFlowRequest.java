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
 * {@link DeleteDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>DeleteDialogueFlowRequest</p>
 */
public class DeleteDialogueFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40a1457a-d2f3-43cf-ac81-c9e14cf07d88</p>
         */
        public Builder dialogueFlowId(String dialogueFlowId) {
            this.putQueryParameter("DialogueFlowId", dialogueFlowId);
            this.dialogueFlowId = dialogueFlowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
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
         * <p>d7c28efb-47f7-4a85-a522-5038e30a0b98</p>
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

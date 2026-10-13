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
 * {@link ModifyDialogueFlowRequest} extends {@link RequestModel}
 *
 * <p>ModifyDialogueFlowRequest</p>
 */
public class ModifyDialogueFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueFlowDefinition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueFlowDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogueFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogueFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDrafted")
    private Boolean isDrafted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The dialog flow data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;transitions&quot;:[{&quot;id&quot;:&quot;a91c4023&quot;,&quot;index&quot;:1,&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;946045be&quot;,&quot;targetAnchor&quot;:0}],&quot;nodes&quot;:[{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchId&quot;:&quot;f5450420-09ab-11ea-b107-e9059c6a79d8&quot;,&quot;branchName&quot;:&quot;Initiate conversation&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134},&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;interruptible&quot;:false,&quot;nodeIndex&quot;:0,&quot;shape&quot;:&quot;start-html&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;type&quot;:&quot;start&quot;,&quot;x&quot;:180,&quot;y&quot;:134},{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;actionParams&quot;:&quot;&quot;,&quot;action&quot;:&quot;Hangup&quot;},&quot;coordinates&quot;:{&quot;x&quot;:487.65625,&quot;y&quot;:155},&quot;id&quot;:&quot;946045be&quot;,&quot;index&quot;:2,&quot;interruptible&quot;:false,&quot;labels&quot;:[],&quot;name&quot;:&quot;Function node&quot;,&quot;nodeIndex&quot;:1,&quot;questions&quot;:[&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;],&quot;script&quot;:&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;,&quot;shape&quot;:&quot;function-html&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;x&quot;:500,&quot;y&quot;:182}]}</p>
         */
        public Builder dialogueFlowDefinition(String dialogueFlowDefinition) {
            this.putQueryParameter("DialogueFlowDefinition", dialogueFlowDefinition);
            this.dialogueFlowDefinition = dialogueFlowDefinition;
            return this;
        }

        /**
         * <p>The dialog flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>390515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
         */
        public Builder dialogueFlowId(String dialogueFlowId) {
            this.putQueryParameter("DialogueFlowId", dialogueFlowId);
            this.dialogueFlowId = dialogueFlowId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether the dialog flow is in draft state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDrafted(Boolean isDrafted) {
            this.putQueryParameter("IsDrafted", isDrafted);
            this.isDrafted = isDrafted;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
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

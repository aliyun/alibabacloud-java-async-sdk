// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDialogFlowRequest} extends {@link RequestModel}
 *
 * <p>UpdateDialogFlowRequest</p>
 */
public class UpdateDialogFlowRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Body
    @NameInMap("ModuleDefinition")
    @Validation(required = true)
    private ModuleDefinition moduleDefinition;

    private UpdateDialogFlowRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dialogId = builder.dialogId;
        this.moduleDefinition = builder.moduleDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDialogFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return moduleDefinition
     */
    public ModuleDefinition getModuleDefinition() {
        return this.moduleDefinition;
    }

    public static final class Builder extends Request.Builder<UpdateDialogFlowRequest, Builder> {
        private String agentKey; 
        private Long dialogId; 
        private ModuleDefinition moduleDefinition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDialogFlowRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dialogId = request.dialogId;
            this.moduleDefinition = request.moduleDefinition;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * ModuleDefinition.
         */
        public Builder moduleDefinition(ModuleDefinition moduleDefinition) {
            String moduleDefinitionShrink = shrink(moduleDefinition, "ModuleDefinition", "json");
            this.putBodyParameter("ModuleDefinition", moduleDefinitionShrink);
            this.moduleDefinition = moduleDefinition;
            return this;
        }

        @Override
        public UpdateDialogFlowRequest build() {
            return new UpdateDialogFlowRequest(this);
        } 

    } 

    public static class ModuleDefinition extends TeaModel {
        @NameInMap("GlobalVars")
        private java.util.Map < String, ? > globalVars;

        @NameInMap("ModuleDefinition")
        private PaasProcessData moduleDefinition;

        private ModuleDefinition(Builder builder) {
            this.globalVars = builder.globalVars;
            this.moduleDefinition = builder.moduleDefinition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDefinition create() {
            return builder().build();
        }

        /**
         * @return globalVars
         */
        public java.util.Map < String, ? > getGlobalVars() {
            return this.globalVars;
        }

        /**
         * @return moduleDefinition
         */
        public PaasProcessData getModuleDefinition() {
            return this.moduleDefinition;
        }

        public static final class Builder {
            private java.util.Map < String, ? > globalVars; 
            private PaasProcessData moduleDefinition; 

            /**
             * GlobalVars.
             */
            public Builder globalVars(java.util.Map < String, ? > globalVars) {
                this.globalVars = globalVars;
                return this;
            }

            /**
             * ModuleDefinition.
             */
            public Builder moduleDefinition(PaasProcessData moduleDefinition) {
                this.moduleDefinition = moduleDefinition;
                return this;
            }

            public ModuleDefinition build() {
                return new ModuleDefinition(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntentRequest} extends {@link RequestModel}
 *
 * <p>CreateIntentRequest</p>
 */
public class CreateIntentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("IntentDefinition")
    @Validation(required = true)
    private IntentCreateDTO intentDefinition;

    private CreateIntentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dialogId = builder.dialogId;
        this.intentDefinition = builder.intentDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntentRequest create() {
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
     * @return intentDefinition
     */
    public IntentCreateDTO getIntentDefinition() {
        return this.intentDefinition;
    }

    public static final class Builder extends Request.Builder<CreateIntentRequest, Builder> {
        private String agentKey; 
        private Long dialogId; 
        private IntentCreateDTO intentDefinition; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dialogId = request.dialogId;
            this.intentDefinition = request.intentDefinition;
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
         * IntentDefinition.
         */
        public Builder intentDefinition(IntentCreateDTO intentDefinition) {
            String intentDefinitionShrink = shrink(intentDefinition, "IntentDefinition", "json");
            this.putQueryParameter("IntentDefinition", intentDefinitionShrink);
            this.intentDefinition = intentDefinition;
            return this;
        }

        @Override
        public CreateIntentRequest build() {
            return new CreateIntentRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntentRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntentRequest</p>
 */
public class UpdateIntentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("IntentDefinition")
    @Validation(required = true)
    private IntentCreateDTO intentDefinition;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private UpdateIntentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.intentDefinition = builder.intentDefinition;
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntentRequest create() {
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
     * @return intentDefinition
     */
    public IntentCreateDTO getIntentDefinition() {
        return this.intentDefinition;
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<UpdateIntentRequest, Builder> {
        private String agentKey; 
        private IntentCreateDTO intentDefinition; 
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.intentDefinition = request.intentDefinition;
            this.intentId = request.intentId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
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

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        @Override
        public UpdateIntentRequest build() {
            return new UpdateIntentRequest(this);
        } 

    } 

}

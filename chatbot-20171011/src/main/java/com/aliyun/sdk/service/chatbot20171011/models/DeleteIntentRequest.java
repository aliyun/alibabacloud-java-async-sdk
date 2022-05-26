// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntentRequest</p>
 */
public class DeleteIntentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private DeleteIntentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntentRequest create() {
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
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<DeleteIntentRequest, Builder> {
        private String agentKey; 
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
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
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        @Override
        public DeleteIntentRequest build() {
            return new DeleteIntentRequest(this);
        } 

    } 

}

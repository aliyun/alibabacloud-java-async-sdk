// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyForStreamAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>ApplyForStreamAccessTokenRequest</p>
 */
public class ApplyForStreamAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    private ApplyForStreamAccessTokenRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyForStreamAccessTokenRequest create() {
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

    public static final class Builder extends Request.Builder<ApplyForStreamAccessTokenRequest, Builder> {
        private String agentKey; 

        private Builder() {
            super();
        } 

        private Builder(ApplyForStreamAccessTokenRequest request) {
            super(request);
            this.agentKey = request.agentKey;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        @Override
        public ApplyForStreamAccessTokenRequest build() {
            return new ApplyForStreamAccessTokenRequest(this);
        } 

    } 

}

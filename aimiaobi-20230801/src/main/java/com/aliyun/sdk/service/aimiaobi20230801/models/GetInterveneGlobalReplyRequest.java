// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterveneGlobalReplyRequest} extends {@link RequestModel}
 *
 * <p>GetInterveneGlobalReplyRequest</p>
 */
public class GetInterveneGlobalReplyRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    private GetInterveneGlobalReplyRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterveneGlobalReplyRequest create() {
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

    public static final class Builder extends Request.Builder<GetInterveneGlobalReplyRequest, Builder> {
        private String agentKey; 

        private Builder() {
            super();
        } 

        private Builder(GetInterveneGlobalReplyRequest request) {
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
        public GetInterveneGlobalReplyRequest build() {
            return new GetInterveneGlobalReplyRequest(this);
        } 

    } 

}

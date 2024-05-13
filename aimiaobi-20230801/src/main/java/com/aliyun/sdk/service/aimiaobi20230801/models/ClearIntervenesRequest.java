// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearIntervenesRequest} extends {@link RequestModel}
 *
 * <p>ClearIntervenesRequest</p>
 */
public class ClearIntervenesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    private ClearIntervenesRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearIntervenesRequest create() {
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

    public static final class Builder extends Request.Builder<ClearIntervenesRequest, Builder> {
        private String agentKey; 

        private Builder() {
            super();
        } 

        private Builder(ClearIntervenesRequest request) {
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
        public ClearIntervenesRequest build() {
            return new ClearIntervenesRequest(this);
        } 

    } 

}

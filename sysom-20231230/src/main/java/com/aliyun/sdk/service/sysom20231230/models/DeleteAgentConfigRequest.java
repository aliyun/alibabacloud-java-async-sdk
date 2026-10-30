// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link DeleteAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentConfigRequest</p>
 */
public class DeleteAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configId")
    private String configId;

    private DeleteAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<DeleteAgentConfigRequest, Builder> {
        private String agentId; 
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.configId = request.configId;
        } 

        /**
         * <p>The ID of the component associated with the configuration to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The ID of the component configuration to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public DeleteAgentConfigRequest build() {
            return new DeleteAgentConfigRequest(this);
        } 

    } 

}

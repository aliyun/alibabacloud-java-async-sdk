// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteAgentRuntimeRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentRuntimeRequest</p>
 */
public class DeleteAgentRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    private DeleteAgentRuntimeRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public static final class Builder extends Request.Builder<DeleteAgentRuntimeRequest, Builder> {
        private String agentRuntimeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentRuntimeRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
        } 

        /**
         * <p>要删除的智能体运行时实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putPathParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        @Override
        public DeleteAgentRuntimeRequest build() {
            return new DeleteAgentRuntimeRequest(this);
        } 

    } 

}

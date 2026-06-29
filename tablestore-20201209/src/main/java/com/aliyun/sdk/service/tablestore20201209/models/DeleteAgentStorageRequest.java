// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link DeleteAgentStorageRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentStorageRequest</p>
 */
public class DeleteAgentStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    private DeleteAgentStorageRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public static final class Builder extends Request.Builder<DeleteAgentStorageRequest, Builder> {
        private String agentStorageName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentStorageRequest request) {
            super(request);
            this.agentStorageName = request.agentStorageName;
        } 

        /**
         * <p>agent storage name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-test</p>
         */
        public Builder agentStorageName(String agentStorageName) {
            this.putBodyParameter("AgentStorageName", agentStorageName);
            this.agentStorageName = agentStorageName;
            return this;
        }

        @Override
        public DeleteAgentStorageRequest build() {
            return new DeleteAgentStorageRequest(this);
        } 

    } 

}

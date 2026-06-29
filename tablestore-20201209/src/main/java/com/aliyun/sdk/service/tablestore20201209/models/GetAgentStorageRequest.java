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
 * {@link GetAgentStorageRequest} extends {@link RequestModel}
 *
 * <p>GetAgentStorageRequest</p>
 */
public class GetAgentStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    private GetAgentStorageRequest(Builder builder) {
        super(builder);
        this.agentStorageName = builder.agentStorageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentStorageRequest create() {
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

    public static final class Builder extends Request.Builder<GetAgentStorageRequest, Builder> {
        private String agentStorageName; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentStorageRequest request) {
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
            this.putQueryParameter("AgentStorageName", agentStorageName);
            this.agentStorageName = agentStorageName;
            return this;
        }

        @Override
        public GetAgentStorageRequest build() {
            return new GetAgentStorageRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetAgentSpaceRequest} extends {@link RequestModel}
 *
 * <p>GetAgentSpaceRequest</p>
 */
public class GetAgentSpaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    private GetAgentSpaceRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public static final class Builder extends Request.Builder<GetAgentSpaceRequest, Builder> {
        private String agentSpace; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentSpaceRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        @Override
        public GetAgentSpaceRequest build() {
            return new GetAgentSpaceRequest(this);
        } 

    } 

}

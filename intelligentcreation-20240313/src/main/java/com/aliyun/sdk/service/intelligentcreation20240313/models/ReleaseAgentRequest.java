// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ReleaseAgentRequest} extends {@link RequestModel}
 *
 * <p>ReleaseAgentRequest</p>
 */
public class ReleaseAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    private ReleaseAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAgentRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseAgentRequest, Builder> {
        private String agentId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        @Override
        public ReleaseAgentRequest build() {
            return new ReleaseAgentRequest(this);
        } 

    } 

}

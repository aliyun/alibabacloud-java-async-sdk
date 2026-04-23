// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetAIAgentConcurrencyRequest} extends {@link RequestModel}
 *
 * <p>GetAIAgentConcurrencyRequest</p>
 */
public class GetAIAgentConcurrencyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    private GetAIAgentConcurrencyRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIAgentConcurrencyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public static final class Builder extends Request.Builder<GetAIAgentConcurrencyRequest, Builder> {
        private String AIAgentId; 

        private Builder() {
            super();
        } 

        private Builder(GetAIAgentConcurrencyRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>*<strong><strong><strong>3b3d94abda22</strong></strong></strong></p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        @Override
        public GetAIAgentConcurrencyRequest build() {
            return new GetAIAgentConcurrencyRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>GetCustomAgentRequest</p>
 */
public class GetCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

    private GetCustomAgentRequest(Builder builder) {
        super(builder);
        this.customAgentId = builder.customAgentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public static final class Builder extends Request.Builder<GetCustomAgentRequest, Builder> {
        private String customAgentId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomAgentRequest request) {
            super(request);
            this.customAgentId = request.customAgentId;
        } 

        /**
         * CustomAgentId.
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        @Override
        public GetCustomAgentRequest build() {
            return new GetCustomAgentRequest(this);
        } 

    } 

}

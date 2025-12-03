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
 * {@link DeleteCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomAgentRequest</p>
 */
public class DeleteCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

    private DeleteCustomAgentRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.customAgentId = builder.customAgentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomAgentRequest, Builder> {
        private String apiId; 
        private String customAgentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomAgentRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.customAgentId = request.customAgentId;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>AgentId。</p>
         * 
         * <strong>example:</strong>
         * <p>ebe44453-3b41-4c74-94d1-01d088d7****</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        @Override
        public DeleteCustomAgentRequest build() {
            return new DeleteCustomAgentRequest(this);
        } 

    } 

}

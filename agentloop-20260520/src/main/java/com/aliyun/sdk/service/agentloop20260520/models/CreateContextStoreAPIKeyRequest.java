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
 * {@link CreateContextStoreAPIKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateContextStoreAPIKeyRequest</p>
 */
public class CreateContextStoreAPIKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateContextStoreAPIKeyRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.name = builder.name;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextStoreAPIKeyRequest create() {
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

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateContextStoreAPIKeyRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private String name; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextStoreAPIKeyRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.name = request.name;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-api-key</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateContextStoreAPIKeyRequest build() {
            return new CreateContextStoreAPIKeyRequest(this);
        } 

    } 

}

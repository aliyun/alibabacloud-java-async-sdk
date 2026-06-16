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
 * {@link UpdateAgentSpaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentSpaceRequest</p>
 */
public class UpdateAgentSpaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cmsWorkspace")
    private String cmsWorkspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateAgentSpaceRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.cmsWorkspace = builder.cmsWorkspace;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentSpaceRequest create() {
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
     * @return cmsWorkspace
     */
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateAgentSpaceRequest, Builder> {
        private String agentSpace; 
        private String cmsWorkspace; 
        private String description; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentSpaceRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.cmsWorkspace = request.cmsWorkspace;
            this.description = request.description;
            this.clientToken = request.clientToken;
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

        /**
         * cmsWorkspace.
         */
        public Builder cmsWorkspace(String cmsWorkspace) {
            this.putBodyParameter("cmsWorkspace", cmsWorkspace);
            this.cmsWorkspace = cmsWorkspace;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
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
        public UpdateAgentSpaceRequest build() {
            return new UpdateAgentSpaceRequest(this);
        } 

    } 

}

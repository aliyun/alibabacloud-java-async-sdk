// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayLoggingRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayLoggingRequest</p>
 */
public class CreateGatewayLoggingRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SlsLogstore")
    @Validation(required = true)
    private String slsLogstore;

    @Query
    @NameInMap("SlsProject")
    @Validation(required = true)
    private String slsProject;

    private CreateGatewayLoggingRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.securityToken = builder.securityToken;
        this.slsLogstore = builder.slsLogstore;
        this.slsProject = builder.slsProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayLoggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return slsLogstore
     */
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    public static final class Builder extends Request.Builder<CreateGatewayLoggingRequest, Builder> {
        private String gatewayId; 
        private String securityToken; 
        private String slsLogstore; 
        private String slsProject; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayLoggingRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.securityToken = request.securityToken;
            this.slsLogstore = request.slsLogstore;
            this.slsProject = request.slsProject;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SlsLogstore.
         */
        public Builder slsLogstore(String slsLogstore) {
            this.putQueryParameter("SlsLogstore", slsLogstore);
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        @Override
        public CreateGatewayLoggingRequest build() {
            return new CreateGatewayLoggingRequest(this);
        } 

    } 

}

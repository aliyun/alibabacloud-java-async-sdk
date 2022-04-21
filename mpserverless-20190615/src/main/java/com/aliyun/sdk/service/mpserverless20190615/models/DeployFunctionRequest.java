// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFunctionRequest} extends {@link RequestModel}
 *
 * <p>DeployFunctionRequest</p>
 */
public class DeployFunctionRequest extends Request {
    @Body
    @NameInMap("DeploymentId")
    @Validation(required = true)
    private String deploymentId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DeployFunctionRequest(Builder builder) {
        super(builder);
        this.deploymentId = builder.deploymentId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DeployFunctionRequest, Builder> {
        private String deploymentId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeployFunctionRequest request) {
            super(request);
            this.deploymentId = request.deploymentId;
            this.spaceId = request.spaceId;
        } 

        /**
         * DeploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.putBodyParameter("DeploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DeployFunctionRequest build() {
            return new DeployFunctionRequest(this);
        } 

    } 

}

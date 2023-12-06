// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductDeploymentRequest} extends {@link RequestModel}
 *
 * <p>GetProductDeploymentRequest</p>
 */
public class GetProductDeploymentRequest extends Request {
    @Path
    @NameInMap("deploymentUID")
    @Validation(required = true)
    private String deploymentUID;

    @Query
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Query
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    @Query
    @NameInMap("withParamConfig")
    private Boolean withParamConfig;

    private GetProductDeploymentRequest(Builder builder) {
        super(builder);
        this.deploymentUID = builder.deploymentUID;
        this.environmentUID = builder.environmentUID;
        this.productVersionUID = builder.productVersionUID;
        this.withParamConfig = builder.withParamConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductDeploymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentUID
     */
    public String getDeploymentUID() {
        return this.deploymentUID;
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return withParamConfig
     */
    public Boolean getWithParamConfig() {
        return this.withParamConfig;
    }

    public static final class Builder extends Request.Builder<GetProductDeploymentRequest, Builder> {
        private String deploymentUID; 
        private String environmentUID; 
        private String productVersionUID; 
        private Boolean withParamConfig; 

        private Builder() {
            super();
        } 

        private Builder(GetProductDeploymentRequest request) {
            super(request);
            this.deploymentUID = request.deploymentUID;
            this.environmentUID = request.environmentUID;
            this.productVersionUID = request.productVersionUID;
            this.withParamConfig = request.withParamConfig;
        } 

        /**
         * deploymentUID.
         */
        public Builder deploymentUID(String deploymentUID) {
            this.putPathParameter("deploymentUID", deploymentUID);
            this.deploymentUID = deploymentUID;
            return this;
        }

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putQueryParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * withParamConfig.
         */
        public Builder withParamConfig(Boolean withParamConfig) {
            this.putQueryParameter("withParamConfig", withParamConfig);
            this.withParamConfig = withParamConfig;
            return this;
        }

        @Override
        public GetProductDeploymentRequest build() {
            return new GetProductDeploymentRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRCDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>DeleteRCDeploymentSetRequest</p>
 */
public class DeleteRCDeploymentSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteRCDeploymentSetRequest(Builder builder) {
        super(builder);
        this.deploymentSetId = builder.deploymentSetId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRCDeploymentSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteRCDeploymentSetRequest, Builder> {
        private String deploymentSetId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRCDeploymentSetRequest request) {
            super(request);
            this.deploymentSetId = request.deploymentSetId;
            this.regionId = request.regionId;
        } 

        /**
         * DeploymentSetId.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteRCDeploymentSetRequest build() {
            return new DeleteRCDeploymentSetRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * <p>The deployment set ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-uf6c8qerk019bj1l****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

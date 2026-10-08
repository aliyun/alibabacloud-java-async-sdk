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
 * {@link RemoveRCInstancesFromDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>RemoveRCInstancesFromDeploymentSetRequest</p>
 */
public class RemoveRCInstancesFromDeploymentSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RCInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String RCInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RemoveRCInstancesFromDeploymentSetRequest(Builder builder) {
        super(builder);
        this.deploymentSetId = builder.deploymentSetId;
        this.RCInstanceIds = builder.RCInstanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRCInstancesFromDeploymentSetRequest create() {
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
     * @return RCInstanceIds
     */
    public String getRCInstanceIds() {
        return this.RCInstanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveRCInstancesFromDeploymentSetRequest, Builder> {
        private String deploymentSetId; 
        private String RCInstanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveRCInstancesFromDeploymentSetRequest request) {
            super(request);
            this.deploymentSetId = request.deploymentSetId;
            this.RCInstanceIds = request.RCInstanceIds;
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-sff,rc-err</p>
         */
        public Builder RCInstanceIds(String RCInstanceIds) {
            this.putQueryParameter("RCInstanceIds", RCInstanceIds);
            this.RCInstanceIds = RCInstanceIds;
            return this;
        }

        /**
         * <p>The region ID. You can call DescribeRegions to query the most recent region list.</p>
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
        public RemoveRCInstancesFromDeploymentSetRequest build() {
            return new RemoveRCInstancesFromDeploymentSetRequest(this);
        } 

    } 

}

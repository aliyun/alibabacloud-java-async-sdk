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
 * {@link AddRCInstancesToDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>AddRCInstancesToDeploymentSetRequest</p>
 */
public class AddRCInstancesToDeploymentSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetGroupNo")
    private String deploymentSetGroupNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RCInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String RCInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddRCInstancesToDeploymentSetRequest(Builder builder) {
        super(builder);
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
        this.deploymentSetId = builder.deploymentSetId;
        this.force = builder.force;
        this.RCInstanceIds = builder.RCInstanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRCInstancesToDeploymentSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentSetGroupNo
     */
    public String getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<AddRCInstancesToDeploymentSetRequest, Builder> {
        private String deploymentSetGroupNo; 
        private String deploymentSetId; 
        private Boolean force; 
        private String RCInstanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddRCInstancesToDeploymentSetRequest request) {
            super(request);
            this.deploymentSetGroupNo = request.deploymentSetGroupNo;
            this.deploymentSetId = request.deploymentSetId;
            this.force = request.force;
            this.RCInstanceIds = request.RCInstanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The group number of the ECS instance in the deployment set when the deployment set policy is high availability group (AvailabilityGroup). You can use this parameter to specify the group number. Valid values: 1 to 7. If no value is specified, the system automatically assigns an active group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deploymentSetGroupNo(String deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
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
         * <p>Specifies whether to forcibly release running instances. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Forcibly release.</li>
         * <li><strong>false</strong> (default): Do not forcibly release.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-aaaa,rc-bbb</p>
         */
        public Builder RCInstanceIds(String RCInstanceIds) {
            this.putQueryParameter("RCInstanceIds", RCInstanceIds);
            this.RCInstanceIds = RCInstanceIds;
            return this;
        }

        /**
         * <p>The region ID. You can call DescribeRegions to query available regions.</p>
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
        public AddRCInstancesToDeploymentSetRequest build() {
            return new AddRCInstancesToDeploymentSetRequest(this);
        } 

    } 

}

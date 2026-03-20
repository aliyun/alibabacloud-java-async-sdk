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
 * {@link ModifyRCDeploymentSetAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCDeploymentSetAttributeRequest</p>
 */
public class ModifyRCDeploymentSetAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyRCDeploymentSetAttributeRequest(Builder builder) {
        super(builder);
        this.deploymentSetId = builder.deploymentSetId;
        this.deploymentSetName = builder.deploymentSetName;
        this.description = builder.description;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCDeploymentSetAttributeRequest create() {
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
     * @return deploymentSetName
     */
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCDeploymentSetAttributeRequest, Builder> {
        private String deploymentSetId; 
        private String deploymentSetName; 
        private String description; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCDeploymentSetAttributeRequest request) {
            super(request);
            this.deploymentSetId = request.deploymentSetId;
            this.deploymentSetName = request.deploymentSetName;
            this.description = request.description;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * DeploymentSetName.
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
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
        public ModifyRCDeploymentSetAttributeRequest build() {
            return new ModifyRCDeploymentSetAttributeRequest(this);
        } 

    } 

}

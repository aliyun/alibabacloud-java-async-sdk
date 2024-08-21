// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRCDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>CreateRCDeploymentSetRequest</p>
 */
public class CreateRCDeploymentSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupCount")
    private Long groupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnUnableToRedeployFailedInstance")
    private String onUnableToRedeployFailedInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    private CreateRCDeploymentSetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deploymentSetName = builder.deploymentSetName;
        this.description = builder.description;
        this.groupCount = builder.groupCount;
        this.onUnableToRedeployFailedInstance = builder.onUnableToRedeployFailedInstance;
        this.regionId = builder.regionId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCDeploymentSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return groupCount
     */
    public Long getGroupCount() {
        return this.groupCount;
    }

    /**
     * @return onUnableToRedeployFailedInstance
     */
    public String getOnUnableToRedeployFailedInstance() {
        return this.onUnableToRedeployFailedInstance;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateRCDeploymentSetRequest, Builder> {
        private String clientToken; 
        private String deploymentSetName; 
        private String description; 
        private Long groupCount; 
        private String onUnableToRedeployFailedInstance; 
        private String regionId; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCDeploymentSetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deploymentSetName = request.deploymentSetName;
            this.description = request.description;
            this.groupCount = request.groupCount;
            this.onUnableToRedeployFailedInstance = request.onUnableToRedeployFailedInstance;
            this.regionId = request.regionId;
            this.strategy = request.strategy;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * GroupCount.
         */
        public Builder groupCount(Long groupCount) {
            this.putQueryParameter("GroupCount", groupCount);
            this.groupCount = groupCount;
            return this;
        }

        /**
         * OnUnableToRedeployFailedInstance.
         */
        public Builder onUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
            this.putQueryParameter("OnUnableToRedeployFailedInstance", onUnableToRedeployFailedInstance);
            this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
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

        /**
         * Strategy.
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateRCDeploymentSetRequest build() {
            return new CreateRCDeploymentSetRequest(this);
        } 

    } 

}

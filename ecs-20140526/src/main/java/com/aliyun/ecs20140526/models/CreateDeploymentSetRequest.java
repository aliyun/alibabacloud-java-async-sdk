// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentSetRequest</p>
 */
public class CreateDeploymentSetRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("GroupCount")
    private Long groupCount;

    @Query
    @NameInMap("OnUnableToRedeployFailedInstance")
    private String onUnableToRedeployFailedInstance;

    @Query
    @NameInMap("Strategy")
    private String strategy;

    private CreateDeploymentSetRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.domain = builder.domain;
        this.deploymentSetName = builder.deploymentSetName;
        this.description = builder.description;
        this.granularity = builder.granularity;
        this.groupCount = builder.groupCount;
        this.onUnableToRedeployFailedInstance = builder.onUnableToRedeployFailedInstance;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
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
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateDeploymentSetRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String clientToken; 
        private String domain; 
        private String deploymentSetName; 
        private String description; 
        private String granularity; 
        private Long groupCount; 
        private String onUnableToRedeployFailedInstance; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentSetRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.clientToken = response.clientToken;
            this.domain = response.domain;
            this.deploymentSetName = response.deploymentSetName;
            this.description = response.description;
            this.granularity = response.granularity;
            this.groupCount = response.groupCount;
            this.onUnableToRedeployFailedInstance = response.onUnableToRedeployFailedInstance;
            this.strategy = response.strategy;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the deployment set belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The deployment domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The name of the deployment set. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The deployment granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * Set the number of groups for the high availability policy of the deployment set group. Valid values: 1 to 7.
         * <p>
         * 
         * Default value: 3.
         * 
         * > This parameter takes effect only when "Strategy = AvailabilityGroup.
         */
        public Builder groupCount(Long groupCount) {
            this.putQueryParameter("GroupCount", groupCount);
            this.groupCount = groupCount;
            return this;
        }

        /**
         * After instances in the deployment set are down and migrated, there is no emergency solution to break up the instance inventory. Valid values:
         * <p>
         * 
         * -CancelMembershipAndStart: remove the instance from the deployment set and start the instance immediately after the instance is down and migrated.
         * -KeepStopped: maintains the deployment set properties of the instance, and the instance remains stopped.
         * 
         * Default value: CancelMembershipAndStart
         */
        public Builder onUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
            this.putQueryParameter("OnUnableToRedeployFailedInstance", onUnableToRedeployFailedInstance);
            this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
            return this;
        }

        /**
         * The deployment policy. Valid values:
         * <p>
         * 
         * -Availability: high Availability policy
         * -AvailabilityGroup: deployment set group High available policies
         * 
         * Default: Availability
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateDeploymentSetRequest build() {
            return new CreateDeploymentSetRequest(this);
        } 

    } 

}

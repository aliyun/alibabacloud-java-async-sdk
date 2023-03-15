// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStackInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteStackInstancesRequest</p>
 */
public class DeleteStackInstancesRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeploymentTargets")
    private DeploymentTargets deploymentTargets;

    @Query
    @NameInMap("OperationDescription")
    private String operationDescription;

    @Query
    @NameInMap("OperationPreferences")
    private java.util.Map < String, ? > operationPreferences;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionIds")
    @Validation(required = true)
    private java.util.List < String > regionIds;

    @Query
    @NameInMap("RetainStacks")
    @Validation(required = true)
    private Boolean retainStacks;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    private DeleteStackInstancesRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.clientToken = builder.clientToken;
        this.deploymentTargets = builder.deploymentTargets;
        this.operationDescription = builder.operationDescription;
        this.operationPreferences = builder.operationPreferences;
        this.regionId = builder.regionId;
        this.regionIds = builder.regionIds;
        this.retainStacks = builder.retainStacks;
        this.stackGroupName = builder.stackGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deploymentTargets
     */
    public DeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    /**
     * @return operationDescription
     */
    public String getOperationDescription() {
        return this.operationDescription;
    }

    /**
     * @return operationPreferences
     */
    public java.util.Map < String, ? > getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return retainStacks
     */
    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public static final class Builder extends Request.Builder<DeleteStackInstancesRequest, Builder> {
        private java.util.List < String > accountIds; 
        private String clientToken; 
        private DeploymentTargets deploymentTargets; 
        private String operationDescription; 
        private java.util.Map < String, ? > operationPreferences; 
        private String regionId; 
        private java.util.List < String > regionIds; 
        private Boolean retainStacks; 
        private String stackGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStackInstancesRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.clientToken = request.clientToken;
            this.deploymentTargets = request.deploymentTargets;
            this.operationDescription = request.operationDescription;
            this.operationPreferences = request.operationPreferences;
            this.regionId = request.regionId;
            this.regionIds = request.regionIds;
            this.retainStacks = request.retainStacks;
            this.stackGroupName = request.stackGroupName;
        } 

        /**
         * The IDs of the accounts within the self-managed permission model is used to deploy stacks. You can specify up to 20 account IDs.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.
         * <p>
         * 
         * The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
         * 
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The folders in which the service-managed permission model is used to deploy stacks.
         */
        public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
            String deploymentTargetsShrink = shrink(deploymentTargets, "DeploymentTargets", "json");
            this.putQueryParameter("DeploymentTargets", deploymentTargetsShrink);
            this.deploymentTargets = deploymentTargets;
            return this;
        }

        /**
         * The description of the operation that you want to perform to delete the stacks.
         * <p>
         * 
         * The description must be 1 to 256 characters in length.
         */
        public Builder operationDescription(String operationDescription) {
            this.putQueryParameter("OperationDescription", operationDescription);
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * The settings that you configure to delete the stacks.
         * <p>
         * 
         * The following parameters are included:
         * 
         * *   {"FailureToleranceCount": N}
         * 
         *     The number of accounts within which stack operation failures can occur in each region. If the value of this parameter is exceeded in a region, Resource Orchestration Service (ROS) stops the operation in the region. If the operation is stopped in one region, the operation is no longer performed in other regions.
         * 
         *     Valid values of N: 0 to 20.
         * 
         *     If you do not specify the FailureToleranceCount parameter, the default value 0 is used.
         * 
         * *   {"FailureTolerancePercentage": N}
         * 
         *     The percentage of the number of accounts within which stack operation failures can occur to the total number of accounts in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region.
         * 
         *     Valid values of N: 0 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.
         * 
         *     If you do not specify the FailureTolerancePercentage parameter, the default value 0 is used.
         * 
         * *   {"MaxConcurrentCount": N}
         * 
         *     The maximum number of accounts within which stacks are deployed at the same time in each region.
         * 
         *     Valid values of N: 1 to 20.
         * 
         *     If you do not specify the MaxConcurrentCount parameter, the default value 1 is used.
         * 
         * *   {"MaxConcurrentPercentage": N}
         * 
         *     The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.
         * 
         *     Valid values of N: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.
         * 
         *     If you do not specify the MaxConcurrentPercentage parameter, the default value 1 is used.
         * 
         * *   {"RegionConcurrencyType": N}
         * 
         *     The mode that you want to use to deploy stacks across regions. Default value: SEQUENTIAL. Valid values:
         * 
         *     *   SEQUENTIAL: deploys stacks in each specified region based on the specified sequence of regions. ROS deploys stacks in one region at a time.
         *     *   PARALLEL: deploys stacks in parallel in all specified regions.
         * 
         * Separate multiple parameters with commas (,).
         * 
         * > 
         * *   You can specify only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.
         * *   You can specify only one of the FailureToleranceCount and FailureTolerancePercentage parameters.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the regions from which you want to delete the stacks. You can specify up to 20 region IDs.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * Specifies whether to retain the stacks.
         * <p>
         * 
         * Valid values:
         * 
         * *   true: retains the stacks.
         * *   false: deletes the stacks.
         */
        public Builder retainStacks(Boolean retainStacks) {
            this.putQueryParameter("RetainStacks", retainStacks);
            this.retainStacks = retainStacks;
            return this;
        }

        /**
         * The name of the stack group. The name must be unique in a region.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        @Override
        public DeleteStackInstancesRequest build() {
            return new DeleteStackInstancesRequest(this);
        } 

    } 

    public static class DeploymentTargets extends TeaModel {
        @NameInMap("RdFolderIds")
        private java.util.List < String > rdFolderIds;

        private DeploymentTargets(Builder builder) {
            this.rdFolderIds = builder.rdFolderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentTargets create() {
            return builder().build();
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List < String > getRdFolderIds() {
            return this.rdFolderIds;
        }

        public static final class Builder {
            private java.util.List < String > rdFolderIds; 

            /**
             * The IDs of the folders in the resource directory. You can specify up to five folder IDs.
             * <p>
             * 
             * You can create stacks within all members in the specified folders. If you create stacks in the Root folder, the stacks are created within all members in the resource directory.
             * 
             * >  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).
             */
            public Builder rdFolderIds(java.util.List < String > rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            public DeploymentTargets build() {
                return new DeploymentTargets(this);
            } 

        } 

    }
}

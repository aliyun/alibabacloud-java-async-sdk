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
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
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
         * DeploymentTargets.
         */
        public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
            String deploymentTargetsShrink = shrink(deploymentTargets, "DeploymentTargets", "json");
            this.putQueryParameter("DeploymentTargets", deploymentTargetsShrink);
            this.deploymentTargets = deploymentTargets;
            return this;
        }

        /**
         * OperationDescription.
         */
        public Builder operationDescription(String operationDescription) {
            this.putQueryParameter("OperationDescription", operationDescription);
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * OperationPreferences.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
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
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * RetainStacks.
         */
        public Builder retainStacks(Boolean retainStacks) {
            this.putQueryParameter("RetainStacks", retainStacks);
            this.retainStacks = retainStacks;
            return this;
        }

        /**
         * StackGroupName.
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
             * RdFolderIds.
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

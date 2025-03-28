// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link DeleteStackInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteStackInstancesRequest</p>
 */
public class DeleteStackInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentTargets")
    private DeploymentTargets deploymentTargets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationDescription")
    private String operationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationPreferences")
    private java.util.Map<String, ?> operationPreferences;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainStacks")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean retainStacks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getAccountIds() {
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
    public java.util.Map<String, ?> getOperationPreferences() {
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
    public java.util.List<String> getRegionIds() {
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
        private java.util.List<String> accountIds; 
        private String clientToken; 
        private DeploymentTargets deploymentTargets; 
        private String operationDescription; 
        private java.util.Map<String, ?> operationPreferences; 
        private String regionId; 
        private java.util.List<String> regionIds; 
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
         * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;151266687691****&quot;]</p>
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can contain letters, digits, hyphens (-), and underscores (_), and cannot exceed 64 characters in length.<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The folders in which you want to deploy stacks in service-managed mode.</p>
         */
        public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
            String deploymentTargetsShrink = shrink(deploymentTargets, "DeploymentTargets", "json");
            this.putQueryParameter("DeploymentTargets", deploymentTargetsShrink);
            this.deploymentTargets = deploymentTargets;
            return this;
        }

        /**
         * <p>The description of the delete operation.</p>
         * <p>The description must be 1 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Delete stack instances in hangzhou and beijing</p>
         */
        public Builder operationDescription(String operationDescription) {
            this.putQueryParameter("OperationDescription", operationDescription);
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * <p>The preference settings of the delete operation.</p>
         * <p>The following parameters are available:</p>
         * <ul>
         * <li><p>{&quot;FailureToleranceCount&quot;: N}</p>
         * <p> The number of accounts within which stack operation failures are allowed in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region. If ROS stops the operation in one region, ROS stops the operation in other regions.</p>
         * <p> Valid values of N: 0 to 20.</p>
         * <p> If you do not specify FailureToleranceCount, 0 is used as the default value.</p>
         * </li>
         * <li><p>{&quot;FailureTolerancePercentage&quot;: N}</p>
         * <p> The percentage of the number of accounts within which stack operation failures are allowed to the total number of accounts in each region. If the value of this parameter is exceeded, ROS stops the operation in the region.</p>
         * <p> Valid values of N: 0 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
         * <p> If you do not specify FailureTolerancePercentage, 0 is used as the default value.</p>
         * </li>
         * <li><p>{&quot;MaxConcurrentCount&quot;: N}</p>
         * <p> The maximum number of accounts within which multiple stacks are deployed at the same time in each region.</p>
         * <p> Valid values of N: 1 to 20.</p>
         * <p> If you do not specify MaxConcurrentCount, 1 is used as the default value.</p>
         * </li>
         * <li><p>{&quot;MaxConcurrentPercentage&quot;: N}</p>
         * <p> The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
         * <p> Valid values of N: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the number down to the nearest integer.</p>
         * <p> If you do not specify MaxConcurrentPercentage, 1 is used as the default value.</p>
         * </li>
         * <li><p>{&quot;RegionConcurrencyType&quot;: N}</p>
         * <p>The mode that you want to use to deploy stacks across regions. Valid values:</p>
         * <ul>
         * <li><p>SEQUENTIAL (default): deploys stacks in the specified regions one by one in sequence. This way, ROS deploys stacks in only one region at a time. </p>
         * </li>
         * <li><p>PARALLEL: deploys stacks in all the specified regions in parallel.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>Separate multiple parameters with commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>You can specify only one of the following parameters: MaxConcurrentCount and MaxConcurrentPercentage.</li>
         * <li>You can specify only one of the following parameters: FailureToleranceCount and FailureTolerancePercentage.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FailureToleranceCount&quot;: 1, &quot;MaxConcurrentCount&quot;: 2}</p>
         */
        public Builder operationPreferences(java.util.Map<String, ?> operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The IDs of the regions where you want to delete the stacks. You can specify up to 20 region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>Specifies whether to delete the stacks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: retains the stacks.</li>
         * <li>false: deletes the stacks.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder retainStacks(Boolean retainStacks) {
            this.putQueryParameter("RetainStacks", retainStacks);
            this.retainStacks = retainStacks;
            return this;
        }

        /**
         * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
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

    /**
     * 
     * {@link DeleteStackInstancesRequest} extends {@link TeaModel}
     *
     * <p>DeleteStackInstancesRequest</p>
     */
    public static class DeploymentTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<String> accountIds;

        @com.aliyun.core.annotation.NameInMap("RdFolderIds")
        private java.util.List<String> rdFolderIds;

        private DeploymentTargets(Builder builder) {
            this.accountIds = builder.accountIds;
            this.rdFolderIds = builder.rdFolderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentTargets create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

        public static final class Builder {
            private java.util.List<String> accountIds; 
            private java.util.List<String> rdFolderIds; 

            private Builder() {
            } 

            private Builder(DeploymentTargets model) {
                this.accountIds = model.accountIds;
                this.rdFolderIds = model.rdFolderIds;
            } 

            /**
             * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
             * <blockquote>
             * <p>To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information about a folder</a>.</p>
             * </blockquote>
             */
            public Builder accountIds(java.util.List<String> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>The IDs of the folders in the resource directory. You can add up to five folder IDs.</p>
             * <p>You can create stacks within all the member accounts in the specified folders. If you create stacks in the Root folder, the stacks are created within all member accounts in the resource directory.</p>
             * <blockquote>
             * <p>To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information about a folder</a>.</p>
             * </blockquote>
             */
            public Builder rdFolderIds(java.util.List<String> rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            public DeploymentTargets build() {
                return new DeploymentTargets(this);
            } 

        } 

    }
}

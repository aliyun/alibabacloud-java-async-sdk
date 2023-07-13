// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQueueConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateQueueConfigRequest</p>
 */
public class UpdateQueueConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeInstanceType")
    private String computeInstanceType;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    private UpdateQueueConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.computeInstanceType = builder.computeInstanceType;
        this.deploymentSetId = builder.deploymentSetId;
        this.queueName = builder.queueName;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQueueConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return computeInstanceType
     */
    public String getComputeInstanceType() {
        return this.computeInstanceType;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateQueueConfigRequest, Builder> {
        private String clusterId; 
        private String computeInstanceType; 
        private String deploymentSetId; 
        private String queueName; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQueueConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.computeInstanceType = request.computeInstanceType;
            this.deploymentSetId = request.deploymentSetId;
            this.queueName = request.queueName;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The instance type of the node.
         * <p>
         * 
         * You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.
         */
        public Builder computeInstanceType(String computeInstanceType) {
            this.putQueryParameter("ComputeInstanceType", computeInstanceType);
            this.computeInstanceType = computeInstanceType;
            return this;
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
         * The name of the queue.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * You can call the [ListResourceGroups](~~158855~~) operation to query the IDs of resource groups.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public UpdateQueueConfigRequest build() {
            return new UpdateQueueConfigRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddQueueRequest} extends {@link RequestModel}
 *
 * <p>AddQueueRequest</p>
 */
public class AddQueueRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    private AddQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.deploymentSetId = builder.deploymentSetId;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.queueName = builder.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddQueueRequest create() {
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
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    public static final class Builder extends Request.Builder<AddQueueRequest, Builder> {
        private String clusterId; 
        private String deploymentSetId; 
        private String networkInterfaceTrafficMode; 
        private String queueName; 

        private Builder() {
            super();
        } 

        private Builder(AddQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.deploymentSetId = request.deploymentSetId;
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
            this.queueName = request.queueName;
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
         * DeploymentSetId.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * NetworkInterfaceTrafficMode.
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * The name of the queue. The name must be 1 to 63 characters in length and start with a letter. It can contain letters, digits, and underscores (\_).
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        @Override
        public AddQueueRequest build() {
            return new AddQueueRequest(this);
        } 

    } 

}

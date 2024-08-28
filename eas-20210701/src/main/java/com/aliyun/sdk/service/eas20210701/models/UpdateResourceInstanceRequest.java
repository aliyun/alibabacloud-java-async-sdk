// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceInstanceRequest</p>
 */
public class UpdateResourceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    private UpdateResourceInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.instanceId = builder.instanceId;
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInstanceRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder extends Request.Builder<UpdateResourceInstanceRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String instanceId; 
        private String action; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.instanceId = request.instanceId;
            this.action = request.action;
        } 

        /**
         * The ID of the region to which the instance belongs.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs. For more information about how to query the ID of a resource group, see [ListResources](~~412133~~).
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The instance ID. For more information about how to query the instance ID, see [ListResourceInstances](~~412129~~).
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The operation that updates the scheduling state of the instance in a dedicated resource group. Valid values:
         * <p>
         * 
         * *   Uncordon: allows scheduling the service to this instance.
         * *   Cordon: prohibits scheduling the service to this instance.
         * *   Drain: evicts the service that has been scheduled to this instance.
         */
        public Builder action(String action) {
            this.putBodyParameter("Action", action);
            this.action = action;
            return this;
        }

        @Override
        public UpdateResourceInstanceRequest build() {
            return new UpdateResourceInstanceRequest(this);
        } 

    } 

}

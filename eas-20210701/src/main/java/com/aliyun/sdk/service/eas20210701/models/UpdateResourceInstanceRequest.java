// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewDiskSize")
    private String newDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String reason;

    private UpdateResourceInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.instanceId = builder.instanceId;
        this.action = builder.action;
        this.newDiskSize = builder.newDiskSize;
        this.reason = builder.reason;
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

    /**
     * @return newDiskSize
     */
    public String getNewDiskSize() {
        return this.newDiskSize;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<UpdateResourceInstanceRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String instanceId; 
        private String action; 
        private String newDiskSize; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.instanceId = request.instanceId;
            this.action = request.action;
            this.newDiskSize = request.newDiskSize;
            this.reason = request.reason;
        } 

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs. For information about how to query the resource group ID, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdas****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The ID of the instance. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-i-asdas****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Updates the schedulable behavior of the machine instance in the dedicated resource group. Valid values:</p>
         * <ul>
         * <li>Uncordon: Allows services to be scheduled to this instance.</li>
         * <li>Cordon: Prevents services from being scheduled to this instance.</li>
         * <li>Drain: Evicts service instances that are already scheduled to this instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cordon</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("Action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>The size of the system cloud disk after scaling, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder newDiskSize(String newDiskSize) {
            this.putBodyParameter("NewDiskSize", newDiskSize);
            this.newDiskSize = newDiskSize;
            return this;
        }

        /**
         * <p>Takes effect when Action is set to Cordon or Drain. Records the reason for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Node maintenance</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public UpdateResourceInstanceRequest build() {
            return new UpdateResourceInstanceRequest(this);
        } 

    } 

}

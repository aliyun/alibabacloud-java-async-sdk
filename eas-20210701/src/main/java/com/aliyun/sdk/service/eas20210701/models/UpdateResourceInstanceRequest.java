// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceInstanceRequest</p>
 */
public class UpdateResourceInstanceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Action")
    @Validation(required = true)
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
         * 实例所属集群
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 实例所属资源组Id
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 更新服务的行为：Cordon, Uncordon, Drain
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

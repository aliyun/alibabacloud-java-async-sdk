// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceInstancesRequest</p>
 */
public class DeleteResourceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllFailed")
    private Boolean allFailed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private String instanceList;

    private DeleteResourceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.allFailed = builder.allFailed;
        this.instanceList = builder.instanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceInstancesRequest create() {
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
     * @return allFailed
     */
    public Boolean getAllFailed() {
        return this.allFailed;
    }

    /**
     * @return instanceList
     */
    public String getInstanceList() {
        return this.instanceList;
    }

    public static final class Builder extends Request.Builder<DeleteResourceInstancesRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private Boolean allFailed; 
        private String instanceList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.allFailed = request.allFailed;
            this.instanceList = request.instanceList;
        } 

        /**
         * The ID of the region to which the resource group belongs.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the resource group. For more information about how to query the ID of a resource group, see [ListResources](~~412133~~).
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Specifies whether to delete all the instances that fail to be created. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder allFailed(Boolean allFailed) {
            this.putQueryParameter("AllFailed", allFailed);
            this.allFailed = allFailed;
            return this;
        }

        /**
         * The instances. Separate multiple instances with commas (,), such as `instanceId1,instanceId2`. For more information about how to query the instances, see [ListResourceInstances](~~412129~~).
         */
        public Builder instanceList(String instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public DeleteResourceInstancesRequest build() {
            return new DeleteResourceInstancesRequest(this);
        } 

    } 

}

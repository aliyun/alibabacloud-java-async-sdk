// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceInstancesRequest</p>
 */
public class DeleteResourceInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("AllFailed")
    private Boolean allFailed;

    @Query
    @NameInMap("InstanceList")
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * AllFailed.
         */
        public Builder allFailed(Boolean allFailed) {
            this.putQueryParameter("AllFailed", allFailed);
            this.allFailed = allFailed;
            return this;
        }

        /**
         * InstanceList.
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

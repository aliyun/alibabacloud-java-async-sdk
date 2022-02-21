// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceQueueRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceQueueRequest</p>
 */
public class DeleteResourceQueueRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceQueueId")
    @Validation(required = true)
    private String resourceQueueId;

    private DeleteResourceQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceQueueId = builder.resourceQueueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceQueueRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceQueueId
     */
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceQueueRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String resourceQueueId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceQueueRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceQueueId = response.resourceQueueId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceQueueId.
         */
        public Builder resourceQueueId(String resourceQueueId) {
            this.putQueryParameter("ResourceQueueId", resourceQueueId);
            this.resourceQueueId = resourceQueueId;
            return this;
        }

        @Override
        public DeleteResourceQueueRequest build() {
            return new DeleteResourceQueueRequest(this);
        } 

    } 

}

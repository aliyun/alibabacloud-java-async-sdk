// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourcePoolRequest</p>
 */
public class DeleteResourcePoolRequest extends Request {
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
    @NameInMap("ResourcePoolId")
    @Validation(required = true)
    private String resourcePoolId;

    private DeleteResourcePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolId = builder.resourcePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourcePoolRequest create() {
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
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public static final class Builder extends Request.Builder<DeleteResourcePoolRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String resourcePoolId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourcePoolRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourcePoolId = response.resourcePoolId;
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
         * ResourcePoolId.
         */
        public Builder resourcePoolId(String resourcePoolId) {
            this.putQueryParameter("ResourcePoolId", resourcePoolId);
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        @Override
        public DeleteResourcePoolRequest build() {
            return new DeleteResourcePoolRequest(this);
        } 

    } 

}

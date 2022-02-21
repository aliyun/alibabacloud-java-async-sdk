// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshClusterResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>RefreshClusterResourcePoolRequest</p>
 */
public class RefreshClusterResourcePoolRequest extends Request {
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
    private Long resourcePoolId;

    private RefreshClusterResourcePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolId = builder.resourcePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshClusterResourcePoolRequest create() {
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
    public Long getResourcePoolId() {
        return this.resourcePoolId;
    }

    public static final class Builder extends Request.Builder<RefreshClusterResourcePoolRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Long resourcePoolId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshClusterResourcePoolRequest response) {
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
        public Builder resourcePoolId(Long resourcePoolId) {
            this.putQueryParameter("ResourcePoolId", resourcePoolId);
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        @Override
        public RefreshClusterResourcePoolRequest build() {
            return new RefreshClusterResourcePoolRequest(this);
        } 

    } 

}

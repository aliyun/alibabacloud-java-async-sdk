// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseClusterRequest} extends {@link RequestModel}
 *
 * <p>ReleaseClusterRequest</p>
 */
public class ReleaseClusterRequest extends Request {
    @Query
    @NameInMap("ForceRelease")
    private Boolean forceRelease;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ReleaseClusterRequest(Builder builder) {
        super(builder);
        this.forceRelease = builder.forceRelease;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceRelease
     */
    public Boolean getForceRelease() {
        return this.forceRelease;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<ReleaseClusterRequest, Builder> {
        private Boolean forceRelease; 
        private String id; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseClusterRequest request) {
            super(request);
            this.forceRelease = request.forceRelease;
            this.id = request.id;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ForceRelease.
         */
        public Builder forceRelease(Boolean forceRelease) {
            this.putQueryParameter("ForceRelease", forceRelease);
            this.forceRelease = forceRelease;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public ReleaseClusterRequest build() {
            return new ReleaseClusterRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterStateRequest} extends {@link RequestModel}
 *
 * <p>GetClusterStateRequest</p>
 */
public class GetClusterStateRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("PuserId")
    private String puserId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetClusterStateRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.puserId = builder.puserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterStateRequest create() {
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
     * @return puserId
     */
    public String getPuserId() {
        return this.puserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetClusterStateRequest, Builder> {
        private String clusterId; 
        private String puserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterStateRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.puserId = response.puserId;
            this.regionId = response.regionId;
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
         * PuserId.
         */
        public Builder puserId(String puserId) {
            this.putQueryParameter("PuserId", puserId);
            this.puserId = puserId;
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

        @Override
        public GetClusterStateRequest build() {
            return new GetClusterStateRequest(this);
        } 

    } 

}

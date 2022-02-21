// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterInfoRequest} extends {@link RequestModel}
 *
 * <p>GetClusterInfoRequest</p>
 */
public class GetClusterInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("QueryUserId")
    @Validation(required = true)
    private String queryUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetClusterInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queryUserId = builder.queryUserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterInfoRequest create() {
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
     * @return queryUserId
     */
    public String getQueryUserId() {
        return this.queryUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetClusterInfoRequest, Builder> {
        private String clusterId; 
        private String queryUserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterInfoRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.queryUserId = response.queryUserId;
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
         * QueryUserId.
         */
        public Builder queryUserId(String queryUserId) {
            this.putQueryParameter("QueryUserId", queryUserId);
            this.queryUserId = queryUserId;
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
        public GetClusterInfoRequest build() {
            return new GetClusterInfoRequest(this);
        } 

    } 

}

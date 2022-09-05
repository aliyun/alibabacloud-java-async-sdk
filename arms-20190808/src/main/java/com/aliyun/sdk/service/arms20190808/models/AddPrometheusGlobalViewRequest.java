// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusGlobalViewRequest</p>
 */
public class AddPrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("Clusters")
    @Validation(required = true)
    private String clusters;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusters = builder.clusters;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddPrometheusGlobalViewRequest, Builder> {
        private String clusters; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusGlobalViewRequest request) {
            super(request);
            this.clusters = request.clusters;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * Clusters.
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("Clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
        public AddPrometheusGlobalViewRequest build() {
            return new AddPrometheusGlobalViewRequest(this);
        } 

    } 

}

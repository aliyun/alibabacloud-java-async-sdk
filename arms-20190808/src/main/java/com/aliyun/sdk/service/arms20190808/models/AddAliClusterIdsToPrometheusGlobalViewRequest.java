// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAliClusterIdsToPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>AddAliClusterIdsToPrometheusGlobalViewRequest</p>
 */
public class AddAliClusterIdsToPrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private String clusterIds;

    @Query
    @NameInMap("GlobalViewClusterId")
    @Validation(required = true)
    private String globalViewClusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddAliClusterIdsToPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.globalViewClusterId = builder.globalViewClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAliClusterIdsToPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return globalViewClusterId
     */
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
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

    public static final class Builder extends Request.Builder<AddAliClusterIdsToPrometheusGlobalViewRequest, Builder> {
        private String clusterIds; 
        private String globalViewClusterId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddAliClusterIdsToPrometheusGlobalViewRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.globalViewClusterId = request.globalViewClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of clusters. Separate multiple IDs with commas (,).
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * The ID of the global aggregation instance.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * The name of the global aggregation instance.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddAliClusterIdsToPrometheusGlobalViewRequest build() {
            return new AddAliClusterIdsToPrometheusGlobalViewRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAliClusterIdsFromPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>RemoveAliClusterIdsFromPrometheusGlobalViewRequest</p>
 */
public class RemoveAliClusterIdsFromPrometheusGlobalViewRequest extends Request {
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

    private RemoveAliClusterIdsFromPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.globalViewClusterId = builder.globalViewClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAliClusterIdsFromPrometheusGlobalViewRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveAliClusterIdsFromPrometheusGlobalViewRequest, Builder> {
        private String clusterIds; 
        private String globalViewClusterId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.globalViewClusterId = request.globalViewClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterIds.
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * GlobalViewClusterId.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
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
        public RemoveAliClusterIdsFromPrometheusGlobalViewRequest build() {
            return new RemoveAliClusterIdsFromPrometheusGlobalViewRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusInstancesRequest</p>
 */
public class ListPrometheusInstancesRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ShowGlobalView")
    @Validation(required = true)
    private Boolean showGlobalView;

    private ListPrometheusInstancesRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.regionId = builder.regionId;
        this.showGlobalView = builder.showGlobalView;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showGlobalView
     */
    public Boolean getShowGlobalView() {
        return this.showGlobalView;
    }

    public static final class Builder extends Request.Builder<ListPrometheusInstancesRequest, Builder> {
        private String clusterType; 
        private String regionId; 
        private Boolean showGlobalView; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusInstancesRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.regionId = request.regionId;
            this.showGlobalView = request.showGlobalView;
        } 

        /**
         * Optional instance types (if left blank, all types of instances will be queried):
         * <p>
         * - cloud-product-prometheus 
         * - ManagedKubernetes
         * - satellite
         * - Ask
         * - remote-write-prometheus
         * - cloud-monitor-cmee
         * - ExternalKubernetes
         * - vpc-prometheus
         * - cloud-monitor-direct
         * - Edge Kubernetes
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to query global aggregation instances. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder showGlobalView(Boolean showGlobalView) {
            this.putQueryParameter("ShowGlobalView", showGlobalView);
            this.showGlobalView = showGlobalView;
            return this;
        }

        @Override
        public ListPrometheusInstancesRequest build() {
            return new ListPrometheusInstancesRequest(this);
        } 

    } 

}

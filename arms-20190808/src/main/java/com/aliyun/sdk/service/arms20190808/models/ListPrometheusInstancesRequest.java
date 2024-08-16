// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusInstancesRequest</p>
 */
public class ListPrometheusInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowGlobalView")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The cluster type. If you do not specify this parameter, all cluster types are queried. Valid values:
         * <p>
         * 
         * *   cloud-product-prometheus: Prometheus instance for cloud services
         * *   ManagedKubernetes: ACK managed cluster
         * *   satellite: Prometheus instance for ARMS OpenTelemetry
         * *   Ask: ACK Serverless cluster
         * *   remote-write-prometheus: general-purpose Prometheus instance
         * *   cloud-monitor-cmee: Hybrid Cloud Monitoring
         * *   ExternalKubernetes: external Kubernetes cluster registered in ACK
         * *   vpc-prometheus: Prometheus instance for ECS
         * *   cloud-monitor-direct: cloud service self-monitoring
         * *   Edge Kubernetes: ACK Edge cluster
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
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

        /**
         * Specifies whether to obtain global aggregation instances. Valid values:
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

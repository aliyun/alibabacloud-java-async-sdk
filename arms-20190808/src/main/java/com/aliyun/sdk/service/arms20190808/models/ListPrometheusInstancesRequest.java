// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The cluster type. If you do not specify this parameter, all cluster types are queried. Valid values:</p>
         * <ul>
         * <li>cloud-product-prometheus: Prometheus instance for cloud services</li>
         * <li>ManagedKubernetes: ACK managed cluster</li>
         * <li>satellite: Prometheus instance for ARMS OpenTelemetry</li>
         * <li>Ask: ACK Serverless cluster</li>
         * <li>remote-write-prometheus: general-purpose Prometheus instance</li>
         * <li>cloud-monitor-cmee: Hybrid Cloud Monitoring</li>
         * <li>ExternalKubernetes: external Kubernetes cluster registered in ACK</li>
         * <li>vpc-prometheus: Prometheus instance for ECS</li>
         * <li>cloud-monitor-direct: cloud service self-monitoring</li>
         * <li>Edge Kubernetes: ACK Edge cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud-product-prometheus</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to obtain global aggregation instances. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

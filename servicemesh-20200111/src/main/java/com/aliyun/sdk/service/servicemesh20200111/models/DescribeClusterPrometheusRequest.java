// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterPrometheusRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterPrometheusRequest</p>
 */
public class DescribeClusterPrometheusRequest extends Request {
    @Query
    @NameInMap("K8sClusterId")
    private String k8sClusterId;

    @Query
    @NameInMap("K8sClusterRegionId")
    private String k8sClusterRegionId;

    @Query
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private DescribeClusterPrometheusRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.k8sClusterRegionId = builder.k8sClusterRegionId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterPrometheusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return k8sClusterRegionId
     */
    public String getK8sClusterRegionId() {
        return this.k8sClusterRegionId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterPrometheusRequest, Builder> {
        private String k8sClusterId; 
        private String k8sClusterRegionId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterPrometheusRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.k8sClusterRegionId = request.k8sClusterRegionId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the cluster on the data plane.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putQueryParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * The ID of the region where the cluster on the data plane resides.
         */
        public Builder k8sClusterRegionId(String k8sClusterRegionId) {
            this.putQueryParameter("K8sClusterRegionId", k8sClusterRegionId);
            this.k8sClusterRegionId = k8sClusterRegionId;
            return this;
        }

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeClusterPrometheusRequest build() {
            return new DescribeClusterPrometheusRequest(this);
        } 

    } 

}

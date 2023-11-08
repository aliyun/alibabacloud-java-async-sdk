// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterGrafanaRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterGrafanaRequest</p>
 */
public class DescribeClusterGrafanaRequest extends Request {
    @Query
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    private String k8sClusterId;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeClusterGrafanaRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterGrafanaRequest create() {
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterGrafanaRequest, Builder> {
        private String k8sClusterId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterGrafanaRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
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
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeClusterGrafanaRequest build() {
            return new DescribeClusterGrafanaRequest(this);
        } 

    } 

}

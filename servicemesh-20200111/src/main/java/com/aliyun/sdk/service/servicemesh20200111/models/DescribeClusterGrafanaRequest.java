// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterGrafanaRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterGrafanaRequest</p>
 */
public class DescribeClusterGrafanaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String k8sClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReAddPrometheusIntegration")
    private String reAddPrometheusIntegration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private DescribeClusterGrafanaRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.reAddPrometheusIntegration = builder.reAddPrometheusIntegration;
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
     * @return reAddPrometheusIntegration
     */
    public String getReAddPrometheusIntegration() {
        return this.reAddPrometheusIntegration;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterGrafanaRequest, Builder> {
        private String k8sClusterId; 
        private String reAddPrometheusIntegration; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterGrafanaRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.reAddPrometheusIntegration = request.reAddPrometheusIntegration;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The ID of the cluster on the data plane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putQueryParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to integrate Managed Service for Prometheus for the cluster on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reAddPrometheusIntegration(String reAddPrometheusIntegration) {
            this.putQueryParameter("ReAddPrometheusIntegration", reAddPrometheusIntegration);
            this.reAddPrometheusIntegration = reAddPrometheusIntegration;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
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

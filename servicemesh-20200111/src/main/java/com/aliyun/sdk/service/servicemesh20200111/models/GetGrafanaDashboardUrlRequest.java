// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGrafanaDashboardUrlRequest} extends {@link RequestModel}
 *
 * <p>GetGrafanaDashboardUrlRequest</p>
 */
public class GetGrafanaDashboardUrlRequest extends Request {
    @Body
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    private String k8sClusterId;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private GetGrafanaDashboardUrlRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.serviceMeshId = builder.serviceMeshId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGrafanaDashboardUrlRequest create() {
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

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<GetGrafanaDashboardUrlRequest, Builder> {
        private String k8sClusterId; 
        private String serviceMeshId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(GetGrafanaDashboardUrlRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.serviceMeshId = request.serviceMeshId;
            this.title = request.title;
        } 

        /**
         * The ID of the Container Service for Kubernetes (ACK) or ACK Serverless cluster.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * The ID of the Service Mesh (ASM) instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * The name of the dashboard.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public GetGrafanaDashboardUrlRequest build() {
            return new GetGrafanaDashboardUrlRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardRequest</p>
 */
public class ListDashboardRequest extends Request {
    @Query
    @NameInMap("K8sClusterId")
    private String k8sClusterId;

    @Query
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private ListDashboardRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardRequest create() {
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

    public static final class Builder extends Request.Builder<ListDashboardRequest, Builder> {
        private String k8sClusterId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * K8sClusterId.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putQueryParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ListDashboardRequest build() {
            return new ListDashboardRequest(this);
        } 

    } 

}

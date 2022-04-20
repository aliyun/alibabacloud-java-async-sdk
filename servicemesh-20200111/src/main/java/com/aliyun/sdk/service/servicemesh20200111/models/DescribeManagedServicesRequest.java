// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedServicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeManagedServicesRequest</p>
 */
public class DescribeManagedServicesRequest extends Request {
    @Body
    @NameInMap("GuestCluster")
    private String guestCluster;

    @Body
    @NameInMap("Limit")
    private Long limit;

    @Body
    @NameInMap("Marker")
    private String marker;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeManagedServicesRequest(Builder builder) {
        super(builder);
        this.guestCluster = builder.guestCluster;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestCluster
     */
    public String getGuestCluster() {
        return this.guestCluster;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeManagedServicesRequest, Builder> {
        private String guestCluster; 
        private Long limit; 
        private String marker; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeManagedServicesRequest request) {
            super(request);
            this.guestCluster = request.guestCluster;
            this.limit = request.limit;
            this.marker = request.marker;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * GuestCluster.
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeManagedServicesRequest build() {
            return new DescribeManagedServicesRequest(this);
        } 

    } 

}

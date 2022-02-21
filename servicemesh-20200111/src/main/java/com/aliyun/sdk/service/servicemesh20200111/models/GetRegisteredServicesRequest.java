// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServicesRequest} extends {@link RequestModel}
 *
 * <p>GetRegisteredServicesRequest</p>
 */
public class GetRegisteredServicesRequest extends Request {
    @Body
    @NameInMap("GuestClusters")
    private String guestClusters;

    @Body
    @NameInMap("GuestLimits")
    private String guestLimits;

    @Body
    @NameInMap("GuestMarkers")
    private String guestMarkers;

    @Body
    @NameInMap("MeshLimit")
    private Long meshLimit;

    @Body
    @NameInMap("MeshMarker")
    private String meshMarker;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetRegisteredServicesRequest(Builder builder) {
        super(builder);
        this.guestClusters = builder.guestClusters;
        this.guestLimits = builder.guestLimits;
        this.guestMarkers = builder.guestMarkers;
        this.meshLimit = builder.meshLimit;
        this.meshMarker = builder.meshMarker;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisteredServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestClusters
     */
    public String getGuestClusters() {
        return this.guestClusters;
    }

    /**
     * @return guestLimits
     */
    public String getGuestLimits() {
        return this.guestLimits;
    }

    /**
     * @return guestMarkers
     */
    public String getGuestMarkers() {
        return this.guestMarkers;
    }

    /**
     * @return meshLimit
     */
    public Long getMeshLimit() {
        return this.meshLimit;
    }

    /**
     * @return meshMarker
     */
    public String getMeshMarker() {
        return this.meshMarker;
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

    public static final class Builder extends Request.Builder<GetRegisteredServicesRequest, Builder> {
        private String guestClusters; 
        private String guestLimits; 
        private String guestMarkers; 
        private Long meshLimit; 
        private String meshMarker; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegisteredServicesRequest response) {
            super(response);
            this.guestClusters = response.guestClusters;
            this.guestLimits = response.guestLimits;
            this.guestMarkers = response.guestMarkers;
            this.meshLimit = response.meshLimit;
            this.meshMarker = response.meshMarker;
            this.namespace = response.namespace;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * GuestClusters.
         */
        public Builder guestClusters(String guestClusters) {
            this.putBodyParameter("GuestClusters", guestClusters);
            this.guestClusters = guestClusters;
            return this;
        }

        /**
         * GuestLimits.
         */
        public Builder guestLimits(String guestLimits) {
            this.putBodyParameter("GuestLimits", guestLimits);
            this.guestLimits = guestLimits;
            return this;
        }

        /**
         * GuestMarkers.
         */
        public Builder guestMarkers(String guestMarkers) {
            this.putBodyParameter("GuestMarkers", guestMarkers);
            this.guestMarkers = guestMarkers;
            return this;
        }

        /**
         * MeshLimit.
         */
        public Builder meshLimit(Long meshLimit) {
            this.putBodyParameter("MeshLimit", meshLimit);
            this.meshLimit = meshLimit;
            return this;
        }

        /**
         * MeshMarker.
         */
        public Builder meshMarker(String meshMarker) {
            this.putBodyParameter("MeshMarker", meshMarker);
            this.meshMarker = meshMarker;
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
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public GetRegisteredServicesRequest build() {
            return new GetRegisteredServicesRequest(this);
        } 

    } 

}

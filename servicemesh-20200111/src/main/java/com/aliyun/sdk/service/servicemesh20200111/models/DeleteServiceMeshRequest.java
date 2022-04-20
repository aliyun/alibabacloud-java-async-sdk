// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceMeshRequest</p>
 */
public class DeleteServiceMeshRequest extends Request {
    @Body
    @NameInMap("Force")
    private Boolean force;

    @Body
    @NameInMap("RetainResources")
    private String retainResources;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DeleteServiceMeshRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.retainResources = builder.retainResources;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceMeshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return retainResources
     */
    public String getRetainResources() {
        return this.retainResources;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceMeshRequest, Builder> {
        private Boolean force; 
        private String retainResources; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceMeshRequest request) {
            super(request);
            this.force = request.force;
            this.retainResources = request.retainResources;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * RetainResources.
         */
        public Builder retainResources(String retainResources) {
            this.putBodyParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
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
        public DeleteServiceMeshRequest build() {
            return new DeleteServiceMeshRequest(this);
        } 

    } 

}

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
         * Specifies whether to forcibly delete the ASM instance. Valid values:
         * <p>
         * 
         * *   `true`: forcibly deletes the ASM instance.
         * *   `false`: does not forcibly delete the ASM instance.
         * 
         * Default value: false.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * A JSON string that can be parsed into a string array. You can use this JSON string to specify the IDs of the resource instances that need to be retained when the ASM instance is deleted.
         */
        public Builder retainResources(String retainResources) {
            this.putBodyParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * The ASM instance ID.
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

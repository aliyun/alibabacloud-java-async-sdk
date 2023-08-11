// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVMIntoServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>AddVMIntoServiceMeshRequest</p>
 */
public class AddVMIntoServiceMeshRequest extends Request {
    @Query
    @NameInMap("EcsId")
    @Validation(required = true)
    private String ecsId;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private AddVMIntoServiceMeshRequest(Builder builder) {
        super(builder);
        this.ecsId = builder.ecsId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVMIntoServiceMeshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsId
     */
    public String getEcsId() {
        return this.ecsId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<AddVMIntoServiceMeshRequest, Builder> {
        private String ecsId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(AddVMIntoServiceMeshRequest request) {
            super(request);
            this.ecsId = request.ecsId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the VM.
         */
        public Builder ecsId(String ecsId) {
            this.putQueryParameter("EcsId", ecsId);
            this.ecsId = ecsId;
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
        public AddVMIntoServiceMeshRequest build() {
            return new AddVMIntoServiceMeshRequest(this);
        } 

    } 

}

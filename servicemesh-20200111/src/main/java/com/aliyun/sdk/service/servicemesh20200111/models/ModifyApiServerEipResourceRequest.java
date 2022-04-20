// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiServerEipResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiServerEipResourceRequest</p>
 */
public class ModifyApiServerEipResourceRequest extends Request {
    @Body
    @NameInMap("ApiServerEipId")
    private String apiServerEipId;

    @Body
    @NameInMap("Operation")
    private String operation;

    @Body
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private ModifyApiServerEipResourceRequest(Builder builder) {
        super(builder);
        this.apiServerEipId = builder.apiServerEipId;
        this.operation = builder.operation;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiServerEipResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiServerEipId
     */
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ModifyApiServerEipResourceRequest, Builder> {
        private String apiServerEipId; 
        private String operation; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiServerEipResourceRequest request) {
            super(request);
            this.apiServerEipId = request.apiServerEipId;
            this.operation = request.operation;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * ApiServerEipId.
         */
        public Builder apiServerEipId(String apiServerEipId) {
            this.putBodyParameter("ApiServerEipId", apiServerEipId);
            this.apiServerEipId = apiServerEipId;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
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
        public ModifyApiServerEipResourceRequest build() {
            return new ModifyApiServerEipResourceRequest(this);
        } 

    } 

}

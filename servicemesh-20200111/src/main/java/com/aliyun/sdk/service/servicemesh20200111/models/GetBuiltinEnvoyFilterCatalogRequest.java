// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBuiltinEnvoyFilterCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetBuiltinEnvoyFilterCatalogRequest</p>
 */
public class GetBuiltinEnvoyFilterCatalogRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetBuiltinEnvoyFilterCatalogRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBuiltinEnvoyFilterCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<GetBuiltinEnvoyFilterCatalogRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetBuiltinEnvoyFilterCatalogRequest response) {
            super(response);
            this.serviceMeshId = response.serviceMeshId;
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
        public GetBuiltinEnvoyFilterCatalogRequest build() {
            return new GetBuiltinEnvoyFilterCatalogRequest(this);
        } 

    } 

}

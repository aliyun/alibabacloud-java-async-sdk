// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmAppMeshInfoRequest} extends {@link RequestModel}
 *
 * <p>GetVmAppMeshInfoRequest</p>
 */
public class GetVmAppMeshInfoRequest extends Request {
    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetVmAppMeshInfoRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmAppMeshInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetVmAppMeshInfoRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetVmAppMeshInfoRequest request) {
            super(request);
            this.serviceMeshId = request.serviceMeshId;
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
        public GetVmAppMeshInfoRequest build() {
            return new GetVmAppMeshInfoRequest(this);
        } 

    } 

}

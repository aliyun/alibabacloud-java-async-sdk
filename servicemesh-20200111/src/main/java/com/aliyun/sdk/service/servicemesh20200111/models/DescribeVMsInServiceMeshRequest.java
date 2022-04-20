// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVMsInServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>DescribeVMsInServiceMeshRequest</p>
 */
public class DescribeVMsInServiceMeshRequest extends Request {
    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeVMsInServiceMeshRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVMsInServiceMeshRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVMsInServiceMeshRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVMsInServiceMeshRequest request) {
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
        public DescribeVMsInServiceMeshRequest build() {
            return new DescribeVMsInServiceMeshRequest(this);
        } 

    } 

}

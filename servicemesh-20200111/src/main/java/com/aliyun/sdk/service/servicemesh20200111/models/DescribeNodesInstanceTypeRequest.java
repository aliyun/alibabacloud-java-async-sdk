// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodesInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodesInstanceTypeRequest</p>
 */
public class DescribeNodesInstanceTypeRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeNodesInstanceTypeRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodesInstanceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNodesInstanceTypeRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodesInstanceTypeRequest request) {
            super(request);
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the Alibaba Cloud Service Mesh (ASM) instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeNodesInstanceTypeRequest build() {
            return new DescribeNodesInstanceTypeRequest(this);
        } 

    } 

}

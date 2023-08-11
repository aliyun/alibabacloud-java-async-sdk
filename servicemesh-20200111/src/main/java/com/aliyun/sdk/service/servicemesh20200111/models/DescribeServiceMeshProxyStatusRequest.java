// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshProxyStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshProxyStatusRequest</p>
 */
public class DescribeServiceMeshProxyStatusRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshProxyStatusRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshProxyStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeServiceMeshProxyStatusRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshProxyStatusRequest request) {
            super(request);
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeServiceMeshProxyStatusRequest build() {
            return new DescribeServiceMeshProxyStatusRequest(this);
        } 

    } 

}

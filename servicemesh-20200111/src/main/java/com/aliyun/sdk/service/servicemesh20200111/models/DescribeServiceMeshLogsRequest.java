// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshLogsRequest</p>
 */
public class DescribeServiceMeshLogsRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshLogsRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshLogsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeServiceMeshLogsRequest, Builder> {
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshLogsRequest request) {
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
        public DescribeServiceMeshLogsRequest build() {
            return new DescribeServiceMeshLogsRequest(this);
        } 

    } 

}

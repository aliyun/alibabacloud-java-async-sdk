// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshAdditionalStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshAdditionalStatusRequest</p>
 */
public class DescribeServiceMeshAdditionalStatusRequest extends Request {
    @Body
    @NameInMap("CheckMode")
    private String checkMode;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshAdditionalStatusRequest(Builder builder) {
        super(builder);
        this.checkMode = builder.checkMode;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshAdditionalStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkMode
     */
    public String getCheckMode() {
        return this.checkMode;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshAdditionalStatusRequest, Builder> {
        private String checkMode; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshAdditionalStatusRequest request) {
            super(request);
            this.checkMode = request.checkMode;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * CheckMode.
         */
        public Builder checkMode(String checkMode) {
            this.putBodyParameter("CheckMode", checkMode);
            this.checkMode = checkMode;
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
        public DescribeServiceMeshAdditionalStatusRequest build() {
            return new DescribeServiceMeshAdditionalStatusRequest(this);
        } 

    } 

}

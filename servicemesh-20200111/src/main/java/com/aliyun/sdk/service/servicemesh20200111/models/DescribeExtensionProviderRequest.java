// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExtensionProviderRequest} extends {@link RequestModel}
 *
 * <p>DescribeExtensionProviderRequest</p>
 */
public class DescribeExtensionProviderRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("Type")
    private String type;

    private DescribeExtensionProviderRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExtensionProviderRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeExtensionProviderRequest, Builder> {
        private String serviceMeshId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExtensionProviderRequest response) {
            super(response);
            this.serviceMeshId = response.serviceMeshId;
            this.type = response.type;
        } 

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeExtensionProviderRequest build() {
            return new DescribeExtensionProviderRequest(this);
        } 

    } 

}

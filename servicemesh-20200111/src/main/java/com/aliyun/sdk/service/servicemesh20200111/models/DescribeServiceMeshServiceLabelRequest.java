// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshServiceLabelRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshServiceLabelRequest</p>
 */
public class DescribeServiceMeshServiceLabelRequest extends Request {
    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServiceNames")
    private String serviceNames;

    @Body
    @NameInMap("ServiceNamespaces")
    private String serviceNamespaces;

    private DescribeServiceMeshServiceLabelRequest(Builder builder) {
        super(builder);
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceNames = builder.serviceNames;
        this.serviceNamespaces = builder.serviceNamespaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshServiceLabelRequest create() {
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
     * @return serviceNames
     */
    public String getServiceNames() {
        return this.serviceNames;
    }

    /**
     * @return serviceNamespaces
     */
    public String getServiceNamespaces() {
        return this.serviceNamespaces;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshServiceLabelRequest, Builder> {
        private String serviceMeshId; 
        private String serviceNames; 
        private String serviceNamespaces; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshServiceLabelRequest request) {
            super(request);
            this.serviceMeshId = request.serviceMeshId;
            this.serviceNames = request.serviceNames;
            this.serviceNamespaces = request.serviceNamespaces;
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
         * ServiceNames.
         */
        public Builder serviceNames(String serviceNames) {
            this.putBodyParameter("ServiceNames", serviceNames);
            this.serviceNames = serviceNames;
            return this;
        }

        /**
         * ServiceNamespaces.
         */
        public Builder serviceNamespaces(String serviceNamespaces) {
            this.putBodyParameter("ServiceNamespaces", serviceNamespaces);
            this.serviceNamespaces = serviceNamespaces;
            return this;
        }

        @Override
        public DescribeServiceMeshServiceLabelRequest build() {
            return new DescribeServiceMeshServiceLabelRequest(this);
        } 

    } 

}

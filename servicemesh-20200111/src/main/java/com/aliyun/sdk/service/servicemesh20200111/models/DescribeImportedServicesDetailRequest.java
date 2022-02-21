// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportedServicesDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeImportedServicesDetailRequest</p>
 */
public class DescribeImportedServicesDetailRequest extends Request {
    @Body
    @NameInMap("ASMGatewayName")
    private String ASMGatewayName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServiceNamespace")
    private String serviceNamespace;

    private DescribeImportedServicesDetailRequest(Builder builder) {
        super(builder);
        this.ASMGatewayName = builder.ASMGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceNamespace = builder.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportedServicesDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ASMGatewayName
     */
    public String getASMGatewayName() {
        return this.ASMGatewayName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return serviceNamespace
     */
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    public static final class Builder extends Request.Builder<DescribeImportedServicesDetailRequest, Builder> {
        private String ASMGatewayName; 
        private String serviceMeshId; 
        private String serviceNamespace; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImportedServicesDetailRequest response) {
            super(response);
            this.ASMGatewayName = response.ASMGatewayName;
            this.serviceMeshId = response.serviceMeshId;
            this.serviceNamespace = response.serviceNamespace;
        } 

        /**
         * ASMGatewayName.
         */
        public Builder ASMGatewayName(String ASMGatewayName) {
            this.putBodyParameter("ASMGatewayName", ASMGatewayName);
            this.ASMGatewayName = ASMGatewayName;
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

        /**
         * ServiceNamespace.
         */
        public Builder serviceNamespace(String serviceNamespace) {
            this.putBodyParameter("ServiceNamespace", serviceNamespace);
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        @Override
        public DescribeImportedServicesDetailRequest build() {
            return new DescribeImportedServicesDetailRequest(this);
        } 

    } 

}

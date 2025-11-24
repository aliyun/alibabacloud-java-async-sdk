// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeASMGatewayImportedServicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeASMGatewayImportedServicesRequest</p>
 */
public class DescribeASMGatewayImportedServicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ASMGatewayName")
    private String ASMGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceNamespace")
    private String serviceNamespace;

    private DescribeASMGatewayImportedServicesRequest(Builder builder) {
        super(builder);
        this.ASMGatewayName = builder.ASMGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceNamespace = builder.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeASMGatewayImportedServicesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeASMGatewayImportedServicesRequest, Builder> {
        private String ASMGatewayName; 
        private String serviceMeshId; 
        private String serviceNamespace; 

        private Builder() {
            super();
        } 

        private Builder(DescribeASMGatewayImportedServicesRequest request) {
            super(request);
            this.ASMGatewayName = request.ASMGatewayName;
            this.serviceMeshId = request.serviceMeshId;
            this.serviceNamespace = request.serviceNamespace;
        } 

        /**
         * <p>The name of the ASM gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        public Builder ASMGatewayName(String ASMGatewayName) {
            this.putBodyParameter("ASMGatewayName", ASMGatewayName);
            this.ASMGatewayName = ASMGatewayName;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The namespace in which the services reside.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder serviceNamespace(String serviceNamespace) {
            this.putBodyParameter("ServiceNamespace", serviceNamespace);
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        @Override
        public DescribeASMGatewayImportedServicesRequest build() {
            return new DescribeASMGatewayImportedServicesRequest(this);
        } 

    } 

}

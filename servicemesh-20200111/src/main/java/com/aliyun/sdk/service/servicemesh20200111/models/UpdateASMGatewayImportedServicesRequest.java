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
 * {@link UpdateASMGatewayImportedServicesRequest} extends {@link RequestModel}
 *
 * <p>UpdateASMGatewayImportedServicesRequest</p>
 */
public class UpdateASMGatewayImportedServicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ASMGatewayName")
    private String ASMGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceNames")
    private String serviceNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceNamespace")
    private String serviceNamespace;

    private UpdateASMGatewayImportedServicesRequest(Builder builder) {
        super(builder);
        this.ASMGatewayName = builder.ASMGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceNames = builder.serviceNames;
        this.serviceNamespace = builder.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateASMGatewayImportedServicesRequest create() {
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
     * @return serviceNames
     */
    public String getServiceNames() {
        return this.serviceNames;
    }

    /**
     * @return serviceNamespace
     */
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    public static final class Builder extends Request.Builder<UpdateASMGatewayImportedServicesRequest, Builder> {
        private String ASMGatewayName; 
        private String serviceMeshId; 
        private String serviceNames; 
        private String serviceNamespace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateASMGatewayImportedServicesRequest request) {
            super(request);
            this.ASMGatewayName = request.ASMGatewayName;
            this.serviceMeshId = request.serviceMeshId;
            this.serviceNames = request.serviceNames;
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
         * <p>The names of the services. Separate multiple service names with commas (,). Example: reviews,sleep.</p>
         * 
         * <strong>example:</strong>
         * <p>reviews,sleep</p>
         */
        public Builder serviceNames(String serviceNames) {
            this.putBodyParameter("ServiceNames", serviceNames);
            this.serviceNames = serviceNames;
            return this;
        }

        /**
         * <p>The namespace in which the service resides.</p>
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
        public UpdateASMGatewayImportedServicesRequest build() {
            return new UpdateASMGatewayImportedServicesRequest(this);
        } 

    } 

}

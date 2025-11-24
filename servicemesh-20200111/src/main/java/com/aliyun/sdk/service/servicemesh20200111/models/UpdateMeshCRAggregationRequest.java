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
 * {@link UpdateMeshCRAggregationRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeshCRAggregationRequest</p>
 */
public class UpdateMeshCRAggregationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CPULimit")
    private String CPULimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CPURequirement")
    private String CPURequirement;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemoryLimit")
    private String memoryLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MemoryRequirement")
    private String memoryRequirement;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UsePublicApiServer")
    private Boolean usePublicApiServer;

    private UpdateMeshCRAggregationRequest(Builder builder) {
        super(builder);
        this.CPULimit = builder.CPULimit;
        this.CPURequirement = builder.CPURequirement;
        this.enabled = builder.enabled;
        this.memoryLimit = builder.memoryLimit;
        this.memoryRequirement = builder.memoryRequirement;
        this.serviceMeshId = builder.serviceMeshId;
        this.usePublicApiServer = builder.usePublicApiServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMeshCRAggregationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CPULimit
     */
    public String getCPULimit() {
        return this.CPULimit;
    }

    /**
     * @return CPURequirement
     */
    public String getCPURequirement() {
        return this.CPURequirement;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return memoryRequirement
     */
    public String getMemoryRequirement() {
        return this.memoryRequirement;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return usePublicApiServer
     */
    public Boolean getUsePublicApiServer() {
        return this.usePublicApiServer;
    }

    public static final class Builder extends Request.Builder<UpdateMeshCRAggregationRequest, Builder> {
        private String CPULimit; 
        private String CPURequirement; 
        private Boolean enabled; 
        private String memoryLimit; 
        private String memoryRequirement; 
        private String serviceMeshId; 
        private Boolean usePublicApiServer; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMeshCRAggregationRequest request) {
            super(request);
            this.CPULimit = request.CPULimit;
            this.CPURequirement = request.CPURequirement;
            this.enabled = request.enabled;
            this.memoryLimit = request.memoryLimit;
            this.memoryRequirement = request.memoryRequirement;
            this.serviceMeshId = request.serviceMeshId;
            this.usePublicApiServer = request.usePublicApiServer;
        } 

        /**
         * <p>The maximum number of CPU cores that are available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder CPULimit(String CPULimit) {
            this.putBodyParameter("CPULimit", CPULimit);
            this.CPULimit = CPULimit;
            return this;
        }

        /**
         * <p>The number of CPU cores that are requested by the components installed in the Container Service for Kubernetes (ACK) cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder CPURequirement(String CPURequirement) {
            this.putBodyParameter("CPURequirement", CPURequirement);
            this.CPURequirement = CPURequirement;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Kubernetes API on the data plane to access Istio resources in the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the Kubernetes API to access Istio resources in the ASM instance.</li>
         * <li><code>false</code>: disables the Kubernetes API to access Istio resources in the ASM instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The maximum size of the memory that is available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>500Mi</p>
         */
        public Builder memoryLimit(String memoryLimit) {
            this.putBodyParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * <p>The size of the memory that is requested by the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>500Mi</p>
         */
        public Builder memoryRequirement(String memoryRequirement) {
            this.putBodyParameter("MemoryRequirement", memoryRequirement);
            this.memoryRequirement = memoryRequirement;
            return this;
        }

        /**
         * <p>The Service Mesh (ASM) instance ID.</p>
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
         * <p>Specifies whether the Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance.</li>
         * <li><code>false</code>: The Kubernetes API on the data plane uses the private endpoint of the API server to access Istio resources in the ASM instance.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder usePublicApiServer(Boolean usePublicApiServer) {
            this.putBodyParameter("UsePublicApiServer", usePublicApiServer);
            this.usePublicApiServer = usePublicApiServer;
            return this;
        }

        @Override
        public UpdateMeshCRAggregationRequest build() {
            return new UpdateMeshCRAggregationRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMeshCRAggregationRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeshCRAggregationRequest</p>
 */
public class UpdateMeshCRAggregationRequest extends Request {
    @Body
    @NameInMap("CPULimit")
    private String CPULimit;

    @Body
    @NameInMap("CPURequirement")
    private String CPURequirement;

    @Body
    @NameInMap("Enabled")
    private Boolean enabled;

    @Body
    @NameInMap("MemoryLimit")
    private String memoryLimit;

    @Body
    @NameInMap("MemoryRequirement")
    private String memoryRequirement;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("UsePublicApiServer")
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
         * The maximum number of CPU cores that are available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.
         */
        public Builder CPULimit(String CPULimit) {
            this.putBodyParameter("CPULimit", CPULimit);
            this.CPULimit = CPULimit;
            return this;
        }

        /**
         * The number of CPU cores that are requested by the components installed in the Container Service for Kubernetes (ACK) cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.
         */
        public Builder CPURequirement(String CPURequirement) {
            this.putBodyParameter("CPURequirement", CPURequirement);
            this.CPURequirement = CPURequirement;
            return this;
        }

        /**
         * Specifies whether to enable the Kubernetes API on the data plane to access Istio resources in the ASM instance. Valid values:
         * <p>
         * 
         * *   `true`: enables the Kubernetes API to access Istio resources in the ASM instance.
         * *   `false`: disables the Kubernetes API to access Istio resources in the ASM instance.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * The maximum size of the memory that is available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.
         */
        public Builder memoryLimit(String memoryLimit) {
            this.putBodyParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * The size of the memory that is requested by the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.
         */
        public Builder memoryRequirement(String memoryRequirement) {
            this.putBodyParameter("MemoryRequirement", memoryRequirement);
            this.memoryRequirement = memoryRequirement;
            return this;
        }

        /**
         * The Service Mesh (ASM) instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * Specifies whether the Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance. Valid values:
         * <p>
         * 
         * *   `true`: The Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance.
         * *   `false`: The Kubernetes API on the data plane uses the private endpoint of the API server to access Istio resources in the ASM instance.
         * 
         * Default value: `false`.
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

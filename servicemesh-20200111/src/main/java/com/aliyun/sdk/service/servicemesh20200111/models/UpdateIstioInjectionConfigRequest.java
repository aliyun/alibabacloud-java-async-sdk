// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioInjectionConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioInjectionConfigRequest</p>
 */
public class UpdateIstioInjectionConfigRequest extends Request {
    @Body
    @NameInMap("DataPlaneMode")
    private String dataPlaneMode;

    @Body
    @NameInMap("EnableIstioInjection")
    private Boolean enableIstioInjection;

    @Body
    @NameInMap("EnableSidecarSetInjection")
    private Boolean enableSidecarSetInjection;

    @Body
    @NameInMap("IstioRev")
    private String istioRev;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpdateIstioInjectionConfigRequest(Builder builder) {
        super(builder);
        this.dataPlaneMode = builder.dataPlaneMode;
        this.enableIstioInjection = builder.enableIstioInjection;
        this.enableSidecarSetInjection = builder.enableSidecarSetInjection;
        this.istioRev = builder.istioRev;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioInjectionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPlaneMode
     */
    public String getDataPlaneMode() {
        return this.dataPlaneMode;
    }

    /**
     * @return enableIstioInjection
     */
    public Boolean getEnableIstioInjection() {
        return this.enableIstioInjection;
    }

    /**
     * @return enableSidecarSetInjection
     */
    public Boolean getEnableSidecarSetInjection() {
        return this.enableSidecarSetInjection;
    }

    /**
     * @return istioRev
     */
    public String getIstioRev() {
        return this.istioRev;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateIstioInjectionConfigRequest, Builder> {
        private String dataPlaneMode; 
        private Boolean enableIstioInjection; 
        private Boolean enableSidecarSetInjection; 
        private String istioRev; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioInjectionConfigRequest request) {
            super(request);
            this.dataPlaneMode = request.dataPlaneMode;
            this.enableIstioInjection = request.enableIstioInjection;
            this.enableSidecarSetInjection = request.enableSidecarSetInjection;
            this.istioRev = request.istioRev;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The data plane mode of the namespace. This parameter is valid only when the Ambient Mesh mode is enabled for the current Service Mesh (ASM) instance. Valid values:
         * <p>
         * 
         * *   ambient: sets the data plane mode of the namespace to the Ambient Mesh mode.
         * *   sidecar: sets the data plane mode of the namespace to the Sidecar mode.
         */
        public Builder dataPlaneMode(String dataPlaneMode) {
            this.putBodyParameter("DataPlaneMode", dataPlaneMode);
            this.dataPlaneMode = dataPlaneMode;
            return this;
        }

        /**
         * Specifies whether to enable Istio automatic sidecar injection.
         */
        public Builder enableIstioInjection(Boolean enableIstioInjection) {
            this.putBodyParameter("EnableIstioInjection", enableIstioInjection);
            this.enableIstioInjection = enableIstioInjection;
            return this;
        }

        /**
         * Specifies whether to enable automatic sidecar injection by using SidecarSet.
         */
        public Builder enableSidecarSetInjection(Boolean enableSidecarSetInjection) {
            this.putBodyParameter("EnableSidecarSetInjection", enableSidecarSetInjection);
            this.enableSidecarSetInjection = enableSidecarSetInjection;
            return this;
        }

        /**
         * Specifies the version to be injected into the namespace. This parameter is valid only when the ASM instance performs a canary release. When IstioRev is not empty, you must not specify EnableIstioInjection and EnableSidecarSetInjection.
         */
        public Builder istioRev(String istioRev) {
            this.putBodyParameter("IstioRev", istioRev);
            this.istioRev = istioRev;
            return this;
        }

        /**
         * The namespace for which you want to modify the sidecar injection setting.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
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
        public UpdateIstioInjectionConfigRequest build() {
            return new UpdateIstioInjectionConfigRequest(this);
        } 

    } 

}
